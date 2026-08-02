package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.numeric_input;

import androidx.compose.runtime.f;
import defpackage.a6t0;
import defpackage.a7u0;
import defpackage.aab1;
import defpackage.aii0;
import defpackage.an51;
import defpackage.an91;
import defpackage.b0;
import defpackage.b64;
import defpackage.bo60;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.co60;
import defpackage.did;
import defpackage.eja1;
import defpackage.el51;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.gi91;
import defpackage.gl51;
import defpackage.hoy0;
import defpackage.ivy;
import defpackage.jl40;
import defpackage.ljs0;
import defpackage.lkx;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.m4m0;
import defpackage.mb;
import defpackage.ne5;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.q791;
import defpackage.qic;
import defpackage.qje;
import defpackage.qm51;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.v4v;
import defpackage.vfc;
import defpackage.vqy;
import defpackage.web1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.y740;
import defpackage.ymb1;
import defpackage.yur;
import defpackage.zgb1;
import defpackage.zl50;
import defpackage.zm51;
import defpackage.zpn;
import defpackage.zx40;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(co60 co60Var, wls wlsVar, wls wlsVar2, fid fidVar, int i) {
        int i2;
        wls wlsVar3;
        wls wlsVar4;
        oz40 oz40Var;
        int i3;
        f530 f530Var;
        boolean z;
        boolean z2;
        androidx.compose.runtime.internal.a aVar;
        long n;
        String str = co60Var.c;
        CharSequence charSequence = co60Var.f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1776778400);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(co60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            wlsVar3 = wlsVar;
            i2 |= btsVar.e(wlsVar3) ? 32 : 16;
        } else {
            wlsVar3 = wlsVar;
        }
        if ((i & 384) == 0) {
            wlsVar4 = wlsVar2;
            i2 |= btsVar.e(wlsVar4) ? 256 : 128;
        } else {
            wlsVar4 = wlsVar2;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean k = btsVar.k(str);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (k || Q == obj) {
                int length = str.length();
                Q = f.j(new hoy0(str, eja1.c(length, length), 4));
                btsVar.o0(Q);
            }
            oz40 oz40Var2 = (oz40) Q;
            int i4 = i2 & 14;
            boolean z3 = i4 == 4;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == obj) {
                oz40Var = oz40Var2;
                vqy vqyVar = new vqy(wlsVar4, co60Var, wlsVar3, oz40Var, 11);
                btsVar.o0(vqyVar);
                Q2 = vqyVar;
            } else {
                oz40Var = oz40Var2;
            }
            tls tlsVar = (tls) Q2;
            Object Q3 = btsVar.Q();
            if (Q3 == obj) {
                Q3 = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q3;
            oz40 b = androidx.compose.foundation.interaction.a.b(zx40Var, btsVar, 6);
            Object Q4 = btsVar.Q();
            if (Q4 == obj) {
                Q4 = vfc.g(btsVar);
            }
            yur yurVar = (yur) Q4;
            boolean booleanValue = ((Boolean) b.getValue()).booleanValue();
            c530 c530Var = c530.a;
            if (booleanValue) {
                btsVar.e0(-827440646);
                if (charSequence != null) {
                    btsVar.e0(-827336982);
                    n = ((el51) btsVar.m(gl51.a)).h();
                    btsVar.t(false);
                } else {
                    btsVar.e0(-827275385);
                    n = ((el51) btsVar.m(gl51.a)).n();
                    btsVar.t(false);
                }
                i3 = i4;
                f530Var = aab1.a(2.0f, n, c530Var, ((YandexShapes) btsVar.m(qm51.a)).b());
                btsVar.t(false);
            } else {
                i3 = i4;
                btsVar.e0(1912980392);
                btsVar.t(false);
                f530Var = c530Var;
            }
            f530 m = an91.m(c530Var, 16.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar5 = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar5);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            int i5 = i3;
            boolean k2 = (i5 == 4) | btsVar.k(oz40Var);
            Object Q5 = btsVar.Q();
            if (k2 || Q5 == obj) {
                Q5 = new zl50(7, co60Var, oz40Var);
                btsVar.o0(Q5);
            }
            f530 a2 = fnq0.a(f530Var, (tls) Q5);
            oz40 oz40Var3 = oz40Var;
            f530 b2 = m4m0.b(a2, ((el51) btsVar.m(gl51.a)).g(), ((YandexShapes) btsVar.m(qm51.a)).b());
            Object Q6 = btsVar.Q();
            if (Q6 == obj) {
                Q6 = new bo60(yurVar, 0);
                btsVar.o0(Q6);
            }
            f530 b3 = q791.b(b2, zx40Var, null, false, null, null, (sls) Q6, 28);
            v4v v4vVar = co60Var.g;
            if (v4vVar == null) {
                btsVar.e0(-1595202578);
                z = false;
                btsVar.t(false);
                z2 = true;
                aVar = null;
            } else {
                z = false;
                btsVar.e0(-1595202577);
                z2 = true;
                androidx.compose.runtime.internal.a S = wwg.S(106372033, true, new mb(v4vVar, 16), btsVar);
                btsVar.t(false);
                aVar = S;
            }
            boolean z4 = z;
            web1.c(b3, 0.0f, false, 0.0f, null, aVar, wwg.S(2082470086, z2, new b0(tlsVar, co60Var, yurVar, zx40Var, oz40Var3), btsVar), null, null, null, null, null, false, btsVar, 1572864, 0, 8094);
            btsVar = btsVar;
            if (charSequence == null) {
                btsVar.e0(-1594736648);
                btsVar.t(z4);
            } else {
                btsVar.e0(-1594736647);
                zgb1.a(charSequence, an91.m(c530Var, 16.0f, 0.0f, 2), 0, false, null, null, false, null, btsVar, 48, 252);
                btsVar.t(z4);
            }
            btsVar.t(true);
            Boolean valueOf = Boolean.valueOf(co60Var.h);
            boolean k3 = btsVar.k(oz40Var3) | (i5 == 4 ? true : z4);
            Object Q7 = btsVar.Q();
            if (k3 || Q7 == obj) {
                Q7 = new NumericInputKt$NumericInputContent$2$1(co60Var, yurVar, oz40Var3, null);
                btsVar.o0(Q7);
            }
            zpn.e(btsVar, (wls) Q7, valueOf);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(co60Var, wlsVar, wlsVar2, i, 20);
        }
    }

    public static final void b(hoy0 hoy0Var, tls tlsVar, co60 co60Var, yur yurVar, zx40 zx40Var, fid fidVar, int i) {
        int i2;
        c530 c530Var;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1794256116);
        int i4 = i | (btsVar.k(hoy0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.k(co60Var) ? 256 : 128);
        if (btsVar.V(i4 & 1, (i4 & 9363) != 9362)) {
            c530 c530Var2 = c530.a;
            f530 c = ljs0.c(c530Var2, 1.0f);
            sic a = qic.a(lr20.e, x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            if (hoy0Var.a.b.length() <= 0 || co60Var.e.length() <= 0) {
                i2 = i4;
                c530Var = c530Var2;
                i3 = 0;
                btsVar.e0(177999992);
                btsVar.t(false);
            } else {
                btsVar.e0(177839505);
                i2 = i4;
                c530Var = c530Var2;
                i3 = 0;
                ymb1.f(co60Var.e, null, ((el51) btsVar.m(gl51.a)).o(), null, null, null, 0L, 0L, 0L, null, 0, false, 1, null, null, btsVar, 0, HProv.ALG_TYPE_SECURECHANNEL, 57338);
                btsVar = btsVar;
                btsVar.t(false);
            }
            f530 b = gi91.b(ljs0.c(c530Var, 1.0f), yurVar);
            ety0 ety0Var = ((zm51) btsVar.m(an51.a)).f;
            a7u0 a7u0Var = gl51.a;
            bts btsVar2 = btsVar;
            ne5.a(hoy0Var, tlsVar, b, false, false, ety0.a(ety0Var, ((el51) btsVar.m(a7u0Var)).n(), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), new lkx(i3, co60Var.l, i3, HProv.PP_PASSWD_TERM), null, true, 0, 0, null, null, zx40Var, new a6t0(((el51) btsVar.m(a7u0Var)).n()), wwg.S(-1558767449, true, new y740(5, hoy0Var, co60Var), btsVar), btsVar2, (i2 & 14) | 100663296 | (i2 & 112), 199680, 7832);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0((Object) hoy0Var, tlsVar, (Object) co60Var, (Object) yurVar, (Object) zx40Var, i, 25);
        }
    }
}
