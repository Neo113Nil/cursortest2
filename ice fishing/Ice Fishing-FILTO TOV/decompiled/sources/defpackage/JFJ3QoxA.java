package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class JFJ3QoxA extends d71 implements lv {
    public final /* synthetic */ vr0 E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ int mOu10nynGul;
    public final /* synthetic */ bb rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JFJ3QoxA(bb bbVar, vr0 vr0Var, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.rQPn8YBR = bbVar;
        this.E7jCp8Ls = vr0Var;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        ph phVar = (ph) obj;
        vg vgVar = (vg) obj2;
        switch (i) {
        }
        return ((JFJ3QoxA) uFEq9NpZ(vgVar, phVar)).WIEu4Ya2g8(kc1Var);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        vr0 vr0Var = this.E7jCp8Ls;
        bb bbVar = this.rQPn8YBR;
        qh qhVar = qh.OOA6hdeuvCS;
        switch (i) {
            case 0:
                int i2 = this.JFJ3QoxA;
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    tf0 tf0Var = bbVar.Y6hRI1cF8;
                    if (tf0Var != null) {
                        ur0 ur0Var = new ur0(vr0Var);
                        this.JFJ3QoxA = 1;
                        if (tf0Var.GWasM1elztuh(ur0Var, this) == qhVar) {
                            break;
                        }
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
                    tf0 tf0Var2 = bbVar.Y6hRI1cF8;
                    if (tf0Var2 != null) {
                        ur0 ur0Var2 = new ur0(vr0Var);
                        this.JFJ3QoxA = 1;
                        if (tf0Var2.GWasM1elztuh(ur0Var2, this) == qhVar) {
                            break;
                        }
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
                    tf0 tf0Var3 = bbVar.Y6hRI1cF8;
                    if (tf0Var3 != null) {
                        this.JFJ3QoxA = 1;
                        if (tf0Var3.GWasM1elztuh(vr0Var, this) == qhVar) {
                            break;
                        }
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
                    tf0 tf0Var4 = bbVar.Y6hRI1cF8;
                    if (tf0Var4 != null) {
                        wr0 wr0Var = new wr0(vr0Var);
                        this.JFJ3QoxA = 1;
                        if (tf0Var4.GWasM1elztuh(wr0Var, this) == qhVar) {
                            break;
                        }
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
        int i = this.mOu10nynGul;
        vr0 vr0Var = this.E7jCp8Ls;
        bb bbVar = this.rQPn8YBR;
        switch (i) {
            case 0:
                return new JFJ3QoxA(bbVar, vr0Var, vgVar, 0);
            case 1:
                return new JFJ3QoxA(bbVar, vr0Var, vgVar, 1);
            case 2:
                return new JFJ3QoxA(bbVar, vr0Var, vgVar, 2);
            default:
                return new JFJ3QoxA(bbVar, vr0Var, vgVar, 3);
        }
    }
}
