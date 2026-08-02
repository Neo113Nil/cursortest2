package h;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class u {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static K.l b(Configuration configuration) {
        return K.l.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(K.l lVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(lVar.f1592a.f1593a.toLanguageTags()));
    }

    public static void d(Configuration configuration, K.l lVar) {
        configuration.setLocales(LocaleList.forLanguageTags(lVar.f1592a.f1593a.toLanguageTags()));
    }
}
