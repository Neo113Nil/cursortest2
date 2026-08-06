package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ek extends d71 implements lv {
    public final /* synthetic */ float E7jCp8Ls;
    public m3 JFJ3QoxA;
    public final /* synthetic */ fk XnEVoBF0td1l;
    public ot0 mOu10nynGul;
    public int rQPn8YBR;
    public final /* synthetic */ sy0 uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(float f, fk fkVar, sy0 sy0Var, vg vgVar) {
        super(2, vgVar);
        this.E7jCp8Ls = f;
        this.XnEVoBF0td1l = fkVar;
        this.uFEq9NpZ = sy0Var;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((ek) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        float f;
        ot0 ot0Var;
        m3 m3Var;
        int i = this.rQPn8YBR;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            f = this.E7jCp8Ls;
            if (Math.abs(f) > 1.0f) {
                ot0 ot0Var2 = new ot0();
                ot0Var2.OOA6hdeuvCS = f;
                ot0 ot0Var3 = new ot0();
                m3 GWasM1elztuh = ki1.GWasM1elztuh(f, 28);
                try {
                    fk fkVar = this.XnEVoBF0td1l;
                    sj sjVar = fkVar.GWasM1elztuh;
                    dk dkVar = new dk(ot0Var3, this.uFEq9NpZ, ot0Var2, fkVar);
                    this.mOu10nynGul = ot0Var2;
                    this.JFJ3QoxA = GWasM1elztuh;
                    this.rQPn8YBR = 1;
                    Object EljAMC1QTz = q70.EljAMC1QTz(GWasM1elztuh, new rj(sjVar, vc0.mOu10nynGul, GWasM1elztuh.EljAMC1QTz.getValue(), GWasM1elztuh.AvO7iQsrTN), Long.MIN_VALUE, dkVar, this);
                    Object obj2 = qh.OOA6hdeuvCS;
                    if (EljAMC1QTz != obj2) {
                        EljAMC1QTz = kc1.GWasM1elztuh;
                    }
                    if (EljAMC1QTz == obj2) {
                        return obj2;
                    }
                    ot0Var = ot0Var2;
                } catch (CancellationException unused) {
                    ot0Var = ot0Var2;
                    m3Var = GWasM1elztuh;
                    ot0Var.OOA6hdeuvCS = ((Number) m3Var.OOA6hdeuvCS.Yi7zF1RB1.mOu10nynGul(m3Var.AvO7iQsrTN)).floatValue();
                    f = ot0Var.OOA6hdeuvCS;
                    return new Float(f);
                }
            }
            return new Float(f);
        }
        if (i != 1) {
            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m3Var = this.JFJ3QoxA;
        ot0Var = this.mOu10nynGul;
        try {
            o50.A1EKNP6CxJ(obj);
        } catch (CancellationException unused2) {
            ot0Var.OOA6hdeuvCS = ((Number) m3Var.OOA6hdeuvCS.Yi7zF1RB1.mOu10nynGul(m3Var.AvO7iQsrTN)).floatValue();
            f = ot0Var.OOA6hdeuvCS;
            return new Float(f);
        }
        f = ot0Var.OOA6hdeuvCS;
        return new Float(f);
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        return new ek(this.E7jCp8Ls, this.XnEVoBF0td1l, this.uFEq9NpZ, vgVar);
    }
}
