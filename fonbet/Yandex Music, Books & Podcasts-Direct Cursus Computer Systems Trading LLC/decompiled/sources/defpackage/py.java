package defpackage;

/* loaded from: classes3.dex */
public final class py implements uy {
    public final ey a;

    public py(ey eyVar) {
        this.a = eyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof py) && this.a.equals(((py) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MoreAlbums(state=" + this.a + ")";
    }
}
