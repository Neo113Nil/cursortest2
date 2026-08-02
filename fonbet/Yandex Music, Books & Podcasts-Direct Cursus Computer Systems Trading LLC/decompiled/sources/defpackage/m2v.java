package defpackage;

/* loaded from: classes4.dex */
public final class m2v {
    public final float a;
    public final long b;
    public final float c;
    public final boolean d;

    public m2v(float f, float f2, long j, boolean z) {
        this.a = f;
        this.b = j;
        this.c = f2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2v)) {
            return false;
        }
        m2v m2vVar = (m2v) obj;
        return Float.compare(this.a, m2vVar.a) == 0 && this.b == m2vVar.b && Float.compare(this.c, m2vVar.c) == 0 && this.d == m2vVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + eta.a(tlm.c(this.b, Float.hashCode(this.a) * 31, 31), this.c, 31);
    }

    public final String toString() {
        return "WaveScreenPlaybackState(progressFraction=" + this.a + ", duration=" + this.b + ", playbackSpeed=" + this.c + ", isPlaying=" + this.d + ")";
    }
}
