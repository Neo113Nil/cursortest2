package defpackage;

/* loaded from: classes2.dex */
public final class vfu {
    public final double a;
    public final String b;

    public vfu(double d, String str) {
        this.a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfu)) {
            return false;
        }
        vfu vfuVar = (vfu) obj;
        return Double.compare(this.a, vfuVar.a) == 0 && this.b.equals(vfuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HexColorFragment(a=");
        sb.append(this.a);
        sb.append(", hex=");
        return b64.p(sb, this.b, ')');
    }
}
