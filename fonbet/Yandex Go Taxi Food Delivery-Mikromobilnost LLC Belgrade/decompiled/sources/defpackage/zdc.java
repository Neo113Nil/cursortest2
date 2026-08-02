package defpackage;

/* loaded from: classes2.dex */
public final class zdc {
    public final aec a;
    public final double b;

    public zdc(aec aecVar, double d) {
        this.a = aecVar;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdc)) {
            return false;
        }
        zdc zdcVar = (zdc) obj;
        return this.a.equals(zdcVar.a) && Double.compare(this.b, zdcVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Color2(color=");
        sb.append(this.a);
        sb.append(", location=");
        return unr0.q(sb, this.b, ')');
    }
}
