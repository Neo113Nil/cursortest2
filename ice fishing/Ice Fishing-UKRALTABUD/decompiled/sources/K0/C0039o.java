package K0;

/* renamed from: K0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f524a;

    /* renamed from: b, reason: collision with root package name */
    public final D0.l f525b;

    public C0039o(Object obj, D0.l lVar) {
        this.f524a = obj;
        this.f525b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0039o)) {
            return false;
        }
        C0039o c0039o = (C0039o) obj;
        return E0.i.a(this.f524a, c0039o.f524a) && E0.i.a(this.f525b, c0039o.f525b);
    }

    public final int hashCode() {
        Object obj = this.f524a;
        return this.f525b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f524a + ", onCancellation=" + this.f525b + ')';
    }
}
