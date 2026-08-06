package defpackage;

/* loaded from: classes.dex */
public final class me implements defpackage.if1 {
    public final long adDC3e2L;

    public me(long j) {
        this.adDC3e2L = j;
        if (j != 16) {
            return;
        }
        defpackage.y50.IHQe1A4L2xu("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.me) && defpackage.ae.r1MBDhnF(this.adDC3e2L, ((defpackage.me) obj).adDC3e2L);
    }

    public final int hashCode() {
        int i = defpackage.ae.AARZUJiTa;
        return java.lang.Long.hashCode(this.adDC3e2L);
    }

    @Override // defpackage.if1
    public final float oh6vYeIP() {
        return defpackage.ae.F7NU4MC0GW(this.adDC3e2L);
    }

    @Override // defpackage.if1
    public final long r1MBDhnF() {
        return this.adDC3e2L;
    }

    public final java.lang.String toString() {
        return "ColorStyle(value=" + ((java.lang.Object) defpackage.ae.riuEU0zW4(this.adDC3e2L)) + ')';
    }

    @Override // defpackage.if1
    public final defpackage.h1 xiZrDbcSW0() {
        return null;
    }
}
