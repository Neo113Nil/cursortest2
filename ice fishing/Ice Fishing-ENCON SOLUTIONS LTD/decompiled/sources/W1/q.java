package W1;

import a.AbstractC0083a;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class q implements i {

    /* renamed from: a, reason: collision with root package name */
    public final w f1895a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1896b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1897c;

    public q(w source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f1895a = source;
        this.f1896b = new g();
    }

    public final boolean a() {
        if (this.f1897c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f1896b;
        return gVar.a() && this.f1895a.e(gVar, 8192L) == -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        throw new java.lang.IllegalArgumentException(("size=" + r6.f1875b + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(byte b2, long j2, long j3) {
        long j4;
        r rVar;
        q qVar = this;
        long j5 = j3;
        if (qVar.f1897c) {
            throw new IllegalStateException("closed");
        }
        long j6 = 0;
        if (0 > j5) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j5).toString());
        }
        while (true) {
            if (j6 >= j5) {
                j4 = -1;
                break;
            }
            g gVar = qVar.f1896b;
            gVar.getClass();
            long j7 = 0;
            if (0 > j6 || j6 > j5) {
                break;
            }
            long j8 = gVar.f1875b;
            long j9 = j5 > j8 ? j8 : j5;
            long j10 = -1;
            if (j6 != j9 && (rVar = gVar.f1874a) != null) {
                if (j8 - j6 >= j6) {
                    while (true) {
                        long j11 = (rVar.f1900c - rVar.f1899b) + j7;
                        if (j11 > j6) {
                            break;
                        }
                        rVar = rVar.f1903f;
                        kotlin.jvm.internal.i.b(rVar);
                        j7 = j11;
                    }
                    long j12 = j6;
                    while (true) {
                        if (j7 >= j9) {
                            break;
                        }
                        int min = (int) Math.min(rVar.f1900c, (rVar.f1899b + j9) - j7);
                        for (int i2 = (int) ((rVar.f1899b + j12) - j7); i2 < min; i2++) {
                            if (rVar.f1898a[i2] == b2) {
                                j10 = (i2 - rVar.f1899b) + j7;
                                break;
                            }
                        }
                        j12 = (rVar.f1900c - rVar.f1899b) + j7;
                        rVar = rVar.f1903f;
                        kotlin.jvm.internal.i.b(rVar);
                        j7 = j12;
                    }
                } else {
                    while (j8 > j6) {
                        rVar = rVar.f1904g;
                        kotlin.jvm.internal.i.b(rVar);
                        j8 -= rVar.f1900c - rVar.f1899b;
                    }
                    long j13 = j6;
                    while (true) {
                        if (j8 >= j9) {
                            break;
                        }
                        int min2 = (int) Math.min(rVar.f1900c, (rVar.f1899b + j9) - j8);
                        for (int i3 = (int) ((rVar.f1899b + j13) - j8); i3 < min2; i3++) {
                            if (rVar.f1898a[i3] == b2) {
                                j10 = (i3 - rVar.f1899b) + j8;
                                break;
                            }
                        }
                        j13 = j8 + (rVar.f1900c - rVar.f1899b);
                        rVar = rVar.f1903f;
                        kotlin.jvm.internal.i.b(rVar);
                        j8 = j13;
                    }
                }
            }
            j4 = -1;
            if (j10 != -1) {
                return j10;
            }
            long j14 = gVar.f1875b;
            if (j14 >= j3) {
                break;
            }
            qVar = this;
            if (qVar.f1895a.e(gVar, 8192L) == -1) {
                break;
            }
            j6 = Math.max(j6, j14);
            j5 = j3;
        }
        return j4;
    }

    public final byte c() {
        q(1L);
        return this.f1896b.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f1897c) {
            return;
        }
        this.f1897c = true;
        this.f1895a.close();
        g gVar = this.f1896b;
        gVar.o(gVar.f1875b);
    }

    @Override // W1.w
    public final y d() {
        return this.f1895a.d();
    }

    @Override // W1.w
    public final long e(g sink, long j2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f1897c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f1896b;
        if (gVar.f1875b == 0 && this.f1895a.e(gVar, 8192L) == -1) {
            return -1L;
        }
        return gVar.e(sink, Math.min(j2, gVar.f1875b));
    }

    @Override // W1.i
    public final byte[] f() {
        g gVar = this.f1896b;
        gVar.t(this.f1895a);
        return gVar.j(gVar.f1875b);
    }

    @Override // W1.i
    public final InputStream i() {
        return new f(this, 1);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1897c;
    }

    public final j j(long j2) {
        q(j2);
        return this.f1896b.k(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        r14.f1875b -= r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011d, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        g gVar;
        long j2;
        int i2;
        int i3;
        byte b2;
        q(1L);
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            boolean p2 = p(i5);
            gVar = this.f1896b;
            if (!p2) {
                break;
            }
            b2 = gVar.b(i4);
            if ((b2 < 48 || b2 > 57) && ((b2 < 97 || b2 > 102) && (b2 < 65 || b2 > 70))) {
                break;
            }
            i4 = i5;
        }
        if (i4 == 0) {
            R1.d.b(16);
            R1.d.b(16);
            String num = Integer.toString(b2, 16);
            kotlin.jvm.internal.i.d(num, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
        }
        long j3 = 0;
        if (gVar.f1875b == 0) {
            throw new EOFException();
        }
        long j4 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (true) {
            r rVar = gVar.f1874a;
            kotlin.jvm.internal.i.b(rVar);
            int i7 = rVar.f1899b;
            int i8 = rVar.f1900c;
            int i9 = i6;
            while (i7 < i8) {
                byte b3 = rVar.f1898a[i7];
                if (b3 >= 48 && b3 <= 57) {
                    i3 = b3 - 48;
                } else if (b3 >= 97 && b3 <= 102) {
                    i3 = b3 - 87;
                } else if (b3 < 65 || b3 > 70) {
                    i2 = i9;
                    j2 = 0;
                    if (i2 == 0) {
                        char[] cArr = X1.b.f1919a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b3 >> 4) & 15], cArr[b3 & 15]})));
                    }
                    z2 = true;
                    if (i7 != i8) {
                        gVar.f1874a = rVar.a();
                        s.a(rVar);
                    } else {
                        rVar.f1899b = i7;
                    }
                    if (!!z2 || gVar.f1874a == null) {
                        break;
                    }
                    i6 = i2;
                    j3 = j2;
                } else {
                    i3 = b3 - 55;
                }
                if ((j4 & (-1152921504606846976L)) != 0) {
                    g gVar2 = new g();
                    gVar2.v(j4);
                    gVar2.u(b3);
                    throw new NumberFormatException("Number too large: ".concat(gVar2.n(gVar2.f1875b, z1.a.f8620a)));
                }
                j4 = (j4 << 4) | i3;
                i7++;
                i9++;
                j3 = 0;
            }
            j2 = j3;
            i2 = i9;
            if (i7 != i8) {
            }
            if (!z2) {
                break;
            }
            break;
        }
    }

    public final int l() {
        q(4L);
        return this.f1896b.l();
    }

    public final int m() {
        q(4L);
        int l2 = this.f1896b.l();
        return ((l2 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & l2) >>> 24) | ((16711680 & l2) >>> 8) | ((65280 & l2) << 8);
    }

    public final short n() {
        q(2L);
        return this.f1896b.m();
    }

    public final String o(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long b2 = b((byte) 10, 0L, j3);
        g gVar = this.f1896b;
        if (b2 != -1) {
            return X1.a.a(gVar, b2);
        }
        if (j3 < Long.MAX_VALUE && p(j3) && gVar.b(j3 - 1) == 13 && p(1 + j3) && gVar.b(j3) == 10) {
            return X1.a.a(gVar, j3);
        }
        g out = new g();
        long min = Math.min(32, gVar.f1875b);
        long j4 = 0;
        gVar.getClass();
        kotlin.jvm.internal.i.e(out, "out");
        AbstractC0083a.d(gVar.f1875b, 0L, min);
        if (min != 0) {
            out.f1875b += min;
            r rVar = gVar.f1874a;
            while (true) {
                kotlin.jvm.internal.i.b(rVar);
                long j5 = rVar.f1900c - rVar.f1899b;
                if (j4 < j5) {
                    break;
                }
                j4 -= j5;
                rVar = rVar.f1903f;
            }
            while (min > 0) {
                kotlin.jvm.internal.i.b(rVar);
                r c2 = rVar.c();
                int i2 = c2.f1899b + ((int) j4);
                c2.f1899b = i2;
                c2.f1900c = Math.min(i2 + ((int) min), c2.f1900c);
                r rVar2 = out.f1874a;
                if (rVar2 == null) {
                    c2.f1904g = c2;
                    c2.f1903f = c2;
                    out.f1874a = c2;
                } else {
                    r rVar3 = rVar2.f1904g;
                    kotlin.jvm.internal.i.b(rVar3);
                    rVar3.b(c2);
                }
                min -= c2.f1900c - c2.f1899b;
                rVar = rVar.f1903f;
                j4 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(gVar.f1875b, j2) + " content=" + out.k(out.f1875b).b() + (char) 8230);
    }

    public final boolean p(long j2) {
        g gVar;
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f1897c) {
            throw new IllegalStateException("closed");
        }
        do {
            gVar = this.f1896b;
            if (gVar.f1875b >= j2) {
                return true;
            }
        } while (this.f1895a.e(gVar, 8192L) != -1);
        return false;
    }

    public final void q(long j2) {
        if (!p(j2)) {
            throw new EOFException();
        }
    }

    public final void r(long j2) {
        if (this.f1897c) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            g gVar = this.f1896b;
            if (gVar.f1875b == 0 && this.f1895a.e(gVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, gVar.f1875b);
            gVar.o(min);
            j2 -= min;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        g gVar = this.f1896b;
        if (gVar.f1875b == 0 && this.f1895a.e(gVar, 8192L) == -1) {
            return -1;
        }
        return gVar.read(sink);
    }

    public final String toString() {
        return "buffer(" + this.f1895a + ')';
    }
}
