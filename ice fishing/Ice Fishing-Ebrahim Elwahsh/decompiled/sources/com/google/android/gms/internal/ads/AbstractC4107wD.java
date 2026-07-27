package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.wD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4107wD extends AD {

    /* renamed from: H, reason: collision with root package name */
    public static final RD f34962H = new RD(AbstractC4107wD.class);

    /* renamed from: E, reason: collision with root package name */
    public QB f34963E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f34964F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f34965G;

    public AbstractC4107wD(QB qb, boolean z8, boolean z9) {
        int size = qb.size();
        this.f23842A = null;
        this.f23843B = size;
        this.f34963E = qb;
        this.f34964F = z8;
        this.f34965G = z9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD
    public final void f() {
        QB qb = this.f34963E;
        s(1);
        if ((qb != null) && (this.f33992n instanceof C2973bD)) {
            boolean m8 = m();
            CC a9 = qb.a();
            while (a9.hasNext()) {
                ((J3.a) a9.next()).cancel(m8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD
    public final String g() {
        QB qb = this.f34963E;
        return qb != null ? "futures=".concat(qb.toString()) : super.g();
    }

    public abstract void s(int i);

    public final void t(int i, J3.a aVar) {
        try {
            if (aVar.isCancelled()) {
                this.f34963E = null;
                cancel(false);
            } else {
                try {
                    x(i, AbstractC3137eE.b(aVar));
                } catch (ExecutionException e6) {
                    u(e6.getCause());
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
        if (this.f34964F && !e(th)) {
            Set set = this.f23842A;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                if (!(this.f33992n instanceof C2973bD)) {
                    Throwable a9 = a();
                    Objects.requireNonNull(a9);
                    while (a9 != null && newSetFromMap.add(a9)) {
                        a9 = a9.getCause();
                    }
                }
                AD.f23840C.c(this, newSetFromMap);
                set = this.f23842A;
                Objects.requireNonNull(set);
            }
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (set.add(th2)) {
                }
            }
            f34962H.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
            return;
        }
        boolean z8 = th instanceof Error;
        if (z8) {
            f34962H.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != z8 ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
        }
    }

    public final void v(QB qb) {
        int g9 = AD.f23840C.g(this);
        int i = 0;
        PA.U("Less than 0 remaining futures", g9 >= 0);
        if (g9 == 0) {
            if (qb != null) {
                CC a9 = qb.a();
                while (a9.hasNext()) {
                    J3.a aVar = (J3.a) a9.next();
                    if (!aVar.isCancelled()) {
                        try {
                            x(i, AbstractC3137eE.b(aVar));
                        } catch (ExecutionException e6) {
                            u(e6.getCause());
                        } catch (Throwable th) {
                            u(th);
                        }
                    }
                    i++;
                }
            }
            this.f23842A = null;
            y();
            s(2);
        }
    }

    public final void w() {
        Objects.requireNonNull(this.f34963E);
        if (this.f34963E.isEmpty()) {
            y();
            return;
        }
        HD hd = HD.f25326n;
        if (this.f34964F) {
            CC a9 = this.f34963E.a();
            int i = 0;
            while (a9.hasNext()) {
                J3.a aVar = (J3.a) a9.next();
                int i4 = i + 1;
                if (aVar.isDone()) {
                    t(i, aVar);
                } else {
                    aVar.c(new RunnableC3003bp(i, 1, this, aVar), hd);
                }
                i = i4;
            }
            return;
        }
        QB qb = this.f34963E;
        QB qb2 = true != this.f34965G ? null : qb;
        RunnableC3329hp runnableC3329hp = new RunnableC3329hp(21, this, qb2);
        CC a10 = qb.a();
        while (a10.hasNext()) {
            J3.a aVar2 = (J3.a) a10.next();
            if (aVar2.isDone()) {
                v(qb2);
            } else {
                aVar2.c(runnableC3329hp, hd);
            }
        }
    }

    public abstract void x(int i, Object obj);

    public abstract void y();
}
