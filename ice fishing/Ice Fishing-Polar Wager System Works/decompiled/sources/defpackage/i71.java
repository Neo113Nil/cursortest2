package defpackage;

/* loaded from: classes.dex */
public final class i71 {
    public final defpackage.gl0 F7NU4MC0GW = new defpackage.gl0(2);
    public final defpackage.ma0 IHQe1A4L2xu;
    public final defpackage.pt oh6vYeIP;
    public final defpackage.x60 r1MBDhnF;

    public i71(defpackage.ma0 ma0Var, defpackage.pt ptVar, defpackage.xk0 xk0Var) {
        this.IHQe1A4L2xu = ma0Var;
        this.oh6vYeIP = ptVar;
        this.r1MBDhnF = xk0Var;
    }

    public final defpackage.f71 IHQe1A4L2xu() {
        return new defpackage.f71(this.oh6vYeIP, false, this.IHQe1A4L2xu, new defpackage.b71());
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
    public final void oh6vYeIP(defpackage.ma0 ma0Var, defpackage.b71 b71Var) {
        java.lang.String str;
        java.lang.String str2;
        defpackage.fh1 fh1Var;
        defpackage.fh1 fh1Var2;
        defpackage.h2 h2Var;
        boolean z;
        boolean z2;
        android.view.autofill.AutofillValue forToggle;
        android.view.autofill.AutofillValue forText;
        defpackage.gl0 gl0Var = this.F7NU4MC0GW;
        java.lang.Object[] objArr = gl0Var.IHQe1A4L2xu;
        int i = gl0Var.oh6vYeIP;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.a0 a0Var = (defpackage.a0) objArr[i2];
            defpackage.c1NqjJifC7 c1nqjjifc7 = a0Var.adDC3e2L;
            defpackage.v0 v0Var = a0Var.AARZUJiTa;
            defpackage.b71 abhbClRa = ma0Var.abhbClRa();
            int i3 = ma0Var.xiZrDbcSW0;
            if (b71Var != null) {
                java.lang.Object AARZUJiTa = b71Var.adDC3e2L.AARZUJiTa(defpackage.j71.D2vUnMij);
                if (AARZUJiTa == null) {
                    AARZUJiTa = null;
                }
                defpackage.l5 l5Var = (defpackage.l5) AARZUJiTa;
                if (l5Var != null) {
                    str = l5Var.xiZrDbcSW0;
                    if (abhbClRa != null) {
                        java.lang.Object AARZUJiTa2 = abhbClRa.adDC3e2L.AARZUJiTa(defpackage.j71.D2vUnMij);
                        if (AARZUJiTa2 == null) {
                            AARZUJiTa2 = null;
                        }
                        defpackage.l5 l5Var2 = (defpackage.l5) AARZUJiTa2;
                        if (l5Var2 != null) {
                            str2 = l5Var2.xiZrDbcSW0;
                            if (str != str2) {
                                if (str == null) {
                                    c1nqjjifc7.AARZUJiTa(v0Var, i3, true);
                                } else if (str2 == null) {
                                    c1nqjjifc7.AARZUJiTa(v0Var, i3, false);
                                } else if (defpackage.x70.QoRHpC4k((defpackage.p1) defpackage.l80.cnag84Bm(abhbClRa, defpackage.j71.EgCjBq0SZwJ), defpackage.n.abhbClRa)) {
                                    if (str2.length() >= 5000) {
                                        str2 = (java.lang.Character.isHighSurrogate(str2.charAt(4999)) && java.lang.Character.isLowSurrogate(str2.charAt(5000))) ? defpackage.rc1.JcqDrWrgMf(str2, 4999) : defpackage.rc1.JcqDrWrgMf(str2, 5000);
                                    }
                                    forText = android.view.autofill.AutofillValue.forText(str2);
                                    ((android.view.autofill.AutofillManager) c1nqjjifc7.xiZrDbcSW0).notifyValueChanged(v0Var, i3, forText);
                                }
                            }
                            if (b71Var != null) {
                                java.lang.Object AARZUJiTa3 = b71Var.adDC3e2L.AARZUJiTa(defpackage.j71.yIx6ChFVk);
                                if (AARZUJiTa3 == null) {
                                    AARZUJiTa3 = null;
                                }
                                fh1Var = (defpackage.fh1) AARZUJiTa3;
                            } else {
                                fh1Var = null;
                            }
                            if (abhbClRa != null) {
                                java.lang.Object AARZUJiTa4 = abhbClRa.adDC3e2L.AARZUJiTa(defpackage.j71.yIx6ChFVk);
                                if (AARZUJiTa4 == null) {
                                    AARZUJiTa4 = null;
                                }
                                fh1Var2 = (defpackage.fh1) AARZUJiTa4;
                            } else {
                                fh1Var2 = null;
                            }
                            if (fh1Var != fh1Var2) {
                                if (fh1Var == null) {
                                    c1nqjjifc7.AARZUJiTa(v0Var, i3, true);
                                } else if (fh1Var2 == null) {
                                    c1nqjjifc7.AARZUJiTa(v0Var, i3, false);
                                } else if (defpackage.x70.QoRHpC4k((defpackage.p1) defpackage.l80.cnag84Bm(abhbClRa, defpackage.j71.EgCjBq0SZwJ), defpackage.n.NHJTzaLwkd)) {
                                    int ordinal = fh1Var2.ordinal();
                                    java.lang.Boolean bool = ordinal != 0 ? ordinal != 1 ? null : java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
                                    if (bool != null) {
                                        forToggle = android.view.autofill.AutofillValue.forToggle(bool.booleanValue());
                                        ((android.view.autofill.AutofillManager) c1nqjjifc7.xiZrDbcSW0).notifyValueChanged(v0Var, i3, forToggle);
                                    }
                                }
                            }
                            if (b71Var != null) {
                                java.lang.Object AARZUJiTa5 = b71Var.adDC3e2L.AARZUJiTa(defpackage.j71.fnWB2E7cs);
                                if (AARZUJiTa5 == null) {
                                    AARZUJiTa5 = null;
                                }
                                h2Var = (defpackage.h2) AARZUJiTa5;
                            } else {
                                h2Var = null;
                            }
                            if (abhbClRa != null) {
                                java.lang.Object AARZUJiTa6 = abhbClRa.adDC3e2L.AARZUJiTa(defpackage.j71.fnWB2E7cs);
                                r11 = AARZUJiTa6 != 0 ? AARZUJiTa6 : null;
                            }
                            if (!defpackage.x70.QoRHpC4k(h2Var, r11)) {
                                if (h2Var == null) {
                                    c1nqjjifc7.AARZUJiTa(v0Var, i3, true);
                                } else if (r11 == null) {
                                    c1nqjjifc7.AARZUJiTa(v0Var, i3, false);
                                } else {
                                    ((android.view.autofill.AutofillManager) c1nqjjifc7.xiZrDbcSW0).notifyValueChanged(v0Var, i3, r11.IHQe1A4L2xu);
                                }
                            }
                            z = b71Var == null && b71Var.adDC3e2L.oh6vYeIP(defpackage.j71.kd6TUFXn);
                            z2 = abhbClRa == null && abhbClRa.adDC3e2L.oh6vYeIP(defpackage.j71.kd6TUFXn);
                            if (z != z2) {
                                defpackage.yk0 yk0Var = a0Var.ez2rX8ReCYw;
                                if (z2) {
                                    yk0Var.IHQe1A4L2xu(i3);
                                } else {
                                    yk0Var.adDC3e2L(i3);
                                }
                            }
                        }
                    }
                    str2 = null;
                    if (str != str2) {
                    }
                    if (b71Var != null) {
                    }
                    if (abhbClRa != null) {
                    }
                    if (fh1Var != fh1Var2) {
                    }
                    if (b71Var != null) {
                    }
                    if (abhbClRa != null) {
                    }
                    if (!defpackage.x70.QoRHpC4k(h2Var, r11)) {
                    }
                    if (b71Var == null) {
                    }
                    if (abhbClRa == null) {
                    }
                    if (z != z2) {
                    }
                }
            }
            str = null;
            if (abhbClRa != null) {
            }
            str2 = null;
            if (str != str2) {
            }
            if (b71Var != null) {
            }
            if (abhbClRa != null) {
            }
            if (fh1Var != fh1Var2) {
            }
            if (b71Var != null) {
            }
            if (abhbClRa != null) {
            }
            if (!defpackage.x70.QoRHpC4k(h2Var, r11)) {
            }
            if (b71Var == null) {
            }
            if (abhbClRa == null) {
            }
            if (z != z2) {
            }
        }
    }
}
