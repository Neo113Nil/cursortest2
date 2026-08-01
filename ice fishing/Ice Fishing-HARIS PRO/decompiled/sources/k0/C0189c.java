package k0;

/* renamed from: k0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189c {

    /* renamed from: a, reason: collision with root package name */
    public long f3465a = 0;

    /* renamed from: b, reason: collision with root package name */
    public C0189c f3466b;

    public final void a(int i) {
        if (i < 64) {
            this.f3465a &= ~(1 << i);
            return;
        }
        C0189c c0189c = this.f3466b;
        if (c0189c != null) {
            c0189c.a(i - 64);
        }
    }

    public final int b(int i) {
        C0189c c0189c = this.f3466b;
        if (c0189c == null) {
            return i >= 64 ? Long.bitCount(this.f3465a) : Long.bitCount(this.f3465a & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f3465a & ((1 << i) - 1));
        }
        return Long.bitCount(this.f3465a) + c0189c.b(i - 64);
    }

    public final void c() {
        if (this.f3466b == null) {
            this.f3466b = new C0189c();
        }
    }

    public final boolean d(int i) {
        if (i < 64) {
            return (this.f3465a & (1 << i)) != 0;
        }
        c();
        return this.f3466b.d(i - 64);
    }

    public final void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            this.f3466b.e(i - 64, z2);
            return;
        }
        long j = this.f3465a;
        boolean z3 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f3465a = ((j & (~j2)) << 1) | (j & j2);
        if (z2) {
            h(i);
        } else {
            a(i);
        }
        if (z3 || this.f3466b != null) {
            c();
            this.f3466b.e(0, z3);
        }
    }

    public final boolean f(int i) {
        if (i >= 64) {
            c();
            return this.f3466b.f(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f3465a;
        boolean z2 = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f3465a = j3;
        long j4 = j - 1;
        this.f3465a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C0189c c0189c = this.f3466b;
        if (c0189c != null) {
            if (c0189c.d(0)) {
                h(63);
            }
            this.f3466b.f(0);
        }
        return z2;
    }

    public final void g() {
        this.f3465a = 0L;
        C0189c c0189c = this.f3466b;
        if (c0189c != null) {
            c0189c.g();
        }
    }

    public final void h(int i) {
        if (i < 64) {
            this.f3465a |= 1 << i;
        } else {
            c();
            this.f3466b.h(i - 64);
        }
    }

    public final String toString() {
        if (this.f3466b == null) {
            return Long.toBinaryString(this.f3465a);
        }
        return this.f3466b.toString() + "xx" + Long.toBinaryString(this.f3465a);
    }
}
