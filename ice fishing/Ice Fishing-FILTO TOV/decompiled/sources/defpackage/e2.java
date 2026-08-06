package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class e2 extends d71 implements hv {
    public final /* synthetic */ g2 E7jCp8Ls;
    public nt0 JFJ3QoxA;
    public final /* synthetic */ Object XnEVoBF0td1l;
    public final /* synthetic */ long iwATDS1i01k;
    public m3 mOu10nynGul;
    public int rQPn8YBR;
    public final /* synthetic */ t71 uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(g2 g2Var, Object obj, t71 t71Var, long j, vg vgVar) {
        super(1, vgVar);
        this.E7jCp8Ls = g2Var;
        this.XnEVoBF0td1l = obj;
        this.uFEq9NpZ = t71Var;
        this.iwATDS1i01k = j;
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        m3 m3Var;
        nt0 nt0Var;
        t71 t71Var = this.uFEq9NpZ;
        int i = this.rQPn8YBR;
        g2 g2Var = this.E7jCp8Ls;
        try {
            if (i == 0) {
                o50.A1EKNP6CxJ(obj);
                g2Var.X1lG3V04pd.AvO7iQsrTN = (r3) g2Var.GWasM1elztuh.GWasM1elztuh.mOu10nynGul(this.XnEVoBF0td1l);
                g2Var.OOA6hdeuvCS.setValue(t71Var.X1lG3V04pd);
                g2Var.xqGvceK5x.setValue(Boolean.TRUE);
                m3 m3Var2 = g2Var.X1lG3V04pd;
                m3 m3Var3 = new m3(m3Var2.OOA6hdeuvCS, m3Var2.EljAMC1QTz.getValue(), p.mOu10nynGul(m3Var2.AvO7iQsrTN), m3Var2.encWxUiV2, Long.MIN_VALUE, m3Var2.JFJ3QoxA);
                nt0 nt0Var2 = new nt0();
                long j = this.iwATDS1i01k;
                d2 d2Var = new d2(g2Var, m3Var3, nt0Var2, 0);
                this.mOu10nynGul = m3Var3;
                this.JFJ3QoxA = nt0Var2;
                this.rQPn8YBR = 1;
                Object EljAMC1QTz = q70.EljAMC1QTz(m3Var3, t71Var, j, d2Var, this);
                qh qhVar = qh.OOA6hdeuvCS;
                if (EljAMC1QTz == qhVar) {
                    return qhVar;
                }
                m3Var = m3Var3;
                nt0Var = nt0Var2;
            } else {
                if (i != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nt0Var = this.JFJ3QoxA;
                m3Var = this.mOu10nynGul;
                o50.A1EKNP6CxJ(obj);
            }
            i3 i3Var = nt0Var.OOA6hdeuvCS ? i3.OOA6hdeuvCS : i3.EljAMC1QTz;
            g2.Yi7zF1RB1(g2Var);
            return new j3(m3Var, i3Var);
        } catch (CancellationException e) {
            g2.Yi7zF1RB1(g2Var);
            throw e;
        }
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        t71 t71Var = this.uFEq9NpZ;
        long j = this.iwATDS1i01k;
        return new e2(this.E7jCp8Ls, this.XnEVoBF0td1l, t71Var, j, (vg) obj).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }
}
