package A1;

/* renamed from: A1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f63a;

    /* renamed from: b, reason: collision with root package name */
    public final t1.l f64b;

    public C0014o(Object obj, t1.l lVar) {
        this.f63a = obj;
        this.f64b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0014o)) {
            return false;
        }
        C0014o c0014o = (C0014o) obj;
        return kotlin.jvm.internal.i.a(this.f63a, c0014o.f63a) && kotlin.jvm.internal.i.a(this.f64b, c0014o.f64b);
    }

    public final int hashCode() {
        Object obj = this.f63a;
        return this.f64b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f63a + ", onCancellation=" + this.f64b + ')';
    }
}
