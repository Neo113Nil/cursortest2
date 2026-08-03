package i0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f2948a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2949b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2950c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2951d;

    public f(float f10, float f11, float f12, float f13) {
        this.f2948a = f10;
        this.f2949b = f11;
        this.f2950c = f12;
        this.f2951d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2948a == fVar.f2948a && this.f2949b == fVar.f2949b && this.f2950c == fVar.f2950c && this.f2951d == fVar.f2951d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2951d) + a4.d.b(this.f2950c, a4.d.b(this.f2949b, Float.hashCode(this.f2948a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f2948a);
        sb.append(", focusedAlpha=");
        sb.append(this.f2949b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f2950c);
        sb.append(", pressedAlpha=");
        return a4.d.k(sb, this.f2951d, ')');
    }
}
