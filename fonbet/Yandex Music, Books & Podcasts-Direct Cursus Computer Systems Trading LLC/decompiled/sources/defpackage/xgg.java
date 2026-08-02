package defpackage;

/* loaded from: classes3.dex */
public final class xgg {
    public final int a;
    public final boolean b;

    public xgg(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgg)) {
            return false;
        }
        xgg xggVar = (xgg) obj;
        return this.a == xggVar.a && this.b == xggVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ArtistsSize(size=" + this.a + ", hasMore=" + this.b + ")";
    }
}
