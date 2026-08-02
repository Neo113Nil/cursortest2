package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.check.CheckState;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class vpb1 {
    public static final void a(f530 f530Var, CharSequence charSequence, String str, List list, tls tlsVar, fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(72898109);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(charSequence) ? 32 : 16) | (btsVar.k(str) ? 256 : 128) | (btsVar.k(list) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            f530 k = an91.k(f530Var, 8.0f);
            boolean c = btsVar.c(2) | btsVar.b(4.0f) | btsVar.a(false);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (c || Q == o430Var) {
                Q = new jg0(23);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            if (charSequence == null) {
                btsVar.e0(-2053106810);
                btsVar.t(false);
                z = true;
            } else {
                btsVar.e0(-2053106809);
                boolean z2 = ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((i2 & 896) == 256);
                Object Q2 = btsVar.Q();
                if (z2 || Q2 == o430Var) {
                    Q2 = new b700(9, tlsVar, str, list);
                    btsVar.o0(Q2);
                }
                z = true;
                ohb1.b(null, false, null, (sls) Q2, wwg.S(787487105, true, new or9(10, charSequence), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0((Object) f530Var, (Object) charSequence, (Object) str, (Object) list, (Object) tlsVar, i, 23);
        }
    }

    public static final void b(ci40 ci40Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1599405297);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ci40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 23;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(233081459, true, new ut9(i3, tlsVar, ci40Var), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(ci40Var, tlsVar, i, i3);
        }
    }

    public static final void c(ph40 ph40Var, String str, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1002412153);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(ph40Var) ? 4 : 2) | (btsVar.k(str) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            String str2 = ph40Var.f;
            boolean z = ph40Var.e;
            CharSequence charSequence = ph40Var.c;
            boolean l = jl40.l(str2, str);
            boolean a = btsVar.a(l);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (a || Q == o430Var) {
                Q = new yce(l, 10);
                btsVar.o0(Q);
            }
            c530 c530Var = c530.a;
            f530 c = q6a1.c(fnq0.b(c530Var, false, (tls) Q), charSequence == null || charSequence.length() == 0);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new ve30(17, ph40Var, tlsVar);
                btsVar.o0(Q2);
            }
            f530 n = an91.n(m4m0.b(ljs0.c(q791.d(c, false, null, null, (sls) Q2, 15), 1.0f), tje.n(AppColor$Palette.BgMinor, btsVar), cyk0.c(24.0f)), 16.0f, 8.0f, 8.0f, 16.0f);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, n);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 c2 = ljs0.c(c530Var, 1.0f);
            lhl0 a3 = khl0.a(lr20.g, x4c.D, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, c2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            f530 o3 = an91.o(n.d(btsVar, d2, wlsVar4, 1.0f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            sic a4 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d3 = b.d(btsVar, o3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a4);
            qje.W(btsVar, wlsVar2, o4);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d3);
            i(ph40Var.a, charSequence == null || charSequence.length() == 0, btsVar, 0);
            f(charSequence, btsVar, 0);
            btsVar.t(true);
            h(ph40Var.d, z, l, btsVar, 0);
            btsVar.t(true);
            if (charSequence == null || charSequence.length() == 0) {
                btsVar.e0(-1248379757);
                btsVar.t(false);
            } else {
                tse0.s(btsVar, 1899390258, c530Var, 8.0f, btsVar);
                btsVar.t(false);
            }
            e(ph40Var.b, z, btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240((Object) ph40Var, (Object) str, tlsVar, i, 9);
        }
    }

    public static final void d(final boolean z, fid fidVar, final int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1942101464);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            xkb1.a(z ? CheckState.Checked : CheckState.Unchecked, ymb1.l(c530.a, cyk0.a), null, null, false, btsVar, 0, 28);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: uh40
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int O = vng.O(i | 1);
                    vpb1.d(z, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void e(CharSequence charSequence, boolean z, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(105004823);
        int i2 = i | (btsVar2.k(charSequence) ? 4 : 2) | (btsVar2.a(z) ? 32 : 16);
        if (!btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar = btsVar2;
            btsVar.Y();
        } else if (charSequence == null) {
            btsVar2.e0(1462593240);
            btsVar2.t(false);
            btsVar = btsVar2;
        } else {
            btsVar2.e0(1462593241);
            qgy.b(charSequence, null, q6a1.c(c530.a, z), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).h.a, null, btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 0, 12274);
            btsVar = btsVar2;
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qn1(charSequence, z, i, 2);
        }
    }

    public static final void f(CharSequence charSequence, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1957648703);
        int i2 = i | (btsVar.k(charSequence) ? 4 : 2);
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else if (charSequence == null) {
            btsVar.e0(-1048340798);
            btsVar.t(false);
        } else {
            btsVar.e0(-1048340797);
            qgy.b(charSequence, null, null, AppColor$Palette.Error, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).h.a, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
            btsVar = btsVar;
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 20, charSequence);
        }
    }

    public static final void g(CharSequence charSequence, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1391256576);
        int i2 = i | (btsVar.k(charSequence) ? 4 : 2);
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else if (charSequence == null) {
            btsVar.e0(490310597);
            btsVar.t(false);
        } else {
            btsVar.e0(490310598);
            qgy.b(charSequence, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).g.a, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
            btsVar = btsVar;
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 21, charSequence);
        }
    }

    public static final void h(CharSequence charSequence, boolean z, boolean z2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(81635066);
        int i2 = (btsVar.k(charSequence) ? 4 : 2) | i | (btsVar.a(z) ? 32 : 16) | (btsVar.a(z2) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 c = q6a1.c(c530Var, z);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            g(charSequence, btsVar, i2 & 14);
            if (charSequence != null) {
                btsVar.e0(-1531002436);
                oeb1.c(btsVar, ljs0.q(c530Var, 8.0f));
                btsVar.t(false);
            } else {
                btsVar.e0(-1530925556);
                btsVar.t(false);
            }
            d(z2, btsVar, (i2 >> 6) & 14);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new u240(charSequence, z, z2, i, 1);
        }
    }

    public static final void i(CharSequence charSequence, boolean z, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2085073997);
        int i2 = i | (btsVar2.k(charSequence) ? 4 : 2) | (btsVar2.a(z) ? 32 : 16);
        if (!btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar = btsVar2;
            btsVar.Y();
        } else if (charSequence == null) {
            btsVar2.e0(1672641773);
            btsVar2.t(false);
            btsVar = btsVar2;
        } else {
            btsVar2.e0(1672641774);
            qgy.b(charSequence, null, an91.o(c530.a, 0.0f, z ? 8.0f : 0.0f, 0.0f, 0.0f, 13), AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).g.a, null, btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 0, 12274);
            btsVar = btsVar2;
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qn1(charSequence, z, i, 1);
        }
    }

    public static final void j(int i, fid fidVar, tls tlsVar, String str, List list) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-652216631);
        int i2 = i | (btsVar.k(list) ? 4 : 2) | (btsVar.k(str) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            i43 i43Var = new i43(8.0f, true, new quz(11));
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new th40(i3, list, str, tlsVar);
                btsVar.o0(Q);
            }
            adb1.a(c530.a, null, null, i43Var, null, null, false, null, (tls) Q, btsVar, 24582, 494);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240((Object) list, (Object) str, tlsVar, i, 8);
        }
    }

    public static final void k(CharSequence charSequence, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1546092710);
        int i2 = i | (btsVar.k(charSequence) ? 4 : 2);
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else if (charSequence == null) {
            btsVar.e0(418692736);
            btsVar.t(false);
        } else {
            btsVar.e0(418692737);
            qgy.b(charSequence, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).f.c, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
            btsVar = btsVar;
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 19, charSequence);
        }
    }

    public static final String l(xe7 xe7Var) {
        if (xe7Var.equals(ue7.a)) {
            return "asap";
        }
        if (xe7Var.equals(we7.a)) {
            return "ondemand";
        }
        if (xe7Var instanceof ve7) {
            return String.valueOf(((ve7) xe7Var).a.getTimeInMillis() / 1000);
        }
        w511.b();
        return null;
    }
}
