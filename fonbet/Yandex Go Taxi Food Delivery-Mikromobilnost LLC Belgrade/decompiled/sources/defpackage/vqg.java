package defpackage;

import com.ybsdk.core.utils.date.YbDateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes8.dex */
public abstract class vqg {
    public static final TimeZone a = TimeZone.getTimeZone("UTC");

    public static final String a(Date date, YbDateFormat ybDateFormat) {
        return new SimpleDateFormat(ybDateFormat.getPattern(), Locale.ROOT).format(date);
    }

    public static final Date b(String str, YbDateFormat ybDateFormat) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ybDateFormat.getPattern(), Locale.ROOT);
            simpleDateFormat.setLenient(false);
            return simpleDateFormat.parse(str);
        } catch (ParseException unused) {
            i5z0.a.j(b64.l("Can not parse ", str, " to date using pattern ", ybDateFormat.getPattern()), new Object[0]);
            return null;
        }
    }
}
