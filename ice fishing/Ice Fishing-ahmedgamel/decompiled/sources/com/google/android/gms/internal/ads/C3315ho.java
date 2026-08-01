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
import p2.C4835j;
import q2.C4896n;

/* renamed from: com.google.android.gms.internal.ads.ho, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3315ho {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f30940a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f30941b;

    /* renamed from: c, reason: collision with root package name */
    public final RD f30942c;

    /* renamed from: d, reason: collision with root package name */
    public final v2.l f30943d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30944e;

    /* renamed from: f, reason: collision with root package name */
    public final D2.b f30945f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f30946g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f30947h;
    public final AtomicReference i;

    public C3315ho(RD rd, v2.l lVar, C4896n c4896n, D2.b bVar, Context context) {
        PackageInfo packageInfo;
        HashMap hashMap = new HashMap();
        this.f30940a = hashMap;
        this.f30947h = new AtomicBoolean();
        this.i = new AtomicReference(new Bundle());
        this.f30942c = rd;
        this.f30943d = lVar;
        C3301ha c3301ha = AbstractC3569ma.f32007E2;
        q2.r rVar = q2.r.f40207e;
        this.f30944e = ((Boolean) rVar.f40210c.a(c3301ha)).booleanValue();
        this.f30945f = bVar;
        C3301ha c3301ha2 = AbstractC3569ma.f32122R7;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
        this.f30946g = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue();
        this.f30941b = context;
        hashMap.put(com.anythink.core.common.s.f16249a, "gmob_sdk");
        hashMap.put("v", "3");
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_v", Build.VERSION.SDK);
        C4835j c4835j = C4835j.f39733C;
        u2.D d2 = c4835j.f39738c;
        hashMap.put("device", u2.D.O());
        hashMap.put("app", (String) c4896n.f40193v);
        Context context2 = (Context) c4896n.f40192u;
        hashMap.put("is_lite_sdk", true != u2.D.f(context2) ? "0" : "1");
        ArrayList C8 = rVar.f40208a.C();
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32078M7)).booleanValue();
        C3038cg c3038cg = c4835j.f39743h;
        if (booleanValue) {
            C8.addAll(c3038cg.g().n().i);
        }
        hashMap.put("e", TextUtils.join(",", C8));
        hashMap.put("sdkVersion", (String) c4896n.f40194w);
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Kc)).booleanValue()) {
            hashMap.put("is_bstar", true != u2.D.d(context2) ? "0" : "1");
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.La)).booleanValue() && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32216c3)).booleanValue()) {
            String str = c3038cg.f29523g;
            hashMap.put("plugin", str == null ? "" : str);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Sc)).booleanValue()) {
            String str2 = (String) c4896n.f40196y;
            hashMap.put("uev", str2 != null ? str2 : "");
        }
        boolean booleanValue2 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32152V2)).booleanValue();
        B2.d dVar = (B2.d) c4896n.f40197z;
        if (booleanValue2) {
            hashMap.put("mem_tier", ((B2.a) dVar.f181c.get()).name());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32161W2)).booleanValue()) {
            hashMap.put("proc_tier", ((B2.c) dVar.f183e.get()).name());
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32170X2)).booleanValue() || (packageInfo = (PackageInfo) c4896n.f40195x) == null) {
            return;
        }
        hashMap.put(com.anythink.expressad.foundation.g.a.f19065M, String.valueOf(packageInfo.versionCode));
        hashMap.put(com.anythink.expressad.foundation.g.a.f19064L, String.valueOf(packageInfo.versionName));
    }

    public final void a(Map map) {
        Bundle M8;
        if (map == null || map.isEmpty()) {
            int i = u2.z.f41322b;
            v2.i.a("Empty or null paramMap.");
            return;
        }
        boolean andSet = this.f30947h.getAndSet(true);
        AtomicReference atomicReference = this.i;
        if (!andSet) {
            String str = (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ub);
            SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf = new SharedPreferencesOnSharedPreferenceChangeListenerC2638Kf(this, str);
            if (TextUtils.isEmpty(str)) {
                M8 = Bundle.EMPTY;
            } else {
                Context context = this.f30941b;
                PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2638Kf);
                M8 = t8.g.M(context, str);
            }
            atomicReference.set(M8);
        }
        Bundle bundle = (Bundle) atomicReference.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public final void b(Map map) {
        if (map.isEmpty()) {
            int i = u2.z.f41322b;
            v2.i.a("Empty paramMap.");
            return;
        }
        a(map);
        String a9 = this.f30945f.a(map);
        u2.z.k(a9);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f30944e) {
            if (!parseBoolean || this.f30946g) {
                this.f30942c.execute(new RunnableC3368io(this, a9, 1));
            }
        }
    }

    public final void c(AbstractMap abstractMap) {
        if (abstractMap.isEmpty()) {
            int i = u2.z.f41322b;
            v2.i.a("Empty paramMap.");
            return;
        }
        a(abstractMap);
        String a9 = this.f30945f.a(abstractMap);
        u2.z.k(a9);
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Le)).booleanValue() || this.f30944e) {
            this.f30942c.execute(new RunnableC3368io(this, a9, 0));
        }
    }
}
