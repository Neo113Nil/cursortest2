package u7;

/* renamed from: u7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5078d implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public static final C5078d f41047u = new C5078d();

    /* renamed from: n, reason: collision with root package name */
    public final int f41048n = 131604;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C5078d other = (C5078d) obj;
        kotlin.jvm.internal.h.e(other, "other");
        return this.f41048n - other.f41048n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C5078d c5078d = obj instanceof C5078d ? (C5078d) obj : null;
        return c5078d != null && this.f41048n == c5078d.f41048n;
    }

    public final int hashCode() {
        return this.f41048n;
    }

    public final String toString() {
        return "2.2.20";
    }
}
