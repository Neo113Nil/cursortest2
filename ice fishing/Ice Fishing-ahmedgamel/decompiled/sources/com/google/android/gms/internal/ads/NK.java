package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class NK extends OK {

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f27264v;

    /* renamed from: w, reason: collision with root package name */
    public final int f27265w;

    /* renamed from: x, reason: collision with root package name */
    public int f27266x;

    /* renamed from: y, reason: collision with root package name */
    public final OutputStream f27267y;

    public NK(OutputStream outputStream, int i) {
        this.f27267y = outputStream;
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i, 20);
        this.f27264v = new byte[max];
        this.f27265w = max;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void B1(int i, byte[] bArr) {
        J1(i);
        V1(bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void D1(AbstractC4286zK abstractC4286zK) {
        J1(((VK) abstractC4286zK).d(null));
        ((VK) abstractC4286zK).v(this);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void E1(byte b9) {
        if (this.f27266x == this.f27265w) {
            X1();
        }
        int i = this.f27266x;
        this.f27264v[i] = b9;
        this.f27266x = i + 1;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void H1(int i) {
        if (i >= 0) {
            J1(i);
        } else {
            N1(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void J1(int i) {
        W1(5);
        Y1(i);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void L1(int i) {
        W1(4);
        T1(i);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void N1(long j6) {
        W1(10);
        R1(j6);
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
        int i4 = this.f27265w;
        if (i > i4) {
            byte[] bArr = new byte[length];
            int b9 = RL.b(bArr, 0, length, str);
            J1(b9);
            V1(bArr, 0, b9);
            return;
        }
        if (i > i4 - this.f27266x) {
            X1();
        }
        int S9 = OK.S(str.length());
        int i6 = this.f27266x;
        byte[] bArr2 = this.f27264v;
        try {
            if (S9 == S8) {
                int i9 = i6 + S9;
                this.f27266x = i9;
                int b10 = RL.b(bArr2, i9, i4 - i9, str);
                this.f27266x = i6;
                Y1((b10 - i6) - S9);
                this.f27266x = b10;
            } else {
                int i10 = RL.f27953a;
                int g9 = QC.g(str);
                Y1(g9);
                this.f27266x = RL.b(bArr2, this.f27266x, g9, str);
            }
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw new D1.y(e9);
        }
    }

    public final void R1(long j6) {
        int i = this.f27266x;
        int i4 = i + 1;
        long j9 = j6 & (-128);
        int i6 = (int) j6;
        byte[] bArr = this.f27264v;
        if (j9 == 0) {
            bArr[i] = (byte) i6;
            this.f27266x = i4;
            return;
        }
        int i9 = i + 2;
        bArr[i] = (byte) (i6 | 128);
        long j10 = j6 >>> 7;
        long j11 = j10 & (-128);
        int i10 = (int) j10;
        if (j11 == 0) {
            bArr[i4] = (byte) i10;
            this.f27266x = i9;
            return;
        }
        int i11 = i + 3;
        bArr[i4] = (byte) (i10 | 128);
        long j12 = j6 >>> 14;
        long j13 = j12 & (-128);
        int i12 = (int) j12;
        if (j13 == 0) {
            bArr[i9] = (byte) i12;
            this.f27266x = i11;
            return;
        }
        int i13 = i + 4;
        bArr[i9] = (byte) (i12 | 128);
        long j14 = j6 >>> 21;
        long j15 = j14 & (-128);
        int i14 = (int) j14;
        if (j15 == 0) {
            bArr[i11] = (byte) i14;
            this.f27266x = i13;
            return;
        }
        int i15 = i + 5;
        bArr[i11] = (byte) (i14 | 128);
        long j16 = j6 >>> 28;
        long j17 = j16 & (-128);
        int i16 = (int) j16;
        if (j17 == 0) {
            bArr[i13] = (byte) i16;
            this.f27266x = i15;
            return;
        }
        int i17 = i + 6;
        bArr[i13] = (byte) (i16 | 128);
        long j18 = j6 >>> 35;
        long j19 = j18 & (-128);
        int i18 = (int) j18;
        if (j19 == 0) {
            bArr[i15] = (byte) i18;
            this.f27266x = i17;
            return;
        }
        int i19 = i + 7;
        bArr[i15] = (byte) (i18 | 128);
        long j20 = j6 >>> 42;
        long j21 = j20 & (-128);
        int i20 = (int) j20;
        if (j21 == 0) {
            bArr[i17] = (byte) i20;
            this.f27266x = i19;
            return;
        }
        int i21 = i + 8;
        bArr[i17] = (byte) (i20 | 128);
        long j22 = j6 >>> 49;
        long j23 = j22 & (-128);
        int i22 = (int) j22;
        if (j23 == 0) {
            bArr[i19] = (byte) i22;
            this.f27266x = i21;
            return;
        }
        int i23 = i + 9;
        bArr[i19] = (byte) (i22 | 128);
        long j24 = j6 >>> 56;
        int i24 = (int) j24;
        if ((j24 & (-128)) == 0) {
            bArr[i21] = (byte) i24;
            this.f27266x = i23;
        } else {
            bArr[i21] = (byte) (i24 | 128);
            bArr[i23] = (byte) (j6 >>> 63);
            this.f27266x = i + 10;
        }
    }

    public final void T1(int i) {
        int i4 = this.f27266x;
        byte[] bArr = this.f27264v;
        bArr[i4] = (byte) i;
        bArr[i4 + 1] = (byte) (i >> 8);
        bArr[i4 + 2] = (byte) (i >> 16);
        bArr[i4 + 3] = (byte) (i >> 24);
        this.f27266x = i4 + 4;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void U(byte[] bArr, int i, int i4) {
        V1(bArr, i, i4);
    }

    public final void U1(long j6) {
        int i = this.f27266x;
        byte[] bArr = this.f27264v;
        bArr[i] = (byte) j6;
        bArr[i + 1] = (byte) (j6 >> 8);
        bArr[i + 2] = (byte) (j6 >> 16);
        bArr[i + 3] = (byte) (j6 >> 24);
        bArr[i + 4] = (byte) (j6 >> 32);
        bArr[i + 5] = (byte) (j6 >> 40);
        bArr[i + 6] = (byte) (j6 >> 48);
        bArr[i + 7] = (byte) (j6 >> 56);
        this.f27266x = i + 8;
    }

    public final void V1(byte[] bArr, int i, int i4) {
        int i6 = this.f27266x;
        int i9 = this.f27265w;
        int i10 = i9 - i6;
        byte[] bArr2 = this.f27264v;
        if (i10 >= i4) {
            System.arraycopy(bArr, i, bArr2, i6, i4);
            this.f27266x += i4;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i6, i10);
        int i11 = i + i10;
        this.f27266x = i9;
        X1();
        int i12 = i4 - i10;
        if (i12 > i9) {
            this.f27267y.write(bArr, i11, i12);
        } else {
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            this.f27266x = i12;
        }
    }

    public final void W1(int i) {
        if (this.f27265w - this.f27266x < i) {
            X1();
        }
    }

    public final void X1() {
        this.f27267y.write(this.f27264v, 0, this.f27266x);
        this.f27266x = 0;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void Y(int i, int i4) {
        J1((i << 3) | i4);
    }

    public final void Y1(int i) {
        int i4 = this.f27266x;
        int i6 = i4 + 1;
        int i9 = i & (-128);
        byte[] bArr = this.f27264v;
        if (i9 == 0) {
            bArr[i4] = (byte) i;
            this.f27266x = i6;
            return;
        }
        int i10 = i4 + 2;
        bArr[i4] = (byte) (i | 128);
        int i11 = i >>> 7;
        if ((i11 & (-128)) == 0) {
            bArr[i6] = (byte) i11;
            this.f27266x = i10;
            return;
        }
        int i12 = i4 + 3;
        bArr[i6] = (byte) (i11 | 128);
        int i13 = i >>> 14;
        if ((i13 & (-128)) == 0) {
            bArr[i10] = (byte) i13;
            this.f27266x = i12;
            return;
        }
        int i14 = i4 + 4;
        bArr[i10] = (byte) (i13 | 128);
        int i15 = i >>> 21;
        if ((i15 & (-128)) == 0) {
            bArr[i12] = (byte) i15;
            this.f27266x = i14;
        } else {
            bArr[i12] = (byte) (i15 | 128);
            bArr[i14] = (byte) (i >>> 28);
            this.f27266x = i4 + 5;
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void b0(int i, int i4) {
        W1(20);
        Y1(i << 3);
        if (i4 >= 0) {
            Y1(i4);
        } else {
            R1(i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void e0(int i, int i4) {
        W1(20);
        Y1(i << 3);
        Y1(i4);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int o0() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void p1(int i, int i4) {
        W1(14);
        Y1((i << 3) | 5);
        T1(i4);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void q1(int i, long j6) {
        W1(20);
        Y1(i << 3);
        R1(j6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void t1(int i, long j6) {
        W1(18);
        Y1((i << 3) | 1);
        U1(j6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void v1(int i, boolean z6) {
        W1(11);
        Y1(i << 3);
        int i4 = this.f27266x;
        this.f27264v[i4] = z6 ? (byte) 1 : (byte) 0;
        this.f27266x = i4 + 1;
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
