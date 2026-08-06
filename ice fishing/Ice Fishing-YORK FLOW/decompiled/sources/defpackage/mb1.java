package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class mb1 {
    public final defpackage.sn0 JhCgjQRTAOCT = new defpackage.sn0(2);
    public final defpackage.jd0 ZpBGe2uQfcn8;
    public final defpackage.j90 fWTAfUmVKrZq;
    public final defpackage.cv giKS3J6vZuNy;

    public mb1(defpackage.jd0 jd0Var, defpackage.cv cvVar, defpackage.gn0 gn0Var) {
        this.ZpBGe2uQfcn8 = jd0Var;
        this.giKS3J6vZuNy = cvVar;
        this.fWTAfUmVKrZq = gn0Var;
    }

    public final defpackage.jb1 ZpBGe2uQfcn8() {
        return new defpackage.jb1(this.giKS3J6vZuNy, false, this.ZpBGe2uQfcn8, new defpackage.fb1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void giKS3J6vZuNy(defpackage.jd0 jd0Var, defpackage.fb1 fb1Var) {
        java.lang.String str;
        java.lang.String str2;
        defpackage.ko1 ko1Var;
        defpackage.ko1 ko1Var2;
        defpackage.o1 o1Var;
        boolean z;
        boolean z2;
        android.view.autofill.AutofillValue forToggle;
        android.view.autofill.AutofillValue forText;
        defpackage.sn0 sn0Var = this.JhCgjQRTAOCT;
        java.lang.Object[] objArr = sn0Var.ZpBGe2uQfcn8;
        int i = sn0Var.giKS3J6vZuNy;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.fOrlzjnNBRYQ forlzjnnbryq = (defpackage.fOrlzjnNBRYQ) objArr[i2];
            defpackage.k0 k0Var = forlzjnnbryq.WDYagTQQm9ns;
            defpackage.u uVar = forlzjnnbryq.QiMR8OkAhezm;
            defpackage.fb1 IJ0hOnjhPOri = jd0Var.IJ0hOnjhPOri();
            int i3 = jd0Var.oh71FJcDz6S2;
            if (fb1Var != null) {
                java.lang.Object QiMR8OkAhezm = fb1Var.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.nb1.Mearx7yMn90V);
                if (QiMR8OkAhezm == null) {
                    QiMR8OkAhezm = null;
                }
                defpackage.l6 l6Var = (defpackage.l6) QiMR8OkAhezm;
                if (l6Var != null) {
                    str = l6Var.oh71FJcDz6S2;
                    if (IJ0hOnjhPOri != null) {
                        java.lang.Object QiMR8OkAhezm2 = IJ0hOnjhPOri.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.nb1.Mearx7yMn90V);
                        if (QiMR8OkAhezm2 == null) {
                            QiMR8OkAhezm2 = null;
                        }
                        defpackage.l6 l6Var2 = (defpackage.l6) QiMR8OkAhezm2;
                        if (l6Var2 != null) {
                            str2 = l6Var2.oh71FJcDz6S2;
                            if (str != str2) {
                                if (str == null) {
                                    k0Var.s0TASMVLSWD5(uVar, i3, true);
                                } else if (str2 == null) {
                                    k0Var.s0TASMVLSWD5(uVar, i3, false);
                                } else if (defpackage.ma0.QiMR8OkAhezm((defpackage.q0) defpackage.m90.maCixPsq4ml2(IJ0hOnjhPOri, defpackage.nb1.BHfvd2J71qpO), defpackage.jVUAPb5NnIYW.oCu53ZX2v4Ju)) {
                                    if (str2.length() >= 5000) {
                                        str2 = (java.lang.Character.isHighSurrogate(str2.charAt(4999)) && java.lang.Character.isLowSurrogate(str2.charAt(5000))) ? defpackage.tg1.cCeDCHgnx5OL(str2, 4999) : defpackage.tg1.cCeDCHgnx5OL(str2, 5000);
                                    }
                                    forText = android.view.autofill.AutofillValue.forText(str2);
                                    ((android.view.autofill.AutofillManager) k0Var.oh71FJcDz6S2).notifyValueChanged(uVar, i3, forText);
                                }
                            }
                            if (fb1Var != null) {
                                java.lang.Object QiMR8OkAhezm3 = fb1Var.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.nb1.hH0RRJrNssvh);
                                if (QiMR8OkAhezm3 == null) {
                                    QiMR8OkAhezm3 = null;
                                }
                                ko1Var = (defpackage.ko1) QiMR8OkAhezm3;
                            } else {
                                ko1Var = null;
                            }
                            if (IJ0hOnjhPOri != null) {
                                java.lang.Object QiMR8OkAhezm4 = IJ0hOnjhPOri.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.nb1.hH0RRJrNssvh);
                                if (QiMR8OkAhezm4 == null) {
                                    QiMR8OkAhezm4 = null;
                                }
                                ko1Var2 = (defpackage.ko1) QiMR8OkAhezm4;
                            } else {
                                ko1Var2 = null;
                            }
                            if (ko1Var != ko1Var2) {
                                if (ko1Var == null) {
                                    k0Var.s0TASMVLSWD5(uVar, i3, true);
                                } else if (ko1Var2 == null) {
                                    k0Var.s0TASMVLSWD5(uVar, i3, false);
                                } else if (defpackage.ma0.QiMR8OkAhezm((defpackage.q0) defpackage.m90.maCixPsq4ml2(IJ0hOnjhPOri, defpackage.nb1.BHfvd2J71qpO), defpackage.jVUAPb5NnIYW.dG7RjM6DqYVL)) {
                                    int ordinal = ko1Var2.ordinal();
                                    java.lang.Boolean bool = ordinal != 0 ? ordinal != 1 ? null : java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
                                    if (bool != null) {
                                        forToggle = android.view.autofill.AutofillValue.forToggle(bool.booleanValue());
                                        ((android.view.autofill.AutofillManager) k0Var.oh71FJcDz6S2).notifyValueChanged(uVar, i3, forToggle);
                                    }
                                }
                            }
                            if (fb1Var != null) {
                                java.lang.Object QiMR8OkAhezm5 = fb1Var.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.nb1.ZVVdXbWmyCSK);
                                if (QiMR8OkAhezm5 == null) {
                                    QiMR8OkAhezm5 = null;
                                }
                                o1Var = (defpackage.o1) QiMR8OkAhezm5;
                            } else {
                                o1Var = null;
                            }
                            if (IJ0hOnjhPOri != null) {
                                java.lang.Object QiMR8OkAhezm6 = IJ0hOnjhPOri.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.nb1.ZVVdXbWmyCSK);
                                r11 = QiMR8OkAhezm6 != 0 ? QiMR8OkAhezm6 : null;
                            }
                            if (!defpackage.ma0.QiMR8OkAhezm(o1Var, r11)) {
                                if (o1Var == null) {
                                    k0Var.s0TASMVLSWD5(uVar, i3, true);
                                } else if (r11 == null) {
                                    k0Var.s0TASMVLSWD5(uVar, i3, false);
                                } else {
                                    ((android.view.autofill.AutofillManager) k0Var.oh71FJcDz6S2).notifyValueChanged(uVar, i3, r11.ZpBGe2uQfcn8);
                                }
                            }
                            z = fb1Var == null && fb1Var.WDYagTQQm9ns.giKS3J6vZuNy(defpackage.nb1.s0TASMVLSWD5);
                            z2 = IJ0hOnjhPOri == null && IJ0hOnjhPOri.WDYagTQQm9ns.giKS3J6vZuNy(defpackage.nb1.s0TASMVLSWD5);
                            if (z != z2) {
                                defpackage.hn0 hn0Var = forlzjnnbryq.fNwYGHIYeJcR;
                                if (z2) {
                                    hn0Var.ZpBGe2uQfcn8(i3);
                                } else {
                                    hn0Var.WDYagTQQm9ns(i3);
                                }
                            }
                        }
                    }
                    str2 = null;
                    if (str != str2) {
                    }
                    if (fb1Var != null) {
                    }
                    if (IJ0hOnjhPOri != null) {
                    }
                    if (ko1Var != ko1Var2) {
                    }
                    if (fb1Var != null) {
                    }
                    if (IJ0hOnjhPOri != null) {
                    }
                    if (!defpackage.ma0.QiMR8OkAhezm(o1Var, r11)) {
                    }
                    if (fb1Var == null) {
                    }
                    if (IJ0hOnjhPOri == null) {
                    }
                    if (z != z2) {
                    }
                }
            }
            str = null;
            if (IJ0hOnjhPOri != null) {
            }
            str2 = null;
            if (str != str2) {
            }
            if (fb1Var != null) {
            }
            if (IJ0hOnjhPOri != null) {
            }
            if (ko1Var != ko1Var2) {
            }
            if (fb1Var != null) {
            }
            if (IJ0hOnjhPOri != null) {
            }
            if (!defpackage.ma0.QiMR8OkAhezm(o1Var, r11)) {
            }
            if (fb1Var == null) {
            }
            if (IJ0hOnjhPOri == null) {
            }
            if (z != z2) {
            }
        }
    }
}
