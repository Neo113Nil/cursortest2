package defpackage;

/* loaded from: classes.dex */
public final class ggc implements jd6 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ggc) && Float.compare(1.0f, 1.0f) == 0;
    }

    @Override // defpackage.jd6
    public final long f(long j, long j2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (4294967295L & Float.floatToRawIntBits(1.0f));
        int i = sso.a;
        return floatToRawIntBits;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
