package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public final class l implements c {

    /* renamed from: n, reason: collision with root package name */
    public final Class f38714n;

    public l(Class jClass) {
        h.e(jClass, "jClass");
        this.f38714n = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f38714n;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return h.a(this.f38714n, ((l) obj).f38714n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38714n.hashCode();
    }

    public final String toString() {
        return this.f38714n.toString() + " (Kotlin reflection is not available)";
    }
}
