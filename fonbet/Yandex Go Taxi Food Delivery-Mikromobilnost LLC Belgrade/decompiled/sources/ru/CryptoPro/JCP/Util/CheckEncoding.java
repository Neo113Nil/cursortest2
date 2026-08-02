package ru.CryptoPro.JCP.Util;

import java.util.Locale;

/* loaded from: classes4.dex */
public class CheckEncoding {
    public static final String STR_FILE_ENCODING = "file.encoding";

    private CheckEncoding() {
    }

    public static void log(String str) {
        System.out.getClass();
    }

    public static void main(String[] strArr) {
        log("Platform: " + ru.CryptoPro.JCP.tools.Platform.getOSNameEx());
        String property = ru.CryptoPro.JCP.tools.Platform.getProperty("file.encoding");
        String str = "not set";
        if (property == null || property.length() == 0) {
            property = "not set";
        }
        log("file.encoding = ".concat(property));
        String determineEncoding = ru.CryptoPro.JCP.tools.Platform.determineEncoding();
        ru.CryptoPro.JCP.tools.Platform.setProperty("file.encoding", determineEncoding);
        if (determineEncoding != null && determineEncoding.length() != 0) {
            str = determineEncoding;
        }
        log("file.encoding = ".concat(str));
        Locale locale = Locale.getDefault();
        log("Language:" + locale.getDisplayLanguage());
        log("Country:" + locale.getDisplayCountry());
        log("Крипто-Про");
    }
}
