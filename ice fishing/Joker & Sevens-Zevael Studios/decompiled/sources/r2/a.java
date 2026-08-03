package r2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f6013a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f6013a, ((a) obj).f6013a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6013a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f6013a + ')';
    }
}
