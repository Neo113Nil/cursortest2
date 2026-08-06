package u;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1047a {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, C1049c c1049c) {
        c1049c.getClass();
        configuration.setLocales(null);
    }
}
