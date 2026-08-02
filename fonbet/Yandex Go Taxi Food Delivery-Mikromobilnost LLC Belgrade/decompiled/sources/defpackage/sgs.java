package defpackage;

/* loaded from: classes2.dex */
public final class sgs {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public sgs(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgs)) {
            return false;
        }
        sgs sgsVar = (sgs) obj;
        return this.a == sgsVar.a && this.b == sgsVar.b && this.c == sgsVar.c && this.d == sgsVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrontendInsets(leftDp=");
        sb.append(this.a);
        sb.append(", topDp=");
        sb.append(this.b);
        sb.append(", rightDp=");
        sb.append(this.c);
        sb.append(", bottomDp=");
        return oyr.s(sb, this.d, ')');
    }
}
