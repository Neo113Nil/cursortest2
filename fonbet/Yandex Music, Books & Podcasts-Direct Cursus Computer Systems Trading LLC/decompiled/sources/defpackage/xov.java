package defpackage;

/* loaded from: classes3.dex */
public final class xov {
    public final int a;
    public final int b;

    public xov(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xov)) {
            return false;
        }
        xov xovVar = (xov) obj;
        return this.a == xovVar.a && this.b == xovVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.f("WidthForFade(contentWidth=", this.a, this.b, ", viewportWidth=", ")");
    }
}
