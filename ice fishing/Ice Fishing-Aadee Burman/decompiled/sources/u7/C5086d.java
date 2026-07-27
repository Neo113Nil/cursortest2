package u7;

/* renamed from: u7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5086d implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public static final C5086d f41324u = new C5086d();

    /* renamed from: n, reason: collision with root package name */
    public final int f41325n = 131604;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C5086d other = (C5086d) obj;
        kotlin.jvm.internal.h.e(other, "other");
        return this.f41325n - other.f41325n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C5086d c5086d = obj instanceof C5086d ? (C5086d) obj : null;
        return c5086d != null && this.f41325n == c5086d.f41325n;
    }

    public final int hashCode() {
        return this.f41325n;
    }

    public final String toString() {
        return "2.2.20";
    }
}
