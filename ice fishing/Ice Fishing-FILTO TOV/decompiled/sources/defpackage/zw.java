package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class zw extends d71 implements lv {
    public int JFJ3QoxA;
    public final /* synthetic */ int mOu10nynGul;
    public final /* synthetic */ kx rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(kx kxVar, int i, vg vgVar) {
        super(2, vgVar);
        this.mOu10nynGul = 0;
        this.rQPn8YBR = kxVar;
        this.JFJ3QoxA = i;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        ph phVar = (ph) obj;
        vg vgVar = (vg) obj2;
        switch (i) {
            case 0:
                ((zw) uFEq9NpZ(vgVar, phVar)).WIEu4Ya2g8(kc1Var);
                break;
        }
        return ((zw) uFEq9NpZ(vgVar, phVar)).WIEu4Ya2g8(kc1Var);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        qh qhVar = qh.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        kx kxVar = this.rQPn8YBR;
        int i2 = 1;
        switch (i) {
            case 0:
                o50.A1EKNP6CxJ(obj);
                kxVar.EljAMC1QTz.mE4lRynR(new gw(this.JFJ3QoxA));
                break;
            case 1:
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    jj jjVar = kxVar.AvO7iQsrTN.Yi7zF1RB1;
                    fx fxVar = new fx(kxVar, 0);
                    this.JFJ3QoxA = 1;
                    if (jjVar.GWasM1elztuh(fxVar, this) == qhVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                }
                break;
            default:
                int i4 = this.JFJ3QoxA;
                if (i4 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    si siVar = kxVar.encWxUiV2.Yi7zF1RB1;
                    fx fxVar2 = new fx(kxVar, i2);
                    this.JFJ3QoxA = 1;
                    if (siVar.GWasM1elztuh(fxVar2, this) == qhVar) {
                        break;
                    }
                } else if (i4 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                }
                break;
        }
        return kc1Var;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = this.mOu10nynGul;
        kx kxVar = this.rQPn8YBR;
        switch (i) {
            case 0:
                return new zw(kxVar, this.JFJ3QoxA, vgVar);
            case 1:
                return new zw(kxVar, vgVar, 1);
            default:
                return new zw(kxVar, vgVar, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw(kx kxVar, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.rQPn8YBR = kxVar;
    }
}
