package defpackage;

/* loaded from: classes.dex */
public final class k2 implements defpackage.kv0 {
    public final int adDC3e2L;

    public k2(int i) {
        this.adDC3e2L = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.k2) && this.adDC3e2L == ((defpackage.k2) obj).adDC3e2L;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.adDC3e2L);
    }

    public final java.lang.String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.adDC3e2L + ')';
    }
}
