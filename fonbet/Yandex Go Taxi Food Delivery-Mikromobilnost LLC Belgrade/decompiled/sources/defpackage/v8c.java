package defpackage;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes11.dex */
public final class v8c extends y170 {
    public static final char[] b;
    public static final char[] c = {'T', 'N', '*', 'E'};
    public static final char[] d = {'/', ':', '+', '.'};
    public static final char e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        b = cArr;
        e = cArr[0];
    }

    @Override // defpackage.y170
    public final boolean[] d(String str) {
        int i;
        int length = str.length();
        char c2 = e;
        if (length < 2) {
            str = c2 + str + c2;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = b;
            boolean a = u8c.a(cArr, upperCase);
            boolean a2 = u8c.a(cArr, upperCase2);
            char[] cArr2 = c;
            boolean a3 = u8c.a(cArr2, upperCase);
            boolean a4 = u8c.a(cArr2, upperCase2);
            if (a) {
                if (!a2) {
                    ny61.g("Invalid start/end guards: ".concat(str));
                    return null;
                }
            } else if (!a3) {
                if (a2 || a4) {
                    ny61.g("Invalid start/end guards: ".concat(str));
                    return null;
                }
                str = c2 + str + c2;
            } else if (!a4) {
                ny61.g("Invalid start/end guards: ".concat(str));
                return null;
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!u8c.a(d, str.charAt(i3))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i2];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                if (i6 >= 20) {
                    i = 0;
                    break;
                }
                if (upperCase3 == u8c.a[i6]) {
                    i = u8c.b[i6];
                    break;
                }
                i6++;
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }

    @Override // defpackage.y170
    public final Collection g() {
        return Collections.singleton(BarcodeFormat.CODABAR);
    }
}
