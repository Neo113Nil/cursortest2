package defpackage;

import j$.time.Clock;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.util.Date;
import java.util.Locale;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class gkg {
    public static final DateTimeFormatter a;
    public static final DateTimeFormatter b;

    static {
        htr htrVar;
        quk qukVar = htr.f;
        String language = swf.I().getLanguage();
        language.getClass();
        qukVar.getClass();
        int hashCode = language.hashCode();
        if (hashCode == 3424) {
            if (language.equals("kk")) {
                htrVar = htr.j;
            }
            htrVar = htr.g;
        } else if (hashCode != 3651) {
            if (hashCode == 3749 && language.equals("uz")) {
                htrVar = htr.i;
            }
            htrVar = htr.g;
        } else {
            if (language.equals("ru")) {
                htrVar = htr.h;
            }
            htrVar = htr.g;
        }
        Locale locale = htrVar.c;
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("d MMMM", locale);
        ofPattern.getClass();
        a = ofPattern;
        DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("d MMMM yyyy", locale);
        ofPattern2.getClass();
        b = ofPattern2;
    }

    public static String a(LocalDate localDate) {
        Clock systemDefaultZone = Clock.systemDefaultZone();
        systemDefaultZone.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(skr.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        skr skrVar = (skr) qdcVar.C(I);
        if (localDate.equals(LocalDate.now(systemDefaultZone))) {
            return skrVar.c(R.string.podcast_release_date_today);
        }
        if (localDate.equals(LocalDate.now(systemDefaultZone).minusDays(1L))) {
            return skrVar.c(R.string.podcast_release_date_yesterday);
        }
        if (localDate.getYear() == LocalDate.now(systemDefaultZone).getYear()) {
            String format = a.format(localDate);
            format.getClass();
            return format;
        }
        String format2 = b.format(localDate);
        format2.getClass();
        return format2;
    }

    public static final boolean b(LocalDate localDate, LocalDate localDate2) {
        localDate.getClass();
        localDate2.getClass();
        return localDate.getYear() == localDate2.getYear() && localDate.getMonth() == localDate2.getMonth() && localDate.getDayOfMonth() == localDate2.getDayOfMonth();
    }

    public static boolean c(LocalDate localDate) {
        Clock systemDefaultZone = Clock.systemDefaultZone();
        systemDefaultZone.getClass();
        return localDate.equals(LocalDate.now(systemDefaultZone)) || localDate.equals(LocalDate.now(systemDefaultZone).minusDays(1L));
    }

    public static final LocalDate d(Date date) {
        date.getClass();
        LocalDate n = DateRetargetClass.toInstant(date).atZone(ZoneId.of("UTC")).n();
        n.getClass();
        return n;
    }
}
