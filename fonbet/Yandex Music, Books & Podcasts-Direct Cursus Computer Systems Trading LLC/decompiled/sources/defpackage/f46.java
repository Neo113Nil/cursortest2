package defpackage;

/* loaded from: classes6.dex */
public final class f46 {
    public final int a;
    public final int b;

    public f46(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f46)) {
            return false;
        }
        f46 f46Var = (f46) obj;
        return this.a == f46Var.a && this.b == f46Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Indices(prepareIndex=");
        sb.append(this.a);
        sb.append(", sourceIndex=");
        return vz1.r(sb, this.b, ')');
    }
}
