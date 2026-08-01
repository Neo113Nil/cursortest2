package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Kf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25935a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25936b;

    /* renamed from: c, reason: collision with root package name */
    public Object f25937c;

    public /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf(C3315ho c3315ho, String str) {
        this.f25935a = 1;
        this.f25937c = c3315ho;
        this.f25936b = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.f25935a) {
            case 0:
                C2672Mf c2672Mf = (C2672Mf) this.f25937c;
                synchronized (c2672Mf) {
                    try {
                        Iterator it = c2672Mf.f26301b.iterator();
                        while (it.hasNext()) {
                            C2655Lf c2655Lf = (C2655Lf) it.next();
                            String str2 = (String) this.f25936b;
                            C2672Mf c2672Mf2 = c2655Lf.f26124a;
                            c2672Mf2.getClass();
                            HashMap hashMap = c2655Lf.f26125b;
                            if (hashMap.containsKey(str2) && ((Set) hashMap.get(str2)).contains(str)) {
                                C2991bm c2991bm = c2672Mf2.f26303d;
                                ((T2.a) c2991bm.f29323u).getClass();
                                ((C2519Df) c2991bm.f29324v).a(-1, System.currentTimeMillis());
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                C3315ho c3315ho = (C3315ho) this.f25937c;
                c3315ho.i.set(t8.g.M(c3315ho.f30941b, (String) this.f25936b));
                return;
            case 2:
                if (str != null && ((List) this.f25937c).contains(str)) {
                    try {
                        Object obj = sharedPreferences.getAll().get(str);
                        JSONObject jSONObject = (JSONObject) this.f25936b;
                        if (obj == null) {
                            jSONObject.remove(str);
                        } else {
                            jSONObject.put(str, obj);
                        }
                        return;
                    } catch (JSONException e9) {
                        C4835j.f39733C.f39743h.e("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e9);
                        return;
                    }
                }
                return;
            default:
                u2.w wVar = (u2.w) this.f25937c;
                synchronized (wVar) {
                    try {
                        Iterator it2 = wVar.f41317b.iterator();
                        while (it2.hasNext()) {
                            u2.v vVar = (u2.v) it2.next();
                            String str3 = (String) this.f25936b;
                            HashMap hashMap2 = vVar.f41315a;
                            if (hashMap2.containsKey(str3) && ((Set) hashMap2.get(str3)).contains(str)) {
                                C4835j.f39733C.f39743h.g().u(false);
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf() {
        this.f25935a = 2;
        this.f25936b = new JSONObject();
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf(C2672Mf c2672Mf, String str) {
        this.f25935a = 0;
        Objects.requireNonNull(c2672Mf);
        this.f25937c = c2672Mf;
        this.f25936b = str;
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf(u2.w wVar, String str) {
        this.f25935a = 3;
        Objects.requireNonNull(wVar);
        this.f25937c = wVar;
        this.f25936b = str;
    }
}
