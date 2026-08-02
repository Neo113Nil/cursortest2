package defpackage;

/* loaded from: classes4.dex */
public final class hgb extends xee {
    public final int j;

    public hgb(int i) {
        this.j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgb) && this.j == ((hgb) obj).j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j);
    }

    public final String toString() {
        return dfi.c(this.j, "Code(code=", ")");
    }
}
