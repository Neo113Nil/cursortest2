package defpackage;

/* loaded from: classes.dex */
public final class r9 implements defpackage.if1 {
    public final defpackage.a91 adDC3e2L;
    public final float xiZrDbcSW0;

    public r9(defpackage.a91 a91Var, float f) {
        this.adDC3e2L = a91Var;
        this.xiZrDbcSW0 = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.r9)) {
            return false;
        }
        defpackage.r9 r9Var = (defpackage.r9) obj;
        return defpackage.x70.QoRHpC4k(this.adDC3e2L, r9Var.adDC3e2L) && java.lang.Float.compare(this.xiZrDbcSW0, r9Var.xiZrDbcSW0) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.xiZrDbcSW0) + (this.adDC3e2L.hashCode() * 31);
    }

    @Override // defpackage.if1
    public final float oh6vYeIP() {
        return this.xiZrDbcSW0;
    }

    @Override // defpackage.if1
    public final long r1MBDhnF() {
        int i = defpackage.ae.AARZUJiTa;
        return defpackage.ae.xiZrDbcSW0;
    }

    public final java.lang.String toString() {
        return "BrushStyle(value=" + this.adDC3e2L + ", alpha=" + this.xiZrDbcSW0 + ')';
    }

    @Override // defpackage.if1
    public final defpackage.h1 xiZrDbcSW0() {
        return this.adDC3e2L;
    }
}
