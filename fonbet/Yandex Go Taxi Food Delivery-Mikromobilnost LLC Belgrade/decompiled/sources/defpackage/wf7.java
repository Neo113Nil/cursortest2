package defpackage;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes10.dex */
public final class wf7 {
    public static final wf7 a = new wf7();
    public static final crg b = new crg();

    public static final Calendar a(Calendar calendar) {
        return c(calendar, calendar.getTimeZone());
    }

    public static final Calendar b(Calendar calendar, TimeZone timeZone) {
        if (calendar == null) {
            return null;
        }
        return c(calendar, timeZone);
    }

    public static final Calendar c(Calendar calendar, TimeZone timeZone) {
        Calendar calendar2 = Calendar.getInstance();
        if (timeZone != null) {
            calendar2.setTimeZone(timeZone);
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    public static final boolean d(Calendar calendar, Calendar calendar2, Calendar calendar3) {
        if (calendar2 == null) {
            return false;
        }
        boolean after = calendar.getTime().after(calendar2.getTime());
        return (!after || calendar3 == null) ? after : calendar.getTime().before(calendar3.getTime());
    }

    public static final boolean e(Calendar calendar, Calendar calendar2) {
        return (calendar == null || calendar2 == null) ? calendar == calendar2 : calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1);
    }
}
