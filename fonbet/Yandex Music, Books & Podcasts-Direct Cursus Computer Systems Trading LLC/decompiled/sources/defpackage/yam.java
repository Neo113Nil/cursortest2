package defpackage;

/* loaded from: classes3.dex */
public final class yam implements cbm, qzn {
    public final ghm a;

    public yam(ghm ghmVar) {
        this.a = ghmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yam) && this.a.equals(((yam) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LatestEpisodesBlock(data=" + this.a + ")";
    }
}
