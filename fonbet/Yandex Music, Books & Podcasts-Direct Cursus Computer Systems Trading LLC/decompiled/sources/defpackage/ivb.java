package defpackage;

import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public abstract class ivb {
    public static final float a = 480;
    public static final agr b = new agr(new htb(1));

    public static final float a(hvb hvbVar) {
        hvbVar.getClass();
        boolean z = hvbVar instanceof evb;
        if (z && ((evb) hvbVar).e) {
            return 4;
        }
        if (z) {
            float f = cub.a;
            return cub.b * ((evb) hvbVar).d;
        }
        float f2 = cub.a;
        return cub.b;
    }

    public static final float b(hvb hvbVar) {
        hvbVar.getClass();
        if (hvbVar instanceof evb) {
            return cub.a * ((evb) hvbVar).d;
        }
        if (hvbVar instanceof fvb) {
            return cub.a * (((fvb) hvbVar).e.b ? 1.0f : 1.3f);
        }
        if (hvbVar instanceof dvb) {
            return cub.a;
        }
        b6e.s();
        return 0.0f;
    }

    public static final hvb c(float f, float f2, float f3, hq5 hq5Var) {
        Object obj;
        float F = tt0.F(hq5Var);
        WeakHashMap weakHashMap = rqv.w;
        float a2 = p6g.n(z7l.h(hq5Var).e, hq5Var).a();
        float f4 = 2;
        float f5 = f - (v0k.a * f4);
        float f6 = a;
        if (f5 > f6) {
            f5 = f6;
        }
        float a3 = h6h.a(hq5Var);
        float f7 = a3 + f5 + bub.a;
        float a4 = p6g.n(z7l.h(hq5Var).g, hq5Var).a();
        oq5 oq5Var = (oq5) hq5Var;
        boolean c = oq5Var.c(F) | oq5Var.c(f5) | oq5Var.c(a3) | oq5Var.c(f7) | oq5Var.c(f) | oq5Var.c(f2) | oq5Var.c(f3) | oq5Var.c(a4);
        Object K = oq5Var.K();
        if (c || K == gq5.a) {
            float f8 = cub.b;
            float f9 = F + f8;
            float f10 = f7 + f9;
            float f11 = h6h.b;
            float f12 = f9 + a3 + f11 + a2;
            boolean z = Float.compare(f2, f10) >= 0;
            boolean z2 = Float.compare(f2, f12) >= 0;
            float f13 = h6h.a;
            if (Float.compare(f, (24 * f4) + 24 + f13 + a3) >= 0 && z2 && Float.compare(f, f2) >= 0) {
                boolean z3 = Float.compare(f, (((float) 48) * f4) + ((((float) 48) + f13) + a3)) < 0;
                float f14 = cub.a;
                float f15 = (f14 * 1.3f) + F + f8;
                float f16 = cub.d;
                boolean z4 = Float.compare(f2 - (((f15 + f16) + f11) + a2), a3) < 0;
                lkv lkvVar = new lkv(z3, z4);
                float f17 = f2 - (((((f14 * (z4 ? 1.0f : 1.3f)) + (F + f8)) + f16) + f11) + a2);
                if (f17 >= a3) {
                    a3 = f17;
                }
                obj = new fvb(f - (lkvVar.a() * f4), f, f2, Math.min(((f - (lkvVar.a() * f4)) - f13) - (z3 ? 24 : 48), a3), lkvVar);
            } else if (z) {
                float f18 = cub.a;
                float f19 = f8 + f18;
                float f20 = ((f2 - ((f18 + f10) + f3)) + f19) / f19;
                obj = new evb(f5, f, f2, (1.0f > f20 || f20 > 2.0f) ? 1.0f : f20, Float.compare(f2 - f10, a4) < 0);
            } else {
                obj = dvb.a;
            }
            K = obj;
            oq5Var.k0(K);
        }
        return (hvb) K;
    }

    public static final hvb d(float f, float f2, float f3, hq5 hq5Var) {
        float F = tt0.F(hq5Var);
        float f4 = f - (v0k.a * 2);
        float f5 = a;
        float f6 = f4 > f5 ? f5 : f4;
        float a2 = h6h.a(hq5Var) + f6 + bub.a;
        WeakHashMap weakHashMap = rqv.w;
        float a3 = p6g.n(z7l.h(hq5Var).g, hq5Var).a();
        oq5 oq5Var = (oq5) hq5Var;
        boolean c = oq5Var.c(F) | oq5Var.c(f6) | oq5Var.c(a2) | oq5Var.c(f) | oq5Var.c(f2) | oq5Var.c(f3) | oq5Var.c(a3);
        Object K = oq5Var.K();
        if (c || K == gq5.a) {
            float f7 = cub.b;
            float f8 = cub.a;
            float f9 = f7 + f8;
            float f10 = F + a2 + f7;
            if (Float.compare(f2, f10) > 0) {
                float f11 = ((f2 - ((f8 + f10) + f3)) + f9) / f9;
                K = new evb(f6, f, f2, (1.0f > f11 || f11 > 2.0f) ? 1.0f : f11, Float.compare(f2 - f10, a3) < 0);
            } else {
                K = dvb.a;
            }
            oq5Var.k0(K);
        }
        return (hvb) K;
    }
}
