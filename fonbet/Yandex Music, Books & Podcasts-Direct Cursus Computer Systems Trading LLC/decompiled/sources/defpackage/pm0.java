package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class pm0 {
    public static final qs5 a = new qs5(new zb0(7));

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if ((r14 & 1) != 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Function2 function2, Function2 function22, hq5 hq5Var, int i, int i2) {
        function22.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1449757777);
        int i3 = (((i2 & 1) == 0 && oq5Var.h(function2)) ? 4 : 2) | i;
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                if ((i2 & 1) != 0) {
                    function2 = lm0.b;
                    i3 &= -15;
                }
                oq5Var.q();
                long j = ((d85) function2.invoke(oq5Var, Integer.valueOf(i3 & 14))).a;
                wje s = fgq.s(fgq.D("shimmerInfinite", oq5Var, 0), 0.05f, 0.1f, weo.C(weo.S(800, 0, null, 6), jyn.b, 0L, 4), "shimmerAlpha", oq5Var, 29112, 0);
                boolean e = oq5Var.e(j) | oq5Var.f(s);
                Object K = oq5Var.K();
                if (e || K == gq5.a) {
                    K = new mm0(j, s, 0);
                    oq5Var.k0(K);
                }
                etn.l(a.a((Function0) K), ild.C(1128155247, new im0(function22, 0), oq5Var), oq5Var, 56);
            } else {
                oq5Var.S();
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(function2, function22, i, i2);
        }
    }

    public static final void b(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1496036286);
        if ((i & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            long j = ((ma5) oq5Var.j(pa5.a)).g() ? d85.b : d85.f;
            boolean e = oq5Var.e(j);
            Object K = oq5Var.K();
            if (e || K == gq5.a) {
                K = new nm0(j, 0);
                oq5Var.k0(K);
            }
            etn.l(a.a((Function0) K), ild.C(1939003518, new j3(12), oq5Var), oq5Var, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new j3(i, 13);
        }
    }

    public static final void c(yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-940789537);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Function0 function0 = (Function0) oq5Var.j(a);
            long j = ((dq0) oq5Var.j(eq0.a)).c.c;
            boolean f = oq5Var.f(function0);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f || K == kjnVar) {
                K = new om0(function0, null, 0);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, function0, (Function2) K);
            boolean f2 = oq5Var.f(function0) | oq5Var.e(j);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                K2 = new mm0(function0, j);
                oq5Var.k0(K2);
            }
            ug3.a(wyf.t(yciVar, (Function0) K2), oq5Var, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(yciVar, i, 0);
        }
    }

    public static final void d(yci yciVar, ges gesVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(766352430);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (oq5Var.f(gesVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            yciVar2 = yciVar;
            e((i3 << 3) & 112, gesVar.a.b, gesVar.b.c, oq5Var, yciVar2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(i, 3, yciVar2, gesVar);
        }
    }

    public static final void e(int i, long j, long j2, hq5 hq5Var, yci yciVar) {
        int i2;
        long j3;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1100645558);
        if ((i & 6) == 0) {
            i2 = (oq5Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.e(j2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            j3 = j2;
            yciVar2 = yciVar;
        } else {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            sk3.m((i2 & 14) | 3072 | ((i2 >> 3) & 112) | ((i2 << 3) & 896), j, j2, oq5Var, yciVar);
            j3 = j2;
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new km0(j, yciVar2, j3, i);
        }
    }

    public static final wje f(hq5 hq5Var) {
        return fgq.s(fgq.D(null, hq5Var, 1), 1.0f, 0.5f, weo.C(weo.S(800, 0, null, 6), jyn.b, 0L, 4), null, hq5Var, 4536, 8);
    }
}
