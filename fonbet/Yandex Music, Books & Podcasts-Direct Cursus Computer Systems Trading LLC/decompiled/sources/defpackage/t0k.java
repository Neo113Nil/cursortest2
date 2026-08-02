package defpackage;

/* loaded from: classes4.dex */
public final class t0k {
    public final int a;
    public final int b;

    public t0k(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0k)) {
            return false;
        }
        t0k t0kVar = (t0k) obj;
        return this.a == t0kVar.a && this.b == t0kVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + f1d.a(0, f1d.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return dfi.f("Paddings(left=", this.a, this.b, ", right=", ", top=0, bottom=0)");
    }
}
