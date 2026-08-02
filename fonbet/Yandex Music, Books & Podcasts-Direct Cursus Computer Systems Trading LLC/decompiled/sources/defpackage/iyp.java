package defpackage;

/* loaded from: classes5.dex */
public final class iyp {
    public static final iyp c = new iyp(vys.a, false);
    public final xys a;
    public final boolean b;

    public iyp(xys xysVar, boolean z) {
        this.a = xysVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyp)) {
            return false;
        }
        iyp iypVar = (iyp) obj;
        return this.a.equals(iypVar.a) && this.b == iypVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumTrackOrderInfo(defaultTrackOrder=" + this.a + ", isReversed=" + this.b + ")";
    }
}
