package com.anythink.core.common.n.c;

import com.google.android.gms.internal.ads.Wv;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class r implements e {

    /* renamed from: a, reason: collision with root package name */
    public final c f16695a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final w f16696b;

    /* renamed from: c, reason: collision with root package name */
    boolean f16697c;

    public r(w wVar) {
        if (wVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f16696b = wVar;
    }

    @Override // com.anythink.core.common.n.c.e
    public final void a(long j6) {
        if (!b(j6)) {
            throw new EOFException();
        }
    }

    @Override // com.anythink.core.common.n.c.w
    public final long a_(c cVar, long j6) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j6 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j6)));
        }
        if (this.f16697c) {
            throw new IllegalStateException("closed");
        }
        c cVar2 = this.f16695a;
        if (cVar2.f16634c == 0 && this.f16696b.a_(cVar2, 8192L) == -1) {
            return -1L;
        }
        return this.f16695a.a_(cVar, Math.min(j6, this.f16695a.f16634c));
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean b(long j6) {
        c cVar;
        if (j6 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j6)));
        }
        if (this.f16697c) {
            throw new IllegalStateException("closed");
        }
        do {
            cVar = this.f16695a;
            if (cVar.f16634c >= j6) {
                return true;
            }
        } while (this.f16696b.a_(cVar, 8192L) != -1);
        return false;
    }

    @Override // com.anythink.core.common.n.c.e
    public final c c() {
        return this.f16695a;
    }

    @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16697c) {
            return;
        }
        this.f16697c = true;
        this.f16696b.close();
        this.f16695a.z();
    }

    @Override // com.anythink.core.common.n.c.e
    public final c d() {
        return this.f16695a;
    }

    @Override // com.anythink.core.common.n.c.e
    public final String e(long j6) {
        a(j6);
        return this.f16695a.e(j6);
    }

    @Override // com.anythink.core.common.n.c.e
    public final String f(long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j6)));
        }
        long j9 = j6 == Long.MAX_VALUE ? Long.MAX_VALUE : j6 + 1;
        long a9 = a((byte) 10, 0L, j9);
        if (a9 != -1) {
            return this.f16695a.g(a9);
        }
        if (j9 < Long.MAX_VALUE && b(j9) && this.f16695a.c(j9 - 1) == 13 && b(j9 + 1) && this.f16695a.c(j9) == 10) {
            return this.f16695a.g(j9);
        }
        c cVar = new c();
        c cVar2 = this.f16695a;
        cVar2.a(cVar, 0L, Math.min(32L, cVar2.f16634c));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f16695a.f16634c, j6) + " content=" + cVar.t().g() + (char) 8230);
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean g() {
        if (this.f16697c) {
            throw new IllegalStateException("closed");
        }
        return this.f16695a.g() && this.f16696b.a_(this.f16695a, 8192L) == -1;
    }

    @Override // com.anythink.core.common.n.c.e
    public final byte[] h(long j6) {
        a(j6);
        return this.f16695a.h(j6);
    }

    @Override // com.anythink.core.common.n.c.e
    public final void i(long j6) {
        if (this.f16697c) {
            throw new IllegalStateException("closed");
        }
        while (j6 > 0) {
            c cVar = this.f16695a;
            if (cVar.f16634c == 0 && this.f16696b.a_(cVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j6, this.f16695a.f16634c);
            this.f16695a.i(min);
            j6 -= min;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f16697c;
    }

    @Override // com.anythink.core.common.n.c.e
    public final byte k() {
        a(1L);
        return this.f16695a.k();
    }

    @Override // com.anythink.core.common.n.c.e
    public final short l() {
        a(2L);
        return this.f16695a.l();
    }

    @Override // com.anythink.core.common.n.c.e
    public final int m() {
        a(4L);
        return this.f16695a.m();
    }

    @Override // com.anythink.core.common.n.c.e
    public final long n() {
        a(8L);
        return this.f16695a.n();
    }

    @Override // com.anythink.core.common.n.c.e
    public final short o() {
        a(2L);
        return y.a(this.f16695a.l());
    }

    @Override // com.anythink.core.common.n.c.e
    public final int p() {
        a(4L);
        return y.a(this.f16695a.m());
    }

    @Override // com.anythink.core.common.n.c.e
    public final long q() {
        a(8L);
        return y.a(this.f16695a.n());
    }

    @Override // com.anythink.core.common.n.c.e
    public final long r() {
        byte c9;
        a(1L);
        int i = 0;
        while (true) {
            int i4 = i + 1;
            if (!b(i4)) {
                break;
            }
            c9 = this.f16695a.c(i);
            if ((c9 < 48 || c9 > 57) && !(i == 0 && c9 == 45)) {
                break;
            }
            i = i4;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(c9)));
        }
        return this.f16695a.r();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        c cVar = this.f16695a;
        if (cVar.f16634c == 0 && this.f16696b.a_(cVar, 8192L) == -1) {
            return -1;
        }
        return this.f16695a.read(byteBuffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r2)));
     */
    @Override // com.anythink.core.common.n.c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long s() {
        a(1L);
        int i = 0;
        while (true) {
            int i4 = i + 1;
            if (!b(i4)) {
                break;
            }
            byte c9 = this.f16695a.c(i);
            if ((c9 < 48 || c9 > 57) && ((c9 < 97 || c9 > 102) && (c9 < 65 || c9 > 70))) {
                break;
            }
            i = i4;
        }
        return this.f16695a.s();
    }

    @Override // com.anythink.core.common.n.c.e
    public final f t() {
        this.f16695a.a(this.f16696b);
        return this.f16695a.t();
    }

    public final String toString() {
        return "buffer(" + this.f16696b + ")";
    }

    @Override // com.anythink.core.common.n.c.e
    public final String u() {
        this.f16695a.a(this.f16696b);
        return this.f16695a.u();
    }

    @Override // com.anythink.core.common.n.c.e
    public final String v() {
        long a9 = a((byte) 10);
        if (a9 != -1) {
            return this.f16695a.g(a9);
        }
        long j6 = this.f16695a.f16634c;
        if (j6 != 0) {
            return e(j6);
        }
        return null;
    }

    @Override // com.anythink.core.common.n.c.e
    public final String w() {
        return f(Long.MAX_VALUE);
    }

    @Override // com.anythink.core.common.n.c.e
    public final int x() {
        int i;
        int i4;
        int i6;
        a(1L);
        byte c9 = this.f16695a.c(0L);
        if ((c9 & 224) == 192) {
            a(2L);
        } else if ((c9 & 240) == 224) {
            a(3L);
        } else if ((c9 & 248) == 240) {
            a(4L);
        }
        c cVar = this.f16695a;
        if (cVar.f16634c == 0) {
            throw new EOFException();
        }
        byte c10 = cVar.c(0L);
        if ((c10 & com.anythink.core.common.s.a.c.f17103a) == 0) {
            i = c10 & Byte.MAX_VALUE;
            i6 = 0;
            i4 = 1;
        } else if ((c10 & 224) == 192) {
            i = c10 & 31;
            i4 = 2;
            i6 = 128;
        } else if ((c10 & 240) == 224) {
            i = c10 & 15;
            i4 = 3;
            i6 = 2048;
        } else {
            if ((c10 & 248) != 240) {
                cVar.i(1L);
                return 65533;
            }
            i = c10 & 7;
            i4 = 4;
            i6 = com.anythink.basead.exoplayer.b.aX;
        }
        long j6 = i4;
        if (cVar.f16634c < j6) {
            StringBuilder k9 = Wv.k(i4, "size < ", ": ");
            k9.append(cVar.f16634c);
            k9.append(" (to read code point prefixed 0x");
            k9.append(Integer.toHexString(c10));
            k9.append(")");
            throw new EOFException(k9.toString());
        }
        for (int i9 = 1; i9 < i4; i9++) {
            long j9 = i9;
            byte c11 = cVar.c(j9);
            if ((c11 & 192) != 128) {
                cVar.i(j9);
                return 65533;
            }
            i = (i << 6) | (c11 & com.anythink.core.common.s.a.c.f17105c);
        }
        cVar.i(j6);
        if (i > 1114111) {
            return 65533;
        }
        if ((i < 55296 || i > 57343) && i >= i6) {
            return i;
        }
        return 65533;
    }

    @Override // com.anythink.core.common.n.c.e
    public final byte[] y() {
        this.f16695a.a(this.f16696b);
        return this.f16695a.y();
    }

    @Override // com.anythink.core.common.n.c.e
    public final int a(o oVar) {
        if (this.f16697c) {
            throw new IllegalStateException("closed");
        }
        do {
            int a9 = this.f16695a.a(oVar, true);
            if (a9 == -1) {
                return -1;
            }
            if (a9 != -2) {
                this.f16695a.i(oVar.f16683a[a9].j());
                return a9;
            }
        } while (this.f16696b.a_(this.f16695a, 8192L) != -1);
        return -1;
    }

    @Override // com.anythink.core.common.n.c.e
    public final long c(f fVar) {
        return b(fVar, 0L);
    }

    @Override // com.anythink.core.common.n.c.e
    public final f d(long j6) {
        a(j6);
        return this.f16695a.d(j6);
    }

    @Override // com.anythink.core.common.n.c.e
    public final e h() {
        return n.a(new p(this));
    }

    @Override // com.anythink.core.common.n.c.e
    public final void b(byte[] bArr) {
        try {
            a(bArr.length);
            this.f16695a.b(bArr);
        } catch (EOFException e9) {
            int i = 0;
            while (true) {
                c cVar = this.f16695a;
                long j6 = cVar.f16634c;
                if (j6 > 0) {
                    int a9 = cVar.a(bArr, i, (int) j6);
                    if (a9 == -1) {
                        throw new AssertionError();
                    }
                    i += a9;
                } else {
                    throw e9;
                }
            }
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final int a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    @Override // com.anythink.core.common.n.c.e
    public final int a(byte[] bArr, int i, int i4) {
        long j6 = i4;
        y.a(bArr.length, i, j6);
        c cVar = this.f16695a;
        if (cVar.f16634c == 0 && this.f16696b.a_(cVar, 8192L) == -1) {
            return -1;
        }
        return this.f16695a.a(bArr, i, (int) Math.min(j6, this.f16695a.f16634c));
    }

    @Override // com.anythink.core.common.n.c.e
    public final InputStream i() {
        return new InputStream() { // from class: com.anythink.core.common.n.c.r.1
            @Override // java.io.InputStream
            public final int available() {
                r rVar = r.this;
                if (rVar.f16697c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(rVar.f16695a.f16634c, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                r.this.close();
            }

            @Override // java.io.InputStream
            public final int read() {
                r rVar = r.this;
                if (rVar.f16697c) {
                    throw new IOException("closed");
                }
                c cVar = rVar.f16695a;
                if (cVar.f16634c == 0 && rVar.f16696b.a_(cVar, 8192L) == -1) {
                    return -1;
                }
                return r.this.f16695a.k() & 255;
            }

            public final String toString() {
                return r.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i4) {
                if (!r.this.f16697c) {
                    y.a(bArr.length, i, i4);
                    r rVar = r.this;
                    c cVar = rVar.f16695a;
                    if (cVar.f16634c == 0 && rVar.f16696b.a_(cVar, 8192L) == -1) {
                        return -1;
                    }
                    return r.this.f16695a.a(bArr, i, i4);
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // com.anythink.core.common.n.c.e
    public final void b(c cVar, long j6) {
        try {
            a(j6);
            this.f16695a.b(cVar, j6);
        } catch (EOFException e9) {
            cVar.a((w) this.f16695a);
            throw e9;
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(v vVar) {
        if (vVar != null) {
            long j6 = 0;
            while (this.f16696b.a_(this.f16695a, 8192L) != -1) {
                long j9 = this.f16695a.j();
                if (j9 > 0) {
                    j6 += j9;
                    vVar.a(this.f16695a, j9);
                }
            }
            c cVar = this.f16695a;
            long j10 = cVar.f16634c;
            if (j10 <= 0) {
                return j6;
            }
            long j11 = j6 + j10;
            vVar.a(cVar, j10);
            return j11;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // com.anythink.core.common.n.c.e
    public final long b(f fVar) {
        return a(fVar, 0L);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long b(f fVar, long j6) {
        if (this.f16697c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long b9 = this.f16695a.b(fVar, j6);
            if (b9 != -1) {
                return b9;
            }
            c cVar = this.f16695a;
            long j9 = cVar.f16634c;
            if (this.f16696b.a_(cVar, 8192L) == -1) {
                return -1L;
            }
            j6 = Math.max(j6, j9);
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final String a(Charset charset) {
        if (charset != null) {
            this.f16695a.a(this.f16696b);
            return this.f16695a.a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.anythink.core.common.n.c.e
    public final String a(long j6, Charset charset) {
        a(j6);
        if (charset != null) {
            return this.f16695a.a(j6, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(byte b9) {
        return a(b9, 0L, Long.MAX_VALUE);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(byte b9, long j6) {
        return a(b9, j6, Long.MAX_VALUE);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(byte b9, long j6, long j9) {
        if (this.f16697c) {
            throw new IllegalStateException("closed");
        }
        if (j6 < 0 || j9 < j6) {
            throw new IllegalArgumentException("fromIndex=" + j6 + " toIndex=" + j9);
        }
        long j10 = j6;
        while (j10 < j9) {
            byte b10 = b9;
            long j11 = j9;
            long a9 = this.f16695a.a(b10, j10, j11);
            if (a9 == -1) {
                c cVar = this.f16695a;
                long j12 = cVar.f16634c;
                if (j12 >= j11 || this.f16696b.a_(cVar, 8192L) == -1) {
                    break;
                }
                j10 = Math.max(j10, j12);
                b9 = b10;
                j9 = j11;
            } else {
                return a9;
            }
        }
        return -1L;
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(f fVar, long j6) {
        if (this.f16697c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long a9 = this.f16695a.a(fVar, j6);
            if (a9 != -1) {
                return a9;
            }
            c cVar = this.f16695a;
            long j9 = cVar.f16634c;
            if (this.f16696b.a_(cVar, 8192L) == -1) {
                return -1L;
            }
            j6 = Math.max(j6, (j9 - fVar.j()) + 1);
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean a(long j6, f fVar) {
        return a(j6, fVar, fVar.j());
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean a(long j6, f fVar, int i) {
        if (!this.f16697c) {
            if (j6 < 0 || i < 0 || fVar.j() < i) {
                return false;
            }
            for (int i4 = 0; i4 < i; i4++) {
                long j9 = i4 + j6;
                if (!b(1 + j9) || this.f16695a.c(j9) != fVar.b(i4)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.anythink.core.common.n.c.w
    public final x a() {
        return this.f16696b.a();
    }
}
