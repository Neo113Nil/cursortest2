package defpackage;

/* loaded from: classes.dex */
public final class kb1 extends defpackage.h1 {
    public final long D2vUnMij;

    public kb1(long j) {
        this.D2vUnMij = j;
    }

    @Override // defpackage.h1
    public final void JlrlGoKF(float f, long j, defpackage.r2 r2Var) {
        r2Var.r1MBDhnF(1.0f);
        long j2 = this.D2vUnMij;
        if (f != 1.0f) {
            j2 = defpackage.ae.oh6vYeIP(j2, defpackage.ae.F7NU4MC0GW(j2) * f);
        }
        r2Var.adDC3e2L(j2);
        if (((android.graphics.Shader) r2Var.r1MBDhnF) != null) {
            r2Var.AARZUJiTa(null);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kb1) {
            return defpackage.ae.r1MBDhnF(this.D2vUnMij, ((defpackage.kb1) obj).D2vUnMij);
        }
        return false;
    }

    public final int hashCode() {
        int i = defpackage.ae.AARZUJiTa;
        return java.lang.Long.hashCode(this.D2vUnMij);
    }

    public final java.lang.String toString() {
        return "SolidColor(value=" + ((java.lang.Object) defpackage.ae.riuEU0zW4(this.D2vUnMij)) + ')';
    }
}
