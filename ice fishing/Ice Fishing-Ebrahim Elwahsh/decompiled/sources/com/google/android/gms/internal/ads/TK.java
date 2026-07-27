package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class TK extends S7.b {

    /* renamed from: A, reason: collision with root package name */
    public final int f27737A;

    /* renamed from: B, reason: collision with root package name */
    public int f27738B;

    /* renamed from: C, reason: collision with root package name */
    public int f27739C = Integer.MAX_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f27740w;

    /* renamed from: x, reason: collision with root package name */
    public int f27741x;

    /* renamed from: y, reason: collision with root package name */
    public int f27742y;

    /* renamed from: z, reason: collision with root package name */
    public int f27743z;

    public /* synthetic */ TK(byte[] bArr, int i, int i4) {
        this.f27740w = bArr;
        this.f27741x = i4 + i;
        this.f27743z = i;
        this.f27737A = i;
    }

    @Override // S7.b
    public final int A() {
        return K();
    }

    @Override // S7.b
    public final long B() {
        return E();
    }

    @Override // S7.b
    public final int C() {
        return S7.b.h(H());
    }

    @Override // S7.b
    public final long D() {
        return S7.b.i(I());
    }

    public final long E() {
        int i = this.f27743z;
        if (this.f27741x - i < 8) {
            throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f27743z = i + 8;
        byte[] bArr = this.f27740w;
        long j9 = bArr[i];
        long j10 = bArr[i + 2];
        long j11 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j9 & 255) | ((bArr[i + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    public final void F(int i) {
        if (i >= 0) {
            int i4 = this.f27741x;
            int i9 = this.f27743z;
            if (i <= i4 - i9) {
                this.f27743z = i9 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C3845rL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final void G() {
        int i = this.f27741x + this.f27742y;
        this.f27741x = i;
        int i4 = i - this.f27737A;
        int i9 = this.f27739C;
        if (i4 <= i9) {
            this.f27742y = 0;
            return;
        }
        int i10 = i4 - i9;
        this.f27742y = i10;
        this.f27741x = i - i10;
    }

    public final int H() {
        int i;
        int i4 = this.f27743z;
        int i9 = this.f27741x;
        if (i9 != i4) {
            int i10 = i4 + 1;
            byte[] bArr = this.f27740w;
            byte b9 = bArr[i4];
            if (b9 >= 0) {
                this.f27743z = i10;
                return b9;
            }
            if (i9 - i10 >= 9) {
                int i11 = i4 + 2;
                int i12 = (bArr[i10] << 7) ^ b9;
                if (i12 < 0) {
                    i = i12 ^ (-128);
                } else {
                    int i13 = i4 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i = i14 ^ 16256;
                    } else {
                        int i15 = i4 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i = (-2080896) ^ i16;
                        } else {
                            i13 = i4 + 5;
                            byte b10 = bArr[i15];
                            int i17 = (i16 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i15 = i4 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i4 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i4 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i4 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i4 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i18;
                                                    i = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i17;
                            }
                            i = i17;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.f27743z = i11;
                return i;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j9;
        long j10;
        long j11;
        int i = this.f27743z;
        int i4 = this.f27741x;
        if (i4 != i) {
            int i9 = i + 1;
            byte[] bArr = this.f27740w;
            byte b9 = bArr[i];
            if (b9 >= 0) {
                this.f27743z = i9;
                return b9;
            }
            if (i4 - i9 >= 9) {
                int i10 = i + 2;
                int i11 = (bArr[i9] << 7) ^ b9;
                if (i11 < 0) {
                    j9 = i11 ^ (-128);
                } else {
                    int i12 = i + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j9 = i13 ^ 16256;
                    } else {
                        int i14 = i + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            long j12 = (-2080896) ^ i15;
                            i10 = i14;
                            j9 = j12;
                        } else {
                            i12 = i + 5;
                            long j13 = i15 ^ (bArr[i14] << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                int i16 = i + 6;
                                long j14 = j13 ^ (bArr[i12] << 35);
                                if (j14 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i12 = i + 7;
                                    j13 = j14 ^ (bArr[i16] << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i16 = i + 8;
                                        j14 = j13 ^ (bArr[i12] << 49);
                                        if (j14 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i12 = i + 9;
                                            j13 = j14 ^ (bArr[i16] << 56);
                                            if (j13 >= 0) {
                                                j10 = 71499008037633920L;
                                            } else {
                                                int i17 = i + 10;
                                                long j15 = j13 ^ (bArr[i12] << 63);
                                                if (j15 >= 0) {
                                                    j9 = j15 ^ (-9151873028817141888L);
                                                    i10 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                j9 = j14 ^ j11;
                                i10 = i16;
                            }
                            j9 = j13 ^ j10;
                        }
                    }
                    i10 = i12;
                }
                this.f27743z = i10;
                return j9;
            }
        }
        return J();
    }

    public final long J() {
        long j9 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i4 = this.f27743z;
            if (i4 == this.f27741x) {
                throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f27743z = i4 + 1;
            j9 |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f27740w[i4] & com.anythink.core.common.s.a.c.f16474a) == 0) {
                return j9;
            }
        }
        throw new C3845rL("CodedInputStream encountered a malformed varint.");
    }

    public final int K() {
        int i = this.f27743z;
        if (this.f27741x - i < 4) {
            throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f27743z = i + 4;
        byte[] bArr = this.f27740w;
        int i4 = bArr[i] & 255;
        int i9 = bArr[i + 1] & 255;
        int i10 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i9 << 8) | i4 | (i10 << 16);
    }

    @Override // S7.b
    public final int b(int i) {
        if (i < 0) {
            throw new C3845rL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i4 = (this.f27743z - this.f27737A) + i;
        if (i4 < 0) {
            throw new C3845rL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i9 = this.f27739C;
        if (i4 > i9) {
            throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f27739C = i4;
        G();
        return i9;
    }

    @Override // S7.b
    public final void c(int i) {
        this.f27739C = i;
        G();
    }

    @Override // S7.b
    public final boolean d() {
        return this.f27743z == this.f27741x;
    }

    @Override // S7.b
    public final int e() {
        return this.f27743z - this.f27737A;
    }

    @Override // S7.b
    public final int k() {
        if (d()) {
            this.f27738B = 0;
            return 0;
        }
        int H6 = H();
        this.f27738B = H6;
        if ((H6 >>> 3) != 0) {
            return H6;
        }
        throw new C3845rL("Protocol message contained an invalid tag (zero).");
    }

    @Override // S7.b
    public final void l(int i) {
        if (this.f27738B != i) {
            throw new C3845rL("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // S7.b
    public final boolean m(int i) {
        int i4 = i & 7;
        int i9 = 0;
        if (i4 != 0) {
            if (i4 == 1) {
                F(8);
                return true;
            }
            if (i4 == 2) {
                F(H());
                return true;
            }
            if (i4 == 3) {
                g();
                l(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i4 == 4) {
                if (this.f2981u == 0) {
                    l(0);
                }
                return false;
            }
            if (i4 != 5) {
                throw new C3792qL();
            }
            F(4);
            return true;
        }
        int i10 = this.f27741x - this.f27743z;
        byte[] bArr = this.f27740w;
        if (i10 >= 10) {
            while (i9 < 10) {
                int i11 = this.f27743z;
                this.f27743z = i11 + 1;
                if (bArr[i11] < 0) {
                    i9++;
                }
            }
            throw new C3845rL("CodedInputStream encountered a malformed varint.");
        }
        while (i9 < 10) {
            int i12 = this.f27743z;
            if (i12 == this.f27741x) {
                throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f27743z = i12 + 1;
            if (bArr[i12] < 0) {
                i9++;
            }
        }
        throw new C3845rL("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // S7.b
    public final double n() {
        return Double.longBitsToDouble(E());
    }

    @Override // S7.b
    public final float o() {
        return Float.intBitsToFloat(K());
    }

    @Override // S7.b
    public final long p() {
        return I();
    }

    @Override // S7.b
    public final long q() {
        return I();
    }

    @Override // S7.b
    public final int r() {
        return H();
    }

    @Override // S7.b
    public final long s() {
        return E();
    }

    @Override // S7.b
    public final int t() {
        return K();
    }

    @Override // S7.b
    public final boolean u() {
        return I() != 0;
    }

    @Override // S7.b
    public final String v() {
        int H6 = H();
        if (H6 > 0) {
            int i = this.f27741x;
            int i4 = this.f27743z;
            if (H6 <= i - i4) {
                String str = new String(this.f27740w, i4, H6, StandardCharsets.UTF_8);
                this.f27743z += H6;
                return str;
            }
        }
        if (H6 == 0) {
            return "";
        }
        if (H6 < 0) {
            throw new C3845rL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // S7.b
    public final String w() {
        int H6 = H();
        if (H6 > 0) {
            int i = this.f27741x;
            int i4 = this.f27743z;
            if (H6 <= i - i4) {
                String d2 = AbstractC3145eM.d(this.f27740w, i4, H6);
                this.f27743z += H6;
                return d2;
            }
        }
        if (H6 == 0) {
            return "";
        }
        if (H6 <= 0) {
            throw new C3845rL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // S7.b
    public final QK x() {
        int H6 = H();
        byte[] bArr = this.f27740w;
        if (H6 > 0) {
            int i = this.f27741x;
            int i4 = this.f27743z;
            if (H6 <= i - i4) {
                QK t9 = SK.t(bArr, i4, H6);
                this.f27743z += H6;
                return t9;
            }
        }
        if (H6 == 0) {
            return SK.f27529u;
        }
        if (H6 > 0) {
            int i9 = this.f27741x;
            int i10 = this.f27743z;
            if (H6 <= i9 - i10) {
                int i11 = H6 + i10;
                this.f27743z = i11;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
                QK qk = SK.f27529u;
                return copyOfRange.length == 0 ? SK.f27529u : new QK(copyOfRange);
            }
        }
        if (H6 <= 0) {
            throw new C3845rL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // S7.b
    public final int y() {
        return H();
    }

    @Override // S7.b
    public final int z() {
        return H();
    }
}
