package defpackage;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public abstract class rd7 {
    public static final sfm a;

    static {
        new Date(0L);
        Locale locale = Locale.US;
        new sfm("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", locale);
        a = new sfm("yyyy-MM-dd'T'HH:mm:ssZZZZZ", locale);
        new sfm("yyyy-MM-dd", locale);
        new sfm("yyyy-MM-dd'T'HH:mm:ss", locale);
    }

    public static String a(Context context, Date date, zzp zzpVar, boolean z) {
        tn tnVar;
        String str;
        htr htrVar;
        if (b(date, zzpVar)) {
            return context.getString(R.string.made_for_today);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.roll(6, true);
        if (b(calendar.getTime(), zzpVar)) {
            return context.getString(R.string.made_for_yesterday);
        }
        if (z) {
            quk qukVar = htr.f;
            String language = swf.I().getLanguage();
            language.getClass();
            qukVar.getClass();
            int hashCode = language.hashCode();
            if (hashCode == 3424) {
                if (language.equals("kk")) {
                    htrVar = htr.j;
                    tnVar = (tn) htrVar.e.getValue();
                }
                htrVar = htr.g;
                tnVar = (tn) htrVar.e.getValue();
            } else if (hashCode != 3651) {
                if (hashCode == 3749 && language.equals("uz")) {
                    htrVar = htr.i;
                    tnVar = (tn) htrVar.e.getValue();
                }
                htrVar = htr.g;
                tnVar = (tn) htrVar.e.getValue();
            } else {
                if (language.equals("ru")) {
                    htrVar = htr.h;
                    tnVar = (tn) htrVar.e.getValue();
                }
                htrVar = htr.g;
                tnVar = (tn) htrVar.e.getValue();
            }
        } else {
            tnVar = (tn) swf.H().d.getValue();
        }
        tnVar.getClass();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(System.currentTimeMillis());
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(date);
        if (calendar2.get(1) == calendar3.get(1)) {
            str = tnVar.a.r(date);
        } else {
            str = tnVar.b.r(date) + StringUtil.SPACE + tnVar.c.c(R.string.subscription_ends_year);
        }
        String replace = str.replace(' ', (char) 160);
        replace.getClass();
        return replace;
    }

    public static boolean b(Date date, zzp zzpVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(System.currentTimeMillis());
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static long c() {
        return (System.currentTimeMillis() - Calendar.getInstance().getTimeZone().getOffset(r0)) / 1000;
    }
}
