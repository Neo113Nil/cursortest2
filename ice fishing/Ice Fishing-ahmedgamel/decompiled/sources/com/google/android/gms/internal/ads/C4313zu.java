package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.zu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4313zu {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f36240a = new HashMap();

    public final C4259yu a(EnumC3935su enumC3935su, Context context, C3774pu c3774pu, C4201xq c4201xq) {
        C3989tu c3989tu;
        HashMap hashMap = this.f36240a;
        C4259yu c4259yu = (C4259yu) hashMap.get(enumC3935su);
        if (c4259yu != null) {
            return c4259yu;
        }
        if (enumC3935su == EnumC3935su.f34950n) {
            C3324ha c3324ha = AbstractC3592ma.f33083l7;
            s2.r rVar = s2.r.f40506e;
            int intValue = ((Integer) rVar.f40509c.a(c3324ha)).intValue();
            C3324ha c3324ha2 = AbstractC3592ma.f33137r7;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            int intValue2 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).intValue();
            int intValue3 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33156t7)).intValue();
            String str = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33175v7);
            String str2 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33102n7);
            c3989tu = new C3989tu(context, enumC3935su, intValue, intValue2, intValue3, str, str2);
        } else if (enumC3935su == EnumC3935su.f34951u) {
            C3324ha c3324ha3 = AbstractC3592ma.f33092m7;
            s2.r rVar2 = s2.r.f40506e;
            int intValue4 = ((Integer) rVar2.f40509c.a(c3324ha3)).intValue();
            C3324ha c3324ha4 = AbstractC3592ma.f33147s7;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2 = rVar2.f40509c;
            int intValue5 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(c3324ha4)).intValue();
            int intValue6 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.f33165u7)).intValue();
            String str3 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.f33183w7);
            String str4 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.f33110o7);
            c3989tu = new C3989tu(context, enumC3935su, intValue4, intValue5, intValue6, str3, str4);
        } else if (enumC3935su == EnumC3935su.f34952v) {
            C3324ha c3324ha5 = AbstractC3592ma.f33211z7;
            s2.r rVar3 = s2.r.f40506e;
            int intValue7 = ((Integer) rVar3.f40509c.a(c3324ha5)).intValue();
            C3324ha c3324ha6 = AbstractC3592ma.f32766B7;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka3 = rVar3.f40509c;
            int intValue8 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka3.a(c3324ha6)).intValue();
            int intValue9 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka3.a(AbstractC3592ma.f32775C7)).intValue();
            String str5 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka3.a(AbstractC3592ma.f33193x7);
            String str6 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka3.a(AbstractC3592ma.y7);
            c3989tu = new C3989tu(context, enumC3935su, intValue7, intValue8, intValue9, str5, str6);
        } else {
            c3989tu = null;
        }
        C4297ze c4297ze = new C4297ze(c3989tu);
        C4259yu c4259yu2 = new C4259yu(c4297ze, new C3941t(c4297ze, c3774pu, c4201xq));
        hashMap.put(enumC3935su, c4259yu2);
        return c4259yu2;
    }
}
