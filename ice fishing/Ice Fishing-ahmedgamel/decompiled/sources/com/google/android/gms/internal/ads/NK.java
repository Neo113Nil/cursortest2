package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class NK extends OK {

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f26480v;

    /* renamed from: w, reason: collision with root package name */
    public final int f26481w;

    /* renamed from: x, reason: collision with root package name */
    public int f26482x;

    /* renamed from: y, reason: collision with root package name */
    public final OutputStream f26483y;

    public NK(OutputStream outputStream, int i) {
        this.f26483y = outputStream;
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i, 20);
        this.f26480v = new byte[max];
        this.f26481w = max;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void B1(int i, byte[] bArr) {
        I1(i);
        V1(bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void D1(AbstractC4263zK abstractC4263zK) {
        I1(((VK) abstractC4263zK).d(null));
        ((VK) abstractC4263zK).v(this);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void E1(byte b9) {
        if (this.f26482x == this.f26481w) {
            X1();
        }
        int i = this.f26482x;
        this.f26480v[i] = b9;
        this.f26482x = i + 1;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void G1(int i) {
        if (i >= 0) {
            I1(i);
        } else {
            N1(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void I1(int i) {
        W1(5);
        Y1(i);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void K1(int i) {
        W1(4);
        T1(i);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void N1(long j6) {
        W1(10);
        Q1(j6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void O1(long j6) {
        W1(8);
        U1(j6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void P1(String str) {
        int length = str.length() * 3;
        int S8 = OK.S(length);
        int i = S8 + length;
        int i6 = this.f26481w;
        if (i > i6) {
            byte[] bArr = new byte[length];
            int b9 = RL.b(bArr, 0, length, str);
            I1(b9);
            V1(bArr, 0, b9);
            return;
        }
        if (i > i6 - this.f26482x) {
            X1();
        }
        int S9 = OK.S(str.length());
        int i9 = this.f26482x;
        byte[] bArr2 = this.f26480v;
        try {
            if (S9 == S8) {
                int i10 = i9 + S9;
                this.f26482x = i10;
                int b10 = RL.b(bArr2, i10, i6 - i10, str);
                this.f26482x = i9;
                Y1((b10 - i9) - S9);
                this.f26482x = b10;
            } else {
                int i11 = RL.f27197a;
                int g4 = QC.g(str);
                Y1(g4);
                this.f26482x = RL.b(bArr2, this.f26482x, g4, str);
            }
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw new B1.z(e9);
        }
    }

    public final void Q1(long j6) {
        int i = this.f26482x;
        int i6 = i + 1;
        long j9 = j6 & (-128);
        int i9 = (int) j6;
        byte[] bArr = this.f26480v;
        if (j9 == 0) {
            bArr[i] = (byte) i9;
            this.f26482x = i6;
            return;
        }
        int i10 = i + 2;
        bArr[i] = (byte) (i9 | 128);
        long j10 = j6 >>> 7;
        long j11 = j10 & (-128);
        int i11 = (int) j10;
        if (j11 == 0) {
            bArr[i6] = (byte) i11;
            this.f26482x = i10;
            return;
        }
        int i12 = i + 3;
        bArr[i6] = (byte) (i11 | 128);
        long j12 = j6 >>> 14;
        long j13 = j12 & (-128);
        int i13 = (int) j12;
        if (j13 == 0) {
            bArr[i10] = (byte) i13;
            this.f26482x = i12;
            return;
        }
        int i14 = i + 4;
        bArr[i10] = (byte) (i13 | 128);
        long j14 = j6 >>> 21;
        long j15 = j14 & (-128);
        int i15 = (int) j14;
        if (j15 == 0) {
            bArr[i12] = (byte) i15;
            this.f26482x = i14;
            return;
        }
        int i16 = i + 5;
        bArr[i12] = (byte) (i15 | 128);
        long j16 = j6 >>> 28;
        long j17 = j16 & (-128);
        int i17 = (int) j16;
        if (j17 == 0) {
            bArr[i14] = (byte) i17;
            this.f26482x = i16;
            return;
        }
        int i18 = i + 6;
        bArr[i14] = (byte) (i17 | 128);
        long j18 = j6 >>> 35;
        long j19 = j18 & (-128);
        int i19 = (int) j18;
        if (j19 == 0) {
            bArr[i16] = (byte) i19;
            this.f26482x = i18;
            return;
        }
        int i20 = i + 7;
        bArr[i16] = (byte) (i19 | 128);
        long j20 = j6 >>> 42;
        long j21 = j20 & (-128);
        int i21 = (int) j20;
        if (j21 == 0) {
            bArr[i18] = (byte) i21;
            this.f26482x = i20;
            return;
        }
        int i22 = i + 8;
        bArr[i18] = (byte) (i21 | 128);
        long j22 = j6 >>> 49;
        long j23 = j22 & (-128);
        int i23 = (int) j22;
        if (j23 == 0) {
            bArr[i20] = (byte) i23;
            this.f26482x = i22;
            return;
        }
        int i24 = i + 9;
        bArr[i20] = (byte) (i23 | 128);
        long j24 = j6 >>> 56;
        int i25 = (int) j24;
        if ((j24 & (-128)) == 0) {
            bArr[i22] = (byte) i25;
            this.f26482x = i24;
        } else {
            bArr[i22] = (byte) (i25 | 128);
            bArr[i24] = (byte) (j6 >>> 63);
            this.f26482x = i + 10;
        }
    }

    public final void T1(int i) {
        int i6 = this.f26482x;
        byte[] bArr = this.f26480v;
        bArr[i6] = (byte) i;
        bArr[i6 + 1] = (byte) (i >> 8);
        bArr[i6 + 2] = (byte) (i >> 16);
        bArr[i6 + 3] = (byte) (i >> 24);
        this.f26482x = i6 + 4;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void U(byte[] bArr, int i, int i6) {
        V1(bArr, i, i6);
    }

    public final void U1(long j6) {
        int i = this.f26482x;
        byte[] bArr = this.f26480v;
        bArr[i] = (byte) j6;
        bArr[i + 1] = (byte) (j6 >> 8);
        bArr[i + 2] = (byte) (j6 >> 16);
        bArr[i + 3] = (byte) (j6 >> 24);
        bArr[i + 4] = (byte) (j6 >> 32);
        bArr[i + 5] = (byte) (j6 >> 40);
        bArr[i + 6] = (byte) (j6 >> 48);
        bArr[i + 7] = (byte) (j6 >> 56);
        this.f26482x = i + 8;
    }

    public final void V1(byte[] bArr, int i, int i6) {
        int i9 = this.f26482x;
        int i10 = this.f26481w;
        int i11 = i10 - i9;
        byte[] bArr2 = this.f26480v;
        if (i11 >= i6) {
            System.arraycopy(bArr, i, bArr2, i9, i6);
            this.f26482x += i6;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i9, i11);
        int i12 = i + i11;
        this.f26482x = i10;
        X1();
        int i13 = i6 - i11;
        if (i13 > i10) {
            this.f26483y.write(bArr, i12, i13);
        } else {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f26482x = i13;
        }
    }

    public final void W1(int i) {
        if (this.f26481w - this.f26482x < i) {
            X1();
        }
    }

    public final void X1() {
        this.f26483y.write(this.f26480v, 0, this.f26482x);
        this.f26482x = 0;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void Y(int i, int i6) {
        I1((i << 3) | i6);
    }

    public final void Y1(int i) {
        int i6 = this.f26482x;
        int i9 = i6 + 1;
        int i10 = i & (-128);
        byte[] bArr = this.f26480v;
        if (i10 == 0) {
            bArr[i6] = (byte) i;
            this.f26482x = i9;
            return;
        }
        int i11 = i6 + 2;
        bArr[i6] = (byte) (i | 128);
        int i12 = i >>> 7;
        if ((i12 & (-128)) == 0) {
            bArr[i9] = (byte) i12;
            this.f26482x = i11;
            return;
        }
        int i13 = i6 + 3;
        bArr[i9] = (byte) (i12 | 128);
        int i14 = i >>> 14;
        if ((i14 & (-128)) == 0) {
            bArr[i11] = (byte) i14;
            this.f26482x = i13;
            return;
        }
        int i15 = i6 + 4;
        bArr[i11] = (byte) (i14 | 128);
        int i16 = i >>> 21;
        if ((i16 & (-128)) == 0) {
            bArr[i13] = (byte) i16;
            this.f26482x = i15;
        } else {
            bArr[i13] = (byte) (i16 | 128);
            bArr[i15] = (byte) (i >>> 28);
            this.f26482x = i6 + 5;
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void b0(int i, int i6) {
        W1(20);
        Y1(i << 3);
        if (i6 >= 0) {
            Y1(i6);
        } else {
            Q1(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void e0(int i, int i6) {
        W1(20);
        Y1(i << 3);
        Y1(i6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int p0() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void p1(int i, int i6) {
        W1(14);
        Y1((i << 3) | 5);
        T1(i6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void q1(int i, long j6) {
        W1(20);
        Y1(i << 3);
        Q1(j6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void s1(int i, long j6) {
        W1(18);
        Y1((i << 3) | 1);
        U1(j6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void v1(int i, boolean z3) {
        W1(11);
        Y1(i << 3);
        int i6 = this.f26482x;
        this.f26480v[i6] = z3 ? (byte) 1 : (byte) 0;
        this.f26482x = i6 + 1;
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
