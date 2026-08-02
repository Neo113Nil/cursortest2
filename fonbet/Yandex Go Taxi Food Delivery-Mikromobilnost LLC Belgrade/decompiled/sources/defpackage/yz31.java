package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yx360.design.compose.atoms.DsButton$Style;
import com.yx360.design.compose.atoms.DsHeading$Align;
import com.yx360.design.compose.atoms.DsHeading$Size;

/* loaded from: classes15.dex */
public final class yz31 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ sls c;

    public yz31(int i, int i2, sls slsVar) {
        this.a = i;
        this.b = i2;
        this.c = slsVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        fid fidVar = (fid) obj3;
        int intValue = ((Number) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= fidVar.a(booleanValue) ? 32 : 16;
        }
        if ((intValue & 145) == 144) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        if (!booleanValue) {
            so5 so5Var = x4c.H;
            c530 c530Var = c530.a;
            f530 u = pw91.u(ljs0.u(c530Var, null, 3), pw91.o(fidVar), 14);
            sic a = qic.a(lr20.e, so5Var, fidVar, 54);
            bts btsVar2 = (bts) fidVar;
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(fidVar, u);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(fidVar, d.f, a);
            qje.W(fidVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(fidVar, d.d, d);
            qnm.d.getClass();
            oeb1.c(fidVar, ljs0.e(c530Var, 12.0f));
            o4b1.b(mt71.m(this.a, 0, fidVar), null, ljs0.e(ljs0.c(c530Var, 1.0f), 200.0f), null, null, 0.0f, null, fidVar, 432, 120);
            oeb1.c(fidVar, ljs0.e(c530Var, 16.0f));
            hq91.a(ohb1.e(fidVar, this.b), ljs0.c(c530Var, 1.0f), ohb1.e(fidVar, oyh0.msg_vpn_blocked_dialog_descr), DsHeading$Size.Xs, DsHeading$Align.Center, 0L, 0, 0L, 0, 0, null, fidVar, 27696, 0, 2016);
            oeb1.c(fidVar, ljs0.e(c530Var, 16.0f));
            bk91.a(oyh0.msg_vpn_blocked_dialog_button, this.c, DsButton$Style.Neutral, fidVar, 384);
            oeb1.c(fidVar, ljs0.e(c530Var, 32.0f));
            btsVar2.t(true);
        }
        return zy11.a;
    }
}
