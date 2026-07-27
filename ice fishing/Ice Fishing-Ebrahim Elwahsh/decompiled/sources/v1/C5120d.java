package v1;

/* renamed from: v1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5120d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C5121e f41335a;

    /* renamed from: b, reason: collision with root package name */
    public int f41336b;

    /* renamed from: c, reason: collision with root package name */
    public Class f41337c;

    public C5120d(C5121e c5121e) {
        this.f41335a = c5121e;
    }

    @Override // v1.g
    public final void a() {
        this.f41335a.f(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5120d) {
            C5120d c5120d = (C5120d) obj;
            if (this.f41336b == c5120d.f41336b && this.f41337c == c5120d.f41337c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f41336b * 31;
        Class cls = this.f41337c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f41336b + "array=" + this.f41337c + '}';
    }
}
