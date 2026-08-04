package com.gamericefishpro.space.h0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements l0 {
    public final int a;
    public final com.gamericefishpro.space.a8.c b;
    public final Function1 c;
    public com.gamericefishpro.space.c3.a d;
    public com.gamericefishpro.space.f2.e1 e;
    public com.gamericefishpro.space.f2.d1 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public x0 l;
    public boolean m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public final /* synthetic */ z0 r;

    public y0(z0 z0Var, int i, com.gamericefishpro.space.a8.c cVar, Function1 function1) {
        this.r = z0Var;
        this.a = i;
        this.b = cVar;
        this.c = function1;
        com.gamericefishpro.space.ni.h.a.getClass();
        com.gamericefishpro.space.ni.f.a.getClass();
        this.p = com.gamericefishpro.space.ni.f.a();
    }

    @Override // com.gamericefishpro.space.h0.l0
    public final void a() {
        this.m = true;
    }

    public final void b() {
        com.gamericefishpro.space.f2.d1 d1Var = this.f;
        if (d1Var != null) {
            d1Var.cancel();
        }
        this.f = null;
        com.gamericefishpro.space.f2.e1 e1Var = this.e;
        if (e1Var != null) {
            e1Var.a();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(b bVar) {
        boolean zD;
        if (!this.r.a) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(bVar);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zD = d(bVar);
        }
        com.gamericefishpro.space.i.a.S("compose:lazy:prefetch:execute:item", -1L);
        return zD;
    }

    @Override // com.gamericefishpro.space.h0.l0
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01cd  */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    public final boolean d(b bVar) {
        ?? r12;
        List list;
        int i = this.a;
        long j = i;
        com.gamericefishpro.space.i.a.S("compose:lazy:prefetch:execute:item", j);
        z zVar = (z) ((y) this.r.b).b.invoke();
        if (!this.h) {
            int iA = zVar.a();
            if (i >= 0 && i < iA) {
                Object objB = zVar.b(i);
                Object obj = this.j;
                if (obj != null && !objB.equals(obj)) {
                    b();
                    return false;
                }
                Object objC = zVar.c(i);
                com.gamericefishpro.space.a8.c cVar = this.b;
                d dVar = (d) cVar.v;
                if (cVar.i != objC || dVar == null) {
                    com.gamericefishpro.space.t.h0 h0Var = (com.gamericefishpro.space.t.h0) cVar.e;
                    Object objG = h0Var.g(objC);
                    Object obj2 = objG;
                    if (objG == null) {
                        d dVar2 = new d();
                        dVar2.e = -1;
                        h0Var.m(objC, dVar2);
                        obj2 = dVar2;
                    }
                    dVar = (d) obj2;
                    cVar.i = objC;
                    cVar.v = dVar;
                }
                e();
                long jA = bVar.a();
                this.n = jA;
                com.gamericefishpro.space.ni.h.a.getClass();
                com.gamericefishpro.space.ni.f.a.getClass();
                this.p = com.gamericefishpro.space.ni.f.a();
                this.o = 0L;
                com.gamericefishpro.space.i.a.S("compose:lazy:prefetch:available_time_nanos", jA);
                if (!e()) {
                    if (i(this.n, dVar.a + dVar.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            g(objB, objC, dVar);
                            Unit unit = Unit.a;
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (!e()) {
                        return true;
                    }
                }
                if (this.f != null) {
                    if (!i(this.n, dVar.c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        com.gamericefishpro.space.f2.d1 d1Var = this.f;
                        if (d1Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        this.e = d1Var.apply();
                        this.f = null;
                        this.i = true;
                        Unit unit2 = Unit.a;
                        Trace.endSection();
                        j();
                        dVar.c = d.a(this.o, dVar.c);
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (!this.k) {
                    if (this.n <= r13) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.l = h();
                        this.k = true;
                        Unit unit3 = Unit.a;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                x0 x0Var = this.l;
                if (x0Var != null) {
                    int i2 = dVar.e;
                    boolean z = this.m;
                    List[] listArr = x0Var.b;
                    int i3 = x0Var.c;
                    List list2 = x0Var.a;
                    if (i3 < list2.size()) {
                        if (x0Var.f.h) {
                            com.gamericefishpro.space.c0.a.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((m0) list2.get(i4)).d = i2;
                            }
                            Unit unit4 = Unit.a;
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (x0Var.c < list2.size()) {
                                try {
                                    if (listArr[x0Var.c] == null) {
                                        if (bVar.a() <= r13) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i5 = x0Var.c;
                                        m0 m0Var = (m0) list2.get(i5);
                                        Function1 function1 = m0Var.a;
                                        if (function1 == null) {
                                            list = com.gamericefishpro.space.ph.g0.d;
                                        } else {
                                            k0 k0Var = new k0(m0Var, m0Var.d);
                                            function1.invoke(k0Var);
                                            ArrayList arrayList = k0Var.b;
                                            m0Var.f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i5] = list;
                                    }
                                    List list3 = listArr[x0Var.c];
                                    Intrinsics.b(list3);
                                    while (x0Var.d < list3.size()) {
                                        y0 y0Var = (y0) list3.get(x0Var.d);
                                        if (z) {
                                            y0 y0Var2 = y0Var != null ? y0Var : null;
                                            if (y0Var2 != null) {
                                                r12 = 1;
                                                y0Var2.m = true;
                                            } else {
                                                r12 = 1;
                                            }
                                        } else {
                                            r12 = 1;
                                        }
                                        x0Var.e = r12;
                                        if (y0Var.c(bVar)) {
                                            Trace.endSection();
                                            return r12;
                                        }
                                        x0Var.d += r12;
                                    }
                                    x0Var.d = 0;
                                    x0Var.c++;
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                            Unit unit5 = Unit.a;
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                x0 x0Var2 = this.l;
                if (x0Var2 != null && x0Var2.e) {
                    j();
                    com.gamericefishpro.space.i.a.S("compose:lazy:prefetch:execute:item", j);
                    x0 x0Var3 = this.l;
                    if (x0Var3 != null) {
                        x0Var3.e = false;
                    }
                }
                com.gamericefishpro.space.c3.a aVar = this.d;
                if (!this.g && aVar != null) {
                    if (!i(this.n, dVar.d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        f(aVar.a);
                        Unit unit6 = Unit.a;
                        Trace.endSection();
                        j();
                        dVar.d = d.a(this.o, dVar.d);
                        Function1 function2 = this.c;
                        if (function2 != null) {
                            function2.invoke(this);
                        }
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                }
                x0 x0Var4 = this.l;
                if (this.g && this.k && x0Var4 != null) {
                    List list4 = x0Var4.a;
                    int size2 = list4.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i6 = 0; i6 < size2; i6++) {
                        iMin = Math.min(iMin, ((m0) list4.get(i6)).e);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i7 = dVar.e;
                    dVar.e = i7 == -1 ? iMin : ((i7 * 3) + iMin) / 4;
                    int size3 = list4.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i8 = 0; i8 < size3; i8++) {
                        iMin2 = Math.min(iMin2, ((m0) list4.get(i8)).f);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        dVar.d = 0L;
                    }
                }
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        com.gamericefishpro.space.f2.d1 d1Var;
        return this.i || ((d1Var = this.f) != null && d1Var.d());
    }

    public final void f(long j) {
        if (this.h) {
            com.gamericefishpro.space.c0.a.a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.g) {
            com.gamericefishpro.space.c0.a.a("Request was already measured!");
        }
        this.g = true;
        com.gamericefishpro.space.f2.e1 e1Var = this.e;
        if (e1Var == null) {
            com.gamericefishpro.space.c0.a.b("performComposition() must be called before performMeasure()");
            throw new com.gamericefishpro.space.oh.e();
        }
        int iB = e1Var.b();
        for (int i = 0; i < iB; i++) {
            e1Var.e(i, j);
        }
    }

    public final void g(Object obj, Object obj2, d dVar) {
        com.gamericefishpro.space.f2.d1 sVar;
        com.gamericefishpro.space.f2.d1 d1Var = this.f;
        if (d1Var == null) {
            z0 z0Var = this.r;
            Function2 function2A = ((y) z0Var.b).a(this.a, obj, obj2);
            com.gamericefishpro.space.f2.h0 h0VarA = ((com.gamericefishpro.space.f2.g1) z0Var.c).a();
            if (h0VarA.d.H()) {
                h0VarA.k(obj, function2A, true);
                sVar = new com.gamericefishpro.space.u6.s(2, h0VarA, obj);
            } else {
                sVar = new com.gamericefishpro.space.u6.l(h0VarA, obj);
            }
            d1Var = sVar;
            this.f = d1Var;
            this.j = obj;
        }
        this.q = false;
        while (!d1Var.d() && !this.q) {
            d1Var.b(new w0(0, this, dVar));
        }
        j();
        if (this.q) {
            dVar.b = d.a(this.o, dVar.b);
        } else {
            dVar.a = d.a(this.o, dVar.a);
        }
    }

    public final x0 h() {
        com.gamericefishpro.space.f2.e1 e1Var = this.e;
        if (e1Var == null) {
            com.gamericefishpro.space.c0.a.b("Should precompose before resolving nested prefetch states");
            throw new com.gamericefishpro.space.oh.e();
        }
        com.gamericefishpro.space.ei.a0 a0Var = new com.gamericefishpro.space.ei.a0();
        e1Var.c(new com.gamericefishpro.space.f5.b0(a0Var, 1));
        List list = (List) a0Var.d;
        if (list != null) {
            return new x0(this, list);
        }
        return null;
    }

    public final boolean i(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void j() {
        long jF;
        com.gamericefishpro.space.ni.h.a.getClass();
        com.gamericefishpro.space.ni.f.a.getClass();
        long jA = com.gamericefishpro.space.ni.f.a();
        long j = this.p;
        com.gamericefishpro.space.ni.d unit = com.gamericefishpro.space.ni.d.NANOSECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        long j2 = Long.MAX_VALUE;
        if (((j - 1) | 1) != Long.MAX_VALUE) {
            jF = (1 | (jA - 1)) == Long.MAX_VALUE ? com.gamericefishpro.space.wa.b.F(jA) : com.gamericefishpro.space.wa.b.M(jA, j, unit);
        } else if (jA == j) {
            com.gamericefishpro.space.ni.b.d.getClass();
            jF = 0;
        } else {
            jF = com.gamericefishpro.space.ni.b.f(com.gamericefishpro.space.wa.b.F(j));
        }
        long j3 = jF >> 1;
        com.gamericefishpro.space.ni.a aVar = com.gamericefishpro.space.ni.b.d;
        if ((((int) jF) & 1) == 0) {
            j2 = j3;
        } else if (j3 <= 9223372036854L) {
            j2 = j3 < -9223372036854L ? Long.MIN_VALUE : j3 * ((long) 1000000);
        }
        this.o = j2;
        long j4 = this.n - j2;
        this.n = j4;
        this.p = jA;
        com.gamericefishpro.space.i.a.S("compose:lazy:prefetch:available_time_nanos", j4);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.a + ", constraints = " + this.d + ", isComposed = " + e() + ", isMeasured = " + this.g + ", isCanceled = " + this.h + " }";
    }
}
