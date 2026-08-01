package com.google.android.gms.ads.internal.adaptersettings;

import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3247ga;
import q2.r;

/* loaded from: classes.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final SharedPreferencesOnSharedPreferenceChangeListenerC3247ga adapterSettingsInternal = r.f40207e.f40211d;

    private boolean getBoolean(String str, boolean z3) {
        SharedPreferencesOnSharedPreferenceChangeListenerC3247ga sharedPreferencesOnSharedPreferenceChangeListenerC3247ga = this.adapterSettingsInternal;
        sharedPreferencesOnSharedPreferenceChangeListenerC3247ga.getClass();
        return !str.startsWith("adapter:") ? z3 : sharedPreferencesOnSharedPreferenceChangeListenerC3247ga.f30572c.optBoolean(str, z3);
    }

    private float getFloat(String str, float f3) {
        SharedPreferencesOnSharedPreferenceChangeListenerC3247ga sharedPreferencesOnSharedPreferenceChangeListenerC3247ga = this.adapterSettingsInternal;
        sharedPreferencesOnSharedPreferenceChangeListenerC3247ga.getClass();
        return !str.startsWith("adapter:") ? f3 : (float) sharedPreferencesOnSharedPreferenceChangeListenerC3247ga.f30572c.optDouble(str, f3);
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
        SharedPreferencesOnSharedPreferenceChangeListenerC3247ga sharedPreferencesOnSharedPreferenceChangeListenerC3247ga = this.adapterSettingsInternal;
        sharedPreferencesOnSharedPreferenceChangeListenerC3247ga.getClass();
        return !str.startsWith("adapter:") ? i : sharedPreferencesOnSharedPreferenceChangeListenerC3247ga.f30572c.optInt(str, i);
    }

    private long getLong(String str, long j6) {
        SharedPreferencesOnSharedPreferenceChangeListenerC3247ga sharedPreferencesOnSharedPreferenceChangeListenerC3247ga = this.adapterSettingsInternal;
        sharedPreferencesOnSharedPreferenceChangeListenerC3247ga.getClass();
        return !str.startsWith("adapter:") ? j6 : sharedPreferencesOnSharedPreferenceChangeListenerC3247ga.f30572c.optLong(str, j6);
    }

    private String getString(String str, String str2) {
        SharedPreferencesOnSharedPreferenceChangeListenerC3247ga sharedPreferencesOnSharedPreferenceChangeListenerC3247ga = this.adapterSettingsInternal;
        sharedPreferencesOnSharedPreferenceChangeListenerC3247ga.getClass();
        return !str.startsWith("adapter:") ? str2 : sharedPreferencesOnSharedPreferenceChangeListenerC3247ga.f30572c.optString(str, str2);
    }
}
