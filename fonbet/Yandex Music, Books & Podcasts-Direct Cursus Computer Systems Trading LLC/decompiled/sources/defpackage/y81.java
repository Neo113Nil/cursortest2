package defpackage;

/* loaded from: classes3.dex */
public final class y81 {
    public static final y81 c = new y81(0, 0);
    public final int a;
    public final int b;

    public y81(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y81)) {
            return false;
        }
        y81 y81Var = (y81) obj;
        return this.a == y81Var.a && this.b == y81Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.f("ArtistFamiliarToYouCollectionData(tracksCount=", this.a, this.b, ", albumsCount=", ")");
    }
}
