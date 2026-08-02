package u7;

/* renamed from: u7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5087m implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final byte f41064n;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.h.f(this.f41064n & 255, ((C5087m) obj).f41064n & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5087m) {
            return this.f41064n == ((C5087m) obj).f41064n;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f41064n);
    }

    public final String toString() {
        return String.valueOf(this.f41064n & 255);
    }
}
