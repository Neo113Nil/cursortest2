package b1;

import I0.b;
import P0.AbstractActivityC0072e;
import Z0.i;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import x0.e;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130a {

    /* renamed from: a, reason: collision with root package name */
    public final e f2616a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0072e f2617b;

    public C0130a(AbstractActivityC0072e abstractActivityC0072e, e eVar) {
        i iVar = new i(13, this);
        this.f2617b = abstractActivityC0072e;
        this.f2616a = eVar;
        eVar.f8531c = iVar;
    }

    public static Locale a(String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] split = str.replace('_', '-').split("-");
        builder.setLanguage(split[0]);
        int i2 = 1;
        if (split.length > 1 && split[1].length() == 4) {
            builder.setScript(split[1]);
            i2 = 2;
        }
        if (split.length > i2 && split[i2].length() >= 2 && split[i2].length() <= 3) {
            builder.setRegion(split[i2]);
        }
        return builder.build();
    }

    public final void b(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(locales.get(i2));
        }
        e eVar = this.f2616a;
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
        ((b) eVar.f8530b).G("setLocale", arrayList2, null);
    }
}
