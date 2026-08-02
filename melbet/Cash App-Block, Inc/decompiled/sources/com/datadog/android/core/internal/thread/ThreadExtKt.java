package com.datadog.android.core.internal.thread;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes4.dex */
public abstract class ThreadExtKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewLocalBrandProfileShortlink.deepLinkSpecs;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void loggingAfterExecute(Runnable runnable, Throwable th, InternalLogger internalLogger) {
        InternalLogger internalLogger2;
        Throwable th2;
        ExecutionException executionException;
        internalLogger.getClass();
        if (th == null && (runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                try {
                    try {
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } catch (SecurityException e) {
                    internalLogger2 = internalLogger;
                    DBUtil.log$default(internalLogger2, 5, InternalLogger.Target.MAINTAINER, ThreadExtKt$sleepSafe$1.INSTANCE$1, e, false, 48);
                }
            } catch (CancellationException e2) {
                internalLogger2 = internalLogger;
                th = e2;
            } catch (ExecutionException e3) {
                internalLogger2 = internalLogger;
                executionException = e3;
            }
            try {
                ((Future) runnable).get();
            } catch (CancellationException e4) {
                th = e4;
            } catch (ExecutionException e5) {
                executionException = e5;
                internalLogger2 = internalLogger;
                th = executionException.getCause();
                th2 = th;
                if (th2 == null) {
                }
            }
        }
        internalLogger2 = internalLogger;
        th2 = th;
        if (th2 == null) {
            DBUtil.log$default(internalLogger2, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), ThreadExtKt$sleepSafe$1.INSTANCE$2, th2, 48);
        }
    }
}
