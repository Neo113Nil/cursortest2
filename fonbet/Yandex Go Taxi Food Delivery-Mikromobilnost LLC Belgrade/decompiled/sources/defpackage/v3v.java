package defpackage;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes11.dex */
public abstract class v3v {
    public static final TimeZone a = TimeZone.getTimeZone("UTC");

    public static boolean a(char c, int i, String str) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TRY_LEAVE, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x0058, B:20:0x0068, B:21:0x006a, B:23:0x0076, B:24:0x0079, B:26:0x007f, B:30:0x0089, B:35:0x0099, B:37:0x00a1, B:38:0x00a5, B:40:0x00ab, B:44:0x00b8, B:48:0x00c3, B:53:0x00ee, B:55:0x00f4, B:59:0x01a6, B:59:0x01a6, B:64:0x0106, B:64:0x0106, B:65:0x0121, B:65:0x0121, B:66:0x0122, B:66:0x0122, B:69:0x013f, B:69:0x013f, B:71:0x014c, B:71:0x014c, B:74:0x0155, B:74:0x0155, B:76:0x0174, B:76:0x0174, B:79:0x0183, B:79:0x0183, B:80:0x01a5, B:80:0x01a5, B:81:0x012e, B:81:0x012e, B:82:0x01d7, B:82:0x01d7, B:83:0x01de, B:83:0x01de, B:84:0x00d3, B:85:0x00d6, B:88:0x00bf), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d7 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x0058, B:20:0x0068, B:21:0x006a, B:23:0x0076, B:24:0x0079, B:26:0x007f, B:30:0x0089, B:35:0x0099, B:37:0x00a1, B:38:0x00a5, B:40:0x00ab, B:44:0x00b8, B:48:0x00c3, B:53:0x00ee, B:55:0x00f4, B:59:0x01a6, B:59:0x01a6, B:64:0x0106, B:64:0x0106, B:65:0x0121, B:65:0x0121, B:66:0x0122, B:66:0x0122, B:69:0x013f, B:69:0x013f, B:71:0x014c, B:71:0x014c, B:74:0x0155, B:74:0x0155, B:76:0x0174, B:76:0x0174, B:79:0x0183, B:79:0x0183, B:80:0x01a5, B:80:0x01a5, B:81:0x012e, B:81:0x012e, B:82:0x01d7, B:82:0x01d7, B:83:0x01de, B:83:0x01de, B:84:0x00d3, B:85:0x00d6, B:88:0x00bf), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date b(String str, ParsePosition parsePosition) {
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        char charAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i5 = index + 4;
            int c = c(index, i5, str);
            if (a(LicenseUtility.SEPARATOR, i5, str)) {
                i5 = index + 5;
            }
            int i6 = i5 + 2;
            int c2 = c(i5, i6, str);
            if (a(LicenseUtility.SEPARATOR, i6, str)) {
                i6 = i5 + 3;
            }
            int i7 = i6 + 2;
            int c3 = c(i6, i7, str);
            boolean a2 = a('T', i7, str);
            if (!a2 && str.length() <= i7) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(c, c2 - 1, c3);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i7);
                return gregorianCalendar.getTime();
            }
            if (a2) {
                int i8 = i6 + 5;
                int c4 = c(i6 + 3, i8, str);
                if (a(':', i8, str)) {
                    i8 = i6 + 6;
                }
                int i9 = i8 + 2;
                int c5 = c(i8, i9, str);
                if (a(':', i9, str)) {
                    i9 = i8 + 3;
                }
                if (str.length() > i9 && (charAt = str.charAt(i9)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i10 = i9 + 2;
                    i4 = c(i9, i10, str);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (a('.', i10, str)) {
                        int i11 = i9 + 3;
                        for (int i12 = i9 + 4; i12 < str.length(); i12++) {
                            char charAt2 = str.charAt(i12);
                            if (charAt2 >= '0' && charAt2 <= '9') {
                            }
                            length2 = i12;
                        }
                        length2 = str.length();
                        int min = Math.min(length2, i9 + 6);
                        i3 = c(i11, min, str);
                        int i13 = min - i11;
                        if (i13 == 1) {
                            i3 *= 100;
                        } else if (i13 == 2) {
                            i3 *= 10;
                        }
                        i = c4;
                        i7 = length2;
                        i2 = c5;
                    } else {
                        i = c4;
                        i7 = i10;
                        i2 = c5;
                        i3 = 0;
                    }
                    if (str.length() > i7) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char charAt3 = str.charAt(i7);
                    TimeZone timeZone = a;
                    if (charAt3 == 'Z') {
                        length = i7 + 1;
                    } else {
                        if (charAt3 != '+' && charAt3 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                        }
                        String substring = str.substring(i7);
                        if (substring.length() < 5) {
                            substring = substring + "00";
                        }
                        length = i7 + substring.length();
                        if (!substring.equals("+0000") && !substring.equals("+00:00")) {
                            String str2 = "GMT" + substring;
                            timeZone = TimeZone.getTimeZone(str2);
                            String id = timeZone.getID();
                            if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                                throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                            }
                        }
                    }
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                    gregorianCalendar2.setLenient(false);
                    gregorianCalendar2.set(1, c);
                    gregorianCalendar2.set(2, c2 - 1);
                    gregorianCalendar2.set(5, c3);
                    gregorianCalendar2.set(11, i);
                    gregorianCalendar2.set(12, i2);
                    gregorianCalendar2.set(13, i4);
                    gregorianCalendar2.set(14, i3);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i7 = i9;
                i = c4;
                i2 = c5;
            } else {
                i = 0;
                i2 = 0;
            }
            i3 = 0;
            i4 = 0;
            if (str.length() > i7) {
            }
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            String l = str == null ? null : unr0.l(OpenList.CHAR_QUOTE, "\"", str);
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = Extension.O_BRAKE + e.getClass().getName() + Extension.C_BRAKE;
            }
            ParseException parseException = new ParseException(b64.l("Failed to parse date [", l, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    public static int c(int i, int i2, String str) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }
}
