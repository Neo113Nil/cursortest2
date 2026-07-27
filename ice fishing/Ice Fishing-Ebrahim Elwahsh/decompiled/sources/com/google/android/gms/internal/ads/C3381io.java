package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import q2.C4903n;

/* renamed from: com.google.android.gms.internal.ads.io, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3381io {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f31998a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f31999b;

    /* renamed from: c, reason: collision with root package name */
    public final SD f32000c;

    /* renamed from: d, reason: collision with root package name */
    public final u2.l f32001d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f32002e;

    /* renamed from: f, reason: collision with root package name */
    public final C2.b f32003f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f32004g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f32005h;
    public final AtomicReference i;

    public C3381io(SD sd, u2.l lVar, C4903n c4903n, C2.b bVar, Context context) {
        PackageInfo packageInfo;
        HashMap hashMap = new HashMap();
        this.f31998a = hashMap;
        this.f32005h = new AtomicBoolean();
        this.i = new AtomicReference(new Bundle());
        this.f32000c = sd;
        this.f32001d = lVar;
        C3151ea c3151ea = AbstractC3368ia.f31427E2;
        q2.r rVar = q2.r.f40116e;
        this.f32002e = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
        this.f32003f = bVar;
        C3151ea c3151ea2 = AbstractC3368ia.f31542R7;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        this.f32004g = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue();
        this.f31999b = context;
        hashMap.put(com.anythink.core.common.s.f16407a, "gmob_sdk");
        hashMap.put("v", "3");
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_v", Build.VERSION.SDK);
        p2.j jVar = p2.j.f39798C;
        t2.G g9 = jVar.f39803c;
        hashMap.put("device", t2.G.O());
        hashMap.put("app", (String) c4903n.f40102v);
        Context context2 = (Context) c4903n.f40101u;
        hashMap.put("is_lite_sdk", true != t2.G.f(context2) ? "0" : "1");
        ArrayList C7 = rVar.f40117a.C();
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31499M7)).booleanValue();
        C2892Zf c2892Zf = jVar.f39808h;
        if (booleanValue) {
            C7.addAll(c2892Zf.g().n().i);
        }
        hashMap.put("e", TextUtils.join(",", C7));
        hashMap.put("sdkVersion", (String) c4903n.f40103w);
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Kc)).booleanValue()) {
            hashMap.put("is_bstar", true != t2.G.d(context2) ? "0" : "1");
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.La)).booleanValue() && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31637c3)).booleanValue()) {
            String str = c2892Zf.f29018g;
            hashMap.put("plugin", str == null ? "" : str);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Sc)).booleanValue()) {
            String str2 = (String) c4903n.f40105y;
            hashMap.put("uev", str2 != null ? str2 : "");
        }
        boolean booleanValue2 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31572V2)).booleanValue();
        A2.d dVar = (A2.d) c4903n.f40106z;
        if (booleanValue2) {
            hashMap.put("mem_tier", ((A2.a) dVar.f30c.get()).name());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31581W2)).booleanValue()) {
            hashMap.put("proc_tier", ((A2.c) dVar.f32e.get()).name());
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31590X2)).booleanValue() || (packageInfo = (PackageInfo) c4903n.f40104x) == null) {
            return;
        }
        hashMap.put(com.anythink.expressad.foundation.g.a.f19223M, String.valueOf(packageInfo.versionCode));
        hashMap.put(com.anythink.expressad.foundation.g.a.f19222L, String.valueOf(packageInfo.versionName));
    }

    public final void a(Map map) {
        Bundle F8;
        if (map == null || map.isEmpty()) {
            int i = t2.C.f40822b;
            u2.i.a("Empty or null paramMap.");
            return;
        }
        boolean andSet = this.f32005h.getAndSet(true);
        AtomicReference atomicReference = this.i;
        if (!andSet) {
            String str = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ub);
            SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf = new SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf(this, str);
            if (TextUtils.isEmpty(str)) {
                F8 = Bundle.EMPTY;
            } else {
                Context context = this.f31999b;
                PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf);
                F8 = com.bumptech.glide.h.F(context, str);
            }
            atomicReference.set(F8);
        }
        Bundle bundle = (Bundle) atomicReference.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public final void b(Map map) {
        if (map.isEmpty()) {
            int i = t2.C.f40822b;
            u2.i.a("Empty paramMap.");
            return;
        }
        a(map);
        String a9 = this.f32003f.a(map);
        t2.C.k(a9);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f32002e) {
            if (!parseBoolean || this.f32004g) {
                this.f32000c.execute(new RunnableC3434jo(this, a9, 1));
            }
        }
    }

    public final void c(AbstractMap abstractMap) {
        if (abstractMap.isEmpty()) {
            int i = t2.C.f40822b;
            u2.i.a("Empty paramMap.");
            return;
        }
        a(abstractMap);
        String a9 = this.f32003f.a(abstractMap);
        t2.C.k(a9);
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Fe)).booleanValue() || this.f32002e) {
            this.f32000c.execute(new RunnableC3434jo(this, a9, 0));
        }
    }
}
