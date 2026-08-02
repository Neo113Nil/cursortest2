package defpackage;

/* loaded from: classes3.dex */
public final class vj {
    public final int a;
    public final int b;

    public vj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj)) {
            return false;
        }
        vj vjVar = (vj) obj;
        return this.a == vjVar.a && this.b == vjVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(maxLines=");
        sb.append(this.a);
        sb.append(", minHiddenLines=");
        return vz1.r(sb, this.b, ')');
    }
}
