package io.appmetrica.analytics.coreutils.internal;

import android.content.ContentValues;
import android.text.TextUtils;
import defpackage.j73;
import defpackage.ny61;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class StringUtils {
    public static final String COMMA = ",";
    public static final String EMPTY = "";
    public static final String PROCESS_POSTFIX_DELIMITER = ":";
    public static final String UNDEFINED = "undefined";

    public static String capitalize(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    public static int compare(String str, String str2) {
        if (str == null) {
            return str2 == null ? 0 : -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }

    public static String contentValuesToString(ContentValues contentValues) {
        return contentValues == null ? "null" : contentValues.toString();
    }

    public static String correctIllFormedString(String str) {
        return new String(str.getBytes(StandardCharsets.UTF_8));
    }

    public static String emptyIfNull(String str) {
        return ifIsNullToDef(str, "");
    }

    public static boolean equalsNullSafety(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static String formatSha1(byte[] bArr) {
        return toHexString(bArr).toUpperCase(Locale.US).replaceAll("(.{2})(?=.+)", "$1:");
    }

    public static byte[][] getUTF8Bytes(List<String> list) {
        byte[][] bArr = new byte[0][];
        if (list != null) {
            bArr = new byte[list.size()][];
            for (int i = 0; i < list.size(); i++) {
                bArr[i] = getUTF8Bytes(list.get(i));
            }
        }
        return bArr;
    }

    public static int getUtf8BytesLength(String str) {
        return getUTF8Bytes(str).length;
    }

    public static byte[] hexToBytes(String str) {
        if (str.length() % 2 != 0) {
            ny61.g("Input string must contain an even number of characters");
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }

    public static String ifIsEmptyToDef(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static String ifIsNullToDef(String str, String str2) {
        return str == null ? str2 : str;
    }

    public static boolean isNotNullOrEmpty(String str) {
        return !isNullOrEmpty(str);
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static byte[] stringToBytesForProtobuf(String str) {
        return str == null ? new byte[0] : str.getBytes();
    }

    public static String throwableToString(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getName());
        sb.append(Extension.COLON_SPACE);
        sb.append(th.getMessage());
        sb.append("\n");
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb2 = new StringBuilder();
        j73.I(stackTrace, sb2, "\n", "", "", null);
        sb.append(sb2.toString());
        return sb.toString();
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 240) >> 4));
            sb.append("0123456789abcdef".charAt(b & PKIBody._CCP));
        }
        return sb.toString();
    }

    public static final String wrapFeatures(String... strArr) {
        return TextUtils.join(",", strArr);
    }

    public static byte[] getUTF8Bytes(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
