package W1;

import a.AbstractC0083a;
import i1.AbstractC0251h;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class g implements i, h, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public r f1874a;

    /* renamed from: b, reason: collision with root package name */
    public long f1875b;

    public final boolean a() {
        return this.f1875b == 0;
    }

    public final byte b(long j2) {
        AbstractC0083a.d(this.f1875b, j2, 1L);
        r rVar = this.f1874a;
        if (rVar == null) {
            kotlin.jvm.internal.i.b(null);
            throw null;
        }
        long j3 = this.f1875b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                rVar = rVar.f1904g;
                kotlin.jvm.internal.i.b(rVar);
                j3 -= rVar.f1900c - rVar.f1899b;
            }
            return rVar.f1898a[(int) ((rVar.f1899b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i2 = rVar.f1900c;
            int i3 = rVar.f1899b;
            long j5 = (i2 - i3) + j4;
            if (j5 > j2) {
                return rVar.f1898a[(int) ((i3 + j2) - j4)];
            }
            rVar = rVar.f1903f;
            kotlin.jvm.internal.i.b(rVar);
            j4 = j5;
        }
    }

    public final byte c() {
        if (this.f1875b == 0) {
            throw new EOFException();
        }
        r rVar = this.f1874a;
        kotlin.jvm.internal.i.b(rVar);
        int i2 = rVar.f1899b;
        int i3 = rVar.f1900c;
        int i4 = i2 + 1;
        byte b2 = rVar.f1898a[i2];
        this.f1875b--;
        if (i4 == i3) {
            this.f1874a = rVar.a();
            s.a(rVar);
        } else {
            rVar.f1899b = i4;
        }
        return b2;
    }

    public final Object clone() {
        g gVar = new g();
        if (this.f1875b != 0) {
            r rVar = this.f1874a;
            kotlin.jvm.internal.i.b(rVar);
            r c2 = rVar.c();
            gVar.f1874a = c2;
            c2.f1904g = c2;
            c2.f1903f = c2;
            for (r rVar2 = rVar.f1903f; rVar2 != rVar; rVar2 = rVar2.f1903f) {
                r rVar3 = c2.f1904g;
                kotlin.jvm.internal.i.b(rVar3);
                kotlin.jvm.internal.i.b(rVar2);
                rVar3.b(rVar2.c());
            }
            gVar.f1875b = this.f1875b;
        }
        return gVar;
    }

    @Override // W1.w
    public final y d() {
        return y.f1911d;
    }

    @Override // W1.w
    public final long e(g sink, long j2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = this.f1875b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        sink.h(this, j2);
        return j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                long j2 = this.f1875b;
                g gVar = (g) obj;
                if (j2 == gVar.f1875b) {
                    if (j2 != 0) {
                        r rVar = this.f1874a;
                        kotlin.jvm.internal.i.b(rVar);
                        r rVar2 = gVar.f1874a;
                        kotlin.jvm.internal.i.b(rVar2);
                        int i2 = rVar.f1899b;
                        int i3 = rVar2.f1899b;
                        long j3 = 0;
                        while (j3 < this.f1875b) {
                            long min = Math.min(rVar.f1900c - i2, rVar2.f1900c - i3);
                            long j4 = 0;
                            while (j4 < min) {
                                int i4 = i2 + 1;
                                byte b2 = rVar.f1898a[i2];
                                int i5 = i3 + 1;
                                if (b2 == rVar2.f1898a[i3]) {
                                    j4++;
                                    i3 = i5;
                                    i2 = i4;
                                }
                            }
                            if (i2 == rVar.f1900c) {
                                r rVar3 = rVar.f1903f;
                                kotlin.jvm.internal.i.b(rVar3);
                                i2 = rVar3.f1899b;
                                rVar = rVar3;
                            }
                            if (i3 == rVar2.f1900c) {
                                rVar2 = rVar2.f1903f;
                                kotlin.jvm.internal.i.b(rVar2);
                                i3 = rVar2.f1899b;
                            }
                            j3 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // W1.i
    public final byte[] f() {
        return j(this.f1875b);
    }

    @Override // W1.h
    public final /* bridge */ /* synthetic */ h g(String str) {
        x(str);
        return this;
    }

    @Override // W1.u
    public final void h(g source, long j2) {
        r b2;
        kotlin.jvm.internal.i.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0083a.d(source.f1875b, 0L, j2);
        while (j2 > 0) {
            r rVar = source.f1874a;
            kotlin.jvm.internal.i.b(rVar);
            int i2 = rVar.f1900c;
            r rVar2 = source.f1874a;
            kotlin.jvm.internal.i.b(rVar2);
            long j3 = i2 - rVar2.f1899b;
            int i3 = 0;
            if (j2 < j3) {
                r rVar3 = this.f1874a;
                r rVar4 = rVar3 != null ? rVar3.f1904g : null;
                if (rVar4 != null && rVar4.f1902e) {
                    if ((rVar4.f1900c + j2) - (rVar4.f1901d ? 0 : rVar4.f1899b) <= 8192) {
                        r rVar5 = source.f1874a;
                        kotlin.jvm.internal.i.b(rVar5);
                        rVar5.d(rVar4, (int) j2);
                        source.f1875b -= j2;
                        this.f1875b += j2;
                        return;
                    }
                }
                r rVar6 = source.f1874a;
                kotlin.jvm.internal.i.b(rVar6);
                int i4 = (int) j2;
                if (i4 <= 0 || i4 > rVar6.f1900c - rVar6.f1899b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    b2 = rVar6.c();
                } else {
                    b2 = s.b();
                    int i5 = rVar6.f1899b;
                    AbstractC0251h.M(0, i5, i5 + i4, rVar6.f1898a, b2.f1898a);
                }
                b2.f1900c = b2.f1899b + i4;
                rVar6.f1899b += i4;
                r rVar7 = rVar6.f1904g;
                kotlin.jvm.internal.i.b(rVar7);
                rVar7.b(b2);
                source.f1874a = b2;
            }
            r rVar8 = source.f1874a;
            kotlin.jvm.internal.i.b(rVar8);
            long j4 = rVar8.f1900c - rVar8.f1899b;
            source.f1874a = rVar8.a();
            r rVar9 = this.f1874a;
            if (rVar9 == null) {
                this.f1874a = rVar8;
                rVar8.f1904g = rVar8;
                rVar8.f1903f = rVar8;
            } else {
                r rVar10 = rVar9.f1904g;
                kotlin.jvm.internal.i.b(rVar10);
                rVar10.b(rVar8);
                r rVar11 = rVar8.f1904g;
                if (rVar11 == rVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.i.b(rVar11);
                if (rVar11.f1902e) {
                    int i6 = rVar8.f1900c - rVar8.f1899b;
                    r rVar12 = rVar8.f1904g;
                    kotlin.jvm.internal.i.b(rVar12);
                    int i7 = 8192 - rVar12.f1900c;
                    r rVar13 = rVar8.f1904g;
                    kotlin.jvm.internal.i.b(rVar13);
                    if (!rVar13.f1901d) {
                        r rVar14 = rVar8.f1904g;
                        kotlin.jvm.internal.i.b(rVar14);
                        i3 = rVar14.f1899b;
                    }
                    if (i6 <= i7 + i3) {
                        r rVar15 = rVar8.f1904g;
                        kotlin.jvm.internal.i.b(rVar15);
                        rVar8.d(rVar15, i6);
                        rVar8.a();
                        s.a(rVar8);
                    }
                }
            }
            source.f1875b -= j4;
            this.f1875b += j4;
            j2 -= j4;
        }
    }

    public final int hashCode() {
        r rVar = this.f1874a;
        if (rVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = rVar.f1900c;
            for (int i4 = rVar.f1899b; i4 < i3; i4++) {
                i2 = (i2 * 31) + rVar.f1898a[i4];
            }
            rVar = rVar.f1903f;
            kotlin.jvm.internal.i.b(rVar);
        } while (rVar != this.f1874a);
        return i2;
    }

    @Override // W1.i
    public final InputStream i() {
        return new f(this, 0);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte[] j(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f1875b < j2) {
            throw new EOFException();
        }
        int i2 = (int) j2;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = read(bArr, i3, i2 - i3);
            if (read == -1) {
                throw new EOFException();
            }
            i3 += read;
        }
        return bArr;
    }

    public final j k(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f1875b < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new j(j(j2));
        }
        j p2 = p((int) j2);
        o(j2);
        return p2;
    }

    public final int l() {
        if (this.f1875b < 4) {
            throw new EOFException();
        }
        r rVar = this.f1874a;
        kotlin.jvm.internal.i.b(rVar);
        int i2 = rVar.f1899b;
        int i3 = rVar.f1900c;
        if (i3 - i2 < 4) {
            return ((c() & 255) << 24) | ((c() & 255) << 16) | ((c() & 255) << 8) | (c() & 255);
        }
        byte[] bArr = rVar.f1898a;
        int i4 = i2 + 3;
        int i5 = ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 2] & 255) << 8);
        int i6 = i2 + 4;
        int i7 = i5 | (bArr[i4] & 255);
        this.f1875b -= 4;
        if (i6 == i3) {
            this.f1874a = rVar.a();
            s.a(rVar);
        } else {
            rVar.f1899b = i6;
        }
        return i7;
    }

    public final short m() {
        if (this.f1875b < 2) {
            throw new EOFException();
        }
        r rVar = this.f1874a;
        kotlin.jvm.internal.i.b(rVar);
        int i2 = rVar.f1899b;
        int i3 = rVar.f1900c;
        if (i3 - i2 < 2) {
            return (short) (((c() & 255) << 8) | (c() & 255));
        }
        int i4 = i2 + 1;
        byte[] bArr = rVar.f1898a;
        int i5 = (bArr[i2] & 255) << 8;
        int i6 = i2 + 2;
        int i7 = (bArr[i4] & 255) | i5;
        this.f1875b -= 2;
        if (i6 == i3) {
            this.f1874a = rVar.a();
            s.a(rVar);
        } else {
            rVar.f1899b = i6;
        }
        return (short) i7;
    }

    public final String n(long j2, Charset charset) {
        kotlin.jvm.internal.i.e(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f1875b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        r rVar = this.f1874a;
        kotlin.jvm.internal.i.b(rVar);
        int i2 = rVar.f1899b;
        if (i2 + j2 > rVar.f1900c) {
            return new String(j(j2), charset);
        }
        int i3 = (int) j2;
        String str = new String(rVar.f1898a, i2, i3, charset);
        int i4 = rVar.f1899b + i3;
        rVar.f1899b = i4;
        this.f1875b -= j2;
        if (i4 == rVar.f1900c) {
            this.f1874a = rVar.a();
            s.a(rVar);
        }
        return str;
    }

    public final void o(long j2) {
        while (j2 > 0) {
            r rVar = this.f1874a;
            if (rVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, rVar.f1900c - rVar.f1899b);
            long j3 = min;
            this.f1875b -= j3;
            j2 -= j3;
            int i2 = rVar.f1899b + min;
            rVar.f1899b = i2;
            if (i2 == rVar.f1900c) {
                this.f1874a = rVar.a();
                s.a(rVar);
            }
        }
    }

    public final j p(int i2) {
        if (i2 == 0) {
            return j.f1876d;
        }
        AbstractC0083a.d(this.f1875b, 0L, i2);
        r rVar = this.f1874a;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            kotlin.jvm.internal.i.b(rVar);
            int i6 = rVar.f1900c;
            int i7 = rVar.f1899b;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            rVar = rVar.f1903f;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        r rVar2 = this.f1874a;
        int i8 = 0;
        while (i3 < i2) {
            kotlin.jvm.internal.i.b(rVar2);
            bArr[i8] = rVar2.f1898a;
            i3 += rVar2.f1900c - rVar2.f1899b;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = rVar2.f1899b;
            rVar2.f1901d = true;
            i8++;
            rVar2 = rVar2.f1903f;
        }
        return new t(bArr, iArr);
    }

    public final r q(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        r rVar = this.f1874a;
        if (rVar == null) {
            r b2 = s.b();
            this.f1874a = b2;
            b2.f1904g = b2;
            b2.f1903f = b2;
            return b2;
        }
        r rVar2 = rVar.f1904g;
        kotlin.jvm.internal.i.b(rVar2);
        if (rVar2.f1900c + i2 <= 8192 && rVar2.f1902e) {
            return rVar2;
        }
        r b3 = s.b();
        rVar2.b(b3);
        return b3;
    }

    public final void r(j byteString) {
        kotlin.jvm.internal.i.e(byteString, "byteString");
        byteString.i(this, byteString.a());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        r rVar = this.f1874a;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), rVar.f1900c - rVar.f1899b);
        sink.put(rVar.f1898a, rVar.f1899b, min);
        int i2 = rVar.f1899b + min;
        rVar.f1899b = i2;
        this.f1875b -= min;
        if (i2 == rVar.f1900c) {
            this.f1874a = rVar.a();
            s.a(rVar);
        }
        return min;
    }

    public final void s(byte[] source, int i2, int i3) {
        kotlin.jvm.internal.i.e(source, "source");
        long j2 = i3;
        AbstractC0083a.d(source.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            r q2 = q(1);
            int min = Math.min(i4 - i2, 8192 - q2.f1900c);
            int i5 = i2 + min;
            AbstractC0251h.M(q2.f1900c, i2, i5, source, q2.f1898a);
            q2.f1900c += min;
            i2 = i5;
        }
        this.f1875b += j2;
    }

    public final void t(w source) {
        kotlin.jvm.internal.i.e(source, "source");
        while (source.e(this, 8192L) != -1) {
        }
    }

    public final String toString() {
        long j2 = this.f1875b;
        if (j2 <= 2147483647L) {
            return p((int) j2).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f1875b).toString());
    }

    public final void u(int i2) {
        r q2 = q(1);
        int i3 = q2.f1900c;
        q2.f1900c = i3 + 1;
        q2.f1898a[i3] = (byte) i2;
        this.f1875b++;
    }

    public final void v(long j2) {
        if (j2 == 0) {
            u(48);
            return;
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
        r q2 = q(i2);
        int i3 = q2.f1900c;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            q2.f1898a[i4] = X1.a.f1918a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        q2.f1900c += i2;
        this.f1875b += i2;
    }

    public final void w(int i2) {
        r q2 = q(4);
        int i3 = q2.f1900c;
        byte b2 = (byte) ((i2 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = q2.f1898a;
        bArr[i3] = b2;
        bArr[i3 + 1] = (byte) ((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i3 + 2] = (byte) ((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i3 + 3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        q2.f1900c = i3 + 4;
        this.f1875b += 4;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.i.e(source, "source");
        int remaining = source.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            r q2 = q(1);
            int min = Math.min(i2, 8192 - q2.f1900c);
            source.get(q2.f1898a, q2.f1900c, min);
            i2 -= min;
            q2.f1900c += min;
        }
        this.f1875b += remaining;
        return remaining;
    }

    public final void x(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        y(string, 0, string.length());
    }

    public final void y(String string, int i2, int i3) {
        char charAt;
        kotlin.jvm.internal.i.e(string, "string");
        if (i2 < 0) {
            throw new IllegalArgumentException(C1.a.f(i2, "beginIndex < 0: ").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(C1.a.h("endIndex < beginIndex: ", i3, i2, " < ").toString());
        }
        if (i3 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + string.length()).toString());
        }
        while (i2 < i3) {
            char charAt2 = string.charAt(i2);
            if (charAt2 < 128) {
                r q2 = q(1);
                int i4 = q2.f1900c - i2;
                int min = Math.min(i3, 8192 - i4);
                int i5 = i2 + 1;
                byte[] bArr = q2.f1898a;
                bArr[i2 + i4] = (byte) charAt2;
                while (true) {
                    i2 = i5;
                    if (i2 >= min || (charAt = string.charAt(i2)) >= 128) {
                        break;
                    }
                    i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) charAt;
                }
                int i6 = q2.f1900c;
                int i7 = (i4 + i2) - i6;
                q2.f1900c = i6 + i7;
                this.f1875b += i7;
            } else {
                if (charAt2 < 2048) {
                    r q3 = q(2);
                    int i8 = q3.f1900c;
                    byte[] bArr2 = q3.f1898a;
                    bArr2[i8] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                    q3.f1900c = i8 + 2;
                    this.f1875b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    r q4 = q(3);
                    int i9 = q4.f1900c;
                    byte[] bArr3 = q4.f1898a;
                    bArr3[i9] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((charAt2 & '?') | 128);
                    q4.f1900c = i9 + 3;
                    this.f1875b += 3;
                } else {
                    int i10 = i2 + 1;
                    char charAt3 = i10 < i3 ? string.charAt(i10) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        u(63);
                        i2 = i10;
                    } else {
                        int i11 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        r q5 = q(4);
                        int i12 = q5.f1900c;
                        byte[] bArr4 = q5.f1898a;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        q5.f1900c = i12 + 4;
                        this.f1875b += 4;
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public final void z(int i2) {
        String str;
        int i3 = 0;
        if (i2 < 128) {
            u(i2);
            return;
        }
        if (i2 < 2048) {
            r q2 = q(2);
            int i4 = q2.f1900c;
            byte[] bArr = q2.f1898a;
            bArr[i4] = (byte) ((i2 >> 6) | 192);
            bArr[1 + i4] = (byte) ((i2 & 63) | 128);
            q2.f1900c = i4 + 2;
            this.f1875b += 2;
            return;
        }
        if (55296 <= i2 && i2 < 57344) {
            u(63);
            return;
        }
        if (i2 < 65536) {
            r q3 = q(3);
            int i5 = q3.f1900c;
            byte[] bArr2 = q3.f1898a;
            bArr2[i5] = (byte) ((i2 >> 12) | 224);
            bArr2[1 + i5] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[2 + i5] = (byte) ((i2 & 63) | 128);
            q3.f1900c = i5 + 3;
            this.f1875b += 3;
            return;
        }
        if (i2 <= 1114111) {
            r q4 = q(4);
            int i6 = q4.f1900c;
            byte[] bArr3 = q4.f1898a;
            bArr3[i6] = (byte) ((i2 >> 18) | 240);
            bArr3[1 + i6] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[2 + i6] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[3 + i6] = (byte) ((i2 & 63) | 128);
            q4.f1900c = i6 + 4;
            this.f1875b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i2 != 0) {
            char[] cArr = X1.b.f1919a;
            char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
            while (i3 < 8 && cArr2[i3] == '0') {
                i3++;
            }
            if (i3 < 0) {
                throw new IndexOutOfBoundsException(C1.a.g(i3, "startIndex: ", ", endIndex: 8, size: 8"));
            }
            if (i3 > 8) {
                throw new IllegalArgumentException(C1.a.g(i3, "startIndex: ", " > endIndex: 8"));
            }
            str = new String(cArr2, i3, 8 - i3);
        } else {
            str = CommonUrlParts.Values.FALSE_INTEGER;
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final int read(byte[] sink, int i2, int i3) {
        kotlin.jvm.internal.i.e(sink, "sink");
        AbstractC0083a.d(sink.length, i2, i3);
        r rVar = this.f1874a;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(i3, rVar.f1900c - rVar.f1899b);
        int i4 = rVar.f1899b;
        AbstractC0251h.M(i2, i4, i4 + min, rVar.f1898a, sink);
        int i5 = rVar.f1899b + min;
        rVar.f1899b = i5;
        this.f1875b -= min;
        if (i5 == rVar.f1900c) {
            this.f1874a = rVar.a();
            s.a(rVar);
        }
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, W1.u
    public final void close() {
    }

    @Override // W1.u, java.io.Flushable
    public final void flush() {
    }
}
