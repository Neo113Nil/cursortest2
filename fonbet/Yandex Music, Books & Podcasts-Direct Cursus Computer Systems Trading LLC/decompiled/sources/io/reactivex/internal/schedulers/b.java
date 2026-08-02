package io.reactivex.internal.schedulers;

import defpackage.ito;
import defpackage.jto;
import defpackage.oye;
import defpackage.pye;
import defpackage.qye;
import defpackage.wjo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class b extends jto {
    public static final wjo b;
    public static final wjo c;
    public static final long d = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    public static final qye e;
    public static final oye f;
    public final AtomicReference a;

    static {
        qye qyeVar = new qye(new wjo("RxCachedThreadSchedulerShutdown"));
        e = qyeVar;
        qyeVar.a();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        wjo wjoVar = new wjo("RxCachedThreadScheduler", max, false);
        b = wjoVar;
        c = new wjo("RxCachedWorkerPoolEvictor", max, false);
        oye oyeVar = new oye(0L, null, wjoVar);
        f = oyeVar;
        oyeVar.c.a();
        ScheduledFuture scheduledFuture = oyeVar.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = oyeVar.d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public b() {
        oye oyeVar = f;
        AtomicReference atomicReference = new AtomicReference(oyeVar);
        this.a = atomicReference;
        oye oyeVar2 = new oye(d, TimeUnit.SECONDS, b);
        while (!atomicReference.compareAndSet(oyeVar, oyeVar2)) {
            if (atomicReference.get() != oyeVar) {
                oyeVar2.c.a();
                ScheduledFuture scheduledFuture = oyeVar2.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = oyeVar2.d;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.jto
    public final ito a() {
        return new pye((oye) this.a.get());
    }
}
