package defpackage;

/* loaded from: classes.dex */
public final class wta0 implements yre {
    public final float a;

    public wta0(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            lxv.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.yre
    public final float e(long j, fwi fwiVar) {
        return (this.a / 100.0f) * cjs0.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wta0) && Float.compare(this.a, ((wta0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return uw51.i(new StringBuilder("CornerSize(size = "), this.a, "%)");
    }
}
