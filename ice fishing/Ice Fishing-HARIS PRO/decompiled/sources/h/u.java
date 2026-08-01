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

    public static K.g b(Configuration configuration) {
        return K.g.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(K.g gVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(gVar.f385a.f386a.toLanguageTags()));
    }

    public static void d(Configuration configuration, K.g gVar) {
        configuration.setLocales(LocaleList.forLanguageTags(gVar.f385a.f386a.toLanguageTags()));
    }
}
