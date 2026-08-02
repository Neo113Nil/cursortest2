package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class KK extends W7.b {

    /* renamed from: A, reason: collision with root package name */
    public final int f26656A;

    /* renamed from: B, reason: collision with root package name */
    public int f26657B;

    /* renamed from: C, reason: collision with root package name */
    public int f26658C = Integer.MAX_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f26659w;

    /* renamed from: x, reason: collision with root package name */
    public final int f26660x;

    /* renamed from: y, reason: collision with root package name */
    public int f26661y;

    /* renamed from: z, reason: collision with root package name */
    public int f26662z;

    public /* synthetic */ KK(byte[] bArr, int i, int i4) {
        this.f26659w = bArr;
        int i6 = i4 + i;
        this.f26660x = i6;
        this.f26661y = i6;
        this.f26662z = i;
        this.f26656A = i;
    }

    @Override // W7.b
    public final int A() {
        return J();
    }

    @Override // W7.b
    public final long B() {
        return E();
    }

    @Override // W7.b
    public final int C() {
        return W7.b.h(G());
    }

    @Override // W7.b
    public final long D() {
        return W7.b.i(H());
    }

    public final long E() {
        int i = this.f26662z;
        if (this.f26661y - i < 8) {
            throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f26662z = i + 8;
        byte[] bArr = this.f26659w;
        long j6 = bArr[i];
        long j9 = bArr[i + 2];
        long j10 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j6 & 255) | ((bArr[i + 1] & 255) << 8) | ((j9 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    public final void F(int i) {
        if (i >= 0) {
            int i4 = this.f26661y;
            int i6 = this.f26662z;
            if (i <= i4 - i6) {
                this.f26662z = i6 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C3318hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final int G() {
        int i;
        int i4 = this.f26662z;
        int i6 = this.f26661y;
        if (i6 != i4) {
            int i9 = i4 + 1;
            byte[] bArr = this.f26659w;
            byte b9 = bArr[i4];
            if (b9 >= 0) {
                this.f26662z = i9;
                return b9;
            }
            if (i6 - i9 >= 9) {
                int i10 = i4 + 2;
                int i11 = (bArr[i9] << 7) ^ b9;
                if (i11 < 0) {
                    i = i11 ^ (-128);
                } else {
                    int i12 = i4 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        i = i13 ^ 16256;
                    } else {
                        int i14 = i4 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            i = (-2080896) ^ i15;
                        } else {
                            i12 = i4 + 5;
                            byte b10 = bArr[i14];
                            int i16 = (i15 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i14 = i4 + 6;
                                if (bArr[i12] < 0) {
                                    i12 = i4 + 7;
                                    if (bArr[i14] < 0) {
                                        i14 = i4 + 8;
                                        if (bArr[i12] < 0) {
                                            i12 = i4 + 9;
                                            if (bArr[i14] < 0) {
                                                int i17 = i4 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i10 = i17;
                                                    i = i16;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i16;
                            }
                            i = i16;
                        }
                        i10 = i14;
                    }
                    i10 = i12;
                }
                this.f26662z = i10;
                return i;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j6;
        long j9;
        long j10;
        int i = this.f26662z;
        int i4 = this.f26661y;
        if (i4 != i) {
            int i6 = i + 1;
            byte[] bArr = this.f26659w;
            byte b9 = bArr[i];
            if (b9 >= 0) {
                this.f26662z = i6;
                return b9;
            }
            if (i4 - i6 >= 9) {
                int i9 = i + 2;
                int i10 = (bArr[i6] << 7) ^ b9;
                if (i10 < 0) {
                    j6 = i10 ^ (-128);
                } else {
                    int i11 = i + 3;
                    int i12 = (bArr[i9] << 14) ^ i10;
                    if (i12 >= 0) {
                        j6 = i12 ^ 16256;
                    } else {
                        int i13 = i + 4;
                        int i14 = i12 ^ (bArr[i11] << 21);
                        if (i14 < 0) {
                            long j11 = (-2080896) ^ i14;
                            i9 = i13;
                            j6 = j11;
                        } else {
                            i11 = i + 5;
                            long j12 = i14 ^ (bArr[i13] << 28);
                            if (j12 >= 0) {
                                j9 = 266354560;
                            } else {
                                int i15 = i + 6;
                                long j13 = j12 ^ (bArr[i11] << 35);
                                if (j13 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i11 = i + 7;
                                    j12 = j13 ^ (bArr[i15] << 42);
                                    if (j12 >= 0) {
                                        j9 = 4363953127296L;
                                    } else {
                                        i15 = i + 8;
                                        j13 = j12 ^ (bArr[i11] << 49);
                                        if (j13 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i11 = i + 9;
                                            j12 = j13 ^ (bArr[i15] << 56);
                                            if (j12 >= 0) {
                                                j9 = 71499008037633920L;
                                            } else {
                                                int i16 = i + 10;
                                                long j14 = j12 ^ (bArr[i11] << 63);
                                                if (j14 >= 0) {
                                                    j6 = j14 ^ (-9151873028817141888L);
                                                    i9 = i16;
                                                }
                                            }
                                        }
                                    }
                                }
                                j6 = j13 ^ j10;
                                i9 = i15;
                            }
                            j6 = j12 ^ j9;
                        }
                    }
                    i9 = i11;
                }
                this.f26662z = i9;
                return j6;
            }
        }
        return I();
    }

    public final long I() {
        long j6 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i4 = this.f26662z;
            if (i4 == this.f26661y) {
                throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f26662z = i4 + 1;
            j6 |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f26659w[i4] & com.anythink.core.common.s.a.c.f17103a) == 0) {
                return j6;
            }
        }
        throw new C3318hL("CodedInputStream encountered a malformed varint.");
    }

    public final int J() {
        int i = this.f26662z;
        if (this.f26661y - i < 4) {
            throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f26662z = i + 4;
        byte[] bArr = this.f26659w;
        int i4 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i9 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i6 << 8) | i4 | (i9 << 16);
    }

    @Override // W7.b
    public final int b(int i) {
        if (i < 0) {
            throw new C3318hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i4 = this.f26662z;
        int i6 = this.f26656A;
        int i9 = (i4 - i6) + i;
        if (i9 < 0) {
            throw new C3318hL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i10 = this.f26658C;
        if (i9 > i10) {
            throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f26658C = i9;
        int i11 = this.f26660x;
        if (i9 <= i11 - i6) {
            this.f26661y = i9 + i6;
            return i10;
        }
        this.f26661y = i11;
        return i10;
    }

    @Override // W7.b
    public final void c(int i) {
        this.f26658C = i;
        int i4 = this.f26660x;
        int i6 = this.f26656A;
        if (i <= i4 - i6) {
            this.f26661y = i + i6;
        } else {
            this.f26661y = i4;
        }
    }

    @Override // W7.b
    public final boolean d() {
        return this.f26662z == this.f26661y;
    }

    @Override // W7.b
    public final int e() {
        return this.f26662z - this.f26656A;
    }

    @Override // W7.b
    public final int j() {
        if (d()) {
            this.f26657B = 0;
            return 0;
        }
        int G2 = G();
        this.f26657B = G2;
        if ((G2 >>> 3) != 0) {
            return G2;
        }
        throw new C3318hL("Protocol message contained an invalid tag (zero).");
    }

    @Override // W7.b
    public final void k(int i) {
        if (this.f26657B != i) {
            throw new C3318hL("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // W7.b
    public final boolean m(int i) {
        int i4 = i & 7;
        int i6 = 0;
        if (i4 != 0) {
            if (i4 == 1) {
                F(8);
                return true;
            }
            if (i4 == 2) {
                F(G());
                return true;
            }
            if (i4 == 3) {
                g();
                k(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i4 == 4) {
                if (this.f3577u == 0) {
                    k(0);
                }
                return false;
            }
            if (i4 != 5) {
                throw new C3264gL();
            }
            F(4);
            return true;
        }
        int i9 = this.f26661y - this.f26662z;
        byte[] bArr = this.f26659w;
        if (i9 >= 10) {
            while (i6 < 10) {
                int i10 = this.f26662z;
                this.f26662z = i10 + 1;
                if (bArr[i10] < 0) {
                    i6++;
                }
            }
            throw new C3318hL("CodedInputStream encountered a malformed varint.");
        }
        while (i6 < 10) {
            int i11 = this.f26662z;
            if (i11 == this.f26661y) {
                throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f26662z = i11 + 1;
            if (bArr[i11] < 0) {
                i6++;
            }
        }
        throw new C3318hL("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // W7.b
    public final double n() {
        return Double.longBitsToDouble(E());
    }

    @Override // W7.b
    public final float o() {
        return Float.intBitsToFloat(J());
    }

    @Override // W7.b
    public final long p() {
        return H();
    }

    @Override // W7.b
    public final long q() {
        return H();
    }

    @Override // W7.b
    public final int r() {
        return G();
    }

    @Override // W7.b
    public final long s() {
        return E();
    }

    @Override // W7.b
    public final int t() {
        return J();
    }

    @Override // W7.b
    public final boolean u() {
        return H() != 0;
    }

    @Override // W7.b
    public final String v() {
        int G2 = G();
        if (G2 > 0) {
            int i = this.f26661y;
            int i4 = this.f26662z;
            if (G2 <= i - i4) {
                String str = new String(this.f26659w, i4, G2, StandardCharsets.UTF_8);
                this.f26662z += G2;
                return str;
            }
        }
        if (G2 == 0) {
            return "";
        }
        if (G2 < 0) {
            throw new C3318hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // W7.b
    public final String w() {
        int G2 = G();
        if (G2 > 0) {
            int i = this.f26661y;
            int i4 = this.f26662z;
            if (G2 <= i - i4) {
                String c9 = RL.c(this.f26659w, i4, G2);
                this.f26662z += G2;
                return c9;
            }
        }
        if (G2 == 0) {
            return "";
        }
        if (G2 <= 0) {
            throw new C3318hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // W7.b
    public final HK x() {
        int G2 = G();
        byte[] bArr = this.f26659w;
        if (G2 > 0) {
            int i = this.f26661y;
            int i4 = this.f26662z;
            if (G2 <= i - i4) {
                HK t6 = JK.t(bArr, i4, G2);
                this.f26662z += G2;
                return t6;
            }
        }
        if (G2 == 0) {
            return JK.f26428u;
        }
        if (G2 > 0) {
            int i6 = this.f26661y;
            int i9 = this.f26662z;
            if (G2 <= i6 - i9) {
                int i10 = G2 + i9;
                this.f26662z = i10;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i9, i10);
                HK hk = JK.f26428u;
                return copyOfRange.length == 0 ? JK.f26428u : new HK(copyOfRange);
            }
        }
        if (G2 <= 0) {
            throw new C3318hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // W7.b
    public final int y() {
        return G();
    }

    @Override // W7.b
    public final int z() {
        return G();
    }
}
