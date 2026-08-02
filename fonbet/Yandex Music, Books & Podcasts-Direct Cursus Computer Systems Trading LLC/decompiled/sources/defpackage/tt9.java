package defpackage;

/* loaded from: classes3.dex */
public final class tt9 {
    public final int a;
    public final int b;

    public tt9(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt9)) {
            return false;
        }
        tt9 tt9Var = (tt9) obj;
        return this.a == tt9Var.a && this.b == tt9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineBounds(top=");
        sb.append(this.a);
        sb.append(", bottom=");
        return vz1.r(sb, this.b, ')');
    }
}
