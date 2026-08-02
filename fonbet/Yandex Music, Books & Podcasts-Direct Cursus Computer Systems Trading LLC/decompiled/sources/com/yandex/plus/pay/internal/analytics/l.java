package com.yandex.plus.pay.internal.analytics;

import java.lang.Thread;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class l implements Thread.UncaughtExceptionHandler {
    public static Function0 a;
    public static final Thread.UncaughtExceptionHandler b;

    static {
        l lVar = new l();
        a = k.a;
        b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        r1.reportUnhandledException(r10);
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = b;
        thread.getClass();
        th.getClass();
        try {
            com.yandex.plus.core.analytics.e eVar = (com.yandex.plus.core.analytics.e) a.invoke();
            if (eVar != null) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                stackTrace.getClass();
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String className = stackTrace[i].getClassName();
                    className.getClass();
                    if (kotlin.text.c.v(className, "com.yandex.plus.pay", false)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } finally {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
