package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class Bu {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24102a = new HashMap();

    public final Au a(EnumC3979tu enumC3979tu, Context context, C3818qu c3818qu, C2478Aq c2478Aq) {
        C4087vu c4087vu;
        HashMap hashMap = this.f24102a;
        Au au = (Au) hashMap.get(enumC3979tu);
        if (au != null) {
            return au;
        }
        if (enumC3979tu == EnumC3979tu.f34492n) {
            C3151ea c3151ea = AbstractC3368ia.f31723l7;
            q2.r rVar = q2.r.f40116e;
            int intValue = ((Integer) rVar.f40119c.a(c3151ea)).intValue();
            C3151ea c3151ea2 = AbstractC3368ia.f31777r7;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            int intValue2 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).intValue();
            int intValue3 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31795t7)).intValue();
            String str = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31813v7);
            String str2 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31740n7);
            c4087vu = new C4087vu(context, enumC3979tu, intValue, intValue2, intValue3, str, str2);
        } else if (enumC3979tu == EnumC3979tu.f34493u) {
            C3151ea c3151ea3 = AbstractC3368ia.f31732m7;
            q2.r rVar2 = q2.r.f40116e;
            int intValue4 = ((Integer) rVar2.f40119c.a(c3151ea3)).intValue();
            C3151ea c3151ea4 = AbstractC3368ia.f31785s7;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2 = rVar2.f40119c;
            int intValue5 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(c3151ea4)).intValue();
            int intValue6 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.u7)).intValue();
            String str3 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.f31823w7);
            String str4 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.f31750o7);
            c4087vu = new C4087vu(context, enumC3979tu, intValue4, intValue5, intValue6, str3, str4);
        } else if (enumC3979tu == EnumC3979tu.f34494v) {
            C3151ea c3151ea5 = AbstractC3368ia.f31850z7;
            q2.r rVar3 = q2.r.f40116e;
            int intValue7 = ((Integer) rVar3.f40119c.a(c3151ea5)).intValue();
            C3151ea c3151ea6 = AbstractC3368ia.f31408B7;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga3 = rVar3.f40119c;
            int intValue8 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga3.a(c3151ea6)).intValue();
            int intValue9 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga3.a(AbstractC3368ia.C7)).intValue();
            String str5 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga3.a(AbstractC3368ia.f31832x7);
            String str6 = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga3.a(AbstractC3368ia.f31841y7);
            c4087vu = new C4087vu(context, enumC3979tu, intValue7, intValue8, intValue9, str5, str6);
        } else {
            c4087vu = null;
        }
        C4017ue c4017ue = new C4017ue(c4087vu);
        Au au2 = new Au(c4017ue, new C3877s(c4017ue, c3818qu, c2478Aq));
        hashMap.put(enumC3979tu, au2);
        return au2;
    }
}
