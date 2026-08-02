package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class ikn implements ij3 {
    public final n3r a;
    public final hi3 b;
    public boolean c;

    public ikn(n3r n3rVar) {
        n3rVar.getClass();
        this.a = n3rVar;
        this.b = new hi3();
    }

    @Override // defpackage.ij3
    public final boolean A0(long j, pn3 pn3Var) {
        int i;
        pn3Var.getClass();
        int d = pn3Var.d();
        if (this.c) {
            xq0.q("closed");
            return false;
        }
        if (j >= 0 && d >= 0 && pn3Var.d() >= d) {
            for (0; i < d; i + 1) {
                long j2 = i + j;
                i = (request(1 + j2) && this.b.P(j2) == pn3Var.k(i)) ? i + 1 : 0;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ij3
    public final String B() {
        long b = b((byte) 10, 0L, Long.MAX_VALUE);
        hi3 hi3Var = this.b;
        if (b != -1) {
            return b.b(hi3Var, b);
        }
        long j = hi3Var.b;
        if (j != 0) {
            return D(j);
        }
        return null;
    }

    @Override // defpackage.ij3
    public final long C(pn3 pn3Var) {
        pn3Var.getClass();
        if (this.c) {
            xq0.q("closed");
            return 0L;
        }
        long j = 0;
        while (true) {
            hi3 hi3Var = this.b;
            long R = hi3Var.R(j, pn3Var);
            if (R != -1) {
                return R;
            }
            long j2 = hi3Var.b;
            if (this.a.e0(hi3Var, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = java.lang.Integer.toString(r2, kotlin.text.CharsKt.checkRadix(16));
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // defpackage.ij3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long C0() {
        hi3 hi3Var;
        a0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean request = request(i2);
            hi3Var = this.b;
            if (!request) {
                break;
            }
            byte P = hi3Var.P(i);
            if ((P < 48 || P > 57) && ((P < 97 || P > 102) && (P < 65 || P > 70))) {
                break;
            }
            i = i2;
        }
        return hi3Var.C0();
    }

    public final String D(long j) {
        a0(j);
        return this.b.F0(j, Charsets.UTF_8);
    }

    @Override // defpackage.ij3
    public final InputStream E0() {
        return new fi3(this, 1);
    }

    @Override // defpackage.ij3
    public final String G(long j) {
        if (j < 0) {
            xq0.o(dfi.d(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long b = b((byte) 10, 0L, j2);
        hi3 hi3Var = this.b;
        if (b != -1) {
            return b.b(hi3Var, b);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && hi3Var.P(j2 - 1) == 13 && request(j2 + 1) && hi3Var.P(j2) == 10) {
            return b.b(hi3Var, j2);
        }
        hi3 hi3Var2 = new hi3();
        hi3Var.I(hi3Var2, 0L, Math.min(32, hi3Var.b));
        throw new EOFException("\\n not found: limit=" + Math.min(hi3Var.b, j) + " content=" + hi3Var2.g0(hi3Var2.b).e() + (char) 8230);
    }

    @Override // defpackage.ij3
    public final void O(hi3 hi3Var, long j) {
        hi3 hi3Var2 = this.b;
        try {
            a0(j);
            hi3Var2.O(hi3Var, j);
        } catch (EOFException e) {
            hi3Var.o0(hi3Var2);
            throw e;
        }
    }

    @Override // defpackage.ij3
    public final String T() {
        return G(Long.MAX_VALUE);
    }

    public final boolean a() {
        if (this.c) {
            xq0.q("closed");
            return false;
        }
        hi3 hi3Var = this.b;
        return hi3Var.N() && this.a.e0(hi3Var, 8192L) == -1;
    }

    @Override // defpackage.ij3
    public final void a0(long j) {
        if (request(j)) {
            return;
        }
        xq0.v();
    }

    public final long b(byte b, long j, long j2) {
        if (this.c) {
            xq0.q("closed");
            return 0L;
        }
        if (0 > j2) {
            xq0.o(dfi.d(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long j3 = 0;
        while (j3 < j2) {
            hi3 hi3Var = this.b;
            byte b2 = b;
            long j4 = j2;
            long Q = hi3Var.Q(b2, j3, j4);
            if (Q == -1) {
                long j5 = hi3Var.b;
                if (j5 >= j4 || this.a.e0(hi3Var, 8192L) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return Q;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.b();
    }

    @Override // defpackage.n3r
    public final long e0(hi3 hi3Var, long j) {
        hi3Var.getClass();
        if (j < 0) {
            xq0.o(dfi.d(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            xq0.q("closed");
            return 0L;
        }
        hi3 hi3Var2 = this.b;
        if (hi3Var2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.a.e0(hi3Var2, 8192L) == -1) {
                return -1L;
            }
        }
        return hi3Var2.e0(hi3Var, Math.min(j, hi3Var2.b));
    }

    public final int g() {
        a0(4L);
        int readInt = this.b.readInt();
        return ((readInt & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // defpackage.ij3
    public final pn3 g0(long j) {
        a0(j);
        return this.b.g0(j);
    }

    @Override // defpackage.ij3, defpackage.gj3
    public final hi3 h() {
        return this.b;
    }

    @Override // defpackage.ij3
    public final int h0(qwj qwjVar) {
        qwjVar.getClass();
        if (this.c) {
            xq0.q("closed");
            return 0;
        }
        while (true) {
            hi3 hi3Var = this.b;
            int c = b.c(hi3Var, qwjVar, true);
            if (c != -2) {
                if (c != -1) {
                    hi3Var.skip(qwjVar.b[c].d());
                    return c;
                }
            } else if (this.a.e0(hi3Var, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // defpackage.n3r
    public final vis i() {
        return this.a.i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.ij3
    public final byte[] k0() {
        n3r n3rVar = this.a;
        hi3 hi3Var = this.b;
        hi3Var.o0(n3rVar);
        return hi3Var.X(hi3Var.b);
    }

    public final long o() {
        a0(8L);
        long readLong = this.b.readLong();
        return ((readLong & 255) << 56) | (((-72057594037927936L) & readLong) >>> 56) | ((71776119061217280L & readLong) >>> 40) | ((280375465082880L & readLong) >>> 24) | ((1095216660480L & readLong) >>> 8) | ((4278190080L & readLong) << 8) | ((16711680 & readLong) << 24) | ((65280 & readLong) << 40);
    }

    @Override // defpackage.ij3
    public final ikn peek() {
        return new ikn(new sjk(this));
    }

    @Override // defpackage.ij3
    public final long q0(gj3 gj3Var) {
        hi3 hi3Var;
        long j = 0;
        while (true) {
            n3r n3rVar = this.a;
            hi3Var = this.b;
            if (n3rVar.e0(hi3Var, 8192L) == -1) {
                break;
            }
            long H = hi3Var.H();
            if (H > 0) {
                j += H;
                gj3Var.t0(hi3Var, H);
            }
        }
        long j2 = hi3Var.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        gj3Var.t0(hi3Var, j2);
        return j3;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        hi3 hi3Var = this.b;
        if (hi3Var.b == 0 && this.a.e0(hi3Var, 8192L) == -1) {
            return -1;
        }
        return hi3Var.read(byteBuffer);
    }

    @Override // defpackage.ij3
    public final byte readByte() {
        a0(1L);
        return this.b.readByte();
    }

    @Override // defpackage.ij3
    public final void readFully(byte[] bArr) {
        hi3 hi3Var = this.b;
        bArr.getClass();
        try {
            a0(bArr.length);
            hi3Var.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = hi3Var.b;
                if (j <= 0) {
                    throw e;
                }
                int read = hi3Var.read(bArr, i, (int) j);
                if (read == -1) {
                    wvs.b();
                    return;
                }
                i += read;
            }
        }
    }

    @Override // defpackage.ij3
    public final int readInt() {
        a0(4L);
        return this.b.readInt();
    }

    @Override // defpackage.ij3
    public final long readLong() {
        a0(8L);
        return this.b.readLong();
    }

    @Override // defpackage.ij3
    public final short readShort() {
        a0(2L);
        return this.b.readShort();
    }

    @Override // defpackage.ij3
    public final boolean request(long j) {
        hi3 hi3Var;
        if (j < 0) {
            xq0.o(dfi.d(j, "byteCount < 0: "));
            return false;
        }
        if (this.c) {
            xq0.q("closed");
            return false;
        }
        do {
            hi3Var = this.b;
            if (hi3Var.b >= j) {
                return true;
            }
        } while (this.a.e0(hi3Var, 8192L) != -1);
        return false;
    }

    @Override // defpackage.ij3
    public final hi3 s() {
        return this.b;
    }

    @Override // defpackage.ij3
    public final void skip(long j) {
        if (this.c) {
            xq0.q("closed");
            return;
        }
        while (j > 0) {
            hi3 hi3Var = this.b;
            if (hi3Var.b == 0 && this.a.e0(hi3Var, 8192L) == -1) {
                xq0.v();
                return;
            } else {
                long min = Math.min(j, hi3Var.b);
                hi3Var.skip(min);
                j -= min;
            }
        }
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.ij3
    public final String v0(Charset charset) {
        charset.getClass();
        n3r n3rVar = this.a;
        hi3 hi3Var = this.b;
        hi3Var.o0(n3rVar);
        return hi3Var.F0(hi3Var.b, charset);
    }

    public final short z() {
        a0(2L);
        return this.b.l0();
    }
}
