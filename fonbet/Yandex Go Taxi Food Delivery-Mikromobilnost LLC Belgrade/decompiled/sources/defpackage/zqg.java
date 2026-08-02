package defpackage;

import java.util.Calendar;

/* loaded from: classes10.dex */
public class zqg {
    public static final ThreadLocal c = new ThreadLocal();
    public final o5z a;
    public final ThreadLocal b = new ThreadLocal();

    public zqg(o5z o5zVar) {
        this.a = o5zVar;
    }

    public static String a(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return uh6.s(calendar.getTime(), calendar.getTimeZone());
    }
}
