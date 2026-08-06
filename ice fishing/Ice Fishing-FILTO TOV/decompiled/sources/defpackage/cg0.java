package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cg0 extends ru0 implements lv {
    public cy AvO7iQsrTN;
    public /* synthetic */ Object E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ dg0 XnEVoBF0td1l;
    public dg0 encWxUiV2;
    public long[] mOu10nynGul;
    public int rQPn8YBR;
    public final /* synthetic */ cy uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg0(dg0 dg0Var, cy cyVar, vg vgVar) {
        super(vgVar);
        this.XnEVoBF0td1l = dg0Var;
        this.uFEq9NpZ = cyVar;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((cg0) uFEq9NpZ((vg) obj2, (w01) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        w01 w01Var;
        dg0 dg0Var;
        long[] jArr;
        int i;
        cy cyVar;
        int i2 = this.rQPn8YBR;
        if (i2 == 0) {
            o50.A1EKNP6CxJ(obj);
            w01Var = (w01) this.E7jCp8Ls;
            dg0Var = this.XnEVoBF0td1l;
            bg0 bg0Var = dg0Var.EljAMC1QTz;
            jArr = bg0Var.X1lG3V04pd;
            i = bg0Var.OOA6hdeuvCS;
            cyVar = this.uFEq9NpZ;
        } else {
            if (i2 != 1) {
                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.JFJ3QoxA;
            jArr = this.mOu10nynGul;
            dg0Var = this.encWxUiV2;
            cyVar = this.AvO7iQsrTN;
            w01Var = (w01) this.E7jCp8Ls;
            o50.A1EKNP6CxJ(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return kc1.GWasM1elztuh;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        cyVar.EljAMC1QTz = i;
        Object obj2 = dg0Var.EljAMC1QTz.Yi7zF1RB1[i];
        this.E7jCp8Ls = w01Var;
        this.AvO7iQsrTN = cyVar;
        this.encWxUiV2 = dg0Var;
        this.mOu10nynGul = jArr;
        this.JFJ3QoxA = i3;
        this.rQPn8YBR = 1;
        w01Var.Yi7zF1RB1(this, obj2);
        return qh.OOA6hdeuvCS;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        cg0 cg0Var = new cg0(this.XnEVoBF0td1l, this.uFEq9NpZ, vgVar);
        cg0Var.E7jCp8Ls = obj;
        return cg0Var;
    }
}
