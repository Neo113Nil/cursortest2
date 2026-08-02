package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public abstract class hkg {
    public static final mo a = new mo(7);
    public static final mo b = new mo(8);

    static {
        new mo(9);
    }

    public static final String a(Date date, TimeZone timeZone) {
        Object obj = b.get();
        obj.getClass();
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) obj;
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(date);
        format.getClass();
        return format;
    }
}
