package defpackage;

import android.os.LocaleList;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public final class dqg {
    public static final dqg b = d(new LocaleList(new Locale[0]));
    public final eqg a;

    public dqg(eqg eqgVar) {
        this.a = eqgVar;
    }

    public static dqg a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(StringUtils.COMMA, -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            int i2 = cqg.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return d(new LocaleList(localeArr));
    }

    public static dqg d(LocaleList localeList) {
        return new dqg(new eqg(localeList));
    }

    public final Locale b(int i) {
        return this.a.a.get(i);
    }

    public final boolean c() {
        return this.a.a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dqg) {
            return this.a.equals(((dqg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
