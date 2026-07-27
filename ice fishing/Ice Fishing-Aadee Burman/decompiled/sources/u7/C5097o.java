package u7;

/* renamed from: u7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5097o implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final int f41343n;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.h.f(this.f41343n ^ Integer.MIN_VALUE, ((C5097o) obj).f41343n ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5097o) {
            return this.f41343n == ((C5097o) obj).f41343n;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41343n);
    }

    public final String toString() {
        return String.valueOf(this.f41343n & 4294967295L);
    }
}
