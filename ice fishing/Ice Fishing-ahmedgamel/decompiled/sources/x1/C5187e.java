package x1;

/* renamed from: x1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5187e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C5188f f41819a;

    /* renamed from: b, reason: collision with root package name */
    public int f41820b;

    /* renamed from: c, reason: collision with root package name */
    public Class f41821c;

    public C5187e(C5188f c5188f) {
        this.f41819a = c5188f;
    }

    @Override // x1.i
    public final void a() {
        this.f41819a.f(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5187e) {
            C5187e c5187e = (C5187e) obj;
            if (this.f41820b == c5187e.f41820b && this.f41821c == c5187e.f41821c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f41820b * 31;
        Class cls = this.f41821c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f41820b + "array=" + this.f41821c + '}';
    }
}
