package com.gamericefishpro.space.g5;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d0.n1;
import com.gamericefishpro.space.pi.d1;
import com.gamericefishpro.space.si.n0;
import com.gamericefishpro.space.t0.b1;
import com.gamericefishpro.space.t0.f1;
import com.gamericefishpro.space.t0.r1;
import com.gamericefishpro.space.t0.s0;
import com.gamericefishpro.space.t0.t1;
import com.gamericefishpro.space.t0.u1;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.w.l0;
import com.gamericefishpro.space.w.l1;
import com.gamericefishpro.space.w.s1;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d = 0;
    public int e;
    public /* synthetic */ Object i;
    public Object v;
    public Object w;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i iVar, v0 v0Var, b1 b1Var, v0 v0Var2, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.v = iVar;
        this.w = v0Var;
        this.z = b1Var;
        this.y = v0Var2;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                w wVar = new w((i) this.v, (v0) this.w, (b1) this.z, (v0) this.y, aVar);
                wVar.i = obj;
                return wVar;
            case 1:
                w wVar2 = new w((u1) this.w, (t1) this.y, (s0) this.z, aVar);
                wVar2.i = obj;
                return wVar2;
            default:
                return new w((com.gamericefishpro.space.w.s0) this.y, this.i, (l1) this.z, aVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((w) create((com.gamericefishpro.space.si.e) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((w) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((w) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02a0 A[Catch: all -> 0x01c3, LOOP:1: B:132:0x029e->B:133:0x02a0, LOOP_END, TryCatch #1 {all -> 0x01c3, blocks: (B:93:0x01be, B:127:0x028d, B:128:0x0293, B:130:0x0298, B:131:0x0299, B:133:0x02a0, B:134:0x02ac, B:151:0x02f0, B:152:0x02f1, B:129:0x0294), top: B:204:0x01b0, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:214:0x0294 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:71:0x0147  */
    /* JADX WARN: Code duplicated, block: B:79:0x0192 A[PHI: r7 r8 r19
      0x0192: PHI (r7v22 com.gamericefishpro.space.uh.a) = (r7v14 com.gamericefishpro.space.uh.a), (r7v23 com.gamericefishpro.space.uh.a) binds: [B:77:0x018f, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0192: PHI (r8v32 int) = (r8v23 int), (r8v33 int) binds: [B:77:0x018f, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0192: PHI (r19v6 float) = (r19v2 float), (r19v7 float) binds: [B:77:0x018f, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x019f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.gamericefishpro.space.a8.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [com.gamericefishpro.space.a8.b] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.gamericefishpro.space.a8.b] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.gamericefishpro.space.pi.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.Collection] */
    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.f5.k kVar;
        n0 n0Var;
        Object obj2;
        com.gamericefishpro.space.z0.b bVar;
        u1 u1Var;
        List listD;
        int size;
        int i;
        com.gamericefishpro.space.db.d dVar;
        ?? r3;
        ?? r2;
        com.gamericefishpro.space.xi.c cVar;
        com.gamericefishpro.space.w.s0 s0Var;
        Object objW;
        com.gamericefishpro.space.uh.a aVar;
        f1 f1Var;
        b1 b1Var;
        float f;
        int i2;
        l0 l0Var;
        b1 b1Var2;
        long j;
        com.gamericefishpro.space.w.k kVar2;
        float f2;
        ?? N = 2;
        int i3 = 4;
        com.gamericefishpro.space.f5.k kVar3 = null;
        boolean z = false;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b1 b1Var3 = (b1) this.z;
                v0 v0Var = (v0) this.y;
                i iVar = (i) this.v;
                v0 v0Var2 = (v0) this.w;
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i4 = this.e;
                try {
                    if (i4 == 0) {
                        com.gamericefishpro.space.wa.b.P(obj);
                        com.gamericefishpro.space.si.e eVar = (com.gamericefishpro.space.si.e) this.i;
                        if (((List) v0Var2.getValue()).size() > 1) {
                            b1Var3.h(0.0f);
                            kVar3 = (com.gamericefishpro.space.f5.k) CollectionsKt.C((List) v0Var2.getValue());
                            Intrinsics.b(kVar3);
                            iVar.g(kVar3);
                            iVar.g((com.gamericefishpro.space.f5.k) ((List) v0Var2.getValue()).get(((List) v0Var2.getValue()).size() - 2));
                        }
                        v vVar = new v(v0Var2, v0Var, b1Var3, 0);
                        this.i = kVar3;
                        this.e = 1;
                        if (eVar.a(vVar, this) == aVar2) {
                            return aVar2;
                        }
                        kVar = kVar3;
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kVar = (com.gamericefishpro.space.f5.k) this.i;
                        com.gamericefishpro.space.wa.b.P(obj);
                    }
                    if (((List) v0Var2.getValue()).size() > 1) {
                        v0Var.setValue(Boolean.FALSE);
                        Intrinsics.b(kVar);
                        iVar.e(kVar, false);
                    }
                    break;
                } catch (CancellationException unused) {
                    if (((List) v0Var2.getValue()).size() > 1) {
                        v0Var.setValue(Boolean.FALSE);
                    }
                }
                return Unit.a;
            case 1:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                ?? bVar2 = this.e;
                try {
                    if (bVar2 == 0) {
                        com.gamericefishpro.space.wa.b.P(obj);
                        N = com.gamericefishpro.space.pi.a0.n(((com.gamericefishpro.space.pi.x) this.i).l());
                        u1 u1Var2 = (u1) this.w;
                        synchronized (u1Var2.c) {
                            Throwable th = u1Var2.e;
                            if (th != null) {
                                throw th;
                            }
                            if (((r1) u1Var2.u.getValue()).compareTo(r1.e) <= 0) {
                                throw new IllegalStateException("Recomposer shut down");
                            }
                            if (u1Var2.d != null) {
                                throw new IllegalStateException("Recomposer already running");
                            }
                            u1Var2.d = N;
                            u1Var2.y();
                        }
                        n1 n1Var = new n1(11, (u1) this.w);
                        com.gamericefishpro.space.f1.p.e(com.gamericefishpro.space.f1.p.a);
                        synchronized (com.gamericefishpro.space.f1.p.c) {
                            com.gamericefishpro.space.f1.p.h = CollectionsKt.E(com.gamericefishpro.space.f1.p.h, n1Var);
                            Unit unit = Unit.a;
                        }
                        bVar2 = new com.gamericefishpro.space.a8.b(i3, n1Var);
                        n0 n0Var2 = u1.z;
                        com.gamericefishpro.space.t0.f fVar = ((u1) this.w).y;
                        do {
                            n0Var = u1.z;
                            obj2 = (com.gamericefishpro.space.w0.c) n0Var.getValue();
                            bVar = (com.gamericefishpro.space.z0.b) obj2;
                            com.gamericefishpro.space.a1.b bVar3 = com.gamericefishpro.space.a1.b.a;
                            com.gamericefishpro.space.y0.b bVar4 = bVar.v;
                            if (!bVar4.containsKey(fVar)) {
                                if (bVar.isEmpty()) {
                                    bVar = new com.gamericefishpro.space.z0.b(fVar, fVar, bVar4.h(fVar, new com.gamericefishpro.space.z0.a(bVar3, bVar3)));
                                } else {
                                    Object obj3 = bVar.i;
                                    Object obj4 = bVar4.get(obj3);
                                    Intrinsics.b(obj4);
                                    bVar = new com.gamericefishpro.space.z0.b(bVar.e, fVar, bVar4.h(obj3, new com.gamericefishpro.space.z0.a(((com.gamericefishpro.space.z0.a) obj4).a, fVar)).h(fVar, new com.gamericefishpro.space.z0.a(obj3, bVar3)));
                                }
                            }
                            if (obj2 != bVar) {
                                com.gamericefishpro.space.d6.a aVar4 = com.gamericefishpro.space.ti.c.b;
                                if (obj2 == null) {
                                    obj2 = aVar4;
                                }
                            }
                            u1Var = (u1) this.w;
                            synchronized (u1Var.c) {
                                listD = u1Var.D();
                            }
                            size = listD.size();
                            for (i = 0; i < size; i++) {
                                ((com.gamericefishpro.space.t0.x) listD.get(i)).t();
                            }
                            dVar = new com.gamericefishpro.space.db.d((t1) this.y, (s0) this.z, z ? 1 : 0, 9);
                            this.i = N;
                            this.v = bVar2;
                            this.e = 1;
                            r2 = bVar2;
                            r3 = N;
                            if (com.gamericefishpro.space.pi.a0.h(dVar, this) == aVar3) {
                                return aVar3;
                            }
                        } while (!n0Var.j(obj2, bVar));
                        u1Var = (u1) this.w;
                        synchronized (u1Var.c) {
                            listD = u1Var.D();
                            size = listD.size();
                            while (i < size) {
                                ((com.gamericefishpro.space.t0.x) listD.get(i)).t();
                            }
                            dVar = new com.gamericefishpro.space.db.d((t1) this.y, (s0) this.z, z ? 1 : 0, 9);
                            this.i = N;
                            this.v = bVar2;
                            this.e = 1;
                            r2 = bVar2;
                            r3 = N;
                            if (com.gamericefishpro.space.pi.a0.h(dVar, this) == aVar3) {
                                return aVar3;
                            }
                        }
                    } else {
                        if (bVar2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.gamericefishpro.space.a8.b bVar5 = (com.gamericefishpro.space.a8.b) this.v;
                        d1 d1Var = (d1) this.i;
                        com.gamericefishpro.space.wa.b.P(obj);
                        r2 = bVar5;
                        r3 = d1Var;
                    }
                    r2.e();
                    u1 u1Var3 = (u1) this.w;
                    synchronized (u1Var3.c) {
                        try {
                            if (u1Var3.d == r3) {
                                u1Var3.d = null;
                            }
                            u1Var3.y();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    n0 n0Var3 = u1.z;
                    com.gamericefishpro.space.t0.f.b(((u1) this.w).y);
                    return Unit.a;
                } catch (Throwable th3) {
                    bVar2.e();
                    u1 u1Var4 = (u1) this.w;
                    synchronized (u1Var4.c) {
                        try {
                            if (u1Var4.d == N) {
                                u1Var4.d = null;
                            }
                            u1Var4.y();
                            n0 n0Var4 = u1.z;
                            com.gamericefishpro.space.t0.f.b(((u1) this.w).y);
                            throw th3;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            default:
                com.gamericefishpro.space.w.k kVar4 = com.gamericefishpro.space.w.s0.L;
                l1 l1Var = (l1) this.z;
                com.gamericefishpro.space.w.k kVar5 = com.gamericefishpro.space.w.s0.K;
                Object obj5 = this.i;
                com.gamericefishpro.space.w.s0 s0Var2 = (com.gamericefishpro.space.w.s0) this.y;
                com.gamericefishpro.space.uh.a aVar5 = com.gamericefishpro.space.uh.a.d;
                int i5 = this.e;
                try {
                    if (i5 == 0) {
                        com.gamericefishpro.space.wa.b.P(obj);
                        Object value = s0Var2.e.getValue();
                        if (!obj5.equals(value)) {
                            com.gamericefishpro.space.w.s0.s(s0Var2);
                            s0Var2.B(0.0f);
                            l1Var.p(obj5);
                            l1Var.n(0L);
                            s0Var2.o(value);
                            s0Var2.e.setValue(obj5);
                        }
                        com.gamericefishpro.space.xi.c cVar2 = s0Var2.C;
                        this.v = cVar2;
                        this.w = s0Var2;
                        this.e = 1;
                        if (cVar2.c(this) == aVar5) {
                            aVar = aVar5;
                        } else {
                            cVar = cVar2;
                            s0Var = s0Var2;
                        }
                        return aVar;
                    }
                    if (i5 == 1) {
                        s0Var = (com.gamericefishpro.space.w.s0) this.w;
                        cVar = (com.gamericefishpro.space.xi.c) this.v;
                        com.gamericefishpro.space.wa.b.P(obj);
                    } else {
                        if (i5 == 2) {
                            com.gamericefishpro.space.wa.b.P(obj);
                            this.e = 3;
                            if (com.gamericefishpro.space.w.s0.v(s0Var2, this) != aVar5) {
                                f1Var = s0Var2.i;
                                b1Var = s0Var2.A;
                                if (!Intrinsics.a(f1Var.getValue(), obj5)) {
                                    if (b1Var.g() < 1.0f) {
                                        f = 0.0f;
                                        aVar = aVar5;
                                        i2 = 5;
                                    } else {
                                        f = 0.0f;
                                        aVar = aVar5;
                                        i2 = 5;
                                    }
                                    this.v = null;
                                    this.w = null;
                                    this.e = 4;
                                    if (com.gamericefishpro.space.w.s0.t(s0Var2, this) != aVar) {
                                        s0Var2.o(obj5);
                                        this.e = i2;
                                        f2 = com.gamericefishpro.space.w.s0.u(s0Var2, this) != aVar ? f : 0.0f;
                                    }
                                }
                                return Unit.a;
                            }
                            aVar = aVar5;
                            return aVar;
                        }
                        if (i5 == 3) {
                            com.gamericefishpro.space.wa.b.P(obj);
                            f1Var = s0Var2.i;
                            b1Var = s0Var2.A;
                            if (!Intrinsics.a(f1Var.getValue(), obj5)) {
                                if (b1Var.g() < 1.0f || ((l0Var = s0Var2.G) != null && Intrinsics.a(null, l0Var.b))) {
                                    f = 0.0f;
                                    aVar = aVar5;
                                    i2 = 5;
                                } else {
                                    s1 s1Var = l0Var != null ? l0Var.b : null;
                                    if (s1Var != null) {
                                        aVar = aVar5;
                                        long j2 = l0Var.a;
                                        com.gamericefishpro.space.w.k kVar6 = l0Var.e;
                                        com.gamericefishpro.space.w.k kVar7 = l0Var.f;
                                        if (kVar7 == null) {
                                            kVar7 = kVar5;
                                        }
                                        f = 0.0f;
                                        b1Var2 = b1Var;
                                        j = 0;
                                        kVar2 = (com.gamericefishpro.space.w.k) s1Var.f(j2, kVar6, kVar4, kVar7);
                                        i2 = 5;
                                    } else {
                                        f = 0.0f;
                                        b1Var2 = b1Var;
                                        aVar = aVar5;
                                        i2 = 5;
                                        j = 0;
                                        if (l0Var == null || l0Var.a == 0) {
                                            kVar2 = kVar5;
                                        } else {
                                            long j3 = l0Var.g;
                                            if (j3 == Long.MIN_VALUE) {
                                                j3 = s0Var2.y;
                                            }
                                            float f3 = j3 / 1.0E9f;
                                            if (f3 <= 0.0f) {
                                                kVar2 = kVar5;
                                            } else {
                                                kVar2 = new com.gamericefishpro.space.w.k(1.0f / f3);
                                            }
                                        }
                                    }
                                    if (l0Var == null) {
                                        l0Var = new l0();
                                    }
                                    com.gamericefishpro.space.w.k kVar8 = l0Var.e;
                                    l0Var.b = null;
                                    l0Var.c = false;
                                    l0Var.d = b1Var2.g();
                                    kVar8.e(0, b1Var2.g());
                                    long j4 = s0Var2.y;
                                    l0Var.g = j4;
                                    l0Var.a = j;
                                    l0Var.f = kVar2;
                                    l0Var.h = com.gamericefishpro.space.gi.c.b((1.0d - ((double) b1Var2.g())) * j4);
                                    s0Var2.G = l0Var;
                                }
                                this.v = null;
                                this.w = null;
                                this.e = 4;
                                if (com.gamericefishpro.space.w.s0.t(s0Var2, this) != aVar) {
                                    s0Var2.o(obj5);
                                    this.e = i2;
                                    if (com.gamericefishpro.space.w.s0.u(s0Var2, this) != aVar) {
                                    }
                                }
                                return aVar;
                            }
                            return Unit.a;
                        }
                        if (i5 == 4) {
                            com.gamericefishpro.space.wa.b.P(obj);
                            f = 0.0f;
                            aVar = aVar5;
                            i2 = 5;
                            s0Var2.o(obj5);
                            this.e = i2;
                            if (com.gamericefishpro.space.w.s0.u(s0Var2, this) != aVar) {
                            }
                            return aVar;
                        }
                        if (i5 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.gamericefishpro.space.wa.b.P(obj);
                    }
                    s0Var2.B(f2);
                    return Unit.a;
                    Object obj6 = s0Var.v;
                    cVar.b(null);
                    if (!obj5.equals(obj6)) {
                        this.v = null;
                        this.w = null;
                        this.e = 2;
                        if (s0Var2.E == Long.MIN_VALUE) {
                            objW = com.gamericefishpro.space.t0.i.s(getContext()).E(s0Var2.H, this);
                            if (objW != aVar5) {
                                objW = Unit.a;
                            }
                        } else {
                            objW = s0Var2.w(this);
                            if (objW != aVar5) {
                                objW = Unit.a;
                            }
                        }
                        if (objW != aVar5) {
                            this.e = 3;
                            if (com.gamericefishpro.space.w.s0.v(s0Var2, this) != aVar5) {
                            }
                            return aVar;
                        }
                        aVar = aVar5;
                        return aVar;
                    }
                    f1Var = s0Var2.i;
                    b1Var = s0Var2.A;
                    if (!Intrinsics.a(f1Var.getValue(), obj5)) {
                        if (b1Var.g() < 1.0f) {
                            f = 0.0f;
                            aVar = aVar5;
                            i2 = 5;
                        } else {
                            f = 0.0f;
                            aVar = aVar5;
                            i2 = 5;
                        }
                        this.v = null;
                        this.w = null;
                        this.e = 4;
                        if (com.gamericefishpro.space.w.s0.t(s0Var2, this) != aVar) {
                            s0Var2.o(obj5);
                            this.e = i2;
                            if (com.gamericefishpro.space.w.s0.u(s0Var2, this) != aVar) {
                                s0Var2.B(f2);
                            }
                        }
                        return aVar;
                    }
                    return Unit.a;
                } catch (Throwable th5) {
                    cVar.b(null);
                    throw th5;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(u1 u1Var, t1 t1Var, s0 s0Var, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.w = u1Var;
        this.y = t1Var;
        this.z = s0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.gamericefishpro.space.w.s0 s0Var, Object obj, l1 l1Var, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.y = s0Var;
        this.i = obj;
        this.z = l1Var;
    }
}
