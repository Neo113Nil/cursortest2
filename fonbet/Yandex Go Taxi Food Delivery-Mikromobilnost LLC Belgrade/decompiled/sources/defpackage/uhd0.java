package defpackage;

/* loaded from: classes2.dex */
public final class uhd0 implements whd0 {
    public final String a;
    public final boolean b;

    public uhd0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhd0)) {
            return false;
        }
        uhd0 uhd0Var = (uhd0) obj;
        return jl40.l(this.a, uhd0Var.a) && this.b == uhd0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToggleSwitch(widgetId=");
        sb.append(this.a);
        sb.append(", turnOn=");
        return unr0.u(sb, this.b, ')');
    }
}
