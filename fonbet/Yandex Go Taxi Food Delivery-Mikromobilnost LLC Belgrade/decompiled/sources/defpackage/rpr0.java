package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes8.dex */
public abstract class rpr0 {
    public static boolean a(SharedPreferences.Editor editor, SharedPreferences.Editor editor2, SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return false;
        }
        editor2.putString(str, string);
        editor.remove(str);
        return true;
    }
}
