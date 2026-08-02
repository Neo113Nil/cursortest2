package com.squareup.cash;

import android.os.StrictMode;
import android.os.SystemClock;
import java.lang.Thread;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final /* synthetic */ class CashApp$$ExternalSyntheticLambda0 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Thread.UncaughtExceptionHandler f$1;

    public /* synthetic */ CashApp$$ExternalSyntheticLambda0(Object obj, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        int i = this.$r8$classId;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f$1;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                CashApp.onCreate$lambda$0((CashApp) obj, uncaughtExceptionHandler, thread, th);
                return;
            default:
                OkHttpCall.AnonymousClass1 anonymousClass1 = (OkHttpCall.AnonymousClass1) obj;
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    anonymousClass1.getPreferences().edit().putLong("crash_realtime", SystemClock.elapsedRealtime()).commit();
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    return;
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
        }
    }
}
