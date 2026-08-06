package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class mg extends d71 implements lv {
    public final /* synthetic */ og E7jCp8Ls;
    public /* synthetic */ Object JFJ3QoxA;
    public final /* synthetic */ d8 XnEVoBF0td1l;
    public final /* synthetic */ f40 iwATDS1i01k;
    public int mOu10nynGul;
    public final /* synthetic */ bd1 rQPn8YBR;
    public final /* synthetic */ long uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(bd1 bd1Var, og ogVar, d8 d8Var, long j, f40 f40Var, vg vgVar) {
        super(2, vgVar);
        this.rQPn8YBR = bd1Var;
        this.E7jCp8Ls = ogVar;
        this.XnEVoBF0td1l = d8Var;
        this.uFEq9NpZ = j;
        this.iwATDS1i01k = f40Var;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((mg) uFEq9NpZ((vg) obj2, (uy0) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            uy0 uy0Var = (uy0) this.JFJ3QoxA;
            long j = this.uFEq9NpZ;
            og ogVar = this.E7jCp8Ls;
            d8 d8Var = this.XnEVoBF0td1l;
            float gqMuANyCes = og.gqMuANyCes(ogVar, d8Var, j);
            bd1 bd1Var = this.rQPn8YBR;
            bd1Var.OOA6hdeuvCS = gqMuANyCes;
            d2 d2Var = new d2(ogVar, bd1Var, this.iwATDS1i01k, uy0Var);
            t5 t5Var = new t5(ogVar, bd1Var, d8Var, 2);
            this.mOu10nynGul = 1;
            Object GWasM1elztuh = bd1Var.GWasM1elztuh(d2Var, t5Var, this);
            qh qhVar = qh.OOA6hdeuvCS;
            if (GWasM1elztuh == qhVar) {
                return qhVar;
            }
        } else {
            if (i != 1) {
                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o50.A1EKNP6CxJ(obj);
        }
        return kc1.GWasM1elztuh;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        mg mgVar = new mg(this.rQPn8YBR, this.E7jCp8Ls, this.XnEVoBF0td1l, this.uFEq9NpZ, this.iwATDS1i01k, vgVar);
        mgVar.JFJ3QoxA = obj;
        return mgVar;
    }
}
