package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes10.dex */
public final class qyl0 {
    public final au1 a;
    public final int b;
    public final ef90 c;
    public zer d;
    public zer e;
    public zer f;
    public long g;

    public qyl0(au1 au1Var) {
        this.a = au1Var;
        int i = ((k4h) au1Var).b;
        this.b = i;
        this.c = new ef90(32);
        zer zerVar = new zer(0L, i);
        this.d = zerVar;
        this.e = zerVar;
        this.f = zerVar;
    }

    public static zer d(zer zerVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= zerVar.b) {
            zerVar = (zer) zerVar.w;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (zerVar.b - j));
            zt1 zt1Var = (zt1) zerVar.c;
            byteBuffer.put(zt1Var.a, ((int) (j - zerVar.a)) + zt1Var.b, min);
            i -= min;
            j += min;
            if (j == zerVar.b) {
                zerVar = (zer) zerVar.w;
            }
        }
        return zerVar;
    }

    public static zer e(zer zerVar, long j, byte[] bArr, int i) {
        while (j >= zerVar.b) {
            zerVar = (zer) zerVar.w;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zerVar.b - j));
            zt1 zt1Var = (zt1) zerVar.c;
            System.arraycopy(zt1Var.a, ((int) (j - zerVar.a)) + zt1Var.b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zerVar.b) {
                zerVar = (zer) zerVar.w;
            }
        }
        return zerVar;
    }

    public static zer f(zer zerVar, nyg nygVar, os7 os7Var, ef90 ef90Var) {
        if (nygVar.b(1073741824)) {
            long j = os7Var.b;
            int i = 1;
            ef90Var.H(1);
            zer e = e(zerVar, j, ef90Var.a, 1);
            long j2 = j + 1;
            byte b = ef90Var.a[0];
            boolean z = (b & DerValue.TAG_CONTEXT) != 0;
            int i2 = b & Byte.MAX_VALUE;
            ucf ucfVar = nygVar.c;
            byte[] bArr = ucfVar.a;
            if (bArr == null) {
                ucfVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            zerVar = e(e, j2, ucfVar.a, i2);
            long j3 = j2 + i2;
            if (z) {
                ef90Var.H(2);
                zerVar = e(zerVar, j3, ef90Var.a, 2);
                j3 += 2;
                i = ef90Var.E();
            }
            int[] iArr = ucfVar.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = ucfVar.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                ef90Var.H(i3);
                zerVar = e(zerVar, j3, ef90Var.a, i3);
                j3 += i3;
                ef90Var.K(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = ef90Var.E();
                    iArr2[i4] = ef90Var.C();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = os7Var.a - ((int) (j3 - os7Var.b));
            }
            f001 f001Var = (f001) os7Var.c;
            int i5 = tw21.a;
            byte[] bArr2 = f001Var.b;
            byte[] bArr3 = ucfVar.a;
            int i6 = f001Var.a;
            int i7 = f001Var.c;
            int i8 = f001Var.d;
            ucfVar.f = i;
            ucfVar.d = iArr;
            ucfVar.e = iArr2;
            ucfVar.b = bArr2;
            ucfVar.a = bArr3;
            ucfVar.c = i6;
            ucfVar.g = i7;
            ucfVar.h = i8;
            MediaCodec.CryptoInfo cryptoInfo = ucfVar.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i6;
            if (tw21.a >= 24) {
                tcf tcfVar = ucfVar.j;
                tcfVar.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = tcfVar.b;
                pattern.set(i7, i8);
                tcfVar.a.setPattern(pattern);
            }
            long j4 = os7Var.b;
            int i9 = (int) (j3 - j4);
            os7Var.b = j4 + i9;
            os7Var.a -= i9;
        }
        if (!nygVar.b(SelfTester_JCP.IMITA)) {
            nygVar.f(os7Var.a);
            return d(zerVar, os7Var.b, nygVar.w, os7Var.a);
        }
        ef90Var.H(4);
        zer e2 = e(zerVar, os7Var.b, ef90Var.a, 4);
        int C = ef90Var.C();
        os7Var.b += 4;
        os7Var.a -= 4;
        nygVar.f(C);
        zer d = d(e2, os7Var.b, nygVar.w, C);
        os7Var.b += C;
        int i10 = os7Var.a - C;
        os7Var.a = i10;
        ByteBuffer byteBuffer = nygVar.z;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            nygVar.z = ByteBuffer.allocate(i10);
        } else {
            nygVar.z.clear();
        }
        return d(d, os7Var.b, nygVar.z, os7Var.a);
    }

    public final void a(zer zerVar) {
        if (((zt1) zerVar.c) == null) {
            return;
        }
        k4h k4hVar = (k4h) this.a;
        synchronized (k4hVar) {
            zer zerVar2 = zerVar;
            while (zerVar2 != null) {
                try {
                    zt1[] zt1VarArr = k4hVar.f;
                    int i = k4hVar.e;
                    k4hVar.e = i + 1;
                    zt1 zt1Var = (zt1) zerVar2.c;
                    zt1Var.getClass();
                    zt1VarArr[i] = zt1Var;
                    k4hVar.d--;
                    zerVar2 = (zer) zerVar2.w;
                    if (zerVar2 == null || ((zt1) zerVar2.c) == null) {
                        zerVar2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            k4hVar.notifyAll();
        }
        zerVar.c = null;
        zerVar.w = null;
    }

    public final void b(long j) {
        zer zerVar;
        if (j == -1) {
            return;
        }
        while (true) {
            zerVar = this.d;
            if (j < zerVar.b) {
                break;
            }
            au1 au1Var = this.a;
            zt1 zt1Var = (zt1) zerVar.c;
            k4h k4hVar = (k4h) au1Var;
            synchronized (k4hVar) {
                zt1[] zt1VarArr = k4hVar.f;
                int i = k4hVar.e;
                k4hVar.e = i + 1;
                zt1VarArr[i] = zt1Var;
                k4hVar.d--;
                k4hVar.notifyAll();
            }
            zer zerVar2 = this.d;
            zerVar2.c = null;
            zer zerVar3 = (zer) zerVar2.w;
            zerVar2.w = null;
            this.d = zerVar3;
        }
        if (this.e.a < zerVar.a) {
            this.e = zerVar;
        }
    }

    public final int c(int i) {
        zt1 zt1Var;
        zer zerVar = this.f;
        if (((zt1) zerVar.c) == null) {
            k4h k4hVar = (k4h) this.a;
            synchronized (k4hVar) {
                try {
                    int i2 = k4hVar.d + 1;
                    k4hVar.d = i2;
                    int i3 = k4hVar.e;
                    if (i3 > 0) {
                        zt1[] zt1VarArr = k4hVar.f;
                        int i4 = i3 - 1;
                        k4hVar.e = i4;
                        zt1Var = zt1VarArr[i4];
                        zt1Var.getClass();
                        k4hVar.f[k4hVar.e] = null;
                    } else {
                        zt1 zt1Var2 = new zt1(new byte[k4hVar.b], 0);
                        zt1[] zt1VarArr2 = k4hVar.f;
                        if (i2 > zt1VarArr2.length) {
                            k4hVar.f = (zt1[]) Arrays.copyOf(zt1VarArr2, zt1VarArr2.length * 2);
                        }
                        zt1Var = zt1Var2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zer zerVar2 = new zer(this.f.b, this.b);
            zerVar.c = zt1Var;
            zerVar.w = zerVar2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
