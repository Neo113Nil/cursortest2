package com.gamericefishpro.space.u1;

import com.gamericefishpro.space.o1.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends c0 {
    public float[] b;
    public com.gamericefishpro.space.o1.h h;
    public Function1 i;
    public float l;
    public float m;
    public float n;
    public float q;
    public float r;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = com.gamericefishpro.space.o1.s.g;
    public List f = g0.a;
    public boolean g = true;
    public final com.gamericefishpro.space.b2.d0 j = new com.gamericefishpro.space.b2.d0(28, this);
    public String k = "";
    public float o = 1.0f;
    public float p = 1.0f;
    public boolean s = true;

    @Override // com.gamericefishpro.space.u1.c0
    public final void a(com.gamericefishpro.space.q1.d dVar) {
        if (this.s) {
            float[] fArrI = this.b;
            if (fArrI == null) {
                fArrI = com.gamericefishpro.space.o1.o.i();
                this.b = fArrI;
            } else {
                com.gamericefishpro.space.o1.o.s(fArrI);
            }
            com.gamericefishpro.space.o1.o.E(fArrI, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrI.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrI[0];
                float f3 = fArrI[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrI[1];
                float f8 = fArrI[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrI[2];
                float f12 = fArrI[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrI[3];
                float f16 = fArrI[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrI[0] = f4;
                fArrI[1] = f9;
                fArrI[2] = f13;
                fArrI[3] = f17;
                fArrI[4] = f6;
                fArrI[5] = f10;
                fArrI[6] = f14;
                fArrI[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.o;
            float f19 = this.p;
            if (fArrI.length >= 16) {
                fArrI[0] = fArrI[0] * f18;
                fArrI[1] = fArrI[1] * f18;
                fArrI[2] = fArrI[2] * f18;
                fArrI[3] = fArrI[3] * f18;
                fArrI[4] = fArrI[4] * f19;
                fArrI[5] = fArrI[5] * f19;
                fArrI[6] = fArrI[6] * f19;
                fArrI[7] = fArrI[7] * f19;
                fArrI[8] = fArrI[8] * 1.0f;
                fArrI[9] = fArrI[9] * 1.0f;
                fArrI[10] = fArrI[10] * 1.0f;
                fArrI[11] = fArrI[11] * 1.0f;
            }
            com.gamericefishpro.space.o1.o.E(fArrI, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                com.gamericefishpro.space.o1.h hVarA = this.h;
                if (hVarA == null) {
                    hVarA = com.gamericefishpro.space.o1.j.a();
                    this.h = hVarA;
                }
                b.e(this.f, hVarA);
            }
            this.g = false;
        }
        com.gamericefishpro.space.a8.c cVarX = dVar.x();
        long jO = cVarX.o();
        cVarX.j().k();
        try {
            com.gamericefishpro.space.a8.c cVar = (com.gamericefishpro.space.a8.c) ((com.gamericefishpro.space.m.d) cVarX.e).e;
            float[] fArr = this.b;
            if (fArr != null) {
                cVar.j().n(fArr);
            }
            com.gamericefishpro.space.o1.h hVar = this.h;
            if (!this.f.isEmpty() && hVar != null) {
                cVar.j().a(hVar);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((c0) arrayList.get(i)).a(dVar);
            }
        } finally {
            cVarX.j().i();
            cVarX.H(jO);
        }
    }

    @Override // com.gamericefishpro.space.u1.c0
    public final Function1 b() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.u1.c0
    public final void d(com.gamericefishpro.space.b2.d0 d0Var) {
        this.i = d0Var;
    }

    public final void e(int i, c0 c0Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, c0Var);
        } else {
            arrayList.add(c0Var);
        }
        g(c0Var);
        c0Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            com.gamericefishpro.space.ph.g0 g0Var = g0.a;
            if (com.gamericefishpro.space.o1.s.i(j2) == com.gamericefishpro.space.o1.s.i(j) && com.gamericefishpro.space.o1.s.h(j2) == com.gamericefishpro.space.o1.s.h(j) && com.gamericefishpro.space.o1.s.f(j2) == com.gamericefishpro.space.o1.s.f(j)) {
                return;
            }
            this.d = false;
            this.e = com.gamericefishpro.space.o1.s.g;
        }
    }

    public final void g(c0 c0Var) {
        if (!(c0Var instanceof h)) {
            if (c0Var instanceof c) {
                c cVar = (c) c0Var;
                if (cVar.d && this.d) {
                    f(cVar.e);
                    return;
                } else {
                    this.d = false;
                    this.e = com.gamericefishpro.space.o1.s.g;
                    return;
                }
            }
            return;
        }
        h hVar = (h) c0Var;
        com.gamericefishpro.space.o1.o oVar = hVar.b;
        if (this.d && oVar != null) {
            if (oVar instanceof m0) {
                f(((m0) oVar).f);
            } else {
                this.d = false;
                this.e = com.gamericefishpro.space.o1.s.g;
            }
        }
        com.gamericefishpro.space.o1.o oVar2 = hVar.g;
        if (this.d && oVar2 != null) {
            if (oVar2 instanceof m0) {
                f(((m0) oVar2).f);
            } else {
                this.d = false;
                this.e = com.gamericefishpro.space.o1.s.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c0 c0Var = (c0) arrayList.get(i);
            sb.append("\t");
            sb.append(c0Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
