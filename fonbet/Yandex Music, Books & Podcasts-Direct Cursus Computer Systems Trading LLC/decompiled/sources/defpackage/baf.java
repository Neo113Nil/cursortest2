package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class baf {
    public final ScheduledExecutorService a;
    public final hhr b;
    public final awc c;
    public int d;
    public ScheduledFuture e;
    public ScheduledFuture f;
    public final arg g;
    public final arg h;
    public final long i;
    public final long j;

    public baf(awc awcVar, ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        hhr hhrVar = new hhr();
        this.d = 1;
        this.g = new arg(new z9f(this, 0));
        this.h = new arg(new z9f(this, 1));
        this.c = awcVar;
        o2g.O(scheduledExecutorService, "scheduler");
        this.a = scheduledExecutorService;
        this.b = hhrVar;
        this.i = j;
        this.j = j2;
        hhrVar.a = false;
        hhrVar.b();
    }

    public final synchronized void a() {
        try {
            hhr hhrVar = this.b;
            hhrVar.a = false;
            hhrVar.b();
            int i = this.d;
            if (i == 2) {
                this.d = 3;
            } else if (i == 4 || i == 5) {
                ScheduledFuture scheduledFuture = this.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.d == 5) {
                    this.d = 1;
                } else {
                    this.d = 2;
                    o2g.U("There should be no outstanding pingFuture", this.f == null);
                    this.f = this.a.schedule(this.h, this.i, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            int i = this.d;
            if (i == 1) {
                this.d = 2;
                if (this.f == null) {
                    ScheduledExecutorService scheduledExecutorService = this.a;
                    arg argVar = this.h;
                    long j = this.i;
                    hhr hhrVar = this.b;
                    this.f = scheduledExecutorService.schedule(argVar, j - hhrVar.a(), TimeUnit.NANOSECONDS);
                }
            } else if (i == 5) {
                this.d = 4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
