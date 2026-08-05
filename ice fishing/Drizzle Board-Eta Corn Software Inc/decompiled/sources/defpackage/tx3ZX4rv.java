package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class tx3ZX4rv {
    public static void MdtA4re8(dq dqVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(dqVar.qoPGr6Ce.qoPGr6Ce.toLanguageTags()));
    }

    public static dq NCTxEWno(Configuration configuration) {
        return dq.qoPGr6Ce(configuration.getLocales().toLanguageTags());
    }

    public static void qoPGr6Ce(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static void wxUZMvaN(Configuration configuration, dq dqVar) {
        configuration.setLocales(LocaleList.forLanguageTags(dqVar.qoPGr6Ce.qoPGr6Ce.toLanguageTags()));
    }
}
