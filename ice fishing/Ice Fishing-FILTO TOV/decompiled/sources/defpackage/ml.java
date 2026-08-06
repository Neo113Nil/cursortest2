package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ml extends t51 implements m51 {
    public final k41 AvO7iQsrTN;
    public final wu EljAMC1QTz;
    public ll encWxUiV2 = new ll(e41.JFJ3QoxA().AvO7iQsrTN());

    public ml(wu wuVar, b9xEq24R1 b9xeq24r1) {
        this.EljAMC1QTz = wuVar;
        this.AvO7iQsrTN = b9xeq24r1;
    }

    public final ll AvO7iQsrTN(ll llVar, y31 y31Var, boolean z, wu wuVar) {
        rg0 uFEq9NpZ;
        k41 k41Var;
        int i;
        ll llVar2 = llVar;
        if (llVar2.X1lG3V04pd(this, y31Var)) {
            if (z) {
                uFEq9NpZ = z50.uFEq9NpZ();
                Object[] objArr = uFEq9NpZ.OOA6hdeuvCS;
                int i2 = uFEq9NpZ.AvO7iQsrTN;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((px) objArr[i3]).Yi7zF1RB1();
                }
                try {
                    zf0 zf0Var = llVar2.OOA6hdeuvCS;
                    f4 f4Var = l41.GWasM1elztuh;
                    z20 z20Var = (z20) f4Var.OOA6hdeuvCS();
                    if (z20Var == null) {
                        z20Var = new z20();
                        f4Var.WIEu4Ya2g8(z20Var);
                    }
                    int i4 = z20Var.GWasM1elztuh;
                    Object[] objArr2 = zf0Var.Yi7zF1RB1;
                    int[] iArr = zf0Var.X1lG3V04pd;
                    long[] jArr = zf0Var.GWasM1elztuh;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        s51 s51Var = (s51) objArr2[i9];
                                        i = i6;
                                        z20Var.GWasM1elztuh = i4 + iArr[i9];
                                        hv OOA6hdeuvCS = y31Var.OOA6hdeuvCS();
                                        if (OOA6hdeuvCS != null) {
                                            OOA6hdeuvCS.mOu10nynGul(s51Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    z20Var.GWasM1elztuh = i4;
                    Object[] objArr3 = uFEq9NpZ.OOA6hdeuvCS;
                    int i10 = uFEq9NpZ.AvO7iQsrTN;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((px) objArr3[i11]).GWasM1elztuh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return llVar2;
        }
        zf0 zf0Var2 = new zf0();
        f4 f4Var2 = l41.GWasM1elztuh;
        z20 z20Var2 = (z20) f4Var2.OOA6hdeuvCS();
        if (z20Var2 == null) {
            z20Var2 = new z20();
            f4Var2.WIEu4Ya2g8(z20Var2);
        }
        int i12 = z20Var2.GWasM1elztuh;
        uFEq9NpZ = z50.uFEq9NpZ();
        Object[] objArr4 = uFEq9NpZ.OOA6hdeuvCS;
        int i13 = uFEq9NpZ.AvO7iQsrTN;
        for (int i14 = 0; i14 < i13; i14++) {
            ((px) objArr4[i14]).Yi7zF1RB1();
        }
        try {
            z20Var2.GWasM1elztuh = i12 + 1;
            Object k8h8IjolWQ = d70.k8h8IjolWQ(new d5idzIhj55b(this, z20Var2, zf0Var2, i12), wuVar);
            z20Var2.GWasM1elztuh = i12;
            Object[] objArr5 = uFEq9NpZ.OOA6hdeuvCS;
            int i15 = uFEq9NpZ.AvO7iQsrTN;
            for (int i16 = 0; i16 < i15; i16++) {
                ((px) objArr5[i16]).GWasM1elztuh();
            }
            Object obj = e41.X1lG3V04pd;
            synchronized (obj) {
                try {
                    y31 JFJ3QoxA = e41.JFJ3QoxA();
                    Object obj2 = llVar2.EljAMC1QTz;
                    if (obj2 == ll.encWxUiV2 || (k41Var = this.AvO7iQsrTN) == null || !k41Var.X1lG3V04pd(k8h8IjolWQ, obj2)) {
                        ll llVar3 = this.encWxUiV2;
                        synchronized (obj) {
                            u51 XnEVoBF0td1l = e41.XnEVoBF0td1l(llVar3, this);
                            XnEVoBF0td1l.GWasM1elztuh(llVar3);
                            XnEVoBF0td1l.GWasM1elztuh = JFJ3QoxA.AvO7iQsrTN();
                            llVar2 = (ll) XnEVoBF0td1l;
                            llVar2.OOA6hdeuvCS = zf0Var2;
                            llVar2.AvO7iQsrTN = llVar2.xqGvceK5x(this, JFJ3QoxA);
                            llVar2.EljAMC1QTz = k8h8IjolWQ;
                        }
                        return llVar2;
                    }
                    llVar2.OOA6hdeuvCS = zf0Var2;
                    llVar2.AvO7iQsrTN = llVar2.xqGvceK5x(this, JFJ3QoxA);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            z20 z20Var3 = (z20) l41.GWasM1elztuh.OOA6hdeuvCS();
            if (z20Var3 == null || z20Var3.GWasM1elztuh != 0) {
                return llVar2;
            }
            e41.JFJ3QoxA().XnEVoBF0td1l();
            synchronized (obj) {
                y31 JFJ3QoxA2 = e41.JFJ3QoxA();
                llVar2.X1lG3V04pd = JFJ3QoxA2.AvO7iQsrTN();
                llVar2.xqGvceK5x = JFJ3QoxA2.encWxUiV2();
                return llVar2;
            }
        } finally {
            Object[] objArr6 = uFEq9NpZ.OOA6hdeuvCS;
            int i17 = uFEq9NpZ.AvO7iQsrTN;
            for (int i18 = 0; i18 < i17; i18++) {
                ((px) objArr6[i18]).GWasM1elztuh();
            }
        }
    }

    @Override // defpackage.s51
    public final u51 GWasM1elztuh() {
        return this.encWxUiV2;
    }

    @Override // defpackage.s51
    public final void X1lG3V04pd(u51 u51Var) {
        u51Var.getClass();
        this.encWxUiV2 = (ll) u51Var;
    }

    public final ll encWxUiV2() {
        y31 JFJ3QoxA = e41.JFJ3QoxA();
        return AvO7iQsrTN((ll) e41.mOu10nynGul(this.encWxUiV2, JFJ3QoxA), JFJ3QoxA, false, this.EljAMC1QTz);
    }

    @Override // defpackage.m51
    public final Object getValue() {
        hv OOA6hdeuvCS = e41.JFJ3QoxA().OOA6hdeuvCS();
        if (OOA6hdeuvCS != null) {
            OOA6hdeuvCS.mOu10nynGul(this);
        }
        y31 JFJ3QoxA = e41.JFJ3QoxA();
        return AvO7iQsrTN((ll) e41.mOu10nynGul(this.encWxUiV2, JFJ3QoxA), JFJ3QoxA, true, this.EljAMC1QTz).EljAMC1QTz;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        ll llVar = (ll) e41.encWxUiV2(this.encWxUiV2);
        sb.append(llVar.X1lG3V04pd(this, e41.JFJ3QoxA()) ? String.valueOf(llVar.EljAMC1QTz) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
