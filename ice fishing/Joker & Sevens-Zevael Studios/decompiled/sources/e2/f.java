package e2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f1954b = new f(new uc.a(0.0f, 0.0f));

    /* renamed from: a, reason: collision with root package name */
    public final uc.a f1955a;

    public f(uc.a aVar) {
        this.f1955a = aVar;
        if (Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final uc.a a() {
        return this.f1955a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f1955a.equals(((f) obj).f1955a);
    }

    public final int hashCode() {
        return (this.f1955a.hashCode() + (Float.hashCode(0.0f) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.f1955a + ", steps=0)";
    }
}
