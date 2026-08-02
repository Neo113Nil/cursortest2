package defpackage;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public final class y8c extends y170 {
    public static void h(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    @Override // defpackage.y170
    public final boolean[] d(String str) {
        int length = str.length();
        if (length > 80) {
            ny61.g(oyr.i(length, "Requested contents should be less than 80 digits long, but got "));
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                int length2 = str.length();
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < length2; i2++) {
                    char charAt = str.charAt(i2);
                    if (charAt != 0) {
                        if (charAt != ' ') {
                            if (charAt == '@') {
                                sb.append("%V");
                            } else if (charAt == '`') {
                                sb.append("%W");
                            } else if (charAt != '-' && charAt != '.') {
                                if (charAt <= 26) {
                                    sb.append('$');
                                    sb.append((char) (charAt + '@'));
                                } else if (charAt < ' ') {
                                    sb.append('%');
                                    sb.append((char) (charAt + '&'));
                                } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                                    sb.append('/');
                                    sb.append((char) (charAt + HexString.CHAR_SPACE));
                                } else if (charAt <= '9') {
                                    sb.append(charAt);
                                } else if (charAt <= '?') {
                                    sb.append('%');
                                    sb.append((char) (charAt + 11));
                                } else if (charAt <= 'Z') {
                                    sb.append(charAt);
                                } else if (charAt <= '_') {
                                    sb.append('%');
                                    sb.append((char) (charAt - 16));
                                } else if (charAt <= 'z') {
                                    sb.append('+');
                                    sb.append((char) (charAt - ' '));
                                } else {
                                    if (charAt > 127) {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i2) + "'");
                                    }
                                    sb.append('%');
                                    sb.append((char) (charAt - '+'));
                                }
                            }
                        }
                        sb.append(charAt);
                    } else {
                        sb.append("%U");
                    }
                }
                str = sb.toString();
                length = str.length();
                if (length > 80) {
                    ny61.g(oyr.j(length, "Requested contents should be less than 80 digits long, but got ", " (extended full ASCII mode)"));
                    return null;
                }
            } else {
                i++;
            }
        }
        int[] iArr = new int[9];
        boolean[] zArr = new boolean[(length * 13) + 25];
        h(148, iArr);
        int b = y170.b(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int b2 = y170.b(zArr, b, iArr2, false) + b;
        for (int i3 = 0; i3 < length; i3++) {
            h(x8c.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i3))], iArr);
            int b3 = y170.b(zArr, b2, iArr, true) + b2;
            b2 = y170.b(zArr, b3, iArr2, false) + b3;
        }
        h(148, iArr);
        y170.b(zArr, b2, iArr, true);
        return zArr;
    }

    @Override // defpackage.y170
    public final Collection g() {
        return Collections.singleton(BarcodeFormat.CODE_39);
    }
}
