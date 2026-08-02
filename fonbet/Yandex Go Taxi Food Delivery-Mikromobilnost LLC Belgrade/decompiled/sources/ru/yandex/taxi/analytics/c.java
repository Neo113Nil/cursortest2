package ru.yandex.taxi.analytics;

import android.net.Uri;
import com.adjust.sdk.AdjustAttribution;
import defpackage.u6;

/* loaded from: classes5.dex */
public abstract class c {
    private static volatile c a;

    public static void a(AdjustAttribution adjustAttribution) {
        d().e(adjustAttribution);
    }

    public static boolean b(u6 u6Var, Uri uri) {
        return d().f(u6Var, uri);
    }

    public static c c(c cVar) {
        a = cVar;
        return cVar;
    }

    public static c d() {
        if (a == null) {
            synchronized (c.class) {
                try {
                    if (a == null) {
                        a = new b();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract void e(AdjustAttribution adjustAttribution);

    public abstract boolean f(u6 u6Var, Uri uri);
}
