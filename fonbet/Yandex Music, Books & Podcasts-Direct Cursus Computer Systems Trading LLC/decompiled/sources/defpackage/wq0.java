package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class wq0 {
    public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static dqg b(Configuration configuration) {
        return dqg.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(dqg dqgVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(dqgVar.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, dqg dqgVar) {
        configuration.setLocales(LocaleList.forLanguageTags(dqgVar.a.a.toLanguageTags()));
    }
}
