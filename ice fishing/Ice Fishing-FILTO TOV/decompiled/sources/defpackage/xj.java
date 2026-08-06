package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xj extends d71 implements lv {
    public int JFJ3QoxA;
    public final /* synthetic */ int mOu10nynGul;
    public /* synthetic */ Object rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(u80 u80Var, int i, vg vgVar) {
        super(2, vgVar);
        this.mOu10nynGul = 3;
        this.rQPn8YBR = u80Var;
        this.JFJ3QoxA = i;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                return ((xj) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            case 1:
                return ((xj) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            case 2:
                return ((xj) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                ((xj) uFEq9NpZ((vg) obj2, (zx0) obj)).WIEu4Ya2g8(kc1Var);
                return kc1Var;
            case 4:
                return ((xj) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            case 5:
                return ((xj) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((xj) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((xj) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            default:
                return ((xj) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
        }
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        ph phVar;
        int i = this.mOu10nynGul;
        int i2 = 7;
        kc1 kc1Var = kc1.GWasM1elztuh;
        qh qhVar = qh.OOA6hdeuvCS;
        vg vgVar = null;
        switch (i) {
            case 0:
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    pt0 pt0Var = new pt0();
                    pt0 pt0Var2 = new pt0();
                    pt0 pt0Var3 = new pt0();
                    yj yjVar = (yj) this.rQPn8YBR;
                    h21 h21Var = yjVar.mE4lRynR.GWasM1elztuh;
                    ga gaVar = new ga(pt0Var, pt0Var2, pt0Var3, yjVar, 1);
                    this.JFJ3QoxA = 1;
                    h21Var.getClass();
                    h21.mOu10nynGul(h21Var, gaVar, this);
                    break;
                } else if (i3 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    break;
                }
            case 1:
                int i4 = this.JFJ3QoxA;
                if (i4 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    ut utVar = (ut) this.rQPn8YBR;
                    this.JFJ3QoxA = 1;
                    if (rj0.uFEq9NpZ(utVar, null, this) == qhVar) {
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
            case 2:
                int i5 = this.JFJ3QoxA;
                if (i5 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    m3 m3Var = (m3) ((d) this.rQPn8YBR).AvO7iQsrTN;
                    Float f = new Float(0.0f);
                    c51 J3Xc8BaqpN8 = fb1.J3Xc8BaqpN8(0.0f, 400.0f, new Float(0.5f), 1);
                    this.JFJ3QoxA = 1;
                    if (q70.encWxUiV2(m3Var, f, J3Xc8BaqpN8, new dx0(25), this) == qhVar) {
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
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                o50.A1EKNP6CxJ(obj);
                u80 u80Var = (u80) this.rQPn8YBR;
                int i6 = this.JFJ3QoxA;
                ra raVar = u80Var.OOA6hdeuvCS;
                if (((co0) raVar.Yi7zF1RB1).AvO7iQsrTN() != i6 || ((co0) raVar.X1lG3V04pd).AvO7iQsrTN() != 0) {
                    m70 m70Var = u80Var.uFEq9NpZ;
                    m70Var.X1lG3V04pd();
                    m70Var.Yi7zF1RB1 = null;
                }
                raVar.Yi7zF1RB1(i6, 0);
                raVar.xqGvceK5x = null;
                g60 g60Var = u80Var.rQPn8YBR;
                if (g60Var != null) {
                    g60Var.rQPn8YBR();
                    break;
                }
                break;
            case 4:
                int i7 = this.JFJ3QoxA;
                if (i7 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    n8 n8Var = ((ef0) this.rQPn8YBR).AvO7iQsrTN;
                    this.JFJ3QoxA = 1;
                    Object mE4lRynR = fb1.mE4lRynR(new xqGvceK5x(n8Var, vgVar, 18), this);
                    if (mE4lRynR == qhVar) {
                        break;
                    }
                } else if (i7 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    break;
                }
                break;
            case 5:
                int i8 = this.JFJ3QoxA;
                if (i8 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    phVar = (ph) this.rQPn8YBR;
                } else if (i8 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    phVar = (ph) this.rQPn8YBR;
                    o50.A1EKNP6CxJ(obj);
                }
                while (ki1.eUH21U3apd(phVar.EljAMC1QTz())) {
                    oh0 oh0Var = new oh0(i2);
                    this.rQPn8YBR = phVar;
                    this.JFJ3QoxA = 1;
                    gh ghVar = this.EljAMC1QTz;
                    ghVar.getClass();
                    if (o50.jivtDDk9H(ghVar).X1lG3V04pd(oh0Var, this) == qhVar) {
                        break;
                    }
                }
                break;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                int i9 = this.JFJ3QoxA;
                if (i9 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    vz0 vz0Var = (vz0) this.rQPn8YBR;
                    this.JFJ3QoxA = 1;
                    if (vz0.uFEq9NpZ(vz0Var, this) == qhVar) {
                        break;
                    }
                } else if (i9 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    break;
                }
                break;
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                h71 h71Var = (h71) this.rQPn8YBR;
                int i10 = this.JFJ3QoxA;
                if (i10 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    PointerInputEventHandler pointerInputEventHandler = h71Var.Y6hRI1cF8;
                    this.JFJ3QoxA = 2;
                    if (pointerInputEventHandler.invoke(h71Var, this) == qhVar) {
                        break;
                    }
                } else if (i10 != 1 && i10 != 2) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    break;
                }
                break;
            default:
                int i11 = this.JFJ3QoxA;
                if (i11 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    pt0 pt0Var4 = new pt0();
                    o91 o91Var = (o91) this.rQPn8YBR;
                    h21 h21Var2 = o91Var.mE4lRynR.GWasM1elztuh;
                    ij ijVar = new ij(i2, pt0Var4, o91Var);
                    this.JFJ3QoxA = 1;
                    h21Var2.getClass();
                    h21.mOu10nynGul(h21Var2, ijVar, this);
                    break;
                } else if (i11 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    break;
                }
        }
        return qhVar;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = 2;
        switch (this.mOu10nynGul) {
            case 0:
                return new xj((yj) this.rQPn8YBR, vgVar, 0);
            case 1:
                return new xj((ut) this.rQPn8YBR, vgVar, 1);
            case 2:
                return new xj((d) this.rQPn8YBR, vgVar, i);
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                return new xj((u80) this.rQPn8YBR, this.JFJ3QoxA, vgVar);
            case 4:
                return new xj((ef0) this.rQPn8YBR, vgVar, 4);
            case 5:
                xj xjVar = new xj(i, vgVar);
                xjVar.rQPn8YBR = obj;
                return xjVar;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                return new xj((vz0) this.rQPn8YBR, vgVar, 6);
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                return new xj((h71) this.rQPn8YBR, vgVar, 7);
            default:
                return new xj((o91) this.rQPn8YBR, vgVar, 8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj(int i, vg vgVar) {
        super(i, vgVar);
        this.mOu10nynGul = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj(Object obj, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.rQPn8YBR = obj;
    }
}
