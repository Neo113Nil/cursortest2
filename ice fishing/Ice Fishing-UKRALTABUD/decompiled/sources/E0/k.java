package E0;

/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f308a;

    public k(Class cls) {
        this.f308a = cls;
    }

    @Override // E0.d
    public final Class a() {
        return this.f308a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f308a, ((k) obj).f308a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f308a.hashCode();
    }

    public final String toString() {
        return this.f308a + " (Kotlin reflection is not available)";
    }
}
