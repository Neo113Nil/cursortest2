package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class my0 extends d71 implements lv {
    public /* synthetic */ long E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ int mOu10nynGul;
    public final /* synthetic */ oy0 rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my0(oy0 oy0Var, long j, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.rQPn8YBR = oy0Var;
        this.E7jCp8Ls = j;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                return ((my0) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            case 1:
                return ((my0) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            case 2:
                return ((my0) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            default:
                long j = ((uk0) obj).GWasM1elztuh;
                my0 my0Var = new my0(this.rQPn8YBR, (vg) obj2);
                my0Var.E7jCp8Ls = j;
                return my0Var.WIEu4Ya2g8(kc1Var);
        }
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        oy0 oy0Var = this.rQPn8YBR;
        qh qhVar = qh.OOA6hdeuvCS;
        switch (i) {
            case 0:
                int i2 = this.JFJ3QoxA;
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    wy0 wy0Var = oy0Var.YXi2hvwn7WL;
                    ly0 ly0Var = new ly0(this.E7jCp8Ls, null);
                    this.JFJ3QoxA = 1;
                    if (wy0Var.EljAMC1QTz(tg0.EljAMC1QTz, ly0Var, this) == qhVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    break;
                }
                break;
            case 1:
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    wy0 wy0Var2 = oy0Var.YXi2hvwn7WL;
                    long j = this.E7jCp8Ls;
                    this.JFJ3QoxA = 1;
                    if (wy0Var2.Yi7zF1RB1(j, false, this) == qhVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    break;
                }
                break;
            case 2:
                int i4 = this.JFJ3QoxA;
                if (i4 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    wy0 wy0Var3 = oy0Var.YXi2hvwn7WL;
                    long j2 = this.E7jCp8Ls;
                    this.JFJ3QoxA = 1;
                    if (wy0Var3.Yi7zF1RB1(j2, true, this) == qhVar) {
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
            default:
                int i5 = this.JFJ3QoxA;
                if (i5 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    long j3 = this.E7jCp8Ls;
                    wy0 wy0Var4 = oy0Var.YXi2hvwn7WL;
                    this.JFJ3QoxA = 1;
                    Object GWasM1elztuh = hy0.GWasM1elztuh(wy0Var4, j3, this);
                    if (GWasM1elztuh == qhVar) {
                        break;
                    }
                } else if (i5 != 1) {
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
        switch (this.mOu10nynGul) {
            case 0:
                return new my0(this.rQPn8YBR, this.E7jCp8Ls, vgVar, 0);
            case 1:
                return new my0(this.rQPn8YBR, this.E7jCp8Ls, vgVar, 1);
            case 2:
                return new my0(this.rQPn8YBR, this.E7jCp8Ls, vgVar, 2);
            default:
                my0 my0Var = new my0(this.rQPn8YBR, vgVar);
                my0Var.E7jCp8Ls = ((uk0) obj).GWasM1elztuh;
                return my0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my0(oy0 oy0Var, vg vgVar) {
        super(2, vgVar);
        this.mOu10nynGul = 3;
        this.rQPn8YBR = oy0Var;
    }
}
