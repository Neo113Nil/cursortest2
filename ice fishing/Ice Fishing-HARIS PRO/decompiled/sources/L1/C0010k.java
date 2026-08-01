package L1;

/* renamed from: L1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0010k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f566a;

    /* renamed from: b, reason: collision with root package name */
    public final C1.l f567b;

    public C0010k(Object obj, C1.l lVar) {
        this.f566a = obj;
        this.f567b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0010k)) {
            return false;
        }
        C0010k c0010k = (C0010k) obj;
        return D1.i.a(this.f566a, c0010k.f566a) && D1.i.a(this.f567b, c0010k.f567b);
    }

    public final int hashCode() {
        Object obj = this.f566a;
        return this.f567b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f566a + ", onCancellation=" + this.f567b + ')';
    }
}
