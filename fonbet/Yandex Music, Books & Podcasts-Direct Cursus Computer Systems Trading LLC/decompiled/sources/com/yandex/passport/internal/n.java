package com.yandex.passport.internal;

import com.yandex.passport.internal.report.af;
import com.yandex.passport.internal.report.cf;
import com.yandex.passport.internal.report.df;
import com.yandex.passport.internal.report.te;
import com.yandex.passport.internal.report.xe;
import java.lang.Thread;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class n implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int a;
    public final Thread.UncaughtExceptionHandler b;
    public final af c;

    public n(te teVar) {
        this.a = 0;
        this.c = teVar;
        this.b = Thread.getDefaultUncaughtExceptionHandler();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[LOOP:0: B:13:0x0044->B:22:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[SYNTHETIC] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uncaughtException(Thread thread, Throwable th) {
        boolean z;
        Package r4;
        String name;
        switch (this.a) {
            case 0:
                thread.getClass();
                th.getClass();
                StackTraceElement[] stackTrace = th.getStackTrace();
                stackTrace.getClass();
                int length = stackTrace.length;
                boolean z2 = false;
                int i = 0;
                while (true) {
                    if (i < length) {
                        try {
                            r4 = Class.forName(stackTrace[i].getClassName()).getPackage();
                        } catch (Exception unused) {
                        }
                        if (r4 != null && (name = r4.getName()) != null) {
                            z = StringsKt.M(name, "com.yandex.passport", false);
                            if (z) {
                                i++;
                            } else {
                                z2 = true;
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    }
                }
                if (z2) {
                    try {
                        te teVar = (te) this.c;
                        df dfVar = new df(th);
                        Pair b = dfVar.b();
                        teVar.b.reportEvent((String) b.a, (Map<String, Object>) b.b);
                        teVar.b.reportRtmError(dfVar.a(teVar.c, teVar.a));
                    } catch (Throwable unused2) {
                    }
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    break;
                }
                break;
            default:
                th.getClass();
                com.yandex.passport.legacy.a.e(3, "uncaughtException: thread=" + thread, th);
                try {
                    ((xe) this.c).d(new cf(th));
                } catch (Throwable th2) {
                    com.yandex.passport.legacy.a.e(6, "uncaughtException: exception caught while sending exception to metrica", th2);
                }
                this.b.uncaughtException(thread, th);
                break;
        }
    }

    public n(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, xe xeVar) {
        this.a = 1;
        this.b = uncaughtExceptionHandler;
        this.c = xeVar;
    }
}
