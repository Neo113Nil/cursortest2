package L;

/* renamed from: L.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052c {

    /* renamed from: a, reason: collision with root package name */
    public long f605a = 0;

    /* renamed from: b, reason: collision with root package name */
    public C0052c f606b;

    public final int a(int i2) {
        C0052c c0052c = this.f606b;
        if (c0052c == null) {
            return i2 >= 64 ? Long.bitCount(this.f605a) : Long.bitCount(this.f605a & ((1 << i2) - 1));
        }
        if (i2 < 64) {
            return Long.bitCount(this.f605a & ((1 << i2) - 1));
        }
        return Long.bitCount(this.f605a) + c0052c.a(i2 - 64);
    }

    public final boolean b(int i2) {
        if (i2 < 64) {
            return (this.f605a & (1 << i2)) != 0;
        }
        if (this.f606b == null) {
            this.f606b = new C0052c();
        }
        return this.f606b.b(i2 - 64);
    }

    public final void c() {
        this.f605a = 0L;
        C0052c c0052c = this.f606b;
        if (c0052c != null) {
            c0052c.c();
        }
    }

    public final String toString() {
        if (this.f606b == null) {
            return Long.toBinaryString(this.f605a);
        }
        return this.f606b.toString() + "xx" + Long.toBinaryString(this.f605a);
    }
}
