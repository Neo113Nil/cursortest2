package y0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f8434a;

    public e(float f10) {
        this.f8434a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f8434a, ((e) obj).f8434a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8434a);
    }

    public final String toString() {
        return a4.d.k(new StringBuilder("Vertical(bias="), this.f8434a, ')');
    }
}
