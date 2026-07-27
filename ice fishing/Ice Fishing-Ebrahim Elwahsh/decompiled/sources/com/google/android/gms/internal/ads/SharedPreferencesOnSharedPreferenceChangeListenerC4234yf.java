package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.yf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC4234yf implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f35358a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f35359b;

    /* renamed from: c, reason: collision with root package name */
    public final t2.E f35360c;

    /* renamed from: d, reason: collision with root package name */
    public String f35361d = "-1";

    /* renamed from: e, reason: collision with root package name */
    public int f35362e = -1;

    public SharedPreferencesOnSharedPreferenceChangeListenerC4234yf(Context context, t2.E e6) {
        this.f35359b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f35360c = e6;
        this.f35358a = context;
    }

    public final void a(int i, String str) {
        Context context;
        C3151ea c3151ea = AbstractC3368ia.f31689i1;
        q2.r rVar = q2.r.f40116e;
        boolean z8 = true;
        boolean z9 = (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && this.f35359b.getInt("IABTCF_gdprApplies", -1) == 0) ? false : true;
        C3151ea c3151ea2 = AbstractC3368ia.f31661f1;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue() ? !((str.isEmpty() || str.charAt(0) != '1') && z9) : !(i == 0 || ((str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) && z9))) {
            z8 = false;
        }
        this.f35360c.s(z8);
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31657e7)).booleanValue() && z8 && (context = this.f35358a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z8;
        try {
            C3151ea c3151ea = AbstractC3368ia.f31680h1;
            q2.r rVar = q2.r.f40116e;
            boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            if (booleanValue) {
                boolean equals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.f35358a;
                t2.E e6 = this.f35360c;
                if (equals) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    e6.i();
                    if (i != e6.f40841m) {
                        e6.s(true);
                        com.bumptech.glide.h.E(context);
                    }
                    e6.b(i);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    e6.i();
                    String str2 = e6.f40840l;
                    e6.a(string);
                    if ((((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31689i1)).booleanValue() && sharedPreferences.getInt("IABTCF_gdprApplies", -1) == 0) || Objects.equals(string, str2)) {
                        return;
                    }
                    e6.s(true);
                    com.bumptech.glide.h.E(context);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i4 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String valueOf = String.valueOf(str);
            int hashCode = valueOf.hashCode();
            if (hashCode != -2004976699) {
                if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                    z8 = true;
                }
                z8 = -1;
            } else {
                if (valueOf.equals("IABTCF_PurposeConsents")) {
                    z8 = false;
                }
                z8 = -1;
            }
            if (!z8) {
                if (string2.equals("-1") || this.f35361d.equals(string2)) {
                    return;
                }
                this.f35361d = string2;
                a(i4, string2);
                return;
            }
            if (z8 && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31661f1)).booleanValue() && i4 != -1 && this.f35362e != i4) {
                this.f35362e = i4;
                a(i4, string2);
            }
        } catch (Throwable th) {
            p2.j.f39798C.f39808h.d("AdMobPlusIdlessListener.onSharedPreferenceChanged", th);
            t2.C.l("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }
}
