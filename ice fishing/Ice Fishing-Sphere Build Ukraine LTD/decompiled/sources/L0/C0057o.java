package L0;

/* renamed from: L0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f672a;

    /* renamed from: b, reason: collision with root package name */
    public final D0.l f673b;

    public C0057o(Object obj, D0.l lVar) {
        this.f672a = obj;
        this.f673b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0057o)) {
            return false;
        }
        C0057o c0057o = (C0057o) obj;
        return E0.i.a(this.f672a, c0057o.f672a) && E0.i.a(this.f673b, c0057o.f673b);
    }

    public final int hashCode() {
        Object obj = this.f672a;
        return this.f673b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f672a + ", onCancellation=" + this.f673b + ')';
    }
}
