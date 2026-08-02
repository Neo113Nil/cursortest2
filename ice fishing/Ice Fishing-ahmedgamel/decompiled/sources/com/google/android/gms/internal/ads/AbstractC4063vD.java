package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.vD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4063vD extends AbstractC4279zD {

    /* renamed from: H, reason: collision with root package name */
    public static final QD f35438H = new QD(AbstractC4063vD.class);

    /* renamed from: E, reason: collision with root package name */
    public NB f35439E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f35440F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f35441G;

    public AbstractC4063vD(NB nb, boolean z6, boolean z9) {
        int size = nb.size();
        this.f36095A = null;
        this.f36096B = size;
        this.f35439E = nb;
        this.f35440F = z6;
        this.f35441G = z9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD
    public final void f() {
        NB nb = this.f35439E;
        s(1);
        if ((nb != null) && (this.f34004n instanceof C2934aD)) {
            boolean m9 = m();
            AbstractC4278zC a9 = nb.a();
            while (a9.hasNext()) {
                ((P3.a) a9.next()).cancel(m9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD
    public final String g() {
        NB nb = this.f35439E;
        return nb != null ? "futures=".concat(nb.toString()) : super.g();
    }

    public abstract void s(int i);

    public final void t(int i, P3.a aVar) {
        try {
            if (aVar.isCancelled()) {
                this.f35439E = null;
                cancel(false);
            } else {
                try {
                    x(i, C2944aN.e(aVar));
                } catch (ExecutionException e9) {
                    u(e9.getCause());
                } catch (Throwable th) {
                    u(th);
                }
            }
        } finally {
            v(null);
        }
    }

    public final void u(Throwable th) {
        th.getClass();
        if (this.f35440F && !e(th)) {
            Set set = this.f36095A;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                if (!(this.f34004n instanceof C2934aD)) {
                    Throwable b9 = b();
                    Objects.requireNonNull(b9);
                    while (b9 != null && newSetFromMap.add(b9)) {
                        b9 = b9.getCause();
                    }
                }
                AbstractC4279zD.f36093C.b(this, newSetFromMap);
                set = this.f36095A;
                Objects.requireNonNull(set);
            }
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (set.add(th2)) {
                }
            }
            f35438H.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
            return;
        }
        boolean z6 = th instanceof Error;
        if (z6) {
            f35438H.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != z6 ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
        }
    }

    public final void v(NB nb) {
        int e9 = AbstractC4279zD.f36093C.e(this);
        int i = 0;
        AbstractC2792Sd.I("Less than 0 remaining futures", e9 >= 0);
        if (e9 == 0) {
            if (nb != null) {
                AbstractC4278zC a9 = nb.a();
                while (a9.hasNext()) {
                    P3.a aVar = (P3.a) a9.next();
                    if (!aVar.isCancelled()) {
                        try {
                            x(i, C2944aN.e(aVar));
                        } catch (ExecutionException e10) {
                            u(e10.getCause());
                        } catch (Throwable th) {
                            u(th);
                        }
                    }
                    i++;
                }
            }
            this.f36095A = null;
            y();
            s(2);
        }
    }

    public final void w() {
        Objects.requireNonNull(this.f35439E);
        if (this.f35439E.isEmpty()) {
            y();
            return;
        }
        GD gd = GD.f25742n;
        if (this.f35440F) {
            AbstractC4278zC a9 = this.f35439E.a();
            int i = 0;
            while (a9.hasNext()) {
                P3.a aVar = (P3.a) a9.next();
                int i4 = i + 1;
                if (aVar.isDone()) {
                    t(i, aVar);
                } else {
                    aVar.a(new RunnableC2803So(i, 1, this, aVar), gd);
                }
                i = i4;
            }
            return;
        }
        NB nb = this.f35439E;
        NB nb2 = true != this.f35441G ? null : nb;
        RunnableC3071cq runnableC3071cq = new RunnableC3071cq(20, this, nb2);
        AbstractC4278zC a10 = nb.a();
        while (a10.hasNext()) {
            P3.a aVar2 = (P3.a) a10.next();
            if (aVar2.isDone()) {
                v(nb2);
            } else {
                aVar2.a(runnableC3071cq, gd);
            }
        }
    }

    public abstract void x(int i, Object obj);

    public abstract void y();
}
