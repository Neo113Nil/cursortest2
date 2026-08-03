package u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f6561a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6562b;

    public a(float f10, float f11) {
        this.f6561a = f10;
        this.f6562b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f6561a, aVar.f6561a) == 0 && Float.compare(this.f6562b, aVar.f6562b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6562b) + (Float.hashCode(this.f6561a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f6561a);
        sb.append(", velocityCoefficient=");
        return a4.d.k(sb, this.f6562b, ')');
    }
}
