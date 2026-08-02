package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.ByteString;
import okio.SegmentedByteString;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes9.dex */
public final class yp6 implements qq6, oq6, Cloneable, ByteChannel {
    public t7q0 a;
    public long b;

    public static final class a implements Closeable {
        public yp6 a;
        public boolean b;
        public t7q0 c;
        public byte[] x;
        public long w = -1;
        public int y = -1;
        public int z = -1;

        public final void a(long j) {
            yp6 yp6Var = this.a;
            if (yp6Var == null) {
                ny61.r("not attached to a buffer");
                return;
            }
            if (!this.b) {
                ny61.r("resizeBuffer() only permitted for read/write buffers");
                return;
            }
            long j2 = yp6Var.b;
            if (j <= j2) {
                if (j < 0) {
                    w511.f(qv10.j(j, "newSize < 0: "));
                    return;
                }
                long j3 = j2 - j;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    t7q0 t7q0Var = yp6Var.a.g;
                    int i = t7q0Var.c;
                    long j4 = i - t7q0Var.b;
                    if (j4 > j3) {
                        t7q0Var.c = i - ((int) j3);
                        break;
                    } else {
                        yp6Var.a = t7q0Var.a();
                        p8q0.a(t7q0Var);
                        j3 -= j4;
                    }
                }
                this.c = null;
                this.w = j;
                this.x = null;
                this.y = -1;
                this.z = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                int i2 = 1;
                boolean z = true;
                for (long j6 = 0; j5 > j6; j6 = 0) {
                    t7q0 a0 = yp6Var.a0(i2);
                    int min = (int) Math.min(j5, 8192 - a0.c);
                    int i3 = a0.c + min;
                    a0.c = i3;
                    j5 -= min;
                    if (z) {
                        this.c = a0;
                        this.w = j2;
                        this.x = a0.a;
                        this.y = i3 - min;
                        this.z = i3;
                        z = false;
                    }
                    i2 = 1;
                }
            }
            yp6Var.b = j;
        }

        public final int c(long j) {
            yp6 yp6Var = this.a;
            if (yp6Var == null) {
                ny61.r("not attached to a buffer");
                return 0;
            }
            if (j >= -1) {
                long j2 = yp6Var.b;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.c = null;
                        this.w = j;
                        this.x = null;
                        this.y = -1;
                        this.z = -1;
                        return -1;
                    }
                    t7q0 t7q0Var = yp6Var.a;
                    t7q0 t7q0Var2 = this.c;
                    long j3 = 0;
                    if (t7q0Var2 != null) {
                        long j4 = this.w - (this.y - t7q0Var2.b);
                        if (j4 > j) {
                            t7q0Var2 = t7q0Var;
                            t7q0Var = t7q0Var2;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        t7q0Var2 = t7q0Var;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            long j5 = (t7q0Var2.c - t7q0Var2.b) + j3;
                            if (j < j5) {
                                break;
                            }
                            t7q0Var2 = t7q0Var2.f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            t7q0Var = t7q0Var.g;
                            j2 -= t7q0Var.c - t7q0Var.b;
                        }
                        t7q0Var2 = t7q0Var;
                        j3 = j2;
                    }
                    if (this.b && t7q0Var2.d) {
                        byte[] bArr = t7q0Var2.a;
                        t7q0 t7q0Var3 = new t7q0(Arrays.copyOf(bArr, bArr.length), t7q0Var2.b, t7q0Var2.c, false, true);
                        if (yp6Var.a == t7q0Var2) {
                            yp6Var.a = t7q0Var3;
                        }
                        t7q0Var2.b(t7q0Var3);
                        t7q0Var3.g.a();
                        t7q0Var2 = t7q0Var3;
                    }
                    this.c = t7q0Var2;
                    this.w = j;
                    this.x = t7q0Var2.a;
                    int i = t7q0Var2.b + ((int) (j - j3));
                    this.y = i;
                    int i2 = t7q0Var2.c;
                    this.z = i2;
                    return i2 - i;
                }
            }
            StringBuilder w = unr0.w(j, "offset=", " > size=");
            w.append(yp6Var.b);
            throw new ArrayIndexOutOfBoundsException(w.toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.a == null) {
                ny61.r("not attached to a buffer");
                return;
            }
            this.a = null;
            this.c = null;
            this.w = -1L;
            this.x = null;
            this.y = -1;
            this.z = -1;
        }
    }

    public final byte[] B(long j) {
        if (j < 0 || j > 2147483647L) {
            w511.f(qv10.j(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            ny61.b();
            return null;
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // defpackage.qq6
    public final void B1(long j) {
        if (this.b >= j) {
            return;
        }
        ny61.b();
    }

    @Override // defpackage.qq6
    public final String C0(Charset charset) {
        return T(this.b, charset);
    }

    @Override // defpackage.qq6
    public final void C1(yp6 yp6Var, long j) {
        long j2 = this.b;
        if (j2 >= j) {
            yp6Var.write(this, j);
        } else {
            yp6Var.write(this, j2);
            ny61.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        r3 = r19.b - r1;
        r19.b = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009e, code lost:
    
        if (r3 == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        r1 = defpackage.oyr.v(r1, " but was 0x");
        r1.append(defpackage.j.e(e(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c3, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        r3 = r17;
        defpackage.ny61.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c9, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cc, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ce, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
    
        r14 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long D() {
        long j;
        byte b;
        long j2 = 0;
        if (this.b == 0) {
            ny61.b();
            return 0L;
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            t7q0 t7q0Var = this.a;
            byte[] bArr = t7q0Var.a;
            int i2 = t7q0Var.b;
            int i3 = t7q0Var.c;
            while (i2 < i3) {
                b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + i4;
                } else {
                    j = j2;
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            j = j2;
            if (i2 == i3) {
                this.a = t7q0Var.a();
                p8q0.a(t7q0Var);
            } else {
                t7q0Var.b = i2;
            }
            if (z2 || this.a == null) {
                break;
            }
            j2 = j;
        }
        yp6 yp6Var = new yp6();
        yp6Var.f0(j3);
        yp6Var.e0(b);
        if (!z) {
            yp6Var.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(yp6Var.I0()));
    }

    @Override // defpackage.qq6
    public final ByteString E0() {
        return l0(this.b);
    }

    public final void G(InputStream inputStream) {
        t7q0 a0;
        long j = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        while (true) {
            a0 = a0(1);
            int read = inputStream.read(a0.a, a0.c, (int) Math.min(j, 8192 - a0.c));
            if (read == -1) {
                break;
            }
            a0.c += read;
            long j2 = read;
            this.b += j2;
            j -= j2;
        }
        if (a0.b == a0.c) {
            this.a = a0.a();
            p8q0.a(a0);
        }
    }

    @Override // defpackage.oq6
    public final oq6 H(long j) {
        q0(j.d(j));
        return this;
    }

    @Override // defpackage.qq6
    public final String I0() {
        return T(this.b, uza.a);
    }

    @Override // defpackage.qq6
    public final boolean I1() {
        return this.b == 0;
    }

    @Override // defpackage.qq6
    public final long J(ByteString byteString) {
        byte[] bArr = b.a;
        return b.a(this, byteString, 0L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, byteString.h());
    }

    @Override // defpackage.qq6
    public final long K(ByteString byteString) {
        return o(0L, byteString);
    }

    @Override // defpackage.qq6
    public final String L() {
        long e1 = e1((byte) 10, 0L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        if (e1 != -1) {
            return b.c(this, e1);
        }
        long j = this.b;
        if (j != 0) {
            return T(j, uza.a);
        }
        return null;
    }

    @Override // defpackage.oq6
    public final /* bridge */ /* synthetic */ oq6 N0(ByteString byteString) {
        b0(byteString);
        return this;
    }

    @Override // defpackage.oq6
    public final long N1(y9t0 y9t0Var) {
        long j = 0;
        while (true) {
            long read = y9t0Var.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a A[EDGE_INSN: B:40:0x008a->B:37:0x008a BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long P() {
        int i;
        if (this.b == 0) {
            ny61.b();
            return 0L;
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            t7q0 t7q0Var = this.a;
            byte[] bArr = t7q0Var.a;
            int i3 = t7q0Var.b;
            int i4 = t7q0Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b >= 65 && b <= 70) {
                    i = b - 55;
                } else {
                    if (i2 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(j.e(b)));
                    }
                    z = true;
                    if (i3 != i4) {
                        this.a = t7q0Var.a();
                        p8q0.a(t7q0Var);
                    } else {
                        t7q0Var.b = i3;
                    }
                    if (!z) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    yp6 yp6Var = new yp6();
                    yp6Var.g0(j);
                    yp6Var.e0(b);
                    throw new NumberFormatException("Number too large: ".concat(yp6Var.I0()));
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.a != null);
        this.b -= i2;
        return j;
    }

    @Override // defpackage.qq6
    public final boolean Q(long j, ByteString byteString) {
        return v(byteString.h(), j, byteString);
    }

    public final short R() {
        short readShort = readShort();
        a aVar = j.a;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // defpackage.qq6
    public final boolean S(long j) {
        return this.b >= j;
    }

    public final String T(long j, Charset charset) {
        if (j < 0 || j > 2147483647L) {
            w511.f(qv10.j(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            ny61.b();
            return null;
        }
        if (j == 0) {
            return "";
        }
        t7q0 t7q0Var = this.a;
        int i = t7q0Var.b;
        if (i + j > t7q0Var.c) {
            return new String(B(j), charset);
        }
        int i2 = (int) j;
        String str = new String(t7q0Var.a, i, i2, charset);
        int i3 = t7q0Var.b + i2;
        t7q0Var.b = i3;
        this.b -= j;
        if (i3 == t7q0Var.c) {
            this.a = t7q0Var.a();
            p8q0.a(t7q0Var);
        }
        return str;
    }

    public final int U() {
        int i;
        int i2;
        int i3;
        if (this.b == 0) {
            ny61.b();
            return 0;
        }
        byte e = e(0L);
        if ((e & DerValue.TAG_CONTEXT) == 0) {
            i = e & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((e & 224) == 192) {
            i = e & 31;
            i2 = 2;
            i3 = 128;
        } else if ((e & 240) == 224) {
            i = e & PKIBody._CCP;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((e & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = e & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.b < j) {
            StringBuilder t = b64.t(i2, "size < ", Extension.COLON_SPACE);
            t.append(this.b);
            t.append(" (to read code point prefixed 0x");
            t.append(j.e(e));
            t.append(')');
            throw new EOFException(t.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte e2 = e(j2);
            if ((e2 & DerValue.TAG_PRIVATE) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (e2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // defpackage.qq6
    public final yp6 V0() {
        return this;
    }

    public final ByteString W() {
        long j = this.b;
        if (j <= 2147483647L) {
            return Z((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    @Override // defpackage.qq6
    public final long X() {
        return j.d(readLong());
    }

    public final ByteString Z(int i) {
        if (i == 0) {
            return ByteString.c;
        }
        j.b(this.b, 0L, i);
        t7q0 t7q0Var = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = t7q0Var.c;
            int i6 = t7q0Var.b;
            if (i5 == i6) {
                ny61.f("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            t7q0Var = t7q0Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        t7q0 t7q0Var2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = t7q0Var2.a;
            i2 += t7q0Var2.c - t7q0Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = t7q0Var2.b;
            t7q0Var2.d = true;
            i7++;
            t7q0Var2 = t7q0Var2.f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    public final long a() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        t7q0 t7q0Var = this.a.g;
        return (t7q0Var.c >= 8192 || !t7q0Var.e) ? j : j - (r2 - t7q0Var.b);
    }

    public final t7q0 a0(int i) {
        if (i < 1 || i > 8192) {
            ny61.g("unexpected capacity");
            return null;
        }
        t7q0 t7q0Var = this.a;
        if (t7q0Var == null) {
            t7q0 b = p8q0.b();
            this.a = b;
            b.g = b;
            b.f = b;
            return b;
        }
        t7q0 t7q0Var2 = t7q0Var.g;
        if (t7q0Var2.c + i <= 8192 && t7q0Var2.e) {
            return t7q0Var2;
        }
        t7q0 b2 = p8q0.b();
        t7q0Var2.b(b2);
        return b2;
    }

    @Override // defpackage.oq6
    public final /* bridge */ /* synthetic */ oq6 a2(int i, int i2, String str) {
        w0(i, i2, str);
        return this;
    }

    public final void b0(ByteString byteString) {
        byteString.x(this, byteString.h());
    }

    public final yp6 c() {
        yp6 yp6Var = new yp6();
        if (this.b == 0) {
            return yp6Var;
        }
        t7q0 t7q0Var = this.a;
        t7q0 c = t7q0Var.c();
        yp6Var.a = c;
        c.g = c;
        c.f = c;
        for (t7q0 t7q0Var2 = t7q0Var.f; t7q0Var2 != t7q0Var; t7q0Var2 = t7q0Var2.f) {
            c.g.b(t7q0Var2.c());
        }
        yp6Var.b = this.b;
        return yp6Var;
    }

    public final void clear() {
        skip(this.b);
    }

    public final Object clone() {
        return c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.uis0
    public final void close() {
    }

    public final void d(yp6 yp6Var, long j, long j2) {
        long j3 = j;
        j.b(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        yp6Var.b += j2;
        t7q0 t7q0Var = this.a;
        while (true) {
            long j4 = t7q0Var.c - t7q0Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            t7q0Var = t7q0Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            t7q0 c = t7q0Var.c();
            int i = c.b + ((int) j3);
            c.b = i;
            c.c = Math.min(i + ((int) j5), c.c);
            t7q0 t7q0Var2 = yp6Var.a;
            if (t7q0Var2 == null) {
                c.g = c;
                c.f = c;
                yp6Var.a = c;
            } else {
                t7q0Var2.g.b(c);
            }
            j5 -= c.c - c.b;
            t7q0Var = t7q0Var.f;
            j3 = 0;
        }
    }

    @Override // defpackage.oq6
    public final /* bridge */ /* synthetic */ oq6 d0(long j) {
        f0(j);
        return this;
    }

    @Override // defpackage.qq6
    public final int d2() {
        return j.c(readInt());
    }

    public final byte e(long j) {
        j.b(this.b, j, 1L);
        t7q0 t7q0Var = this.a;
        t7q0Var.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                t7q0Var = t7q0Var.g;
                j2 -= t7q0Var.c - t7q0Var.b;
            }
            return t7q0Var.a[(int) ((t7q0Var.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = t7q0Var.c;
            int i2 = t7q0Var.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return t7q0Var.a[(int) ((i2 + j) - j3)];
            }
            t7q0Var = t7q0Var.f;
            j3 = j4;
        }
    }

    public final void e0(int i) {
        t7q0 a0 = a0(1);
        byte[] bArr = a0.a;
        int i2 = a0.c;
        a0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    @Override // defpackage.qq6
    public final long e1(byte b, long j, long j2) {
        t7q0 t7q0Var;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.b);
            x4e.A(j3, " fromIndex=", " toIndex=", sb);
            sb.append(j4);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (t7q0Var = this.a) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                t7q0Var = t7q0Var.g;
                j6 -= t7q0Var.c - t7q0Var.b;
            }
            while (j6 < j4) {
                byte[] bArr = t7q0Var.a;
                long j8 = j7;
                int min = (int) Math.min(t7q0Var.c, (t7q0Var.b + j4) - j6);
                for (int i = (int) ((t7q0Var.b + j3) - j6); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - t7q0Var.b) + j6;
                    }
                }
                j6 += t7q0Var.c - t7q0Var.b;
                t7q0Var = t7q0Var.f;
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = (t7q0Var.c - t7q0Var.b) + j5;
            if (j9 > j3) {
                break;
            }
            t7q0Var = t7q0Var.f;
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = t7q0Var.a;
            int min2 = (int) Math.min(t7q0Var.c, (t7q0Var.b + j4) - j5);
            for (int i2 = (int) ((t7q0Var.b + j3) - j5); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - t7q0Var.b) + j5;
                }
            }
            j5 += t7q0Var.c - t7q0Var.b;
            t7q0Var = t7q0Var.f;
            j3 = j5;
        }
        return -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp6)) {
            return false;
        }
        long j = this.b;
        yp6 yp6Var = (yp6) obj;
        if (j != yp6Var.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        t7q0 t7q0Var = this.a;
        t7q0 t7q0Var2 = yp6Var.a;
        int i = t7q0Var.b;
        int i2 = t7q0Var2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long min = Math.min(t7q0Var.c - i, t7q0Var2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (t7q0Var.a[i] != t7q0Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == t7q0Var.c) {
                t7q0Var = t7q0Var.f;
                i = t7q0Var.b;
            }
            if (i2 == t7q0Var2.c) {
                t7q0Var2 = t7q0Var2.f;
                i2 = t7q0Var2.b;
            }
            j2 += min;
        }
        return true;
    }

    public final void f0(long j) {
        boolean z;
        if (j == 0) {
            e0(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                x0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = numberOfLeadingZeros + (j > b.b[numberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        t7q0 a0 = a0(i);
        byte[] bArr2 = a0.a;
        int i2 = a0.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = Alerts.alert_certificate_expired;
        }
        a0.c += i;
        this.b += i;
    }

    @Override // defpackage.oq6, defpackage.uis0, java.io.Flushable
    public final void flush() {
    }

    public final void g0(long j) {
        if (j == 0) {
            e0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        t7q0 a0 = a0(i);
        byte[] bArr = a0.a;
        int i2 = a0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        a0.c += i;
        this.b += i;
    }

    @Override // defpackage.qq6
    public final yp6 h() {
        return this;
    }

    @Override // defpackage.qq6
    public final int h0(ng70 ng70Var) {
        int d = b.d(this, ng70Var, false);
        if (d == -1) {
            return -1;
        }
        skip(ng70Var.a[d].h());
        return d;
    }

    public final int hashCode() {
        t7q0 t7q0Var = this.a;
        if (t7q0Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = t7q0Var.c;
            for (int i3 = t7q0Var.b; i3 < i2; i3++) {
                i = (i * 31) + t7q0Var.a[i3];
            }
            t7q0Var = t7q0Var.f;
        } while (t7q0Var != this.a);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.qq6
    public final String j0(long j) {
        return T(j, uza.a);
    }

    @Override // defpackage.qq6
    public final String j1(long j) {
        if (j < 0) {
            w511.f(qv10.j(j, "limit < 0: "));
            return null;
        }
        long j2 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        if (j != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            j2 = j + 1;
        }
        long j3 = j2;
        long e1 = e1((byte) 10, 0L, j3);
        if (e1 != -1) {
            return b.c(this, e1);
        }
        if (j3 < this.b && e(j3 - 1) == 13 && e(j3) == 10) {
            return b.c(this, j3);
        }
        yp6 yp6Var = new yp6();
        d(yp6Var, 0L, Math.min(32L, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + yp6Var.l0(yp6Var.b).i() + (char) 8230);
    }

    @Override // defpackage.qq6
    public final ByteString l0(long j) {
        if (j < 0 || j > 2147483647L) {
            w511.f(qv10.j(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            ny61.b();
            return null;
        }
        if (j < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new ByteString(B(j));
        }
        ByteString Z = Z((int) j);
        skip(j);
        return Z;
    }

    public final void n0(int i) {
        t7q0 a0 = a0(4);
        byte[] bArr = a0.a;
        int i2 = a0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        a0.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.oq6
    public final /* bridge */ /* synthetic */ oq6 n2(int i, int i2, byte[] bArr) {
        write(bArr, i, i2);
        return this;
    }

    public final long o(long j, ByteString byteString) {
        long j2 = 0;
        if (j < 0) {
            w511.f(qv10.j(j, "fromIndex < 0: "));
            return 0L;
        }
        t7q0 t7q0Var = this.a;
        if (t7q0Var == null) {
            return -1L;
        }
        long j3 = this.b;
        if (j3 - j < j) {
            while (j3 > j) {
                t7q0Var = t7q0Var.g;
                j3 -= t7q0Var.c - t7q0Var.b;
            }
            if (byteString.h() == 2) {
                byte m = byteString.m(0);
                byte m2 = byteString.m(1);
                while (j3 < this.b) {
                    byte[] bArr = t7q0Var.a;
                    int i = t7q0Var.c;
                    for (int i2 = (int) ((t7q0Var.b + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == m || b == m2) {
                            return (i2 - t7q0Var.b) + j3;
                        }
                    }
                    j3 += t7q0Var.c - t7q0Var.b;
                    t7q0Var = t7q0Var.f;
                    j = j3;
                }
            } else {
                byte[] l = byteString.l();
                while (j3 < this.b) {
                    byte[] bArr2 = t7q0Var.a;
                    int i3 = t7q0Var.c;
                    for (int i4 = (int) ((t7q0Var.b + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : l) {
                            if (b2 == b3) {
                                return (i4 - t7q0Var.b) + j3;
                            }
                        }
                    }
                    j3 += t7q0Var.c - t7q0Var.b;
                    t7q0Var = t7q0Var.f;
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = (t7q0Var.c - t7q0Var.b) + j2;
            if (j4 > j) {
                break;
            }
            t7q0Var = t7q0Var.f;
            j2 = j4;
        }
        if (byteString.h() == 2) {
            byte m3 = byteString.m(0);
            byte m4 = byteString.m(1);
            while (j2 < this.b) {
                byte[] bArr3 = t7q0Var.a;
                int i5 = t7q0Var.c;
                for (int i6 = (int) ((t7q0Var.b + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == m3 || b4 == m4) {
                        return (i6 - t7q0Var.b) + j2;
                    }
                }
                j2 += t7q0Var.c - t7q0Var.b;
                t7q0Var = t7q0Var.f;
                j = j2;
            }
        } else {
            byte[] l2 = byteString.l();
            while (j2 < this.b) {
                byte[] bArr4 = t7q0Var.a;
                int i7 = t7q0Var.c;
                for (int i8 = (int) ((t7q0Var.b + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : l2) {
                        if (b5 == b6) {
                            return (i8 - t7q0Var.b) + j2;
                        }
                    }
                }
                j2 += t7q0Var.c - t7q0Var.b;
                t7q0Var = t7q0Var.f;
                j = j2;
            }
        }
        return -1L;
    }

    @Override // defpackage.qq6
    public final byte[] p0() {
        return B(this.b);
    }

    @Override // defpackage.oq6
    public final /* bridge */ /* synthetic */ oq6 p1(String str) {
        x0(str);
        return this;
    }

    @Override // defpackage.qq6
    public final InputStream p2() {
        return new wp6(this, 0);
    }

    @Override // defpackage.qq6
    public final jci0 peek() {
        return new jci0(new rra0(this));
    }

    public final void q0(long j) {
        t7q0 a0 = a0(8);
        byte[] bArr = a0.a;
        int i = a0.c;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        a0.c = i + 8;
        this.b += 8;
    }

    public final int read(byte[] bArr, int i, int i2) {
        j.b(bArr.length, i, i2);
        t7q0 t7q0Var = this.a;
        if (t7q0Var == null) {
            return -1;
        }
        int min = Math.min(i2, t7q0Var.c - t7q0Var.b);
        byte[] bArr2 = t7q0Var.a;
        int i3 = t7q0Var.b;
        f73.e(bArr2, i, i3, bArr, i3 + min);
        int i4 = t7q0Var.b + min;
        t7q0Var.b = i4;
        this.b -= min;
        if (i4 == t7q0Var.c) {
            this.a = t7q0Var.a();
            p8q0.a(t7q0Var);
        }
        return min;
    }

    @Override // defpackage.qq6
    public final byte readByte() {
        long j = this.b;
        if (j == 0) {
            ny61.b();
            return (byte) 0;
        }
        t7q0 t7q0Var = this.a;
        int i = t7q0Var.b;
        int i2 = t7q0Var.c;
        int i3 = i + 1;
        byte b = t7q0Var.a[i];
        this.b = j - 1;
        if (i3 != i2) {
            t7q0Var.b = i3;
            return b;
        }
        this.a = t7q0Var.a();
        p8q0.a(t7q0Var);
        return b;
    }

    @Override // defpackage.qq6
    public final void readFully(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                ny61.b();
                return;
            }
            i += read;
        }
    }

    @Override // defpackage.qq6
    public final int readInt() {
        long j = this.b;
        if (j < 4) {
            ny61.b();
            return 0;
        }
        t7q0 t7q0Var = this.a;
        int i = t7q0Var.b;
        int i2 = t7q0Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = t7q0Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b = j - 4;
        if (i5 != i2) {
            t7q0Var.b = i5;
            return i6;
        }
        this.a = t7q0Var.a();
        p8q0.a(t7q0Var);
        return i6;
    }

    @Override // defpackage.qq6
    public final long readLong() {
        long j = this.b;
        if (j < 8) {
            ny61.b();
            return 0L;
        }
        t7q0 t7q0Var = this.a;
        int i = t7q0Var.b;
        int i2 = t7q0Var.c;
        if (i2 - i < 8) {
            return ((readInt() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & readInt());
        }
        byte[] bArr = t7q0Var.a;
        int i3 = i + 7;
        long j2 = ((bArr[i + 1] & 255) << 48) | ((bArr[i] & 255) << 56) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j3 = j2 | (bArr[i3] & 255);
        this.b = j - 8;
        if (i4 != i2) {
            t7q0Var.b = i4;
            return j3;
        }
        this.a = t7q0Var.a();
        p8q0.a(t7q0Var);
        return j3;
    }

    @Override // defpackage.qq6
    public final short readShort() {
        long j = this.b;
        if (j < 2) {
            ny61.b();
            return (short) 0;
        }
        t7q0 t7q0Var = this.a;
        int i = t7q0Var.b;
        int i2 = t7q0Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = t7q0Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b = j - 2;
        if (i5 == i2) {
            this.a = t7q0Var.a();
            p8q0.a(t7q0Var);
        } else {
            t7q0Var.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.qq6
    public final void skip(long j) {
        while (j > 0) {
            t7q0 t7q0Var = this.a;
            if (t7q0Var == null) {
                ny61.b();
                return;
            }
            int min = (int) Math.min(j, t7q0Var.c - t7q0Var.b);
            long j2 = min;
            this.b -= j2;
            j -= j2;
            int i = t7q0Var.b + min;
            t7q0Var.b = i;
            if (i == t7q0Var.c) {
                this.a = t7q0Var.a();
                p8q0.a(t7q0Var);
            }
        }
    }

    @Override // defpackage.oq6
    public final oq6 t0(int i) {
        n0(j.c(i));
        return this;
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return ydz0.d;
    }

    public final String toString() {
        return W().toString();
    }

    public final void u0(int i) {
        t7q0 a0 = a0(2);
        byte[] bArr = a0.a;
        int i2 = a0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        a0.c = i2 + 2;
        this.b += 2;
    }

    public final boolean v(int i, long j, ByteString byteString) {
        if (i >= 0 && j >= 0 && i + j <= this.b && i <= byteString.h()) {
            return i == 0 || b.a(this, byteString, j, j + 1, i) != -1;
        }
        return false;
    }

    public final void v0(String str, int i, int i2, Charset charset) {
        if (i < 0) {
            w511.f(oyr.i(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            w511.f(oyr.h(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            w511.n(b64.t(i2, "endIndex > string.length: ", " > "), str.length());
        } else if (charset.equals(uza.a)) {
            w0(i, i2, str);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            write(bytes, 0, bytes.length);
        }
    }

    public final a w(a aVar) {
        byte[] bArr = b.a;
        if (aVar == j.a) {
            aVar = new a();
        }
        if (aVar.a != null) {
            ny61.r("already attached to a buffer");
            return null;
        }
        aVar.a = this;
        aVar.b = true;
        return aVar;
    }

    public final void w0(int i, int i2, String str) {
        char charAt;
        if (i < 0) {
            w511.f(oyr.i(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            w511.f(oyr.h(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            w511.n(b64.t(i2, "endIndex > string.length: ", " > "), str.length());
            return;
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                t7q0 a0 = a0(1);
                byte[] bArr = a0.a;
                int i3 = a0.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = a0.c;
                int i6 = (i3 + i) - i5;
                a0.c = i5 + i6;
                this.b += i6;
            } else {
                if (charAt2 < 2048) {
                    t7q0 a02 = a0(2);
                    byte[] bArr2 = a02.a;
                    int i7 = a02.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    a02.c = i7 + 2;
                    this.b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    t7q0 a03 = a0(3);
                    byte[] bArr3 = a03.a;
                    int i8 = a03.c;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    a03.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        e0(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        t7q0 a04 = a0(4);
                        byte[] bArr4 = a04.a;
                        int i11 = a04.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        a04.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // defpackage.qq6
    public final String w1() {
        return j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
    }

    @Override // defpackage.uis0
    public final void write(yp6 yp6Var, long j) {
        t7q0 b;
        if (yp6Var == this) {
            ny61.g("source == this");
            return;
        }
        j.b(yp6Var.b, 0L, j);
        while (j > 0) {
            t7q0 t7q0Var = yp6Var.a;
            int i = t7q0Var.c - t7q0Var.b;
            if (j < i) {
                t7q0 t7q0Var2 = this.a;
                t7q0 t7q0Var3 = t7q0Var2 != null ? t7q0Var2.g : null;
                if (t7q0Var3 != null && t7q0Var3.e) {
                    if ((t7q0Var3.c + j) - (t7q0Var3.d ? 0 : t7q0Var3.b) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        t7q0Var.d(t7q0Var3, (int) j);
                        yp6Var.b -= j;
                        this.b += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    ny61.g("byteCount out of range");
                    return;
                }
                if (i2 >= 1024) {
                    b = t7q0Var.c();
                } else {
                    b = p8q0.b();
                    byte[] bArr = t7q0Var.a;
                    byte[] bArr2 = b.a;
                    int i3 = t7q0Var.b;
                    f73.i(bArr, bArr2, i3, i3 + i2);
                }
                b.c = b.b + i2;
                t7q0Var.b += i2;
                t7q0Var.g.b(b);
                yp6Var.a = b;
            }
            t7q0 t7q0Var4 = yp6Var.a;
            long j2 = t7q0Var4.c - t7q0Var4.b;
            yp6Var.a = t7q0Var4.a();
            t7q0 t7q0Var5 = this.a;
            if (t7q0Var5 == null) {
                this.a = t7q0Var4;
                t7q0Var4.g = t7q0Var4;
                t7q0Var4.f = t7q0Var4;
            } else {
                t7q0Var5.g.b(t7q0Var4);
                t7q0 t7q0Var6 = t7q0Var4.g;
                if (t7q0Var6 == t7q0Var4) {
                    ny61.r("cannot compact");
                    return;
                } else if (t7q0Var6.e) {
                    int i4 = t7q0Var4.c - t7q0Var4.b;
                    if (i4 <= (8192 - t7q0Var6.c) + (t7q0Var6.d ? 0 : t7q0Var6.b)) {
                        t7q0Var4.d(t7q0Var6, i4);
                        t7q0Var4.a();
                        p8q0.a(t7q0Var4);
                    }
                }
            }
            yp6Var.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    @Override // defpackage.oq6
    public final /* bridge */ /* synthetic */ oq6 writeByte(int i) {
        e0(i);
        return this;
    }

    @Override // defpackage.oq6
    public final /* bridge */ /* synthetic */ oq6 writeInt(int i) {
        n0(i);
        return this;
    }

    @Override // defpackage.oq6
    public final /* bridge */ /* synthetic */ oq6 writeShort(int i) {
        u0(i);
        return this;
    }

    public final void x0(String str) {
        w0(0, str.length(), str);
    }

    @Override // defpackage.qq6
    public final long y0(oq6 oq6Var) {
        long j = this.b;
        if (j > 0) {
            oq6Var.write(this, j);
        }
        return j;
    }

    public final void z0(int i) {
        if (i < 128) {
            e0(i);
            return;
        }
        if (i < 2048) {
            t7q0 a0 = a0(2);
            byte[] bArr = a0.a;
            int i2 = a0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            a0.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            e0(63);
            return;
        }
        if (i < 65536) {
            t7q0 a02 = a0(3);
            byte[] bArr2 = a02.a;
            int i3 = a02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            a02.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            ny61.g("Unexpected code point: 0x".concat(j.f(i)));
            return;
        }
        t7q0 a03 = a0(4);
        byte[] bArr3 = a03.a;
        int i4 = a03.c;
        bArr3[i4] = (byte) ((i >> 18) | PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        a03.c = i4 + 4;
        this.b += 4;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        t7q0 t7q0Var = this.a;
        if (t7q0Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), t7q0Var.c - t7q0Var.b);
        byteBuffer.put(t7q0Var.a, t7q0Var.b, min);
        int i = t7q0Var.b + min;
        t7q0Var.b = i;
        this.b -= min;
        if (i == t7q0Var.c) {
            this.a = t7q0Var.a();
            p8q0.a(t7q0Var);
        }
        return min;
    }

    @Override // defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            yp6Var.write(this, j);
            return j;
        }
        w511.f(qv10.j(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            t7q0 a0 = a0(1);
            int min = Math.min(i, 8192 - a0.c);
            byteBuffer.get(a0.a, a0.c, min);
            i -= min;
            a0.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    @Override // defpackage.oq6
    public final oq6 write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m968write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        long j = i2;
        j.b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            t7q0 a0 = a0(1);
            int min = Math.min(i3 - i, 8192 - a0.c);
            int i4 = i + min;
            f73.e(bArr, a0.c, i, a0.a, i4);
            a0.c += min;
            i = i4;
        }
        this.b += j;
    }
}
