package defpackage;

/* loaded from: classes11.dex */
public final class urk0 {
    public final long a = ldc.m;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof urk0) {
            return ldc.c(this.a, ((urk0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return oyr.p("RippleConfiguration(color=", ldc.i(this.a), ", rippleAlpha=null)");
    }
}
