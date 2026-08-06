package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class AvO7iQsrTN extends d71 implements lv {
    public Object E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ Object XnEVoBF0td1l;
    public final /* synthetic */ int mOu10nynGul;
    public final /* synthetic */ long rQPn8YBR;
    public final /* synthetic */ Object uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvO7iQsrTN(Object obj, long j, Object obj2, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.XnEVoBF0td1l = obj;
        this.rQPn8YBR = j;
        this.uFEq9NpZ = obj2;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                return ((AvO7iQsrTN) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            default:
                return ((AvO7iQsrTN) uFEq9NpZ((vg) obj2, (uy0) obj)).WIEu4Ya2g8(kc1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (((defpackage.f40) r10).cilMamHF(r13) == r9) goto L31;
     */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        wr0 wr0Var;
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        int i2 = 3;
        Object obj2 = this.uFEq9NpZ;
        long j = this.rQPn8YBR;
        qh qhVar = qh.OOA6hdeuvCS;
        Object obj3 = this.XnEVoBF0td1l;
        switch (i) {
            case 0:
                tf0 tf0Var = (tf0) obj2;
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    this.JFJ3QoxA = 1;
                    break;
                } else if (i3 == 1) {
                    o50.A1EKNP6CxJ(obj);
                } else if (i3 == 2) {
                    wr0Var = (wr0) this.E7jCp8Ls;
                    o50.A1EKNP6CxJ(obj);
                    this.E7jCp8Ls = null;
                    this.JFJ3QoxA = 3;
                    if (tf0Var.GWasM1elztuh(wr0Var, this) != qhVar) {
                    }
                    break;
                } else if (i3 != 3) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    break;
                }
                vr0 vr0Var = new vr0(j);
                wr0 wr0Var2 = new wr0(vr0Var);
                this.E7jCp8Ls = wr0Var2;
                this.JFJ3QoxA = 2;
                if (tf0Var.GWasM1elztuh(vr0Var, this) != qhVar) {
                    wr0Var = wr0Var2;
                    this.E7jCp8Ls = null;
                    this.JFJ3QoxA = 3;
                    if (tf0Var.GWasM1elztuh(wr0Var, this) != qhVar) {
                    }
                }
                break;
            default:
                wy0 wy0Var = (wy0) obj3;
                int i4 = this.JFJ3QoxA;
                if (i4 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    uy0 uy0Var = (uy0) this.E7jCp8Ls;
                    float AvO7iQsrTN = wy0Var.AvO7iQsrTN(j);
                    xw xwVar = new xw((ot0) obj2, wy0Var, uy0Var, i2);
                    this.JFJ3QoxA = 1;
                    if (q70.AvO7iQsrTN(0.0f, AvO7iQsrTN, null, xwVar, this, 12) == qhVar) {
                        break;
                    }
                } else if (i4 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    break;
                }
                break;
        }
        return qhVar;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = this.mOu10nynGul;
        Object obj2 = this.uFEq9NpZ;
        Object obj3 = this.XnEVoBF0td1l;
        switch (i) {
            case 0:
                return new AvO7iQsrTN((f40) obj3, this.rQPn8YBR, (tf0) obj2, vgVar, 0);
            default:
                AvO7iQsrTN avO7iQsrTN = new AvO7iQsrTN((wy0) obj3, this.rQPn8YBR, (ot0) obj2, vgVar, 1);
                avO7iQsrTN.E7jCp8Ls = obj;
                return avO7iQsrTN;
        }
    }
}
