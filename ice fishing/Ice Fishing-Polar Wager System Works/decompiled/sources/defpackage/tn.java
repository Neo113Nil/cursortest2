package defpackage;

/* loaded from: classes.dex */
public final class tn implements defpackage.qn {
    public final float adDC3e2L;
    public final float xiZrDbcSW0;

    public tn(float f, float f2) {
        this.adDC3e2L = f;
        this.xiZrDbcSW0 = f2;
    }

    @Override // defpackage.qn
    public final float EXtogiMhuM() {
        return this.xiZrDbcSW0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.tn)) {
            return false;
        }
        defpackage.tn tnVar = (defpackage.tn) obj;
        return java.lang.Float.compare(this.adDC3e2L, tnVar.adDC3e2L) == 0 && java.lang.Float.compare(this.xiZrDbcSW0, tnVar.xiZrDbcSW0) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.xiZrDbcSW0) + (java.lang.Float.hashCode(this.adDC3e2L) * 31);
    }

    @Override // defpackage.qn
    public final float oh6vYeIP() {
        return this.adDC3e2L;
    }

    public final java.lang.String toString() {
        return "DensityImpl(density=" + this.adDC3e2L + ", fontScale=" + this.xiZrDbcSW0 + ')';
    }
}
