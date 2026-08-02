package io.reactivex.internal.schedulers;

import defpackage.fto;
import defpackage.ito;
import defpackage.jto;
import defpackage.ka8;
import defpackage.mto;
import defpackage.t4b;
import defpackage.up6;
import defpackage.wjo;
import defpackage.wlq;
import defpackage.y5g;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class d extends jto {
    public static final wjo b;
    public final AtomicReference a;

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        b = new wjo("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public d() {
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        boolean z = mto.a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, b);
        if (mto.a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            mto.d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        atomicReference.lazySet(newScheduledThreadPool);
    }

    @Override // defpackage.jto
    public final ito a() {
        return new wlq((ScheduledExecutorService) this.a.get());
    }

    @Override // defpackage.jto
    public final ka8 c(Runnable runnable, long j, TimeUnit timeUnit) {
        up6.L(runnable, "run is null");
        fto ftoVar = new fto(runnable);
        AtomicReference atomicReference = this.a;
        try {
            ftoVar.b(j <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(ftoVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(ftoVar, j, timeUnit));
            return ftoVar;
        } catch (RejectedExecutionException e) {
            y5g.g0(e);
            return t4b.a;
        }
    }
}
