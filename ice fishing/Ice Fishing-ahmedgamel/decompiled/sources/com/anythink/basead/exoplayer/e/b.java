package com.anythink.basead.exoplayer.e;

import com.anythink.basead.exoplayer.k.af;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7940a = 65536;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7941b = 524288;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7942c = 4096;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.h f7944e;

    /* renamed from: f, reason: collision with root package name */
    private final long f7945f;

    /* renamed from: g, reason: collision with root package name */
    private long f7946g;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f7948j;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f7947h = new byte[65536];

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f7943d = new byte[f7942c];

    public b(com.anythink.basead.exoplayer.j.h hVar, long j6, long j9) {
        this.f7944e = hVar;
        this.f7946g = j6;
        this.f7945f = j9;
    }

    private void f(int i) {
        int i4 = this.i + i;
        byte[] bArr = this.f7947h;
        if (i4 > bArr.length) {
            this.f7947h = Arrays.copyOf(this.f7947h, af.a(bArr.length * 2, 65536 + i4, i4 + f7941b));
        }
    }

    private int g(int i) {
        int min = Math.min(this.f7948j, i);
        h(min);
        return min;
    }

    private void h(int i) {
        int i4 = this.f7948j - i;
        this.f7948j = i4;
        this.i = 0;
        byte[] bArr = this.f7947h;
        byte[] bArr2 = i4 < bArr.length - f7941b ? new byte[65536 + i4] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i4);
        this.f7947h = bArr2;
    }

    private void i(int i) {
        if (i != -1) {
            this.f7946g += i;
        }
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final int a(byte[] bArr, int i, int i4) {
        int e9 = e(bArr, i, i4);
        if (e9 == 0) {
            e9 = a(bArr, i, i4, 0, true);
        }
        i(e9);
        return e9;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final void b(byte[] bArr, int i, int i4) {
        a(bArr, i, i4, false);
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final boolean c(byte[] bArr, int i, int i4) {
        if (!d(i4)) {
            return false;
        }
        System.arraycopy(this.f7947h, this.i - i4, bArr, i, i4);
        return true;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final boolean d(int i) {
        f(i);
        int min = Math.min(this.f7948j - this.i, i);
        while (min < i) {
            int i4 = i;
            min = a(this.f7947h, this.i, i4, min, false);
            if (min == -1) {
                return false;
            }
            i = i4;
        }
        int i6 = this.i + i;
        this.i = i6;
        this.f7948j = Math.max(this.f7948j, i6);
        return true;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final void e(int i) {
        d(i);
    }

    private int e(byte[] bArr, int i, int i4) {
        int i6 = this.f7948j;
        if (i6 == 0) {
            return 0;
        }
        int min = Math.min(i6, i4);
        System.arraycopy(this.f7947h, 0, bArr, i, min);
        h(min);
        return min;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final boolean b(int i) {
        int g9 = g(i);
        while (g9 < i && g9 != -1) {
            g9 = a(this.f7943d, -g9, Math.min(i, this.f7943d.length + g9), g9, false);
        }
        i(g9);
        return g9 != -1;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final long c() {
        return this.f7946g;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final boolean a(byte[] bArr, int i, int i4, boolean z6) {
        int e9 = e(bArr, i, i4);
        while (e9 < i4 && e9 != -1) {
            e9 = a(bArr, i, i4, e9, z6);
        }
        i(e9);
        return e9 != -1;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final void c(int i) {
        int g9 = g(i);
        while (g9 < i && g9 != -1) {
            g9 = a(this.f7943d, -g9, Math.min(i, this.f7943d.length + g9), g9, false);
        }
        i(g9);
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final long d() {
        return this.f7945f;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final int a(int i) {
        int g9 = g(i);
        if (g9 == 0) {
            byte[] bArr = this.f7943d;
            g9 = a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        i(g9);
        return g9;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final long b() {
        return this.f7946g + this.i;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final void d(byte[] bArr, int i, int i4) {
        if (d(i4)) {
            System.arraycopy(this.f7947h, this.i - i4, bArr, i, i4);
        }
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final void a() {
        this.i = 0;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final <E extends Throwable> void a(long j6, E e9) {
        com.anythink.basead.exoplayer.k.a.a(j6 >= 0);
        this.f7946g = j6;
        throw e9;
    }

    private int a(byte[] bArr, int i, int i4, int i6, boolean z6) {
        if (!Thread.interrupted()) {
            int a9 = this.f7944e.a(bArr, i + i6, i4 - i6);
            if (a9 != -1) {
                return i6 + a9;
            }
            if (i6 == 0 && z6) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }
}
