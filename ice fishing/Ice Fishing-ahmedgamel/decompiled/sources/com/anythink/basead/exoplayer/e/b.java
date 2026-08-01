package com.anythink.basead.exoplayer.e;

import com.anythink.basead.exoplayer.k.af;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7154a = 65536;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7155b = 524288;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7156c = 4096;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.h f7158e;

    /* renamed from: f, reason: collision with root package name */
    private final long f7159f;

    /* renamed from: g, reason: collision with root package name */
    private long f7160g;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f7162j;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f7161h = new byte[65536];

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f7157d = new byte[f7156c];

    public b(com.anythink.basead.exoplayer.j.h hVar, long j6, long j9) {
        this.f7158e = hVar;
        this.f7160g = j6;
        this.f7159f = j9;
    }

    private void f(int i) {
        int i6 = this.i + i;
        byte[] bArr = this.f7161h;
        if (i6 > bArr.length) {
            this.f7161h = Arrays.copyOf(this.f7161h, af.a(bArr.length * 2, 65536 + i6, i6 + f7155b));
        }
    }

    private int g(int i) {
        int min = Math.min(this.f7162j, i);
        h(min);
        return min;
    }

    private void h(int i) {
        int i6 = this.f7162j - i;
        this.f7162j = i6;
        this.i = 0;
        byte[] bArr = this.f7161h;
        byte[] bArr2 = i6 < bArr.length - f7155b ? new byte[65536 + i6] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i6);
        this.f7161h = bArr2;
    }

    private void i(int i) {
        if (i != -1) {
            this.f7160g += i;
        }
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final int a(byte[] bArr, int i, int i6) {
        int e9 = e(bArr, i, i6);
        if (e9 == 0) {
            e9 = a(bArr, i, i6, 0, true);
        }
        i(e9);
        return e9;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final void b(byte[] bArr, int i, int i6) {
        a(bArr, i, i6, false);
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final boolean c(byte[] bArr, int i, int i6) {
        if (!d(i6)) {
            return false;
        }
        System.arraycopy(this.f7161h, this.i - i6, bArr, i, i6);
        return true;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final boolean d(int i) {
        f(i);
        int min = Math.min(this.f7162j - this.i, i);
        while (min < i) {
            int i6 = i;
            min = a(this.f7161h, this.i, i6, min, false);
            if (min == -1) {
                return false;
            }
            i = i6;
        }
        int i9 = this.i + i;
        this.i = i9;
        this.f7162j = Math.max(this.f7162j, i9);
        return true;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final void e(int i) {
        d(i);
    }

    private int e(byte[] bArr, int i, int i6) {
        int i9 = this.f7162j;
        if (i9 == 0) {
            return 0;
        }
        int min = Math.min(i9, i6);
        System.arraycopy(this.f7161h, 0, bArr, i, min);
        h(min);
        return min;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final boolean b(int i) {
        int g4 = g(i);
        while (g4 < i && g4 != -1) {
            g4 = a(this.f7157d, -g4, Math.min(i, this.f7157d.length + g4), g4, false);
        }
        i(g4);
        return g4 != -1;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final long c() {
        return this.f7160g;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final boolean a(byte[] bArr, int i, int i6, boolean z3) {
        int e9 = e(bArr, i, i6);
        while (e9 < i6 && e9 != -1) {
            e9 = a(bArr, i, i6, e9, z3);
        }
        i(e9);
        return e9 != -1;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final void c(int i) {
        int g4 = g(i);
        while (g4 < i && g4 != -1) {
            g4 = a(this.f7157d, -g4, Math.min(i, this.f7157d.length + g4), g4, false);
        }
        i(g4);
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final long d() {
        return this.f7159f;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final int a(int i) {
        int g4 = g(i);
        if (g4 == 0) {
            byte[] bArr = this.f7157d;
            g4 = a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        i(g4);
        return g4;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final long b() {
        return this.f7160g + this.i;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final void d(byte[] bArr, int i, int i6) {
        if (d(i6)) {
            System.arraycopy(this.f7161h, this.i - i6, bArr, i, i6);
        }
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final void a() {
        this.i = 0;
    }

    @Override // com.anythink.basead.exoplayer.e.f
    public final <E extends Throwable> void a(long j6, E e9) {
        com.anythink.basead.exoplayer.k.a.a(j6 >= 0);
        this.f7160g = j6;
        throw e9;
    }

    private int a(byte[] bArr, int i, int i6, int i9, boolean z3) {
        if (!Thread.interrupted()) {
            int a9 = this.f7158e.a(bArr, i + i9, i6 - i9);
            if (a9 != -1) {
                return i9 + a9;
            }
            if (i9 == 0 && z3) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }
}
