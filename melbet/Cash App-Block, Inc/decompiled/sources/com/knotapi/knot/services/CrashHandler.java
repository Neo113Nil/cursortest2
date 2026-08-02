package com.knotapi.knot.services;

import android.content.Context;
import com.knotapi.knot.BuildConfig;
import java.lang.Thread;

/* loaded from: classes4.dex */
public class CrashHandler implements Thread.UncaughtExceptionHandler {
    private static final String TAG = "CrashHandler";
    private static volatile CrashHandler instance;
    private final Context context;
    private final Thread.UncaughtExceptionHandler defaultHandler = Thread.getDefaultUncaughtExceptionHandler();
    private String environment;
    private String sessionId;

    private CrashHandler(Context context, String str, String str2) {
        this.context = context.getApplicationContext();
        this.sessionId = str;
        this.environment = str2;
    }

    public static void initialize(Context context, String str, String str2) {
        if (instance != null) {
            instance.sessionId = str;
            instance.environment = str2;
            return;
        }
        synchronized (CrashHandler.class) {
            try {
                if (instance == null) {
                    instance = new CrashHandler(context, str, str2);
                    Thread.setDefaultUncaughtExceptionHandler(instance);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean isSDKRelatedCrash(Throwable th) {
        while (th != null) {
            try {
                StackTraceElement[] stackTrace = th.getStackTrace();
                if (stackTrace.length > 0) {
                    int min = Math.min(20, stackTrace.length);
                    for (int i = 0; i < min; i++) {
                        String className = stackTrace[i].getClassName();
                        if (className != null && className.startsWith(BuildConfig.LIBRARY_PACKAGE_NAME)) {
                            return true;
                        }
                    }
                }
                th = th.getCause();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
        } catch (Exception unused) {
            uncaughtExceptionHandler = this.defaultHandler;
            if (uncaughtExceptionHandler == null) {
                return;
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.defaultHandler;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
        if (!isSDKRelatedCrash(th)) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.defaultHandler;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Uncaught exception in thread: ");
        sb.append(thread != null ? thread.getName() : "unknown");
        String sb2 = sb.toString();
        Reporter.crash(this.context, th instanceof Exception ? (Exception) th : new Exception(th.getMessage(), th), sb2, thread != null ? thread.getName() : "unknown");
        uncaughtExceptionHandler = this.defaultHandler;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
