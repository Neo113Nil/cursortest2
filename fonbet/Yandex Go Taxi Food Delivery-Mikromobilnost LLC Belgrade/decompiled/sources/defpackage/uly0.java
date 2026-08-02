package defpackage;

/* loaded from: classes11.dex */
public final class uly0 {
    public final int a;
    public final int b;
    public final int c;

    public uly0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uly0)) {
            return false;
        }
        uly0 uly0Var = (uly0) obj;
        return this.a == uly0Var.a && this.b == uly0Var.b && this.c == uly0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextDiff(start=");
        sb.append(this.a);
        sb.append(", added=");
        sb.append(this.b);
        sb.append(", removed=");
        return oyr.s(sb, this.c, ')');
    }
}
