package com.anythink.core.common.n.c;

import com.google.android.gms.internal.ads.Wv;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class c implements d, e, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    static final int f16631a = 65533;

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f16632d = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b, reason: collision with root package name */
    s f16633b;

    /* renamed from: c, reason: collision with root package name */
    long f16634c;

    private c B() {
        return this;
    }

    private List<Integer> C() {
        if (this.f16633b == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        s sVar = this.f16633b;
        arrayList.add(Integer.valueOf(sVar.f16703e - sVar.f16702d));
        s sVar2 = this.f16633b;
        while (true) {
            sVar2 = sVar2.f16706h;
            if (sVar2 == this.f16633b) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(sVar2.f16703e - sVar2.f16702d));
        }
    }

    private f D() {
        return c("MD5");
    }

    private f E() {
        return c("SHA-1");
    }

    private f F() {
        return c("SHA-256");
    }

    private f G() {
        return c("SHA-512");
    }

    private c H() {
        c cVar = new c();
        if (this.f16634c == 0) {
            return cVar;
        }
        s a9 = this.f16633b.a();
        cVar.f16633b = a9;
        a9.i = a9;
        a9.f16706h = a9;
        s sVar = this.f16633b;
        while (true) {
            sVar = sVar.f16706h;
            if (sVar == this.f16633b) {
                cVar.f16634c = this.f16634c;
                return cVar;
            }
            cVar.f16633b.i.a(sVar.a());
        }
    }

    private f I() {
        long j6 = this.f16634c;
        if (j6 <= 2147483647L) {
            int i = (int) j6;
            return i == 0 ? f.f16645b : new u(this, i);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f16634c);
    }

    private a J() {
        a aVar = new a();
        if (aVar.f16637a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVar.f16637a = this;
        aVar.f16638b = false;
        return aVar;
    }

    private a K() {
        return a(new a());
    }

    @Override // com.anythink.core.common.n.c.d
    public final /* bridge */ /* synthetic */ d A() {
        return this;
    }

    @Override // com.anythink.core.common.n.c.e
    public final void a(long j6) {
        if (this.f16634c < j6) {
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
        long j9 = this.f16634c;
        if (j9 == 0) {
            return -1L;
        }
        if (j6 > j9) {
            j6 = j9;
        }
        cVar.a(this, j6);
        return j6;
    }

    @Override // com.anythink.core.common.n.c.d, com.anythink.core.common.n.c.e
    public final c c() {
        return this;
    }

    public final /* synthetic */ Object clone() {
        c cVar = new c();
        if (this.f16634c == 0) {
            return cVar;
        }
        s a9 = this.f16633b.a();
        cVar.f16633b = a9;
        a9.i = a9;
        a9.f16706h = a9;
        s sVar = this.f16633b;
        while (true) {
            sVar = sVar.f16706h;
            if (sVar == this.f16633b) {
                cVar.f16634c = this.f16634c;
                return cVar;
            }
            cVar.f16633b.i.a(sVar.a());
        }
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.anythink.core.common.n.c.e
    public final c d() {
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    public final OutputStream e() {
        return new OutputStream() { // from class: com.anythink.core.common.n.c.c.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
            }

            public final String toString() {
                return c.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public final void write(int i) {
                c.this.l((int) ((byte) i));
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i4) {
                c.this.c(bArr, i, i4);
            }
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j6 = this.f16634c;
        if (j6 != cVar.f16634c) {
            return false;
        }
        long j9 = 0;
        if (j6 == 0) {
            return true;
        }
        s sVar = this.f16633b;
        s sVar2 = cVar.f16633b;
        int i = sVar.f16702d;
        int i4 = sVar2.f16702d;
        while (j9 < this.f16634c) {
            long min = Math.min(sVar.f16703e - i, sVar2.f16703e - i4);
            int i6 = 0;
            while (i6 < min) {
                int i9 = i + 1;
                int i10 = i4 + 1;
                if (sVar.f16701c[i] != sVar2.f16701c[i4]) {
                    return false;
                }
                i6++;
                i = i9;
                i4 = i10;
            }
            if (i == sVar.f16703e) {
                sVar = sVar.f16706h;
                i = sVar.f16702d;
            }
            if (i4 == sVar2.f16703e) {
                sVar2 = sVar2.f16706h;
                i4 = sVar2.f16702d;
            }
            j9 += min;
        }
        return true;
    }

    @Override // com.anythink.core.common.n.c.d
    public final d f() {
        return this;
    }

    @Override // com.anythink.core.common.n.c.d, com.anythink.core.common.n.c.v, java.io.Flushable
    public final void flush() {
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean g() {
        return this.f16634c == 0;
    }

    public final int hashCode() {
        s sVar = this.f16633b;
        if (sVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i4 = sVar.f16703e;
            for (int i6 = sVar.f16702d; i6 < i4; i6++) {
                i = (i * 31) + sVar.f16701c[i6];
            }
            sVar = sVar.f16706h;
        } while (sVar != this.f16633b);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6 A[EDGE_INSN: B:46:0x00a6->B:40:0x00a6 BREAK  A[LOOP:0: B:4:0x000f->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    @Override // com.anythink.core.common.n.c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long r() {
        if (this.f16634c == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i = 0;
        boolean z6 = false;
        long j6 = -7;
        long j9 = 0;
        boolean z9 = false;
        do {
            s sVar = this.f16633b;
            byte[] bArr = sVar.f16701c;
            int i4 = sVar.f16702d;
            int i6 = sVar.f16703e;
            while (i4 < i6) {
                byte b9 = bArr[i4];
                if (b9 >= 48 && b9 <= 57) {
                    int i9 = 48 - b9;
                    if (j9 < -922337203685477580L || (j9 == -922337203685477580L && i9 < j6)) {
                        c l9 = new c().o(j9).l((int) b9);
                        if (!z6) {
                            l9.k();
                        }
                        throw new NumberFormatException("Number too large: " + l9.u());
                    }
                    j9 = (j9 * 10) + i9;
                } else if (b9 == 45 && i == 0) {
                    j6--;
                    z6 = true;
                } else {
                    if (i == 0) {
                        throw new NumberFormatException("Expected leading [0-9] or '-' character but was 0x" + Integer.toHexString(b9));
                    }
                    z9 = true;
                    if (i4 != i6) {
                        this.f16633b = sVar.c();
                        t.a(sVar);
                    } else {
                        sVar.f16702d = i4;
                    }
                    if (!z9) {
                        break;
                    }
                }
                i4++;
                i++;
            }
            if (i4 != i6) {
            }
            if (!z9) {
            }
        } while (this.f16633b != null);
        this.f16634c -= i;
        return z6 ? j9 : -j9;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        s sVar = this.f16633b;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), sVar.f16703e - sVar.f16702d);
        byteBuffer.put(sVar.f16701c, sVar.f16702d, min);
        int i = sVar.f16702d + min;
        sVar.f16702d = i;
        this.f16634c -= min;
        if (i == sVar.f16703e) {
            this.f16633b = sVar.c();
            t.a(sVar);
        }
        return min;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c A[EDGE_INSN: B:40:0x009c->B:37:0x009c BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    @Override // com.anythink.core.common.n.c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long s() {
        int i;
        if (this.f16634c == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i4 = 0;
        boolean z6 = false;
        long j6 = 0;
        do {
            s sVar = this.f16633b;
            byte[] bArr = sVar.f16701c;
            int i6 = sVar.f16702d;
            int i9 = sVar.f16703e;
            while (i6 < i9) {
                byte b9 = bArr[i6];
                if (b9 >= 48 && b9 <= 57) {
                    i = b9 - 48;
                } else if (b9 >= 97 && b9 <= 102) {
                    i = b9 - 87;
                } else if (b9 >= 65 && b9 <= 70) {
                    i = b9 - 55;
                } else {
                    if (i4 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b9));
                    }
                    z6 = true;
                    if (i6 != i9) {
                        this.f16633b = sVar.c();
                        t.a(sVar);
                    } else {
                        sVar.f16702d = i6;
                    }
                    if (!z6) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j6) != 0) {
                    throw new NumberFormatException("Number too large: " + new c().n(j6).l((int) b9).u());
                }
                j6 = (j6 << 4) | i;
                i6++;
                i4++;
            }
            if (i6 != i9) {
            }
            if (!z6) {
            }
        } while (this.f16633b != null);
        this.f16634c -= i4;
        return j6;
    }

    @Override // com.anythink.core.common.n.c.e
    public final f t() {
        return new f(y());
    }

    public final String toString() {
        long j6 = this.f16634c;
        if (j6 <= 2147483647L) {
            int i = (int) j6;
            return (i == 0 ? f.f16645b : new u(this, i)).toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f16634c);
    }

    @Override // com.anythink.core.common.n.c.e
    public final String u() {
        try {
            return a(this.f16634c, y.f16716a);
        } catch (EOFException e9) {
            throw new AssertionError(e9);
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final String v() {
        long a9 = a((byte) 10);
        if (a9 != -1) {
            return g(a9);
        }
        long j6 = this.f16634c;
        if (j6 != 0) {
            return e(j6);
        }
        return null;
    }

    @Override // com.anythink.core.common.n.c.e
    public final String w() {
        return f(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            s g9 = g(1);
            int min = Math.min(i, 8192 - g9.f16703e);
            byteBuffer.get(g9.f16701c, g9.f16703e, min);
            i -= min;
            g9.f16703e += min;
        }
        this.f16634c += remaining;
        return remaining;
    }

    @Override // com.anythink.core.common.n.c.e
    public final int x() {
        int i;
        int i4;
        int i6;
        if (this.f16634c == 0) {
            throw new EOFException();
        }
        byte c9 = c(0L);
        if ((c9 & com.anythink.core.common.s.a.c.f17103a) == 0) {
            i = c9 & Byte.MAX_VALUE;
            i6 = 0;
            i4 = 1;
        } else if ((c9 & 224) == 192) {
            i = c9 & 31;
            i4 = 2;
            i6 = 128;
        } else if ((c9 & 240) == 224) {
            i = c9 & 15;
            i4 = 3;
            i6 = 2048;
        } else {
            if ((c9 & 248) != 240) {
                i(1L);
                return f16631a;
            }
            i = c9 & 7;
            i4 = 4;
            i6 = com.anythink.basead.exoplayer.b.aX;
        }
        long j6 = i4;
        if (this.f16634c < j6) {
            StringBuilder k9 = Wv.k(i4, "size < ", ": ");
            k9.append(this.f16634c);
            k9.append(" (to read code point prefixed 0x");
            k9.append(Integer.toHexString(c9));
            k9.append(")");
            throw new EOFException(k9.toString());
        }
        for (int i9 = 1; i9 < i4; i9++) {
            long j9 = i9;
            byte c10 = c(j9);
            if ((c10 & 192) != 128) {
                i(j9);
                return f16631a;
            }
            i = (i << 6) | (c10 & com.anythink.core.common.s.a.c.f17105c);
        }
        i(j6);
        return i > 1114111 ? f16631a : ((i < 55296 || i > 57343) && i >= i6) ? i : f16631a;
    }

    @Override // com.anythink.core.common.n.c.e
    public final byte[] y() {
        try {
            return h(this.f16634c);
        } catch (EOFException e9) {
            throw new AssertionError(e9);
        }
    }

    public final void z() {
        try {
            i(this.f16634c);
        } catch (EOFException e9) {
            throw new AssertionError(e9);
        }
    }

    private c a(OutputStream outputStream) {
        long j6 = this.f16634c;
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        y.a(j6, 0L, j6);
        if (j6 != 0) {
            s sVar = this.f16633b;
            long j9 = 0;
            while (true) {
                int i = sVar.f16703e;
                int i4 = sVar.f16702d;
                if (j9 < i - i4) {
                    break;
                }
                j9 -= i - i4;
                sVar = sVar.f16706h;
            }
            while (j6 > 0) {
                int min = (int) Math.min(sVar.f16703e - r5, j6);
                outputStream.write(sVar.f16701c, (int) (sVar.f16702d + j9), min);
                j6 -= min;
                sVar = sVar.f16706h;
                j9 = 0;
            }
        }
        return this;
    }

    @Override // com.anythink.core.common.n.c.e
    public final String e(long j6) {
        return a(j6, y.f16716a);
    }

    @Override // com.anythink.core.common.n.c.e
    public final String f(long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j6)));
        }
        long j9 = j6 != Long.MAX_VALUE ? j6 + 1 : Long.MAX_VALUE;
        long a9 = a((byte) 10, 0L, j9);
        if (a9 != -1) {
            return g(a9);
        }
        if (j9 < this.f16634c && c(j9 - 1) == 13 && c(j9) == 10) {
            return g(j9);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, this.f16634c));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f16634c, j6) + " content=" + cVar.t().g() + (char) 8230);
    }

    public final String g(long j6) {
        if (j6 > 0) {
            long j9 = j6 - 1;
            if (c(j9) == 13) {
                String e9 = e(j9);
                i(2L);
                return e9;
            }
        }
        String e10 = e(j6);
        i(1L);
        return e10;
    }

    @Override // com.anythink.core.common.n.c.e
    public final e h() {
        return n.a(new p(this));
    }

    @Override // com.anythink.core.common.n.c.e
    public final InputStream i() {
        return new InputStream() { // from class: com.anythink.core.common.n.c.c.2
            @Override // java.io.InputStream
            public final int available() {
                return (int) Math.min(c.this.f16634c, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.InputStream
            public final int read() {
                c cVar = c.this;
                if (cVar.f16634c > 0) {
                    return cVar.k() & 255;
                }
                return -1;
            }

            public final String toString() {
                return c.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i4) {
                return c.this.a(bArr, i, i4);
            }
        };
    }

    public final long j() {
        long j6 = this.f16634c;
        if (j6 == 0) {
            return 0L;
        }
        s sVar = this.f16633b.i;
        return (sVar.f16703e >= 8192 || !sVar.f16705g) ? j6 : j6 - (r3 - sVar.f16702d);
    }

    @Override // com.anythink.core.common.n.c.e
    public final byte k() {
        long j6 = this.f16634c;
        if (j6 == 0) {
            throw new IllegalStateException("size == 0");
        }
        s sVar = this.f16633b;
        int i = sVar.f16702d;
        int i4 = sVar.f16703e;
        int i6 = i + 1;
        byte b9 = sVar.f16701c[i];
        this.f16634c = j6 - 1;
        if (i6 != i4) {
            sVar.f16702d = i6;
            return b9;
        }
        this.f16633b = sVar.c();
        t.a(sVar);
        return b9;
    }

    @Override // com.anythink.core.common.n.c.e
    public final short l() {
        long j6 = this.f16634c;
        if (j6 < 2) {
            throw new IllegalStateException("size < 2: " + this.f16634c);
        }
        s sVar = this.f16633b;
        int i = sVar.f16702d;
        int i4 = sVar.f16703e;
        if (i4 - i < 2) {
            return (short) (((k() & 255) << 8) | (k() & 255));
        }
        byte[] bArr = sVar.f16701c;
        int i6 = i + 1;
        int i9 = (bArr[i] & 255) << 8;
        int i10 = i + 2;
        int i11 = (bArr[i6] & 255) | i9;
        this.f16634c = j6 - 2;
        if (i10 == i4) {
            this.f16633b = sVar.c();
            t.a(sVar);
        } else {
            sVar.f16702d = i10;
        }
        return (short) i11;
    }

    @Override // com.anythink.core.common.n.c.e
    public final int m() {
        long j6 = this.f16634c;
        if (j6 < 4) {
            throw new IllegalStateException("size < 4: " + this.f16634c);
        }
        s sVar = this.f16633b;
        int i = sVar.f16702d;
        int i4 = sVar.f16703e;
        if (i4 - i < 4) {
            return ((k() & 255) << 24) | ((k() & 255) << 16) | ((k() & 255) << 8) | (k() & 255);
        }
        byte[] bArr = sVar.f16701c;
        int i6 = i + 3;
        int i9 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i10 = i + 4;
        int i11 = (bArr[i6] & 255) | i9;
        this.f16634c = j6 - 4;
        if (i10 != i4) {
            sVar.f16702d = i10;
            return i11;
        }
        this.f16633b = sVar.c();
        t.a(sVar);
        return i11;
    }

    @Override // com.anythink.core.common.n.c.e
    public final long n() {
        long j6 = this.f16634c;
        if (j6 < 8) {
            throw new IllegalStateException("size < 8: " + this.f16634c);
        }
        s sVar = this.f16633b;
        int i = sVar.f16702d;
        int i4 = sVar.f16703e;
        if (i4 - i < 8) {
            return ((m() & 4294967295L) << 32) | (4294967295L & m());
        }
        byte[] bArr = sVar.f16701c;
        int i6 = i + 7;
        long j9 = ((bArr[i + 1] & 255) << 48) | ((bArr[i] & 255) << 56) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i9 = i + 8;
        long j10 = j9 | (bArr[i6] & 255);
        this.f16634c = j6 - 8;
        if (i9 != i4) {
            sVar.f16702d = i9;
            return j10;
        }
        this.f16633b = sVar.c();
        t.a(sVar);
        return j10;
    }

    @Override // com.anythink.core.common.n.c.e
    public final short o() {
        return y.a(l());
    }

    @Override // com.anythink.core.common.n.c.e
    public final int p() {
        return y.a(m());
    }

    @Override // com.anythink.core.common.n.c.e
    public final long q() {
        return y.a(n());
    }

    public final byte c(long j6) {
        int i;
        long j9 = j6;
        y.a(this.f16634c, j9, 1L);
        long j10 = this.f16634c;
        if (j10 - j9 > j9) {
            s sVar = this.f16633b;
            while (true) {
                int i4 = sVar.f16703e;
                int i6 = sVar.f16702d;
                long j11 = i4 - i6;
                if (j9 < j11) {
                    return sVar.f16701c[i6 + ((int) j9)];
                }
                j9 -= j11;
                sVar = sVar.f16706h;
            }
        } else {
            long j12 = j9 - j10;
            s sVar2 = this.f16633b;
            do {
                sVar2 = sVar2.i;
                int i9 = sVar2.f16703e;
                i = sVar2.f16702d;
                j12 += i9 - i;
            } while (j12 < 0);
            return sVar2.f16701c[i + ((int) j12)];
        }
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final c i(int i) {
        s g9 = g(4);
        byte[] bArr = g9.f16701c;
        int i4 = g9.f16703e;
        bArr[i4] = (byte) ((i >>> 24) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr[i4 + 1] = (byte) ((i >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr[i4 + 2] = (byte) ((i >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr[i4 + 3] = (byte) (i & com.anythink.basead.exoplayer.k.p.f9259b);
        g9.f16703e = i4 + 4;
        this.f16634c += 4;
        return this;
    }

    @Override // com.anythink.core.common.n.c.e
    public final byte[] h(long j6) {
        y.a(this.f16634c, 0L, j6);
        if (j6 <= 2147483647L) {
            byte[] bArr = new byte[(int) j6];
            b(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j6)));
    }

    @Override // com.anythink.core.common.n.c.e
    public final void i(long j6) {
        while (j6 > 0) {
            if (this.f16633b != null) {
                int min = (int) Math.min(j6, r0.f16703e - r0.f16702d);
                long j9 = min;
                this.f16634c -= j9;
                j6 -= j9;
                s sVar = this.f16633b;
                int i = sVar.f16702d + min;
                sVar.f16702d = i;
                if (i == sVar.f16703e) {
                    this.f16633b = sVar.c();
                    t.a(sVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public c f16637a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f16638b;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f16640d;

        /* renamed from: g, reason: collision with root package name */
        private s f16643g;

        /* renamed from: c, reason: collision with root package name */
        public long f16639c = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f16641e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f16642f = -1;

        private long b(long j6) {
            c cVar = this.f16637a;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f16638b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j9 = cVar.f16634c;
            if (j6 <= j9) {
                if (j6 < 0) {
                    throw new IllegalArgumentException("newSize < 0: ".concat(String.valueOf(j6)));
                }
                long j10 = j9 - j6;
                while (true) {
                    if (j10 <= 0) {
                        break;
                    }
                    c cVar2 = this.f16637a;
                    s sVar = cVar2.f16633b.i;
                    int i = sVar.f16703e;
                    long j11 = i - sVar.f16702d;
                    if (j11 > j10) {
                        sVar.f16703e = (int) (i - j10);
                        break;
                    }
                    cVar2.f16633b = sVar.c();
                    t.a(sVar);
                    j10 -= j11;
                }
                this.f16643g = null;
                this.f16639c = j6;
                this.f16640d = null;
                this.f16641e = -1;
                this.f16642f = -1;
            } else if (j6 > j9) {
                long j12 = j6 - j9;
                boolean z6 = true;
                while (j12 > 0) {
                    s g9 = this.f16637a.g(1);
                    int min = (int) Math.min(j12, 8192 - g9.f16703e);
                    int i4 = g9.f16703e + min;
                    g9.f16703e = i4;
                    j12 -= min;
                    if (z6) {
                        this.f16643g = g9;
                        this.f16639c = j9;
                        this.f16640d = g9.f16701c;
                        this.f16641e = i4 - min;
                        this.f16642f = i4;
                        z6 = false;
                    }
                }
            }
            this.f16637a.f16634c = j6;
            return j9;
        }

        public final int a() {
            long j6 = this.f16639c;
            if (j6 != this.f16637a.f16634c) {
                return j6 == -1 ? a(0L) : a(j6 + (this.f16642f - this.f16641e));
            }
            throw new IllegalStateException();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f16637a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f16637a = null;
            this.f16643g = null;
            this.f16639c = -1L;
            this.f16640d = null;
            this.f16641e = -1;
            this.f16642f = -1;
        }

        public final int a(long j6) {
            if (j6 >= -1) {
                c cVar = this.f16637a;
                long j9 = cVar.f16634c;
                if (j6 <= j9) {
                    if (j6 != -1 && j6 != j9) {
                        s sVar = cVar.f16633b;
                        s sVar2 = this.f16643g;
                        long j10 = 0;
                        if (sVar2 != null) {
                            long j11 = this.f16639c - (this.f16641e - sVar2.f16702d);
                            if (j11 > j6) {
                                sVar2 = sVar;
                                sVar = sVar2;
                                j9 = j11;
                            } else {
                                j10 = j11;
                            }
                        } else {
                            sVar2 = sVar;
                        }
                        if (j9 - j6 > j6 - j10) {
                            while (true) {
                                int i = sVar2.f16703e;
                                int i4 = sVar2.f16702d;
                                if (j6 < (i - i4) + j10) {
                                    break;
                                }
                                j10 += i - i4;
                                sVar2 = sVar2.f16706h;
                            }
                        } else {
                            while (j9 > j6) {
                                sVar = sVar.i;
                                j9 -= sVar.f16703e - sVar.f16702d;
                            }
                            sVar2 = sVar;
                            j10 = j9;
                        }
                        if (this.f16638b && sVar2.f16704f) {
                            s b9 = sVar2.b();
                            c cVar2 = this.f16637a;
                            if (cVar2.f16633b == sVar2) {
                                cVar2.f16633b = b9;
                            }
                            sVar2 = sVar2.a(b9);
                            sVar2.i.c();
                        }
                        this.f16643g = sVar2;
                        this.f16639c = j6;
                        this.f16640d = sVar2.f16701c;
                        int i6 = sVar2.f16702d + ((int) (j6 - j10));
                        this.f16641e = i6;
                        int i9 = sVar2.f16703e;
                        this.f16642f = i9;
                        return i9 - i6;
                    }
                    this.f16643g = null;
                    this.f16639c = j6;
                    this.f16640d = null;
                    this.f16641e = -1;
                    this.f16642f = -1;
                    return -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException("offset=" + j6 + " > size=" + this.f16637a.f16634c);
        }

        private long a(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("minByteCount <= 0: ".concat(String.valueOf(i)));
            }
            if (i <= 8192) {
                c cVar = this.f16637a;
                if (cVar != null) {
                    if (this.f16638b) {
                        long j6 = cVar.f16634c;
                        s g9 = cVar.g(i);
                        int i4 = 8192 - g9.f16703e;
                        g9.f16703e = 8192;
                        long j9 = i4;
                        this.f16637a.f16634c = j6 + j9;
                        this.f16643g = g9;
                        this.f16639c = j6;
                        this.f16640d = g9.f16701c;
                        this.f16641e = 8192 - i4;
                        this.f16642f = 8192;
                        return j9;
                    }
                    throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
                }
                throw new IllegalStateException("not attached to a buffer");
            }
            throw new IllegalArgumentException("minByteCount > Segment.SIZE: ".concat(String.valueOf(i)));
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final f d(long j6) {
        return new f(h(j6));
    }

    public final long b() {
        return this.f16634c;
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final c j(int i) {
        return k((int) y.a((short) i));
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean b(long j6) {
        return this.f16634c >= j6;
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final c q(long j6) {
        s g9 = g(8);
        byte[] bArr = g9.f16701c;
        int i = g9.f16703e;
        bArr[i] = (byte) ((j6 >>> 56) & 255);
        bArr[i + 1] = (byte) ((j6 >>> 48) & 255);
        bArr[i + 2] = (byte) ((j6 >>> 40) & 255);
        bArr[i + 3] = (byte) ((j6 >>> 32) & 255);
        bArr[i + 4] = (byte) ((j6 >>> 24) & 255);
        bArr[i + 5] = (byte) ((j6 >>> 16) & 255);
        bArr[i + 6] = (byte) ((j6 >>> 8) & 255);
        bArr[i + 7] = (byte) (j6 & 255);
        g9.f16703e = i + 8;
        this.f16634c += 8;
        return this;
    }

    private c b(OutputStream outputStream) {
        long j6 = this.f16634c;
        if (outputStream != null) {
            y.a(j6, 0L, j6);
            s sVar = this.f16633b;
            while (j6 > 0) {
                int min = (int) Math.min(j6, sVar.f16703e - sVar.f16702d);
                outputStream.write(sVar.f16701c, sVar.f16702d, min);
                int i = sVar.f16702d + min;
                sVar.f16702d = i;
                long j9 = min;
                this.f16634c -= j9;
                j6 -= j9;
                if (i == sVar.f16703e) {
                    s c9 = sVar.c();
                    this.f16633b = c9;
                    t.a(sVar);
                    sVar = c9;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final s g(int i) {
        if (i > 0 && i <= 8192) {
            s sVar = this.f16633b;
            if (sVar == null) {
                s a9 = t.a();
                this.f16633b = a9;
                a9.i = a9;
                a9.f16706h = a9;
                return a9;
            }
            s sVar2 = sVar.i;
            return (sVar2.f16703e + i > 8192 || !sVar2.f16705g) ? sVar2.a(t.a()) : sVar2;
        }
        throw new IllegalArgumentException();
    }

    private c a(OutputStream outputStream, long j6, long j9) {
        if (outputStream != null) {
            long j10 = j9;
            y.a(this.f16634c, 0L, j10);
            if (j10 != 0) {
                s sVar = this.f16633b;
                while (true) {
                    int i = sVar.f16703e;
                    int i4 = sVar.f16702d;
                    if (j6 < i - i4) {
                        break;
                    }
                    j6 -= i - i4;
                    sVar = sVar.f16706h;
                }
                while (j10 > 0) {
                    int min = (int) Math.min(sVar.f16703e - r10, j10);
                    outputStream.write(sVar.f16701c, (int) (sVar.f16702d + j6), min);
                    j10 -= min;
                    sVar = sVar.f16706h;
                    j6 = 0;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    private f e(f fVar) {
        return a("HmacSHA1", fVar);
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final c d(byte[] bArr) {
        if (bArr != null) {
            return c(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final c p(long j6) {
        return q(y.a(j6));
    }

    private f g(f fVar) {
        return a("HmacSHA512", fVar);
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final c k(int i) {
        s g9 = g(2);
        byte[] bArr = g9.f16701c;
        int i4 = g9.f16703e;
        bArr[i4] = (byte) ((i >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr[i4 + 1] = (byte) (i & com.anythink.basead.exoplayer.k.p.f9259b);
        g9.f16703e = i4 + 2;
        this.f16634c += 2;
        return this;
    }

    private f n(int i) {
        if (i == 0) {
            return f.f16645b;
        }
        return new u(this, i);
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final c h(int i) {
        return i(y.a(i));
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final c o(long j6) {
        boolean z6;
        if (j6 == 0) {
            return l(48);
        }
        int i = 1;
        if (j6 < 0) {
            j6 = -j6;
            if (j6 < 0) {
                return b("-9223372036854775808");
            }
            z6 = true;
        } else {
            z6 = false;
        }
        if (j6 >= 100000000) {
            i = j6 < 1000000000000L ? j6 < 10000000000L ? j6 < com.anythink.basead.exoplayer.b.f7174h ? 9 : 10 : j6 < 100000000000L ? 11 : 12 : j6 < 1000000000000000L ? j6 < 10000000000000L ? 13 : j6 < 100000000000000L ? 14 : 15 : j6 < 100000000000000000L ? j6 < 10000000000000000L ? 16 : 17 : j6 < 1000000000000000000L ? 18 : 19;
        } else if (j6 >= 10000) {
            i = j6 < 1000000 ? j6 < 100000 ? 5 : 6 : j6 < 10000000 ? 7 : 8;
        } else if (j6 >= 100) {
            i = j6 < 1000 ? 3 : 4;
        } else if (j6 >= 10) {
            i = 2;
        }
        if (z6) {
            i++;
        }
        s g9 = g(i);
        byte[] bArr = g9.f16701c;
        int i4 = g9.f16703e + i;
        while (j6 != 0) {
            i4--;
            bArr[i4] = f16632d[(int) (j6 % 10)];
            j6 /= 10;
        }
        if (z6) {
            bArr[i4 - 1] = 45;
        }
        g9.f16703e += i;
        this.f16634c += i;
        return this;
    }

    private f f(f fVar) {
        return a("HmacSHA256", fVar);
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final c n(long j6) {
        if (j6 == 0) {
            return l(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j6)) / 4) + 1;
        s g9 = g(numberOfTrailingZeros);
        byte[] bArr = g9.f16701c;
        int i = g9.f16703e;
        for (int i4 = (i + numberOfTrailingZeros) - 1; i4 >= i; i4--) {
            bArr[i4] = f16632d[(int) (15 & j6)];
            j6 >>>= 4;
        }
        g9.f16703e += numberOfTrailingZeros;
        this.f16634c += numberOfTrailingZeros;
        return this;
    }

    @Override // com.anythink.core.common.n.c.e
    public final void b(c cVar, long j6) {
        long j9 = this.f16634c;
        if (j9 >= j6) {
            cVar.a(this, j6);
        } else {
            cVar.a(this, j9);
            throw new EOFException();
        }
    }

    public final c a(c cVar, long j6, long j9) {
        if (cVar != null) {
            long j10 = j6;
            y.a(this.f16634c, j10, j9);
            if (j9 != 0) {
                cVar.f16634c += j9;
                s sVar = this.f16633b;
                while (true) {
                    int i = sVar.f16703e;
                    int i4 = sVar.f16702d;
                    if (j10 < i - i4) {
                        break;
                    }
                    j10 -= i - i4;
                    sVar = sVar.f16706h;
                }
                s sVar2 = sVar;
                long j11 = j9;
                while (j11 > 0) {
                    s a9 = sVar2.a();
                    int i6 = (int) (a9.f16702d + j10);
                    a9.f16702d = i6;
                    a9.f16703e = Math.min(i6 + ((int) j11), a9.f16703e);
                    s sVar3 = cVar.f16633b;
                    if (sVar3 == null) {
                        a9.i = a9;
                        a9.f16706h = a9;
                        cVar.f16633b = a9;
                    } else {
                        sVar3.i.a(a9);
                    }
                    j11 -= a9.f16703e - a9.f16702d;
                    sVar2 = sVar2.f16706h;
                    j10 = 0;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.anythink.core.common.n.c.e
    public final long c(f fVar) {
        return b(fVar, 0L);
    }

    private f c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            s sVar = this.f16633b;
            if (sVar != null) {
                byte[] bArr = sVar.f16701c;
                int i = sVar.f16702d;
                messageDigest.update(bArr, i, sVar.f16703e - i);
                s sVar2 = this.f16633b;
                while (true) {
                    sVar2 = sVar2.f16706h;
                    if (sVar2 == this.f16633b) {
                        break;
                    }
                    byte[] bArr2 = sVar2.f16701c;
                    int i4 = sVar2.f16702d;
                    messageDigest.update(bArr2, i4, sVar2.f16703e - i4);
                }
            }
            return f.a(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final void b(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a9 = a(bArr, i, bArr.length - i);
            if (a9 == -1) {
                throw new EOFException();
            }
            i += a9;
        }
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c c(byte[] bArr, int i, int i4) {
        if (bArr != null) {
            long j6 = i4;
            y.a(bArr.length, i, j6);
            int i6 = i4 + i;
            while (i < i6) {
                s g9 = g(1);
                int min = Math.min(i6 - i, 8192 - g9.f16703e);
                System.arraycopy(bArr, i, g9.f16701c, g9.f16703e, min);
                i += min;
                g9.f16703e += min;
            }
            this.f16634c += j6;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    private c a(OutputStream outputStream, long j6) {
        if (outputStream != null) {
            y.a(this.f16634c, 0L, j6);
            s sVar = this.f16633b;
            long j9 = j6;
            while (j9 > 0) {
                int min = (int) Math.min(j9, sVar.f16703e - sVar.f16702d);
                outputStream.write(sVar.f16701c, sVar.f16702d, min);
                int i = sVar.f16702d + min;
                sVar.f16702d = i;
                long j10 = min;
                this.f16634c -= j10;
                j9 -= j10;
                if (i == sVar.f16703e) {
                    s c9 = sVar.c();
                    this.f16633b = c9;
                    t.a(sVar);
                    sVar = c9;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c l(int i) {
        s g9 = g(1);
        byte[] bArr = g9.f16701c;
        int i4 = g9.f16703e;
        g9.f16703e = i4 + 1;
        bArr[i4] = (byte) i;
        this.f16634c++;
        return this;
    }

    @Override // com.anythink.core.common.n.c.e
    public final long b(f fVar) {
        return a(fVar, 0L);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long b(f fVar, long j6) {
        int i;
        int i4;
        long j9 = 0;
        if (j6 >= 0) {
            s sVar = this.f16633b;
            if (sVar == null) {
                return -1L;
            }
            long j10 = this.f16634c;
            if (j10 - j6 < j6) {
                while (j10 > j6) {
                    sVar = sVar.i;
                    j10 -= sVar.f16703e - sVar.f16702d;
                }
            } else {
                while (true) {
                    long j11 = (sVar.f16703e - sVar.f16702d) + j9;
                    if (j11 >= j6) {
                        break;
                    }
                    sVar = sVar.f16706h;
                    j9 = j11;
                }
                j10 = j9;
            }
            if (fVar.j() == 2) {
                byte b9 = fVar.b(0);
                byte b10 = fVar.b(1);
                while (j10 < this.f16634c) {
                    byte[] bArr = sVar.f16701c;
                    i = (int) ((sVar.f16702d + j6) - j10);
                    int i6 = sVar.f16703e;
                    while (i < i6) {
                        byte b11 = bArr[i];
                        if (b11 == b9 || b11 == b10) {
                            i4 = sVar.f16702d;
                            return (i - i4) + j10;
                        }
                        i++;
                    }
                    j10 += sVar.f16703e - sVar.f16702d;
                    sVar = sVar.f16706h;
                    j6 = j10;
                }
                return -1L;
            }
            byte[] l9 = fVar.l();
            while (j10 < this.f16634c) {
                byte[] bArr2 = sVar.f16701c;
                i = (int) ((sVar.f16702d + j6) - j10);
                int i9 = sVar.f16703e;
                while (i < i9) {
                    byte b12 = bArr2[i];
                    for (byte b13 : l9) {
                        if (b12 == b13) {
                            i4 = sVar.f16702d;
                            return (i - i4) + j10;
                        }
                    }
                    i++;
                }
                j10 += sVar.f16703e - sVar.f16702d;
                sVar = sVar.f16706h;
                j6 = j10;
            }
            return -1L;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    private c a(InputStream inputStream) {
        a(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    private c a(InputStream inputStream, long j6) {
        if (j6 >= 0) {
            a(inputStream, j6, false);
            return this;
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j6)));
    }

    private void a(InputStream inputStream, long j6, boolean z6) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        while (true) {
            if (j6 <= 0 && !z6) {
                return;
            }
            s g9 = g(1);
            int read = inputStream.read(g9.f16701c, g9.f16703e, (int) Math.min(j6, 8192 - g9.f16703e));
            if (read == -1) {
                if (!z6) {
                    throw new EOFException();
                }
                return;
            } else {
                g9.f16703e += read;
                long j9 = read;
                this.f16634c += j9;
                j6 -= j9;
            }
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final int a(o oVar) {
        int a9 = a(oVar, false);
        if (a9 == -1) {
            return -1;
        }
        try {
            i(oVar.f16683a[a9].j());
            return a9;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
    
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r20 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        return r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(o oVar, boolean z6) {
        int i;
        int i4;
        int i6;
        s sVar;
        int i9;
        int i10;
        s sVar2 = this.f16633b;
        int i11 = -2;
        if (sVar2 == null) {
            if (z6) {
                return -2;
            }
            return oVar.indexOf(f.f16645b);
        }
        byte[] bArr = sVar2.f16701c;
        int i12 = sVar2.f16702d;
        int i13 = sVar2.f16703e;
        int[] iArr = oVar.f16684b;
        s sVar3 = sVar2;
        int i14 = 0;
        int i15 = -1;
        loop0: while (true) {
            int i16 = i14 + 1;
            int i17 = iArr[i14];
            int i18 = i14 + 2;
            int i19 = iArr[i16];
            if (i19 != -1) {
                i15 = i19;
            }
            if (sVar3 != null) {
                if (i17 >= 0) {
                    int i20 = i12 + 1;
                    int i21 = bArr[i12] & 255;
                    int i22 = i18 + i17;
                    while (i18 != i22) {
                        i = i11;
                        if (i21 == iArr[i18]) {
                            i4 = iArr[i18 + i17];
                            if (i20 == i13) {
                                sVar3 = sVar3.f16706h;
                                i6 = sVar3.f16702d;
                                bArr = sVar3.f16701c;
                                i13 = sVar3.f16703e;
                                if (sVar3 == sVar2) {
                                    sVar3 = null;
                                }
                            } else {
                                i6 = i20;
                            }
                            if (i4 >= 0) {
                                return i4;
                            }
                            i14 = -i4;
                            i12 = i6;
                            i11 = i;
                        } else {
                            i18++;
                            i11 = i;
                        }
                    }
                    break loop0;
                }
                int i23 = (i17 * (-1)) + i18;
                while (true) {
                    int i24 = i12 + 1;
                    int i25 = i18 + 1;
                    if ((bArr[i12] & 255) != iArr[i18]) {
                        break loop0;
                    }
                    boolean z9 = i25 == i23;
                    if (i24 == i13) {
                        s sVar4 = sVar3.f16706h;
                        i10 = sVar4.f16702d;
                        byte[] bArr2 = sVar4.f16701c;
                        i9 = sVar4.f16703e;
                        if (sVar4 != sVar2) {
                            sVar = sVar4;
                            bArr = bArr2;
                        } else {
                            if (!z9) {
                                break loop0;
                            }
                            bArr = bArr2;
                            sVar = null;
                        }
                    } else {
                        sVar = sVar3;
                        i9 = i13;
                        i10 = i24;
                    }
                    if (z9) {
                        i4 = iArr[i25];
                        i = i11;
                        i6 = i10;
                        i13 = i9;
                        sVar3 = sVar;
                        break;
                    }
                    i12 = i10;
                    i13 = i9;
                    sVar3 = sVar;
                    i18 = i25;
                }
            } else {
                break;
            }
        }
        return i15;
    }

    private a b(a aVar) {
        if (aVar.f16637a == null) {
            aVar.f16637a = this;
            aVar.f16638b = false;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(v vVar) {
        long j6 = this.f16634c;
        if (j6 > 0) {
            vVar.a(this, j6);
        }
        return j6;
    }

    @Override // com.anythink.core.common.n.c.e
    public final String a(Charset charset) {
        try {
            return a(this.f16634c, charset);
        } catch (EOFException e9) {
            throw new AssertionError(e9);
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final String a(long j6, Charset charset) {
        y.a(this.f16634c, 0L, j6);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j6 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j6)));
        }
        if (j6 == 0) {
            return "";
        }
        s sVar = this.f16633b;
        int i = sVar.f16702d;
        if (i + j6 > sVar.f16703e) {
            return new String(h(j6), charset);
        }
        String str = new String(sVar.f16701c, i, (int) j6, charset);
        int i4 = (int) (sVar.f16702d + j6);
        sVar.f16702d = i4;
        this.f16634c -= j6;
        if (i4 == sVar.f16703e) {
            this.f16633b = sVar.c();
            t.a(sVar);
        }
        return str;
    }

    @Override // com.anythink.core.common.n.c.e
    public final int a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    @Override // com.anythink.core.common.n.c.e
    public final int a(byte[] bArr, int i, int i4) {
        y.a(bArr.length, i, i4);
        s sVar = this.f16633b;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(i4, sVar.f16703e - sVar.f16702d);
        System.arraycopy(sVar.f16701c, sVar.f16702d, bArr, i, min);
        int i6 = sVar.f16702d + min;
        sVar.f16702d = i6;
        this.f16634c -= min;
        if (i6 == sVar.f16703e) {
            this.f16633b = sVar.c();
            t.a(sVar);
        }
        return min;
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c d(f fVar) {
        if (fVar != null) {
            fVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(String str) {
        return b(str, 0, str.length());
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(String str, int i, int i4) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i4 >= i) {
            if (i4 > str.length()) {
                StringBuilder k9 = Wv.k(i4, "endIndex > string.length: ", " > ");
                k9.append(str.length());
                throw new IllegalArgumentException(k9.toString());
            }
            while (i < i4) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    s g9 = g(1);
                    byte[] bArr = g9.f16701c;
                    int i6 = g9.f16703e - i;
                    int min = Math.min(i4, 8192 - i6);
                    int i9 = i + 1;
                    bArr[i + i6] = (byte) charAt2;
                    while (true) {
                        i = i9;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            break;
                        }
                        i9 = i + 1;
                        bArr[i + i6] = (byte) charAt;
                    }
                    int i10 = g9.f16703e;
                    int i11 = (i6 + i) - i10;
                    g9.f16703e = i10 + i11;
                    this.f16634c += i11;
                } else {
                    if (charAt2 < 2048) {
                        l((charAt2 >> 6) | 192);
                        l((charAt2 & '?') | 128);
                    } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                        int i12 = i + 1;
                        char charAt3 = i12 < i4 ? str.charAt(i12) : (char) 0;
                        if (charAt2 <= 56319 && charAt3 >= 56320 && charAt3 <= 57343) {
                            int i13 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + com.anythink.basead.exoplayer.b.aX;
                            l((i13 >> 18) | 240);
                            l(((i13 >> 12) & 63) | 128);
                            l(((i13 >> 6) & 63) | 128);
                            l((i13 & 63) | 128);
                            i += 2;
                        } else {
                            l(63);
                            i = i12;
                        }
                    } else {
                        l((charAt2 >> '\f') | 224);
                        l(((charAt2 >> 6) & 63) | 128);
                        l((charAt2 & '?') | 128);
                    }
                    i++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(AbstractC5128c.c(i4, i, "endIndex < beginIndex: ", " < "));
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c m(int i) {
        if (i < 128) {
            l(i);
            return this;
        }
        if (i < 2048) {
            l((i >> 6) | 192);
            l((i & 63) | 128);
            return this;
        }
        if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                l(63);
                return this;
            }
            l((i >> 12) | 224);
            l(((i >> 6) & 63) | 128);
            l((i & 63) | 128);
            return this;
        }
        if (i <= 1114111) {
            l((i >> 18) | 240);
            l(((i >> 12) & 63) | 128);
            l(((i >> 6) & 63) | 128);
            l((i & 63) | 128);
            return this;
        }
        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(String str, Charset charset) {
        return b(str, 0, str.length(), charset);
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(String str, int i, int i4, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i4 >= i) {
            if (i4 > str.length()) {
                StringBuilder k9 = Wv.k(i4, "endIndex > string.length: ", " > ");
                k9.append(str.length());
                throw new IllegalArgumentException(k9.toString());
            }
            if (charset != null) {
                if (charset.equals(y.f16716a)) {
                    return b(str, i, i4);
                }
                byte[] bytes = str.substring(i, i4).getBytes(charset);
                return c(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(AbstractC5128c.c(i4, i, "endIndex < beginIndex: ", " < "));
    }

    @Override // com.anythink.core.common.n.c.d
    public final long a(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j6 = 0;
        while (true) {
            long a_ = wVar.a_(this, 8192L);
            if (a_ == -1) {
                return j6;
            }
            j6 += a_;
        }
    }

    @Override // com.anythink.core.common.n.c.d
    public final d a(w wVar, long j6) {
        while (j6 > 0) {
            long a_ = wVar.a_(this, j6);
            if (a_ == -1) {
                throw new EOFException();
            }
            j6 -= a_;
        }
        return this;
    }

    @Override // com.anythink.core.common.n.c.v
    public final void a(c cVar, long j6) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar != this) {
            y.a(cVar.f16634c, 0L, j6);
            while (j6 > 0) {
                s sVar = cVar.f16633b;
                if (j6 < sVar.f16703e - sVar.f16702d) {
                    s sVar2 = this.f16633b;
                    s sVar3 = sVar2 != null ? sVar2.i : null;
                    if (sVar3 != null && sVar3.f16705g) {
                        if ((sVar3.f16703e + j6) - (sVar3.f16704f ? 0 : sVar3.f16702d) <= 8192) {
                            sVar.a(sVar3, (int) j6);
                            cVar.f16634c -= j6;
                            this.f16634c += j6;
                            return;
                        }
                    }
                    cVar.f16633b = sVar.a((int) j6);
                }
                s sVar4 = cVar.f16633b;
                long j9 = sVar4.f16703e - sVar4.f16702d;
                cVar.f16633b = sVar4.c();
                s sVar5 = this.f16633b;
                if (sVar5 == null) {
                    this.f16633b = sVar4;
                    sVar4.i = sVar4;
                    sVar4.f16706h = sVar4;
                } else {
                    sVar5.i.a(sVar4).d();
                }
                cVar.f16634c -= j9;
                this.f16634c += j9;
                j6 -= j9;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
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
        s sVar;
        long j10 = j6;
        long j11 = j9;
        long j12 = 0;
        if (j10 >= 0 && j11 >= j10) {
            long j13 = this.f16634c;
            if (j11 > j13) {
                j11 = j13;
            }
            if (j10 == j11 || (sVar = this.f16633b) == null) {
                return -1L;
            }
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    sVar = sVar.i;
                    j13 -= sVar.f16703e - sVar.f16702d;
                }
            } else {
                while (true) {
                    long j14 = (sVar.f16703e - sVar.f16702d) + j12;
                    if (j14 >= j10) {
                        break;
                    }
                    sVar = sVar.f16706h;
                    j12 = j14;
                }
                j13 = j12;
            }
            while (j13 < j11) {
                byte[] bArr = sVar.f16701c;
                int min = (int) Math.min(sVar.f16703e, (sVar.f16702d + j11) - j13);
                for (int i = (int) ((sVar.f16702d + j10) - j13); i < min; i++) {
                    if (bArr[i] == b9) {
                        return (i - sVar.f16702d) + j13;
                    }
                }
                j13 += sVar.f16703e - sVar.f16702d;
                sVar = sVar.f16706h;
                j10 = j13;
            }
            return -1L;
        }
        throw new IllegalArgumentException("size=" + this.f16634c + " fromIndex=" + j10 + " toIndex=" + j11);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(f fVar, long j6) {
        if (fVar.j() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j9 = 0;
        if (j6 >= 0) {
            s sVar = this.f16633b;
            long j10 = -1;
            if (sVar == null) {
                return -1L;
            }
            long j11 = this.f16634c;
            if (j11 - j6 < j6) {
                while (j11 > j6) {
                    sVar = sVar.i;
                    j11 -= sVar.f16703e - sVar.f16702d;
                }
            } else {
                while (true) {
                    long j12 = (sVar.f16703e - sVar.f16702d) + j9;
                    if (j12 >= j6) {
                        break;
                    }
                    sVar = sVar.f16706h;
                    j9 = j12;
                }
                j11 = j9;
            }
            byte b9 = fVar.b(0);
            int j13 = fVar.j();
            long j14 = (this.f16634c - j13) + 1;
            long j15 = j11;
            long j16 = j6;
            while (j15 < j14) {
                byte[] bArr = sVar.f16701c;
                long j17 = j10;
                int min = (int) Math.min(sVar.f16703e, (sVar.f16702d + j14) - j15);
                for (int i = (int) ((sVar.f16702d + j16) - j15); i < min; i++) {
                    if (bArr[i] == b9 && a(sVar, i + 1, fVar, j13)) {
                        return (i - sVar.f16702d) + j15;
                    }
                }
                j15 += sVar.f16703e - sVar.f16702d;
                sVar = sVar.f16706h;
                j16 = j15;
                j10 = j17;
            }
            return j10;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean a(long j6, f fVar) {
        return a(j6, fVar, fVar.j());
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean a(long j6, f fVar, int i) {
        if (j6 < 0 || i < 0 || this.f16634c - j6 < i || fVar.j() < i) {
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (c(i4 + j6) != fVar.b(i4)) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(s sVar, int i, f fVar, int i4) {
        int i6 = sVar.f16703e;
        byte[] bArr = sVar.f16701c;
        for (int i9 = 1; i9 < i4; i9++) {
            if (i == i6) {
                sVar = sVar.f16706h;
                bArr = sVar.f16701c;
                i = sVar.f16702d;
                i6 = sVar.f16703e;
            }
            if (bArr[i] != fVar.b(i9)) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return x.f16712c;
    }

    private f a(String str, f fVar) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(fVar.k(), str));
            s sVar = this.f16633b;
            if (sVar != null) {
                byte[] bArr = sVar.f16701c;
                int i = sVar.f16702d;
                mac.update(bArr, i, sVar.f16703e - i);
                s sVar2 = this.f16633b;
                while (true) {
                    sVar2 = sVar2.f16706h;
                    if (sVar2 == this.f16633b) {
                        break;
                    }
                    byte[] bArr2 = sVar2.f16701c;
                    int i4 = sVar2.f16702d;
                    mac.update(bArr2, i4, sVar2.f16703e - i4);
                }
            }
            return f.a(mac.doFinal());
        } catch (InvalidKeyException e9) {
            throw new IllegalArgumentException(e9);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public final a a(a aVar) {
        if (aVar.f16637a == null) {
            aVar.f16637a = this;
            aVar.f16638b = true;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer");
    }
}
