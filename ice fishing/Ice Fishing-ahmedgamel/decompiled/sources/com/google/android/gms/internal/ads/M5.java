package com.google.android.gms.internal.ads;

import com.icefishingapp.icefishing.AbstractC4404f;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class M5 {

    /* renamed from: b, reason: collision with root package name */
    public static final M5 f26245b = new M5(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f26246a;

    public M5(byte[] bArr) {
        this.f26246a = bArr;
    }

    public static M5 e(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        if (length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            bArr2 = bArr3;
        }
        return new M5(bArr2);
    }

    public static int f(byte b9) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        return b9 & (com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, iArr[5], iArr[6]) ^ (iArr[7] % 837626799));
    }

    public final byte[] a() {
        byte[] bArr = this.f26246a;
        int length = bArr.length;
        if (length == 0) {
            return new byte[0];
        }
        if (length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final byte b(int i) {
        int i6 = ((((~2106914653) & 587408197) | 1537377410) + ((2106914653 & 536945509) | 443419704)) - 2137956065;
        int i9 = 2013725218 % 1633938701;
        int i10 = ((((~1287859999) & 62941354) | 437464817) + ((1287859999 & 1639989262) | 1644309956)) - 2060977796;
        int i11 = 1442767057 % 63299708;
        byte[] bArr = this.f26246a;
        int length = bArr.length;
        if (((length - (i + 1)) | i) >= 0) {
            return bArr[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(AbstractC4404f.b(i, i6 ^ i9));
            sb.append(L5.a("Akelqh1fajntGgo="));
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(AbstractC4404f.b(length, AbstractC4404f.b(i, i10 ^ i11)));
        sb2.append(L5.a("Akelqh1faDmxRUSK1T9GeQ=="));
        sb2.append(i);
        sb2.append(L5.a("Zwk="));
        sb2.append(length);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final String c() {
        Charset forName = Charset.forName(L5.a("Hn2H4l0="));
        byte[] bArr = this.f26246a;
        return new String(bArr, 0, bArr.length, forName);
    }

    public final M5 d(M5 m52) {
        byte[] bArr = m52.f26246a;
        int length = bArr.length;
        byte[] bArr2 = this.f26246a;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return e(bArr3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof M5) {
            return Arrays.equals(this.f26246a, ((M5) obj).f26246a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(Arrays.hashCode(this.f26246a));
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int g4 = com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, i12, i13);
        String arrays = Arrays.toString(this.f26246a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + ((i14 % 981766422) ^ g4));
        sb.append(L5.a("CVC1qiQNJHikW0iU1TIPZA=="));
        sb.append(arrays);
        sb.append(L5.a("Ng=="));
        return sb.toString();
    }
}
