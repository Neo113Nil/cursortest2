package K;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class b {
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            a.a(30);
        }
        if (i >= 30) {
            a.a(31);
        }
        if (i >= 30) {
            a.a(33);
        }
        if (i >= 30) {
            a.a(1000000);
        }
    }

    public static final boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            if (i >= 34) {
                String str = Build.VERSION.CODENAME;
                D1.i.d(str, "CODENAME");
                if (!"REL".equals(str)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = str.toUpperCase(locale);
                    D1.i.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = "VanillaIceCream".toUpperCase(locale);
                    D1.i.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase.compareTo(upperCase2) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
