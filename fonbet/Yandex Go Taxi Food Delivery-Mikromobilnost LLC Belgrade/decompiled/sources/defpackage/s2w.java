package defpackage;

/* loaded from: classes10.dex */
public final class s2w {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public s2w(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2w)) {
            return false;
        }
        s2w s2wVar = (s2w) obj;
        return this.a == s2wVar.a && this.b == s2wVar.b && this.c == s2wVar.c && this.d == s2wVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return oyr.s(sb, this.d, ')');
    }
}
