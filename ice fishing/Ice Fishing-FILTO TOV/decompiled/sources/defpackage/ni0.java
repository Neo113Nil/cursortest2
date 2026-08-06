package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ni0 implements nv {
    public final /* synthetic */ iw0 AvO7iQsrTN;
    public final /* synthetic */ fh0 EljAMC1QTz;
    public final /* synthetic */ vz0 OOA6hdeuvCS;
    public final /* synthetic */ mg0 encWxUiV2;
    public final /* synthetic */ m51 mOu10nynGul;

    public ni0(vz0 vz0Var, fh0 fh0Var, jw0 jw0Var, mg0 mg0Var, m51 m51Var) {
        this.OOA6hdeuvCS = vz0Var;
        this.EljAMC1QTz = fh0Var;
        this.AvO7iQsrTN = jw0Var;
        this.encWxUiV2 = mg0Var;
        this.mOu10nynGul = m51Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    @Override // defpackage.nv
    public final Object XnEVoBF0td1l(Object obj, Object obj2, Object obj3, Object obj4) {
        fh0 fh0Var;
        u2 u2Var = (u2) obj;
        fh0 fh0Var2 = (fh0) obj2;
        qx qxVar = (qx) obj3;
        ((Number) obj4).intValue();
        boolean rQPn8YBR = o30.rQPn8YBR(this.OOA6hdeuvCS.X1lG3V04pd.getValue(), this.EljAMC1QTz);
        if (!((Boolean) this.encWxUiV2.getValue()).booleanValue() && !rQPn8YBR) {
            List list = (List) this.mOu10nynGul.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    fh0Var = 0;
                    break;
                }
                fh0Var = listIterator.previous();
                if (o30.rQPn8YBR(fh0Var2, (fh0) fh0Var)) {
                    break;
                }
            }
            fh0Var2 = fh0Var;
        }
        if (fh0Var2 == null) {
            qxVar.MjxSquD6Av(105930796);
        } else {
            qxVar.MjxSquD6Av(-1520603531);
            b70.Yi7zF1RB1(fh0Var2, this.AvO7iQsrTN, rj0.YZjbz8VdP5(-1263531443, new y8(3, fh0Var2, u2Var), qxVar), qxVar, 384);
        }
        qxVar.WIEu4Ya2g8(false);
        return kc1.GWasM1elztuh;
    }
}
