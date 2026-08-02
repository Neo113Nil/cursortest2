package u7;

/* renamed from: u7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5089o implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final int f41066n;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.h.f(this.f41066n ^ Integer.MIN_VALUE, ((C5089o) obj).f41066n ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5089o) {
            return this.f41066n == ((C5089o) obj).f41066n;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41066n);
    }

    public final String toString() {
        return String.valueOf(this.f41066n & 4294967295L);
    }
}
