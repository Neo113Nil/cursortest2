package v1;

/* renamed from: v1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5107d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C5108e f41362a;

    /* renamed from: b, reason: collision with root package name */
    public int f41363b;

    /* renamed from: c, reason: collision with root package name */
    public Class f41364c;

    public C5107d(C5108e c5108e) {
        this.f41362a = c5108e;
    }

    @Override // v1.g
    public final void a() {
        this.f41362a.f(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5107d) {
            C5107d c5107d = (C5107d) obj;
            if (this.f41363b == c5107d.f41363b && this.f41364c == c5107d.f41364c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f41363b * 31;
        Class cls = this.f41364c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f41363b + "array=" + this.f41364c + '}';
    }
}
