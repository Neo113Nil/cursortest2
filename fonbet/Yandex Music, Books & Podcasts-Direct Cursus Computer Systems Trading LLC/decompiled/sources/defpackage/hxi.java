package defpackage;

/* loaded from: classes4.dex */
public final class hxi implements jxi {
    public final nvl a;

    public hxi(nvl nvlVar) {
        this.a = nvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hxi) && this.a.equals(((hxi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Playlist(id=" + this.a + ")";
    }
}
