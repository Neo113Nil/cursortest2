package N6;

import com.google.android.gms.internal.ads.AbstractC2772Sd;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1957a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1958b;

    /* renamed from: c, reason: collision with root package name */
    public int f1959c;

    /* renamed from: d, reason: collision with root package name */
    public int f1960d;

    public c(byte[] bArr, int i) {
        switch (i) {
            case 1:
                this.f1957a = bArr;
                this.f1958b = bArr.length;
                break;
            default:
                this.f1957a = bArr;
                this.f1958b = bArr.length;
                this.f1959c = 0;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        if (r1[r4] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int a() {
        int i;
        int i6 = this.f1959c;
        byte[] bArr = this.f1957a;
        int i9 = this.f1958b;
        if (i9 != i6) {
            int i10 = i6 + 1;
            byte b9 = bArr[i6];
            if (b9 >= 0) {
                this.f1959c = i10;
                return b9;
            }
            if (i9 - i10 >= 9) {
                int i11 = i6 + 2;
                int i12 = (bArr[i10] << 7) ^ b9;
                if (i12 < 0) {
                    i = i12 ^ (-128);
                } else {
                    int i13 = i6 + 3;
                    int i14 = i12 ^ (bArr[i11] << 14);
                    if (i14 >= 0) {
                        i = i14 ^ 16256;
                    } else {
                        i11 = i6 + 4;
                        int i15 = i14 ^ (bArr[i13] << 21);
                        if (i15 < 0) {
                            i = (-2080896) ^ i15;
                        } else {
                            i13 = i6 + 5;
                            byte b10 = bArr[i11];
                            int i16 = (i15 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i11 = i6 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i6 + 7;
                                    if (bArr[i11] < 0) {
                                        i11 = i6 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i6 + 9;
                                            if (bArr[i11] < 0) {
                                                i11 = i6 + 10;
                                            }
                                        }
                                    }
                                }
                                i = i16;
                            }
                            i = i16;
                        }
                    }
                    i11 = i13;
                }
                this.f1959c = i11;
                return i;
            }
        }
        long j6 = 0;
        for (int i17 = 0; i17 < 64; i17 += 7) {
            int i18 = this.f1959c;
            if (i18 == i9) {
                throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f1959c = i18 + 1;
            j6 |= (r5 & Byte.MAX_VALUE) << i17;
            if ((bArr[i18] & com.anythink.core.common.s.a.c.f16316a) == 0) {
                return (int) j6;
            }
        }
        throw new IOException("CodedInputStream encountered a malformed varint.");
    }

    public void b(int i) {
        if (i >= 0) {
            int i6 = this.f1959c;
            if (i <= this.f1958b - i6) {
                this.f1959c = i6 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public boolean c() {
        int i = (this.f1957a[this.f1959c] & 255) >> this.f1960d;
        e(1);
        return 1 == (i & 1);
    }

    public int d(int i) {
        int i6 = this.f1959c;
        int i9 = i6 + 1;
        int min = Math.min(i, 8 - this.f1960d);
        byte[] bArr = this.f1957a;
        int i10 = ((bArr[i6] & 255) >> this.f1960d) & (com.anythink.basead.exoplayer.k.p.f8473b >> (8 - min));
        while (min < i) {
            i10 |= (bArr[i9] & 255) << min;
            min += 8;
            i9++;
        }
        int i11 = i10 & ((-1) >>> (32 - i));
        e(i);
        return i11;
    }

    public void e(int i) {
        int i6;
        int i9 = i / 8;
        int i10 = this.f1959c + i9;
        this.f1959c = i10;
        int i11 = (i - (i9 * 8)) + this.f1960d;
        this.f1960d = i11;
        if (i11 > 7) {
            i10++;
            this.f1959c = i10;
            i11 -= 8;
            this.f1960d = i11;
        }
        boolean z3 = false;
        if (i10 >= 0 && (i10 < (i6 = this.f1958b) || (i10 == i6 && i11 == 0))) {
            z3 = true;
        }
        AbstractC2772Sd.H(z3);
    }
}
