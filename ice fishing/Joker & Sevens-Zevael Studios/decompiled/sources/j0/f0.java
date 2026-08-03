package j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3330a = f1.q.f2283h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return f1.q.c(this.f3330a, ((f0) obj).f3330a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = f1.q.f2284i;
        return Long.hashCode(this.f3330a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) f1.q.i(this.f3330a)) + ", rippleAlpha=null)";
    }
}
