package defpackage;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class ap6 implements Thread.UncaughtExceptionHandler {
    public static ap6 c;
    public static final klx d = new klx(18);
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ap6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        switch (this.a) {
            case 0:
                thread.getClass();
                th.getClass();
                Throwable th2 = null;
                Throwable th3 = th;
                while (true) {
                    if (th3 != null && th3 != th2) {
                        for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
                            stackTraceElement.getClass();
                            String className = stackTraceElement.getClassName();
                            className.getClass();
                            if (c.v(className, "com.facebook", false)) {
                                wct.u(th);
                                ox6.z(th, cpe.d).b();
                            }
                        }
                        th2 = th3;
                        th3 = th3.getCause();
                    }
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) this.b;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    break;
                }
                break;
            default:
                Logger logger = j8h.c0;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder("[");
                j8h j8hVar = (j8h) this.b;
                sb.append(j8hVar.a);
                sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
                logger.log(level, sb.toString(), th);
                if (!j8hVar.y) {
                    j8hVar.y = true;
                    j8hVar.r(true);
                    j8hVar.v(false);
                    w7h w7hVar = new w7h(th);
                    j8hVar.x = w7hVar;
                    j8hVar.D.h(w7hVar);
                    j8hVar.P.i(null);
                    j8hVar.N.I(4, "PANIC! Entering TRANSIENT_FAILURE");
                    j8hVar.r.i(r76.c);
                    break;
                }
                break;
        }
    }
}
