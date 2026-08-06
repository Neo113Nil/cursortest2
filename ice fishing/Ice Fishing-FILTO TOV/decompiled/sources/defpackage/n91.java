package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class n91 extends d71 implements lv {
    public /* synthetic */ float E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ int mOu10nynGul;
    public final /* synthetic */ Object rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n91(o91 o91Var, float f, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.rQPn8YBR = o91Var;
        this.E7jCp8Ls = f;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                return ((n91) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            case 1:
                return ((n91) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            default:
                return ((n91) uFEq9NpZ((vg) obj2, Float.valueOf(((Number) obj).floatValue()))).WIEu4Ya2g8(kc1Var);
        }
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        qh qhVar = qh.OOA6hdeuvCS;
        Object obj2 = this.rQPn8YBR;
        switch (i) {
            case 0:
                o91 o91Var = (o91) obj2;
                int i2 = this.JFJ3QoxA;
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    g2 g2Var = o91Var.WdrkLMV3xh;
                    if (g2Var == null) {
                        return kc1Var;
                    }
                    Float f = new Float(this.E7jCp8Ls);
                    l3 l3Var = o91Var.cilMamHF ? l71.EljAMC1QTz : o91Var.Y6hRI1cF8;
                    this.JFJ3QoxA = 1;
                    obj = g2.X1lG3V04pd(g2Var, f, l3Var, this);
                    if (obj == qhVar) {
                        return qhVar;
                    }
                } else {
                    if (i2 != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj);
                }
                return kc1Var;
            case 1:
                o91 o91Var2 = (o91) obj2;
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    g2 g2Var2 = o91Var2.lv06NcmrQ;
                    if (g2Var2 == null) {
                        return kc1Var;
                    }
                    Float f2 = new Float(this.E7jCp8Ls);
                    l3 l3Var2 = o91Var2.cilMamHF ? l71.EljAMC1QTz : o91Var2.Y6hRI1cF8;
                    this.JFJ3QoxA = 1;
                    obj = g2.X1lG3V04pd(g2Var2, f2, l3Var2, this);
                    if (obj == qhVar) {
                        return qhVar;
                    }
                } else {
                    if (i3 != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj);
                }
                return kc1Var;
            default:
                ie ieVar = (ie) obj2;
                int i4 = this.JFJ3QoxA;
                if (i4 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    float f3 = this.E7jCp8Ls;
                    Object AvO7iQsrTN = ieVar.GWasM1elztuh.xqGvceK5x.OOA6hdeuvCS.AvO7iQsrTN(yz0.OOA6hdeuvCS);
                    lv lvVar = (lv) (AvO7iQsrTN != null ? AvO7iQsrTN : null);
                    if (lvVar == null) {
                        throw mr0.EljAMC1QTz("Required value was null.");
                    }
                    uk0 uk0Var = new uk0((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
                    this.JFJ3QoxA = 1;
                    obj = lvVar.EljAMC1QTz(uk0Var, this);
                    if (obj == qhVar) {
                        return qhVar;
                    }
                } else {
                    if (i4 != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((uk0) obj).GWasM1elztuh & 4294967295L)));
        }
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = this.mOu10nynGul;
        Object obj2 = this.rQPn8YBR;
        switch (i) {
            case 0:
                return new n91((o91) obj2, this.E7jCp8Ls, vgVar, 0);
            case 1:
                return new n91((o91) obj2, this.E7jCp8Ls, vgVar, 1);
            default:
                n91 n91Var = new n91((ie) obj2, vgVar);
                n91Var.E7jCp8Ls = ((Number) obj).floatValue();
                return n91Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n91(ie ieVar, vg vgVar) {
        super(2, vgVar);
        this.mOu10nynGul = 2;
        this.rQPn8YBR = ieVar;
    }
}
