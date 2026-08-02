package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import java.math.RoundingMode;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class t7s {
    public static final Pattern a = Pattern.compile("(\\p{L})(\\d{3})(\\p{L}{2})(\\d{2,3})");
    public static final Pattern b = Pattern.compile("(\\p{L}{2})(\\d{3})(\\d{2,3})");
    public static final NumberFormat c;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance();
        c = numberFormat;
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        numberFormat.setMaximumFractionDigits(2);
    }

    public static final String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Matcher matcher = a.matcher(str);
        Matcher matcher2 = b.matcher(str);
        return matcher.matches() ? matcher.replaceFirst("$1 $2 $3 $4") : matcher2.matches() ? matcher2.replaceFirst("$1 $2 $3") : str;
    }

    public static final String b(String str) {
        String a2 = a(str);
        return (a2 == null || a2.length() == 0) ? str : cvu0.v(cvu0.v(a2.replace((char) 160, (char) 8201), "_", "", false), "\n", "", false);
    }

    public static final String c(Context context, Calendar calendar, int i) {
        return b64.k("\\s", DateUtils.formatDateTime(context, calendar.getTimeInMillis(), i), " ");
    }

    public static final String d(long j, String str, String str2) {
        long j2 = j / 3600;
        long j3 = j - (3600 * j2);
        long j4 = j3 / 60;
        long j5 = j3 - (60 * j4);
        return j2 > 0 ? String.format(Locale.getDefault(), str2, Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j5)}, 3)) : String.format(Locale.getDefault(), str, Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2));
    }

    public static final String e(Context context, nf7 nf7Var, Calendar calendar, TimeZone timeZone) {
        String string;
        if (calendar == null) {
            return context.getString(kyh0.date_format_asap);
        }
        if (timeZone != null) {
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(timeZone);
        } else {
            timeZone = calendar.getTimeZone();
        }
        if (nf7Var.c(calendar)) {
            string = context.getString(kyh0.date_format_today);
        } else if (nf7Var.d(calendar)) {
            string = context.getString(kyh0.date_format_tomorrow);
        } else {
            Calendar a2 = nf7Var.a.a(calendar.getTimeZone());
            int i = calendar.get(5);
            Calendar a3 = wf7.a(a2);
            a3.add(6, -1);
            a3.getTimeInMillis();
            string = i == a3.get(5) ? context.getString(kyh0.date_format_yesterday) : context.getString(kyh0.date_format_far_longest);
        }
        Locale locale = Locale.getDefault();
        if (!j73.y(DateFormatSymbols.getAvailableLocales(), locale)) {
            locale = Locale.ENGLISH;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string, locale);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static final String f(Context context, nf7 nf7Var, Calendar calendar) {
        Resources resources = context.getResources();
        int e = nf7Var.b(calendar) ? 0 : nf7Var.e(calendar) + 1;
        if (e < 60) {
            return i(resources, dwh0.date_format_in_minutes, kyh0.date_format_minutes_left_fallback, e, Integer.valueOf(e));
        }
        int a2 = nf7Var.a(calendar);
        if (a2 < 24) {
            return i(resources, dwh0.date_format_in_hours, kyh0.date_format_hours_left_fallback, a2, Integer.valueOf(a2));
        }
        int timeInMillis = (int) ((calendar.getTimeInMillis() - nf7Var.a.a(calendar.getTimeZone()).getTimeInMillis()) / 86400000);
        return i(resources, dwh0.date_format_in_days, kyh0.date_format_days_left_fallback, timeInMillis, Integer.valueOf(timeInMillis));
    }

    public static final String g(zuj0 zuj0Var, long j) {
        String str;
        long j2 = (j / 60000) % 60;
        long j3 = (j / 3600000) % 24;
        if (j3 == 0) {
            j2 = Math.max(j2, 1L);
        }
        if (j3 > 0) {
            str = j3 + " " + ((avj0) zuj0Var).h(kyh0.common_hour_sign);
        } else {
            str = "";
        }
        if (j2 > 0) {
            str = str + " " + j2 + " " + ((avj0) zuj0Var).h(kyh0.common_minutes_sign);
        }
        return evu0.k0(str).toString();
    }

    public static final String h(zuj0 zuj0Var, String str, String str2, long j, Date date) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        String a2 = a(str2);
        String g = date != null ? g(zuj0Var, Math.abs(date.getTime() - j)) : "";
        return cvu0.v(cvu0.v(cvu0.v(str, "$CAR_NUMBER$", a2 != null ? a2 : "", false), "$BEFORE_PREPAID_TIME_HOURS_MINUTES$", g, false), "$AFTER_PREPAID_TIME_HOURS_MINUTES$", g, false);
    }

    public static final String i(Resources resources, int i, int i2, int i3, Object... objArr) {
        String str;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        try {
            str = resources.getQuantityString(i, i3, Arrays.copyOf(copyOf, copyOf.length));
        } catch (Exception e) {
            jst.e.k(e, "Error while getQuantityString");
            str = null;
        }
        return str == null ? resources.getString(i2, Arrays.copyOf(objArr, objArr.length)) : str;
    }

    public static final String j(long j) {
        long j2 = j / 60000;
        return String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf((j / 1000) - (60 * j2))}, 2));
    }
}
