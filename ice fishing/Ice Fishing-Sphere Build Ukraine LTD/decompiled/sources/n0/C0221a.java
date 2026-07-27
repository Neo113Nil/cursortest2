package n0;

import L.C0026b;
import L.Q;
import android.content.res.Configuration;
import android.os.LocaleList;
import c0.AbstractActivityC0104f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import l0.C0200c;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221a {

    /* renamed from: a, reason: collision with root package name */
    public final Q f2785a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0104f f2786b;

    public C0221a(AbstractActivityC0104f abstractActivityC0104f, Q q2) {
        C0200c c0200c = new C0200c(18, this);
        this.f2786b = abstractActivityC0104f;
        this.f2785a = q2;
        q2.f520g = c0200c;
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
        Q q2 = this.f2785a;
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
        ((C0026b) q2.f519f).D("setLocale", arrayList2, null);
    }
}
