package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes11.dex */
public abstract class zhb1 {
    public static final void a(CharSequence charSequence, CharSequence charSequence2, String str, f530 f530Var, fid fidVar, int i) {
        c530 c530Var;
        boolean z;
        float f;
        float f2;
        c530 c530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-280100005);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(charSequence) ? 4 : 2) | (btsVar.k(charSequence2) ? 32 : 16) | (btsVar.k(str) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 c = bzk0.c(f530Var, AppColor$Palette.BgMinor, cyk0.c(24.0f));
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            c530 c530Var3 = c530.a;
            f530 c2 = ljs0.c(c530Var3, 1.0f);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, c2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            f530 o3 = an91.o(an91.m(c530Var3, 16.0f, 0.0f, 2), 0.0f, 40.0f, 0.0f, 0.0f, 13);
            lhl0 a2 = khl0.a(lr20.e, x4c.E, btsVar, 54);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d4 = b.d(btsVar, o3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o4);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d4);
            if (str == null || str.length() == 0) {
                c530Var = c530Var3;
                z = false;
                f = 0.0f;
                f2 = 24.0f;
                btsVar.e0(704992039);
                btsVar.t(false);
            } else {
                btsVar.e0(704820671);
                c530Var = c530Var3;
                z = false;
                f = 0.0f;
                f2 = 24.0f;
                v0b1.a(mja1.a(str, null, 6), ljs0.v(an91.o(c530Var3, 0.0f, 0.0f, 12.0f, 0.0f, 11), null, 3), null, null, null, null, null, null, 0.0f, 0, btsVar, 48, 1020);
                btsVar.t(false);
            }
            if (charSequence == null) {
                btsVar.e0(705017551);
                btsVar.t(z);
                c530Var2 = c530Var;
            } else {
                btsVar.e0(705017552);
                c530 c530Var4 = c530Var;
                c530Var2 = c530Var4;
                qgy.b(charSequence, null, an91.m(c530Var4, f, f2, 1), AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, ety0.a(xya1.e(btsVar).a.e, 0L, 0L, null, null, null, uh6.w(0.2d), null, null, null, 0, 0L, null, null, 16777087), null, btsVar, 3456, 0, 12274);
                btsVar = btsVar;
                z = false;
                btsVar.t(false);
            }
            boolean z2 = true;
            btsVar.t(true);
            btsVar.t(true);
            if (charSequence2 == null) {
                btsVar.e0(133812834);
                btsVar.t(z);
            } else {
                btsVar.e0(133812835);
                bts btsVar2 = btsVar;
                qgy.b(charSequence2, null, an91.o(an91.m(c530Var2, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 40.0f, 7), null, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, xya1.e(btsVar).g.a, null, btsVar2, 384, 0, 12154);
                btsVar = btsVar2;
                btsVar.t(false);
                z2 = true;
            }
            btsVar.t(z2);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0((Object) charSequence, f530Var, (Object) charSequence2, (Object) str, i, 13);
        }
    }

    public static final void b(String str, f530 f530Var, rs31 rs31Var, fid fidVar, int i, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(444753627);
        int i3 = i | (btsVar.k(str) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (((i3 | (btsVar.e(rs31Var) ? 256 : 128)) & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            c530 c530Var = c530.a;
            if (i4 != 0) {
                f530Var = c530Var;
            }
            if (btsVar.m(q1z.a) != null) {
                ny61.u();
                return;
            }
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            rkb1.a(ljs0.u(ljs0.c(c530Var, 1.0f), null, 3), btsVar, 6);
            btsVar.e0(-1988469066);
            rs31 a2 = rs31Var == null ? f5z.a(btsVar) : rs31Var;
            btsVar.t(false);
            btsVar.e0(-1988467085);
            if (a2 != null) {
                in91.a(a2, wwg.S(-2001685136, true, new vom(29), btsVar), btsVar, 48, 0);
            }
            btsVar.t(false);
            btsVar.t(true);
        }
        f530 f530Var2 = f530Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(str, f530Var2, rs31Var, i, i2, 20);
        }
    }

    public static final boolean c(int i, int i2) {
        return i == i2;
    }
}
