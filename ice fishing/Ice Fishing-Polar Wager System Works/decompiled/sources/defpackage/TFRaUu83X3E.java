package defpackage;

/* loaded from: classes.dex */
public final class TFRaUu83X3E {
    public final java.lang.String IHQe1A4L2xu;
    public final defpackage.s00 oh6vYeIP;

    public TFRaUu83X3E(java.lang.String str, defpackage.s00 s00Var) {
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = s00Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.TFRaUu83X3E)) {
            return false;
        }
        defpackage.TFRaUu83X3E tFRaUu83X3E = (defpackage.TFRaUu83X3E) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, tFRaUu83X3E.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, tFRaUu83X3E.oh6vYeIP);
    }

    public final int hashCode() {
        java.lang.String str = this.IHQe1A4L2xu;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        defpackage.s00 s00Var = this.oh6vYeIP;
        return hashCode + (s00Var != null ? s00Var.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "AccessibilityAction(label=" + this.IHQe1A4L2xu + ", action=" + this.oh6vYeIP + ')';
    }
}
