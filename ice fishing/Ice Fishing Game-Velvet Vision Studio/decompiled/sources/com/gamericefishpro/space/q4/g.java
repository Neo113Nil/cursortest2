package com.gamericefishpro.space.q4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.gamericefishpro.space.d4.o0 {
    public int A;
    public int B = Integer.MAX_VALUE;
    public final byte[] i;
    public int v;
    public int w;
    public int y;
    public final int z;

    public g(byte[] bArr, int i, int i2, boolean z) {
        this.i = bArr;
        this.v = i2 + i;
        this.y = i;
        this.z = i;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int A() {
        return G();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final long B() {
        return H();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final boolean C(int i) throws w {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                K(8);
                return true;
            }
            if (i2 == 2) {
                K(G());
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
            K(4);
            return true;
        }
        int i4 = this.v - this.y;
        byte[] bArr = this.i;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.y;
                this.y = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw w.c();
        }
        while (i3 < 10) {
            int i6 = this.y;
            if (i6 == this.v) {
                throw w.e();
            }
            this.y = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw w.c();
        return true;
    }

    public final int E() throws w {
        int i = this.y;
        if (this.v - i < 4) {
            throw w.e();
        }
        this.y = i + 4;
        byte[] bArr = this.i;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long F() throws w {
        int i = this.y;
        if (this.v - i < 8) {
            throw w.e();
        }
        this.y = i + 8;
        byte[] bArr = this.i;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int G() {
        int i;
        int i2 = this.y;
        int i3 = this.v;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.i;
            byte b = bArr[i2];
            if (b >= 0) {
                this.y = i4;
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
                this.y = i5;
                return i;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.y;
        int i2 = this.v;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.i;
            byte b = bArr[i];
            if (b >= 0) {
                this.y = i3;
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
                this.y = i4;
                return j;
            }
        }
        return I();
    }

    public final long I() throws w {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.y;
            if (i2 == this.v) {
                throw w.e();
            }
            this.y = i2 + 1;
            byte b = this.i[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw w.c();
    }

    public final void J() {
        int i = this.v + this.w;
        this.v = i;
        int i2 = i - this.z;
        int i3 = this.B;
        if (i2 <= i3) {
            this.w = 0;
            return;
        }
        int i4 = i2 - i3;
        this.w = i4;
        this.v = i - i4;
    }

    public final void K(int i) throws w {
        if (i >= 0) {
            int i2 = this.v;
            int i3 = this.y;
            if (i <= i2 - i3) {
                this.y = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw w.e();
        }
        throw w.d();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final void a(int i) throws w {
        if (this.A != i) {
            throw new w("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int b() {
        return this.y - this.z;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final boolean c() {
        return this.y == this.v;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final void h(int i) {
        this.B = i;
        J();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int i(int i) throws w {
        if (i < 0) {
            throw w.d();
        }
        int iB = b() + i;
        if (iB < 0) {
            throw new w("Failed to parse the message.");
        }
        int i2 = this.B;
        if (iB > i2) {
            throw w.e();
        }
        this.B = iB;
        J();
        return i2;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final boolean j() {
        return H() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // com.gamericefishpro.space.d4.o0
    public final f k() throws w {
        byte[] bArrCopyOfRange;
        int iG = G();
        byte[] bArr = this.i;
        if (iG > 0) {
            int i = this.v;
            int i2 = this.y;
            if (iG <= i - i2) {
                f fVarD = f.d(bArr, i2, iG);
                this.y += iG;
                return fVarD;
            }
        }
        if (iG == 0) {
            return f.i;
        }
        if (iG > 0) {
            int i3 = this.v;
            int i4 = this.y;
            if (iG <= i3 - i4) {
                int i5 = iG + i4;
                this.y = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iG <= 0) {
                    throw w.e();
                }
                if (iG == 0) {
                    throw w.d();
                }
                bArrCopyOfRange = u.b;
            }
        } else {
            if (iG <= 0) {
                throw w.e();
            }
            if (iG == 0) {
                throw w.d();
            }
            bArrCopyOfRange = u.b;
        }
        f fVar = f.i;
        return new f(bArrCopyOfRange);
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final double m() {
        return Double.longBitsToDouble(F());
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int n() {
        return G();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int o() {
        return E();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final long p() {
        return F();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final float q() {
        return Float.intBitsToFloat(E());
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int r() {
        return G();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final long s() {
        return H();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int t() {
        return E();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final long u() {
        return F();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int v() {
        int iG = G();
        return (-(iG & 1)) ^ (iG >>> 1);
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final long w() {
        long jH = H();
        return (-(jH & 1)) ^ (jH >>> 1);
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final String x() throws w {
        int iG = G();
        if (iG > 0) {
            int i = this.v;
            int i2 = this.y;
            if (iG <= i - i2) {
                String str = new String(this.i, i2, iG, u.a);
                this.y += iG;
                return str;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG < 0) {
            throw w.d();
        }
        throw w.e();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final String y() throws w {
        int iG = G();
        if (iG > 0) {
            int i = this.v;
            int i2 = this.y;
            if (iG <= i - i2) {
                String strM = h1.a.m(this.i, i2, iG);
                this.y += iG;
                return strM;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG <= 0) {
            throw w.d();
        }
        throw w.e();
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final int z() throws w {
        if (c()) {
            this.A = 0;
            return 0;
        }
        int iG = G();
        this.A = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw new w("Protocol message contained an invalid tag (zero).");
    }
}
