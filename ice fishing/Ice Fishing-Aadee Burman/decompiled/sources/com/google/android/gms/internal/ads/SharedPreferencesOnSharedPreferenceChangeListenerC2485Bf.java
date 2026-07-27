package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;
import p2.C4835j;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.Bf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC2485Bf implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23914a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f23915b;

    /* renamed from: c, reason: collision with root package name */
    public final C5069B f23916c;

    /* renamed from: d, reason: collision with root package name */
    public String f23917d = "-1";

    /* renamed from: e, reason: collision with root package name */
    public int f23918e = -1;

    public SharedPreferencesOnSharedPreferenceChangeListenerC2485Bf(Context context, C5069B c5069b) {
        this.f23915b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f23916c = c5069b;
        this.f23914a = context;
    }

    public final void a(int i, String str) {
        Context context;
        C3301ha c3301ha = AbstractC3569ma.f32270i1;
        q2.r rVar = q2.r.f40204e;
        boolean z3 = true;
        boolean z6 = (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() && this.f23915b.getInt("IABTCF_gdprApplies", -1) == 0) ? false : true;
        C3301ha c3301ha2 = AbstractC3569ma.f32243f1;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue() ? !((str.isEmpty() || str.charAt(0) != '1') && z6) : !(i == 0 || ((str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) && z6))) {
            z3 = false;
        }
        this.f23916c.s(z3);
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32239e7)).booleanValue() && z3 && (context = this.f23914a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z3;
        try {
            C3301ha c3301ha = AbstractC3569ma.f32261h1;
            q2.r rVar = q2.r.f40204e;
            boolean booleanValue = ((Boolean) rVar.f40207c.a(c3301ha)).booleanValue();
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
            if (booleanValue) {
                boolean equals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.f23914a;
                C5069B c5069b = this.f23916c;
                if (equals) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    c5069b.i();
                    if (i != c5069b.f41217m) {
                        c5069b.s(true);
                        t8.g.J(context);
                    }
                    c5069b.b(i);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    c5069b.i();
                    String str2 = c5069b.f41216l;
                    c5069b.a(string);
                    if ((((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32270i1)).booleanValue() && sharedPreferences.getInt("IABTCF_gdprApplies", -1) == 0) || Objects.equals(string, str2)) {
                        return;
                    }
                    c5069b.s(true);
                    t8.g.J(context);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i6 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String valueOf = String.valueOf(str);
            int hashCode = valueOf.hashCode();
            if (hashCode != -2004976699) {
                if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                    z3 = true;
                }
                z3 = -1;
            } else {
                if (valueOf.equals("IABTCF_PurposeConsents")) {
                    z3 = false;
                }
                z3 = -1;
            }
            if (!z3) {
                if (string2.equals("-1") || this.f23917d.equals(string2)) {
                    return;
                }
                this.f23917d = string2;
                a(i6, string2);
                return;
            }
            if (z3 && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32243f1)).booleanValue() && i6 != -1 && this.f23918e != i6) {
                this.f23918e = i6;
                a(i6, string2);
            }
        } catch (Throwable th) {
            C4835j.f39730C.f39740h.d("AdMobPlusIdlessListener.onSharedPreferenceChanged", th);
            u2.z.l("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }
}
