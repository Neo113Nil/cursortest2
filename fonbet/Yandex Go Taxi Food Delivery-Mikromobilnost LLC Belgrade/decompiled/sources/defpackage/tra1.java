package defpackage;

import android.view.View;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes11.dex */
public abstract class tra1 {
    public static final void a(m5f m5fVar, sls slsVar, pa90 pa90Var, f530 f530Var, fid fidVar, int i) {
        wls wlsVar;
        sls slsVar2;
        c530 c530Var;
        wls wlsVar2;
        wls wlsVar3;
        wls wlsVar4;
        uo5 uo5Var;
        boolean z;
        m5f m5fVar2 = m5fVar;
        String str = m5fVar2.c;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1949511677);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(m5fVar2) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.e(pa90Var) ? 256 : 128) | (btsVar.k(f530Var) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            f530 n = ljs0.n(f530Var, 64.0f, 98.0f);
            qnm qnmVar = qnm.a;
            qnm.d.getClass();
            f530 m = an91.m(n, 0.0f, 8.0f, 1);
            sic a = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            wls wlsVar5 = d.f;
            qje.W(btsVar, wlsVar5, a);
            wls wlsVar6 = d.e;
            qje.W(btsVar, wlsVar6, o);
            wls wlsVar7 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar7);
            }
            wls wlsVar8 = d.d;
            qje.W(btsVar, wlsVar8, d);
            c530 c530Var2 = c530.a;
            f530 c = ljs0.c(an91.m(c530Var2, 8.0f, 0.0f, 2), 1.0f);
            uo5 uo5Var2 = x4c.b;
            z910 d2 = pi6.d(uo5Var2, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, c);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar5, d2);
            qje.W(btsVar, wlsVar6, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar7);
            }
            qje.W(btsVar, wlsVar8, d3);
            btsVar.e0(-223884175);
            int i3 = 3;
            if (str.length() > 0) {
                pa90 d4 = dya1.d(str, new uc0(pa90Var, 2), new uc0(pa90Var, i3), btsVar, 0);
                qnm.c.getClass();
                slsVar2 = slsVar3;
                wlsVar2 = wlsVar8;
                wlsVar3 = wlsVar7;
                wlsVar4 = wlsVar6;
                wlsVar = wlsVar5;
                uo5Var = uo5Var2;
                c530Var = c530Var2;
                o4b1.b(d4, null, ymb1.l(ljs0.m(c530Var2, 48.0f), cyk0.c(16.0f)), null, null, 0.0f, null, btsVar, 48, 120);
            } else {
                wlsVar = wlsVar5;
                slsVar2 = slsVar3;
                c530Var = c530Var2;
                wlsVar2 = wlsVar8;
                wlsVar3 = wlsVar7;
                wlsVar4 = wlsVar6;
                uo5Var = uo5Var2;
            }
            btsVar.t(false);
            f530 l = ymb1.l(c530Var, cyk0.a);
            qnm.c.getClass();
            f530 b = m4m0.b(cj6.a.a(ljs0.m(l, 20.0f), x4c.w), qnm.c(btsVar).a(), qke.q);
            btsVar.e0(-223860209);
            boolean z2 = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                z = false;
                Q = new zvr(0, slsVar);
                btsVar.o0(Q);
            } else {
                z = false;
            }
            btsVar.t(z);
            f530 d5 = q791.d(b, false, null, null, (sls) Q, 15);
            z910 d6 = pi6.d(uo5Var, z);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d7 = b.d(btsVar, d5);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d6);
            qje.W(btsVar, wlsVar4, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode3))) {
                b64.z(hashCode3, btsVar, hashCode3, wlsVar3);
            }
            qje.W(btsVar, wlsVar2, d7);
            o4b1.b(ba91.c(pnb1.a(), btsVar), null, an91.k(c530Var, 2.0f), null, null, 0.0f, new c36(qnm.c(btsVar).k0(), 5), btsVar, 56, 56);
            btsVar.t(true);
            btsVar.t(true);
            m5fVar2 = m5fVar;
            vqy0.c(m5fVar2.b, ljs0.c(c530Var, 1.0f), 0L, 0L, null, 0L, new sjy0(3), 0L, 2, false, 2, 0, ltm.b(btsVar).j(btsVar), btsVar, 48, 24960, 109564);
            btsVar = btsVar;
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0((Object) m5fVar2, f530Var, (Object) slsVar, (Object) pa90Var, i, 29);
        }
    }

    public static final f530 b(f530 f530Var, float f) {
        return f == 1.0f ? f530Var : androidx.compose.ui.graphics.d.c(f530Var, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, null, 520187);
    }

    public static uxk0 c(boolean z, View... viewArr) {
        return new uxk0(56, z, j73.d0(viewArr));
    }

    public static void d(int i, int i2) {
        String h;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                h = jsa1.h("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    ny61.g(oyr.i(i2, "negative size: "));
                    return;
                }
                h = jsa1.h("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(h);
        }
    }

    public static void e(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? f(i, i3, "start index") : (i2 < 0 || i2 > i3) ? f(i2, i3, "end index") : jsa1.h("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String f(int i, int i2, String str) {
        if (i < 0) {
            return jsa1.h("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return jsa1.h("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ny61.g(oyr.i(i2, "negative size: "));
        return null;
    }
}
