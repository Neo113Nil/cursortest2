package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public class EC {

    /* renamed from: d, reason: collision with root package name */
    public static final CC f25316d = new CC("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* renamed from: e, reason: collision with root package name */
    public static final CC f25317e = new CC("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* renamed from: f, reason: collision with root package name */
    public static final BC f25318f;

    /* renamed from: a, reason: collision with root package name */
    public final AC f25319a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f25320b;

    /* renamed from: c, reason: collision with root package name */
    public volatile EC f25321c;

    static {
        new EC("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new EC("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f25318f = new BC(new AC("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public EC(AC ac, Character ch) {
        this.f25319a = ac;
        boolean z6 = true;
        if (ch != null) {
            byte[] bArr = ac.f24436g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z6 = false;
            }
        }
        AbstractC2792Sd.C(z6, "Padding character %s was already in alphabet", ch);
        this.f25320b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i4 = 0;
        AbstractC2792Sd.M(0, i, bArr.length);
        while (i4 < i) {
            int i6 = this.f25319a.f24435f;
            d(sb, bArr, i4, Math.min(i6, i - i4));
            i4 += i6;
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) {
        int i;
        CharSequence e9 = e(charSequence);
        int length = e9.length();
        AC ac = this.f25319a;
        boolean[] zArr = ac.f24437h;
        int i4 = ac.f24434e;
        if (!zArr[length % i4]) {
            int length2 = e9.length();
            throw new DC(D.x.k(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i6 = 0;
        for (int i9 = 0; i9 < e9.length(); i9 += i4) {
            long j6 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                i = ac.f24433d;
                if (i10 >= i4) {
                    break;
                }
                j6 <<= i;
                if (i9 + i10 < e9.length()) {
                    j6 |= ac.a(e9.charAt(i11 + i9));
                    i11++;
                }
                i10++;
            }
            int i12 = i11 * i;
            int i13 = ac.f24435f;
            int i14 = (i13 - 1) * 8;
            while (i14 >= (i13 * 8) - i12) {
                bArr[i6] = (byte) ((j6 >>> i14) & 255);
                i14 -= 8;
                i6++;
            }
        }
        return i6;
    }

    public EC c(AC ac, Character ch) {
        return new EC(ac, ch);
    }

    public final void d(StringBuilder sb, byte[] bArr, int i, int i4) {
        int i6;
        AbstractC2792Sd.M(i, i + i4, bArr.length);
        AC ac = this.f25319a;
        int i9 = ac.f24435f;
        int i10 = 0;
        AbstractC2792Sd.i(i4 <= i9);
        long j6 = 0;
        for (int i11 = 0; i11 < i4; i11++) {
            j6 = (j6 | (bArr[i + i11] & 255)) << 8;
        }
        int i12 = (i4 + 1) * 8;
        while (true) {
            int i13 = i4 * 8;
            i6 = ac.f24433d;
            if (i10 >= i13) {
                break;
            }
            sb.append(ac.f24431b[ac.f24432c & ((int) (j6 >>> ((i12 - i6) - i10)))]);
            i10 += i6;
        }
        if (this.f25320b != null) {
            while (i10 < i9 * 8) {
                sb.append('=');
                i10 += i6;
            }
        }
    }

    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f25320b == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof EC) {
            EC ec = (EC) obj;
            if (this.f25319a.equals(ec.f25319a) && Objects.equals(this.f25320b, ec.f25320b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    public final EC f() {
        AC ac;
        boolean z6;
        EC ec = this.f25321c;
        if (ec == null) {
            AC ac2 = this.f25319a;
            int i = 0;
            while (true) {
                char[] cArr = ac2.f24431b;
                int length = cArr.length;
                if (i >= length) {
                    ac = ac2;
                    break;
                }
                if (AbstractC3066cl.C(cArr[i])) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            z6 = false;
                            break;
                        }
                        char c9 = cArr[i4];
                        if (c9 >= 'a' && c9 <= 'z') {
                            z6 = true;
                            break;
                        }
                        i4++;
                    }
                    AbstractC2792Sd.I("Cannot call lowerCase() on a mixed-case alphabet", !z6);
                    char[] cArr2 = new char[cArr.length];
                    for (int i6 = 0; i6 < cArr.length; i6++) {
                        char c10 = cArr[i6];
                        if (AbstractC3066cl.C(c10)) {
                            c10 ^= 32;
                        }
                        cArr2[i6] = (char) c10;
                    }
                    ac = new AC(ac2.f24430a.concat(".lowerCase()"), cArr2);
                    if (ac2.i && !ac.i) {
                        byte[] bArr = ac.f24436g;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i9 = 65; i9 <= 90; i9++) {
                            int i10 = i9 | 32;
                            byte b9 = bArr[i9];
                            byte b10 = bArr[i10];
                            if (b9 == -1) {
                                copyOf[i9] = b10;
                            } else {
                                char c11 = (char) i9;
                                char c12 = (char) i10;
                                if (b10 != -1) {
                                    throw new IllegalStateException(AbstractC2659Kg.x("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                                }
                                copyOf[i10] = b9;
                            }
                        }
                        ac = new AC(ac.f24430a.concat(".ignoreCase()"), ac.f24431b, copyOf, true);
                    }
                } else {
                    i++;
                }
            }
            ec = ac == ac2 ? this : c(ac, this.f25320b);
            this.f25321c = ec;
        }
        return ec;
    }

    public final String g(int i, byte[] bArr) {
        AbstractC2792Sd.M(0, i, bArr.length);
        AC ac = this.f25319a;
        int i4 = ac.f24435f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(ac.f24434e * AbstractC2991bG.p(i, i4));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }

    public final byte[] h(String str) {
        try {
            int length = (int) (((this.f25319a.f24433d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int b9 = b(bArr, e(str));
            if (b9 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[b9];
            System.arraycopy(bArr, 0, bArr2, 0, b9);
            return bArr2;
        } catch (DC e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public final int hashCode() {
        return this.f25319a.hashCode() ^ Objects.hashCode(this.f25320b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        AC ac = this.f25319a;
        sb.append(ac);
        if (8 % ac.f24433d != 0) {
            Character ch = this.f25320b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public EC(String str, String str2) {
        this(new AC(str, str2.toCharArray()), (Character) '=');
    }
}
