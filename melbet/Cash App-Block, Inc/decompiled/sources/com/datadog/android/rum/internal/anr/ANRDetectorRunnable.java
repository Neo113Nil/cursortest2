package com.datadog.android.rum.internal.anr;

import android.os.Handler;
import android.view.View;
import androidx.customview.widget.ViewDragHelper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.feature.event.ThreadDump;
import com.datadog.android.internal.utils.MapUtilsKt;
import com.datadog.android.internal.utils.ThreadExtKt;
import com.datadog.android.internal.utils.ThreadExtKt$loggableStackTrace$1;
import com.datadog.android.rum.GlobalRumMonitor;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.mlkit.vision.common.zzb;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ANRDetectorRunnable implements Runnable {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object handler;
    public final Object sdkCore;
    public boolean shouldStop;

    public final class CallbackRunnable implements Runnable {
        public boolean called;

        @Override // java.lang.Runnable
        public final synchronized void run() {
            this.called = true;
            notifyAll();
        }
    }

    public ANRDetectorRunnable(LifecycleRegistry lifecycleRegistry, Lifecycle.Event event) {
        lifecycleRegistry.getClass();
        event.getClass();
        this.sdkCore = lifecycleRegistry;
        this.handler = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        zzb zzbVar;
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                if (this.shouldStop) {
                    return;
                }
                ((LifecycleRegistry) this.sdkCore).handleLifecycleEvent((Lifecycle.Event) this.handler);
                this.shouldStop = true;
                return;
            default:
                View view = (View) this.sdkCore;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.handler;
                ViewDragHelper viewDragHelper = swipeDismissBehavior.viewDragHelper;
                if (viewDragHelper != null && viewDragHelper.continueSettling()) {
                    view.postOnAnimation(this);
                    return;
                } else {
                    if (!this.shouldStop || (zzbVar = swipeDismissBehavior.listener) == null) {
                        return;
                    }
                    zzbVar.onDismiss(view);
                    return;
                }
        }
        while (!Thread.interrupted() && !this.shouldStop) {
            try {
                CallbackRunnable callbackRunnable = new CallbackRunnable();
                synchronized (callbackRunnable) {
                    try {
                        if (!((Handler) this.handler).post(callbackRunnable)) {
                            return;
                        }
                        callbackRunnable.wait(5000L);
                        if (!callbackRunnable.called) {
                            Thread thread = ((Handler) this.handler).getLooper().getThread();
                            thread.getClass();
                            ANRException aNRException = new ANRException();
                            aNRException.setStackTrace(thread.getStackTrace());
                            String name = thread.getName();
                            name.getClass();
                            Thread.State state = thread.getState();
                            state.getClass();
                            ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new ThreadDump(name, ThreadExtKt.asString(state), MapUtilsKt.loggableStackTrace(aNRException), false));
                            try {
                                map = Thread.getAllStackTraces();
                                map.getClass();
                            } catch (Throwable th) {
                                DBUtil.log$default(((InternalSdkCore) this.sdkCore).getInternalLogger(), 5, InternalLogger.Target.MAINTAINER, AndroidTraceParser$parse$2.INSTANCE$1, th, false, 48);
                                map = EmptyMap.INSTANCE;
                                map.getClass();
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : map.entrySet()) {
                                if (!Intrinsics.areEqual((Thread) entry.getKey(), thread)) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                if (((StackTraceElement[]) entry2.getValue()).length != 0) {
                                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                            ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                            Iterator it = linkedHashMap2.entrySet().iterator();
                            while (it.hasNext()) {
                                Thread thread2 = (Thread) ((Map.Entry) it.next()).getKey();
                                String name2 = thread2.getName();
                                name2.getClass();
                                Thread.State state2 = thread2.getState();
                                state2.getClass();
                                String asString = ThreadExtKt.asString(state2);
                                StackTraceElement[] stackTrace = thread2.getStackTrace();
                                stackTrace.getClass();
                                arrayList.add(new ThreadDump(name2, asString, ArraysKt___ArraysKt.joinToString$default(stackTrace, "\n", null, null, ThreadExtKt$loggableStackTrace$1.INSTANCE, 30), false));
                            }
                            GlobalRumMonitor.get((InternalSdkCore) this.sdkCore).addError("Application Not Responding", 2, aNRException, MapsKt__MapsJVMKt.mapOf(new Pair("_dd.error.threads", CollectionsKt.plus((Iterable) arrayList, (Collection) mutableListOf))));
                            callbackRunnable.wait();
                        }
                    } finally {
                    }
                }
                Thread.sleep(500L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public ANRDetectorRunnable(InternalSdkCore internalSdkCore, Handler handler) {
        internalSdkCore.getClass();
        this.sdkCore = internalSdkCore;
        this.handler = handler;
    }

    public ANRDetectorRunnable(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.handler = swipeDismissBehavior;
        this.sdkCore = view;
        this.shouldStop = z;
    }
}
