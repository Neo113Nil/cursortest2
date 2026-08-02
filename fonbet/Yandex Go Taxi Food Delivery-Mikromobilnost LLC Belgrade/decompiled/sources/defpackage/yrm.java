package defpackage;

import androidx.compose.material3.p;
import androidx.compose.material3.w;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.yx360.design.compose.atoms.DsButtonClose$Type;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class yrm {
    public static final qwd a = new qwd(new jbm(25));

    public static final void a(lu91 lu91Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1443813117);
        if ((((btsVar.k(lu91Var) ? 256 : 128) | i) & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else if (lu91Var != null) {
            qwd qwdVar = unm.a;
            qnm.d.getClass();
            sb2.b(qwdVar.a(new y7m(8.0f)), wwg.S(-2100765090, true, new vom(26, lu91Var), btsVar), btsVar, 56);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new txk(lu91Var, i);
        }
    }

    public static final void b(f530 f530Var, wls wlsVar, wls wlsVar2, a aVar, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-70062915);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(wlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(wlsVar2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(aVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && btsVar2.E()) {
            btsVar2.Y();
            f530Var2 = f530Var;
            btsVar = btsVar2;
        } else {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            qnm qnmVar = qnm.a;
            int i3 = 0;
            btsVar = btsVar2;
            dkm0.a(c, wwg.S(-924992135, true, new wrm(wlsVar, i3), btsVar2), wwg.S(-1609222440, true, new wrm(wlsVar2, 1), btsVar2), null, null, 0, qnm.c(btsVar2).a(), 0L, null, wwg.S(2016999374, true, new xrm(aVar, i3), btsVar2), btsVar, 805306800, 440);
            f530Var2 = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(f530Var2, wlsVar, wlsVar2, aVar, i, 21);
        }
    }

    public static final void c(wls wlsVar, wls wlsVar2, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1728708770);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(wlsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(wlsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(aVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = b.d(btsVar, c530Var);
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
            wls wlsVar3 = d.f;
            qje.W(btsVar, wlsVar3, a2);
            wls wlsVar4 = d.e;
            qje.W(btsVar, wlsVar4, o);
            wls wlsVar5 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar5);
            }
            wls wlsVar6 = d.d;
            qje.W(btsVar, wlsVar6, d);
            btsVar.e0(-1508501904);
            if (wlsVar != null) {
                wlsVar.invoke(btsVar, Integer.valueOf(i2 & 14));
            }
            btsVar.t(false);
            uic uicVar = uic.a;
            f530 b = uicVar.b(c530Var, 1.0f, false);
            int i3 = (i2 << 3) & 7168;
            sic a3 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar3, a3);
            qje.W(btsVar, wlsVar4, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar5);
            }
            qje.W(btsVar, wlsVar6, d2);
            aVar.invoke(uicVar, btsVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
            btsVar.t(true);
            btsVar.e0(-1508494640);
            if (wlsVar2 != null) {
                wlsVar2.invoke(btsVar, Integer.valueOf((i2 >> 3) & 14));
            }
            btsVar.t(false);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09(wlsVar, wlsVar2, aVar, i, 29);
        }
    }

    public static final void d(fwi fwiVar, tls tlsVar, wls wlsVar, wls wlsVar2, a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(193040449);
        int i2 = i | (btsVar.k(fwiVar) ? 4 : 2);
        if ((i2 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
        } else {
            f530 u = ljs0.u(c530.a, null, 3);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, u);
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
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            qje.W(btsVar, d.d, d2);
            btsVar.e0(-1224400529);
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new vrm(tlsVar, fwiVar, wlsVar, wlsVar2, aVar);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            e.a(null, (wls) Q, btsVar, 0, 1);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vrm(fwiVar, tlsVar, wlsVar, wlsVar2, aVar, i);
        }
    }

    public static final void e(String str, wls wlsVar, xjg xjgVar, f530 f530Var, fid fidVar, int i) {
        zrm zrmVar;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1123663995);
        int i2 = i | (btsVar.k(str) ? 32 : 16) | (btsVar.k(null) ? 256 : 128) | (btsVar.e(wlsVar) ? 2048 : 1024) | (btsVar.k(xjgVar) ? 16384 : 8192) | ImageMetadata.EDGE_MODE;
        if ((74899 & i2) == 74898 && btsVar.E()) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            btsVar.e0(1804321112);
            int i3 = 0;
            if (xjgVar != null) {
                DsButtonClose$Type dsButtonClose$Type = (DsButtonClose$Type) xjgVar.b;
                btsVar.e0(5004770);
                boolean z = (57344 & i2) == 16384;
                Object Q = btsVar.Q();
                if (z || Q == did.a) {
                    Q = new bxl(18, xjgVar);
                    btsVar.o0(Q);
                }
                btsVar.t(false);
                zrmVar = new zrm(i3, dsButtonClose$Type, (sls) Q);
            } else {
                zrmVar = null;
            }
            btsVar.t(false);
            btsVar.e0(1804329706);
            a S = wlsVar != null ? wwg.S(-217367052, true, new wrm(wlsVar, 2), btsVar) : null;
            btsVar.t(false);
            int i4 = i2 << 3;
            c530 c530Var = c530.a;
            csm.c(true, c530Var, str, null, zrmVar, S, btsVar, (i4 & 896) | 48 | (i4 & 7168), 0);
            f530Var2 = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0((Object) str, f530Var2, (Object) wlsVar, (Object) xjgVar, i, 25);
        }
    }

    public static final qrm f(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(762116117);
        btsVar.e0(1849434622);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = new c0m(29);
            btsVar.o0(Q);
        }
        tls tlsVar = (tls) Q;
        btsVar.t(false);
        w f = p.f(6, 0, btsVar, tlsVar);
        Object[] objArr = new Object[0];
        tig0 tig0Var = new tig0(new txk(7), new t8j(13, tlsVar, (fwi) btsVar.m(j.h)));
        btsVar.e0(5004770);
        boolean k = btsVar.k(f);
        Object Q2 = btsVar.Q();
        if (k || Q2 == o430Var) {
            Q2 = new bxl(17, f);
            btsVar.o0(Q2);
        }
        btsVar.t(false);
        qrm qrmVar = (qrm) cvw.W(objArr, tig0Var, (sls) Q2, btsVar, 0);
        btsVar.t(false);
        return qrmVar;
    }
}
