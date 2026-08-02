package defpackage;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes10.dex */
public abstract class yuu {
    public static final TimeZone a = TimeZone.getTimeZone("GMT");
    public static final wc2 b = new wc2(2);
    public static final String[] c;
    public static final DateFormat[] d;

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        c = strArr;
        d = new DateFormat[strArr.length];
    }

    public static final String a(Date date) {
        DateFormat dateFormat = (DateFormat) b.get();
        String format = dateFormat != null ? dateFormat.format(date) : null;
        return format == null ? "" : format;
    }

    public static final Date b(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        DateFormat dateFormat = (DateFormat) b.get();
        Date parse = dateFormat != null ? dateFormat.parse(str, parsePosition) : null;
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = c;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    DateFormat[] dateFormatArr = d;
                    DateFormat dateFormat2 = dateFormatArr[i];
                    if (dateFormat2 == null) {
                        dateFormat2 = new SimpleDateFormat(c[i], Locale.US);
                        dateFormat2.setTimeZone(a);
                        dateFormatArr[i] = dateFormat2;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat2.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
