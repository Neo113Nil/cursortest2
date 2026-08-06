package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class yi1 {
    public final int JhCgjQRTAOCT;
    public final int QiMR8OkAhezm;
    public final java.lang.String WDYagTQQm9ns;
    public final java.lang.String ZpBGe2uQfcn8;
    public final boolean fWTAfUmVKrZq;
    public final java.lang.String giKS3J6vZuNy;
    public final int oh71FJcDz6S2;

    public yi1(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.String str3, int i2) {
        str.getClass();
        str2.getClass();
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = str2;
        this.fWTAfUmVKrZq = z;
        this.JhCgjQRTAOCT = i;
        this.WDYagTQQm9ns = str3;
        this.oh71FJcDz6S2 = i2;
        java.lang.String upperCase = str2.toUpperCase(java.util.Locale.ROOT);
        upperCase.getClass();
        this.QiMR8OkAhezm = defpackage.tg1.Jkfc0NcwyPL8(upperCase, "INT", false) ? 3 : (defpackage.tg1.Jkfc0NcwyPL8(upperCase, "CHAR", false) || defpackage.tg1.Jkfc0NcwyPL8(upperCase, "CLOB", false) || defpackage.tg1.Jkfc0NcwyPL8(upperCase, "TEXT", false)) ? 2 : defpackage.tg1.Jkfc0NcwyPL8(upperCase, "BLOB", false) ? 5 : (defpackage.tg1.Jkfc0NcwyPL8(upperCase, "REAL", false) || defpackage.tg1.Jkfc0NcwyPL8(upperCase, "FLOA", false) || defpackage.tg1.Jkfc0NcwyPL8(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof defpackage.yi1) {
                boolean z = this.JhCgjQRTAOCT > 0;
                defpackage.yi1 yi1Var = (defpackage.yi1) obj;
                int i = yi1Var.oh71FJcDz6S2;
                if (z == (yi1Var.JhCgjQRTAOCT > 0) && defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, yi1Var.ZpBGe2uQfcn8) && this.fWTAfUmVKrZq == yi1Var.fWTAfUmVKrZq) {
                    java.lang.String str = yi1Var.WDYagTQQm9ns;
                    int i2 = this.oh71FJcDz6S2;
                    java.lang.String str2 = this.WDYagTQQm9ns;
                    if ((i2 != 1 || i != 2 || str2 == null || defpackage.w60.T1fB7bDYiVJQ(str2, str)) && ((i2 != 2 || i != 1 || str == null || defpackage.w60.T1fB7bDYiVJQ(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : defpackage.w60.T1fB7bDYiVJQ(str2, str))) && this.QiMR8OkAhezm == yi1Var.QiMR8OkAhezm))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.ZpBGe2uQfcn8.hashCode() * 31) + this.QiMR8OkAhezm) * 31) + (this.fWTAfUmVKrZq ? 1231 : 1237)) * 31) + this.JhCgjQRTAOCT;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append("',\n            |   type = '");
        sb.append(this.giKS3J6vZuNy);
        sb.append("',\n            |   affinity = '");
        sb.append(this.QiMR8OkAhezm);
        sb.append("',\n            |   notNull = '");
        sb.append(this.fWTAfUmVKrZq);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.JhCgjQRTAOCT);
        sb.append("',\n            |   defaultValue = '");
        java.lang.String str = this.WDYagTQQm9ns;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return defpackage.ug1.hH0RRJrNssvh(defpackage.ug1.xahdJg25P1Bv(sb.toString()));
    }
}
