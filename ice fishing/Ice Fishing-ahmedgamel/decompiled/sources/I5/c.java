package I5;

import Q7.j;
import S0.l;
import S7.AbstractC0410y;
import java.lang.Thread;
import java.util.ArrayList;
import kotlin.jvm.internal.h;
import z7.C5246j;

/* loaded from: classes2.dex */
public final class c implements Thread.UncaughtExceptionHandler, F5.a {

    /* renamed from: a, reason: collision with root package name */
    public final l f1327a;

    /* renamed from: b, reason: collision with root package name */
    public final F5.c f1328b;

    /* renamed from: c, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f1329c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1330d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f1331e;

    public c(l lVar, F5.c cVar) {
        this.f1327a = lVar;
        this.f1328b = cVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable throwable) {
        String message;
        h.e(thread, "thread");
        h.e(throwable, "throwable");
        synchronized (this.f1330d) {
            if (this.f1330d.contains(throwable)) {
                this.f1328b.warn("OtelCrashHandler: Ignoring duplicate throwable instance");
                return;
            }
            this.f1330d.add(throwable);
            this.f1328b.info("OtelCrashHandler: Uncaught exception detected - " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage());
            boolean z6 = true;
            if (!j.k0(throwable.getClass().getSimpleName(), "ApplicationNotResponding", true) && ((message = throwable.getMessage()) == null || !j.k0(message, "Application Not Responding", true))) {
                z6 = false;
            }
            if (!z6) {
                StackTraceElement[] stackTrace = throwable.getStackTrace();
                h.d(stackTrace, "getStackTrace(...)");
                if (!Q3.b.k(stackTrace)) {
                    this.f1328b.debug("OtelCrashHandler: Crash is not OneSignal-related, delegating to existing handler");
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f1329c;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, throwable);
                        return;
                    }
                    return;
                }
            }
            if (z6) {
                this.f1328b.info("OtelCrashHandler: ANR exception caught (unusual - ANRs are usually detected by standalone detector)");
            }
            this.f1328b.info("OtelCrashHandler: OneSignal-related crash detected, saving crash report...");
            try {
                AbstractC0410y.s(C5246j.f42241n, new b(this, thread, throwable, null));
                this.f1328b.info("OtelCrashHandler: Crash report saved successfully");
            } catch (Throwable th) {
                this.f1328b.error("OtelCrashHandler: Failed to save crash report: " + th.getMessage() + " - " + th.getClass().getSimpleName());
            }
            this.f1328b.info("OtelCrashHandler: Delegating to existing crash handler");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f1329c;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, throwable);
            }
        }
    }
}
