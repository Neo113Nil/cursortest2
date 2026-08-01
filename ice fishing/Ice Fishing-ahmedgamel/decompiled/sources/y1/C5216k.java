package y1;

/* renamed from: y1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5216k {

    /* renamed from: a, reason: collision with root package name */
    public final String f41809a;

    public C5216k(String str) {
        this.f41809a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5216k) {
            return this.f41809a.equals(((C5216k) obj).f41809a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41809a.hashCode();
    }

    public final String toString() {
        return u1.h.g(new StringBuilder("StringHeaderFactory{value='"), this.f41809a, "'}");
    }
}
