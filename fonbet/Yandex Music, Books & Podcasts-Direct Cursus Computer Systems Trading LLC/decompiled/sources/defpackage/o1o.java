package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes5.dex */
public final class o1o {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final v7h c;
    public final hhr d;
    public long e;
    public boolean f;
    public ScheduledFuture g;

    public o1o(v7h v7hVar, Executor executor, ScheduledExecutorService scheduledExecutorService, hhr hhrVar) {
        this.c = v7hVar;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.d = hhrVar;
        hhrVar.b();
    }
}
