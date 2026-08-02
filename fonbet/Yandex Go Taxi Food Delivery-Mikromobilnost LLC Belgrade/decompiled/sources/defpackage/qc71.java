package defpackage;

import android.util.Log;
import com.monetization.ads.utils.logger.collectors.MobileAdsLogsCollector;
import java.util.Arrays;
import java.util.Locale;
import yads.mt1;

/* loaded from: classes7.dex */
public abstract class qc71 {
    public static final jb71 a;
    public static final String b;
    public static boolean c;

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
        b = "YandexAds";
        c = true;
    }

    public static final void a(String str, Object... objArr) {
        if (c || MobileAdsLogsCollector.INSTANCE.getLogsCollectingEnabled()) {
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String concat = "[Integration] ".concat(String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length)));
            boolean z = c;
            String str2 = b;
            if (z) {
                Log.e(str2, concat);
            }
            if (MobileAdsLogsCollector.INSTANCE.getLogsCollectingEnabled()) {
                a.a(mt1.d, str2, concat);
            }
        }
    }

    public static final void b(String str, Object... objArr) {
        if (c || MobileAdsLogsCollector.INSTANCE.getLogsCollectingEnabled()) {
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String concat = "[Integration] ".concat(String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length)));
            boolean z = c;
            String str2 = b;
            if (z) {
                Log.i(str2, concat);
            }
            if (MobileAdsLogsCollector.INSTANCE.getLogsCollectingEnabled()) {
                a.a(mt1.b, str2, concat);
            }
        }
    }

    public static final void c(String str, Object... objArr) {
        if (c || MobileAdsLogsCollector.INSTANCE.getLogsCollectingEnabled()) {
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String concat = "[Integration] ".concat(String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length)));
            if (MobileAdsLogsCollector.INSTANCE.getLogsCollectingEnabled()) {
                a.a(mt1.c, b, concat);
            }
        }
    }
}
