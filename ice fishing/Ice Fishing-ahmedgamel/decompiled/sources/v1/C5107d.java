package v1;

/* renamed from: v1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5107d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C5108e f41365a;

    /* renamed from: b, reason: collision with root package name */
    public int f41366b;

    /* renamed from: c, reason: collision with root package name */
    public Class f41367c;

    public C5107d(C5108e c5108e) {
        this.f41365a = c5108e;
    }

    @Override // v1.g
    public final void a() {
        this.f41365a.f(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5107d) {
            C5107d c5107d = (C5107d) obj;
            if (this.f41366b == c5107d.f41366b && this.f41367c == c5107d.f41367c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f41366b * 31;
        Class cls = this.f41367c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f41366b + "array=" + this.f41367c + '}';
    }
}
