package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f8072a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f8072a = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f8072a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f8072a, ((k) obj).f8072a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8072a.hashCode();
    }

    public final String toString() {
        return this.f8072a + " (Kotlin reflection is not available)";
    }
}
