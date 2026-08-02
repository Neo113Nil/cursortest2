package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes4.dex */
public final class y5z {
    public final hdu a;
    public final Context b;

    public y5z(Context context, hdu hduVar) {
        i4u i4uVar = new i4u(this);
        this.b = context;
        this.a = hduVar;
        hduVar.b = i4uVar;
    }

    public static Locale a(String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] split = str.replace('_', LicenseUtility.SEPARATOR).split("-");
        builder.setLanguage(split[0]);
        int i = 1;
        if (split.length > 1 && split[1].length() == 4) {
            builder.setScript(split[1]);
            i = 2;
        }
        if (split.length > i && split[i].length() >= 2 && split[i].length() <= 3) {
            builder.setRegion(split[i]);
        }
        return builder.build();
    }

    public final void b(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(locales.get(i));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((ea20) this.a.a).a("setLocale", arrayList2, null);
    }
}
