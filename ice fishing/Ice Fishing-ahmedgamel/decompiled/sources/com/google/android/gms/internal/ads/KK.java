package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class KK extends W7.b {

    /* renamed from: A, reason: collision with root package name */
    public final int f25904A;

    /* renamed from: B, reason: collision with root package name */
    public int f25905B;

    /* renamed from: C, reason: collision with root package name */
    public int f25906C = Integer.MAX_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f25907w;

    /* renamed from: x, reason: collision with root package name */
    public final int f25908x;

    /* renamed from: y, reason: collision with root package name */
    public int f25909y;

    /* renamed from: z, reason: collision with root package name */
    public int f25910z;

    public /* synthetic */ KK(byte[] bArr, int i, int i6) {
        this.f25907w = bArr;
        int i9 = i6 + i;
        this.f25908x = i9;
        this.f25909y = i9;
        this.f25910z = i;
        this.f25904A = i;
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
        int i = this.f25910z;
        if (this.f25909y - i < 8) {
            throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f25910z = i + 8;
        byte[] bArr = this.f25907w;
        long j6 = bArr[i];
        long j9 = bArr[i + 2];
        long j10 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j6 & 255) | ((bArr[i + 1] & 255) << 8) | ((j9 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    public final void F(int i) {
        if (i >= 0) {
            int i6 = this.f25909y;
            int i9 = this.f25910z;
            if (i <= i6 - i9) {
                this.f25910z = i9 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C3295hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final int G() {
        int i;
        int i6 = this.f25910z;
        int i9 = this.f25909y;
        if (i9 != i6) {
            int i10 = i6 + 1;
            byte[] bArr = this.f25907w;
            byte b9 = bArr[i6];
            if (b9 >= 0) {
                this.f25910z = i10;
                return b9;
            }
            if (i9 - i10 >= 9) {
                int i11 = i6 + 2;
                int i12 = (bArr[i10] << 7) ^ b9;
                if (i12 < 0) {
                    i = i12 ^ (-128);
                } else {
                    int i13 = i6 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i = i14 ^ 16256;
                    } else {
                        int i15 = i6 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i = (-2080896) ^ i16;
                        } else {
                            i13 = i6 + 5;
                            byte b10 = bArr[i15];
                            int i17 = (i16 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i15 = i6 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i6 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i6 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i6 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i6 + 10;
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
                this.f25910z = i11;
                return i;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j6;
        long j9;
        long j10;
        int i = this.f25910z;
        int i6 = this.f25909y;
        if (i6 != i) {
            int i9 = i + 1;
            byte[] bArr = this.f25907w;
            byte b9 = bArr[i];
            if (b9 >= 0) {
                this.f25910z = i9;
                return b9;
            }
            if (i6 - i9 >= 9) {
                int i10 = i + 2;
                int i11 = (bArr[i9] << 7) ^ b9;
                if (i11 < 0) {
                    j6 = i11 ^ (-128);
                } else {
                    int i12 = i + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j6 = i13 ^ 16256;
                    } else {
                        int i14 = i + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            long j11 = (-2080896) ^ i15;
                            i10 = i14;
                            j6 = j11;
                        } else {
                            i12 = i + 5;
                            long j12 = i15 ^ (bArr[i14] << 28);
                            if (j12 >= 0) {
                                j9 = 266354560;
                            } else {
                                int i16 = i + 6;
                                long j13 = j12 ^ (bArr[i12] << 35);
                                if (j13 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i12 = i + 7;
                                    j12 = j13 ^ (bArr[i16] << 42);
                                    if (j12 >= 0) {
                                        j9 = 4363953127296L;
                                    } else {
                                        i16 = i + 8;
                                        j13 = j12 ^ (bArr[i12] << 49);
                                        if (j13 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i12 = i + 9;
                                            j12 = j13 ^ (bArr[i16] << 56);
                                            if (j12 >= 0) {
                                                j9 = 71499008037633920L;
                                            } else {
                                                int i17 = i + 10;
                                                long j14 = j12 ^ (bArr[i12] << 63);
                                                if (j14 >= 0) {
                                                    j6 = j14 ^ (-9151873028817141888L);
                                                    i10 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                j6 = j13 ^ j10;
                                i10 = i16;
                            }
                            j6 = j12 ^ j9;
                        }
                    }
                    i10 = i12;
                }
                this.f25910z = i10;
                return j6;
            }
        }
        return I();
    }

    public final long I() {
        long j6 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i6 = this.f25910z;
            if (i6 == this.f25909y) {
                throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f25910z = i6 + 1;
            j6 |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f25907w[i6] & com.anythink.core.common.s.a.c.f16316a) == 0) {
                return j6;
            }
        }
        throw new C3295hL("CodedInputStream encountered a malformed varint.");
    }

    public final int J() {
        int i = this.f25910z;
        if (this.f25909y - i < 4) {
            throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f25910z = i + 4;
        byte[] bArr = this.f25907w;
        int i6 = bArr[i] & 255;
        int i9 = bArr[i + 1] & 255;
        int i10 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i9 << 8) | i6 | (i10 << 16);
    }

    @Override // W7.b
    public final int b(int i) {
        if (i < 0) {
            throw new C3295hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i6 = this.f25910z;
        int i9 = this.f25904A;
        int i10 = (i6 - i9) + i;
        if (i10 < 0) {
            throw new C3295hL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.f25906C;
        if (i10 > i11) {
            throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f25906C = i10;
        int i12 = this.f25908x;
        if (i10 <= i12 - i9) {
            this.f25909y = i10 + i9;
            return i11;
        }
        this.f25909y = i12;
        return i11;
    }

    @Override // W7.b
    public final void c(int i) {
        this.f25906C = i;
        int i6 = this.f25908x;
        int i9 = this.f25904A;
        if (i <= i6 - i9) {
            this.f25909y = i + i9;
        } else {
            this.f25909y = i6;
        }
    }

    @Override // W7.b
    public final boolean d() {
        return this.f25910z == this.f25909y;
    }

    @Override // W7.b
    public final int e() {
        return this.f25910z - this.f25904A;
    }

    @Override // W7.b
    public final int j() {
        if (d()) {
            this.f25905B = 0;
            return 0;
        }
        int G7 = G();
        this.f25905B = G7;
        if ((G7 >>> 3) != 0) {
            return G7;
        }
        throw new C3295hL("Protocol message contained an invalid tag (zero).");
    }

    @Override // W7.b
    public final void k(int i) {
        if (this.f25905B != i) {
            throw new C3295hL("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // W7.b
    public final boolean l(int i) {
        int i6 = i & 7;
        int i9 = 0;
        if (i6 != 0) {
            if (i6 == 1) {
                F(8);
                return true;
            }
            if (i6 == 2) {
                F(G());
                return true;
            }
            if (i6 == 3) {
                g();
                k(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i6 == 4) {
                if (this.f3415u == 0) {
                    k(0);
                }
                return false;
            }
            if (i6 != 5) {
                throw new C3241gL();
            }
            F(4);
            return true;
        }
        int i10 = this.f25909y - this.f25910z;
        byte[] bArr = this.f25907w;
        if (i10 >= 10) {
            while (i9 < 10) {
                int i11 = this.f25910z;
                this.f25910z = i11 + 1;
                if (bArr[i11] < 0) {
                    i9++;
                }
            }
            throw new C3295hL("CodedInputStream encountered a malformed varint.");
        }
        while (i9 < 10) {
            int i12 = this.f25910z;
            if (i12 == this.f25909y) {
                throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f25910z = i12 + 1;
            if (bArr[i12] < 0) {
                i9++;
            }
        }
        throw new C3295hL("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // W7.b
    public final double m() {
        return Double.longBitsToDouble(E());
    }

    @Override // W7.b
    public final float n() {
        return Float.intBitsToFloat(J());
    }

    @Override // W7.b
    public final long o() {
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
        int G7 = G();
        if (G7 > 0) {
            int i = this.f25909y;
            int i6 = this.f25910z;
            if (G7 <= i - i6) {
                String str = new String(this.f25907w, i6, G7, StandardCharsets.UTF_8);
                this.f25910z += G7;
                return str;
            }
        }
        if (G7 == 0) {
            return "";
        }
        if (G7 < 0) {
            throw new C3295hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // W7.b
    public final String w() {
        int G7 = G();
        if (G7 > 0) {
            int i = this.f25909y;
            int i6 = this.f25910z;
            if (G7 <= i - i6) {
                String c9 = RL.c(this.f25907w, i6, G7);
                this.f25910z += G7;
                return c9;
            }
        }
        if (G7 == 0) {
            return "";
        }
        if (G7 <= 0) {
            throw new C3295hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // W7.b
    public final HK x() {
        int G7 = G();
        byte[] bArr = this.f25907w;
        if (G7 > 0) {
            int i = this.f25909y;
            int i6 = this.f25910z;
            if (G7 <= i - i6) {
                HK t6 = JK.t(bArr, i6, G7);
                this.f25910z += G7;
                return t6;
            }
        }
        if (G7 == 0) {
            return JK.f25675u;
        }
        if (G7 > 0) {
            int i9 = this.f25909y;
            int i10 = this.f25910z;
            if (G7 <= i9 - i10) {
                int i11 = G7 + i10;
                this.f25910z = i11;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
                HK hk = JK.f25675u;
                return copyOfRange.length == 0 ? JK.f25675u : new HK(copyOfRange);
            }
        }
        if (G7 <= 0) {
            throw new C3295hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
