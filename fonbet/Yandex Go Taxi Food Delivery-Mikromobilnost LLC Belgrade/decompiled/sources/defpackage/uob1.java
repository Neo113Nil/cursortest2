package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.d;
import androidx.compose.ui.node.s;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class uob1 {
    public static final void a(float f, f530 f530Var, sls slsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1137787632);
        int i2 = i | (btsVar.b(f) ? 4 : 2) | 48 | (btsVar.e(slsVar) ? 256 : 128);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530Var2 = c530Var;
            vpa1.a(an91.o(c530Var, 0.0f, 8.0f, 8.0f, 8.0f, 1), false, ButtonSize.M, slsVar, wwg.S(469173888, true, new xvc(f, i3), btsVar), btsVar, ((i2 << 3) & 7168) | 24960, 2);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yvc(f, f530Var2, slsVar, i, 0);
        }
    }

    public static final void b(xp30 xp30Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(270903410);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(xp30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            cx20.a(null, null, null, null, null, false, false, wwg.S(-1893852088, true, new wg0(20, tlsVar), btsVar), wwg.S(97023360, true, new nfj(25, xp30Var, tlsVar), btsVar), btsVar, 113246208, HProv.PP_VERSION_TIMESTAMP);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(xp30Var, tlsVar, i, 15);
        }
    }

    public static final void c(vp30 vp30Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-900070087);
        int i2 = (btsVar.k(vp30Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(i9a1.d(c530Var), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            ovi0 ovi0Var = vp30Var.a;
            if (ovi0Var == null) {
                btsVar.e0(-201139849);
                btsVar.t(false);
            } else {
                btsVar.e0(-201139848);
                e(ovi0Var, btsVar, 0);
                btsVar.t(false);
            }
            oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
            String str = vp30Var.b;
            if (str == null) {
                btsVar.e0(-200972294);
                btsVar.t(false);
            } else {
                btsVar.e0(-200972293);
                g(str, btsVar, 0);
                btsVar.t(false);
            }
            oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
            String str2 = vp30Var.c;
            if (str2 == null) {
                btsVar.e0(-200804460);
                btsVar.t(false);
            } else {
                btsVar.e0(-200804459);
                f(str2, btsVar, 0);
                btsVar.t(false);
            }
            oeb1.c(btsVar, ljs0.e(c530Var, 24.0f));
            String str3 = vp30Var.d;
            if (str3 == null) {
                btsVar.e0(-200627078);
                btsVar.t(false);
            } else {
                btsVar.e0(-200627077);
                d(str3, tlsVar, btsVar, i2 & 112);
                btsVar.t(false);
            }
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            CharSequence charSequence = vp30Var.e;
            if (charSequence == null) {
                btsVar.e0(-200423439);
                btsVar.t(false);
            } else {
                btsVar.e0(-200423438);
                h(charSequence, tlsVar, btsVar, i2 & 112);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(vp30Var, tlsVar, i, 28);
        }
    }

    public static final void d(String str, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-460048171);
        int i2 = 2;
        int i3 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            f530 m = an91.m(ljs0.c(c530.a, 1.0f), 8.0f, 0.0f, 2);
            boolean z = (i3 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new kiu(24, tlsVar);
                btsVar.o0(Q);
            }
            ohb1.b(m, false, null, (sls) Q, wwg.S(-1379474558, true, new jk30(str, i2), btsVar), btsVar, 24582, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hp30(str, tlsVar, i, i4);
        }
    }

    public static final void e(ovi0 ovi0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-303893555);
        int i2 = (btsVar.k(ovi0Var) ? 4 : 2) | i;
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 c = ljs0.c(c530.a, 1.0f);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            v0b1.a(ovi0Var, null, null, null, null, null, null, null, 0.0f, 0, btsVar, i2 & 14, 1022);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gp30(ovi0Var, i, i3);
        }
    }

    public static final void f(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-694754590);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            jeb1.f(str, an91.m(c530.a, 16.0f, 0.0f, 2), AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).g.a, btsVar, (i2 & 14) | 432, 0, 16376);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 7);
        }
    }

    public static final void g(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-872494308);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            jeb1.f(str, ljs0.q(an91.m(c530.a, 16.0f, 0.0f, 2), 343.0f), AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).e.d, btsVar, (i2 & 14) | 432, 0, 16376);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 6);
        }
    }

    public static final void h(CharSequence charSequence, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1603727112);
        int i2 = i | (btsVar2.k(charSequence) ? 4 : 2) | (btsVar2.e(tlsVar) ? 32 : 16);
        int i3 = 18;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = ljs0.c(c530.a, 1.0f);
            ety0 a = ety0.a(xya1.e(btsVar2).h.a, tje.n(AppColor$Palette.TextMinor, btsVar2), 0L, null, null, null, 0L, null, null, null, 3, 0L, null, null, 16744446);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new adp(i3, tlsVar);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            qgy.b(charSequence, null, c, null, 0L, 0L, null, 0L, 0, Integer.MAX_VALUE, 0, a, (tls) Q, btsVar, (i2 & 14) | 384, 6, 3066);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ip30(charSequence, tlsVar, i, 0);
        }
    }

    public static final void i(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1348456134);
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 0.0f, 0.0f, 0.0f, 126.0f, 7);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            oeb1.c(btsVar, ljs0.e(c530Var, 26.0f));
            com.yandex.go.design.compose.loading.b.a(an91.o(ljs0.e(ljs0.c(c530Var, 1.0f), 20.0f), 16.0f, 0.0f, 80.0f, 0.0f, 10), cyk0.c(24.0f), false, null, null, null, false, btsVar, 6, 252);
            oeb1.c(btsVar, ljs0.e(c530Var, 26.0f));
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 72.0f), cyk0.c(24.0f), false, null, null, null, false, btsVar, 6, 252);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 72.0f), cyk0.c(24.0f), false, null, null, null, false, btsVar, 6, 252);
            ly3.B(c530Var, 16.0f, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i0z(i, 24);
        }
    }

    public static final qsi0 j(long j, long j2, long j3, long j4, long j5, zb4 zb4Var, float[] fArr) {
        s N = qje.N(zb4Var, 2);
        LayoutNode P = qje.P(zb4Var);
        boolean G = P.G();
        t300 t300Var = P.a0;
        if (!G) {
            return null;
        }
        if (((s) t300Var.e) == N) {
            return new qsi0(j, j2, j3, j4, j5, zb4Var, fArr);
        }
        float f = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        long floatToRawIntBits = (Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        long j6 = N.c;
        s sVar = (s) t300Var.e;
        sVar.getClass();
        long V = wwg.V(sVar.U(N, floatToRawIntBits));
        return new qsi0(V, (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & (((int) (V & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + ((int) (j6 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))) | ((((int) (V >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, zb4Var, fArr);
    }
}
