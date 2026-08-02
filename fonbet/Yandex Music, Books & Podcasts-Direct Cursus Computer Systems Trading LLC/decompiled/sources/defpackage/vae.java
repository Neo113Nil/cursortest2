package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class vae {
    public final SharedPreferences a;
    public final String b;
    public String c;

    public vae(vbv vbvVar) {
        String str;
        Object value = vbvVar.o.getValue();
        value.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) value;
        this.a = sharedPreferences;
        this.c = sharedPreferences.getString("DEVICE_ID_KEY", null);
        if (sharedPreferences.contains("X_UUID_KEY")) {
            str = sharedPreferences.getString("X_UUID_KEY", null);
            sharedPreferences.edit().remove("X_UUID_KEY").apply();
        } else {
            str = null;
        }
        if (sharedPreferences.contains("X_UUID_KEY_V2music")) {
            String string = sharedPreferences.getString("X_UUID_KEY_V2music", null);
            this.b = string == null ? hld.C() : string;
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        str = str == null ? hld.C() : str;
        this.b = str;
        edit.putString("X_UUID_KEY_V2music", str);
        edit.apply();
    }
}
