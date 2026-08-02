package defpackage;

import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class fqg {
    public static final Locale a;

    static {
        Locale locale;
        new HashMap();
        if (!"en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            Locale[] availableLocales = Locale.getAvailableLocales();
            int i = 0;
            while (true) {
                if (i == availableLocales.length) {
                    locale = Locale.getDefault();
                    break;
                } else {
                    if ("en".equalsIgnoreCase(availableLocales[i].getLanguage())) {
                        locale = availableLocales[i];
                        break;
                    }
                    i++;
                }
            }
        } else {
            locale = Locale.getDefault();
        }
        a = locale;
    }
}
