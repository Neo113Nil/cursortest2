package defpackage;

/* loaded from: classes3.dex */
public final class opp implements ppp {
    public final long a;

    public opp(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof opp) && this.a == ((opp) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return dfi.e(this.a, "Success(downloadedTracksSize=", ")");
    }
}
