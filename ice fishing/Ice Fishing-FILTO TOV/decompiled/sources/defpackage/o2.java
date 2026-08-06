package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class o2 extends h50 implements mv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ p41 EljAMC1QTz;
    public final /* synthetic */ a3 encWxUiV2;
    public final /* synthetic */ jd mOu10nynGul;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(p41 p41Var, Object obj, a3 a3Var, jd jdVar) {
        super(3);
        this.EljAMC1QTz = p41Var;
        this.AvO7iQsrTN = obj;
        this.encWxUiV2 = a3Var;
        this.mOu10nynGul = jdVar;
    }

    @Override // defpackage.mv
    public final Object X1lG3V04pd(Object obj, Object obj2, Object obj3) {
        f3 f3Var = (f3) obj;
        qx qxVar = (qx) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? qxVar.EljAMC1QTz(f3Var) : qxVar.encWxUiV2(f3Var) ? 4 : 2;
        }
        if (qxVar.dqB83aoLBB(intValue & 1, (intValue & 19) != 18)) {
            p41 p41Var = this.EljAMC1QTz;
            boolean EljAMC1QTz = qxVar.EljAMC1QTz(p41Var);
            Object obj4 = this.AvO7iQsrTN;
            boolean encWxUiV2 = EljAMC1QTz | qxVar.encWxUiV2(obj4);
            a3 a3Var = this.encWxUiV2;
            boolean encWxUiV22 = encWxUiV2 | qxVar.encWxUiV2(a3Var);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            k61 k61Var = ue.GWasM1elztuh;
            if (encWxUiV22 || HFYAaqMd6 == k61Var) {
                HFYAaqMd6 = new n2(p41Var, obj4, a3Var, 0);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            ki1.EljAMC1QTz(f3Var, (hv) HFYAaqMd6, qxVar);
            hg0 hg0Var = a3Var.xqGvceK5x;
            f3Var.getClass();
            hg0Var.XnEVoBF0td1l(obj4, ((g3) f3Var).GWasM1elztuh);
            Object HFYAaqMd62 = qxVar.HFYAaqMd6();
            if (HFYAaqMd62 == k61Var) {
                HFYAaqMd62 = new u2();
                qxVar.dcDmLGVhzWm(HFYAaqMd62);
            }
            this.mOu10nynGul.XnEVoBF0td1l((u2) HFYAaqMd62, obj4, qxVar, 0);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        return kc1.GWasM1elztuh;
    }
}
