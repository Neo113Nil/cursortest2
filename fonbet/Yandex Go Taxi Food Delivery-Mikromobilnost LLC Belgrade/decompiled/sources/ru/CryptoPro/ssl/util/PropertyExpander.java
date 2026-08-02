package ru.CryptoPro.ssl.util;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;

/* loaded from: classes4.dex */
public class PropertyExpander {

    public static class ExpandException extends GeneralSecurityException {
        private static final long serialVersionUID = -7941948581406161702L;

        public ExpandException(String str) {
            super(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[LOOP:0: B:8:0x001c->B:28:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String expand(String str, boolean z) throws ExpandException {
        int i;
        String substring;
        if (str == null) {
            return null;
        }
        int i2 = 0;
        int indexOf = str.indexOf("${", 0);
        if (indexOf == -1) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length());
        int length = str.length();
        while (true) {
            if (indexOf >= length) {
                break;
            }
            if (indexOf > i2) {
                stringBuffer.append(str.substring(i2, indexOf));
            }
            int i3 = indexOf + 2;
            if (i3 >= length || str.charAt(i3) != '{') {
                i = i3;
                while (i < length && str.charAt(i) != '}') {
                    i++;
                }
                if (i == length) {
                    substring = str.substring(indexOf, i);
                    break;
                }
                String substring2 = str.substring(i3, i);
                if (substring2.equals("/")) {
                    stringBuffer.append(File.separatorChar);
                } else {
                    String property = System.getProperty(substring2);
                    if (property == null) {
                        throw new ExpandException("unable to expand property ".concat(substring2));
                    }
                    if (z) {
                        try {
                            if (stringBuffer.length() > 0 || !new URI(property).isAbsolute()) {
                                property = ParseUtil.encodePath(property);
                            }
                        } catch (URISyntaxException unused) {
                            property = ParseUtil.encodePath(property);
                        }
                    }
                    stringBuffer.append(property);
                }
                i2 = i + 1;
                indexOf = str.indexOf("${", i2);
                if (indexOf != -1) {
                    if (i2 < length) {
                        substring = str.substring(i2, length);
                    }
                }
            } else {
                int indexOf2 = str.indexOf("}}", i3);
                if (indexOf2 == -1 || indexOf2 + 2 == length) {
                    break;
                }
                i = indexOf2 + 1;
                stringBuffer.append(str.substring(indexOf, indexOf2 + 2));
                i2 = i + 1;
                indexOf = str.indexOf("${", i2);
                if (indexOf != -1) {
                }
            }
        }
        substring = str.substring(indexOf);
        stringBuffer.append(substring);
        return stringBuffer.toString();
    }

    public static String expand(String str) throws ExpandException {
        return expand(str, false);
    }
}
