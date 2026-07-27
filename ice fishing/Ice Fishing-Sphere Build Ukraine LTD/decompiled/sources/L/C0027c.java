package L;

/* renamed from: L.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027c {

    /* renamed from: a, reason: collision with root package name */
    public long f527a = 0;

    /* renamed from: b, reason: collision with root package name */
    public C0027c f528b;

    public final int a(int i2) {
        C0027c c0027c = this.f528b;
        if (c0027c == null) {
            return i2 >= 64 ? Long.bitCount(this.f527a) : Long.bitCount(this.f527a & ((1 << i2) - 1));
        }
        if (i2 < 64) {
            return Long.bitCount(this.f527a & ((1 << i2) - 1));
        }
        return Long.bitCount(this.f527a) + c0027c.a(i2 - 64);
    }

    public final boolean b(int i2) {
        if (i2 < 64) {
            return (this.f527a & (1 << i2)) != 0;
        }
        if (this.f528b == null) {
            this.f528b = new C0027c();
        }
        return this.f528b.b(i2 - 64);
    }

    public final void c() {
        this.f527a = 0L;
        C0027c c0027c = this.f528b;
        if (c0027c != null) {
            c0027c.c();
        }
    }

    public final String toString() {
        if (this.f528b == null) {
            return Long.toBinaryString(this.f527a);
        }
        return this.f528b.toString() + "xx" + Long.toBinaryString(this.f527a);
    }
}
