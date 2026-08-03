package i0;

import s.g0;
import x1.i0;
import yc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends p {
    public final g0 E;

    public c(y.i iVar, boolean z10, float f10, f8.c cVar, j0.o oVar) {
        super(iVar, z10, f10, cVar, oVar);
        this.E = new g0();
    }

    @Override // y0.m
    public final void k0() {
        this.E.a();
    }

    @Override // i0.p
    public final void r0(y.k kVar, long j3, float f10) {
        g0 g0Var = this.E;
        Object[] objArr = g0Var.f6267b;
        Object[] objArr2 = g0Var.f6268c;
        long[] jArr = g0Var.f6266a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j6 = jArr[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j6) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            j jVar = (j) objArr2[i13];
                            jVar.f2972k.setValue(Boolean.TRUE);
                            jVar.f2970i.S(ac.o.f277a);
                        }
                        j6 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        boolean z10 = this.f2988v;
        j jVar2 = new j(z10 ? new e1.b(kVar.f8414a) : null, f10, z10);
        g0Var.m(kVar, jVar2);
        a0.q(f0(), null, new c0.c(jVar2, this, kVar, null, 2), 3);
        x1.f.m(this);
    }

    @Override // i0.p
    public final void s0(i0 i0Var) {
        h1.b bVar;
        Object[] objArr;
        Object[] objArr2;
        int i10;
        int i11;
        h1.b bVar2;
        Object[] objArr3;
        Object[] objArr4;
        int i12;
        c cVar = this;
        h1.b bVar3 = i0Var.f8081g;
        cVar.f2991y.invoke();
        float f10 = 0.1f;
        if (0.1f == 0.0f) {
            return;
        }
        g0 g0Var = cVar.E;
        Object[] objArr5 = g0Var.f6267b;
        Object[] objArr6 = g0Var.f6268c;
        long[] jArr = g0Var.f6266a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j3 = jArr[i13];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                long j6 = j3;
                int i16 = 0;
                while (i16 < i15) {
                    if ((j6 & 255) < 128) {
                        int i17 = (i13 << 3) + i16;
                        Object obj = objArr5[i17];
                        j jVar = (j) objArr6[i17];
                        long b2 = f1.q.b(cVar.f2990x.q(), f10);
                        v.c cVar2 = jVar.f2969h;
                        if (jVar.f2965d == null) {
                            long d10 = bVar3.d();
                            float f11 = k.f2973a;
                            jVar.f2965d = Float.valueOf(Math.max(e1.e.d(d10), e1.e.b(d10)) * 0.3f);
                        }
                        if (jVar.f2962a == null) {
                            jVar.f2962a = new e1.b(bVar3.J());
                        }
                        if (jVar.f2966e == null) {
                            jVar.f2966e = new e1.b(v6.a.h(e1.e.d(bVar3.d()) / 2.0f, e1.e.b(bVar3.d()) / 2.0f));
                        }
                        float floatValue = (!((Boolean) jVar.f2972k.getValue()).booleanValue() || ((Boolean) jVar.f2971j.getValue()).booleanValue()) ? ((Number) jVar.f2967f.d()).floatValue() : 1.0f;
                        Float f12 = jVar.f2965d;
                        pc.j.b(f12);
                        float floatValue2 = f12.floatValue();
                        float f13 = jVar.f2963b;
                        float floatValue3 = ((Number) jVar.f2968g.d()).floatValue();
                        float f14 = floatValue;
                        float f15 = 1;
                        float f16 = (floatValue3 * f13) + ((f15 - floatValue3) * floatValue2);
                        e1.b bVar4 = jVar.f2962a;
                        pc.j.b(bVar4);
                        float d11 = e1.b.d(bVar4.f1929a);
                        e1.b bVar5 = jVar.f2966e;
                        pc.j.b(bVar5);
                        float d12 = e1.b.d(bVar5.f1929a);
                        float floatValue4 = ((Number) cVar2.d()).floatValue();
                        float f17 = (floatValue4 * d12) + ((f15 - floatValue4) * d11);
                        e1.b bVar6 = jVar.f2962a;
                        pc.j.b(bVar6);
                        int i18 = i15;
                        float e10 = e1.b.e(bVar6.f1929a);
                        e1.b bVar7 = jVar.f2966e;
                        pc.j.b(bVar7);
                        float e11 = e1.b.e(bVar7.f1929a);
                        float floatValue5 = ((Number) cVar2.d()).floatValue();
                        long h10 = v6.a.h(f17, (floatValue5 * e11) + ((f15 - floatValue5) * e10));
                        long b10 = f1.q.b(b2, f1.q.d(b2) * f14);
                        if (jVar.f2964c) {
                            float d13 = e1.e.d(bVar3.d());
                            float b11 = e1.e.b(bVar3.d());
                            a5.c cVar3 = bVar3.f2596h;
                            long x10 = cVar3.x();
                            cVar3.t().k();
                            ((a5.c) ((f8.c) cVar3.f262h).f2340h).t().d(0.0f, 0.0f, d13, b11, 1);
                            i10 = i16;
                            objArr3 = objArr5;
                            objArr4 = objArr6;
                            i11 = i18;
                            bVar2 = bVar3;
                            i12 = 8;
                            h1.d.c0(i0Var, b10, f16, h10, 120);
                            cVar3.t().g();
                            cVar3.Q(x10);
                        } else {
                            i10 = i16;
                            objArr3 = objArr5;
                            objArr4 = objArr6;
                            i11 = i18;
                            bVar2 = bVar3;
                            i12 = 8;
                            h1.d.c0(i0Var, b10, f16, h10, 120);
                        }
                    } else {
                        i10 = i16;
                        i11 = i15;
                        bVar2 = bVar3;
                        objArr3 = objArr5;
                        objArr4 = objArr6;
                        i12 = i14;
                    }
                    j6 >>= i12;
                    i16 = i10 + 1;
                    i15 = i11;
                    i14 = i12;
                    objArr5 = objArr3;
                    objArr6 = objArr4;
                    bVar3 = bVar2;
                    f10 = 0.1f;
                    cVar = this;
                }
                bVar = bVar3;
                objArr = objArr5;
                objArr2 = objArr6;
                if (i15 != i14) {
                    return;
                }
            } else {
                bVar = bVar3;
                objArr = objArr5;
                objArr2 = objArr6;
            }
            if (i13 == length) {
                return;
            }
            i13++;
            cVar = this;
            objArr5 = objArr;
            objArr6 = objArr2;
            bVar3 = bVar;
            f10 = 0.1f;
        }
    }

    @Override // i0.p
    public final void u0(y.k kVar) {
        j jVar = (j) this.E.g(kVar);
        if (jVar != null) {
            jVar.f2972k.setValue(Boolean.TRUE);
            jVar.f2970i.S(ac.o.f277a);
        }
    }
}
