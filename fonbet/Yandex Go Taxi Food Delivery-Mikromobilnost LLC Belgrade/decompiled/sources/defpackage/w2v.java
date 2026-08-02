package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;
import ru.domesticroots.bouncycastle.util.encoders.DecoderException;

/* loaded from: classes4.dex */
public class w2v {
    public static void a(StringBuffer stringBuffer, yc3 yc3Var, Hashtable hashtable) {
        String str = (String) hashtable.get(yc3Var.a);
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(yc3Var.a.a);
        }
        stringBuffer.append('=');
        stringBuffer.append(e(yc3Var.b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ce, code lost:
    
        if (r7 >= r0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(z1 z1Var) {
        byte[] bArr;
        z1 m;
        String e = e(z1Var);
        if (e.length() > 0 && e.charAt(0) == '#') {
            try {
                int length = e.length() - 1;
                try {
                    byte[] bArr2 = rfu.a.b;
                    if (length < 0 || 1 > e.length() - length) {
                        ny61.m("invalid offset and/or length specified");
                    } else if ((length & 1) == 0) {
                        int i = length >>> 1;
                        bArr = new byte[i];
                        int i2 = 1;
                        for (int i3 = 0; i3 < i; i3++) {
                            int i4 = i2 + 1;
                            byte b = bArr2[e.charAt(i2)];
                            i2 += 2;
                            int i5 = bArr2[e.charAt(i4)] | (b << 4);
                            if (i5 >= 0) {
                                bArr[i3] = (byte) i5;
                            } else {
                                ny61.v("invalid characters encountered in Hex string");
                            }
                        }
                        m = a3.m(bArr);
                        if (m instanceof p3) {
                            e = ((p3) m).f();
                        }
                    } else {
                        ny61.v("a hexadecimal encoding must have an even number of characters");
                    }
                    bArr = null;
                    m = a3.m(bArr);
                    if (m instanceof p3) {
                    }
                } catch (Exception e2) {
                    throw new DecoderException("exception decoding Hex string: " + e2.getMessage(), e2);
                }
            } catch (IOException e3) {
                yci0.k(e3, "unknown encoding in name: ");
                return null;
            }
        }
        String c = ruu0.c(e);
        int length2 = c.length();
        if (length2 < 2) {
            return c;
        }
        int i6 = length2 - 1;
        int i7 = 0;
        while (i7 < i6 && c.charAt(i7) == '\\' && c.charAt(i7 + 1) == ' ') {
            i7 += 2;
        }
        int i8 = i7 + 1;
        int i9 = i6;
        while (i9 > i8 && c.charAt(i9 - 1) == '\\' && c.charAt(i9) == ' ') {
            i9 -= 2;
        }
        c = c.substring(i7, i9 + 1);
        if (c.indexOf("  ") < 0) {
            return c;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char charAt = c.charAt(0);
        stringBuffer.append(charAt);
        for (int i10 = 1; i10 < c.length(); i10++) {
            char charAt2 = c.charAt(i10);
            if (charAt != ' ' || charAt2 != ' ') {
                stringBuffer.append(charAt2);
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static int c(char c) {
        return ('0' > c || c > '9') ? ('a' > c || c > 'f') ? c - '7' : c - 'W' : c - MoneyInputEditView.DEFAULT_VALUE;
    }

    public static String d(String str) {
        int i;
        if (str.length() == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (charArray[0] == '\\' && charArray[1] == '#') {
            stringBuffer.append("\\#");
            i = 2;
        } else {
            i = 0;
        }
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        char c = 0;
        while (i != charArray.length) {
            char c2 = charArray[i];
            if (c2 != ' ') {
                z3 = true;
            }
            if (c2 != '\"') {
                if (c2 == '\\' && !z && !z2) {
                    i2 = stringBuffer.length();
                    z = true;
                } else if (c2 != ' ' || z || z3) {
                    if (!z || (('0' > c2 || c2 > '9') && (('a' > c2 || c2 > 'f') && ('A' > c2 || c2 > 'F')))) {
                        stringBuffer.append(c2);
                    } else if (c != 0) {
                        stringBuffer.append((char) (c(c2) + (c(c) * 16)));
                        z = false;
                        c = 0;
                    } else {
                        c = c2;
                    }
                }
                i++;
            } else if (z) {
                stringBuffer.append(c2);
            } else {
                z2 = !z2;
            }
            z = false;
            i++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i2 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public static String e(z1 z1Var) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        if (!(z1Var instanceof p3) || (z1Var instanceof sqf)) {
            try {
                stringBuffer.append('#');
                a3 aSN1Primitive = z1Var.toASN1Primitive();
                aSN1Primitive.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                g191.H(byteArrayOutputStream).d0(aSN1Primitive);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                zfu zfuVar = rfu.a;
                stringBuffer.append(ruu0.a(rfu.a(byteArray.length, byteArray)));
            } catch (IOException unused) {
                ny61.g("Other value has no encoded form");
                return null;
            }
        } else {
            String f = ((p3) z1Var).f();
            if (f.length() > 0 && f.charAt(0) == '#') {
                stringBuffer.append(CSPStore.UNIQUE_SEPARATOR);
            }
            stringBuffer.append(f);
        }
        int length = stringBuffer.length();
        int i2 = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i2 != length) {
            char charAt = stringBuffer.charAt(i2);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i2++;
                        break;
                }
            }
            stringBuffer.insert(i2, "\\");
            i2 += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i && stringBuffer.charAt(i) == ' ') {
                stringBuffer.insert(i, "\\");
                i += 2;
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= i && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, CSPStore.UNIQUE_SEPARATOR);
        }
        return stringBuffer.toString();
    }
}
