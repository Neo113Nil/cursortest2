package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class bgs {
    public static final jyr b = btf.b(new x6s(9));
    public final SimpleDateFormat a;

    public bgs(String str, TimeZone timeZone, int i) {
        Locale locale = Locale.US;
        locale.getClass();
        timeZone = (i & 4) != 0 ? null : timeZone;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        this.a = simpleDateFormat;
    }

    public final String a(Date date) {
        date.getClass();
        String format = this.a.format(date);
        format.getClass();
        return format;
    }
}
