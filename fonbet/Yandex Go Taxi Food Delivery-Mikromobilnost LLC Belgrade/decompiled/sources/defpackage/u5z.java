package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes10.dex */
public abstract class u5z {
    public static final i3y a = a.a(new t5z(0));

    public static final Context a(Context context, Locale locale) {
        Configuration configuration = context.getResources().getConfiguration();
        LocaleList locales = configuration.getLocales();
        ListBuilder a2 = rcc.a();
        a2.add(locale);
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            Locale locale2 = locales.get(i);
            if (!jl40.l(locale2, locale)) {
                a2.add(locale2);
            }
        }
        Locale[] localeArr = (Locale[]) a2.j().toArray(new Locale[0]);
        LocaleList localeList = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        configuration.setLocales(localeList);
        LocaleList.setDefault(localeList);
        Locale.setDefault(locale);
        return context.createConfigurationContext(configuration);
    }
}
