package D1;

/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f166a;

    public k(Class cls) {
        this.f166a = cls;
    }

    @Override // D1.d
    public final Class a() {
        return this.f166a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f166a, ((k) obj).f166a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f166a.hashCode();
    }

    public final String toString() {
        return this.f166a.toString() + " (Kotlin reflection is not available)";
    }
}
