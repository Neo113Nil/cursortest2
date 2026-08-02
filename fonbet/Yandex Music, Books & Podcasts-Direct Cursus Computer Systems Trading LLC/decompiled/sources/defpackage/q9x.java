package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q9x extends c9x implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public q9x(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        w9x w9xVar = new w9x(Executors.callable(runnable, null));
        return new e9x(w9xVar, this.b.schedule(w9xVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        f9x f9xVar = new f9x(runnable);
        return new e9x(f9xVar, this.b.scheduleAtFixedRate(f9xVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        f9x f9xVar = new f9x(runnable);
        return new e9x(f9xVar, this.b.scheduleWithFixedDelay(f9xVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        w9x w9xVar = new w9x(callable);
        return new e9x(w9xVar, this.b.schedule(w9xVar, j, timeUnit));
    }
}
