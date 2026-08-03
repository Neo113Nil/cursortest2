package u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f6605a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6606b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6607c;

    public i0(float f10, float f11, long j3) {
        this.f6605a = f10;
        this.f6606b = f11;
        this.f6607c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Float.compare(this.f6605a, i0Var.f6605a) == 0 && Float.compare(this.f6606b, i0Var.f6606b) == 0 && this.f6607c == i0Var.f6607c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6607c) + a4.d.b(this.f6606b, Float.hashCode(this.f6605a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f6605a + ", distance=" + this.f6606b + ", duration=" + this.f6607c + ')';
    }
}
