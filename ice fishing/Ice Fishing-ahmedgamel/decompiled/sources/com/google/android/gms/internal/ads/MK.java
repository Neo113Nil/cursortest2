package com.google.android.gms.internal.ads;

import java.util.Locale;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class MK extends OK {

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f27080v;

    /* renamed from: w, reason: collision with root package name */
    public final int f27081w;

    /* renamed from: x, reason: collision with root package name */
    public int f27082x;

    public MK(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC5128c.c(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f27080v = bArr;
        this.f27082x = 0;
        this.f27081w = i;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void B1(int i, byte[] bArr) {
        J1(i);
        R1(bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void D1(AbstractC4286zK abstractC4286zK) {
        J1(((VK) abstractC4286zK).d(null));
        ((VK) abstractC4286zK).v(this);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void E1(byte b9) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.f27082x;
        try {
            int i4 = i + 1;
            try {
                this.f27080v[i] = b9;
                this.f27082x = i4;
            } catch (IndexOutOfBoundsException e9) {
                indexOutOfBoundsException = e9;
                i = i4;
                throw new D1.y(i, this.f27081w, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e10) {
            indexOutOfBoundsException = e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void H1(int i) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        if (i >= 0) {
            J1(i);
            return;
        }
        int i4 = this.f27082x;
        try {
            byte[] bArr = this.f27080v;
            long j6 = i;
            int i6 = i4 + 1;
            try {
                bArr[i4] = (byte) (((int) j6) | 128);
                int i9 = i4 + 2;
                try {
                    bArr[i6] = (byte) (((int) (j6 >>> 7)) | 128);
                    int i10 = i4 + 3;
                    bArr[i9] = (byte) (((int) (j6 >>> 14)) | 128);
                    i9 = i4 + 4;
                    bArr[i10] = (byte) (((int) (j6 >>> 21)) | 128);
                    int i11 = i4 + 5;
                    bArr[i9] = (byte) (((int) (j6 >>> 28)) | 128);
                    int i12 = i4 + 6;
                    try {
                        bArr[i11] = -1;
                        int i13 = i4 + 7;
                        bArr[i12] = -1;
                        i12 = i4 + 8;
                        bArr[i13] = -1;
                        i6 = i4 + 9;
                        bArr[i12] = -1;
                        i4 += 10;
                        bArr[i6] = 1;
                        this.f27082x = i4;
                    } catch (IndexOutOfBoundsException e9) {
                        indexOutOfBoundsException = e9;
                        i4 = i12;
                        throw new D1.y(i4, this.f27081w, 10, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i4 = i9;
                }
            } catch (IndexOutOfBoundsException e11) {
                i4 = i6;
                indexOutOfBoundsException = e11;
            }
        } catch (IndexOutOfBoundsException e12) {
            indexOutOfBoundsException = e12;
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void J1(int i) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i4 = this.f27082x;
        int i6 = i & (-128);
        byte[] bArr = this.f27080v;
        try {
            if (i6 == 0) {
                int i9 = i4 + 1;
                bArr[i4] = (byte) i;
                this.f27082x = i9;
                return;
            }
            int i10 = i4 + 1;
            bArr[i4] = (byte) (i | 128);
            int i11 = i >>> 7;
            try {
                if ((i11 & (-128)) == 0) {
                    int i12 = i4 + 2;
                    bArr[i10] = (byte) i11;
                    this.f27082x = i12;
                    return;
                }
                int i13 = i4 + 2;
                try {
                    bArr[i10] = (byte) (i11 | 128);
                    int i14 = i >>> 14;
                    if ((i14 & (-128)) == 0) {
                        int i15 = i4 + 3;
                        bArr[i13] = (byte) i14;
                        this.f27082x = i15;
                        return;
                    }
                    int i16 = i4 + 3;
                    try {
                        bArr[i13] = (byte) (i14 | 128);
                        int i17 = i >>> 21;
                        if ((i17 & (-128)) == 0) {
                            int i18 = i4 + 4;
                            bArr[i16] = (byte) i17;
                            this.f27082x = i18;
                        } else {
                            i13 = i4 + 4;
                            bArr[i16] = (byte) (i17 | 128);
                            int i19 = i4 + 5;
                            bArr[i13] = (byte) (i >>> 28);
                            this.f27082x = i19;
                        }
                    } catch (IndexOutOfBoundsException e9) {
                        indexOutOfBoundsException = e9;
                        i6 = i16;
                        throw new D1.y(i6, this.f27081w, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i6 = i13;
                }
            } catch (IndexOutOfBoundsException e11) {
                i6 = i;
                indexOutOfBoundsException = e11;
            }
        } catch (IndexOutOfBoundsException e12) {
            indexOutOfBoundsException = e12;
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void L1(int i) {
        int i4 = this.f27082x;
        try {
            byte[] bArr = this.f27080v;
            bArr[i4] = (byte) i;
            bArr[i4 + 1] = (byte) (i >> 8);
            bArr[i4 + 2] = (byte) (i >> 16);
            bArr[i4 + 3] = (byte) (i >> 24);
            this.f27082x = i4 + 4;
        } catch (IndexOutOfBoundsException e9) {
            throw new D1.y(i4, this.f27081w, 4, e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void N1(long j6) {
        long j9 = j6 & (-128);
        int i = this.f27082x;
        byte[] bArr = this.f27080v;
        try {
            if (j9 == 0) {
                bArr[i] = (byte) j6;
                this.f27082x = i + 1;
                return;
            }
            bArr[i] = (byte) (((int) j6) | 128);
            int i4 = i + 1;
            long j10 = j6 >>> 7;
            long j11 = j10 & (-128);
            int i6 = (int) j10;
            if (j11 == 0) {
                bArr[i4] = (byte) i6;
                this.f27082x = i + 2;
                return;
            }
            bArr[i4] = (byte) (i6 | 128);
            int i9 = i + 2;
            long j12 = j6 >>> 14;
            long j13 = j12 & (-128);
            int i10 = (int) j12;
            if (j13 == 0) {
                bArr[i9] = (byte) i10;
                this.f27082x = i + 3;
                return;
            }
            bArr[i9] = (byte) (i10 | 128);
            int i11 = i + 3;
            long j14 = j6 >>> 21;
            long j15 = j14 & (-128);
            int i12 = (int) j14;
            if (j15 == 0) {
                bArr[i11] = (byte) i12;
                this.f27082x = i + 4;
                return;
            }
            bArr[i11] = (byte) (i12 | 128);
            int i13 = i + 4;
            long j16 = j6 >>> 28;
            long j17 = j16 & (-128);
            int i14 = (int) j16;
            if (j17 == 0) {
                bArr[i13] = (byte) i14;
                this.f27082x = i + 5;
                return;
            }
            bArr[i13] = (byte) (i14 | 128);
            int i15 = i + 5;
            long j18 = j6 >>> 35;
            long j19 = j18 & (-128);
            int i16 = (int) j18;
            if (j19 == 0) {
                bArr[i15] = (byte) i16;
                this.f27082x = i + 6;
                return;
            }
            bArr[i15] = (byte) (i16 | 128);
            int i17 = i + 6;
            long j20 = j6 >>> 42;
            long j21 = j20 & (-128);
            int i18 = (int) j20;
            if (j21 == 0) {
                bArr[i17] = (byte) i18;
                this.f27082x = i + 7;
                return;
            }
            bArr[i17] = (byte) (i18 | 128);
            int i19 = i + 7;
            long j22 = j6 >>> 49;
            long j23 = j22 & (-128);
            int i20 = (int) j22;
            if (j23 == 0) {
                bArr[i19] = (byte) i20;
                this.f27082x = i + 8;
                return;
            }
            bArr[i19] = (byte) (i20 | 128);
            int i21 = i + 8;
            long j24 = j6 >>> 56;
            int i22 = (int) j24;
            if (((-128) & j24) == 0) {
                bArr[i21] = (byte) i22;
                this.f27082x = i + 9;
            } else {
                bArr[i21] = (byte) (i22 | 128);
                bArr[i + 9] = (byte) (j6 >>> 63);
                this.f27082x = i + 10;
            }
        } catch (IndexOutOfBoundsException e9) {
            throw new D1.y(i, this.f27081w, 1, e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void O1(long j6) {
        int i = this.f27082x;
        try {
            byte[] bArr = this.f27080v;
            bArr[i] = (byte) j6;
            bArr[i + 1] = (byte) (j6 >> 8);
            bArr[i + 2] = (byte) (j6 >> 16);
            bArr[i + 3] = (byte) (j6 >> 24);
            bArr[i + 4] = (byte) (j6 >> 32);
            bArr[i + 5] = (byte) (j6 >> 40);
            bArr[i + 6] = (byte) (j6 >> 48);
            bArr[i + 7] = (byte) (j6 >> 56);
            this.f27082x = i + 8;
        } catch (IndexOutOfBoundsException e9) {
            throw new D1.y(i, this.f27081w, 8, e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void P1(String str) {
        int i = this.f27082x;
        try {
            int S8 = OK.S(str.length() * 3);
            int S9 = OK.S(str.length());
            byte[] bArr = this.f27080v;
            if (S9 != S8) {
                int i4 = RL.f27953a;
                J1(QC.g(str));
                int i6 = this.f27082x;
                this.f27082x = RL.b(bArr, i6, bArr.length - i6, str);
                return;
            }
            int i9 = i + S9;
            this.f27082x = i9;
            int b9 = RL.b(bArr, i9, bArr.length - i9, str);
            this.f27082x = i;
            J1((b9 - i) - S9);
            this.f27082x = b9;
        } catch (IndexOutOfBoundsException e9) {
            throw new D1.y(e9);
        }
    }

    public final void R1(byte[] bArr, int i, int i4) {
        try {
            System.arraycopy(bArr, i, this.f27080v, this.f27082x, i4);
            this.f27082x += i4;
        } catch (IndexOutOfBoundsException e9) {
            throw new D1.y(this.f27082x, this.f27081w, i4, e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void U(byte[] bArr, int i, int i4) {
        R1(bArr, i, i4);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void Y(int i, int i4) {
        J1((i << 3) | i4);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void b0(int i, int i4) {
        J1(i << 3);
        H1(i4);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void e0(int i, int i4) {
        J1(i << 3);
        J1(i4);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int o0() {
        return this.f27081w - this.f27082x;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void p1(int i, int i4) {
        J1((i << 3) | 5);
        L1(i4);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void q1(int i, long j6) {
        J1(i << 3);
        N1(j6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void t1(int i, long j6) {
        J1((i << 3) | 1);
        O1(j6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void v1(int i, boolean z6) {
        J1(i << 3);
        E1(z6 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void x1(int i, String str) {
        J1((i << 3) | 2);
        P1(str);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void y1(int i, JK jk) {
        J1((i << 3) | 2);
        z1(jk);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void z1(JK jk) {
        J1(jk.f());
        jk.k(this);
    }
}
