package s2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m implements t2.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f6399a;

    public m(float f10) {
        this.f6399a = f10;
    }

    @Override // t2.a
    public final float a(float f10) {
        return f10 / this.f6399a;
    }

    @Override // t2.a
    public final float b(float f10) {
        return f10 * this.f6399a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.f6399a, ((m) obj).f6399a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6399a);
    }

    public final String toString() {
        return a4.d.k(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f6399a, ')');
    }
}
