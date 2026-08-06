package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class iz0 implements nv {
    public final /* synthetic */ kz0 EljAMC1QTz;
    public final /* synthetic */ List OOA6hdeuvCS;

    public iz0(List list, kz0 kz0Var) {
        this.OOA6hdeuvCS = list;
        this.EljAMC1QTz = kz0Var;
    }

    @Override // defpackage.nv
    public final Object XnEVoBF0td1l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        c70 c70Var = (c70) obj;
        int intValue = ((Number) obj2).intValue();
        qx qxVar = (qx) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (qxVar.EljAMC1QTz(c70Var) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= qxVar.xqGvceK5x(intValue) ? 32 : 16;
        }
        if (qxVar.dqB83aoLBB(i & 1, (i & 147) != 146)) {
            yy0 yy0Var = (yy0) this.OOA6hdeuvCS.get(intValue);
            qxVar.MjxSquD6Av(-1013443431);
            kz0 kz0Var = this.EljAMC1QTz;
            boolean encWxUiV2 = qxVar.encWxUiV2(kz0Var);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (encWxUiV2 || HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new i8(2, kz0Var);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            q70.X1lG3V04pd(yy0Var, (hv) HFYAaqMd6, qxVar, 0);
            qxVar.WIEu4Ya2g8(false);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        return kc1.GWasM1elztuh;
    }
}
