package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class sz0 extends d71 implements hv {
    public final /* synthetic */ vz0 E7jCp8Ls;
    public final /* synthetic */ Object JFJ3QoxA;
    public final /* synthetic */ qa1 XnEVoBF0td1l;
    public int mOu10nynGul;
    public final /* synthetic */ Object rQPn8YBR;
    public final /* synthetic */ float uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(Object obj, Object obj2, vz0 vz0Var, qa1 qa1Var, float f, vg vgVar) {
        super(1, vgVar);
        this.JFJ3QoxA = obj;
        this.rQPn8YBR = obj2;
        this.E7jCp8Ls = vz0Var;
        this.XnEVoBF0td1l = qa1Var;
        this.uFEq9NpZ = f;
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            rz0 rz0Var = new rz0(this.JFJ3QoxA, this.rQPn8YBR, this.E7jCp8Ls, this.XnEVoBF0td1l, this.uFEq9NpZ, null);
            this.mOu10nynGul = 1;
            Object mE4lRynR = fb1.mE4lRynR(rz0Var, this);
            qh qhVar = qh.OOA6hdeuvCS;
            if (mE4lRynR == qhVar) {
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

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        qa1 qa1Var = this.XnEVoBF0td1l;
        float f = this.uFEq9NpZ;
        return new sz0(this.JFJ3QoxA, this.rQPn8YBR, this.E7jCp8Ls, qa1Var, f, (vg) obj).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }
}
