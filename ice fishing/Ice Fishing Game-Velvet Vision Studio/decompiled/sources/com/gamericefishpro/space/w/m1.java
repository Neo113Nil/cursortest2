package com.gamericefishpro.space.w;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h2.c2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m1 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m1(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0232  */
    /* JADX WARN: Code duplicated, block: B:89:0x026e  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fCeil;
        com.gamericefishpro.space.o1.k kVar;
        int i;
        boolean z;
        com.gamericefishpro.space.o1.f fVarE;
        com.gamericefishpro.space.o1.b bVar;
        boolean z2;
        int i2 = this.d;
        Object obj2 = this.e;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new com.gamericefishpro.space.e.c(6, (l1) obj2);
            case 1:
                com.gamericefishpro.space.e.e eVar = (com.gamericefishpro.space.e.e) obj2;
                String msg = (String) obj;
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (Intrinsics.a(msg, "start_ice")) {
                    eVar.invoke();
                }
                return Unit.a;
            case 2:
                ((com.gamericefishpro.space.xi.c) obj2).b(null);
                return Unit.a;
            case 3:
                com.gamericefishpro.space.y.w wVar = (com.gamericefishpro.space.y.w) obj2;
                com.gamericefishpro.space.l1.d dVar = (com.gamericefishpro.space.l1.d) obj;
                if (dVar.b() * wVar.K < 0.0f || com.gamericefishpro.space.n1.e.b(dVar.d.c()) <= 0.0f) {
                    return dVar.a(new com.gamericefishpro.space.x7.e(1));
                }
                if (com.gamericefishpro.space.c3.f.b(wVar.K, 0.0f)) {
                    fCeil = 1.0f;
                } else {
                    fCeil = (float) Math.ceil(dVar.b() * wVar.K);
                }
                int i3 = 2;
                float f = 2;
                final float fMin = Math.min(fCeil, (float) Math.ceil(com.gamericefishpro.space.n1.e.b(dVar.d.c()) / f));
                final float f2 = fMin / f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.d.c() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.d.c() & 4294967295L)) - fMin)) & 4294967295L);
                float f3 = fMin * f;
                boolean z3 = f3 > com.gamericefishpro.space.n1.e.b(dVar.d.c());
                com.gamericefishpro.space.o1.o oVarA = wVar.M.a(dVar.d.c(), dVar.d.getLayoutDirection(), dVar);
                if (!(oVarA instanceof com.gamericefishpro.space.o1.b0)) {
                    if (!(oVarA instanceof com.gamericefishpro.space.o1.d0)) {
                        boolean z4 = z3;
                        if (!(oVarA instanceof com.gamericefishpro.space.o1.c0)) {
                            throw new com.gamericefishpro.space.oh.k();
                        }
                        final com.gamericefishpro.space.o1.m0 m0Var = wVar.L;
                        if (z4) {
                            jFloatToRawIntBits = 0;
                        }
                        final long j = jFloatToRawIntBits;
                        if (z4) {
                            jFloatToRawIntBits2 = dVar.d.c();
                        }
                        final long j2 = jFloatToRawIntBits2;
                        final com.gamericefishpro.space.q1.c gVar = z4 ? com.gamericefishpro.space.q1.f.b : new com.gamericefishpro.space.q1.g(fMin, 0.0f, 0, 0, 30);
                        return dVar.a(new Function1() { // from class: com.gamericefishpro.space.y.t
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                com.gamericefishpro.space.h2.h0 h0Var = (com.gamericefishpro.space.h2.h0) obj3;
                                h0Var.a();
                                com.gamericefishpro.space.q1.d.n0(h0Var, m0Var, j, j2, 0.0f, gVar, 104);
                                return Unit.a;
                            }
                        });
                    }
                    final com.gamericefishpro.space.o1.m0 m0Var2 = wVar.L;
                    com.gamericefishpro.space.n1.d dVar2 = ((com.gamericefishpro.space.o1.d0) oVarA).f;
                    if (com.gamericefishpro.space.u6.f.H(dVar2)) {
                        final long j3 = dVar2.e;
                        final com.gamericefishpro.space.q1.g gVar2 = new com.gamericefishpro.space.q1.g(fMin, 0.0f, 0, 0, 30);
                        final boolean z5 = z3;
                        return dVar.a(new Function1() { // from class: com.gamericefishpro.space.y.u
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) throws Throwable {
                                com.gamericefishpro.space.a8.c cVar;
                                long j4;
                                com.gamericefishpro.space.h2.h0 h0Var = (com.gamericefishpro.space.h2.h0) obj3;
                                h0Var.a();
                                com.gamericefishpro.space.q1.b bVar2 = h0Var.d;
                                boolean z6 = z5;
                                com.gamericefishpro.space.o1.o oVar = m0Var2;
                                long j5 = j3;
                                if (z6) {
                                    com.gamericefishpro.space.q1.d.M(h0Var, oVar, 0L, 0L, j5, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                                    float f4 = f2;
                                    if (fIntBitsToFloat < f4) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar2.c() >> 32));
                                        float f5 = fMin;
                                        float f6 = fIntBitsToFloat2 - f5;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bVar2.c() & 4294967295L)) - f5;
                                        com.gamericefishpro.space.a8.c cVar2 = bVar2.e;
                                        long jO = cVar2.o();
                                        cVar2.j().k();
                                        try {
                                            ((com.gamericefishpro.space.a8.c) ((com.gamericefishpro.space.m.d) cVar2.e).e).j().f(f5, f5, f6, fIntBitsToFloat3, 0);
                                            j4 = jO;
                                            cVar = cVar2;
                                            try {
                                                com.gamericefishpro.space.q1.d.M(h0Var, oVar, 0L, 0L, j5, null, 246);
                                                cVar.j().i();
                                                cVar.H(j4);
                                            } catch (Throwable th) {
                                                th = th;
                                                cVar.j().i();
                                                cVar.H(j4);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cVar = cVar2;
                                            j4 = jO;
                                        }
                                    } else {
                                        com.gamericefishpro.space.q1.d.M(h0Var, oVar, jFloatToRawIntBits, jFloatToRawIntBits2, q.m(j5, f4), gVar2, 208);
                                    }
                                }
                                return Unit.a;
                            }
                        });
                    }
                    boolean z6 = z3;
                    if (wVar.J == null) {
                        wVar.J = new com.gamericefishpro.space.y.s();
                    }
                    com.gamericefishpro.space.y.s sVar = wVar.J;
                    Intrinsics.b(sVar);
                    com.gamericefishpro.space.o1.h hVarA = sVar.d;
                    if (hVarA == null) {
                        hVarA = com.gamericefishpro.space.o1.j.a();
                        sVar.d = hVarA;
                    }
                    hVarA.f();
                    com.gamericefishpro.space.o1.h.b(hVarA, dVar2);
                    if (!z6) {
                        com.gamericefishpro.space.o1.h hVarA2 = com.gamericefishpro.space.o1.j.a();
                        com.gamericefishpro.space.o1.h.b(hVarA2, new com.gamericefishpro.space.n1.d(fMin, fMin, dVar2.b() - fMin, dVar2.a() - fMin, com.gamericefishpro.space.y.q.m(dVar2.e, fMin), com.gamericefishpro.space.y.q.m(dVar2.f, fMin), com.gamericefishpro.space.y.q.m(dVar2.g, fMin), com.gamericefishpro.space.y.q.m(dVar2.h, fMin)));
                        hVarA.e(hVarA, hVarA2, 0);
                    }
                    return dVar.a(new com.gamericefishpro.space.y.b(1, hVarA, m0Var2));
                }
                com.gamericefishpro.space.o1.m0 m0Var3 = wVar.L;
                com.gamericefishpro.space.o1.b0 b0Var = (com.gamericefishpro.space.o1.b0) oVarA;
                com.gamericefishpro.space.o1.h hVar = b0Var.f;
                if (z3) {
                    return dVar.a(new com.gamericefishpro.space.y.b(i3, b0Var, m0Var3));
                }
                if (m0Var3 != null) {
                    kVar = new com.gamericefishpro.space.o1.k(5, com.gamericefishpro.space.o1.s.c(m0Var3.f, 1.0f));
                    i = 1;
                } else {
                    kVar = null;
                    i = 0;
                }
                final com.gamericefishpro.space.n1.c cVarC = hVar.c();
                float f4 = cVarC.b;
                float f5 = cVarC.a;
                if (wVar.J == null) {
                    wVar.J = new com.gamericefishpro.space.y.s();
                }
                com.gamericefishpro.space.y.s sVar2 = wVar.J;
                Intrinsics.b(sVar2);
                com.gamericefishpro.space.o1.h hVarA3 = sVar2.d;
                if (hVarA3 == null) {
                    hVarA3 = com.gamericefishpro.space.o1.j.a();
                    sVar2.d = hVarA3;
                }
                hVarA3.f();
                com.gamericefishpro.space.o1.e0[] e0VarArr = com.gamericefishpro.space.o1.e0.d;
                float f6 = cVarC.a;
                float f7 = cVarC.d;
                float f8 = cVarC.c;
                float f9 = cVarC.b;
                if (Float.isNaN(f6) || Float.isNaN(f9) || Float.isNaN(f8) || Float.isNaN(f7)) {
                    com.gamericefishpro.space.o1.j.b("Invalid rectangle, make sure no value is NaN");
                }
                if (hVarA3.b == null) {
                    hVarA3.b = new RectF();
                }
                RectF rectF = hVarA3.b;
                Intrinsics.b(rectF);
                rectF.set(f6, f9, f8, f7);
                Path path = hVarA3.a;
                RectF rectF2 = hVarA3.b;
                Intrinsics.b(rectF2);
                path.addRect(rectF2, Path.Direction.CCW);
                hVarA3.e(hVarA3, hVar, 0);
                final com.gamericefishpro.space.ei.a0 a0Var = new com.gamericefishpro.space.ei.a0();
                final long jCeil = (((long) ((int) Math.ceil(cVarC.c - f5))) << 32) | (((long) ((int) Math.ceil(cVarC.d - f4))) & 4294967295L);
                com.gamericefishpro.space.y.s sVar3 = wVar.J;
                Intrinsics.b(sVar3);
                com.gamericefishpro.space.o1.f fVar = sVar3.a;
                com.gamericefishpro.space.o1.b bVar2 = sVar3.b;
                com.gamericefishpro.space.o1.y yVar = fVar != null ? new com.gamericefishpro.space.o1.y(fVar.a()) : null;
                if (yVar != null && yVar.a == 0) {
                    z = true;
                } else {
                    com.gamericefishpro.space.o1.y yVar2 = fVar != null ? new com.gamericefishpro.space.o1.y(fVar.a()) : null;
                    if (yVar2 != null && i == yVar2.a) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (fVar == null || bVar2 == null) {
                    fVarE = com.gamericefishpro.space.o1.o.e((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                    sVar3.a = fVarE;
                    Canvas canvas = com.gamericefishpro.space.o1.c.a;
                    bVar = new com.gamericefishpro.space.o1.b();
                    bVar.a = new Canvas(fVarE.a);
                    sVar3.b = bVar;
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d.c() >> 32));
                    Bitmap bitmap = fVar.a;
                    if (fIntBitsToFloat > bitmap.getWidth() || Float.intBitsToFloat((int) (dVar.d.c() & 4294967295L)) > bitmap.getHeight() || !z) {
                        fVarE = com.gamericefishpro.space.o1.o.e((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                        sVar3.a = fVarE;
                        Canvas canvas2 = com.gamericefishpro.space.o1.c.a;
                        bVar = new com.gamericefishpro.space.o1.b();
                        bVar.a = new Canvas(fVarE.a);
                        sVar3.b = bVar;
                    } else {
                        fVarE = fVar;
                        bVar = bVar2;
                    }
                }
                com.gamericefishpro.space.q1.b bVar3 = sVar3.c;
                if (bVar3 == null) {
                    bVar3 = new com.gamericefishpro.space.q1.b();
                    sVar3.c = bVar3;
                }
                com.gamericefishpro.space.a8.c cVar = bVar3.e;
                com.gamericefishpro.space.q1.a aVar = bVar3.d;
                long jQ = com.gamericefishpro.space.d9.h.Q(jCeil);
                com.gamericefishpro.space.c3.l layoutDirection = dVar.d.getLayoutDirection();
                final com.gamericefishpro.space.o1.k kVar2 = kVar;
                com.gamericefishpro.space.c3.c cVar2 = aVar.a;
                com.gamericefishpro.space.q1.b bVar4 = bVar3;
                com.gamericefishpro.space.c3.l lVar = aVar.b;
                com.gamericefishpro.space.o1.h hVar2 = hVarA3;
                com.gamericefishpro.space.o1.q qVar = aVar.c;
                long j4 = aVar.d;
                aVar.a = dVar;
                aVar.b = layoutDirection;
                aVar.c = bVar;
                aVar.d = jQ;
                bVar.k();
                com.gamericefishpro.space.q1.d.w(bVar4, com.gamericefishpro.space.o1.s.b, jQ, 58);
                float f10 = -f5;
                float f11 = -f4;
                ((com.gamericefishpro.space.m.d) cVar.e).B(f10, f11);
                try {
                    com.gamericefishpro.space.q1.d.j0(bVar4, b0Var.f, m0Var3, 0.0f, new com.gamericefishpro.space.q1.g(f3, 0.0f, 0, 0, 30), 52);
                    float f12 = 1;
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (bVar4.c() >> 32)) + f12) / Float.intBitsToFloat((int) (bVar4.c() >> 32));
                    float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (bVar4.c() & 4294967295L)) + f12) / Float.intBitsToFloat((int) (bVar4.c() & 4294967295L));
                    long jQ2 = bVar4.Q();
                    com.gamericefishpro.space.o1.f fVar2 = fVarE;
                    com.gamericefishpro.space.o1.b bVar5 = bVar;
                    long jO = cVar.o();
                    cVar.j().k();
                    try {
                        ((com.gamericefishpro.space.m.d) cVar.e).A(fIntBitsToFloat2, fIntBitsToFloat3, jQ2);
                        com.gamericefishpro.space.q1.d.j0(bVar4, hVar2, m0Var3, 0.0f, null, 28);
                        cVar.j().i();
                        cVar.H(jO);
                        ((com.gamericefishpro.space.m.d) cVar.e).B(-f10, -f11);
                        bVar5.i();
                        aVar.a = cVar2;
                        aVar.b = lVar;
                        aVar.c = qVar;
                        aVar.d = j4;
                        fVar2.a.prepareToDraw();
                        a0Var.d = fVar2;
                        return dVar.a(new Function1() { // from class: com.gamericefishpro.space.y.v
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                com.gamericefishpro.space.ei.a0 a0Var2 = a0Var;
                                long j5 = jCeil;
                                com.gamericefishpro.space.o1.k kVar3 = kVar2;
                                com.gamericefishpro.space.h2.h0 h0Var = (com.gamericefishpro.space.h2.h0) obj3;
                                h0Var.a();
                                com.gamericefishpro.space.n1.c cVar3 = cVarC;
                                float f13 = cVar3.a;
                                float f14 = cVar3.b;
                                com.gamericefishpro.space.q1.b bVar6 = h0Var.d;
                                ((com.gamericefishpro.space.m.d) bVar6.e.e).B(f13, f14);
                                try {
                                    com.gamericefishpro.space.q1.d.A(h0Var, (com.gamericefishpro.space.o1.f) a0Var2.d, j5, 0L, 0.0f, kVar3, 0, 890);
                                    return Unit.a;
                                } finally {
                                    ((com.gamericefishpro.space.m.d) bVar6.e.e).B(-f13, -f14);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        cVar.j().i();
                        cVar.H(jO);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ((com.gamericefishpro.space.m.d) cVar.e).B(-f10, -f11);
                    throw th2;
                }
            case 4:
                com.gamericefishpro.space.ei.w wVar2 = (com.gamericefishpro.space.ei.w) obj2;
                c2 c2Var = (c2) obj;
                if (wVar2.d) {
                    z2 = true;
                } else {
                    Intrinsics.c(c2Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    if (((com.gamericefishpro.space.z.y0) c2Var).H) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                wVar2.d = z2;
                return Boolean.valueOf(!z2);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.y.c1 c1Var = (com.gamericefishpro.space.y.c1) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                com.gamericefishpro.space.t0.c1 c1Var2 = c1Var.a;
                float fG = c1Var2.g() + fFloatValue + c1Var.f;
                float fB = com.gamericefishpro.space.ji.f.b(fG, 0.0f, c1Var.e.g());
                boolean z7 = fG == fB;
                float fG2 = fB - c1Var2.g();
                int iRound = Math.round(fG2);
                c1Var2.h(c1Var2.g() + iRound);
                c1Var.f = fG2 - iRound;
                if (!z7) {
                    fFloatValue = fG2;
                }
                return Float.valueOf(fFloatValue);
            default:
                com.gamericefishpro.space.z.q1 q1Var = (com.gamericefishpro.space.z.q1) obj2;
                return new com.gamericefishpro.space.n1.b(q1Var.c(q1Var.k, ((com.gamericefishpro.space.n1.b) obj).a, q1Var.j));
        }
    }

    public /* synthetic */ m1(com.gamericefishpro.space.xi.c cVar, com.gamericefishpro.space.xi.b bVar) {
        this.d = 2;
        this.e = cVar;
    }
}
