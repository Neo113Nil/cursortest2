package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zh01 {
    public final jtq0 a;
    public final j5z b;

    public zh01(jtq0 jtq0Var, j5z j5zVar) {
        this.a = jtq0Var;
        this.b = j5zVar;
    }

    public static String a(Date date, Locale locale) {
        String format = new SimpleDateFormat("EE", locale).format(date);
        if (format.length() <= 0) {
            return format;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = format.charAt(0);
        sb.append((Object) (Character.isLowerCase(charAt) ? rza.c(charAt, locale) : String.valueOf(charAt)));
        sb.append(format.substring(1));
        return sb.toString();
    }
}
