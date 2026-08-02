package defpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes10.dex */
public abstract class xv21 {
    public static final ThreadLocal a = new ThreadLocal();

    public static final String a(Date date) {
        ThreadLocal threadLocal = a;
        Object obj = threadLocal.get();
        Object obj2 = obj;
        if (obj == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            threadLocal.set(simpleDateFormat);
            obj2 = simpleDateFormat;
        }
        return ((DateFormat) obj2).format(date);
    }
}
