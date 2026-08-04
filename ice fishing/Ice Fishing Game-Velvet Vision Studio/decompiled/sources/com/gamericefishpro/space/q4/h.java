package com.gamericefishpro.space.q4;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.gamericefishpro.space.d4.o0 {
    public int A;
    public int B;
    public int C = Integer.MAX_VALUE;
    public final FileInputStream i;
    public final byte[] v;
    public int w;
    public int y;
    public int z;

    public h(FileInputStream fileInputStream) {
        Charset charset = u.a;
        this.i = fileInputStream;
        this.v = new byte[4096];
        this.w = 0;
        this.z = 0;
        this.B = 0;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int A() {
        return J();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final long B() {
        return K();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final boolean C(int i) throws w {
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
                return false;
            }
            if (i2 != 5) {
                throw w.b();
            }
            O(4);
            return true;
        }
        int i4 = this.w - this.z;
        byte[] bArr = this.v;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.z;
                this.z = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw w.c();
        }
        while (i3 < 10) {
            if (this.z == this.w) {
                N(1);
            }
            int i6 = this.z;
            this.z = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw w.c();
        return true;
    }

    public final byte[] E(int i) throws IOException {
        byte[] bArrF = F(i);
        if (bArrF != null) {
            return bArrF;
        }
        int i2 = this.z;
        int i3 = this.w;
        int length = i3 - i2;
        this.B += i3;
        this.z = 0;
        this.w = 0;
        ArrayList arrayListG = G(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.v, i2, bArr, 0, length);
        int size = arrayListG.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListG.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i) throws IOException {
        if (i == 0) {
            return u.b;
        }
        if (i < 0) {
            throw w.d();
        }
        int i2 = this.B;
        int i3 = this.z;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new w("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.C;
        if (i4 > i5) {
            O((i5 - i2) - i3);
            throw w.e();
        }
        int i6 = this.w - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.i;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (w e) {
                e.d = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.v, this.z, bArr, 0, i6);
        this.B += this.w;
        this.z = 0;
        this.w = 0;
        while (i6 < i) {
            try {
                int i8 = fileInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw w.e();
                }
                this.B += i8;
                i6 += i8;
            } catch (w e2) {
                e2.d = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList G(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.i.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw w.e();
                }
                this.B += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() throws w {
        int i = this.z;
        if (this.w - i < 4) {
            N(4);
            i = this.z;
        }
        this.z = i + 4;
        byte[] bArr = this.v;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long I() throws w {
        int i = this.z;
        if (this.w - i < 8) {
            N(8);
            i = this.z;
        }
        this.z = i + 8;
        byte[] bArr = this.v;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int J() {
        int i;
        int i2 = this.z;
        int i3 = this.w;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.v;
            byte b = bArr[i2];
            if (b >= 0) {
                this.z = i4;
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
                this.z = i5;
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
        int i = this.z;
        int i2 = this.w;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.v;
            byte b = bArr[i];
            if (b >= 0) {
                this.z = i3;
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
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
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
                this.z = i4;
                return j;
            }
        }
        return L();
    }

    public final long L() throws w {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.z == this.w) {
                N(1);
            }
            int i2 = this.z;
            this.z = i2 + 1;
            byte b = this.v[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw w.c();
    }

    public final void M() {
        int i = this.w + this.y;
        this.w = i;
        int i2 = this.B + i;
        int i3 = this.C;
        if (i2 <= i3) {
            this.y = 0;
            return;
        }
        int i4 = i2 - i3;
        this.y = i4;
        this.w = i - i4;
    }

    public final void N(int i) throws w {
        if (P(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.B) - this.z) {
            throw w.e();
        }
        throw new w("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void O(int i) throws w {
        int i2 = this.w;
        int i3 = this.z;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.z = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.i;
        if (i < 0) {
            throw w.d();
        }
        int i5 = this.B;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.C;
        if (i7 > i8) {
            O((i8 - i5) - i3);
            throw w.e();
        }
        this.B = i6;
        this.w = 0;
        this.z = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (w e) {
                    e.d = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.B += i4;
                M();
                throw th;
            }
        }
        this.B += i4;
        M();
        if (i4 >= i) {
            return;
        }
        int i9 = this.w;
        int i10 = i9 - this.z;
        this.z = i9;
        N(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.w;
            if (i11 <= i12) {
                this.z = i11;
                return;
            } else {
                i10 += i12;
                this.z = i12;
                N(1);
            }
        }
    }

    public final boolean P(int i) throws IOException {
        FileInputStream fileInputStream = this.i;
        int i2 = this.z;
        int i3 = i2 + i;
        int i4 = this.w;
        if (i3 <= i4) {
            throw new IllegalStateException(com.gamericefishpro.space.t0.y0.f(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.B;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.C) {
            byte[] bArr = this.v;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.B += i2;
                this.w -= i2;
                this.z = 0;
            }
            int i6 = this.w;
            try {
                int i7 = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.B) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.w += i7;
                    M();
                    if (this.w >= i) {
                        return true;
                    }
                    return P(i);
                }
            } catch (w e) {
                e.d = true;
                throw e;
            }
        }
        return false;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final void a(int i) throws w {
        if (this.A != i) {
            throw new w("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int b() {
        return this.B + this.z;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final boolean c() {
        return this.z == this.w && !P(1);
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final void h(int i) {
        this.C = i;
        M();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int i(int i) throws w {
        if (i < 0) {
            throw w.d();
        }
        int i2 = this.B + this.z + i;
        if (i2 < 0) {
            throw new w("Failed to parse the message.");
        }
        int i3 = this.C;
        if (i2 > i3) {
            throw w.e();
        }
        this.C = i2;
        M();
        return i3;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final boolean j() {
        return K() != 0;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final f k() throws IOException {
        int iJ = J();
        int i = this.w;
        int i2 = this.z;
        int i3 = i - i2;
        byte[] bArr = this.v;
        if (iJ <= i3 && iJ > 0) {
            f fVarD = f.d(bArr, i2, iJ);
            this.z += iJ;
            return fVarD;
        }
        if (iJ == 0) {
            return f.i;
        }
        if (iJ < 0) {
            throw w.d();
        }
        byte[] bArrF = F(iJ);
        if (bArrF != null) {
            return f.d(bArrF, 0, bArrF.length);
        }
        int i4 = this.z;
        int i5 = this.w;
        int length = i5 - i4;
        this.B += i5;
        this.z = 0;
        this.w = 0;
        ArrayList arrayListG = G(iJ - length);
        byte[] bArr2 = new byte[iJ];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = arrayListG.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListG.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        f fVar = f.i;
        return new f(bArr2);
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final double m() {
        return Double.longBitsToDouble(I());
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int n() {
        return J();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int o() {
        return H();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final long p() {
        return I();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final float q() {
        return Float.intBitsToFloat(H());
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int r() {
        return J();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final long s() {
        return K();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int t() {
        return H();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final long u() {
        return I();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int v() {
        int iJ = J();
        return (-(iJ & 1)) ^ (iJ >>> 1);
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final long w() {
        long jK = K();
        return (-(jK & 1)) ^ (jK >>> 1);
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final String x() throws w {
        int iJ = J();
        byte[] bArr = this.v;
        if (iJ > 0) {
            int i = this.w;
            int i2 = this.z;
            if (iJ <= i - i2) {
                String str = new String(bArr, i2, iJ, u.a);
                this.z += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw w.d();
        }
        if (iJ > this.w) {
            return new String(E(iJ), u.a);
        }
        N(iJ);
        String str2 = new String(bArr, this.z, iJ, u.a);
        this.z += iJ;
        return str2;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final String y() throws IOException {
        int iJ = J();
        int i = this.z;
        int i2 = this.w;
        int i3 = i2 - i;
        byte[] bArrE = this.v;
        if (iJ <= i3 && iJ > 0) {
            this.z = i + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw w.d();
            }
            i = 0;
            if (iJ <= i2) {
                N(iJ);
                this.z = iJ;
            } else {
                bArrE = E(iJ);
            }
        }
        return h1.a.m(bArrE, i, iJ);
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int z() throws w {
        if (c()) {
            this.A = 0;
            return 0;
        }
        int iJ = J();
        this.A = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new w("Protocol message contained an invalid tag (zero).");
    }
}
