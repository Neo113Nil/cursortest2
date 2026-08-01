package h;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: h.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0172m {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
