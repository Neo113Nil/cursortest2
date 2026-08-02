package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.StrictMode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ka, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC3484ka implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public Context f32241g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f32235a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ConditionVariable f32236b = new ConditionVariable();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f32237c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f32238d = false;

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences f32239e = null;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f32240f = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public JSONObject f32242h = new JSONObject();
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32243j = false;

    public final Object a(C3324ha c3324ha) {
        if (!this.f32236b.block(com.anythink.basead.exoplayer.f.f7973a)) {
            synchronized (this.f32235a) {
                try {
                    if (!this.f32238d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f32237c || this.f32239e == null || this.f32243j) {
            synchronized (this.f32235a) {
                if (this.f32237c && this.f32239e != null && !this.f32243j) {
                }
                return c3324ha.c();
            }
        }
        int i = c3324ha.f31573a;
        if (i != 2) {
            if (i == 1 && this.f32242h.has(c3324ha.f31574b)) {
                return c3324ha.a(this.f32242h);
            }
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return c3324ha.b(this.f32239e);
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
        Bundle bundle = this.f32240f;
        if (bundle == null) {
            return c3324ha.c();
        }
        switch (c3324ha.f31577e) {
            case 0:
                String str = c3324ha.f31574b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) c3324ha.c();
            case 1:
                String str2 = c3324ha.f31574b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str2)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str2))) : (Integer) c3324ha.c();
            case 2:
                String str3 = c3324ha.f31574b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str3)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str3))) : (Long) c3324ha.c();
            case 3:
                String str4 = c3324ha.f31574b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str4)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str4))) : (Float) c3324ha.c();
            default:
                String str5 = c3324ha.f31574b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str5)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str5)) : (String) c3324ha.c();
        }
    }

    public final Object b(C3324ha c3324ha) {
        return (this.f32237c || this.f32238d) ? a(c3324ha) : c3324ha.c();
    }

    public final void c(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                try {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                    String string = sharedPreferences.getString("flag_configuration", "{}");
                    StrictMode.setThreadPolicy(threadPolicy);
                    this.f32242h = new JSONObject(string);
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
