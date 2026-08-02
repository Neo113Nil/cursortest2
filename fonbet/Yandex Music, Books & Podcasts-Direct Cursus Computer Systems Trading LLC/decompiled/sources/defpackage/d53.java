package defpackage;

/* loaded from: classes3.dex */
public final class d53 implements e53 {
    public final boolean a;

    public d53(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d53) && this.a == ((d53) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Success(isAddTracksToEndPlaylist=", ")", this.a);
    }
}
