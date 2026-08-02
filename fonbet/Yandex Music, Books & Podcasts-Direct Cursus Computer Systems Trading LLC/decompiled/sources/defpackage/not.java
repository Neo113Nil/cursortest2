package defpackage;

import android.content.SharedPreferences;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class not {
    public static void a(SharedPreferences sharedPreferences) {
        Timber.d("updating version info to latest", new Object[0]);
        sharedPreferences.edit().putString("version_name", "2026.07.4 #157gpr").putInt("version_code", 24026391).apply();
    }
}
