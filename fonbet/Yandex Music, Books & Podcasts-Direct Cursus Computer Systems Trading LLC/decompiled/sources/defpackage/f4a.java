package defpackage;

/* loaded from: classes5.dex */
public final class f4a extends g4a {
    public final int n;
    public final int o;
    public final int p;
    public final int q;

    public f4a(int i, int i2, int i3, int i4) {
        this.n = i;
        this.o = i2;
        this.p = i3;
        this.q = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4a)) {
            return false;
        }
        f4a f4aVar = (f4a) obj;
        return this.n == f4aVar.n && this.o == f4aVar.o && this.p == f4aVar.p && this.q == f4aVar.q;
    }

    public final int hashCode() {
        return (((((this.n * 31) + this.o) * 31) + this.p) * 31) + this.q;
    }

    public final String toString() {
        StringBuilder l = dfi.l("OnScrolled(verticalOffset=", this.n, this.o, ", horizontalOffset=", ", dx=");
        l.append(this.p);
        l.append(", dy=");
        l.append(this.q);
        l.append(")");
        return l.toString();
    }
}
