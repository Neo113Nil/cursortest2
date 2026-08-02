package ru.CryptoPro.reprov.array.normalizer;

import com.ybsdk.widgets.common.MoneyInputEditView;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes4.dex */
public class Utility {
    static final char ESCAPE = 42405;
    static final byte ESCAPE_BYTE = -91;
    static final char[] HEX_DIGIT = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static byte[] RLEStringToByteArray(String str) {
        char c;
        int i;
        byte b;
        int charAt = (str.charAt(0) << 16) | str.charAt(1);
        byte[] bArr = new byte[charAt];
        int i2 = 0;
        char c2 = 0;
        char c3 = 0;
        int i3 = 0;
        boolean z = true;
        int i4 = 2;
        while (i2 < charAt) {
            if (z) {
                int i5 = i4 + 1;
                char charAt2 = str.charAt(i4);
                byte b2 = (byte) (charAt2 >> '\b');
                c = charAt2;
                i = i5;
                z = false;
                b = b2;
            } else {
                byte b3 = (byte) (c3 & 255);
                c = c3;
                i = i4;
                b = b3;
                z = true;
            }
            int i6 = b;
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 == 2) {
                        int i7 = 0;
                        while (i7 < i3) {
                            bArr[i2] = b;
                            i7++;
                            i2++;
                        }
                        c2 = 0;
                    }
                } else if (b == -91) {
                    bArr[i2] = ESCAPE_BYTE;
                    i2++;
                    c2 = 0;
                } else {
                    if (b < 0) {
                        i6 = b + 256;
                    }
                    i3 = i6;
                    c2 = 2;
                }
            } else if (b == -91) {
                c2 = 1;
            } else {
                bArr[i2] = b;
                i2++;
            }
            i4 = i;
            c3 = c;
        }
        if (c2 != 0) {
            throw new InternalError("Bad run-length encoded byte array");
        }
        if (i4 == str.length()) {
            return bArr;
        }
        throw new InternalError("Excess data in RLE byte array string");
    }

    public static char[] RLEStringToCharArray(String str) {
        int charAt = (str.charAt(0) << 16) | str.charAt(1);
        char[] cArr = new char[charAt];
        int i = 2;
        int i2 = 0;
        while (i < str.length()) {
            char charAt2 = str.charAt(i);
            if (charAt2 == 42405) {
                int i3 = i + 1;
                char charAt3 = str.charAt(i3);
                if (charAt3 == 42405) {
                    cArr[i2] = charAt3;
                    i2++;
                    i = i3;
                } else {
                    i += 2;
                    char charAt4 = str.charAt(i);
                    int i4 = 0;
                    while (i4 < charAt3) {
                        cArr[i2] = charAt4;
                        i4++;
                        i2++;
                    }
                }
            } else {
                cArr[i2] = charAt2;
                i2++;
            }
            i++;
        }
        if (i2 == charAt) {
            return cArr;
        }
        throw new InternalError("Bad run-length encoded short array");
    }

    public static short[] RLEStringToShortArray(String str) {
        int charAt = (str.charAt(0) << 16) | str.charAt(1);
        short[] sArr = new short[charAt];
        int i = 2;
        int i2 = 0;
        while (i < str.length()) {
            char charAt2 = str.charAt(i);
            if (charAt2 == 42405) {
                int i3 = i + 1;
                char charAt3 = str.charAt(i3);
                if (charAt3 == 42405) {
                    sArr[i2] = (short) charAt3;
                    i2++;
                    i = i3;
                } else {
                    i += 2;
                    short charAt4 = (short) str.charAt(i);
                    int i4 = 0;
                    while (i4 < charAt3) {
                        sArr[i2] = charAt4;
                        i4++;
                        i2++;
                    }
                }
            } else {
                sArr[i2] = (short) charAt2;
                i2++;
            }
            i++;
        }
        if (i2 == charAt) {
            return sArr;
        }
        throw new InternalError("Bad run-length encoded short array");
    }

    public static boolean arrayEquals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof Object[]) {
            return arrayEquals((Object[]) obj, obj2);
        }
        if (!(obj instanceof int[]) && !(obj instanceof double[])) {
            return obj.equals(obj2);
        }
        return arrayEquals((int[]) obj, obj2);
    }

    public static boolean arrayRegionMatches(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        int i4 = i3 + i;
        int i5 = i2 - i;
        while (i < i4) {
            if (!arrayEquals(objArr[i], objArr2[i + i5])) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int getInt(String str, int i) {
        int i2 = i * 2;
        return str.charAt(i2 + 1) | (str.charAt(i2) << 16);
    }

    public static StringBuffer hex(String str, StringBuffer stringBuffer) {
        if (str != null && stringBuffer != null) {
            int length = str.length();
            hex(str.charAt(0), stringBuffer);
            for (int i = 0; i < length; i++) {
                stringBuffer.append(HexString.CHAR_COMMA);
                hex(str.charAt(i), stringBuffer);
            }
        }
        return stringBuffer;
    }

    public static boolean arrayRegionMatches(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        int i4 = i3 + i;
        int i5 = i2 - i;
        while (i < i4) {
            if (iArr[i] != iArr2[i + i5]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static String hex(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        hex(str, stringBuffer);
        return stringBuffer.toString();
    }

    public static StringBuffer hex(char c, StringBuffer stringBuffer) {
        for (int i = 12; i >= 0; i -= 4) {
            stringBuffer.append(HEX_DIGIT[(byte) ((c >> i) & 15)]);
        }
        return stringBuffer;
    }

    public static String hex(char c) {
        return hex(c, new StringBuffer()).toString();
    }

    public static boolean arrayEquals(int[] iArr, Object obj) {
        if (iArr == null) {
            return obj == null;
        }
        if (!(obj instanceof int[])) {
            return false;
        }
        int[] iArr2 = (int[]) obj;
        return iArr.length == iArr2.length && arrayRegionMatches(iArr, 0, iArr2, 0, iArr.length);
    }

    public static boolean arrayEquals(Object[] objArr, Object obj) {
        if (objArr == null) {
            return obj == null;
        }
        if (!(obj instanceof Object[])) {
            return false;
        }
        Object[] objArr2 = (Object[]) obj;
        return objArr.length == objArr2.length && arrayRegionMatches(objArr, 0, objArr2, 0, objArr.length);
    }
}
