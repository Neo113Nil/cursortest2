package E0;

/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f309a;

    public k(Class cls) {
        this.f309a = cls;
    }

    @Override // E0.d
    public final Class a() {
        return this.f309a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f309a, ((k) obj).f309a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f309a.hashCode();
    }

    public final String toString() {
        return this.f309a + " (Kotlin reflection is not available)";
    }
}
