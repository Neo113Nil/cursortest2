package defpackage;

/* loaded from: classes4.dex */
public final class u7l {
    public static final u7l i = new u7l(0.0f, 0, 0, false);
    public final boolean a;
    public final boolean b;
    public final float c;
    public final long d;
    public final long e;
    public final float f;
    public final boolean g;
    public final boolean h;

    public u7l(boolean z, boolean z2, float f, long j, long j2, float f2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = f;
        this.d = j;
        this.e = j2;
        this.f = f2;
        this.g = z3;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7l)) {
            return false;
        }
        u7l u7lVar = (u7l) obj;
        return this.a == u7lVar.a && this.b == u7lVar.b && Float.compare(this.c, u7lVar.c) == 0 && this.d == u7lVar.d && this.e == u7lVar.e && Float.compare(this.f, u7lVar.f) == 0 && this.g == u7lVar.g && this.h == u7lVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + k5r.e(eta.a(tlm.c(this.e, tlm.c(this.d, eta.a(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), this.c, 31), 31), 31), this.f, 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder j = eta.j("PlaybackUiState(isPlaying=", this.a, ", isBuffering=", this.b, ", fractionPlayed=");
        j.append(this.c);
        j.append(", duration=");
        j.append(this.d);
        ouj.C(j, ", progress=", this.e, ", playbackSpeed=");
        j.append(this.f);
        j.append(", enabledSmoothProgress=");
        j.append(this.g);
        j.append(", enabledSeekableCollapsedPlayer=");
        return ouj.r(j, this.h, ")");
    }

    public /* synthetic */ u7l(float f, long j, long j2, boolean z) {
        this(z, false, f, j, j2, 1.0f, false, false);
    }
}
