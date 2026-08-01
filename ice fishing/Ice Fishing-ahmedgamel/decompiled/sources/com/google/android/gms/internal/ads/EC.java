package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public class EC {

    /* renamed from: d, reason: collision with root package name */
    public static final CC f24555d = new CC("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* renamed from: e, reason: collision with root package name */
    public static final CC f24556e = new CC("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* renamed from: f, reason: collision with root package name */
    public static final BC f24557f;

    /* renamed from: a, reason: collision with root package name */
    public final AC f24558a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f24559b;

    /* renamed from: c, reason: collision with root package name */
    public volatile EC f24560c;

    static {
        new EC("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new EC("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f24557f = new BC(new AC("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public EC(AC ac, Character ch) {
        this.f24558a = ac;
        boolean z3 = true;
        if (ch != null) {
            byte[] bArr = ac.f23656g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z3 = false;
            }
        }
        AbstractC2772Sd.C(z3, "Padding character %s was already in alphabet", ch);
        this.f24559b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i6 = 0;
        AbstractC2772Sd.M(0, i, bArr.length);
        while (i6 < i) {
            int i9 = this.f24558a.f23655f;
            d(sb, bArr, i6, Math.min(i9, i - i6));
            i6 += i9;
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) {
        int i;
        CharSequence e9 = e(charSequence);
        int length = e9.length();
        AC ac = this.f24558a;
        boolean[] zArr = ac.f23657h;
        int i6 = ac.f23654e;
        if (!zArr[length % i6]) {
            int length2 = e9.length();
            throw new DC(D.y.m(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i9 = 0;
        for (int i10 = 0; i10 < e9.length(); i10 += i6) {
            long j6 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                i = ac.f23653d;
                if (i11 >= i6) {
                    break;
                }
                j6 <<= i;
                if (i10 + i11 < e9.length()) {
                    j6 |= ac.a(e9.charAt(i12 + i10));
                    i12++;
                }
                i11++;
            }
            int i13 = i12 * i;
            int i14 = ac.f23655f;
            int i15 = (i14 - 1) * 8;
            while (i15 >= (i14 * 8) - i13) {
                bArr[i9] = (byte) ((j6 >>> i15) & 255);
                i15 -= 8;
                i9++;
            }
        }
        return i9;
    }

    public EC c(AC ac, Character ch) {
        return new EC(ac, ch);
    }

    public final void d(StringBuilder sb, byte[] bArr, int i, int i6) {
        int i9;
        AbstractC2772Sd.M(i, i + i6, bArr.length);
        AC ac = this.f24558a;
        int i10 = ac.f23655f;
        int i11 = 0;
        AbstractC2772Sd.i(i6 <= i10);
        long j6 = 0;
        for (int i12 = 0; i12 < i6; i12++) {
            j6 = (j6 | (bArr[i + i12] & 255)) << 8;
        }
        int i13 = (i6 + 1) * 8;
        while (true) {
            int i14 = i6 * 8;
            i9 = ac.f23653d;
            if (i11 >= i14) {
                break;
            }
            sb.append(ac.f23651b[ac.f23652c & ((int) (j6 >>> ((i13 - i9) - i11)))]);
            i11 += i9;
        }
        if (this.f24559b != null) {
            while (i11 < i10 * 8) {
                sb.append('=');
                i11 += i9;
            }
        }
    }

    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f24559b == null) {
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
            if (this.f24558a.equals(ec.f24558a) && Objects.equals(this.f24559b, ec.f24559b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    public final EC f() {
        AC ac;
        boolean z3;
        EC ec = this.f24560c;
        if (ec == null) {
            AC ac2 = this.f24558a;
            int i = 0;
            while (true) {
                char[] cArr = ac2.f23651b;
                int length = cArr.length;
                if (i >= length) {
                    ac = ac2;
                    break;
                }
                if (AbstractC3043cl.C(cArr[i])) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            z3 = false;
                            break;
                        }
                        char c9 = cArr[i6];
                        if (c9 >= 'a' && c9 <= 'z') {
                            z3 = true;
                            break;
                        }
                        i6++;
                    }
                    AbstractC2772Sd.I("Cannot call lowerCase() on a mixed-case alphabet", !z3);
                    char[] cArr2 = new char[cArr.length];
                    for (int i9 = 0; i9 < cArr.length; i9++) {
                        char c10 = cArr[i9];
                        if (AbstractC3043cl.C(c10)) {
                            c10 ^= 32;
                        }
                        cArr2[i9] = (char) c10;
                    }
                    ac = new AC(ac2.f23650a.concat(".lowerCase()"), cArr2);
                    if (ac2.i && !ac.i) {
                        byte[] bArr = ac.f23656g;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i10 = 65; i10 <= 90; i10++) {
                            int i11 = i10 | 32;
                            byte b9 = bArr[i10];
                            byte b10 = bArr[i11];
                            if (b9 == -1) {
                                copyOf[i10] = b10;
                            } else {
                                char c11 = (char) i10;
                                char c12 = (char) i11;
                                if (b10 != -1) {
                                    throw new IllegalStateException(AbstractC2639Kg.x("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                                }
                                copyOf[i11] = b9;
                            }
                        }
                        ac = new AC(ac.f23650a.concat(".ignoreCase()"), ac.f23651b, copyOf, true);
                    }
                } else {
                    i++;
                }
            }
            ec = ac == ac2 ? this : c(ac, this.f24559b);
            this.f24560c = ec;
        }
        return ec;
    }

    public final String g(int i, byte[] bArr) {
        AbstractC2772Sd.M(0, i, bArr.length);
        AC ac = this.f24558a;
        int i6 = ac.f23655f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(ac.f23654e * AbstractC2968bG.p(i, i6));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }

    public final byte[] h(String str) {
        try {
            int length = (int) (((this.f24558a.f23653d * r6.length()) + 7) / 8);
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
        return this.f24558a.hashCode() ^ Objects.hashCode(this.f24559b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        AC ac = this.f24558a;
        sb.append(ac);
        if (8 % ac.f23653d != 0) {
            Character ch = this.f24559b;
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
