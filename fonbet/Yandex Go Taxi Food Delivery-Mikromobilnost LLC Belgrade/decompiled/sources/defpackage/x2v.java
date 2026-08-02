package defpackage;

import java.io.IOException;
import java.util.Hashtable;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;

/* loaded from: classes4.dex */
public class x2v {
    public static void a(StringBuffer stringBuffer, v4i0 v4i0Var, Hashtable hashtable) {
        boolean z = true;
        if (v4i0Var.a.a.length <= 1) {
            if (v4i0Var.m() != null) {
                b(stringBuffer, v4i0Var.m(), hashtable);
                return;
            }
            return;
        }
        zc3[] n = v4i0Var.n();
        for (int i = 0; i != n.length; i++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append('+');
            }
            b(stringBuffer, n[i], hashtable);
        }
    }

    public static void b(StringBuffer stringBuffer, zc3 zc3Var, Hashtable hashtable) {
        String str = (String) hashtable.get(zc3Var.a);
        if (str == null) {
            str = zc3Var.a.a;
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(d(zc3Var.b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        if (r7 >= r0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(a2 a2Var) {
        String d = d(a2Var);
        if (d.length() > 0 && d.charAt(0) == '#') {
            try {
                a2 r = b3.r(qfu.a(d.length() - 1, d));
                if (r instanceof q3) {
                    d = ((q3) r).f();
                }
            } catch (IOException e) {
                yci0.k(e, "unknown encoding in name: ");
                return null;
            }
        }
        String c = quu0.c(d);
        int length = c.length();
        if (length < 2) {
            return c;
        }
        int i = length - 1;
        int i2 = 0;
        while (i2 < i && c.charAt(i2) == '\\' && c.charAt(i2 + 1) == ' ') {
            i2 += 2;
        }
        int i3 = i2 + 1;
        int i4 = i;
        while (i4 > i3 && c.charAt(i4 - 1) == '\\' && c.charAt(i4) == ' ') {
            i4 -= 2;
        }
        c = c.substring(i2, i4 + 1);
        if (c.indexOf("  ") < 0) {
            return c;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char charAt = c.charAt(0);
        stringBuffer.append(charAt);
        for (int i5 = 1; i5 < c.length(); i5++) {
            char charAt2 = c.charAt(i5);
            if (charAt != ' ' || charAt2 != ' ') {
                stringBuffer.append(charAt2);
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static String d(a2 a2Var) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        if (!(a2Var instanceof q3) || (a2Var instanceof tqf)) {
            try {
                stringBuffer.append('#');
                byte[] encoded = a2Var.toASN1Primitive().getEncoded("DER");
                agu aguVar = qfu.a;
                stringBuffer.append(quu0.a(qfu.c(encoded.length, encoded)));
            } catch (IOException unused) {
                ny61.g("Other value has no encoded form");
                return null;
            }
        } else {
            String f = ((q3) a2Var).f();
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
