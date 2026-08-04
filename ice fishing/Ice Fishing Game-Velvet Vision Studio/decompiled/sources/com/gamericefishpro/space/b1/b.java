package com.gamericefishpro.space.b1;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.y;
import com.gamericefishpro.space.f0.w;
import com.gamericefishpro.space.f1.z;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.t0.d0;
import com.gamericefishpro.space.t0.d2;
import com.gamericefishpro.space.t0.h2;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.t0.u0;
import com.gamericefishpro.space.u0.k0;
import com.gamericefishpro.space.u6.s;
import com.gamericefishpro.space.z.u1;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;

    public /* synthetic */ b(r rVar, com.gamericefishpro.space.u0.a aVar, d2 d2Var, u0 u0Var) {
        this.d = 4;
        this.e = rVar;
        this.i = aVar;
        this.v = d2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        int i2 = this.d;
        Object obj = this.v;
        Object obj2 = this.i;
        Object obj3 = this.e;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((c) obj3).a();
                a aVar = (a) ((d) obj2).i;
                int i3 = ((y) obj).d;
                do {
                    i = aVar.get();
                } while (!aVar.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return Unit.a;
            case 1:
                w wVar = (w) obj2;
                com.gamericefishpro.space.f0.h hVar = (com.gamericefishpro.space.f0.h) ((d0) obj3).getValue();
                return new com.gamericefishpro.space.f0.j(wVar, hVar, (com.gamericefishpro.space.f0.c) obj, new z((IntRange) wVar.e.f.getValue(), hVar));
            case 2:
                com.gamericefishpro.space.i0.c cVar = (com.gamericefishpro.space.i0.c) obj3;
                com.gamericefishpro.space.n1.c cVarA0 = com.gamericefishpro.space.i0.c.A0(cVar, (f1) obj2, (com.gamericefishpro.space.b2.b) obj);
                if (cVarA0 == null) {
                    return null;
                }
                com.gamericefishpro.space.z.i iVar = cVar.H;
                if (com.gamericefishpro.space.c3.k.a(iVar.N, 0L)) {
                    com.gamericefishpro.space.c0.a.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return cVarA0.e(iVar.D0(cVarA0, iVar.N, 0L) ^ (-9223372034707292160L));
            case 3:
                com.gamericefishpro.space.s5.p pVar = (com.gamericefishpro.space.s5.p) obj3;
                s sVar = (s) obj2;
                String str = (String) obj;
                if (pVar.b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                com.gamericefishpro.space.c6.a aVarE = ((com.gamericefishpro.space.c6.b) sVar.e).e(str);
                if (pVar.a) {
                    if (pVar.c.g == com.gamericefishpro.space.s5.s.i) {
                        com.gamericefishpro.space.i.a.r(aVarE, "PRAGMA synchronous = NORMAL");
                    } else {
                        com.gamericefishpro.space.i.a.r(aVarE, "PRAGMA synchronous = FULL");
                    }
                    com.gamericefishpro.space.s5.p.b(aVarE);
                    pVar.d.d(aVarE);
                } else {
                    try {
                        pVar.b = true;
                        com.gamericefishpro.space.s5.p.a(pVar, aVarE);
                    } finally {
                        pVar.b = false;
                    }
                }
                return aVarE;
            case 4:
                r rVar = (r) obj3;
                com.gamericefishpro.space.u0.a aVar2 = (com.gamericefishpro.space.u0.a) obj2;
                d2 d2Var = (d2) obj;
                com.gamericefishpro.space.u0.b bVar = rVar.M;
                com.gamericefishpro.space.u0.a aVar3 = bVar.b;
                try {
                    bVar.b = aVar2;
                    d2 d2Var2 = rVar.G;
                    int[] iArr = rVar.o;
                    com.gamericefishpro.space.t.w wVar2 = rVar.v;
                    rVar.o = null;
                    rVar.v = null;
                    try {
                        rVar.G = d2Var;
                        boolean z = bVar.e;
                        try {
                            bVar.e = false;
                            throw null;
                        } catch (Throwable th) {
                            bVar.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        rVar.G = d2Var2;
                        rVar.o = iArr;
                        rVar.v = wVar2;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    bVar.b = aVar3;
                    throw th3;
                }
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.t0.a aVar4 = (com.gamericefishpro.space.t0.a) obj3;
                h2 h2Var = (h2) obj2;
                k0 k0Var = (k0) obj;
                if (aVar4 != null) {
                    h2Var.a(h2Var.c(aVar4) - h2Var.t);
                }
                List listL = com.gamericefishpro.space.u6.f.l(h2Var, null, h2Var.t, null);
                com.gamericefishpro.space.g1.c cVar2 = (com.gamericefishpro.space.g1.c) CollectionsKt.C(listL);
                Integer num = cVar2 != null ? cVar2.b : null;
                List listA = k0Var.a(num);
                if (num != null && !listA.isEmpty()) {
                    listA = CollectionsKt.F(com.gamericefishpro.space.ph.w.c(new com.gamericefishpro.space.g1.c(((com.gamericefishpro.space.g1.c) CollectionsKt.w(listA)).a, null, num)), CollectionsKt.u(listA));
                }
                return new com.gamericefishpro.space.g1.a(CollectionsKt.F(listL, listA));
            default:
                com.gamericefishpro.space.z.i iVar2 = (com.gamericefishpro.space.z.i) obj3;
                u1 u1Var = (u1) obj2;
                com.gamericefishpro.space.z.c cVar3 = (com.gamericefishpro.space.z.c) obj;
                com.gamericefishpro.space.h0.l lVar = iVar2.L;
                while (true) {
                    com.gamericefishpro.space.v0.e eVar = lVar.a;
                    int i4 = eVar.i;
                    if (i4 != 0) {
                        if (i4 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        com.gamericefishpro.space.n1.c cVar4 = (com.gamericefishpro.space.n1.c) ((com.gamericefishpro.space.z.f) eVar.d[i4 - 1]).a.invoke();
                        if (cVar4 == null ? true : com.gamericefishpro.space.z.i.B0(iVar2, cVar4, 0L, 0L, 3)) {
                            com.gamericefishpro.space.v0.e eVar2 = lVar.a;
                            com.gamericefishpro.space.pi.h hVar2 = ((com.gamericefishpro.space.z.f) eVar2.l(eVar2.i - 1)).b;
                            Unit unit = Unit.a;
                            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                            hVar2.resumeWith(unit);
                        }
                    }
                }
                if (iVar2.M) {
                    com.gamericefishpro.space.n1.c cVar5 = (com.gamericefishpro.space.n1.c) iVar2.K.invoke();
                    if (cVar5 != null && com.gamericefishpro.space.z.i.B0(iVar2, cVar5, 0L, 0L, 3)) {
                        iVar2.M = false;
                    }
                }
                u1Var.e = com.gamericefishpro.space.z.i.A0(iVar2, cVar3, 0L);
                return Unit.a;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
        this.v = obj3;
    }
}
