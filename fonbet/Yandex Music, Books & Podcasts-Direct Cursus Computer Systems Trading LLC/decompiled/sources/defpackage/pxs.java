package defpackage;

/* loaded from: classes4.dex */
public final class pxs {
    public final float a;
    public final float b;

    public pxs(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxs)) {
            return false;
        }
        pxs pxsVar = (pxs) obj;
        return Float.compare(this.a, pxsVar.a) == 0 && Float.compare(this.b, pxsVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TrackLoudnessMeta(integratedLoudnessDb=" + this.a + ", truePeakDb=" + this.b + ")";
    }
}
