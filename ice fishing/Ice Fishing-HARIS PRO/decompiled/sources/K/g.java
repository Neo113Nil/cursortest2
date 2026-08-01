package K;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f384b = new g(new h(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final h f385a;

    public g(h hVar) {
        this.f385a = hVar;
    }

    public static g a(String str) {
        if (str == null || str.isEmpty()) {
            return f384b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            int i2 = f.f383a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return new g(new h(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (this.f385a.equals(((g) obj).f385a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f385a.f386a.hashCode();
    }

    public final String toString() {
        return this.f385a.f386a.toString();
    }
}
