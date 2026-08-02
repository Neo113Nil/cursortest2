package defpackage;

/* loaded from: classes4.dex */
public final class o4 {
    public final String a;

    public o4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4) && this.a.equals(((o4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("AboutPodcastEpisodeInfo(shortDescription=", this.a, ")");
    }
}
