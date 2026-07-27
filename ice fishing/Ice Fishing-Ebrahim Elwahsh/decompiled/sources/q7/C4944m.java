package q7;

/* renamed from: q7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4944m implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final byte f40174n;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.h.f(this.f40174n & 255, ((C4944m) obj).f40174n & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4944m) {
            return this.f40174n == ((C4944m) obj).f40174n;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f40174n);
    }

    public final String toString() {
        return String.valueOf(this.f40174n & 255);
    }
}
