package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class LK extends W7.b {

    /* renamed from: B, reason: collision with root package name */
    public int f26099B;

    /* renamed from: w, reason: collision with root package name */
    public final InputStream f26102w;

    /* renamed from: z, reason: collision with root package name */
    public int f26105z;

    /* renamed from: D, reason: collision with root package name */
    public int f26101D = Integer.MAX_VALUE;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f26103x = new byte[4096];

    /* renamed from: y, reason: collision with root package name */
    public int f26104y = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f26098A = 0;

    /* renamed from: C, reason: collision with root package name */
    public int f26100C = 0;

    public /* synthetic */ LK(InputStream inputStream) {
        this.f26102w = inputStream;
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
        InputStream inputStream = this.f26102w;
        int i6 = this.f26104y;
        int i9 = this.f26098A;
        int i10 = i6 - i9;
        if (i <= i10 && i >= 0) {
            this.f26098A = i9 + i;
            return;
        }
        if (i < 0) {
            throw new C3295hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f26100C;
        int i12 = i11 + i9;
        int i13 = this.f26101D;
        if (i12 + i > i13) {
            E((i13 - i11) - i9);
            throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f26100C = i12;
        this.f26104y = 0;
        this.f26098A = 0;
        while (i10 < i) {
            long j6 = i - i10;
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
                        i10 += (int) skip;
                    }
                } catch (C3295hL e9) {
                    e9.f30760n = true;
                    throw e9;
                }
            } catch (Throwable th) {
                this.f26100C += i10;
                F();
                throw th;
            }
        }
        this.f26100C += i10;
        F();
        if (i10 >= i) {
            return;
        }
        int i14 = this.f26104y;
        int i15 = i14 - this.f26098A;
        this.f26098A = i14;
        G(1);
        while (true) {
            int i16 = i - i15;
            int i17 = this.f26104y;
            if (i16 <= i17) {
                this.f26098A = i16;
                return;
            } else {
                i15 += i17;
                this.f26098A = i17;
                G(1);
            }
        }
    }

    public final void F() {
        int i = this.f26104y + this.f26105z;
        this.f26104y = i;
        int i6 = this.f26100C + i;
        int i9 = this.f26101D;
        if (i6 <= i9) {
            this.f26105z = 0;
            return;
        }
        int i10 = i6 - i9;
        this.f26105z = i10;
        this.f26104y = i - i10;
    }

    public final void G(int i) {
        if (H(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f26100C) - this.f26098A) {
            throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C3295hL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final boolean H(int i) {
        InputStream inputStream = this.f26102w;
        int i6 = this.f26098A;
        int i9 = i6 + i;
        int i10 = this.f26104y;
        if (i9 <= i10) {
            throw new IllegalStateException(u1.h.d(i, "refillBuffer() called when ", " bytes were already available in buffer", new StringBuilder(String.valueOf(i).length() + 66)));
        }
        int i11 = this.f26100C;
        if (i > (Integer.MAX_VALUE - i11) - i6 || i11 + i6 + i > this.f26101D) {
            return false;
        }
        byte[] bArr = this.f26103x;
        if (i6 > 0) {
            if (i10 > i6) {
                System.arraycopy(bArr, i6, bArr, 0, i10 - i6);
            }
            i11 = this.f26100C + i6;
            this.f26100C = i11;
            i10 = this.f26104y - i6;
            this.f26104y = i10;
            this.f26098A = 0;
        }
        try {
            int read = inputStream.read(bArr, i10, Math.min(4096 - i10, (Integer.MAX_VALUE - i11) - i10));
            if (read != 0 && read >= -1 && read <= 4096) {
                if (read <= 0) {
                    return false;
                }
                this.f26104y += read;
                F();
                return this.f26104y >= i || H(i);
            }
            String valueOf = String.valueOf(inputStream.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(read).length() + valueOf.length() + 39 + 41);
            sb.append(valueOf);
            sb.append("#read(byte[]) returned invalid result: ");
            sb.append(read);
            sb.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb.toString());
        } catch (C3295hL e9) {
            e9.f30760n = true;
            throw e9;
        }
    }

    public final byte[] I(int i) {
        byte[] J = J(i);
        if (J != null) {
            return J;
        }
        int i6 = this.f26098A;
        int i9 = this.f26104y;
        int i10 = i9 - i6;
        this.f26100C += i9;
        this.f26098A = 0;
        this.f26104y = 0;
        ArrayList K7 = K(i - i10);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f26103x, i6, bArr, 0, i10);
        Iterator it = K7.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i10, length);
            i10 += length;
        }
        return bArr;
    }

    public final byte[] J(int i) {
        if (i == 0) {
            return AbstractC3080dL.f29746a;
        }
        int i6 = this.f26100C;
        int i9 = this.f26098A;
        int i10 = i6 + i9 + i;
        if ((-2147483647) + i10 > 0) {
            throw new C3295hL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.f26101D;
        if (i10 > i11) {
            E((i11 - i6) - i9);
            throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = this.f26104y - i9;
        int i13 = i - i12;
        InputStream inputStream = this.f26102w;
        if (i13 >= 4096) {
            try {
                if (i13 > inputStream.available()) {
                    return null;
                }
            } catch (C3295hL e9) {
                e9.f30760n = true;
                throw e9;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f26103x, this.f26098A, bArr, 0, i12);
        this.f26100C += this.f26104y;
        this.f26098A = 0;
        this.f26104y = 0;
        while (i12 < i) {
            try {
                int read = inputStream.read(bArr, i12, i - i12);
                if (read == -1) {
                    throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f26100C += read;
                i12 += read;
            } catch (C3295hL e10) {
                e10.f30760n = true;
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
            int i6 = 0;
            while (i6 < min) {
                try {
                    int read = this.f26102w.read(bArr, i6, min - i6);
                    if (read == -1) {
                        throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.f26100C += read;
                    i6 += read;
                } catch (C3295hL e9) {
                    e9.f30760n = true;
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
        int i6 = this.f26098A;
        int i9 = this.f26104y;
        if (i9 != i6) {
            int i10 = i6 + 1;
            byte[] bArr = this.f26103x;
            byte b9 = bArr[i6];
            if (b9 >= 0) {
                this.f26098A = i10;
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
                this.f26098A = i11;
                return i;
            }
        }
        return (int) N();
    }

    public final long M() {
        long j6;
        long j9;
        long j10;
        int i = this.f26098A;
        int i6 = this.f26104y;
        if (i6 != i) {
            int i9 = i + 1;
            byte[] bArr = this.f26103x;
            byte b9 = bArr[i];
            if (b9 >= 0) {
                this.f26098A = i9;
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
                this.f26098A = i10;
                return j6;
            }
        }
        return N();
    }

    public final long N() {
        long j6 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f26098A == this.f26104y) {
                G(1);
            }
            int i6 = this.f26098A;
            this.f26098A = i6 + 1;
            j6 |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f26103x[i6] & com.anythink.core.common.s.a.c.f16316a) == 0) {
                return j6;
            }
        }
        throw new C3295hL("CodedInputStream encountered a malformed varint.");
    }

    public final int O() {
        int i = this.f26098A;
        if (this.f26104y - i < 4) {
            G(4);
            i = this.f26098A;
        }
        this.f26098A = i + 4;
        byte[] bArr = this.f26103x;
        int i6 = bArr[i] & 255;
        int i9 = bArr[i + 1] & 255;
        int i10 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i9 << 8) | i6 | (i10 << 16);
    }

    public final long P() {
        int i = this.f26098A;
        if (this.f26104y - i < 8) {
            G(8);
            i = this.f26098A;
        }
        this.f26098A = i + 8;
        byte[] bArr = this.f26103x;
        long j6 = bArr[i];
        long j9 = bArr[i + 2];
        long j10 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j6 & 255) | ((bArr[i + 1] & 255) << 8) | ((j9 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // W7.b
    public final int b(int i) {
        if (i < 0) {
            throw new C3295hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i6 = this.f26100C + this.f26098A + i;
        if (i6 < 0) {
            throw new C3295hL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i9 = this.f26101D;
        if (i6 > i9) {
            throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f26101D = i6;
        F();
        return i9;
    }

    @Override // W7.b
    public final void c(int i) {
        this.f26101D = i;
        F();
    }

    @Override // W7.b
    public final boolean d() {
        return this.f26098A == this.f26104y && !H(1);
    }

    @Override // W7.b
    public final int e() {
        return this.f26100C + this.f26098A;
    }

    @Override // W7.b
    public final int j() {
        if (d()) {
            this.f26099B = 0;
            return 0;
        }
        int L6 = L();
        this.f26099B = L6;
        if ((L6 >>> 3) != 0) {
            return L6;
        }
        throw new C3295hL("Protocol message contained an invalid tag (zero).");
    }

    @Override // W7.b
    public final void k(int i) {
        if (this.f26099B != i) {
            throw new C3295hL("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // W7.b
    public final boolean l(int i) {
        int i6 = i & 7;
        int i9 = 0;
        if (i6 != 0) {
            if (i6 == 1) {
                E(8);
                return true;
            }
            if (i6 == 2) {
                E(L());
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
            E(4);
            return true;
        }
        int i10 = this.f26104y - this.f26098A;
        byte[] bArr = this.f26103x;
        if (i10 >= 10) {
            while (i9 < 10) {
                int i11 = this.f26098A;
                this.f26098A = i11 + 1;
                if (bArr[i11] < 0) {
                    i9++;
                }
            }
            throw new C3295hL("CodedInputStream encountered a malformed varint.");
        }
        while (i9 < 10) {
            if (this.f26098A == this.f26104y) {
                G(1);
            }
            int i12 = this.f26098A;
            this.f26098A = i12 + 1;
            if (bArr[i12] < 0) {
                i9++;
            }
        }
        throw new C3295hL("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // W7.b
    public final double m() {
        return Double.longBitsToDouble(P());
    }

    @Override // W7.b
    public final float n() {
        return Float.intBitsToFloat(O());
    }

    @Override // W7.b
    public final long o() {
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
        int L6 = L();
        byte[] bArr = this.f26103x;
        if (L6 > 0) {
            int i = this.f26104y;
            int i6 = this.f26098A;
            if (L6 <= i - i6) {
                String str = new String(bArr, i6, L6, StandardCharsets.UTF_8);
                this.f26098A += L6;
                return str;
            }
        }
        if (L6 == 0) {
            return "";
        }
        if (L6 < 0) {
            throw new C3295hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (L6 > this.f26104y) {
            return new String(I(L6), StandardCharsets.UTF_8);
        }
        G(L6);
        String str2 = new String(bArr, this.f26098A, L6, StandardCharsets.UTF_8);
        this.f26098A += L6;
        return str2;
    }

    @Override // W7.b
    public final String w() {
        int L6 = L();
        int i = this.f26098A;
        int i6 = this.f26104y;
        int i9 = i6 - i;
        byte[] bArr = this.f26103x;
        if (L6 <= i9 && L6 > 0) {
            this.f26098A = i + L6;
        } else {
            if (L6 == 0) {
                return "";
            }
            if (L6 < 0) {
                throw new C3295hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (L6 <= i6) {
                G(L6);
                this.f26098A = L6;
            } else {
                bArr = I(L6);
            }
        }
        return RL.c(bArr, i, L6);
    }

    @Override // W7.b
    public final HK x() {
        int L6 = L();
        int i = this.f26104y;
        int i6 = this.f26098A;
        int i9 = i - i6;
        byte[] bArr = this.f26103x;
        if (L6 <= i9 && L6 > 0) {
            HK t6 = JK.t(bArr, i6, L6);
            this.f26098A += L6;
            return t6;
        }
        if (L6 == 0) {
            return JK.f25675u;
        }
        if (L6 < 0) {
            throw new C3295hL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] J = J(L6);
        if (J != null) {
            return JK.t(J, 0, J.length);
        }
        int i10 = this.f26098A;
        int i11 = this.f26104y;
        int i12 = i11 - i10;
        this.f26100C += i11;
        this.f26098A = 0;
        this.f26104y = 0;
        ArrayList K7 = K(L6 - i12);
        byte[] bArr2 = new byte[L6];
        System.arraycopy(bArr, i10, bArr2, 0, i12);
        Iterator it = K7.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i12, length);
            i12 += length;
        }
        HK hk = JK.f25675u;
        try {
            return L6 == 0 ? JK.f25675u : new HK(bArr2);
        } catch (C3295hL e9) {
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
