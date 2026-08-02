package ru.CryptoPro.JCP.tools.pref_store;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public class AndroidPrefStore implements PrefStore {
    public final SharedPreferences a;

    public AndroidPrefStore(Context context) {
        this.a = context.getSharedPreferences("android_pref_store", 0);
    }

    @Override // ru.CryptoPro.JCP.tools.pref_store.PrefStore
    public boolean getBoolean(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    @Override // ru.CryptoPro.JCP.tools.pref_store.PrefStore
    public int getInt(String str, int i) {
        return this.a.getInt(str, i);
    }

    @Override // ru.CryptoPro.JCP.tools.pref_store.PrefStore
    public String getString(String str, String str2) {
        return this.a.getString(str, str2);
    }

    @Override // ru.CryptoPro.JCP.tools.pref_store.PrefStore
    public boolean putBoolean(String str, boolean z) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putBoolean(str, z);
        return edit.commit();
    }

    @Override // ru.CryptoPro.JCP.tools.pref_store.PrefStore
    public boolean putInt(String str, int i) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putInt(str, i);
        return edit.commit();
    }

    @Override // ru.CryptoPro.JCP.tools.pref_store.PrefStore
    public boolean putString(String str, String str2) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(str, str2);
        return edit.commit();
    }
}
