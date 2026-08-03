package g1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final float f2502a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2503b;

    public s(float f10, float f11) {
        this.f2502a = f10;
        this.f2503b = f11;
    }

    public final float[] a() {
        float f10 = this.f2502a;
        float f11 = this.f2503b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f2502a, sVar.f2502a) == 0 && Float.compare(this.f2503b, sVar.f2503b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2503b) + (Float.hashCode(this.f2502a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f2502a);
        sb.append(", y=");
        return a4.d.k(sb, this.f2503b, ')');
    }
}
