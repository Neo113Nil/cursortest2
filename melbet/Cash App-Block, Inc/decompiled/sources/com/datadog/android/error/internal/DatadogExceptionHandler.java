package com.datadog.android.error.internal;

import android.content.Context;
import androidx.room.util.DBUtil;
import androidx.work.impl.WorkManagerImpl;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.feature.event.JvmCrash$Rum;
import com.datadog.android.core.feature.event.ThreadDump;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.core.internal.thread.BackPressureExecutorService;
import com.datadog.android.core.internal.thread.ThreadExtKt$sleepSafe$1;
import com.datadog.android.internal.utils.MapUtilsKt;
import com.datadog.android.internal.utils.ThreadExtKt;
import com.datadog.android.internal.utils.ThreadExtKt$loggableStackTrace$1;
import com.google.android.gms.internal.mlkit_vision_common.zzhq;
import com.squareup.util.Strings;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class DatadogExceptionHandler implements Thread.UncaughtExceptionHandler {
    public final WeakReference contextRef;
    public Thread.UncaughtExceptionHandler previousHandler;
    public final DatadogCore sdkCore;

    public DatadogExceptionHandler(DatadogCore datadogCore, Context context) {
        context.getClass();
        this.sdkCore = datadogCore;
        this.contextRef = new WeakReference(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uncaughtException(Thread thread, Throwable th) {
        int i;
        Map map;
        boolean z;
        InternalLogger internalLogger;
        Context context;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        long j;
        int i2;
        boolean z2;
        int i3;
        InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
        DatadogCore datadogCore = this.sdkCore;
        InternalLogger internalLogger2 = datadogCore.internalLogger;
        thread.getClass();
        th.getClass();
        String name = thread.getName();
        Thread.State state = thread.getState();
        state.getClass();
        String asString = ThreadExtKt.asString(state);
        String loggableStackTrace = MapUtilsKt.loggableStackTrace(th);
        name.getClass();
        ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new ThreadDump(name, asString, loggableStackTrace, true));
        try {
            map = Thread.getAllStackTraces();
            map.getClass();
            i = 5;
        } catch (Throwable th2) {
            DBUtil.log$default(datadogCore.internalLogger, 5, target, DatadogExceptionHandler$uncaughtException$1.INSTANCE$1, th2, false, 48);
            i = 5;
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
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry3 = (Map.Entry) it.next();
            Thread thread2 = (Thread) entry3.getKey();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry3.getValue();
            String name2 = thread2.getName();
            name2.getClass();
            Thread.State state2 = thread2.getState();
            state2.getClass();
            String asString2 = ThreadExtKt.asString(state2);
            stackTraceElementArr.getClass();
            arrayList.add(new ThreadDump(name2, asString2, ArraysKt___ArraysKt.joinToString$default(stackTraceElementArr, "\n", null, null, ThreadExtKt$loggableStackTrace$1.INSTANCE, 30), false));
        }
        ArrayList plus = CollectionsKt.plus((Iterable) arrayList, (Collection) mutableListOf);
        SdkFeature feature = datadogCore.getFeature("rum");
        InternalLogger.Target target2 = InternalLogger.Target.USER;
        if (feature != null) {
            String message = th.getMessage();
            if (message == null || StringsKt.isBlank(message)) {
                String canonicalName = th.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = th.getClass().getSimpleName();
                }
                message = "Application crash detected: ".concat(canonicalName);
            }
            feature.sendEvent(new JvmCrash$Rum(message, th, plus));
        } else {
            DBUtil.log$default(datadogCore.internalLogger, 3, target2, DatadogExceptionHandler$uncaughtException$1.INSTANCE, null, false, 56);
        }
        BackPressureExecutorService persistenceExecutorService$dd_sdk_android_core_release = datadogCore.getCoreFeature$dd_sdk_android_core_release().getPersistenceExecutorService$dd_sdk_android_core_release();
        Strings strings = datadogCore.getCoreFeature$dd_sdk_android_core_release().timeProvider;
        internalLogger2.getClass();
        strings.getClass();
        long nanoTime = System.nanoTime();
        long coerceIn = RangesKt___RangesKt.coerceIn(100L, 0L, 10L);
        while (persistenceExecutorService$dd_sdk_android_core_release.getTaskCount() - persistenceExecutorService$dd_sdk_android_core_release.getCompletedTaskCount() > 0) {
            try {
                Thread.sleep(coerceIn);
                internalLogger = internalLogger2;
                j = nanoTime;
                i2 = 4;
                z2 = z;
            } catch (IllegalArgumentException e) {
                InternalLogger internalLogger3 = internalLogger2;
                z2 = z;
                internalLogger = internalLogger3;
                DBUtil.log$default(internalLogger, 4, target, ThreadExtKt$sleepSafe$1.INSTANCE$3, e, false, 48);
                j = nanoTime;
                i2 = 4;
                z = z2;
            } catch (InterruptedException unused) {
                internalLogger = internalLogger2;
                j = nanoTime;
                i2 = 4;
                z2 = z;
                try {
                    Thread.currentThread().interrupt();
                    i3 = i;
                } catch (SecurityException e2) {
                    i3 = i;
                    DBUtil.log$default(internalLogger, i3, target, ThreadExtKt$sleepSafe$1.INSTANCE, e2, false, 48);
                }
                z = true;
            }
            i3 = i;
            if (System.nanoTime() - j >= 100000000 || z) {
                if (persistenceExecutorService$dd_sdk_android_core_release.getTaskCount() - persistenceExecutorService$dd_sdk_android_core_release.getCompletedTaskCount() > 0) {
                    DBUtil.log$default(datadogCore.internalLogger, i2, target2, DatadogExceptionHandler$uncaughtException$1.INSTANCE$2, null, false, 56);
                }
                context = (Context) this.contextRef.get();
                if (context != null && WorkManagerImpl.getInstance() != null) {
                    zzhq.triggerUploadWorker(context, datadogCore.name, internalLogger);
                }
                uncaughtExceptionHandler = this.previousHandler;
                if (uncaughtExceptionHandler == null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
            }
            i = i3;
            z = z2;
            nanoTime = j;
            internalLogger2 = internalLogger;
        }
        internalLogger = internalLogger2;
        context = (Context) this.contextRef.get();
        if (context != null) {
            zzhq.triggerUploadWorker(context, datadogCore.name, internalLogger);
        }
        uncaughtExceptionHandler = this.previousHandler;
        if (uncaughtExceptionHandler == null) {
        }
    }
}
