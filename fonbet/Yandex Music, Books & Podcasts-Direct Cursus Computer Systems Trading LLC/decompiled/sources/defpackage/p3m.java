package defpackage;

/* loaded from: classes6.dex */
public final class p3m {
    public final String a;

    public p3m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3m) && this.a.equals(((p3m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("PlaylistUUID(value=", this.a, ")");
    }
}
