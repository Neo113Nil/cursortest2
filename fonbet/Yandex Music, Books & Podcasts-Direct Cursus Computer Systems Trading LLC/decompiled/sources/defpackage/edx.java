package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class edx implements Closeable {
    public final ByteArrayInputStream a;
    public bdx b;
    public final byte[] c = new byte[8];
    public final kpm d = new kpm(27);

    public edx(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }

    public final long D() {
        bdx bdxVar = this.b;
        byte b = bdxVar.b;
        if (b < 24) {
            long j = b;
            this.b = null;
            return j;
        }
        if (b == 24) {
            int read = this.a.read();
            if (read != -1) {
                this.b = null;
                return read & 255;
            }
            xq0.v();
            return 0L;
        }
        byte[] bArr = this.c;
        if (b == 25) {
            N(2, bArr);
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (b == 26) {
            N(4, bArr);
            return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        if (b != 27) {
            kac.f(f1d.e(b, (bdxVar.a >> 5) & 7, "invalid additional information ", " for major type "));
            return 0L;
        }
        N(8, bArr);
        long j2 = bArr[0];
        long j3 = bArr[1];
        long j4 = bArr[2];
        long j5 = bArr[3];
        return ((bArr[6] & 255) << 8) | ((j5 & 255) << 32) | ((j3 & 255) << 48) | ((j2 & 255) << 56) | ((j4 & 255) << 40) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | (bArr[7] & 255);
    }

    public final void H() {
        o();
        byte b = this.b.b;
        if (b != 31) {
            return;
        }
        xq0.q(k5r.i(b, "expected definite length but found "));
    }

    public final void I(byte b) {
        o();
        byte b2 = this.b.a;
        if (b2 == b) {
            return;
        }
        xq0.q(f1d.e((b >> 5) & 7, (b2 >> 5) & 7, "expected major type ", " but found "));
    }

    public final void N(int i, byte[] bArr) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.a.read(bArr, i2, i - i2);
            if (read == -1) {
                xq0.v();
                return;
            }
            i2 += read;
        }
        this.b = null;
    }

    public final byte[] P() {
        H();
        long D = D();
        if (D < 0 || D > 2147483647L) {
            qq6.d("the maximum supported byte/text string length is 2147483647 bytes");
            return null;
        }
        if (this.a.available() < D) {
            xq0.v();
            return null;
        }
        int i = (int) D;
        byte[] bArr = new byte[i];
        N(i, bArr);
        return bArr;
    }

    public final long a() {
        I(Byte.MIN_VALUE);
        H();
        long D = D();
        if (D < 0) {
            qq6.d("the maximum supported array length is 9223372036854775807");
            return 0L;
        }
        if (D > 0) {
            ((ArrayDeque) this.d.b).push(Long.valueOf(D));
        }
        return D;
    }

    public final long b() {
        boolean z;
        o();
        byte b = this.b.a;
        if (b == 0) {
            z = true;
        } else {
            if (b != 32) {
                xq0.q(k5r.i((b >> 5) & 7, "expected major type 0 or 1 but found "));
                return 0L;
            }
            z = false;
        }
        long D = D();
        if (D >= 0) {
            return z ? D : ~D;
        }
        qq6.d("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.d.M();
    }

    public final long g() {
        I((byte) -96);
        H();
        long D = D();
        if (D < 0 || D > 4611686018427387903L) {
            qq6.d("the maximum supported map length is 4611686018427387903L");
            return 0L;
        }
        if (D > 0) {
            ((ArrayDeque) this.d.b).push(Long.valueOf(D + D));
        }
        return D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
    
        if (r0 != (-2)) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bdx o() {
        if (this.b == null) {
            int read = this.a.read();
            kpm kpmVar = this.d;
            if (read == -1) {
                kpmVar.M();
                return null;
            }
            bdx bdxVar = new bdx(read);
            this.b = bdxVar;
            long j = -2;
            byte b = bdxVar.a;
            if (b != Byte.MIN_VALUE && b != -96 && b != -64) {
                if (b != -32) {
                    if (b != 0 && b != 32) {
                        if (b == 64) {
                            kpmVar.N(-1L);
                        } else {
                            if (b != 96) {
                                xq0.q(k5r.i((b >> 5) & 7, "invalid major type: "));
                                return null;
                            }
                            kpmVar.N(-2L);
                        }
                        long P = kpmVar.P();
                        ArrayDeque arrayDeque = (ArrayDeque) kpmVar.b;
                        if (P == 1) {
                            arrayDeque.pop();
                        } else if (P > 1) {
                            arrayDeque.pop();
                            arrayDeque.push(Long.valueOf(P - 1));
                        } else if (P == -4) {
                            arrayDeque.pop();
                            arrayDeque.push(-5L);
                        } else if (P == -5) {
                            arrayDeque.pop();
                            arrayDeque.push(-4L);
                        }
                    }
                } else if (bdxVar.b == 31) {
                    long P2 = kpmVar.P();
                    if (P2 >= 0) {
                        kac.f(dfi.d(P2, "expected indefinite length scope but found "));
                        return null;
                    }
                    if (P2 == -5) {
                        kac.f("expected a value for dangling key in indefinite-length map");
                        return null;
                    }
                    ((ArrayDeque) kpmVar.b).pop();
                }
            }
            long P3 = kpmVar.P();
            if (P3 == -1) {
                j = P3;
            }
            kac.f(dfi.d(j, "expected non-string scope but found "));
            return null;
        }
        return this.b;
    }

    public final boolean z() {
        I((byte) -32);
        if (this.b.b > 24) {
            xq0.q("expected simple value");
            return false;
        }
        int D = (int) D();
        if (D == 20) {
            return false;
        }
        if (D == 21) {
            return true;
        }
        xq0.q("expected FALSE or TRUE");
        return false;
    }
}
