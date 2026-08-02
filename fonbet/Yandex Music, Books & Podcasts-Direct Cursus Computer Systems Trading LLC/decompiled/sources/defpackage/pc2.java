package defpackage;

/* loaded from: classes3.dex */
public final class pc2 extends dq6 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public pc2(String str, boolean z, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dq6) {
            pc2 pc2Var = (pc2) ((dq6) obj);
            if (this.a.equals(pc2Var.a) && this.b == pc2Var.b && this.c == pc2Var.c && this.d == pc2Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", defaultProcess=");
        return ouj.r(sb, this.d, "}");
    }
}
