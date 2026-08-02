package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import ru.kinopoisk.network.cookiejar.SerializableCookie;
import ru.kinopoisk.sdk.easylogin.internal.C1145n2;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class tuw {
    public final SharedPreferences a;

    public tuw(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
    }

    public static String a(ek6 ek6Var) {
        return (ek6Var.f ? "https" : "http") + "://" + ek6Var.d + ek6Var.e + "|" + ek6Var.a;
    }

    public final void b(List list) {
        list.getClass();
        SharedPreferences.Editor edit = this.a.edit();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ek6 ek6Var = (ek6) it.next();
            if (ek6Var.h) {
                try {
                    String a = a(ek6Var);
                    SerializableCookie.Companion.getClass();
                    edit.putString(a, whp.b(ek6Var));
                } catch (C1145n2 e) {
                    Timber.INSTANCE.tag("CookiePersistor").w(e, "Failed to serialize cookie: ignoring | cookie = %s", ek6Var);
                }
            }
        }
        edit.apply();
    }
}
