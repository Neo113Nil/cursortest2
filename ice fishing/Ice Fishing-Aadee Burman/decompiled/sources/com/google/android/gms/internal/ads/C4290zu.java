package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.zu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4290zu {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f35471a = new HashMap();

    public final C4236yu a(EnumC3912su enumC3912su, Context context, C3751pu c3751pu, C4178xq c4178xq) {
        C3966tu c3966tu;
        HashMap hashMap = this.f35471a;
        C4236yu c4236yu = (C4236yu) hashMap.get(enumC3912su);
        if (c4236yu != null) {
            return c4236yu;
        }
        if (enumC3912su == EnumC3912su.f34164n) {
            C3301ha c3301ha = AbstractC3569ma.f32304l7;
            q2.r rVar = q2.r.f40204e;
            int intValue = ((Integer) rVar.f40207c.a(c3301ha)).intValue();
            C3301ha c3301ha2 = AbstractC3569ma.f32358r7;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
            int intValue2 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).intValue();
            int intValue3 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32377t7)).intValue();
            String str = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32395v7);
            String str2 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32321n7);
            c3966tu = new C3966tu(context, enumC3912su, intValue, intValue2, intValue3, str, str2);
        } else if (enumC3912su == EnumC3912su.f34165u) {
            C3301ha c3301ha3 = AbstractC3569ma.f32312m7;
            q2.r rVar2 = q2.r.f40204e;
            int intValue4 = ((Integer) rVar2.f40207c.a(c3301ha3)).intValue();
            C3301ha c3301ha4 = AbstractC3569ma.f32368s7;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2 = rVar2.f40207c;
            int intValue5 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(c3301ha4)).intValue();
            int intValue6 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.f32385u7)).intValue();
            String str3 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.f32404w7);
            String str4 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.f32330o7);
            c3966tu = new C3966tu(context, enumC3912su, intValue4, intValue5, intValue6, str3, str4);
        } else if (enumC3912su == EnumC3912su.f34166v) {
            C3301ha c3301ha5 = AbstractC3569ma.f32431z7;
            q2.r rVar3 = q2.r.f40204e;
            int intValue7 = ((Integer) rVar3.f40207c.a(c3301ha5)).intValue();
            C3301ha c3301ha6 = AbstractC3569ma.f31986B7;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka3 = rVar3.f40207c;
            int intValue8 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka3.a(c3301ha6)).intValue();
            int intValue9 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka3.a(AbstractC3569ma.f31995C7)).intValue();
            String str5 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka3.a(AbstractC3569ma.f32414x7);
            String str6 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka3.a(AbstractC3569ma.y7);
            c3966tu = new C3966tu(context, enumC3912su, intValue7, intValue8, intValue9, str5, str6);
        } else {
            c3966tu = null;
        }
        C4274ze c4274ze = new C4274ze(c3966tu);
        C4236yu c4236yu2 = new C4236yu(c4274ze, new C3918t(c4274ze, c3751pu, c4178xq));
        hashMap.put(enumC3912su, c4236yu2);
        return c4236yu2;
    }
}
