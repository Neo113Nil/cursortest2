package defpackage;

/* loaded from: classes.dex */
public final class t40 {
    public static final /* synthetic */ int adDC3e2L = 0;
    public final defpackage.ff0 F7NU4MC0GW;
    public final boolean IHQe1A4L2xu;
    public final int oh6vYeIP;
    public final int r1MBDhnF;

    static {
        new defpackage.t40();
    }

    public t40() {
        defpackage.ff0 ff0Var = defpackage.ff0.AARZUJiTa;
        this.IHQe1A4L2xu = true;
        this.oh6vYeIP = 1;
        this.r1MBDhnF = 1;
        this.F7NU4MC0GW = ff0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.t40)) {
            return false;
        }
        defpackage.t40 t40Var = (defpackage.t40) obj;
        return this.IHQe1A4L2xu == t40Var.IHQe1A4L2xu && this.oh6vYeIP == t40Var.oh6vYeIP && this.r1MBDhnF == t40Var.r1MBDhnF && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, t40Var.F7NU4MC0GW);
    }

    public final int hashCode() {
        return this.F7NU4MC0GW.adDC3e2L.hashCode() + defpackage.fx0.oh6vYeIP(this.r1MBDhnF, defpackage.fx0.oh6vYeIP(this.oh6vYeIP, defpackage.fx0.adDC3e2L(defpackage.fx0.oh6vYeIP(0, java.lang.Boolean.hashCode(false) * 31, 31), 31, this.IHQe1A4L2xu), 31), 961);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImeOptions(singleLine=false, capitalization=");
        java.lang.String str = "None";
        sb.append((java.lang.Object) "None");
        sb.append(", autoCorrect=");
        sb.append(this.IHQe1A4L2xu);
        sb.append(", keyboardType=");
        int i = this.oh6vYeIP;
        sb.append((java.lang.Object) (i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid"));
        sb.append(", imeAction=");
        int i2 = this.r1MBDhnF;
        if (i2 == -1) {
            str = "Unspecified";
        } else if (i2 != 0) {
            str = i2 == 1 ? "Default" : i2 == 2 ? "Go" : i2 == 3 ? "Search" : i2 == 4 ? "Send" : i2 == 5 ? "Previous" : i2 == 6 ? "Next" : i2 == 7 ? "Done" : "Invalid";
        }
        sb.append((java.lang.Object) str);
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.F7NU4MC0GW);
        sb.append(')');
        return sb.toString();
    }
}
