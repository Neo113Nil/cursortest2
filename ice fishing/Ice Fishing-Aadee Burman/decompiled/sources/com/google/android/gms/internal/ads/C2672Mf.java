package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Mf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2672Mf {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f26300a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f26301b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f26302c;

    /* renamed from: d, reason: collision with root package name */
    public final C2991bm f26303d;

    public C2672Mf(Context context, C2991bm c2991bm) {
        this.f26302c = context;
        this.f26303d = c2991bm;
    }

    public final synchronized void a(String str) {
        try {
            HashMap hashMap = this.f26300a;
            if (hashMap.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f26302c) : this.f26302c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf = new SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf(this, str);
            hashMap.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf);
        } catch (Throwable th) {
            throw th;
        }
    }
}
