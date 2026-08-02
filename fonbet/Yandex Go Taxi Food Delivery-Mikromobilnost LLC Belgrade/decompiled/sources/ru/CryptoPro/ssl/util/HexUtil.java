package ru.CryptoPro.ssl.util;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.math.BigInteger;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class HexUtil {
    public static final char[] a = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

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
        StringBuilder sb = new StringBuilder(bArr.length * 3);
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = b & 255;
            if (i != 0) {
                sb.append(':');
            }
            char[] cArr = a;
            sb.append(cArr[i2 >>> 4]);
            sb.append(cArr[b & PKIBody._CCP]);
        }
        return sb.toString();
    }
}
