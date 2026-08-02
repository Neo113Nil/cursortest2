package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes3.dex */
public class ar2 {
    public static final yq2 c = new yq2("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public final wq2 a;
    public final Character b;

    static {
        new yq2("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new ar2("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new ar2("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new xq2(new wq2("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public ar2(wq2 wq2Var, Character ch) {
        boolean z;
        wq2Var.getClass();
        this.a = wq2Var;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = wq2Var.g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                o2g.H(ch, "Padding character %s was already in alphabet", z);
                this.b = ch;
            }
        }
        z = true;
        o2g.H(ch, "Padding character %s was already in alphabet", z);
        this.b = ch;
    }

    public final byte[] a(String str) {
        try {
            int length = (int) (((this.a.d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int b = b(bArr, f(str));
            if (b == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[b];
            System.arraycopy(bArr, 0, bArr2, 0, b);
            return bArr2;
        } catch (zq2 e) {
            xq0.t(e);
            return null;
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) {
        CharSequence f = f(charSequence);
        int length = f.length();
        wq2 wq2Var = this.a;
        boolean[] zArr = wq2Var.h;
        int i = wq2Var.d;
        int i2 = wq2Var.e;
        if (!zArr[length % i2]) {
            throw new zq2("Invalid input length " + f.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < f.length(); i4 += i2) {
            long j = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                j <<= i;
                if (i4 + i6 < f.length()) {
                    j |= wq2Var.a(f.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = wq2Var.f;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((j >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    public final String c(byte[] bArr) {
        int length = bArr.length;
        o2g.Q(0, length, bArr.length);
        wq2 wq2Var = this.a;
        int i = wq2Var.e;
        int i2 = wq2Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(pd.E(length, i2) * i);
        try {
            e(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            xq0.w(e);
            return null;
        }
    }

    public final void d(StringBuilder sb, byte[] bArr, int i, int i2) {
        o2g.Q(i, i + i2, bArr.length);
        wq2 wq2Var = this.a;
        int i3 = wq2Var.f;
        int i4 = wq2Var.d;
        int i5 = 0;
        o2g.L(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & 255)) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(wq2Var.b[((int) (j >>> (i7 - i5))) & wq2Var.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < wq2Var.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void e(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        o2g.Q(0, i, bArr.length);
        while (i2 < i) {
            wq2 wq2Var = this.a;
            d(sb, bArr, i2, Math.min(wq2Var.f, i - i2));
            i2 += wq2Var.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ar2) {
            ar2 ar2Var = (ar2) obj;
            if (this.a.equals(ar2Var.a) && Objects.equals(this.b, ar2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final CharSequence f(CharSequence charSequence) {
        Character ch = this.b;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == charValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Objects.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        wq2 wq2Var = this.a;
        sb.append(wq2Var);
        if (8 % wq2Var.d != 0) {
            Character ch = this.b;
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

    public ar2(String str, String str2) {
        this(new wq2(str, str2.toCharArray()), (Character) '=');
    }
}
