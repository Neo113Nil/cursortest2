package d0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f1558a;

    public c(float f10) {
        this.f1558a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // d0.a
    public final float a(long j3, s2.c cVar) {
        return (this.f1558a / 100.0f) * e1.e.c(j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f1558a, ((c) obj).f1558a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1558a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f1558a + "%)";
    }
}
