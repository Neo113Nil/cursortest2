package ru.CryptoPro.JCPRequest.ca15.status;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CA15Status {
    public static final int CR_DISP_DENIED = 2;
    public static final int CR_DISP_ERROR = -1;
    public static final int CR_DISP_ISSUED = 0;
    public static final int CR_DISP_REVOKED = 3;
    public static final int CR_DISP_UNDER_SUBMISSION = 1;
    public static final int CR_DISP_UNKNOWN = -2;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final int a;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("ru.CryptoPro.JCPRequest.resources.request", new Locale(ClearCryptoProPrefs.COUNTRY, "RU"));
        b = bundle.getString("STATUS_ISSUED1");
        c = bundle.getString("STATUS_ISSUED2");
        d = bundle.getString("STATUS_INSTALL");
        e = bundle.getString("STATUS_DENIED");
        f = bundle.getString("STATUS_UNDER_SUBMISSION1");
        g = bundle.getString("STATUS_UNDER_SUBMISSION2");
        h = bundle.getString("STATUS_REVOKED1");
        i = bundle.getString("STATUS_REVOKED2");
        j = bundle.getString("STATUS_ERROR");
        k = bundle.getString("STATUS_UNKNOWN");
    }

    public CA15Status(int i2) {
        this.a = i2;
    }

    public static String a(String str) {
        try {
            return new String(str.getBytes("UTF-8"), "windows-1251");
        } catch (UnsupportedEncodingException e2) {
            JCPLogger.warning(e2);
            return str;
        }
    }

    public static String intStatusToStringStatus(int i2) {
        String str = i2 != -1 ? i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? k : i : e : f : b : j;
        JCPLogger.fineFormat("Call intStatusToStringStatus for status: {0}, string status: {1}", Integer.valueOf(i2), str);
        return str;
    }

    public static int stringStatusToIntStatus(String str) {
        String str2 = b;
        boolean equalsIgnoreCase = str.equalsIgnoreCase(str2);
        String str3 = c;
        String str4 = i;
        String str5 = h;
        String str6 = g;
        String str7 = f;
        String str8 = e;
        String str9 = d;
        int i2 = 0;
        if (!equalsIgnoreCase && !str.equalsIgnoreCase(a(str2)) && !str.equalsIgnoreCase(str9) && !str.equalsIgnoreCase(a(str9))) {
            if (str.equalsIgnoreCase(str8) || str.equalsIgnoreCase(a(str8))) {
                i2 = 2;
            } else {
                int i3 = 1;
                if (!str.equalsIgnoreCase(str7) && !str.equalsIgnoreCase(a(str7)) && !str.equalsIgnoreCase(str6) && !str.equalsIgnoreCase(a(str6))) {
                    i3 = 3;
                    if (!str.equalsIgnoreCase(str5) && !str.equalsIgnoreCase(a(str4)) && !str.equalsIgnoreCase(str4) && !str.equalsIgnoreCase(a(str4))) {
                        if (!str.equalsIgnoreCase(str3) && !str.equalsIgnoreCase(a(str3))) {
                            i2 = -2;
                        }
                    }
                }
                i2 = i3;
            }
        }
        JCPLogger.fineFormat("Call stringStatusToIntStatus: {0}, status code: {1}", str, Integer.valueOf(i2));
        if (i2 == -2) {
            JCPLogger.info("*******************************************************");
            JCPLogger.info("Status code has invalid value for ", str);
            JCPLogger.info("Debug information: ");
            JCPLogger.infoFormat("STR_ISSUED1 :: {0} :: {1} ", str2, a(str2));
            JCPLogger.infoFormat("STR_INSTALL :: {0} :: {1} ", str9, a(str9));
            JCPLogger.infoFormat("STR_DENIED :: {0} :: {1} ", str8, a(str8));
            JCPLogger.infoFormat("STR_UNDER_SUBMISSION1 :: {0} :: {1} ", str7, a(str7));
            JCPLogger.infoFormat("STR_UNDER_SUBMISSION2 :: {0} :: {1} ", str6, a(str6));
            JCPLogger.infoFormat("STR_REVOKED1 :: {0} :: {1} ", str5, a(str5));
            JCPLogger.infoFormat("STR_REVOKED2 :: {0} :: {1} ", str4, a(str4));
            JCPLogger.infoFormat("STR_ISSUED2 :: {0} :: {1} ", str3, a(str3));
            JCPLogger.info("*******************************************************");
        }
        return i2;
    }

    public int getValue() {
        return this.a;
    }

    public String toString() {
        return intStatusToStringStatus(this.a);
    }
}
