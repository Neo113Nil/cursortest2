package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ng extends d71 implements lv {
    public final /* synthetic */ bd1 E7jCp8Ls;
    public /* synthetic */ Object JFJ3QoxA;
    public final /* synthetic */ d8 XnEVoBF0td1l;
    public int mOu10nynGul;
    public final /* synthetic */ og rQPn8YBR;
    public final /* synthetic */ long uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng(og ogVar, bd1 bd1Var, d8 d8Var, long j, vg vgVar) {
        super(2, vgVar);
        this.rQPn8YBR = ogVar;
        this.E7jCp8Ls = bd1Var;
        this.XnEVoBF0td1l = d8Var;
        this.uFEq9NpZ = j;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((ng) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        og ogVar = this.rQPn8YBR;
        x7 x7Var = ogVar.lv06NcmrQ;
        int i = this.mOu10nynGul;
        try {
            try {
                if (i == 0) {
                    o50.A1EKNP6CxJ(obj);
                    f40 ozMwhSAI = ki1.ozMwhSAI(((ph) this.JFJ3QoxA).EljAMC1QTz());
                    ogVar.arNh8D4Z5gB = true;
                    wy0 wy0Var = ogVar.jivtDDk9H;
                    tg0 tg0Var = tg0.OOA6hdeuvCS;
                    mg mgVar = new mg(this.E7jCp8Ls, ogVar, this.XnEVoBF0td1l, this.uFEq9NpZ, ozMwhSAI, null);
                    this.mOu10nynGul = 1;
                    Object EljAMC1QTz = wy0Var.EljAMC1QTz(tg0Var, mgVar, this);
                    qh qhVar = qh.OOA6hdeuvCS;
                    if (EljAMC1QTz == qhVar) {
                        return qhVar;
                    }
                } else {
                    if (i != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj);
                }
                x7Var.Yi7zF1RB1();
                ogVar.arNh8D4Z5gB = false;
                x7Var.GWasM1elztuh(null);
                ogVar.WdrkLMV3xh = false;
                return kc1.GWasM1elztuh;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            ogVar.arNh8D4Z5gB = false;
            x7Var.GWasM1elztuh(null);
            ogVar.WdrkLMV3xh = false;
            throw th;
        }
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        ng ngVar = new ng(this.rQPn8YBR, this.E7jCp8Ls, this.XnEVoBF0td1l, this.uFEq9NpZ, vgVar);
        ngVar.JFJ3QoxA = obj;
        return ngVar;
    }
}
