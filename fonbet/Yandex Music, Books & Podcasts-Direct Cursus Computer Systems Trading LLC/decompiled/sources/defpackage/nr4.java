package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class nr4 extends qr4 {
    public final InputStream e;
    public final byte[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l = Integer.MAX_VALUE;

    public nr4(InputStream inputStream) {
        use.a(inputStream, "input");
        this.e = inputStream;
        this.f = new byte[4096];
        this.g = 0;
        this.i = 0;
        this.k = 0;
    }

    @Override // defpackage.qr4
    public final int A() {
        return J();
    }

    @Override // defpackage.qr4
    public final long B() {
        return K();
    }

    @Override // defpackage.qr4
    public final boolean C(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                O(8);
                return true;
            }
            if (i2 == 2) {
                O(J());
                return true;
            }
            if (i2 == 3) {
                D();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.b == 0) {
                    a(0);
                }
                return false;
            }
            if (i2 != 5) {
                throw bye.d();
            }
            O(4);
            return true;
        }
        int i4 = this.g - this.i;
        byte[] bArr = this.f;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.i;
                this.i = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw bye.e();
        }
        while (i3 < 10) {
            if (this.i == this.g) {
                N(1);
            }
            int i6 = this.i;
            this.i = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw bye.e();
        return true;
    }

    public final byte[] E(int i) {
        byte[] F = F(i);
        if (F != null) {
            return F;
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i3 - i2;
        this.k += i3;
        this.i = 0;
        this.g = 0;
        ArrayList G = G(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, i2, bArr, 0, i4);
        Iterator it = G.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i) {
        if (i == 0) {
            return use.b;
        }
        if (i < 0) {
            throw bye.f();
        }
        int i2 = this.k;
        int i3 = this.i;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new bye("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.l;
        if (i4 > i5) {
            O((i5 - i2) - i3);
            throw bye.h();
        }
        int i6 = this.g - i3;
        int i7 = i - i6;
        InputStream inputStream = this.e;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (bye e) {
                e.a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, this.i, bArr, 0, i6);
        this.k += this.g;
        this.i = 0;
        this.g = 0;
        while (i6 < i) {
            try {
                int read = inputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw bye.h();
                }
                this.k += read;
                i6 += read;
            } catch (bye e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList G(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.e.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw bye.h();
                }
                this.k += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() {
        int i = this.i;
        if (this.g - i < 4) {
            N(4);
            i = this.i;
        }
        this.i = i + 4;
        byte[] bArr = this.f;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long I() {
        int i = this.i;
        if (this.g - i < 8) {
            N(8);
            i = this.i;
        }
        this.i = i + 8;
        byte[] bArr = this.f;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final int J() {
        int i;
        int i2 = this.i;
        int i3 = this.g;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f;
            byte b = bArr[i2];
            if (b >= 0) {
                this.i = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.i = i5;
                return i;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.i;
        int i2 = this.g;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f;
            byte b = bArr[i];
            if (b >= 0) {
                this.i = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.i = i4;
                return j;
            }
        }
        return L();
    }

    public final long L() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.i == this.g) {
                N(1);
            }
            int i2 = this.i;
            this.i = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f[i2] & 128) == 0) {
                return j;
            }
        }
        throw bye.e();
    }

    public final void M() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = this.k + i;
        int i3 = this.l;
        if (i2 <= i3) {
            this.h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.h = i4;
        this.g = i - i4;
    }

    public final void N(int i) {
        if (P(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.k) - this.i) {
            throw bye.h();
        }
        throw new bye("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final void O(int i) {
        int i2 = this.g;
        int i3 = this.i;
        if (i <= i2 - i3 && i >= 0) {
            this.i = i3 + i;
            return;
        }
        InputStream inputStream = this.e;
        if (i < 0) {
            throw bye.f();
        }
        int i4 = this.k;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.l;
        if (i6 > i7) {
            O((i7 - i4) - i3);
            throw bye.h();
        }
        this.k = i5;
        int i8 = i2 - i3;
        this.g = 0;
        this.i = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long skip = inputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i8 += (int) skip;
                    }
                } catch (bye e) {
                    e.a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.k += i8;
                M();
                throw th;
            }
        }
        this.k += i8;
        M();
        if (i8 >= i) {
            return;
        }
        int i9 = this.g;
        int i10 = i9 - this.i;
        this.i = i9;
        N(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.g;
            if (i11 <= i12) {
                this.i = i11;
                return;
            } else {
                i10 += i12;
                this.i = i12;
                N(1);
            }
        }
    }

    public final boolean P(int i) {
        InputStream inputStream = this.e;
        int i2 = this.i;
        int i3 = i2 + i;
        int i4 = this.g;
        if (i3 <= i4) {
            xq0.q(dfi.c(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.k;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.l) {
            byte[] bArr = this.f;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.k += i2;
                this.g -= i2;
                this.i = 0;
            }
            int i6 = this.g;
            try {
                int read = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.k) - i6));
                if (read == 0 || read < -1 || read > bArr.length) {
                    jj4.e(read, inputStream.getClass());
                    return false;
                }
                if (read > 0) {
                    this.g += read;
                    M();
                    if (this.g >= i || P(i)) {
                        return true;
                    }
                }
            } catch (bye e) {
                e.a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.qr4
    public final void a(int i) {
        if (this.j != i) {
            throw bye.a();
        }
    }

    @Override // defpackage.qr4
    public final int d() {
        return this.k + this.i;
    }

    @Override // defpackage.qr4
    public final boolean e() {
        return this.i == this.g && !P(1);
    }

    @Override // defpackage.qr4
    public final void h(int i) {
        this.l = i;
        M();
    }

    @Override // defpackage.qr4
    public final int i(int i) {
        if (i < 0) {
            throw bye.f();
        }
        int i2 = this.k + this.i + i;
        if (i2 < 0) {
            throw new bye("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.l;
        if (i2 > i3) {
            throw bye.h();
        }
        this.l = i2;
        M();
        return i3;
    }

    @Override // defpackage.qr4
    public final boolean j() {
        return K() != 0;
    }

    @Override // defpackage.qr4
    public final kn3 k() {
        int J = J();
        int i = this.g;
        int i2 = this.i;
        int i3 = i - i2;
        byte[] bArr = this.f;
        if (J <= i3 && J > 0) {
            kn3 n = nn3.n(bArr, i2, J);
            this.i += J;
            return n;
        }
        if (J == 0) {
            return nn3.b;
        }
        if (J < 0) {
            throw bye.f();
        }
        byte[] F = F(J);
        if (F != null) {
            return nn3.n(F, 0, F.length);
        }
        int i4 = this.i;
        int i5 = this.g;
        int i6 = i5 - i4;
        this.k += i5;
        this.i = 0;
        this.g = 0;
        ArrayList G = G(J - i6);
        byte[] bArr2 = new byte[J];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        Iterator it = G.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        kn3 kn3Var = nn3.b;
        return new kn3(bArr2);
    }

    @Override // defpackage.qr4
    public final double l() {
        return Double.longBitsToDouble(I());
    }

    @Override // defpackage.qr4
    public final int m() {
        return J();
    }

    @Override // defpackage.qr4
    public final int n() {
        return H();
    }

    @Override // defpackage.qr4
    public final long o() {
        return I();
    }

    @Override // defpackage.qr4
    public final float p() {
        return Float.intBitsToFloat(H());
    }

    @Override // defpackage.qr4
    public final int q() {
        return J();
    }

    @Override // defpackage.qr4
    public final long r() {
        return K();
    }

    @Override // defpackage.qr4
    public final int t() {
        return H();
    }

    @Override // defpackage.qr4
    public final long u() {
        return I();
    }

    @Override // defpackage.qr4
    public final int v() {
        return qr4.b(J());
    }

    @Override // defpackage.qr4
    public final long w() {
        return qr4.c(K());
    }

    @Override // defpackage.qr4
    public final String x() {
        int J = J();
        byte[] bArr = this.f;
        if (J > 0) {
            int i = this.g;
            int i2 = this.i;
            if (J <= i - i2) {
                String str = new String(bArr, i2, J, use.a);
                this.i += J;
                return str;
            }
        }
        if (J == 0) {
            return "";
        }
        if (J < 0) {
            throw bye.f();
        }
        if (J > this.g) {
            return new String(E(J), use.a);
        }
        N(J);
        String str2 = new String(bArr, this.i, J, use.a);
        this.i += J;
        return str2;
    }

    @Override // defpackage.qr4
    public final String y() {
        int J = J();
        int i = this.i;
        int i2 = this.g;
        int i3 = i2 - i;
        byte[] bArr = this.f;
        if (J <= i3 && J > 0) {
            this.i = i + J;
        } else {
            if (J == 0) {
                return "";
            }
            if (J < 0) {
                throw bye.f();
            }
            i = 0;
            if (J <= i2) {
                N(J);
                this.i = J;
            } else {
                bArr = E(J);
            }
        }
        return nut.a.y(bArr, i, J);
    }

    @Override // defpackage.qr4
    public final int z() {
        if (e()) {
            this.j = 0;
            return 0;
        }
        int J = J();
        this.j = J;
        if ((J >>> 3) != 0) {
            return J;
        }
        throw bye.b();
    }
}
