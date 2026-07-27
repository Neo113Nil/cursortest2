package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ga, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC3247ga implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Object f30570a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences f30571b = null;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f30572c = new JSONObject();

    public final void a(Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        synchronized (this.f30570a) {
            try {
                if (this.f30571b != null) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                V2 v22 = q2.r.f40204e.f40206b;
                try {
                    sharedPreferences = context.getSharedPreferences("google_adapter_flags", 0);
                } catch (IllegalStateException e9) {
                    v2.i.g("", e9);
                    sharedPreferences = null;
                }
                this.f30571b = sharedPreferences;
                b(sharedPreferences);
                if (!((Boolean) AbstractC2718Pa.f26823b.r()).booleanValue() && (sharedPreferences2 = this.f30571b) != null) {
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
                    this.f30572c = new JSONObject(string);
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
