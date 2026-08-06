package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xwMnAITU0 extends h50 implements hv {
    public final /* synthetic */ c AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xwMnAITU0(c cVar, int i) {
        super(1);
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = cVar;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.EljAMC1QTz;
        kc1 kc1Var = kc1.GWasM1elztuh;
        c cVar = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                int i2 = ((dt) obj).GWasM1elztuh;
                nt ntVar = (nt) cVar.getFocusOwner();
                c cVar2 = ntVar.GWasM1elztuh;
                rt0 rt0Var = new rt0();
                rt0Var.OOA6hdeuvCS = Boolean.FALSE;
                rt EljAMC1QTz = ntVar.EljAMC1QTz();
                Boolean OOA6hdeuvCS = ntVar.OOA6hdeuvCS(i2, cVar2.getEmbeddedViewFocusRect(), new mt(i2, rt0Var));
                if ((!o30.rQPn8YBR(OOA6hdeuvCS, Boolean.TRUE) || EljAMC1QTz == ntVar.EljAMC1QTz()) && OOA6hdeuvCS != null && rt0Var.OOA6hdeuvCS != null && OOA6hdeuvCS.booleanValue()) {
                    ((Boolean) rt0Var.OOA6hdeuvCS).getClass();
                    break;
                }
                break;
            default:
                wu wuVar = (wu) obj;
                cVar.getUncaughtExceptionHandler$ui();
                Handler handler = cVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = cVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new AiiPg05cpff(wuVar, 1));
                        break;
                    }
                } else {
                    wuVar.GWasM1elztuh();
                    break;
                }
                break;
        }
        return kc1Var;
    }
}
