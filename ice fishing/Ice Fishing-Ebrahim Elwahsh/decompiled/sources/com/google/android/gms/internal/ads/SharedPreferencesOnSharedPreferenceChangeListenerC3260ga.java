package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.StrictMode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ga, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC3260ga implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public Context f31016g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f31010a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ConditionVariable f31011b = new ConditionVariable();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f31012c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f31013d = false;

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences f31014e = null;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f31015f = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public JSONObject f31017h = new JSONObject();
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f31018j = false;

    public final Object a(C3151ea c3151ea) {
        if (!this.f31011b.block(com.anythink.basead.exoplayer.f.f7344a)) {
            synchronized (this.f31010a) {
                try {
                    if (!this.f31013d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f31012c || this.f31014e == null || this.f31018j) {
            synchronized (this.f31010a) {
                if (this.f31012c && this.f31014e != null && !this.f31018j) {
                }
                return c3151ea.c();
            }
        }
        int i = c3151ea.f30436a;
        if (i != 2) {
            if (i == 1 && this.f31017h.has(c3151ea.f30437b)) {
                return c3151ea.a(this.f31017h);
            }
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return c3151ea.b(this.f31014e);
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
        Bundle bundle = this.f31015f;
        if (bundle == null) {
            return c3151ea.c();
        }
        switch (c3151ea.f30440e) {
            case 0:
                String str = c3151ea.f30437b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) c3151ea.c();
            case 1:
                String str2 = c3151ea.f30437b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str2)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str2))) : (Integer) c3151ea.c();
            case 2:
                String str3 = c3151ea.f30437b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str3)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str3))) : (Long) c3151ea.c();
            case 3:
                String str4 = c3151ea.f30437b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str4)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str4))) : (Float) c3151ea.c();
            default:
                String str5 = c3151ea.f30437b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str5)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str5)) : (String) c3151ea.c();
        }
    }

    public final Object b(C3151ea c3151ea) {
        return (this.f31012c || this.f31013d) ? a(c3151ea) : c3151ea.c();
    }

    public final void c(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                try {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                    String string = sharedPreferences.getString("flag_configuration", "{}");
                    StrictMode.setThreadPolicy(threadPolicy);
                    this.f31017h = new JSONObject(string);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            c(sharedPreferences);
        }
    }
}
