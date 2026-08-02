package defpackage;

/* loaded from: classes4.dex */
public final class dss {
    public final float a;
    public final float b;

    public dss(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dss)) {
            return false;
        }
        dss dssVar = (dss) obj;
        return Float.compare(this.a, dssVar.a) == 0 && Float.compare(this.b, dssVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LoudnessNormalizationInfo(integratedLoudnessDb=" + this.a + ", truePeakDb=" + this.b + ")";
    }
}
