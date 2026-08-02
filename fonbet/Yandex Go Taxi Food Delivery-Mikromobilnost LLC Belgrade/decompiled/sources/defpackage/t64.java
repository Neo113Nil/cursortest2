package defpackage;

/* loaded from: classes10.dex */
public final class t64 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public t64(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t64) {
            t64 t64Var = (t64) obj;
            if (this.a.equals(t64Var.a) && this.b.equals(t64Var.b) && this.c.equals(t64Var.c) && this.d.equals(t64Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.a);
        sb.append(", eglVersion=");
        sb.append(this.b);
        sb.append(", glExtensions=");
        sb.append(this.c);
        sb.append(", eglExtensions=");
        return oyr.t(sb, this.d, "}");
    }
}
