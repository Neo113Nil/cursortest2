package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Hf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25376a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25377b;

    /* renamed from: c, reason: collision with root package name */
    public Object f25378c;

    public /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf(C3381io c3381io, String str) {
        this.f25376a = 1;
        this.f25378c = c3381io;
        this.f25377b = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.f25376a) {
            case 0:
                C2620Jf c2620Jf = (C2620Jf) this.f25378c;
                synchronized (c2620Jf) {
                    try {
                        Iterator it = c2620Jf.f25782b.iterator();
                        while (it.hasNext()) {
                            C2603If c2603If = (C2603If) it.next();
                            String str2 = (String) this.f25377b;
                            C2620Jf c2620Jf2 = c2603If.f25580a;
                            c2620Jf2.getClass();
                            HashMap hashMap = c2603If.f25581b;
                            if (hashMap.containsKey(str2) && ((Set) hashMap.get(str2)).contains(str)) {
                                C2881Yl c2881Yl = c2620Jf2.f25784d;
                                ((S2.a) c2881Yl.f28862u).getClass();
                                ((C2467Af) c2881Yl.f28863v).a(-1, System.currentTimeMillis());
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                C3381io c3381io = (C3381io) this.f25378c;
                c3381io.i.set(com.bumptech.glide.h.F(c3381io.f31999b, (String) this.f25377b));
                return;
            default:
                if (str != null && ((List) this.f25378c).contains(str)) {
                    try {
                        Object obj = sharedPreferences.getAll().get(str);
                        JSONObject jSONObject = (JSONObject) this.f25377b;
                        if (obj == null) {
                            jSONObject.remove(str);
                        } else {
                            jSONObject.put(str, obj);
                        }
                        return;
                    } catch (JSONException e6) {
                        p2.j.f39798C.f39808h.e("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e6);
                        return;
                    }
                }
                return;
        }
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf() {
        this.f25376a = 2;
        this.f25377b = new JSONObject();
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf(C2620Jf c2620Jf, String str) {
        this.f25376a = 0;
        Objects.requireNonNull(c2620Jf);
        this.f25378c = c2620Jf;
        this.f25377b = str;
    }
}
