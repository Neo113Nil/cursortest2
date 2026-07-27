package com.anythink.basead.exoplayer.e;

import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7311a = 65536;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7312b = 524288;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7313c = 4096;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.h f7315e;

    /* renamed from: f, reason: collision with root package name */
    private final long f7316f;

    /* renamed from: g, reason: collision with root package name */
    private long f7317g;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f7319j;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f7318h = new byte[65536];

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f7314d = new byte[f7313c];

    public b(com.anythink.basead.exoplayer.j.h hVar, long j9, long j10) {
        this.f7315e = hVar;
        this.f7317g = j9;
        this.f7316f = j10;
    }

    private void f(int i) {
        int i4 = this.i + i;
        byte[] bArr = this.f7318h;
        if (i4 > bArr.length) {
            this.f7318h = Arrays.copyOf(this.f7318h, af.a(bArr.length * 2, 65536 + i4, i4 + f7312b));
        }
    }

    private int g(int i) {
        int min = Math.min(this.f7319j, i);
        h(min);
        return min;
    }

    private void h(int i) {
        int i4 = this.f7319j - i;
        this.f7319j = i4;
        this.i = 0;
        byte[] bArr = this.f7318h;
        byte[] bArr2 = i4 < bArr.length - f7312b ? new byte[65536 + i4] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i4);
        this.f7318h = bArr2;
    }

    private void i(int i) {
        if (i != -1) {
            this.f7317g += i;
        }
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final int a(byte[] bArr, int i, int i4) {
        int e6 = e(bArr, i, i4);
        if (e6 == 0) {
            e6 = a(bArr, i, i4, 0, true);
        }
        i(e6);
        return e6;
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
        System.arraycopy(this.f7318h, this.i - i4, bArr, i, i4);
        return true;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final boolean d(int i) {
        f(i);
        int min = Math.min(this.f7319j - this.i, i);
        while (min < i) {
            int i4 = i;
            min = a(this.f7318h, this.i, i4, min, false);
            if (min == -1) {
                return false;
            }
            i = i4;
        }
        int i9 = this.i + i;
        this.i = i9;
        this.f7319j = Math.max(this.f7319j, i9);
        return true;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final void e(int i) {
        d(i);
    }

    private int e(byte[] bArr, int i, int i4) {
        int i9 = this.f7319j;
        if (i9 == 0) {
            return 0;
        }
        int min = Math.min(i9, i4);
        System.arraycopy(this.f7318h, 0, bArr, i, min);
        h(min);
        return min;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final boolean b(int i) {
        int g9 = g(i);
        while (g9 < i && g9 != -1) {
            g9 = a(this.f7314d, -g9, Math.min(i, this.f7314d.length + g9), g9, false);
        }
        i(g9);
        return g9 != -1;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final long c() {
        return this.f7317g;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final boolean a(byte[] bArr, int i, int i4, boolean z8) {
        int e6 = e(bArr, i, i4);
        while (e6 < i4 && e6 != -1) {
            e6 = a(bArr, i, i4, e6, z8);
        }
        i(e6);
        return e6 != -1;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final void c(int i) {
        int g9 = g(i);
        while (g9 < i && g9 != -1) {
            g9 = a(this.f7314d, -g9, Math.min(i, this.f7314d.length + g9), g9, false);
        }
        i(g9);
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final long d() {
        return this.f7316f;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final int a(int i) {
        int g9 = g(i);
        if (g9 == 0) {
            byte[] bArr = this.f7314d;
            g9 = a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        i(g9);
        return g9;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final long b() {
        return this.f7317g + this.i;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final void d(byte[] bArr, int i, int i4) {
        if (d(i4)) {
            System.arraycopy(this.f7318h, this.i - i4, bArr, i, i4);
        }
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final void a() {
        this.i = 0;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final <E extends Throwable> void a(long j9, E e6) {
        C0544a.a(j9 >= 0);
        this.f7317g = j9;
        throw e6;
    }

    private int a(byte[] bArr, int i, int i4, int i9, boolean z8) {
        if (!Thread.interrupted()) {
            int a9 = this.f7315e.a(bArr, i + i9, i4 - i9);
            if (a9 != -1) {
                return i9 + a9;
            }
            if (i9 == 0 && z8) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }
}
