package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class ck2 {
    public static final Logger e = Logger.getLogger(ck2.class.getName());
    public final ScheduledExecutorService a;
    public final vq6 b;
    public lzb c;
    public rjp d;

    public ck2(wvo wvoVar, h8h h8hVar, vq6 vq6Var) {
        this.a = h8hVar;
        this.b = vq6Var;
    }

    public final void a(dsd dsdVar) {
        this.b.e();
        if (this.c == null) {
            this.c = wvo.A();
        }
        rjp rjpVar = this.d;
        if (rjpVar != null) {
            gyr gyrVar = (gyr) rjpVar.a;
            if (!gyrVar.c && !gyrVar.b) {
                return;
            }
        }
        long a = this.c.a();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.d = this.b.c(this.a, dsdVar, a, timeUnit);
        e.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(a));
    }
}
