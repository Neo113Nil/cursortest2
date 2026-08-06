package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class zs0 implements hv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;
    public final /* synthetic */ Object encWxUiV2;

    public /* synthetic */ zs0(int i, int i2, Object obj, Object obj2) {
        this.OOA6hdeuvCS = i2;
        this.AvO7iQsrTN = obj;
        this.EljAMC1QTz = i;
        this.encWxUiV2 = obj2;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        xe xeVar;
        xe xeVar2;
        int i;
        boolean z;
        int i2 = this.OOA6hdeuvCS;
        int i3 = 0;
        Object obj2 = this.encWxUiV2;
        int i4 = this.EljAMC1QTz;
        Object obj3 = this.AvO7iQsrTN;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i2) {
            case 0:
                at0 at0Var = (at0) obj3;
                zf0 zf0Var = (zf0) obj2;
                xe xeVar3 = (xe) obj;
                if (at0Var.OOA6hdeuvCS == i4 && o30.rQPn8YBR(zf0Var, at0Var.EljAMC1QTz) && (xeVar3 instanceof df)) {
                    long[] jArr = zf0Var.GWasM1elztuh;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj4 = zf0Var.Yi7zF1RB1[i9];
                                        boolean z2 = zf0Var.X1lG3V04pd[i9] != i4;
                                        if (z2) {
                                            i = i6;
                                            df dfVar = (df) xeVar3;
                                            xeVar2 = xeVar3;
                                            hg0 hg0Var = dfVar.rQPn8YBR;
                                            b70.ozMwhSAI(hg0Var, obj4, at0Var);
                                            z = z2;
                                            if (obj4 instanceof ml) {
                                                ml mlVar = (ml) obj4;
                                                if (!hg0Var.X1lG3V04pd(mlVar)) {
                                                    b70.AEn1Rrio(dfVar.uFEq9NpZ, mlVar);
                                                }
                                                hg0 hg0Var2 = at0Var.AvO7iQsrTN;
                                                if (hg0Var2 != null) {
                                                    hg0Var2.rQPn8YBR(obj4);
                                                }
                                            }
                                        } else {
                                            xeVar2 = xeVar3;
                                            z = z2;
                                            i = i6;
                                        }
                                        if (z) {
                                            zf0Var.EljAMC1QTz(i9);
                                        }
                                    } else {
                                        xeVar2 = xeVar3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    xeVar3 = xeVar2;
                                }
                                xeVar = xeVar3;
                                if (i7 != i6) {
                                    break;
                                }
                            } else {
                                xeVar = xeVar3;
                            }
                            if (i5 == length) {
                                break;
                            } else {
                                i5++;
                                xeVar3 = xeVar;
                                i3 = 0;
                            }
                        }
                    }
                }
                break;
            default:
                xx0 xx0Var = (xx0) obj3;
                up0 up0Var = (up0) obj2;
                tp0 tp0Var = (tp0) obj;
                int AvO7iQsrTN = xx0Var.mE4lRynR.GWasM1elztuh.AvO7iQsrTN();
                if (AvO7iQsrTN < 0) {
                    AvO7iQsrTN = 0;
                }
                if (AvO7iQsrTN <= i4) {
                    i4 = AvO7iQsrTN;
                }
                int i10 = -i4;
                boolean z3 = xx0Var.jivtDDk9H;
                int i11 = z3 ? 0 : i10;
                if (!z3) {
                    i10 = 0;
                }
                tp0Var.OOA6hdeuvCS = true;
                tp0.rQPn8YBR(tp0Var, up0Var, i11, i10);
                tp0Var.OOA6hdeuvCS = false;
                break;
        }
        return kc1Var;
    }
}
