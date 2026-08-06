package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ty0 extends d71 implements lv {
    public int E7jCp8Ls;
    public qt0 JFJ3QoxA;
    public final /* synthetic */ long WIEu4Ya2g8;
    public /* synthetic */ Object XnEVoBF0td1l;
    public final /* synthetic */ qt0 iwATDS1i01k;
    public wy0 mOu10nynGul;
    public long rQPn8YBR;
    public final /* synthetic */ wy0 uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty0(wy0 wy0Var, qt0 qt0Var, long j, vg vgVar) {
        super(2, vgVar);
        this.uFEq9NpZ = wy0Var;
        this.iwATDS1i01k = qt0Var;
        this.WIEu4Ya2g8 = j;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((ty0) uFEq9NpZ((vg) obj2, (uy0) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        wy0 wy0Var;
        qt0 qt0Var;
        wy0 wy0Var2;
        long j;
        int i = this.E7jCp8Ls;
        xm0 xm0Var = xm0.EljAMC1QTz;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            uy0 uy0Var = (uy0) this.XnEVoBF0td1l;
            wy0Var = this.uFEq9NpZ;
            sy0 sy0Var = new sy0(wy0Var, uy0Var);
            fk fkVar = wy0Var.X1lG3V04pd;
            qt0Var = this.iwATDS1i01k;
            long j2 = qt0Var.OOA6hdeuvCS;
            xm0 xm0Var2 = wy0Var.xqGvceK5x;
            long j3 = this.WIEu4Ya2g8;
            float xqGvceK5x = wy0Var.xqGvceK5x(xm0Var2 == xm0Var ? yd1.Yi7zF1RB1(j3) : yd1.X1lG3V04pd(j3));
            this.XnEVoBF0td1l = wy0Var;
            this.mOu10nynGul = wy0Var;
            this.JFJ3QoxA = qt0Var;
            this.rQPn8YBR = j2;
            this.E7jCp8Ls = 1;
            fkVar.getClass();
            obj = fb1.ES6ysExf(fkVar.Yi7zF1RB1, new ek(xqGvceK5x, fkVar, sy0Var, null), this);
            qh qhVar = qh.OOA6hdeuvCS;
            if (obj == qhVar) {
                return qhVar;
            }
            wy0Var2 = wy0Var;
            j = j2;
        } else {
            if (i != 1) {
                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.rQPn8YBR;
            qt0Var = this.JFJ3QoxA;
            wy0Var = this.mOu10nynGul;
            wy0Var2 = (wy0) this.XnEVoBF0td1l;
            o50.A1EKNP6CxJ(obj);
        }
        float xqGvceK5x2 = wy0Var2.xqGvceK5x(((Number) obj).floatValue());
        qt0Var.OOA6hdeuvCS = wy0Var.xqGvceK5x == xm0Var ? yd1.GWasM1elztuh(j, xqGvceK5x2, 0.0f, 2) : yd1.GWasM1elztuh(j, 0.0f, xqGvceK5x2, 1);
        return kc1.GWasM1elztuh;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        ty0 ty0Var = new ty0(this.uFEq9NpZ, this.iwATDS1i01k, this.WIEu4Ya2g8, vgVar);
        ty0Var.XnEVoBF0td1l = obj;
        return ty0Var;
    }
}
