package defpackage;

/* loaded from: classes4.dex */
public final class roq implements soq {
    public final int a;
    public final int b;

    public roq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof roq)) {
            return false;
        }
        roq roqVar = (roq) obj;
        return this.a == roqVar.a && this.b == roqVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.f("TabChanged(fromIndex=", this.a, this.b, ", toIndex=", ")");
    }
}
