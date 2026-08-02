package defpackage;

/* loaded from: classes3.dex */
public final class dsi {
    public final bsi a;

    public dsi(bsi bsiVar) {
        this.a = bsiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsi) && this.a.equals(((dsi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MyShelfBlockRecentlyPlayedData(playedItem=" + this.a + ")";
    }
}
