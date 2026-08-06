package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class w61 implements lv {
    public final /* synthetic */ long AvO7iQsrTN;
    public final /* synthetic */ z11 EljAMC1QTz;
    public final /* synthetic */ float JFJ3QoxA;
    public final /* synthetic */ ie0 OOA6hdeuvCS;
    public final /* synthetic */ float encWxUiV2;
    public final /* synthetic */ f7 mOu10nynGul;
    public final /* synthetic */ jd rQPn8YBR;

    public w61(ie0 ie0Var, z11 z11Var, long j, float f, f7 f7Var, float f2, jd jdVar) {
        this.OOA6hdeuvCS = ie0Var;
        this.EljAMC1QTz = z11Var;
        this.AvO7iQsrTN = j;
        this.encWxUiV2 = f;
        this.mOu10nynGul = f7Var;
        this.JFJ3QoxA = f2;
        this.rQPn8YBR = jdVar;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        qx qxVar = (qx) obj;
        int intValue = ((Number) obj2).intValue();
        boolean dqB83aoLBB = qxVar.dqB83aoLBB(intValue & 1, (intValue & 3) != 2);
        kc1 kc1Var = kc1.GWasM1elztuh;
        if (!dqB83aoLBB) {
            qxVar.YXi2hvwn7WL();
            return kc1Var;
        }
        ie0 X1lG3V04pd = y61.X1lG3V04pd(this.OOA6hdeuvCS, this.EljAMC1QTz, y61.xqGvceK5x(this.AvO7iQsrTN, this.encWxUiV2, qxVar), this.mOu10nynGul, ((el) qxVar.JFJ3QoxA(kf.encWxUiV2)).jivtDDk9H(this.JFJ3QoxA));
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        k61 k61Var = ue.GWasM1elztuh;
        if (HFYAaqMd6 == k61Var) {
            HFYAaqMd6 = new dx0(24);
            qxVar.dcDmLGVhzWm(HFYAaqMd6);
        }
        AtomicInteger atomicInteger = a01.GWasM1elztuh;
        ie0 X1lG3V04pd2 = X1lG3V04pd.X1lG3V04pd(new l4((hv) HFYAaqMd6));
        Object HFYAaqMd62 = qxVar.HFYAaqMd6();
        if (HFYAaqMd62 == k61Var) {
            HFYAaqMd62 = v61.GWasM1elztuh;
            qxVar.dcDmLGVhzWm(HFYAaqMd62);
        }
        gq0 gq0Var = f71.GWasM1elztuh;
        ie0 X1lG3V04pd3 = X1lG3V04pd2.X1lG3V04pd(new e71(kc1Var, null, (PointerInputEventHandler) HFYAaqMd62, 6));
        bd0 xqGvceK5x = n7.xqGvceK5x(b9xEq24R1.EljAMC1QTz, true);
        int M3K9sHhK = fb1.M3K9sHhK(qxVar);
        cp0 E7jCp8Ls = qxVar.E7jCp8Ls();
        ie0 MZhzXH72 = n30.MZhzXH72(qxVar, X1lG3V04pd3);
        oe.X1lG3V04pd.getClass();
        hf hfVar = ne.Yi7zF1RB1;
        qxVar.c4eaifQP();
        if (qxVar.CMh55RymNfS) {
            qxVar.rQPn8YBR(hfVar);
        } else {
            qxVar.K0ReC6MK();
        }
        l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar, xqGvceK5x);
        l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar, E7jCp8Ls);
        r2 r2Var = ne.EljAMC1QTz;
        if (qxVar.CMh55RymNfS || !o30.rQPn8YBR(qxVar.HFYAaqMd6(), Integer.valueOf(M3K9sHhK))) {
            mr0.XnEVoBF0td1l(M3K9sHhK, qxVar, M3K9sHhK, r2Var);
        }
        l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar, MZhzXH72);
        this.rQPn8YBR.EljAMC1QTz(qxVar, 0);
        qxVar.WIEu4Ya2g8(true);
        return kc1Var;
    }
}
