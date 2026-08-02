package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes11.dex */
public abstract class yob1 {
    public static mgv a;

    public static final void a(tls tlsVar, myc mycVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-74090617);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(tlsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(mycVar) ? 32 : 16;
        }
        int i4 = 27;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            f530 f = ocb1.f(ljs0.e(ljs0.c(c530.a, 1.0f), 56.0f), mycVar.f, btsVar2, 0);
            long j = mycVar.c;
            boolean z = !mycVar.f;
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar2.Q();
            if (z2 || Q == did.a) {
                Q = new n8a(i4, tlsVar, mycVar);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            a.a((sls) Q, f, null, j, 0L, null, z, null, null, null, wwg.S(1085196400, true, new ota(i3, mycVar), btsVar2), btsVar, 0, 3828);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(tlsVar, mycVar, i, 27);
        }
    }

    public static final void b(ryc rycVar, tls tlsVar, tls tlsVar2, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(934962238);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(rycVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        int i3 = i2 | HProv.ALG_TYPE_SECURECHANNEL;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(an91.o(c530Var, 8.0f, 0.0f, 8.0f, 8.0f, 2), 1.0f);
            sic a2 = qic.a(new i43(4.0f, true, new quz(11)), x4c.G, btsVar, 6);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            myc mycVar = rycVar.d;
            if (mycVar == null) {
                btsVar.e0(1598340048);
                btsVar.t(false);
            } else {
                btsVar.e0(1598340049);
                a(tlsVar2, mycVar, btsVar, (i3 >> 6) & 14);
                btsVar.t(false);
            }
            a(tlsVar, rycVar.c, btsVar, (i3 >> 3) & 14);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0((Object) rycVar, tlsVar, (cms) tlsVar2, (Object) f530Var2, i, 13);
        }
    }

    public static final void c(int i, fid fidVar, sls slsVar, f530 f530Var) {
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1151808733);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(c530Var, 8.0f);
            ButtonSize buttonSize = ButtonSize.M;
            f9d.a.getClass();
            slsVar2 = slsVar;
            vpa1.a(k, false, buttonSize, slsVar2, f9d.b, btsVar, ((i2 << 9) & 7168) | 24960, 2);
            f530Var = c530Var;
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(slsVar2, f530Var, i, 10);
        }
    }
}
