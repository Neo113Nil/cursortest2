package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class mi0 extends d71 implements lv {
    public /* synthetic */ Object E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ Object XnEVoBF0td1l;
    public final /* synthetic */ int mOu10nynGul = 0;
    public float rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi0(float f, vz0 vz0Var, fh0 fh0Var, vg vgVar) {
        super(2, vgVar);
        this.rQPn8YBR = f;
        this.E7jCp8Ls = vz0Var;
        this.XnEVoBF0td1l = fh0Var;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        ph phVar = (ph) obj;
        vg vgVar = (vg) obj2;
        switch (i) {
        }
        return ((mi0) uFEq9NpZ(vgVar, phVar)).WIEu4Ya2g8(kc1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b6, code lost:
    
        if (r0.jivtDDk9H(r7, r0.Yi7zF1RB1.getValue(), r11) == r4) goto L50;
     */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        Object GWasM1elztuh;
        final float YmKjaVtbfp5Z;
        ph phVar;
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj2 = this.XnEVoBF0td1l;
        qh qhVar = qh.OOA6hdeuvCS;
        switch (i) {
            case 0:
                vz0 vz0Var = (vz0) this.E7jCp8Ls;
                float f = this.rQPn8YBR;
                int i2 = this.JFJ3QoxA;
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    if (f > 0.0f) {
                        this.JFJ3QoxA = 1;
                        break;
                    }
                } else if (i2 == 1) {
                    o50.A1EKNP6CxJ(obj);
                } else if (i2 != 2) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    break;
                }
                if (f == 0.0f) {
                    fh0 fh0Var = (fh0) obj2;
                    this.JFJ3QoxA = 2;
                    qa1 qa1Var = vz0Var.OOA6hdeuvCS;
                    if (qa1Var == null || ((o30.rQPn8YBR(vz0Var.X1lG3V04pd.getValue(), fh0Var) && o30.rQPn8YBR(vz0Var.Yi7zF1RB1.getValue(), fh0Var)) || (GWasM1elztuh = zg0.GWasM1elztuh(vz0Var.E7jCp8Ls, new pz0(vz0Var, fh0Var, qa1Var, (vg) null), this)) != qhVar)) {
                        GWasM1elztuh = kc1Var;
                    }
                    if (GWasM1elztuh != qhVar) {
                    }
                    break;
                }
                break;
            case 1:
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    this.JFJ3QoxA = 1;
                    if (g2.X1lG3V04pd((g2) ((ra) this.E7jCp8Ls).X1lG3V04pd, new Float(this.rQPn8YBR), (l3) obj2, this) == qhVar) {
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
            default:
                int i4 = this.JFJ3QoxA;
                if (i4 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    ph phVar2 = (ph) this.E7jCp8Ls;
                    YmKjaVtbfp5Z = q70.YmKjaVtbfp5Z(phVar2.EljAMC1QTz());
                    phVar = phVar2;
                } else if (i4 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    YmKjaVtbfp5Z = this.rQPn8YBR;
                    phVar = (ph) this.E7jCp8Ls;
                    o50.A1EKNP6CxJ(obj);
                }
                while (fb1.YZjbz8VdP5(phVar)) {
                    final qa1 qa1Var2 = (qa1) obj2;
                    hv hvVar = new hv() { // from class: pa1
                        @Override // defpackage.hv
                        public final Object mOu10nynGul(Object obj3) {
                            long longValue = ((Long) obj3).longValue();
                            qa1 qa1Var3 = qa1.this;
                            boolean AvO7iQsrTN = qa1Var3.AvO7iQsrTN();
                            do0 do0Var = qa1Var3.AvO7iQsrTN;
                            if (!AvO7iQsrTN) {
                                if (do0Var.AvO7iQsrTN() == Long.MIN_VALUE) {
                                    do0Var.encWxUiV2(longValue);
                                    ((fo0) qa1Var3.GWasM1elztuh.GWasM1elztuh).setValue(Boolean.TRUE);
                                }
                                long AvO7iQsrTN2 = longValue - do0Var.AvO7iQsrTN();
                                float f2 = YmKjaVtbfp5Z;
                                if (f2 != 0.0f) {
                                    AvO7iQsrTN2 = vc0.DmJncFq5(AvO7iQsrTN2 / f2);
                                }
                                qa1Var3.uFEq9NpZ(AvO7iQsrTN2);
                                qa1Var3.encWxUiV2(AvO7iQsrTN2, f2 == 0.0f);
                            }
                            return kc1.GWasM1elztuh;
                        }
                    };
                    this.E7jCp8Ls = phVar;
                    this.rQPn8YBR = YmKjaVtbfp5Z;
                    this.JFJ3QoxA = 1;
                    gh ghVar = this.EljAMC1QTz;
                    ghVar.getClass();
                    if (o50.jivtDDk9H(ghVar).X1lG3V04pd(hvVar, this) == qhVar) {
                        break;
                    }
                }
                break;
        }
        return qhVar;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = this.mOu10nynGul;
        Object obj2 = this.XnEVoBF0td1l;
        switch (i) {
            case 0:
                return new mi0(this.rQPn8YBR, (vz0) this.E7jCp8Ls, (fh0) obj2, vgVar);
            case 1:
                return new mi0((ra) this.E7jCp8Ls, this.rQPn8YBR, (l3) obj2, vgVar);
            default:
                mi0 mi0Var = new mi0((qa1) obj2, vgVar);
                mi0Var.E7jCp8Ls = obj;
                return mi0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi0(ra raVar, float f, l3 l3Var, vg vgVar) {
        super(2, vgVar);
        this.E7jCp8Ls = raVar;
        this.rQPn8YBR = f;
        this.XnEVoBF0td1l = l3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi0(qa1 qa1Var, vg vgVar) {
        super(2, vgVar);
        this.XnEVoBF0td1l = qa1Var;
    }
}
