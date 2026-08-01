package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.vD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4040vD extends AbstractC4256zD {

    /* renamed from: H, reason: collision with root package name */
    public static final QD f34675H = new QD(AbstractC4040vD.class);

    /* renamed from: E, reason: collision with root package name */
    public NB f34676E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f34677F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f34678G;

    public AbstractC4040vD(NB nb, boolean z3, boolean z6) {
        int size = nb.size();
        this.f35311A = null;
        this.f35312B = size;
        this.f34676E = nb;
        this.f34677F = z3;
        this.f34678G = z6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD
    public final void f() {
        NB nb = this.f34676E;
        s(1);
        if ((nb != null) && (this.f33220n instanceof C2911aD)) {
            boolean m4 = m();
            AbstractC4255zC a9 = nb.a();
            while (a9.hasNext()) {
                ((N3.a) a9.next()).cancel(m4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD
    public final String g() {
        NB nb = this.f34676E;
        return nb != null ? "futures=".concat(nb.toString()) : super.g();
    }

    public abstract void s(int i);

    public final void t(int i, N3.a aVar) {
        try {
            if (aVar.isCancelled()) {
                this.f34676E = null;
                cancel(false);
            } else {
                try {
                    x(i, C2921aN.e(aVar));
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
        if (this.f34677F && !e(th)) {
            Set set = this.f35311A;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                if (!(this.f33220n instanceof C2911aD)) {
                    Throwable b9 = b();
                    Objects.requireNonNull(b9);
                    while (b9 != null && newSetFromMap.add(b9)) {
                        b9 = b9.getCause();
                    }
                }
                AbstractC4256zD.f35309C.b(this, newSetFromMap);
                set = this.f35311A;
                Objects.requireNonNull(set);
            }
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (set.add(th2)) {
                }
            }
            f34675H.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
            return;
        }
        boolean z3 = th instanceof Error;
        if (z3) {
            f34675H.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != z3 ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
        }
    }

    public final void v(NB nb) {
        int e9 = AbstractC4256zD.f35309C.e(this);
        int i = 0;
        AbstractC2772Sd.I("Less than 0 remaining futures", e9 >= 0);
        if (e9 == 0) {
            if (nb != null) {
                AbstractC4255zC a9 = nb.a();
                while (a9.hasNext()) {
                    N3.a aVar = (N3.a) a9.next();
                    if (!aVar.isCancelled()) {
                        try {
                            x(i, C2921aN.e(aVar));
                        } catch (ExecutionException e10) {
                            u(e10.getCause());
                        } catch (Throwable th) {
                            u(th);
                        }
                    }
                    i++;
                }
            }
            this.f35311A = null;
            y();
            s(2);
        }
    }

    public final void w() {
        Objects.requireNonNull(this.f34676E);
        if (this.f34676E.isEmpty()) {
            y();
            return;
        }
        GD gd = GD.f24952n;
        if (this.f34677F) {
            AbstractC4255zC a9 = this.f34676E.a();
            int i = 0;
            while (a9.hasNext()) {
                N3.a aVar = (N3.a) a9.next();
                int i6 = i + 1;
                if (aVar.isDone()) {
                    t(i, aVar);
                } else {
                    aVar.a(new RunnableC2766Ro(i, 1, this, aVar), gd);
                }
                i = i6;
            }
            return;
        }
        NB nb = this.f34676E;
        NB nb2 = true != this.f34678G ? null : nb;
        RunnableC3048cq runnableC3048cq = new RunnableC3048cq(20, this, nb2);
        AbstractC4255zC a10 = nb.a();
        while (a10.hasNext()) {
            N3.a aVar2 = (N3.a) a10.next();
            if (aVar2.isDone()) {
                v(nb2);
            } else {
                aVar2.a(runnableC3048cq, gd);
            }
        }
    }

    public abstract void x(int i, Object obj);

    public abstract void y();
}
