package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class lr4 extends qr4 {
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public final int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public lr4(byte[] bArr, int i, int i2, boolean z) {
        this.e = bArr;
        this.f = i2 + i;
        this.h = i;
        this.i = i;
    }

    @Override // defpackage.qr4
    public final int A() {
        return G();
    }

    @Override // defpackage.qr4
    public final long B() {
        return H();
    }

    @Override // defpackage.qr4
    public final boolean C(int i) {
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
                if (this.b == 0) {
                    a(0);
                }
                return false;
            }
            if (i2 != 5) {
                throw bye.d();
            }
            K(4);
            return true;
        }
        int i4 = this.f - this.h;
        byte[] bArr = this.e;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.h;
                this.h = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw bye.e();
        }
        while (i3 < 10) {
            int i6 = this.h;
            if (i6 == this.f) {
                throw bye.h();
            }
            this.h = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw bye.e();
        return true;
    }

    public final int E() {
        int i = this.h;
        if (this.f - i < 4) {
            throw bye.h();
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long F() {
        int i = this.h;
        if (this.f - i < 8) {
            throw bye.h();
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final int G() {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
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
                this.h = i5;
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
        int i = this.h;
        int i2 = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.e;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
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
                this.h = i4;
                return j;
            }
        }
        return I();
    }

    public final long I() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.h;
            if (i2 == this.f) {
                throw bye.h();
            }
            this.h = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.e[i2] & 128) == 0) {
                return j;
            }
        }
        throw bye.e();
    }

    public final void J() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = i - this.i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }

    public final void K(int i) {
        if (i >= 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3) {
                this.h = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw bye.h();
        }
        throw bye.f();
    }

    @Override // defpackage.qr4
    public final void a(int i) {
        if (this.j != i) {
            throw bye.a();
        }
    }

    @Override // defpackage.qr4
    public final int d() {
        return this.h - this.i;
    }

    @Override // defpackage.qr4
    public final boolean e() {
        return this.h == this.f;
    }

    @Override // defpackage.qr4
    public final void h(int i) {
        this.k = i;
        J();
    }

    @Override // defpackage.qr4
    public final int i(int i) {
        if (i < 0) {
            throw bye.f();
        }
        int d = d() + i;
        if (d < 0) {
            throw new bye("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i2 = this.k;
        if (d > i2) {
            throw bye.h();
        }
        this.k = d;
        J();
        return i2;
    }

    @Override // defpackage.qr4
    public final boolean j() {
        return H() != 0;
    }

    @Override // defpackage.qr4
    public final kn3 k() {
        byte[] bArr;
        int G = G();
        byte[] bArr2 = this.e;
        if (G > 0) {
            int i = this.f;
            int i2 = this.h;
            if (G <= i - i2) {
                kn3 n = nn3.n(bArr2, i2, G);
                this.h += G;
                return n;
            }
        }
        if (G == 0) {
            return nn3.b;
        }
        if (G > 0) {
            int i3 = this.f;
            int i4 = this.h;
            if (G <= i3 - i4) {
                int i5 = G + i4;
                this.h = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                kn3 kn3Var = nn3.b;
                return new kn3(bArr);
            }
        }
        if (G > 0) {
            throw bye.h();
        }
        if (G != 0) {
            throw bye.f();
        }
        bArr = use.b;
        kn3 kn3Var2 = nn3.b;
        return new kn3(bArr);
    }

    @Override // defpackage.qr4
    public final double l() {
        return Double.longBitsToDouble(F());
    }

    @Override // defpackage.qr4
    public final int m() {
        return G();
    }

    @Override // defpackage.qr4
    public final int n() {
        return E();
    }

    @Override // defpackage.qr4
    public final long o() {
        return F();
    }

    @Override // defpackage.qr4
    public final float p() {
        return Float.intBitsToFloat(E());
    }

    @Override // defpackage.qr4
    public final int q() {
        return G();
    }

    @Override // defpackage.qr4
    public final long r() {
        return H();
    }

    @Override // defpackage.qr4
    public final int t() {
        return E();
    }

    @Override // defpackage.qr4
    public final long u() {
        return F();
    }

    @Override // defpackage.qr4
    public final int v() {
        return qr4.b(G());
    }

    @Override // defpackage.qr4
    public final long w() {
        return qr4.c(H());
    }

    @Override // defpackage.qr4
    public final String x() {
        int G = G();
        if (G > 0) {
            int i = this.f;
            int i2 = this.h;
            if (G <= i - i2) {
                String str = new String(this.e, i2, G, use.a);
                this.h += G;
                return str;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G < 0) {
            throw bye.f();
        }
        throw bye.h();
    }

    @Override // defpackage.qr4
    public final String y() {
        int G = G();
        if (G > 0) {
            int i = this.f;
            int i2 = this.h;
            if (G <= i - i2) {
                String y = nut.a.y(this.e, i2, G);
                this.h += G;
                return y;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G <= 0) {
            throw bye.f();
        }
        throw bye.h();
    }

    @Override // defpackage.qr4
    public final int z() {
        if (e()) {
            this.j = 0;
            return 0;
        }
        int G = G();
        this.j = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        throw bye.b();
    }
}
