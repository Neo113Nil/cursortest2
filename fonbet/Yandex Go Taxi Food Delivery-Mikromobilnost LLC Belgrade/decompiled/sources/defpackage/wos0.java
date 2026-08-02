package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes5.dex */
public final /* synthetic */ class wos0 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ aps0 b;

    public /* synthetic */ wos0(aps0 aps0Var) {
        this.b = aps0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        aps0 aps0Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    k3r k3rVar = ljs0.c;
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, k3rVar);
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
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar);
                    }
                    qje.W(btsVar, d.d, d2);
                    zgb1.b(aps0Var.a, aps0Var.b, cj6.a.a(c530.a, x4c.y), x4c.H, 0, false, null, null, null, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                yos0.a(aps0Var, (fid) obj, vng.O(1));
                return zy11Var;
        }
    }

    public /* synthetic */ wos0(aps0 aps0Var, int i) {
        this.b = aps0Var;
    }
}
