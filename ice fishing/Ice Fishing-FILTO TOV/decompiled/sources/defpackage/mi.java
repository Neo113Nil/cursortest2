package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class mi extends d71 implements lv {
    public int JFJ3QoxA;
    public final /* synthetic */ int mOu10nynGul;
    public final /* synthetic */ fj rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mi(fj fjVar, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.rQPn8YBR = fjVar;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                return ((mi) uFEq9NpZ((vg) obj2, (ms) obj)).WIEu4Ya2g8(kc1Var);
            case 1:
                return ((mi) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            default:
                return ((mi) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r10 == r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (defpackage.fj.EljAMC1QTz(r6, r9) == r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
    
        if (r10 == r5) goto L41;
     */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        qh qhVar = qh.OOA6hdeuvCS;
        fj fjVar = this.rQPn8YBR;
        int i2 = 2;
        switch (i) {
            case 0:
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    this.JFJ3QoxA = 1;
                    return fj.OOA6hdeuvCS(fjVar, this) == qhVar ? qhVar : kc1Var;
                }
                if (i3 == 1) {
                    o50.A1EKNP6CxJ(obj);
                    return kc1Var;
                }
                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i4 = this.JFJ3QoxA;
                if (i4 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    rx0 rx0Var = fjVar.encWxUiV2;
                    this.JFJ3QoxA = 1;
                    Object iriv6doqetn = ((rc) rx0Var.EljAMC1QTz).iriv6doqetn(this);
                    if (iriv6doqetn != qhVar) {
                        iriv6doqetn = kc1Var;
                        break;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            o50.A1EKNP6CxJ(obj);
                            return kc1Var;
                        }
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj);
                }
                ls iwATDS1i01k = rj0.iwATDS1i01k(fjVar.mOu10nynGul().X1lG3V04pd, -1);
                v8 v8Var = new v8(i2, fjVar);
                this.JFJ3QoxA = 2;
                if (iwATDS1i01k.GWasM1elztuh(v8Var, this) != qhVar) {
                    return kc1Var;
                }
                return qhVar;
            default:
                j6IIN2O8eOU j6iin2o8eou = fjVar.AvO7iQsrTN;
                int i5 = this.JFJ3QoxA;
                try {
                    if (i5 == 0) {
                        o50.A1EKNP6CxJ(obj);
                        if (!(j6iin2o8eou.AvO7iQsrTN() instanceof wr)) {
                            this.JFJ3QoxA = 1;
                            break;
                        } else {
                            return j6iin2o8eou.AvO7iQsrTN();
                        }
                    } else {
                        if (i5 != 1) {
                            if (i5 == 2) {
                                o50.A1EKNP6CxJ(obj);
                                return (l51) obj;
                            }
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o50.A1EKNP6CxJ(obj);
                    }
                    this.JFJ3QoxA = 2;
                    obj = fj.AvO7iQsrTN(fjVar, false, this);
                    break;
                } catch (Throwable th) {
                    return new vs0(th, -1);
                }
        }
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = this.mOu10nynGul;
        fj fjVar = this.rQPn8YBR;
        switch (i) {
            case 0:
                return new mi(fjVar, vgVar, 0);
            case 1:
                return new mi(fjVar, vgVar, 1);
            default:
                return new mi(fjVar, vgVar, 2);
        }
    }
}
