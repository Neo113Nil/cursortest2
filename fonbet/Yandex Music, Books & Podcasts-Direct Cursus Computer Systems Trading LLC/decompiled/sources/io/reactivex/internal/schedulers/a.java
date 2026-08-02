package io.reactivex.internal.schedulers;

import defpackage.fto;
import defpackage.ito;
import defpackage.jto;
import defpackage.ka8;
import defpackage.ns5;
import defpackage.os5;
import defpackage.ps5;
import defpackage.t4b;
import defpackage.up6;
import defpackage.wjo;
import defpackage.y5g;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class a extends jto {
    public static final os5 b;
    public static final wjo c;
    public static final int d;
    public static final ps5 e;
    public final AtomicReference a;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        d = availableProcessors;
        ps5 ps5Var = new ps5(new wjo("RxComputationShutdown"));
        e = ps5Var;
        ps5Var.a();
        wjo wjoVar = new wjo("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        c = wjoVar;
        os5 os5Var = new os5(0, wjoVar);
        b = os5Var;
        for (ps5 ps5Var2 : os5Var.b) {
            ps5Var2.a();
        }
    }

    public a() {
        os5 os5Var = b;
        AtomicReference atomicReference = new AtomicReference(os5Var);
        this.a = atomicReference;
        os5 os5Var2 = new os5(d, c);
        while (!atomicReference.compareAndSet(os5Var, os5Var2)) {
            if (atomicReference.get() != os5Var) {
                ps5[] ps5VarArr = os5Var2.b;
                for (ps5 ps5Var : ps5VarArr) {
                    ps5Var.a();
                }
                return;
            }
        }
    }

    @Override // defpackage.jto
    public final ito a() {
        ps5 ps5Var;
        os5 os5Var = (os5) this.a.get();
        int i = os5Var.a;
        if (i == 0) {
            ps5Var = e;
        } else {
            ps5[] ps5VarArr = os5Var.b;
            long j = os5Var.c;
            os5Var.c = 1 + j;
            ps5Var = ps5VarArr[(int) (j % i)];
        }
        return new ns5(ps5Var);
    }

    @Override // defpackage.jto
    public final ka8 c(Runnable runnable, long j, TimeUnit timeUnit) {
        ps5 ps5Var;
        os5 os5Var = (os5) this.a.get();
        int i = os5Var.a;
        if (i == 0) {
            ps5Var = e;
        } else {
            ps5[] ps5VarArr = os5Var.b;
            long j2 = os5Var.c;
            os5Var.c = 1 + j2;
            ps5Var = ps5VarArr[(int) (j2 % i)];
        }
        ps5Var.getClass();
        up6.L(runnable, "run is null");
        fto ftoVar = new fto(runnable);
        ScheduledExecutorService scheduledExecutorService = ps5Var.a;
        try {
            ftoVar.b(j <= 0 ? scheduledExecutorService.submit(ftoVar) : scheduledExecutorService.schedule(ftoVar, j, timeUnit));
            return ftoVar;
        } catch (RejectedExecutionException e2) {
            y5g.g0(e2);
            return t4b.a;
        }
    }
}
