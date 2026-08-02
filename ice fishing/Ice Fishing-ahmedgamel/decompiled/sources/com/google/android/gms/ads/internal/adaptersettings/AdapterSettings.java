package com.google.android.gms.ads.internal.adaptersettings;

import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3270ga;
import s2.r;

/* loaded from: classes.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final SharedPreferencesOnSharedPreferenceChangeListenerC3270ga adapterSettingsInternal = r.f40506e.f40510d;

    private boolean getBoolean(String str, boolean z6) {
        SharedPreferencesOnSharedPreferenceChangeListenerC3270ga sharedPreferencesOnSharedPreferenceChangeListenerC3270ga = this.adapterSettingsInternal;
        sharedPreferencesOnSharedPreferenceChangeListenerC3270ga.getClass();
        return !str.startsWith("adapter:") ? z6 : sharedPreferencesOnSharedPreferenceChangeListenerC3270ga.f31339c.optBoolean(str, z6);
    }

    private float getFloat(String str, float f2) {
        SharedPreferencesOnSharedPreferenceChangeListenerC3270ga sharedPreferencesOnSharedPreferenceChangeListenerC3270ga = this.adapterSettingsInternal;
        sharedPreferencesOnSharedPreferenceChangeListenerC3270ga.getClass();
        return !str.startsWith("adapter:") ? f2 : (float) sharedPreferencesOnSharedPreferenceChangeListenerC3270ga.f31339c.optDouble(str, f2);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i) {
        SharedPreferencesOnSharedPreferenceChangeListenerC3270ga sharedPreferencesOnSharedPreferenceChangeListenerC3270ga = this.adapterSettingsInternal;
        sharedPreferencesOnSharedPreferenceChangeListenerC3270ga.getClass();
        return !str.startsWith("adapter:") ? i : sharedPreferencesOnSharedPreferenceChangeListenerC3270ga.f31339c.optInt(str, i);
    }

    private long getLong(String str, long j6) {
        SharedPreferencesOnSharedPreferenceChangeListenerC3270ga sharedPreferencesOnSharedPreferenceChangeListenerC3270ga = this.adapterSettingsInternal;
        sharedPreferencesOnSharedPreferenceChangeListenerC3270ga.getClass();
        return !str.startsWith("adapter:") ? j6 : sharedPreferencesOnSharedPreferenceChangeListenerC3270ga.f31339c.optLong(str, j6);
    }

    private String getString(String str, String str2) {
        SharedPreferencesOnSharedPreferenceChangeListenerC3270ga sharedPreferencesOnSharedPreferenceChangeListenerC3270ga = this.adapterSettingsInternal;
        sharedPreferencesOnSharedPreferenceChangeListenerC3270ga.getClass();
        return !str.startsWith("adapter:") ? str2 : sharedPreferencesOnSharedPreferenceChangeListenerC3270ga.f31339c.optString(str, str2);
    }
}
