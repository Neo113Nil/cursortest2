package defpackage;

/* loaded from: classes3.dex */
public final class v7l {
    public static final v7l g = new v7l(0.0f, 0, 0, false);
    public final boolean a;
    public final boolean b;
    public final float c;
    public final long d;
    public final long e;
    public final float f;

    public v7l(boolean z, boolean z2, float f, long j, long j2, float f2) {
        this.a = z;
        this.b = z2;
        this.c = f;
        this.d = j;
        this.e = j2;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7l)) {
            return false;
        }
        v7l v7lVar = (v7l) obj;
        return this.a == v7lVar.a && this.b == v7lVar.b && Float.compare(this.c, v7lVar.c) == 0 && this.d == v7lVar.d && this.e == v7lVar.e && Float.compare(this.f, v7lVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + tlm.c(this.e, tlm.c(this.d, eta.a(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), this.c, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder j = eta.j("PlaybackUiState(isPlaying=", this.a, ", isBuffering=", this.b, ", fractionPlayed=");
        j.append(this.c);
        j.append(", duration=");
        j.append(this.d);
        ouj.C(j, ", progress=", this.e, ", playbackSpeed=");
        return su4.m(this.f, ")", j);
    }

    public /* synthetic */ v7l(float f, long j, long j2, boolean z) {
        this(z, false, f, j, j2, 1.0f);
    }
}
