package ru.CryptoPro.reprov.utils;

import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.g8e;
import java.math.BigInteger;
import java.security.AccessController;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class Debug {
    public static final String a;
    public static final char[] b;

    static {
        String str;
        String valueOf = String.valueOf(AccessController.doPrivileged(new GetPropertyAction("java.security.debug")));
        a = valueOf;
        a = g8e.p(valueOf, ",", String.valueOf(AccessController.doPrivileged(new GetPropertyAction("java.security.auth.debug"))));
        String str2 = a;
        if (str2 != null) {
            if (str2 != null) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("[Pp][Ee][Rr][Mm][Ii][Ss][Ss][Ii][Oo][Nn]=[a-zA-Z_$][a-zA-Z0-9_$]*([.][a-zA-Z_$][a-zA-Z0-9_$]*)*").matcher(new StringBuffer(str2));
                StringBuffer stringBuffer2 = new StringBuffer();
                while (matcher.find()) {
                    stringBuffer.append(matcher.group().replaceFirst("[Pp][Ee][Rr][Mm][Ii][Ss][Ss][Ii][Oo][Nn]=", "permission="));
                    stringBuffer.append("  ");
                    matcher.appendReplacement(stringBuffer2, "");
                }
                matcher.appendTail(stringBuffer2);
                Matcher matcher2 = Pattern.compile("[Cc][Oo][Dd][Ee][Bb][Aa][Ss][Ee]=[^, ;]*").matcher(stringBuffer2);
                StringBuffer stringBuffer3 = new StringBuffer();
                while (matcher2.find()) {
                    stringBuffer.append(matcher2.group().replaceFirst("[Cc][Oo][Dd][Ee][Bb][Aa][Ss][Ee]=", "codebase="));
                    stringBuffer.append("  ");
                    matcher2.appendReplacement(stringBuffer3, "");
                }
                matcher2.appendTail(stringBuffer3);
                stringBuffer.append(stringBuffer3.toString().toLowerCase());
                str = stringBuffer.toString();
            } else {
                str = null;
            }
            a = str;
            if (str.equals("help")) {
                Help();
            }
        }
        b = new char[]{MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public static void Help() {
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.err.getClass();
        System.exit(0);
    }

    public static Debug getInstance(String str, String str2) {
        if (isOn(str)) {
            return new Debug();
        }
        return null;
    }

    public static boolean isOn(String str) {
        String str2 = a;
        if (str2 == null) {
            return false;
        }
        return (str2.indexOf("all") == -1 && str2.indexOf(str) == -1) ? false : true;
    }

    public static String toHexString(BigInteger bigInteger) {
        String str;
        String bigInteger2 = bigInteger.toString(16);
        StringBuffer stringBuffer = new StringBuffer(bigInteger2.length() * 2);
        if (bigInteger2.startsWith("-")) {
            stringBuffer.append("   -");
            bigInteger2 = bigInteger2.substring(1);
        } else {
            stringBuffer.append(Extension.TAB_CHAR);
        }
        if (bigInteger2.length() % 2 != 0) {
            bigInteger2 = "0".concat(bigInteger2);
        }
        int i = 0;
        while (i < bigInteger2.length()) {
            int i2 = i + 2;
            stringBuffer.append(bigInteger2.substring(i, i2));
            if (i2 != bigInteger2.length()) {
                if (i2 % 64 == 0) {
                    str = "\n    ";
                } else if (i2 % 8 == 0) {
                    str = " ";
                }
                stringBuffer.append(str);
            }
            i = i2;
        }
        return stringBuffer.toString();
    }

    public static String toString(byte[] bArr) {
        if (bArr == null) {
            return "(null)";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 3);
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = b2 & 255;
            if (i != 0) {
                stringBuffer.append(':');
            }
            char[] cArr = b;
            stringBuffer.append(cArr[i2 >>> 4]);
            stringBuffer.append(cArr[b2 & PKIBody._CCP]);
        }
        return stringBuffer.toString();
    }

    public void println() {
        System.err.getClass();
    }

    public void println(String str) {
        System.err.getClass();
    }

    public static void println(String str, String str2) {
        System.err.getClass();
    }

    public static Debug getInstance(String str) {
        return getInstance(str, str);
    }
}
