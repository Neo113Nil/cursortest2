package com.google.android.gms.ads.internal.adaptersettings;

import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3097da;
import q2.r;

/* loaded from: classes.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final SharedPreferencesOnSharedPreferenceChangeListenerC3097da adapterSettingsInternal = r.f40116e.f40120d;

    private boolean getBoolean(String str, boolean z8) {
        SharedPreferencesOnSharedPreferenceChangeListenerC3097da sharedPreferencesOnSharedPreferenceChangeListenerC3097da = this.adapterSettingsInternal;
        sharedPreferencesOnSharedPreferenceChangeListenerC3097da.getClass();
        return !str.startsWith("adapter:") ? z8 : sharedPreferencesOnSharedPreferenceChangeListenerC3097da.f30063c.optBoolean(str, z8);
    }

    private float getFloat(String str, float f6) {
        SharedPreferencesOnSharedPreferenceChangeListenerC3097da sharedPreferencesOnSharedPreferenceChangeListenerC3097da = this.adapterSettingsInternal;
        sharedPreferencesOnSharedPreferenceChangeListenerC3097da.getClass();
        return !str.startsWith("adapter:") ? f6 : (float) sharedPreferencesOnSharedPreferenceChangeListenerC3097da.f30063c.optDouble(str, f6);
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
        SharedPreferencesOnSharedPreferenceChangeListenerC3097da sharedPreferencesOnSharedPreferenceChangeListenerC3097da = this.adapterSettingsInternal;
        sharedPreferencesOnSharedPreferenceChangeListenerC3097da.getClass();
        return !str.startsWith("adapter:") ? i : sharedPreferencesOnSharedPreferenceChangeListenerC3097da.f30063c.optInt(str, i);
    }

    private long getLong(String str, long j9) {
        SharedPreferencesOnSharedPreferenceChangeListenerC3097da sharedPreferencesOnSharedPreferenceChangeListenerC3097da = this.adapterSettingsInternal;
        sharedPreferencesOnSharedPreferenceChangeListenerC3097da.getClass();
        return !str.startsWith("adapter:") ? j9 : sharedPreferencesOnSharedPreferenceChangeListenerC3097da.f30063c.optLong(str, j9);
    }

    private String getString(String str, String str2) {
        SharedPreferencesOnSharedPreferenceChangeListenerC3097da sharedPreferencesOnSharedPreferenceChangeListenerC3097da = this.adapterSettingsInternal;
        sharedPreferencesOnSharedPreferenceChangeListenerC3097da.getClass();
        return !str.startsWith("adapter:") ? str2 : sharedPreferencesOnSharedPreferenceChangeListenerC3097da.f30063c.optString(str, str2);
    }
}
