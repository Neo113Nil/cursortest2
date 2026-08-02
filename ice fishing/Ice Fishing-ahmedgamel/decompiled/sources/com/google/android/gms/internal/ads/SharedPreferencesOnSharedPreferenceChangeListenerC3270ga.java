package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ga, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC3270ga implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Object f31337a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences f31338b = null;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f31339c = new JSONObject();

    public final void a(Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        synchronized (this.f31337a) {
            try {
                if (this.f31338b != null) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                V2 v22 = s2.r.f40506e.f40508b;
                try {
                    sharedPreferences = context.getSharedPreferences("google_adapter_flags", 0);
                } catch (IllegalStateException e9) {
                    x2.i.g("", e9);
                    sharedPreferences = null;
                }
                this.f31338b = sharedPreferences;
                b(sharedPreferences);
                if (!((Boolean) AbstractC2738Pa.f27611b.r()).booleanValue() && (sharedPreferences2 = this.f31338b) != null) {
                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                try {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                    String string = sharedPreferences.getString("flag_configuration", "{}");
                    StrictMode.setThreadPolicy(threadPolicy);
                    this.f31339c = new JSONObject(string);
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
            b(sharedPreferences);
        }
    }
}
