package v1;

import m0.m2;
import m0.r1;
import m0.x1;
import x1.f1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i f7117a = new i(4);

    public static final void a(s0 s0Var, y0.n nVar, oc.e eVar, m0.r rVar, int i10) {
        rVar.Z(-511989831);
        int i11 = i10 | (rVar.h(s0Var) ? 4 : 2) | (rVar.f(nVar) ? 32 : 16) | (rVar.h(eVar) ? 256 : 128);
        if (rVar.P(i11 & 1, (i11 & 147) != 146)) {
            int hashCode = Long.hashCode(rVar.T);
            rVar.V(206, m0.t.f4761e);
            if (rVar.S) {
                m2.y(rVar.I);
            }
            Object E = rVar.E();
            m0.o oVar = E instanceof m0.o ? (m0.o) E : null;
            if (oVar == null) {
                oVar = new m0.o(new m0.p(rVar, rVar.T, rVar.f4737q, rVar.C, rVar.f4728h.f4830x));
                rVar.j0(oVar);
            }
            m0.p pVar = oVar.f4688g;
            pVar.f4702f.setValue(rVar.l());
            rVar.q(false);
            y0.n o7 = uc.e.o(rVar, nVar);
            r1 l10 = rVar.l();
            rVar.b0();
            if (rVar.S) {
                rVar.k(x1.z.f8222g);
            } else {
                rVar.l0();
            }
            m0.z.w(s0Var, rVar, s0Var.f7125c);
            m0.z.w(pVar, rVar, s0Var.f7126d);
            m0.z.w(eVar, rVar, s0Var.f7127e);
            x1.j.f8084f.getClass();
            m0.z.w(l10, rVar, x1.i.f8078d);
            m0.z.w(o7, rVar, x1.i.f8077c);
            x1.h hVar = x1.i.f8080f;
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar, hashCode, hVar);
            }
            rVar.q(true);
            if (rVar.B()) {
                rVar.X(-1259216055);
                rVar.q(false);
            } else {
                rVar.X(-1259274676);
                boolean h10 = rVar.h(s0Var);
                Object M = rVar.M();
                if (h10 || M == m0.l.f4646a) {
                    M = new b0.p0(16, s0Var);
                    rVar.i0(M);
                }
                m0.z.g((oc.a) M, rVar);
                rVar.q(false);
            }
        } else {
            rVar.S();
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new j5.e(s0Var, nVar, eVar, i10, 3);
        }
    }

    public static final float b(long j3, long j6) {
        return Math.min(Float.intBitsToFloat((int) (j6 >> 32)) / Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)) / Float.intBitsToFloat((int) (j3 & 4294967295L)));
    }

    public static final float c(i0 i0Var, boolean z10, m[] mVarArr, float f10) {
        float f11 = Float.NaN;
        for (m mVar : mVarArr) {
            float b2 = i0Var.b(mVar);
            if (!Float.isNaN(f11)) {
                int i10 = z10 != (b2 > f11) ? i10 + 1 : 0;
            }
            f11 = b2;
        }
        return Float.isNaN(f11) ? f10 : f11;
    }

    public static final e1.c d(p pVar) {
        p i10 = pVar.i();
        return i10 != null ? i10.C(pVar, true) : new e1.c(0.0f, 0.0f, (int) (pVar.E() >> 32), (int) (pVar.E() & 4294967295L));
    }

    public static final e1.c e(f1 f1Var) {
        p g8 = g(f1Var);
        float E = (int) (g8.E() >> 32);
        float E2 = (int) (g8.E() & 4294967295L);
        e1.c C = g8.C(f1Var, true);
        float f10 = C.f1931a;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > E) {
            f10 = E;
        }
        float f11 = C.f1932b;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > E2) {
            f11 = E2;
        }
        float f12 = C.f1933c;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 <= E) {
            E = f12;
        }
        float f13 = C.f1934d;
        float f14 = f13 >= 0.0f ? f13 : 0.0f;
        if (f14 <= E2) {
            E2 = f14;
        }
        if (f10 == E || f11 == E2) {
            return e1.c.f1930e;
        }
        long f15 = g8.f((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
        long f16 = g8.f((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(E) << 32));
        long f17 = g8.f((Float.floatToRawIntBits(E) << 32) | (Float.floatToRawIntBits(E2) & 4294967295L));
        long f18 = g8.f((Float.floatToRawIntBits(E2) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (f15 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (f16 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (f18 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (f17 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (f15 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (f16 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (f18 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (f17 & 4294967295L));
        return new e1.c(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final boolean f(long j3, long j6) {
        return j3 == j6;
    }

    public static final p g(p pVar) {
        p pVar2;
        p i10 = pVar.i();
        while (true) {
            p pVar3 = i10;
            pVar2 = pVar;
            pVar = pVar3;
            if (pVar == null) {
                break;
            }
            i10 = pVar.i();
        }
        f1 f1Var = pVar2 instanceof f1 ? (f1) pVar2 : null;
        if (f1Var == null) {
            return pVar2;
        }
        f1 f1Var2 = f1Var.f8035w;
        while (true) {
            f1 f1Var3 = f1Var2;
            f1 f1Var4 = f1Var;
            f1Var = f1Var3;
            if (f1Var == null) {
                return f1Var4;
            }
            f1Var2 = f1Var.f8035w;
        }
    }

    public static final x1.p0 h(x1.p0 p0Var) {
        x1.g0 g0Var = p0Var.f8141u.f8033u;
        while (true) {
            x1.g0 s10 = g0Var.s();
            x1.g0 g0Var2 = null;
            if ((s10 != null ? s10.f8047m : null) == null) {
                x1.p0 z02 = g0Var.I.f7989d.z0();
                pc.j.b(z02);
                return z02;
            }
            x1.g0 s11 = g0Var.s();
            if (s11 != null) {
                g0Var2 = s11.f8047m;
            }
            pc.j.b(g0Var2);
            x1.g0 s12 = g0Var.s();
            pc.j.b(s12);
            g0Var = s12.f8047m;
            pc.j.b(g0Var);
        }
    }

    public static final long i(long j3, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) * Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) * Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
