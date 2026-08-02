package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class r840 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ x840 c;

    public /* synthetic */ r840(tls tlsVar, x840 x840Var, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = x840Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c530 c530Var = c530.a;
        x840 x840Var = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                int i2 = 1;
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    xab1.a(i9a1.d(ljs0.c(c530Var, 1.0f)), null, wwg.S(-787044528, true, new r840(tlsVar, x840Var, i2), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                dj6 dj6Var = (dj6) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(dj6Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                boolean V = btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18);
                dmw0 dmw0Var = btsVar2.a;
                if (!V) {
                    btsVar2.Y();
                    return zy11Var;
                }
                float c = dj6Var.c() * 0.85f;
                oip0 o = pw91.o(btsVar2);
                f530 g = ljs0.g(ljs0.c(c530Var, 1.0f), 0.0f, c, 1);
                so5 so5Var = x4c.G;
                g43 g43Var = lr20.c;
                sic a = qic.a(g43Var, so5Var, btsVar2, 0);
                int hashCode = Long.hashCode(btsVar2.T);
                r1b0 o2 = btsVar2.o();
                f530 d = b.d(btsVar2, g);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                wls wlsVar = d.f;
                qje.W(btsVar2, wlsVar, a);
                wls wlsVar2 = d.e;
                qje.W(btsVar2, wlsVar2, o2);
                Integer valueOf = Integer.valueOf(hashCode);
                wls wlsVar3 = d.g;
                qje.W(btsVar2, wlsVar3, valueOf);
                tls tlsVar2 = d.h;
                qje.M(btsVar2, tlsVar2);
                wls wlsVar4 = d.d;
                qje.W(btsVar2, wlsVar4, d);
                f530 m = an91.m(pw91.u(n.e(c530Var, 16.0f, btsVar2, c530Var, 1.0f).k(new x2y(1.0f, false)), o, 14), 16.0f, 0.0f, 2);
                sic a2 = qic.a(g43Var, so5Var, btsVar2, 0);
                int hashCode2 = Long.hashCode(btsVar2.T);
                r1b0 o3 = btsVar2.o();
                f530 d2 = b.d(btsVar2, m);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, wlsVar, a2);
                qje.W(btsVar2, wlsVar2, o3);
                vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar2);
                qje.W(btsVar2, wlsVar4, d2);
                ppb1.f(x840Var.a, btsVar2, 0);
                oeb1.c(btsVar2, ljs0.e(c530Var, 6.0f));
                ppb1.e(x840Var.b, btsVar2, 0);
                ly3.B(c530Var, 12.0f, btsVar2, true);
                oeb1.c(btsVar2, ljs0.e(c530Var, 4.0f));
                ppb1.d(ohb1.e(btsVar2, cyh0.mt_order_tickets_route_information_popup_button_title), tlsVar, btsVar2, 0);
                ly3.B(c530Var, 16.0f, btsVar2, true);
                return zy11Var;
        }
    }
}
