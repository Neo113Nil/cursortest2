package u7;

/* renamed from: u7.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5091q implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final long f41068n;

    public /* synthetic */ C5091q(long j6) {
        this.f41068n = j6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.h.g(this.f41068n ^ Long.MIN_VALUE, ((C5091q) obj).f41068n ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5091q) {
            return this.f41068n == ((C5091q) obj).f41068n;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f41068n);
    }

    public final String toString() {
        long j6 = this.f41068n;
        if (j6 >= 0) {
            A8.b.f(10);
            String l9 = Long.toString(j6, 10);
            kotlin.jvm.internal.h.d(l9, "toString(...)");
            return l9;
        }
        long j9 = 10;
        long j10 = ((j6 >>> 1) / j9) << 1;
        long j11 = j6 - (j10 * j9);
        if (j11 >= j9) {
            j11 -= j9;
            j10++;
        }
        A8.b.f(10);
        String l10 = Long.toString(j10, 10);
        kotlin.jvm.internal.h.d(l10, "toString(...)");
        A8.b.f(10);
        String l11 = Long.toString(j11, 10);
        kotlin.jvm.internal.h.d(l11, "toString(...)");
        return l10.concat(l11);
    }
}
