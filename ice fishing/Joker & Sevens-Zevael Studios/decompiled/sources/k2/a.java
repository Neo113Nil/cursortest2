package k2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: g, reason: collision with root package name */
    public final int f3599g;

    public a(int i10) {
        this.f3599g = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3599g == ((a) obj).f3599g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3599g);
    }

    public final String toString() {
        return a4.d.l(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f3599g, ')');
    }
}
