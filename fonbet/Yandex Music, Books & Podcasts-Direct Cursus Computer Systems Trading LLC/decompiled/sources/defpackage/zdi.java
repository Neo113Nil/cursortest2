package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zdi extends wdi implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public zdi(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        abt abtVar = new abt(Executors.callable(runnable, null));
        return new xdi(abtVar, this.b.schedule(abtVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ydi ydiVar = new ydi(runnable);
        return new xdi(ydiVar, this.b.scheduleAtFixedRate(ydiVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ydi ydiVar = new ydi(runnable);
        return new xdi(ydiVar, this.b.scheduleWithFixedDelay(ydiVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        abt abtVar = new abt(callable);
        return new xdi(abtVar, this.b.schedule(abtVar, j, timeUnit));
    }
}
