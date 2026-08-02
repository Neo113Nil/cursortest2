package com.bugsnag.android;

import com.bugsnag.android.internal.InternalMetrics;
import com.google.android.gms.dynamite.zzg;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CallbackState {
    public InternalMetrics internalMetrics;
    public final CopyOnWriteArrayList onBreadcrumbTasks;
    public final CopyOnWriteArrayList onErrorTasks;
    public final CopyOnWriteArrayList onSendTasks;
    public final CopyOnWriteArrayList onSessionTasks;

    public CallbackState() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList4 = new CopyOnWriteArrayList();
        this.onErrorTasks = copyOnWriteArrayList;
        this.onBreadcrumbTasks = copyOnWriteArrayList2;
        this.onSessionTasks = copyOnWriteArrayList3;
        this.onSendTasks = copyOnWriteArrayList4;
        this.internalMetrics = new zzg(10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallbackState)) {
            return false;
        }
        CallbackState callbackState = (CallbackState) obj;
        return Intrinsics.areEqual(this.onErrorTasks, callbackState.onErrorTasks) && Intrinsics.areEqual(this.onBreadcrumbTasks, callbackState.onBreadcrumbTasks) && Intrinsics.areEqual(this.onSessionTasks, callbackState.onSessionTasks) && Intrinsics.areEqual(this.onSendTasks, callbackState.onSendTasks);
    }

    public final int hashCode() {
        return this.onSendTasks.hashCode() + ((this.onSessionTasks.hashCode() + ((this.onBreadcrumbTasks.hashCode() + (this.onErrorTasks.hashCode() * 31)) * 31)) * 31);
    }

    public final void runOnSendTasks(Event event, Logger logger) {
        Iterator it = this.onSendTasks.iterator();
        while (it.hasNext()) {
            try {
                ((ExitInfoCallback) ((OnSendCallback) it.next())).onSend(event);
            } catch (Throwable th) {
                logger.w("OnSendCallback threw an Exception", th);
            }
        }
    }

    public final String toString() {
        return "CallbackState(onErrorTasks=" + this.onErrorTasks + ", onBreadcrumbTasks=" + this.onBreadcrumbTasks + ", onSessionTasks=" + this.onSessionTasks + ", onSendTasks=" + this.onSendTasks + ')';
    }
}
