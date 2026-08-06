package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class vz0 extends le {
    public final o1 AvO7iQsrTN;
    public final zg0 E7jCp8Ls;
    public long EljAMC1QTz;
    public n9 JFJ3QoxA;
    public final nz0 Mjvvu5DE;
    public qa1 OOA6hdeuvCS;
    public final nz0 WIEu4Ya2g8;
    public final fo0 X1lG3V04pd;
    public long XnEVoBF0td1l;
    public final fo0 Yi7zF1RB1;
    public float YmKjaVtbfp5Z;
    public r41 encWxUiV2;
    public oz0 iwATDS1i01k;
    public final bo0 mOu10nynGul;
    public final bh0 rQPn8YBR;
    public final ag0 uFEq9NpZ;
    public Object xqGvceK5x;
    public static final n3 mE4lRynR = new n3(0.0f);
    public static final n3 jivtDDk9H = new n3(1.0f);

    /* JADX WARN: Type inference failed for: r3v6, types: [nz0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [nz0] */
    public vz0(fh0 fh0Var) {
        super(2);
        this.Yi7zF1RB1 = z50.WRKkgoJXwDn(fh0Var);
        this.X1lG3V04pd = z50.WRKkgoJXwDn(fh0Var);
        this.xqGvceK5x = fh0Var;
        this.AvO7iQsrTN = new o1(16, this);
        this.mOu10nynGul = new bo0(0.0f);
        this.rQPn8YBR = new bh0();
        this.E7jCp8Ls = new zg0();
        this.XnEVoBF0td1l = Long.MIN_VALUE;
        this.uFEq9NpZ = new ag0();
        final int i = 0;
        this.WIEu4Ya2g8 = new hv(this) { // from class: nz0
            public final /* synthetic */ vz0 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                int i2 = i;
                kc1 kc1Var = kc1.GWasM1elztuh;
                vz0 vz0Var = this.EljAMC1QTz;
                long longValue = ((Long) obj).longValue();
                switch (i2) {
                    case 0:
                        vz0Var.XnEVoBF0td1l = longValue;
                        break;
                    default:
                        long j = longValue - vz0Var.XnEVoBF0td1l;
                        vz0Var.XnEVoBF0td1l = longValue;
                        long DmJncFq5 = vc0.DmJncFq5(j / vz0Var.YmKjaVtbfp5Z);
                        ag0 ag0Var = vz0Var.uFEq9NpZ;
                        if (ag0Var.mOu10nynGul()) {
                            Object[] objArr = ag0Var.GWasM1elztuh;
                            int i3 = ag0Var.Yi7zF1RB1;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                oz0 oz0Var = (oz0) objArr[i5];
                                vz0.mE4lRynR(oz0Var, DmJncFq5);
                                oz0Var.X1lG3V04pd = true;
                            }
                            qa1 qa1Var = vz0Var.OOA6hdeuvCS;
                            if (qa1Var != null) {
                                qa1Var.iwATDS1i01k();
                            }
                            int i6 = ag0Var.Yi7zF1RB1;
                            Object[] objArr2 = ag0Var.GWasM1elztuh;
                            x20 MZhzXH72 = o50.MZhzXH72(0, i6);
                            int i7 = MZhzXH72.OOA6hdeuvCS;
                            int i8 = MZhzXH72.EljAMC1QTz;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((oz0) objArr2[i7]).X1lG3V04pd) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            d5.JFXS9W1rB5s4(objArr2, i6 - i4, i6);
                            ag0Var.Yi7zF1RB1 -= i4;
                        }
                        oz0 oz0Var2 = vz0Var.iwATDS1i01k;
                        if (oz0Var2 != null) {
                            oz0Var2.AvO7iQsrTN = vz0Var.EljAMC1QTz;
                            vz0.mE4lRynR(oz0Var2, DmJncFq5);
                            vz0Var.cilMamHF(oz0Var2.xqGvceK5x);
                            if (oz0Var2.xqGvceK5x == 1.0f) {
                                vz0Var.iwATDS1i01k = null;
                            }
                            vz0Var.Y6hRI1cF8();
                            break;
                        }
                        break;
                }
                return kc1Var;
            }
        };
        final int i2 = 1;
        this.Mjvvu5DE = new hv(this) { // from class: nz0
            public final /* synthetic */ vz0 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                int i22 = i2;
                kc1 kc1Var = kc1.GWasM1elztuh;
                vz0 vz0Var = this.EljAMC1QTz;
                long longValue = ((Long) obj).longValue();
                switch (i22) {
                    case 0:
                        vz0Var.XnEVoBF0td1l = longValue;
                        break;
                    default:
                        long j = longValue - vz0Var.XnEVoBF0td1l;
                        vz0Var.XnEVoBF0td1l = longValue;
                        long DmJncFq5 = vc0.DmJncFq5(j / vz0Var.YmKjaVtbfp5Z);
                        ag0 ag0Var = vz0Var.uFEq9NpZ;
                        if (ag0Var.mOu10nynGul()) {
                            Object[] objArr = ag0Var.GWasM1elztuh;
                            int i3 = ag0Var.Yi7zF1RB1;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                oz0 oz0Var = (oz0) objArr[i5];
                                vz0.mE4lRynR(oz0Var, DmJncFq5);
                                oz0Var.X1lG3V04pd = true;
                            }
                            qa1 qa1Var = vz0Var.OOA6hdeuvCS;
                            if (qa1Var != null) {
                                qa1Var.iwATDS1i01k();
                            }
                            int i6 = ag0Var.Yi7zF1RB1;
                            Object[] objArr2 = ag0Var.GWasM1elztuh;
                            x20 MZhzXH72 = o50.MZhzXH72(0, i6);
                            int i7 = MZhzXH72.OOA6hdeuvCS;
                            int i8 = MZhzXH72.EljAMC1QTz;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((oz0) objArr2[i7]).X1lG3V04pd) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            d5.JFXS9W1rB5s4(objArr2, i6 - i4, i6);
                            ag0Var.Yi7zF1RB1 -= i4;
                        }
                        oz0 oz0Var2 = vz0Var.iwATDS1i01k;
                        if (oz0Var2 != null) {
                            oz0Var2.AvO7iQsrTN = vz0Var.EljAMC1QTz;
                            vz0.mE4lRynR(oz0Var2, DmJncFq5);
                            vz0Var.cilMamHF(oz0Var2.xqGvceK5x);
                            if (oz0Var2.xqGvceK5x == 1.0f) {
                                vz0Var.iwATDS1i01k = null;
                            }
                            vz0Var.Y6hRI1cF8();
                            break;
                        }
                        break;
                }
                return kc1Var;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r0.xqGvceK5x(r1) == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object WIEu4Ya2g8(vz0 vz0Var, wg wgVar) {
        uz0 uz0Var;
        int i;
        Object value;
        Object obj;
        bh0 bh0Var = vz0Var.rQPn8YBR;
        if (wgVar instanceof uz0) {
            uz0Var = (uz0) wgVar;
            int i2 = uz0Var.rQPn8YBR;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uz0Var.rQPn8YBR = i2 - Integer.MIN_VALUE;
                Object obj2 = uz0Var.mOu10nynGul;
                i = uz0Var.rQPn8YBR;
                qh qhVar = qh.OOA6hdeuvCS;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj2);
                    value = vz0Var.Yi7zF1RB1.getValue();
                    uz0Var.encWxUiV2 = value;
                    uz0Var.rQPn8YBR = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = uz0Var.encWxUiV2;
                        o50.A1EKNP6CxJ(obj2);
                        if (!o30.rQPn8YBR(obj2, obj)) {
                            vz0Var.XnEVoBF0td1l = Long.MIN_VALUE;
                            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                        }
                        return kc1.GWasM1elztuh;
                    }
                    Object obj3 = uz0Var.encWxUiV2;
                    o50.A1EKNP6CxJ(obj2);
                    value = obj3;
                }
                if (!o30.rQPn8YBR(value, vz0Var.xqGvceK5x)) {
                    bh0Var.AvO7iQsrTN(null);
                    return kc1.GWasM1elztuh;
                }
                uz0Var.encWxUiV2 = value;
                uz0Var.rQPn8YBR = 2;
                n9 n9Var = new n9(1, rj0.M3K9sHhK(uz0Var));
                n9Var.cilMamHF();
                vz0Var.JFJ3QoxA = n9Var;
                bh0Var.AvO7iQsrTN(null);
                Object jivtDDk9H2 = n9Var.jivtDDk9H();
                if (jivtDDk9H2 != qhVar) {
                    obj = value;
                    obj2 = jivtDDk9H2;
                    if (!o30.rQPn8YBR(obj2, obj)) {
                    }
                    return kc1.GWasM1elztuh;
                }
                return qhVar;
            }
        }
        uz0Var = new uz0(vz0Var, wgVar);
        Object obj22 = uz0Var.mOu10nynGul;
        i = uz0Var.rQPn8YBR;
        qh qhVar2 = qh.OOA6hdeuvCS;
        if (i != 0) {
        }
        if (!o30.rQPn8YBR(value, vz0Var.xqGvceK5x)) {
        }
    }

    public static final void XnEVoBF0td1l(vz0 vz0Var) {
        bo0 bo0Var = vz0Var.mOu10nynGul;
        qa1 qa1Var = vz0Var.OOA6hdeuvCS;
        if (qa1Var == null) {
            return;
        }
        oz0 oz0Var = vz0Var.iwATDS1i01k;
        if (oz0Var == null) {
            if (vz0Var.EljAMC1QTz <= 0 || bo0Var.AvO7iQsrTN() == 1.0f || o30.rQPn8YBR(vz0Var.X1lG3V04pd.getValue(), vz0Var.Yi7zF1RB1.getValue())) {
                oz0Var = null;
            } else {
                oz0Var = new oz0();
                oz0Var.xqGvceK5x = bo0Var.AvO7iQsrTN();
                long j = vz0Var.EljAMC1QTz;
                oz0Var.AvO7iQsrTN = j;
                oz0Var.encWxUiV2 = vc0.DmJncFq5((1.0d - bo0Var.AvO7iQsrTN()) * j);
                oz0Var.OOA6hdeuvCS.OOA6hdeuvCS(bo0Var.AvO7iQsrTN(), 0);
            }
        }
        if (oz0Var != null) {
            oz0Var.AvO7iQsrTN = vz0Var.EljAMC1QTz;
            vz0Var.uFEq9NpZ.GWasM1elztuh(oz0Var);
            qa1Var.XnEVoBF0td1l(oz0Var);
        }
        vz0Var.iwATDS1i01k = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r0.xqGvceK5x(r1) == r6) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object iwATDS1i01k(vz0 vz0Var, wg wgVar) {
        tz0 tz0Var;
        int i;
        qh qhVar;
        Object value;
        Object jivtDDk9H2;
        Object obj;
        bh0 bh0Var = vz0Var.rQPn8YBR;
        if (wgVar instanceof tz0) {
            tz0Var = (tz0) wgVar;
            int i2 = tz0Var.rQPn8YBR;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tz0Var.rQPn8YBR = i2 - Integer.MIN_VALUE;
                Object obj2 = tz0Var.mOu10nynGul;
                i = tz0Var.rQPn8YBR;
                qhVar = qh.OOA6hdeuvCS;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj2);
                    value = vz0Var.Yi7zF1RB1.getValue();
                    tz0Var.encWxUiV2 = value;
                    tz0Var.rQPn8YBR = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = tz0Var.encWxUiV2;
                        o50.A1EKNP6CxJ(obj2);
                        if (!o30.rQPn8YBR(obj2, obj)) {
                            return kc1.GWasM1elztuh;
                        }
                        vz0Var.XnEVoBF0td1l = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = tz0Var.encWxUiV2;
                    o50.A1EKNP6CxJ(obj2);
                    value = obj3;
                }
                tz0Var.encWxUiV2 = value;
                tz0Var.rQPn8YBR = 2;
                n9 n9Var = new n9(1, rj0.M3K9sHhK(tz0Var));
                n9Var.cilMamHF();
                vz0Var.JFJ3QoxA = n9Var;
                bh0Var.AvO7iQsrTN(null);
                jivtDDk9H2 = n9Var.jivtDDk9H();
                if (jivtDDk9H2 != qhVar) {
                    obj = value;
                    obj2 = jivtDDk9H2;
                    if (!o30.rQPn8YBR(obj2, obj)) {
                    }
                }
                return qhVar;
            }
        }
        tz0Var = new tz0(vz0Var, wgVar);
        Object obj22 = tz0Var.mOu10nynGul;
        i = tz0Var.rQPn8YBR;
        qhVar = qh.OOA6hdeuvCS;
        if (i != 0) {
        }
        tz0Var.encWxUiV2 = value;
        tz0Var.rQPn8YBR = 2;
        n9 n9Var2 = new n9(1, rj0.M3K9sHhK(tz0Var));
        n9Var2.cilMamHF();
        vz0Var.JFJ3QoxA = n9Var2;
        bh0Var.AvO7iQsrTN(null);
        jivtDDk9H2 = n9Var2.jivtDDk9H();
        if (jivtDDk9H2 != qhVar) {
        }
        return qhVar;
    }

    public static void mE4lRynR(oz0 oz0Var, long j) {
        long j2 = oz0Var.GWasM1elztuh + j;
        oz0Var.GWasM1elztuh = j2;
        long j3 = oz0Var.encWxUiV2;
        if (j2 >= j3) {
            oz0Var.xqGvceK5x = 1.0f;
            return;
        }
        wd1 wd1Var = oz0Var.Yi7zF1RB1;
        n3 n3Var = oz0Var.OOA6hdeuvCS;
        if (wd1Var == null) {
            float f = j2 / j3;
            oz0Var.xqGvceK5x = (f * 1.0f) + ((1.0f - f) * n3Var.GWasM1elztuh(0));
            return;
        }
        n3 n3Var2 = oz0Var.EljAMC1QTz;
        if (n3Var2 == null) {
            n3Var2 = mE4lRynR;
        }
        oz0Var.xqGvceK5x = o50.AvO7iQsrTN(((n3) wd1Var.iwATDS1i01k(j2, n3Var, jivtDDk9H, n3Var2)).GWasM1elztuh(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (defpackage.o50.jivtDDk9H(r11).X1lG3V04pd(r2, r1) == r9) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object uFEq9NpZ(vz0 vz0Var, wg wgVar) {
        qz0 qz0Var;
        int i;
        Object obj;
        ag0 ag0Var = vz0Var.uFEq9NpZ;
        if (wgVar instanceof qz0) {
            qz0Var = (qz0) wgVar;
            int i2 = qz0Var.JFJ3QoxA;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qz0Var.JFJ3QoxA = i2 - Integer.MIN_VALUE;
                gh ghVar = qz0Var.EljAMC1QTz;
                Object obj2 = qz0Var.encWxUiV2;
                i = qz0Var.JFJ3QoxA;
                kc1 kc1Var = kc1.GWasM1elztuh;
                obj = qh.OOA6hdeuvCS;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj2);
                    if (ag0Var.encWxUiV2() && vz0Var.iwATDS1i01k == null) {
                        return kc1Var;
                    }
                    ghVar.getClass();
                    if (q70.YmKjaVtbfp5Z(ghVar) == 0.0f) {
                        vz0Var.Mjvvu5DE();
                        vz0Var.XnEVoBF0td1l = Long.MIN_VALUE;
                        return kc1Var;
                    }
                    if (vz0Var.XnEVoBF0td1l == Long.MIN_VALUE) {
                        nz0 nz0Var = vz0Var.WIEu4Ya2g8;
                        qz0Var.JFJ3QoxA = 1;
                        ghVar.getClass();
                    }
                } else {
                    if (i != 1 && i != 2) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj2);
                }
                do {
                    if (ag0Var.mOu10nynGul() && vz0Var.iwATDS1i01k == null) {
                        vz0Var.XnEVoBF0td1l = Long.MIN_VALUE;
                        return kc1Var;
                    }
                    qz0Var.JFJ3QoxA = 2;
                } while (vz0Var.YmKjaVtbfp5Z(qz0Var) != obj);
                return obj;
            }
        }
        qz0Var = new qz0(vz0Var, wgVar);
        gh ghVar2 = qz0Var.EljAMC1QTz;
        Object obj22 = qz0Var.encWxUiV2;
        i = qz0Var.JFJ3QoxA;
        kc1 kc1Var2 = kc1.GWasM1elztuh;
        obj = qh.OOA6hdeuvCS;
        if (i != 0) {
        }
        do {
            if (ag0Var.mOu10nynGul()) {
            }
            qz0Var.JFJ3QoxA = 2;
        } while (vz0Var.YmKjaVtbfp5Z(qz0Var) != obj);
        return obj;
    }

    @Override // defpackage.le
    public final void E7jCp8Ls() {
        this.OOA6hdeuvCS = null;
        r41 r41Var = this.encWxUiV2;
        if (r41Var != null) {
            r41Var.GWasM1elztuh(this);
        }
    }

    @Override // defpackage.le
    public final Object EljAMC1QTz() {
        return this.X1lG3V04pd.getValue();
    }

    @Override // defpackage.le
    public final void JFJ3QoxA(Object obj) {
        this.X1lG3V04pd.setValue(obj);
    }

    public final void Mjvvu5DE() {
        qa1 qa1Var = this.OOA6hdeuvCS;
        if (qa1Var != null) {
            qa1Var.X1lG3V04pd();
        }
        this.uFEq9NpZ.xqGvceK5x();
        if (this.iwATDS1i01k != null) {
            this.iwATDS1i01k = null;
            cilMamHF(1.0f);
            Y6hRI1cF8();
        }
    }

    public final void Y6hRI1cF8() {
        qa1 qa1Var = this.OOA6hdeuvCS;
        if (qa1Var == null) {
            return;
        }
        qa1Var.E7jCp8Ls(vc0.DmJncFq5(this.mOu10nynGul.AvO7iQsrTN() * ((Number) qa1Var.E7jCp8Ls.getValue()).longValue()));
    }

    public final Object YmKjaVtbfp5Z(wg wgVar) {
        float YmKjaVtbfp5Z = q70.YmKjaVtbfp5Z(wgVar.OOA6hdeuvCS());
        kc1 kc1Var = kc1.GWasM1elztuh;
        if (YmKjaVtbfp5Z <= 0.0f) {
            Mjvvu5DE();
            return kc1Var;
        }
        this.YmKjaVtbfp5Z = YmKjaVtbfp5Z;
        Object X1lG3V04pd = o50.jivtDDk9H(wgVar.OOA6hdeuvCS()).X1lG3V04pd(this.Mjvvu5DE, wgVar);
        return X1lG3V04pd == qh.OOA6hdeuvCS ? X1lG3V04pd : kc1Var;
    }

    public final void cilMamHF(float f) {
        this.mOu10nynGul.encWxUiV2(f);
    }

    public final Object jivtDDk9H(float f, Object obj, d71 d71Var) {
        if (0.0f > f || f > 1.0f) {
            vq0.GWasM1elztuh("Expecting fraction between 0 and 1. Got " + f);
        }
        qa1 qa1Var = this.OOA6hdeuvCS;
        if (qa1Var != null) {
            Object GWasM1elztuh = zg0.GWasM1elztuh(this.E7jCp8Ls, new sz0(obj, this.Yi7zF1RB1.getValue(), this, qa1Var, f, null), d71Var);
            if (GWasM1elztuh == qh.OOA6hdeuvCS) {
                return GWasM1elztuh;
            }
        }
        return kc1.GWasM1elztuh;
    }

    public final void lv06NcmrQ(r41 r41Var) {
        el0 el0Var;
        if (o30.rQPn8YBR(this.encWxUiV2, r41Var)) {
            return;
        }
        r41 r41Var2 = this.encWxUiV2;
        if (r41Var2 != null) {
            r41Var2.GWasM1elztuh(this);
        }
        r41 r41Var3 = this.encWxUiV2;
        if (r41Var3 != null && (el0Var = r41Var3.encWxUiV2) != null) {
            el0Var.GWasM1elztuh();
        }
        this.encWxUiV2 = r41Var;
        if (r41Var != null) {
            r41Var.xqGvceK5x();
        }
        r41 r41Var4 = this.encWxUiV2;
        if (r41Var4 != null) {
            r41Var4.X1lG3V04pd(this, o30.mE4lRynR, this.AvO7iQsrTN);
        }
    }

    @Override // defpackage.le
    public final void rQPn8YBR(qa1 qa1Var) {
        qa1 qa1Var2 = this.OOA6hdeuvCS;
        if (qa1Var2 != null && qa1Var != qa1Var2) {
            vq0.Yi7zF1RB1("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.OOA6hdeuvCS + ", new instance: " + qa1Var);
        }
        this.OOA6hdeuvCS = qa1Var;
    }
}
