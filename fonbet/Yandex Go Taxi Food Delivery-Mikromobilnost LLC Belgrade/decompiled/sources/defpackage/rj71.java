package defpackage;

import com.monetization.ads.utils.logger.collectors.MobileAdsLogsCollector;
import java.util.Arrays;
import java.util.Locale;
import yads.mt1;

/* loaded from: classes7.dex */
public abstract class rj71 {
    public static final jb71 a;

    static {
        jb71 jb71Var;
        jb71 jb71Var2 = jb71.b;
        if (jb71Var2 == null) {
            synchronized (jb71.c) {
                jb71Var = jb71.b;
                if (jb71Var == null) {
                    jb71Var = new jb71();
                    jb71.b = jb71Var;
                }
            }
            jb71Var2 = jb71Var;
        }
        a = jb71Var2;
    }

    public static void a(String str, Object... objArr) {
        if (uja1.a || MobileAdsLogsCollector.INSTANCE.getLogsCollectingEnabled()) {
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
            if (MobileAdsLogsCollector.INSTANCE.getLogsCollectingEnabled()) {
                a.a(mt1.c, "Yandex Mobile Ads", format);
            }
        }
    }
}
