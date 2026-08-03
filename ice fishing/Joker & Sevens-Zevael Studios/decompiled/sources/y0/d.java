package y0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f8433a;

    public d(float f10) {
        this.f8433a = f10;
    }

    public final int a(int i10, int i11, s2.l lVar) {
        float f10 = (i11 - i10) / 2.0f;
        s2.l lVar2 = s2.l.f6396g;
        float f11 = this.f8433a;
        if (lVar != lVar2) {
            f11 *= -1;
        }
        return Math.round((1 + f11) * f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(this.f8433a, ((d) obj).f8433a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8433a);
    }

    public final String toString() {
        return a4.d.k(new StringBuilder("Horizontal(bias="), this.f8433a, ')');
    }
}
