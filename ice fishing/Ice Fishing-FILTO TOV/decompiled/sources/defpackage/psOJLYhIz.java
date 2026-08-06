package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class psOJLYhIz extends h50 implements wu {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;
    public final /* synthetic */ Object encWxUiV2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ psOJLYhIz(int i, Object obj, Object obj2) {
        super(0);
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = obj;
        this.encWxUiV2 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [he0] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [he0] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [rg0] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [rg0] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.wu
    public final Object GWasM1elztuh() {
        boolean dispatchKeyEvent;
        d01 d01Var;
        g60 g60Var;
        int i = this.EljAMC1QTz;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj = this.encWxUiV2;
        Object obj2 = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                break;
            case 1:
                i iVar = (i) obj;
                yx0 yx0Var = (yx0) obj2;
                sx0 sx0Var = yx0Var.mOu10nynGul;
                sx0 sx0Var2 = yx0Var.JFJ3QoxA;
                Float f = yx0Var.AvO7iQsrTN;
                Float f2 = yx0Var.encWxUiV2;
                float floatValue = (sx0Var == null || f == null) ? 0.0f : ((Number) sx0Var.GWasM1elztuh.GWasM1elztuh()).floatValue() - f.floatValue();
                float floatValue2 = (sx0Var2 == null || f2 == null) ? 0.0f : ((Number) sx0Var2.GWasM1elztuh.GWasM1elztuh()).floatValue() - f2.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    int mE4lRynR = iVar.mE4lRynR(yx0Var.OOA6hdeuvCS);
                    f01 f01Var = (f01) iVar.rQPn8YBR().Yi7zF1RB1(iVar.iwATDS1i01k);
                    if (f01Var != null) {
                        try {
                            SyyZR548qbcW syyZR548qbcW = iVar.YmKjaVtbfp5Z;
                            if (syyZR548qbcW != null) {
                                syyZR548qbcW.GWasM1elztuh.setBoundsInScreen(iVar.X1lG3V04pd(f01Var));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    f01 f01Var2 = (f01) iVar.rQPn8YBR().Yi7zF1RB1(iVar.WIEu4Ya2g8);
                    if (f01Var2 != null) {
                        try {
                            SyyZR548qbcW syyZR548qbcW2 = iVar.Mjvvu5DE;
                            if (syyZR548qbcW2 != null) {
                                syyZR548qbcW2.GWasM1elztuh.setBoundsInScreen(iVar.X1lG3V04pd(f01Var2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    iVar.encWxUiV2.invalidate();
                    f01 f01Var3 = (f01) iVar.rQPn8YBR().Yi7zF1RB1(mE4lRynR);
                    if (f01Var3 != null && (d01Var = f01Var3.GWasM1elztuh) != null && (g60Var = d01Var.X1lG3V04pd) != null) {
                        if (sx0Var != null) {
                            iVar.jivtDDk9H.encWxUiV2(mE4lRynR, sx0Var);
                        }
                        if (sx0Var2 != null) {
                            iVar.Y6hRI1cF8.encWxUiV2(mE4lRynR, sx0Var2);
                        }
                        iVar.iwATDS1i01k(g60Var);
                    }
                }
                if (sx0Var != null) {
                    yx0Var.AvO7iQsrTN = (Float) sx0Var.GWasM1elztuh.GWasM1elztuh();
                }
                if (sx0Var2 != null) {
                    yx0Var.encWxUiV2 = (Float) sx0Var2.GWasM1elztuh.GWasM1elztuh();
                    break;
                }
                break;
            case 2:
                wu wuVar = (wu) obj2;
                if (wuVar != null && (r10 = (kt0) wuVar.GWasM1elztuh()) != null) {
                    break;
                } else {
                    bk0 bk0Var = (bk0) obj;
                    if (!bk0Var.iK7aQfvhG().Mjvvu5DE) {
                        bk0Var = null;
                    }
                    if (bk0Var != null) {
                        break;
                    }
                }
                break;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                ((d9) obj2).Y6hRI1cF8.mOu10nynGul((e9) obj);
                break;
            case 4:
                ((rt0) obj2).OOA6hdeuvCS = ((rt) obj).XmVeRDAr();
                break;
            case 5:
                ((kz) obj2).xqGvceK5x((he0) obj);
                break;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                xj0 xj0Var = ((g60) obj2).A1EKNP6CxJ;
                rt0 rt0Var = (rt0) obj;
                if ((xj0Var.EljAMC1QTz.encWxUiV2 & 8) != 0) {
                    for (he0 he0Var = xj0Var.OOA6hdeuvCS; he0Var != null; he0Var = he0Var.mOu10nynGul) {
                        if ((he0Var.AvO7iQsrTN & 8) != 0) {
                            yk ykVar = he0Var;
                            ?? r6 = 0;
                            while (ykVar != 0) {
                                if (ykVar instanceof b01) {
                                    b01 b01Var = (b01) ykVar;
                                    if (b01Var.ZCWXqiC0()) {
                                        zz0 zz0Var = new zz0();
                                        rt0Var.OOA6hdeuvCS = zz0Var;
                                        zz0Var.encWxUiV2 = true;
                                    }
                                    if (b01Var.JFXS9W1rB5s4()) {
                                        ((zz0) rt0Var.OOA6hdeuvCS).AvO7iQsrTN = true;
                                    }
                                    b01Var.Uxq83abb04((l01) rt0Var.OOA6hdeuvCS);
                                } else if ((ykVar.AvO7iQsrTN & 8) != 0 && (ykVar instanceof yk)) {
                                    he0 he0Var2 = ykVar.jivtDDk9H;
                                    int i2 = 0;
                                    ykVar = ykVar;
                                    r6 = r6;
                                    while (he0Var2 != null) {
                                        if ((he0Var2.AvO7iQsrTN & 8) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
                                                ykVar = he0Var2;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new rg0(new he0[16]);
                                                }
                                                if (ykVar != 0) {
                                                    r6.Yi7zF1RB1(ykVar);
                                                    ykVar = 0;
                                                }
                                                r6.Yi7zF1RB1(he0Var2);
                                            }
                                        }
                                        he0Var2 = he0Var2.JFJ3QoxA;
                                        ykVar = ykVar;
                                        r6 = r6;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                ykVar = vc0.E7jCp8Ls(r6);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                yu0 yu0Var = bk0.z19UFEN2I;
                ((hv) obj2).mOu10nynGul(yu0Var);
                bk0 bk0Var2 = (bk0) obj;
                boolean rQPn8YBR = o30.rQPn8YBR(bk0Var2.eUH21U3apd, yu0Var.uFEq9NpZ);
                boolean z = bk0Var2.A1EKNP6CxJ;
                boolean z2 = yu0Var.iwATDS1i01k;
                boolean z3 = z != z2;
                if (!rQPn8YBR || z3) {
                    bk0Var2.eUH21U3apd = yu0Var.uFEq9NpZ;
                    bk0Var2.A1EKNP6CxJ = z2;
                    if (bk0Var2.MZhzXH72 && (z3 || (z2 && !rQPn8YBR))) {
                        bk0Var2.mE4lRynR.AEn1Rrio();
                    }
                }
                bk0Var2.MZhzXH72 = true;
                yu0Var.jivtDDk9H = yu0Var.uFEq9NpZ.GWasM1elztuh(yu0Var.WIEu4Ya2g8, yu0Var.Mjvvu5DE, yu0Var.YmKjaVtbfp5Z);
                break;
        }
        return kc1Var;
    }
}
