package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class wlq extends ito {
    public final ScheduledExecutorService a;
    public final uq5 b = new uq5(0);
    public volatile boolean c;

    public wlq(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.ka8
    public final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.a();
    }

    @Override // defpackage.ito
    public final ka8 b(Runnable runnable, long j, TimeUnit timeUnit) {
        t4b t4bVar = t4b.a;
        if (this.c) {
            return t4bVar;
        }
        gto gtoVar = new gto(runnable, this.b);
        this.b.b(gtoVar);
        ScheduledExecutorService scheduledExecutorService = this.a;
        try {
            gtoVar.b(j <= 0 ? scheduledExecutorService.submit((Callable) gtoVar) : scheduledExecutorService.schedule((Callable) gtoVar, j, timeUnit));
            return gtoVar;
        } catch (RejectedExecutionException e) {
            a();
            y5g.g0(e);
            return t4bVar;
        }
    }
}
