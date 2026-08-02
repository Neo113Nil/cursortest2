package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class vno {
    public final zi7 a;
    public final int b;
    public final d7k c;
    public yg3 d;
    public yg3 e;
    public yg3 f;
    public long g;

    public vno(zi7 zi7Var) {
        this.a = zi7Var;
        int i = zi7Var.b;
        this.b = i;
        this.c = new d7k(32);
        yg3 yg3Var = new yg3(0L, i);
        this.d = yg3Var;
        this.e = yg3Var;
        this.f = yg3Var;
    }

    public static yg3 d(yg3 yg3Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= yg3Var.b) {
            yg3Var = (yg3) yg3Var.d;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (yg3Var.b - j));
            l60 l60Var = (l60) yg3Var.c;
            byteBuffer.put(l60Var.a, ((int) (j - yg3Var.a)) + l60Var.b, min);
            i -= min;
            j += min;
            if (j == yg3Var.b) {
                yg3Var = (yg3) yg3Var.d;
            }
        }
        return yg3Var;
    }

    public static yg3 e(yg3 yg3Var, long j, byte[] bArr, int i) {
        while (j >= yg3Var.b) {
            yg3Var = (yg3) yg3Var.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (yg3Var.b - j));
            l60 l60Var = (l60) yg3Var.c;
            System.arraycopy(l60Var.a, ((int) (j - yg3Var.a)) + l60Var.b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == yg3Var.b) {
                yg3Var = (yg3) yg3Var.d;
            }
        }
        return yg3Var;
    }

    public static yg3 f(yg3 yg3Var, qg7 qg7Var, wx0 wx0Var, d7k d7kVar) {
        if (qg7Var.f(1073741824)) {
            long j = wx0Var.b;
            int i = 1;
            d7kVar.E(1);
            yg3 e = e(yg3Var, j, d7kVar.a, 1);
            long j2 = j + 1;
            byte b = d7kVar.a[0];
            boolean z = (b & 128) != 0;
            int i2 = b & Byte.MAX_VALUE;
            nv6 nv6Var = qg7Var.h;
            byte[] bArr = nv6Var.a;
            if (bArr == null) {
                nv6Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            yg3Var = e(e, j2, nv6Var.a, i2);
            long j3 = j2 + i2;
            if (z) {
                d7kVar.E(2);
                yg3Var = e(yg3Var, j3, d7kVar.a, 2);
                j3 += 2;
                i = d7kVar.B();
            }
            int[] iArr = nv6Var.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = nv6Var.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                d7kVar.E(i3);
                yg3Var = e(yg3Var, j3, d7kVar.a, i3);
                j3 += i3;
                d7kVar.H(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = d7kVar.B();
                    iArr2[i4] = d7kVar.z();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = wx0Var.a - ((int) (j3 - wx0Var.b));
            }
            zys zysVar = (zys) wx0Var.c;
            int i5 = dvt.a;
            byte[] bArr2 = zysVar.b;
            byte[] bArr3 = nv6Var.a;
            int i6 = zysVar.a;
            int i7 = zysVar.c;
            int i8 = zysVar.d;
            nv6Var.f = i;
            nv6Var.d = iArr;
            nv6Var.e = iArr2;
            nv6Var.b = bArr2;
            nv6Var.a = bArr3;
            nv6Var.c = i6;
            nv6Var.g = i7;
            nv6Var.h = i8;
            MediaCodec.CryptoInfo cryptoInfo = nv6Var.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i6;
            if (dvt.a >= 24) {
                le3 le3Var = nv6Var.j;
                le3Var.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) le3Var.b;
                pattern.set(i7, i8);
                ((MediaCodec.CryptoInfo) le3Var.a).setPattern(pattern);
            }
            long j4 = wx0Var.b;
            int i9 = (int) (j3 - j4);
            wx0Var.b = j4 + i9;
            wx0Var.a -= i9;
        }
        if (!qg7Var.f(268435456)) {
            qg7Var.B(wx0Var.a);
            return d(yg3Var, wx0Var.b, qg7Var.i, wx0Var.a);
        }
        d7kVar.E(4);
        yg3 e2 = e(yg3Var, wx0Var.b, d7kVar.a, 4);
        int z2 = d7kVar.z();
        wx0Var.b += 4;
        wx0Var.a -= 4;
        qg7Var.B(z2);
        yg3 d = d(e2, wx0Var.b, qg7Var.i, z2);
        wx0Var.b += z2;
        int i10 = wx0Var.a - z2;
        wx0Var.a = i10;
        ByteBuffer byteBuffer = qg7Var.l;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            qg7Var.l = ByteBuffer.allocate(i10);
        } else {
            qg7Var.l.clear();
        }
        return d(d, wx0Var.b, qg7Var.l, wx0Var.a);
    }

    public final void a(yg3 yg3Var) {
        if (((l60) yg3Var.c) == null) {
            return;
        }
        zi7 zi7Var = this.a;
        synchronized (zi7Var) {
            yg3 yg3Var2 = yg3Var;
            while (yg3Var2 != null) {
                try {
                    l60[] l60VarArr = zi7Var.f;
                    int i = zi7Var.e;
                    zi7Var.e = i + 1;
                    l60 l60Var = (l60) yg3Var2.c;
                    l60Var.getClass();
                    l60VarArr[i] = l60Var;
                    zi7Var.d--;
                    yg3Var2 = (yg3) yg3Var2.d;
                    if (yg3Var2 == null || ((l60) yg3Var2.c) == null) {
                        yg3Var2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zi7Var.notifyAll();
        }
        yg3Var.c = null;
        yg3Var.d = null;
    }

    public final void b(long j) {
        yg3 yg3Var;
        if (j == -1) {
            return;
        }
        while (true) {
            yg3Var = this.d;
            if (j < yg3Var.b) {
                break;
            }
            zi7 zi7Var = this.a;
            l60 l60Var = (l60) yg3Var.c;
            synchronized (zi7Var) {
                l60[] l60VarArr = zi7Var.f;
                int i = zi7Var.e;
                zi7Var.e = i + 1;
                l60VarArr[i] = l60Var;
                zi7Var.d--;
                zi7Var.notifyAll();
            }
            yg3 yg3Var2 = this.d;
            yg3Var2.c = null;
            yg3 yg3Var3 = (yg3) yg3Var2.d;
            yg3Var2.d = null;
            this.d = yg3Var3;
        }
        if (this.e.a < yg3Var.a) {
            this.e = yg3Var;
        }
    }

    public final int c(int i) {
        l60 l60Var;
        yg3 yg3Var = this.f;
        if (((l60) yg3Var.c) == null) {
            zi7 zi7Var = this.a;
            synchronized (zi7Var) {
                try {
                    int i2 = zi7Var.d + 1;
                    zi7Var.d = i2;
                    int i3 = zi7Var.e;
                    if (i3 > 0) {
                        l60[] l60VarArr = zi7Var.f;
                        int i4 = i3 - 1;
                        zi7Var.e = i4;
                        l60Var = l60VarArr[i4];
                        l60Var.getClass();
                        zi7Var.f[zi7Var.e] = null;
                    } else {
                        l60 l60Var2 = new l60(new byte[zi7Var.b], 0);
                        l60[] l60VarArr2 = zi7Var.f;
                        if (i2 > l60VarArr2.length) {
                            zi7Var.f = (l60[]) Arrays.copyOf(l60VarArr2, l60VarArr2.length * 2);
                        }
                        l60Var = l60Var2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            yg3 yg3Var2 = new yg3(this.f.b, this.b);
            yg3Var.c = l60Var;
            yg3Var.d = yg3Var2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
