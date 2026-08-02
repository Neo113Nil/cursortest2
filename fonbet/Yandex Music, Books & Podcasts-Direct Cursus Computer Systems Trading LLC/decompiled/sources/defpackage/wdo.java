package defpackage;

/* loaded from: classes.dex */
public final class wdo {
    public final long a = d85.n;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wdo) {
            return d85.c(this.a, ((wdo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) d85.i(this.a)) + ", rippleAlpha=null)";
    }
}
