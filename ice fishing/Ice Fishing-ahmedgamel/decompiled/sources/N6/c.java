package N6;

import com.google.android.gms.internal.ads.AbstractC2792Sd;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2045a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2046b;

    /* renamed from: c, reason: collision with root package name */
    public int f2047c;

    /* renamed from: d, reason: collision with root package name */
    public int f2048d;

    public c(byte[] bArr, int i) {
        switch (i) {
            case 1:
                this.f2045a = bArr;
                this.f2046b = bArr.length;
                break;
            default:
                this.f2045a = bArr;
                this.f2046b = bArr.length;
                this.f2047c = 0;
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
        int i4 = this.f2047c;
        byte[] bArr = this.f2045a;
        int i6 = this.f2046b;
        if (i6 != i4) {
            int i9 = i4 + 1;
            byte b9 = bArr[i4];
            if (b9 >= 0) {
                this.f2047c = i9;
                return b9;
            }
            if (i6 - i9 >= 9) {
                int i10 = i4 + 2;
                int i11 = (bArr[i9] << 7) ^ b9;
                if (i11 < 0) {
                    i = i11 ^ (-128);
                } else {
                    int i12 = i4 + 3;
                    int i13 = i11 ^ (bArr[i10] << 14);
                    if (i13 >= 0) {
                        i = i13 ^ 16256;
                    } else {
                        i10 = i4 + 4;
                        int i14 = i13 ^ (bArr[i12] << 21);
                        if (i14 < 0) {
                            i = (-2080896) ^ i14;
                        } else {
                            i12 = i4 + 5;
                            byte b10 = bArr[i10];
                            int i15 = (i14 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i10 = i4 + 6;
                                if (bArr[i12] < 0) {
                                    i12 = i4 + 7;
                                    if (bArr[i10] < 0) {
                                        i10 = i4 + 8;
                                        if (bArr[i12] < 0) {
                                            i12 = i4 + 9;
                                            if (bArr[i10] < 0) {
                                                i10 = i4 + 10;
                                            }
                                        }
                                    }
                                }
                                i = i15;
                            }
                            i = i15;
                        }
                    }
                    i10 = i12;
                }
                this.f2047c = i10;
                return i;
            }
        }
        long j6 = 0;
        for (int i16 = 0; i16 < 64; i16 += 7) {
            int i17 = this.f2047c;
            if (i17 == i6) {
                throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f2047c = i17 + 1;
            j6 |= (r5 & Byte.MAX_VALUE) << i16;
            if ((bArr[i17] & com.anythink.core.common.s.a.c.f17103a) == 0) {
                return (int) j6;
            }
        }
        throw new IOException("CodedInputStream encountered a malformed varint.");
    }

    public void b(int i) {
        if (i >= 0) {
            int i4 = this.f2047c;
            if (i <= this.f2046b - i4) {
                this.f2047c = i4 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public boolean c() {
        int i = (this.f2045a[this.f2047c] & 255) >> this.f2048d;
        e(1);
        return 1 == (i & 1);
    }

    public int d(int i) {
        int i4 = this.f2047c;
        int i6 = i4 + 1;
        int min = Math.min(i, 8 - this.f2048d);
        byte[] bArr = this.f2045a;
        int i9 = ((bArr[i4] & 255) >> this.f2048d) & (com.anythink.basead.exoplayer.k.p.f9259b >> (8 - min));
        while (min < i) {
            i9 |= (bArr[i6] & 255) << min;
            min += 8;
            i6++;
        }
        int i10 = i9 & ((-1) >>> (32 - i));
        e(i);
        return i10;
    }

    public void e(int i) {
        int i4;
        int i6 = i / 8;
        int i9 = this.f2047c + i6;
        this.f2047c = i9;
        int i10 = (i - (i6 * 8)) + this.f2048d;
        this.f2048d = i10;
        if (i10 > 7) {
            i9++;
            this.f2047c = i9;
            i10 -= 8;
            this.f2048d = i10;
        }
        boolean z6 = false;
        if (i9 >= 0 && (i9 < (i4 = this.f2046b) || (i9 == i4 && i10 == 0))) {
            z6 = true;
        }
        AbstractC2792Sd.H(z6);
    }
}
