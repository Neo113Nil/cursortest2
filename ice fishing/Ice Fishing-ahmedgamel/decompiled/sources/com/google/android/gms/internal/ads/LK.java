package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class LK extends W7.b {

    /* renamed from: B, reason: collision with root package name */
    public int f26899B;

    /* renamed from: w, reason: collision with root package name */
    public final InputStream f26902w;

    /* renamed from: z, reason: collision with root package name */
    public int f26905z;

    /* renamed from: D, reason: collision with root package name */
    public int f26901D = Integer.MAX_VALUE;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f26903x = new byte[4096];

    /* renamed from: y, reason: collision with root package name */
    public int f26904y = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f26898A = 0;

    /* renamed from: C, reason: collision with root package name */
    public int f26900C = 0;

    public /* synthetic */ LK(InputStream inputStream) {
        this.f26902w = inputStream;
    }

    @Override // W7.b
    public final int A() {
        return O();
    }

    @Override // W7.b
    public final long B() {
        return P();
    }

    @Override // W7.b
    public final int C() {
        return W7.b.h(L());
    }

    @Override // W7.b
    public final long D() {
        return W7.b.i(M());
    }

    public final void E(int i) {
        InputStream inputStream = this.f26902w;
        int i4 = this.f26904y;
        int i6 = this.f26898A;
        int i9 = i4 - i6;
        if (i <= i9 && i >= 0) {
            this.f26898A = i6 + i;
            return;
        }
        if (i < 0) {
            throw new C3318hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = this.f26900C;
        int i11 = i10 + i6;
        int i12 = this.f26901D;
        if (i11 + i > i12) {
            E((i12 - i10) - i6);
            throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f26900C = i11;
        this.f26904y = 0;
        this.f26898A = 0;
        while (i9 < i) {
            long j6 = i - i9;
            try {
                try {
                    long skip = inputStream.skip(j6);
                    if (skip < 0 || skip > j6) {
                        String valueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb = new StringBuilder(valueOf.length() + 31 + String.valueOf(skip).length() + 41);
                        sb.append(valueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(skip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i9 += (int) skip;
                    }
                } catch (C3318hL e9) {
                    e9.f31526n = true;
                    throw e9;
                }
            } catch (Throwable th) {
                this.f26900C += i9;
                F();
                throw th;
            }
        }
        this.f26900C += i9;
        F();
        if (i9 >= i) {
            return;
        }
        int i13 = this.f26904y;
        int i14 = i13 - this.f26898A;
        this.f26898A = i13;
        G(1);
        while (true) {
            int i15 = i - i14;
            int i16 = this.f26904y;
            if (i15 <= i16) {
                this.f26898A = i15;
                return;
            } else {
                i14 += i16;
                this.f26898A = i16;
                G(1);
            }
        }
    }

    public final void F() {
        int i = this.f26904y + this.f26905z;
        this.f26904y = i;
        int i4 = this.f26900C + i;
        int i6 = this.f26901D;
        if (i4 <= i6) {
            this.f26905z = 0;
            return;
        }
        int i9 = i4 - i6;
        this.f26905z = i9;
        this.f26904y = i - i9;
    }

    public final void G(int i) {
        if (H(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f26900C) - this.f26898A) {
            throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C3318hL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final boolean H(int i) {
        InputStream inputStream = this.f26902w;
        int i4 = this.f26898A;
        int i6 = i4 + i;
        int i9 = this.f26904y;
        if (i6 <= i9) {
            throw new IllegalStateException(AbstractC5128c.d(i, "refillBuffer() called when ", " bytes were already available in buffer", new StringBuilder(String.valueOf(i).length() + 66)));
        }
        int i10 = this.f26900C;
        if (i > (Integer.MAX_VALUE - i10) - i4 || i10 + i4 + i > this.f26901D) {
            return false;
        }
        byte[] bArr = this.f26903x;
        if (i4 > 0) {
            if (i9 > i4) {
                System.arraycopy(bArr, i4, bArr, 0, i9 - i4);
            }
            i10 = this.f26900C + i4;
            this.f26900C = i10;
            i9 = this.f26904y - i4;
            this.f26904y = i9;
            this.f26898A = 0;
        }
        try {
            int read = inputStream.read(bArr, i9, Math.min(4096 - i9, (Integer.MAX_VALUE - i10) - i9));
            if (read != 0 && read >= -1 && read <= 4096) {
                if (read <= 0) {
                    return false;
                }
                this.f26904y += read;
                F();
                return this.f26904y >= i || H(i);
            }
            String valueOf = String.valueOf(inputStream.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(read).length() + valueOf.length() + 39 + 41);
            sb.append(valueOf);
            sb.append("#read(byte[]) returned invalid result: ");
            sb.append(read);
            sb.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb.toString());
        } catch (C3318hL e9) {
            e9.f31526n = true;
            throw e9;
        }
    }

    public final byte[] I(int i) {
        byte[] J = J(i);
        if (J != null) {
            return J;
        }
        int i4 = this.f26898A;
        int i6 = this.f26904y;
        int i9 = i6 - i4;
        this.f26900C += i6;
        this.f26898A = 0;
        this.f26904y = 0;
        ArrayList K7 = K(i - i9);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f26903x, i4, bArr, 0, i9);
        Iterator it = K7.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i9, length);
            i9 += length;
        }
        return bArr;
    }

    public final byte[] J(int i) {
        if (i == 0) {
            return AbstractC3103dL.f30518a;
        }
        int i4 = this.f26900C;
        int i6 = this.f26898A;
        int i9 = i4 + i6 + i;
        if ((-2147483647) + i9 > 0) {
            throw new C3318hL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i10 = this.f26901D;
        if (i9 > i10) {
            E((i10 - i4) - i6);
            throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i11 = this.f26904y - i6;
        int i12 = i - i11;
        InputStream inputStream = this.f26902w;
        if (i12 >= 4096) {
            try {
                if (i12 > inputStream.available()) {
                    return null;
                }
            } catch (C3318hL e9) {
                e9.f31526n = true;
                throw e9;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f26903x, this.f26898A, bArr, 0, i11);
        this.f26900C += this.f26904y;
        this.f26898A = 0;
        this.f26904y = 0;
        while (i11 < i) {
            try {
                int read = inputStream.read(bArr, i11, i - i11);
                if (read == -1) {
                    throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f26900C += read;
                i11 += read;
            } catch (C3318hL e10) {
                e10.f31526n = true;
                throw e10;
            }
        }
        return bArr;
    }

    public final ArrayList K(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i4 = 0;
            while (i4 < min) {
                try {
                    int read = this.f26902w.read(bArr, i4, min - i4);
                    if (read == -1) {
                        throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.f26900C += read;
                    i4 += read;
                } catch (C3318hL e9) {
                    e9.f31526n = true;
                    throw e9;
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int L() {
        int i;
        int i4 = this.f26898A;
        int i6 = this.f26904y;
        if (i6 != i4) {
            int i9 = i4 + 1;
            byte[] bArr = this.f26903x;
            byte b9 = bArr[i4];
            if (b9 >= 0) {
                this.f26898A = i9;
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
                this.f26898A = i10;
                return i;
            }
        }
        return (int) N();
    }

    public final long M() {
        long j6;
        long j9;
        long j10;
        int i = this.f26898A;
        int i4 = this.f26904y;
        if (i4 != i) {
            int i6 = i + 1;
            byte[] bArr = this.f26903x;
            byte b9 = bArr[i];
            if (b9 >= 0) {
                this.f26898A = i6;
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
                this.f26898A = i9;
                return j6;
            }
        }
        return N();
    }

    public final long N() {
        long j6 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f26898A == this.f26904y) {
                G(1);
            }
            int i4 = this.f26898A;
            this.f26898A = i4 + 1;
            j6 |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f26903x[i4] & com.anythink.core.common.s.a.c.f17103a) == 0) {
                return j6;
            }
        }
        throw new C3318hL("CodedInputStream encountered a malformed varint.");
    }

    public final int O() {
        int i = this.f26898A;
        if (this.f26904y - i < 4) {
            G(4);
            i = this.f26898A;
        }
        this.f26898A = i + 4;
        byte[] bArr = this.f26903x;
        int i4 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i9 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i6 << 8) | i4 | (i9 << 16);
    }

    public final long P() {
        int i = this.f26898A;
        if (this.f26904y - i < 8) {
            G(8);
            i = this.f26898A;
        }
        this.f26898A = i + 8;
        byte[] bArr = this.f26903x;
        long j6 = bArr[i];
        long j9 = bArr[i + 2];
        long j10 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j6 & 255) | ((bArr[i + 1] & 255) << 8) | ((j9 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // W7.b
    public final int b(int i) {
        if (i < 0) {
            throw new C3318hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i4 = this.f26900C + this.f26898A + i;
        if (i4 < 0) {
            throw new C3318hL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i6 = this.f26901D;
        if (i4 > i6) {
            throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f26901D = i4;
        F();
        return i6;
    }

    @Override // W7.b
    public final void c(int i) {
        this.f26901D = i;
        F();
    }

    @Override // W7.b
    public final boolean d() {
        return this.f26898A == this.f26904y && !H(1);
    }

    @Override // W7.b
    public final int e() {
        return this.f26900C + this.f26898A;
    }

    @Override // W7.b
    public final int j() {
        if (d()) {
            this.f26899B = 0;
            return 0;
        }
        int L2 = L();
        this.f26899B = L2;
        if ((L2 >>> 3) != 0) {
            return L2;
        }
        throw new C3318hL("Protocol message contained an invalid tag (zero).");
    }

    @Override // W7.b
    public final void k(int i) {
        if (this.f26899B != i) {
            throw new C3318hL("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // W7.b
    public final boolean m(int i) {
        int i4 = i & 7;
        int i6 = 0;
        if (i4 != 0) {
            if (i4 == 1) {
                E(8);
                return true;
            }
            if (i4 == 2) {
                E(L());
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
            E(4);
            return true;
        }
        int i9 = this.f26904y - this.f26898A;
        byte[] bArr = this.f26903x;
        if (i9 >= 10) {
            while (i6 < 10) {
                int i10 = this.f26898A;
                this.f26898A = i10 + 1;
                if (bArr[i10] < 0) {
                    i6++;
                }
            }
            throw new C3318hL("CodedInputStream encountered a malformed varint.");
        }
        while (i6 < 10) {
            if (this.f26898A == this.f26904y) {
                G(1);
            }
            int i11 = this.f26898A;
            this.f26898A = i11 + 1;
            if (bArr[i11] < 0) {
                i6++;
            }
        }
        throw new C3318hL("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // W7.b
    public final double n() {
        return Double.longBitsToDouble(P());
    }

    @Override // W7.b
    public final float o() {
        return Float.intBitsToFloat(O());
    }

    @Override // W7.b
    public final long p() {
        return M();
    }

    @Override // W7.b
    public final long q() {
        return M();
    }

    @Override // W7.b
    public final int r() {
        return L();
    }

    @Override // W7.b
    public final long s() {
        return P();
    }

    @Override // W7.b
    public final int t() {
        return O();
    }

    @Override // W7.b
    public final boolean u() {
        return M() != 0;
    }

    @Override // W7.b
    public final String v() {
        int L2 = L();
        byte[] bArr = this.f26903x;
        if (L2 > 0) {
            int i = this.f26904y;
            int i4 = this.f26898A;
            if (L2 <= i - i4) {
                String str = new String(bArr, i4, L2, StandardCharsets.UTF_8);
                this.f26898A += L2;
                return str;
            }
        }
        if (L2 == 0) {
            return "";
        }
        if (L2 < 0) {
            throw new C3318hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (L2 > this.f26904y) {
            return new String(I(L2), StandardCharsets.UTF_8);
        }
        G(L2);
        String str2 = new String(bArr, this.f26898A, L2, StandardCharsets.UTF_8);
        this.f26898A += L2;
        return str2;
    }

    @Override // W7.b
    public final String w() {
        int L2 = L();
        int i = this.f26898A;
        int i4 = this.f26904y;
        int i6 = i4 - i;
        byte[] bArr = this.f26903x;
        if (L2 <= i6 && L2 > 0) {
            this.f26898A = i + L2;
        } else {
            if (L2 == 0) {
                return "";
            }
            if (L2 < 0) {
                throw new C3318hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (L2 <= i4) {
                G(L2);
                this.f26898A = L2;
            } else {
                bArr = I(L2);
            }
        }
        return RL.c(bArr, i, L2);
    }

    @Override // W7.b
    public final HK x() {
        int L2 = L();
        int i = this.f26904y;
        int i4 = this.f26898A;
        int i6 = i - i4;
        byte[] bArr = this.f26903x;
        if (L2 <= i6 && L2 > 0) {
            HK t6 = JK.t(bArr, i4, L2);
            this.f26898A += L2;
            return t6;
        }
        if (L2 == 0) {
            return JK.f26428u;
        }
        if (L2 < 0) {
            throw new C3318hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] J = J(L2);
        if (J != null) {
            return JK.t(J, 0, J.length);
        }
        int i9 = this.f26898A;
        int i10 = this.f26904y;
        int i11 = i10 - i9;
        this.f26900C += i10;
        this.f26898A = 0;
        this.f26904y = 0;
        ArrayList K7 = K(L2 - i11);
        byte[] bArr2 = new byte[L2];
        System.arraycopy(bArr, i9, bArr2, 0, i11);
        Iterator it = K7.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i11, length);
            i11 += length;
        }
        HK hk = JK.f26428u;
        try {
            return L2 == 0 ? JK.f26428u : new HK(bArr2);
        } catch (C3318hL e9) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e9);
        }
    }

    @Override // W7.b
    public final int y() {
        return L();
    }

    @Override // W7.b
    public final int z() {
        return L();
    }
}
