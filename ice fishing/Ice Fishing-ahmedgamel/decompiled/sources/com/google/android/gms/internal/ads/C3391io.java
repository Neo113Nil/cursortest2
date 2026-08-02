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
import r2.C4906k;
import s2.C4945n;

/* renamed from: com.google.android.gms.internal.ads.io, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3391io {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f31897a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f31898b;

    /* renamed from: c, reason: collision with root package name */
    public final RD f31899c;

    /* renamed from: d, reason: collision with root package name */
    public final x2.l f31900d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f31901e;

    /* renamed from: f, reason: collision with root package name */
    public final F2.b f31902f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31903g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f31904h;
    public final AtomicReference i;

    public C3391io(RD rd, x2.l lVar, C4945n c4945n, F2.b bVar, Context context) {
        PackageInfo packageInfo;
        HashMap hashMap = new HashMap();
        this.f31897a = hashMap;
        this.f31904h = new AtomicBoolean();
        this.i = new AtomicReference(new Bundle());
        this.f31899c = rd;
        this.f31900d = lVar;
        C3324ha c3324ha = AbstractC3592ma.f32788E2;
        s2.r rVar = s2.r.f40506e;
        this.f31901e = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
        this.f31902f = bVar;
        C3324ha c3324ha2 = AbstractC3592ma.f32901R7;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        this.f31903g = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue();
        this.f31898b = context;
        hashMap.put(com.anythink.core.common.s.f17036a, "gmob_sdk");
        hashMap.put("v", "3");
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_v", Build.VERSION.SDK);
        C4906k c4906k = C4906k.f40186C;
        w2.D d9 = c4906k.f40191c;
        hashMap.put("device", w2.D.O());
        hashMap.put("app", (String) c4945n.f40492v);
        Context context2 = (Context) c4945n.f40491u;
        hashMap.put("is_lite_sdk", true != w2.D.f(context2) ? "0" : "1");
        ArrayList B3 = rVar.f40507a.B();
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32857M7)).booleanValue();
        C3061cg c3061cg = c4906k.f40196h;
        if (booleanValue) {
            B3.addAll(c3061cg.g().n().i);
        }
        hashMap.put("e", TextUtils.join(",", B3));
        hashMap.put("sdkVersion", (String) c4945n.f40493w);
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Kc)).booleanValue()) {
            hashMap.put("is_bstar", true != w2.D.d(context2) ? "0" : "1");
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.La)).booleanValue() && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32995c3)).booleanValue()) {
            String str = c3061cg.f30308g;
            hashMap.put("plugin", str == null ? "" : str);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Sc)).booleanValue()) {
            String str2 = (String) c4945n.f40495y;
            hashMap.put("uev", str2 != null ? str2 : "");
        }
        boolean booleanValue2 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32932V2)).booleanValue();
        D2.d dVar = (D2.d) c4945n.f40496z;
        if (booleanValue2) {
            hashMap.put("mem_tier", ((D2.a) dVar.f600c.get()).name());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32941W2)).booleanValue()) {
            hashMap.put("proc_tier", ((D2.c) dVar.f602e.get()).name());
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32949X2)).booleanValue() || (packageInfo = (PackageInfo) c4945n.f40494x) == null) {
            return;
        }
        hashMap.put(com.anythink.expressad.foundation.g.a.f19852M, String.valueOf(packageInfo.versionCode));
        hashMap.put(com.anythink.expressad.foundation.g.a.f19851L, String.valueOf(packageInfo.versionName));
    }

    public final void a(Map map) {
        Bundle m9;
        if (map == null || map.isEmpty()) {
            int i = w2.z.f41712b;
            x2.i.a("Empty or null paramMap.");
            return;
        }
        boolean andSet = this.f31904h.getAndSet(true);
        AtomicReference atomicReference = this.i;
        if (!andSet) {
            String str = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ub);
            SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf = new SharedPreferencesOnSharedPreferenceChangeListenerC2658Kf(this, str);
            if (TextUtils.isEmpty(str)) {
                m9 = Bundle.EMPTY;
            } else {
                Context context = this.f31898b;
                PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2658Kf);
                m9 = com.bumptech.glide.h.m(context, str);
            }
            atomicReference.set(m9);
        }
        Bundle bundle = (Bundle) atomicReference.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public final void b(Map map) {
        if (map.isEmpty()) {
            int i = w2.z.f41712b;
            x2.i.a("Empty paramMap.");
            return;
        }
        a(map);
        String a9 = this.f31902f.a(map);
        w2.z.k(a9);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f31901e) {
            if (!parseBoolean || this.f31903g) {
                this.f31899c.execute(new RunnableC3444jo(this, a9, 1));
            }
        }
    }

    public final void c(AbstractMap abstractMap) {
        if (abstractMap.isEmpty()) {
            int i = w2.z.f41712b;
            x2.i.a("Empty paramMap.");
            return;
        }
        a(abstractMap);
        String a9 = this.f31902f.a(abstractMap);
        w2.z.k(a9);
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Le)).booleanValue() || this.f31901e) {
            this.f31899c.execute(new RunnableC3444jo(this, a9, 0));
        }
    }
}
