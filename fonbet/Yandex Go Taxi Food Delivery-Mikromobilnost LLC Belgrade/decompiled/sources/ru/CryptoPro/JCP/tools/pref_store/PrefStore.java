package ru.CryptoPro.JCP.tools.pref_store;

/* loaded from: classes4.dex */
public interface PrefStore {
    boolean getBoolean(String str, boolean z);

    int getInt(String str, int i);

    String getString(String str, String str2);

    boolean putBoolean(String str, boolean z);

    boolean putInt(String str, int i);

    boolean putString(String str, String str2);
}
