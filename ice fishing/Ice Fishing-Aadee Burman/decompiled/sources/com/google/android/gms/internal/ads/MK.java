package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class MK extends OK {

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f26289v;

    /* renamed from: w, reason: collision with root package name */
    public final int f26290w;

    /* renamed from: x, reason: collision with root package name */
    public int f26291x;

    public MK(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(u1.h.c(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f26289v = bArr;
        this.f26291x = 0;
        this.f26290w = i;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void B1(int i, byte[] bArr) {
        I1(i);
        Q1(bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void D1(AbstractC4263zK abstractC4263zK) {
        I1(((VK) abstractC4263zK).d(null));
        ((VK) abstractC4263zK).v(this);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void E1(byte b9) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.f26291x;
        try {
            int i6 = i + 1;
            try {
                this.f26289v[i] = b9;
                this.f26291x = i6;
            } catch (IndexOutOfBoundsException e9) {
                indexOutOfBoundsException = e9;
                i = i6;
                throw new B1.z(i, this.f26290w, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e10) {
            indexOutOfBoundsException = e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void G1(int i) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        if (i >= 0) {
            I1(i);
            return;
        }
        int i6 = this.f26291x;
        try {
            byte[] bArr = this.f26289v;
            long j6 = i;
            int i9 = i6 + 1;
            try {
                bArr[i6] = (byte) (((int) j6) | 128);
                int i10 = i6 + 2;
                try {
                    bArr[i9] = (byte) (((int) (j6 >>> 7)) | 128);
                    int i11 = i6 + 3;
                    bArr[i10] = (byte) (((int) (j6 >>> 14)) | 128);
                    i10 = i6 + 4;
                    bArr[i11] = (byte) (((int) (j6 >>> 21)) | 128);
                    int i12 = i6 + 5;
                    bArr[i10] = (byte) (((int) (j6 >>> 28)) | 128);
                    int i13 = i6 + 6;
                    try {
                        bArr[i12] = -1;
                        int i14 = i6 + 7;
                        bArr[i13] = -1;
                        i13 = i6 + 8;
                        bArr[i14] = -1;
                        i9 = i6 + 9;
                        bArr[i13] = -1;
                        i6 += 10;
                        bArr[i9] = 1;
                        this.f26291x = i6;
                    } catch (IndexOutOfBoundsException e9) {
                        indexOutOfBoundsException = e9;
                        i6 = i13;
                        throw new B1.z(i6, this.f26290w, 10, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i6 = i10;
                }
            } catch (IndexOutOfBoundsException e11) {
                i6 = i9;
                indexOutOfBoundsException = e11;
            }
        } catch (IndexOutOfBoundsException e12) {
            indexOutOfBoundsException = e12;
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void I1(int i) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i6 = this.f26291x;
        int i9 = i & (-128);
        byte[] bArr = this.f26289v;
        try {
            if (i9 == 0) {
                int i10 = i6 + 1;
                bArr[i6] = (byte) i;
                this.f26291x = i10;
                return;
            }
            int i11 = i6 + 1;
            bArr[i6] = (byte) (i | 128);
            int i12 = i >>> 7;
            try {
                if ((i12 & (-128)) == 0) {
                    int i13 = i6 + 2;
                    bArr[i11] = (byte) i12;
                    this.f26291x = i13;
                    return;
                }
                int i14 = i6 + 2;
                try {
                    bArr[i11] = (byte) (i12 | 128);
                    int i15 = i >>> 14;
                    if ((i15 & (-128)) == 0) {
                        int i16 = i6 + 3;
                        bArr[i14] = (byte) i15;
                        this.f26291x = i16;
                        return;
                    }
                    int i17 = i6 + 3;
                    try {
                        bArr[i14] = (byte) (i15 | 128);
                        int i18 = i >>> 21;
                        if ((i18 & (-128)) == 0) {
                            int i19 = i6 + 4;
                            bArr[i17] = (byte) i18;
                            this.f26291x = i19;
                        } else {
                            i14 = i6 + 4;
                            bArr[i17] = (byte) (i18 | 128);
                            int i20 = i6 + 5;
                            bArr[i14] = (byte) (i >>> 28);
                            this.f26291x = i20;
                        }
                    } catch (IndexOutOfBoundsException e9) {
                        indexOutOfBoundsException = e9;
                        i9 = i17;
                        throw new B1.z(i9, this.f26290w, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i9 = i14;
                }
            } catch (IndexOutOfBoundsException e11) {
                i9 = i;
                indexOutOfBoundsException = e11;
            }
        } catch (IndexOutOfBoundsException e12) {
            indexOutOfBoundsException = e12;
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void K1(int i) {
        int i6 = this.f26291x;
        try {
            byte[] bArr = this.f26289v;
            bArr[i6] = (byte) i;
            bArr[i6 + 1] = (byte) (i >> 8);
            bArr[i6 + 2] = (byte) (i >> 16);
            bArr[i6 + 3] = (byte) (i >> 24);
            this.f26291x = i6 + 4;
        } catch (IndexOutOfBoundsException e9) {
            throw new B1.z(i6, this.f26290w, 4, e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void N1(long j6) {
        long j9 = j6 & (-128);
        int i = this.f26291x;
        byte[] bArr = this.f26289v;
        try {
            if (j9 == 0) {
                bArr[i] = (byte) j6;
                this.f26291x = i + 1;
                return;
            }
            bArr[i] = (byte) (((int) j6) | 128);
            int i6 = i + 1;
            long j10 = j6 >>> 7;
            long j11 = j10 & (-128);
            int i9 = (int) j10;
            if (j11 == 0) {
                bArr[i6] = (byte) i9;
                this.f26291x = i + 2;
                return;
            }
            bArr[i6] = (byte) (i9 | 128);
            int i10 = i + 2;
            long j12 = j6 >>> 14;
            long j13 = j12 & (-128);
            int i11 = (int) j12;
            if (j13 == 0) {
                bArr[i10] = (byte) i11;
                this.f26291x = i + 3;
                return;
            }
            bArr[i10] = (byte) (i11 | 128);
            int i12 = i + 3;
            long j14 = j6 >>> 21;
            long j15 = j14 & (-128);
            int i13 = (int) j14;
            if (j15 == 0) {
                bArr[i12] = (byte) i13;
                this.f26291x = i + 4;
                return;
            }
            bArr[i12] = (byte) (i13 | 128);
            int i14 = i + 4;
            long j16 = j6 >>> 28;
            long j17 = j16 & (-128);
            int i15 = (int) j16;
            if (j17 == 0) {
                bArr[i14] = (byte) i15;
                this.f26291x = i + 5;
                return;
            }
            bArr[i14] = (byte) (i15 | 128);
            int i16 = i + 5;
            long j18 = j6 >>> 35;
            long j19 = j18 & (-128);
            int i17 = (int) j18;
            if (j19 == 0) {
                bArr[i16] = (byte) i17;
                this.f26291x = i + 6;
                return;
            }
            bArr[i16] = (byte) (i17 | 128);
            int i18 = i + 6;
            long j20 = j6 >>> 42;
            long j21 = j20 & (-128);
            int i19 = (int) j20;
            if (j21 == 0) {
                bArr[i18] = (byte) i19;
                this.f26291x = i + 7;
                return;
            }
            bArr[i18] = (byte) (i19 | 128);
            int i20 = i + 7;
            long j22 = j6 >>> 49;
            long j23 = j22 & (-128);
            int i21 = (int) j22;
            if (j23 == 0) {
                bArr[i20] = (byte) i21;
                this.f26291x = i + 8;
                return;
            }
            bArr[i20] = (byte) (i21 | 128);
            int i22 = i + 8;
            long j24 = j6 >>> 56;
            int i23 = (int) j24;
            if (((-128) & j24) == 0) {
                bArr[i22] = (byte) i23;
                this.f26291x = i + 9;
            } else {
                bArr[i22] = (byte) (i23 | 128);
                bArr[i + 9] = (byte) (j6 >>> 63);
                this.f26291x = i + 10;
            }
        } catch (IndexOutOfBoundsException e9) {
            throw new B1.z(i, this.f26290w, 1, e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void O1(long j6) {
        int i = this.f26291x;
        try {
            byte[] bArr = this.f26289v;
            bArr[i] = (byte) j6;
            bArr[i + 1] = (byte) (j6 >> 8);
            bArr[i + 2] = (byte) (j6 >> 16);
            bArr[i + 3] = (byte) (j6 >> 24);
            bArr[i + 4] = (byte) (j6 >> 32);
            bArr[i + 5] = (byte) (j6 >> 40);
            bArr[i + 6] = (byte) (j6 >> 48);
            bArr[i + 7] = (byte) (j6 >> 56);
            this.f26291x = i + 8;
        } catch (IndexOutOfBoundsException e9) {
            throw new B1.z(i, this.f26290w, 8, e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void P1(String str) {
        int i = this.f26291x;
        try {
            int S8 = OK.S(str.length() * 3);
            int S9 = OK.S(str.length());
            byte[] bArr = this.f26289v;
            if (S9 != S8) {
                int i6 = RL.f27197a;
                I1(QC.g(str));
                int i9 = this.f26291x;
                this.f26291x = RL.b(bArr, i9, bArr.length - i9, str);
                return;
            }
            int i10 = i + S9;
            this.f26291x = i10;
            int b9 = RL.b(bArr, i10, bArr.length - i10, str);
            this.f26291x = i;
            I1((b9 - i) - S9);
            this.f26291x = b9;
        } catch (IndexOutOfBoundsException e9) {
            throw new B1.z(e9);
        }
    }

    public final void Q1(byte[] bArr, int i, int i6) {
        try {
            System.arraycopy(bArr, i, this.f26289v, this.f26291x, i6);
            this.f26291x += i6;
        } catch (IndexOutOfBoundsException e9) {
            throw new B1.z(this.f26291x, this.f26290w, i6, e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void U(byte[] bArr, int i, int i6) {
        Q1(bArr, i, i6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void Y(int i, int i6) {
        I1((i << 3) | i6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void b0(int i, int i6) {
        I1(i << 3);
        G1(i6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void e0(int i, int i6) {
        I1(i << 3);
        I1(i6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int p0() {
        return this.f26290w - this.f26291x;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void p1(int i, int i6) {
        I1((i << 3) | 5);
        K1(i6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void q1(int i, long j6) {
        I1(i << 3);
        N1(j6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void s1(int i, long j6) {
        I1((i << 3) | 1);
        O1(j6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void v1(int i, boolean z3) {
        I1(i << 3);
        E1(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void x1(int i, String str) {
        I1((i << 3) | 2);
        P1(str);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void y1(int i, JK jk) {
        I1((i << 3) | 2);
        z1(jk);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void z1(JK jk) {
        I1(jk.f());
        jk.k(this);
    }
}
