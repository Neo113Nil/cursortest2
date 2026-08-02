package defpackage;

/* loaded from: classes.dex */
public final class u5k {
    public final mh0 a;
    public final int b;
    public final int c;

    public u5k(mh0 mh0Var, int i, int i2) {
        this.a = mh0Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5k)) {
            return false;
        }
        u5k u5kVar = (u5k) obj;
        return this.a.equals(u5kVar.a) && this.b == u5kVar.b && this.c == u5kVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return vz1.r(sb, this.c, ')');
    }
}
