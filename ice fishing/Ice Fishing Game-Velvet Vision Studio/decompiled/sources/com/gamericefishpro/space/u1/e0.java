package com.gamericefishpro.space.u1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.gamericefishpro.space.t0.f1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends c0 {
    public final c b;
    public String c;
    public boolean d;
    public final a e;
    public com.gamericefishpro.space.ei.l f;
    public final f1 g;
    public com.gamericefishpro.space.o1.k h;
    public final f1 i;
    public long j;
    public float k;
    public float l;
    public final d0 m;

    public e0(c cVar) {
        this.b = cVar;
        cVar.i = new d0(this, 0);
        this.c = "";
        this.d = true;
        this.e = new a();
        this.f = g.i;
        this.g = com.gamericefishpro.space.t0.i.v(null);
        this.i = com.gamericefishpro.space.t0.i.v(new com.gamericefishpro.space.n1.e(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new d0(this, 1);
    }

    @Override // com.gamericefishpro.space.u1.c0
    public final void a(com.gamericefishpro.space.q1.d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:51:0x010b  */
    public final void e(com.gamericefishpro.space.q1.d dVar, float f, com.gamericefishpro.space.o1.k kVar) {
        int i;
        com.gamericefishpro.space.o1.k kVar2;
        com.gamericefishpro.space.o1.f fVarE;
        char c;
        long j;
        long jC;
        int i2;
        int i3;
        com.gamericefishpro.space.o1.k kVar3 = kVar;
        c cVar = this.b;
        boolean z = cVar.d;
        f1 f1Var = this.g;
        if (!z || cVar.e == 16) {
            i = 0;
        } else {
            com.gamericefishpro.space.o1.k kVar4 = (com.gamericefishpro.space.o1.k) f1Var.getValue();
            com.gamericefishpro.space.ph.g0 g0Var = g0.a;
            if (!(kVar4 instanceof com.gamericefishpro.space.o1.k) ? kVar4 == null : (i3 = kVar4.c) == 5 || i3 == 3) {
                i = 0;
            } else if (!(kVar3 instanceof com.gamericefishpro.space.o1.k) ? kVar3 == null : (i2 = kVar3.c) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.d;
        a aVar = this.e;
        if (z2 || !com.gamericefishpro.space.n1.e.a(this.j, dVar.c())) {
            if (i == 1) {
                jC = cVar.e;
                com.gamericefishpro.space.ph.g0 g0Var2 = g0.a;
                if (com.gamericefishpro.space.o1.s.e(jC) != 1.0f) {
                    jC = com.gamericefishpro.space.o1.s.c(jC, 1.0f);
                }
                kVar2 = new com.gamericefishpro.space.o1.k(5, jC);
            } else {
                kVar2 = null;
            }
            this.h = kVar2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.c() >> 32));
            f1 f1Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((com.gamericefishpro.space.n1.e) f1Var2.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (dVar.c() & 4294967295L)) / Float.intBitsToFloat((int) (((com.gamericefishpro.space.n1.e) f1Var2.getValue()).a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.c() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.c() & 4294967295L))))) & 4294967295L);
            com.gamericefishpro.space.c3.l layoutDirection = dVar.getLayoutDirection();
            fVarE = aVar.a;
            com.gamericefishpro.space.o1.b bVar = aVar.b;
            if (fVarE != null || bVar == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i4 = (int) (jCeil >> 32);
                Bitmap bitmap = fVarE.a;
                c = ' ';
                j = 4294967295L;
                if (i4 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || aVar.d != i) {
                }
                aVar.c = jCeil;
                com.gamericefishpro.space.q1.b bVar2 = aVar.e;
                long jQ = com.gamericefishpro.space.d9.h.Q(jCeil);
                com.gamericefishpro.space.q1.a aVar2 = bVar2.d;
                com.gamericefishpro.space.c3.c cVar2 = aVar2.a;
                com.gamericefishpro.space.c3.l lVar = aVar2.b;
                com.gamericefishpro.space.o1.q qVar = aVar2.c;
                com.gamericefishpro.space.o1.b bVar3 = bVar;
                long j2 = aVar2.d;
                aVar2.a = dVar;
                aVar2.b = layoutDirection;
                aVar2.c = bVar3;
                aVar2.d = jQ;
                bVar3.k();
                com.gamericefishpro.space.q1.d.w(bVar2, com.gamericefishpro.space.o1.s.b, 0L, 62);
                this.m.invoke(bVar2);
                bVar3.i();
                com.gamericefishpro.space.q1.a aVar3 = bVar2.d;
                aVar3.a = cVar2;
                aVar3.b = lVar;
                aVar3.c = qVar;
                aVar3.d = j2;
                fVarE.a.prepareToDraw();
                this.d = false;
                this.j = dVar.c();
            }
            fVarE = com.gamericefishpro.space.o1.o.e((int) (jCeil >> c), (int) (jCeil & j), i);
            Canvas canvas = com.gamericefishpro.space.o1.c.a;
            bVar = new com.gamericefishpro.space.o1.b();
            bVar.a = new Canvas(fVarE.a);
            aVar.a = fVarE;
            aVar.b = bVar;
            aVar.d = i;
            aVar.c = jCeil;
            com.gamericefishpro.space.q1.b bVar4 = aVar.e;
            long jQ2 = com.gamericefishpro.space.d9.h.Q(jCeil);
            com.gamericefishpro.space.q1.a aVar4 = bVar4.d;
            com.gamericefishpro.space.c3.c cVar3 = aVar4.a;
            com.gamericefishpro.space.c3.l lVar2 = aVar4.b;
            com.gamericefishpro.space.o1.q qVar2 = aVar4.c;
            com.gamericefishpro.space.o1.b bVar5 = bVar;
            long j3 = aVar4.d;
            aVar4.a = dVar;
            aVar4.b = layoutDirection;
            aVar4.c = bVar5;
            aVar4.d = jQ2;
            bVar5.k();
            com.gamericefishpro.space.q1.d.w(bVar4, com.gamericefishpro.space.o1.s.b, 0L, 62);
            this.m.invoke(bVar4);
            bVar5.i();
            com.gamericefishpro.space.q1.a aVar5 = bVar4.d;
            aVar5.a = cVar3;
            aVar5.b = lVar2;
            aVar5.c = qVar2;
            aVar5.d = j3;
            fVarE.a.prepareToDraw();
            this.d = false;
            this.j = dVar.c();
        } else {
            com.gamericefishpro.space.o1.f fVar = aVar.a;
            if (i != (fVar != null ? fVar.a() : 0)) {
                if (i == 1) {
                    jC = cVar.e;
                    com.gamericefishpro.space.ph.g0 g0Var3 = g0.a;
                    if (com.gamericefishpro.space.o1.s.e(jC) != 1.0f) {
                        jC = com.gamericefishpro.space.o1.s.c(jC, 1.0f);
                    }
                    kVar2 = new com.gamericefishpro.space.o1.k(5, jC);
                } else {
                    kVar2 = null;
                }
                this.h = kVar2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.c() >> 32));
                f1 f1Var3 = this.i;
                this.k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((com.gamericefishpro.space.n1.e) f1Var3.getValue()).a >> 32));
                this.l = Float.intBitsToFloat((int) (dVar.c() & 4294967295L)) / Float.intBitsToFloat((int) (((com.gamericefishpro.space.n1.e) f1Var3.getValue()).a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.c() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.c() & 4294967295L))))) & 4294967295L);
                com.gamericefishpro.space.c3.l layoutDirection2 = dVar.getLayoutDirection();
                fVarE = aVar.a;
                com.gamericefishpro.space.o1.b bVar6 = aVar.b;
                if (fVarE != null) {
                    c = ' ';
                    j = 4294967295L;
                    fVarE = com.gamericefishpro.space.o1.o.e((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    Canvas canvas2 = com.gamericefishpro.space.o1.c.a;
                    bVar6 = new com.gamericefishpro.space.o1.b();
                    bVar6.a = new Canvas(fVarE.a);
                    aVar.a = fVarE;
                    aVar.b = bVar6;
                    aVar.d = i;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    fVarE = com.gamericefishpro.space.o1.o.e((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    Canvas canvas3 = com.gamericefishpro.space.o1.c.a;
                    bVar6 = new com.gamericefishpro.space.o1.b();
                    bVar6.a = new Canvas(fVarE.a);
                    aVar.a = fVarE;
                    aVar.b = bVar6;
                    aVar.d = i;
                }
                aVar.c = jCeil2;
                com.gamericefishpro.space.q1.b bVar7 = aVar.e;
                long jQ3 = com.gamericefishpro.space.d9.h.Q(jCeil2);
                com.gamericefishpro.space.q1.a aVar6 = bVar7.d;
                com.gamericefishpro.space.c3.c cVar4 = aVar6.a;
                com.gamericefishpro.space.c3.l lVar3 = aVar6.b;
                com.gamericefishpro.space.o1.q qVar3 = aVar6.c;
                com.gamericefishpro.space.o1.b bVar8 = bVar6;
                long j4 = aVar6.d;
                aVar6.a = dVar;
                aVar6.b = layoutDirection2;
                aVar6.c = bVar8;
                aVar6.d = jQ3;
                bVar8.k();
                com.gamericefishpro.space.q1.d.w(bVar7, com.gamericefishpro.space.o1.s.b, 0L, 62);
                this.m.invoke(bVar7);
                bVar8.i();
                com.gamericefishpro.space.q1.a aVar7 = bVar7.d;
                aVar7.a = cVar4;
                aVar7.b = lVar3;
                aVar7.c = qVar3;
                aVar7.d = j4;
                fVarE.a.prepareToDraw();
                this.d = false;
                this.j = dVar.c();
            }
        }
        if (kVar3 == null) {
            kVar3 = ((com.gamericefishpro.space.o1.k) f1Var.getValue()) != null ? (com.gamericefishpro.space.o1.k) f1Var.getValue() : this.h;
        }
        com.gamericefishpro.space.o1.k kVar5 = kVar3;
        com.gamericefishpro.space.o1.f fVar2 = aVar.a;
        if (fVar2 == null) {
            com.gamericefishpro.space.e2.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        com.gamericefishpro.space.q1.d.A(dVar, fVar2, aVar.c, 0L, f, kVar5, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        f1 f1Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((com.gamericefishpro.space.n1.e) f1Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((com.gamericefishpro.space.n1.e) f1Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
