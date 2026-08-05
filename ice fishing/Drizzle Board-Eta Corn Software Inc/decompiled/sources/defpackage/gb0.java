package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class gb0 {
    public final boolean MdtA4re8;
    public final String NCTxEWno;
    public final int P7K7Inc8;
    public final String VgvYg0wo;
    public final int b2ZJblxo;
    public final String qoPGr6Ce;
    public final int wxUZMvaN;

    public gb0(String str, String str2, boolean z, int i, String str3, int i2) {
        str.getClass();
        str2.getClass();
        this.qoPGr6Ce = str;
        this.NCTxEWno = str2;
        this.MdtA4re8 = z;
        this.wxUZMvaN = i;
        this.VgvYg0wo = str3;
        this.P7K7Inc8 = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.b2ZJblxo = ba0.I5GHvsYW(upperCase, "INT") ? 3 : (ba0.I5GHvsYW(upperCase, "CHAR") || ba0.I5GHvsYW(upperCase, "CLOB") || ba0.I5GHvsYW(upperCase, "TEXT")) ? 2 : ba0.I5GHvsYW(upperCase, "BLOB") ? 5 : (ba0.I5GHvsYW(upperCase, "REAL") || ba0.I5GHvsYW(upperCase, "FLOA") || ba0.I5GHvsYW(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gb0) {
                boolean z = this.wxUZMvaN > 0;
                gb0 gb0Var = (gb0) obj;
                int i = gb0Var.P7K7Inc8;
                if (z == (gb0Var.wxUZMvaN > 0) && fn.qoPGr6Ce(this.qoPGr6Ce, gb0Var.qoPGr6Ce) && this.MdtA4re8 == gb0Var.MdtA4re8) {
                    String str = gb0Var.VgvYg0wo;
                    int i2 = this.P7K7Inc8;
                    String str2 = this.VgvYg0wo;
                    if ((i2 != 1 || i != 2 || str2 == null || f50.b2ZJblxo(str2, str)) && ((i2 != 2 || i != 1 || str == null || f50.b2ZJblxo(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : f50.b2ZJblxo(str2, str))) && this.b2ZJblxo == gb0Var.b2ZJblxo))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.qoPGr6Ce.hashCode() * 31) + this.b2ZJblxo) * 31) + (this.MdtA4re8 ? 1231 : 1237)) * 31) + this.wxUZMvaN;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.qoPGr6Ce);
        sb.append("',\n            |   type = '");
        sb.append(this.NCTxEWno);
        sb.append("',\n            |   affinity = '");
        sb.append(this.b2ZJblxo);
        sb.append("',\n            |   notNull = '");
        sb.append(this.MdtA4re8);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.wxUZMvaN);
        sb.append("',\n            |   defaultValue = '");
        String str = this.VgvYg0wo;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return ca0.sjUBp5pO(ca0.OxcuoDLp(sb.toString()));
    }
}
