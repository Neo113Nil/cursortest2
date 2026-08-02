package defpackage;

/* loaded from: classes3.dex */
public final class zz9 {
    public final int a;
    public final int b;

    public zz9(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz9)) {
            return false;
        }
        zz9 zz9Var = (zz9) obj;
        return this.a == zz9Var.a && this.b == zz9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivVideoResolution(width=");
        sb.append(this.a);
        sb.append(", height=");
        return vz1.r(sb, this.b, ')');
    }
}
