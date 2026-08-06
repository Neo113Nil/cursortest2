package defpackage;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class g01 {
    public final g60 GWasM1elztuh;
    public final s20 X1lG3V04pd;
    public final zp Yi7zF1RB1;
    public final ag0 xqGvceK5x = new ag0(2);

    public g01(g60 g60Var, zp zpVar, rf0 rf0Var) {
        this.GWasM1elztuh = g60Var;
        this.Yi7zF1RB1 = zpVar;
        this.X1lG3V04pd = rf0Var;
    }

    public final d01 GWasM1elztuh() {
        return new d01(this.Yi7zF1RB1, false, this.GWasM1elztuh, new zz0());
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
    public final void Yi7zF1RB1(g60 g60Var, zz0 zz0Var) {
        String str;
        String str2;
        w91 w91Var;
        w91 w91Var2;
        p0 p0Var;
        boolean z;
        boolean z2;
        AutofillValue forToggle;
        AutofillValue forText;
        ag0 ag0Var = this.xqGvceK5x;
        Object[] objArr = ag0Var.GWasM1elztuh;
        int i = ag0Var.Yi7zF1RB1;
        for (int i2 = 0; i2 < i; i2++) {
            VJUcwvGgb9W vJUcwvGgb9W = (VJUcwvGgb9W) objArr[i2];
            j6IIN2O8eOU j6iin2o8eou = vJUcwvGgb9W.OOA6hdeuvCS;
            c cVar = vJUcwvGgb9W.AvO7iQsrTN;
            zz0 WdrkLMV3xh = g60Var.WdrkLMV3xh();
            int i3 = g60Var.EljAMC1QTz;
            if (zz0Var != null) {
                Object AvO7iQsrTN = zz0Var.OOA6hdeuvCS.AvO7iQsrTN(h01.ozMwhSAI);
                if (AvO7iQsrTN == null) {
                    AvO7iQsrTN = null;
                }
                u3 u3Var = (u3) AvO7iQsrTN;
                if (u3Var != null) {
                    str = u3Var.EljAMC1QTz;
                    if (WdrkLMV3xh != null) {
                        Object AvO7iQsrTN2 = WdrkLMV3xh.OOA6hdeuvCS.AvO7iQsrTN(h01.ozMwhSAI);
                        if (AvO7iQsrTN2 == null) {
                            AvO7iQsrTN2 = null;
                        }
                        u3 u3Var2 = (u3) AvO7iQsrTN2;
                        if (u3Var2 != null) {
                            str2 = u3Var2.EljAMC1QTz;
                            if (str != str2) {
                                if (str == null) {
                                    j6iin2o8eou.uFEq9NpZ(cVar, i3, true);
                                } else if (str2 == null) {
                                    j6iin2o8eou.uFEq9NpZ(cVar, i3, false);
                                } else if (o30.rQPn8YBR((x) n4.rQPn8YBR(WdrkLMV3xh, h01.mE4lRynR), b9xEq24R1.WdrkLMV3xh)) {
                                    if (str2.length() >= 5000) {
                                        str2 = (Character.isHighSurrogate(str2.charAt(4999)) && Character.isLowSurrogate(str2.charAt(5000))) ? b61.mqNvfisv7(str2, 4999) : b61.mqNvfisv7(str2, 5000);
                                    }
                                    forText = AutofillValue.forText(str2);
                                    ((AutofillManager) j6iin2o8eou.EljAMC1QTz).notifyValueChanged(cVar, i3, forText);
                                }
                            }
                            if (zz0Var != null) {
                                Object AvO7iQsrTN3 = zz0Var.OOA6hdeuvCS.AvO7iQsrTN(h01.A1EKNP6CxJ);
                                if (AvO7iQsrTN3 == null) {
                                    AvO7iQsrTN3 = null;
                                }
                                w91Var = (w91) AvO7iQsrTN3;
                            } else {
                                w91Var = null;
                            }
                            if (WdrkLMV3xh != null) {
                                Object AvO7iQsrTN4 = WdrkLMV3xh.OOA6hdeuvCS.AvO7iQsrTN(h01.A1EKNP6CxJ);
                                if (AvO7iQsrTN4 == null) {
                                    AvO7iQsrTN4 = null;
                                }
                                w91Var2 = (w91) AvO7iQsrTN4;
                            } else {
                                w91Var2 = null;
                            }
                            if (w91Var != w91Var2) {
                                if (w91Var == null) {
                                    j6iin2o8eou.uFEq9NpZ(cVar, i3, true);
                                } else if (w91Var2 == null) {
                                    j6iin2o8eou.uFEq9NpZ(cVar, i3, false);
                                } else if (o30.rQPn8YBR((x) n4.rQPn8YBR(WdrkLMV3xh, h01.mE4lRynR), b9xEq24R1.WRKkgoJXwDn)) {
                                    int ordinal = w91Var2.ordinal();
                                    Boolean bool = ordinal != 0 ? ordinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                                    if (bool != null) {
                                        forToggle = AutofillValue.forToggle(bool.booleanValue());
                                        ((AutofillManager) j6iin2o8eou.EljAMC1QTz).notifyValueChanged(cVar, i3, forToggle);
                                    }
                                }
                            }
                            if (zz0Var != null) {
                                Object AvO7iQsrTN5 = zz0Var.OOA6hdeuvCS.AvO7iQsrTN(h01.jivtDDk9H);
                                if (AvO7iQsrTN5 == null) {
                                    AvO7iQsrTN5 = null;
                                }
                                p0Var = (p0) AvO7iQsrTN5;
                            } else {
                                p0Var = null;
                            }
                            if (WdrkLMV3xh != null) {
                                Object AvO7iQsrTN6 = WdrkLMV3xh.OOA6hdeuvCS.AvO7iQsrTN(h01.jivtDDk9H);
                                r11 = AvO7iQsrTN6 != 0 ? AvO7iQsrTN6 : null;
                            }
                            if (!o30.rQPn8YBR(p0Var, r11)) {
                                if (p0Var == null) {
                                    j6iin2o8eou.uFEq9NpZ(cVar, i3, true);
                                } else if (r11 == null) {
                                    j6iin2o8eou.uFEq9NpZ(cVar, i3, false);
                                } else {
                                    ((AutofillManager) j6iin2o8eou.EljAMC1QTz).notifyValueChanged(cVar, i3, r11.GWasM1elztuh);
                                }
                            }
                            z = zz0Var == null && zz0Var.OOA6hdeuvCS.Yi7zF1RB1(h01.Mjvvu5DE);
                            z2 = WdrkLMV3xh == null && WdrkLMV3xh.OOA6hdeuvCS.Yi7zF1RB1(h01.Mjvvu5DE);
                            if (z != z2) {
                                sf0 sf0Var = vJUcwvGgb9W.rQPn8YBR;
                                if (z2) {
                                    sf0Var.GWasM1elztuh(i3);
                                } else {
                                    sf0Var.OOA6hdeuvCS(i3);
                                }
                            }
                        }
                    }
                    str2 = null;
                    if (str != str2) {
                    }
                    if (zz0Var != null) {
                    }
                    if (WdrkLMV3xh != null) {
                    }
                    if (w91Var != w91Var2) {
                    }
                    if (zz0Var != null) {
                    }
                    if (WdrkLMV3xh != null) {
                    }
                    if (!o30.rQPn8YBR(p0Var, r11)) {
                    }
                    if (zz0Var == null) {
                    }
                    if (WdrkLMV3xh == null) {
                    }
                    if (z != z2) {
                    }
                }
            }
            str = null;
            if (WdrkLMV3xh != null) {
            }
            str2 = null;
            if (str != str2) {
            }
            if (zz0Var != null) {
            }
            if (WdrkLMV3xh != null) {
            }
            if (w91Var != w91Var2) {
            }
            if (zz0Var != null) {
            }
            if (WdrkLMV3xh != null) {
            }
            if (!o30.rQPn8YBR(p0Var, r11)) {
            }
            if (zz0Var == null) {
            }
            if (WdrkLMV3xh == null) {
            }
            if (z != z2) {
            }
        }
    }
}
