package defpackage;

/* loaded from: classes3.dex */
public final class yc2 extends lq6 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public yc2(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lq6) {
            yc2 yc2Var = (yc2) ((lq6) obj);
            if (this.a == yc2Var.a && this.b.equals(yc2Var.b) && this.c.equals(yc2Var.c) && this.d == yc2Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        return ouj.r(sb, this.d, "}");
    }
}
