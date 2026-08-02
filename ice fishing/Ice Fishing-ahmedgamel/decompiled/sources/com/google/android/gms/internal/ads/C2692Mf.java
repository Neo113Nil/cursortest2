package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Mf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2692Mf {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f27089a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f27090b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f27091c;

    /* renamed from: d, reason: collision with root package name */
    public final C3067cm f27092d;

    public C2692Mf(Context context, C3067cm c3067cm) {
        this.f27091c = context;
        this.f27092d = c3067cm;
    }

    public final synchronized void a(String str) {
        try {
            HashMap hashMap = this.f27089a;
            if (hashMap.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f27091c) : this.f27091c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf = new SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf(this, str);
            hashMap.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf);
        } catch (Throwable th) {
            throw th;
        }
    }
}
