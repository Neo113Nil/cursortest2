package u7;

/* loaded from: classes2.dex */
public final class t implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final short f41071n;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.h.f(this.f41071n & 65535, ((t) obj).f41071n & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f41071n == ((t) obj).f41071n;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f41071n);
    }

    public final String toString() {
        return String.valueOf(65535 & this.f41071n);
    }
}
