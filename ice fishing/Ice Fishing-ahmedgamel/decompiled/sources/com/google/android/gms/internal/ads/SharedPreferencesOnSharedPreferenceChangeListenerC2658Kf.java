package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Kf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26713a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26714b;

    /* renamed from: c, reason: collision with root package name */
    public Object f26715c;

    public /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf(C3391io c3391io, String str) {
        this.f26713a = 1;
        this.f26715c = c3391io;
        this.f26714b = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.f26713a) {
            case 0:
                C2692Mf c2692Mf = (C2692Mf) this.f26715c;
                synchronized (c2692Mf) {
                    try {
                        Iterator it = c2692Mf.f27090b.iterator();
                        while (it.hasNext()) {
                            C2675Lf c2675Lf = (C2675Lf) it.next();
                            String str2 = (String) this.f26714b;
                            C2692Mf c2692Mf2 = c2675Lf.f26921a;
                            c2692Mf2.getClass();
                            HashMap hashMap = c2675Lf.f26922b;
                            if (hashMap.containsKey(str2) && ((Set) hashMap.get(str2)).contains(str)) {
                                C3067cm c3067cm = c2692Mf2.f27092d;
                                ((V2.a) c3067cm.f30365u).getClass();
                                ((C2539Df) c3067cm.f30366v).a(-1, System.currentTimeMillis());
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                C3391io c3391io = (C3391io) this.f26715c;
                c3391io.i.set(com.bumptech.glide.h.m(c3391io.f31898b, (String) this.f26714b));
                return;
            case 2:
                if (str != null && ((List) this.f26715c).contains(str)) {
                    try {
                        Object obj = sharedPreferences.getAll().get(str);
                        JSONObject jSONObject = (JSONObject) this.f26714b;
                        if (obj == null) {
                            jSONObject.remove(str);
                        } else {
                            jSONObject.put(str, obj);
                        }
                        return;
                    } catch (JSONException e9) {
                        C4906k.f40186C.f40196h.e("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e9);
                        return;
                    }
                }
                return;
            default:
                w2.w wVar = (w2.w) this.f26715c;
                synchronized (wVar) {
                    try {
                        Iterator it2 = wVar.f41707b.iterator();
                        while (it2.hasNext()) {
                            w2.v vVar = (w2.v) it2.next();
                            String str3 = (String) this.f26714b;
                            HashMap hashMap2 = vVar.f41705a;
                            if (hashMap2.containsKey(str3) && ((Set) hashMap2.get(str3)).contains(str)) {
                                C4906k.f40186C.f40196h.g().u(false);
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf() {
        this.f26713a = 2;
        this.f26714b = new JSONObject();
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf(C2692Mf c2692Mf, String str) {
        this.f26713a = 0;
        Objects.requireNonNull(c2692Mf);
        this.f26715c = c2692Mf;
        this.f26714b = str;
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf(w2.w wVar, String str) {
        this.f26713a = 3;
        Objects.requireNonNull(wVar);
        this.f26715c = wVar;
        this.f26714b = str;
    }
}
