package I5;

import Q7.j;
import S0.s;
import S7.AbstractC0406y;
import java.lang.Thread;
import java.util.ArrayList;
import kotlin.jvm.internal.h;
import z7.C5273j;

/* loaded from: classes2.dex */
public final class c implements Thread.UncaughtExceptionHandler, F5.a {

    /* renamed from: a, reason: collision with root package name */
    public final s f1297a;

    /* renamed from: b, reason: collision with root package name */
    public final F5.c f1298b;

    /* renamed from: c, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f1299c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1300d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f1301e;

    public c(s sVar, F5.c cVar) {
        this.f1297a = sVar;
        this.f1298b = cVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable throwable) {
        String message;
        h.e(thread, "thread");
        h.e(throwable, "throwable");
        synchronized (this.f1300d) {
            if (this.f1300d.contains(throwable)) {
                this.f1298b.warn("OtelCrashHandler: Ignoring duplicate throwable instance");
                return;
            }
            this.f1300d.add(throwable);
            this.f1298b.info("OtelCrashHandler: Uncaught exception detected - " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage());
            boolean z3 = true;
            if (!j.U(throwable.getClass().getSimpleName(), "ApplicationNotResponding", true) && ((message = throwable.getMessage()) == null || !j.U(message, "Application Not Responding", true))) {
                z3 = false;
            }
            if (!z3) {
                StackTraceElement[] stackTrace = throwable.getStackTrace();
                h.d(stackTrace, "getStackTrace(...)");
                if (!X2.e.J(stackTrace)) {
                    this.f1298b.debug("OtelCrashHandler: Crash is not OneSignal-related, delegating to existing handler");
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f1299c;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, throwable);
                        return;
                    }
                    return;
                }
            }
            if (z3) {
                this.f1298b.info("OtelCrashHandler: ANR exception caught (unusual - ANRs are usually detected by standalone detector)");
            }
            this.f1298b.info("OtelCrashHandler: OneSignal-related crash detected, saving crash report...");
            try {
                AbstractC0406y.s(C5273j.f42272n, new b(this, thread, throwable, null));
                this.f1298b.info("OtelCrashHandler: Crash report saved successfully");
            } catch (Throwable th) {
                this.f1298b.error("OtelCrashHandler: Failed to save crash report: " + th.getMessage() + " - " + th.getClass().getSimpleName());
            }
            this.f1298b.info("OtelCrashHandler: Delegating to existing crash handler");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f1299c;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, throwable);
            }
        }
    }
}
