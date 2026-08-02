package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;
import r2.C4906k;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.Bf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC2505Bf implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24687a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f24688b;

    /* renamed from: c, reason: collision with root package name */
    public final C5140B f24689c;

    /* renamed from: d, reason: collision with root package name */
    public String f24690d = "-1";

    /* renamed from: e, reason: collision with root package name */
    public int f24691e = -1;

    public SharedPreferencesOnSharedPreferenceChangeListenerC2505Bf(Context context, C5140B c5140b) {
        this.f24688b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f24689c = c5140b;
        this.f24687a = context;
    }

    public final void a(int i, String str) {
        Context context;
        C3324ha c3324ha = AbstractC3592ma.f33050i1;
        s2.r rVar = s2.r.f40506e;
        boolean z6 = true;
        boolean z9 = (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && this.f24688b.getInt("IABTCF_gdprApplies", -1) == 0) ? false : true;
        C3324ha c3324ha2 = AbstractC3592ma.f33023f1;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue() ? !((str.isEmpty() || str.charAt(0) != '1') && z9) : !(i == 0 || ((str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) && z9))) {
            z6 = false;
        }
        this.f24689c.s(z6);
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33019e7)).booleanValue() && z6 && (context = this.f24687a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z6;
        try {
            C3324ha c3324ha = AbstractC3592ma.f33042h1;
            s2.r rVar = s2.r.f40506e;
            boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            if (booleanValue) {
                boolean equals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.f24687a;
                C5140B c5140b = this.f24689c;
                if (equals) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    c5140b.i();
                    if (i != c5140b.f41610m) {
                        c5140b.s(true);
                        com.bumptech.glide.h.l(context);
                    }
                    c5140b.b(i);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    c5140b.i();
                    String str2 = c5140b.f41609l;
                    c5140b.a(string);
                    if ((((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33050i1)).booleanValue() && sharedPreferences.getInt("IABTCF_gdprApplies", -1) == 0) || Objects.equals(string, str2)) {
                        return;
                    }
                    c5140b.s(true);
                    com.bumptech.glide.h.l(context);
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
                    z6 = true;
                }
                z6 = -1;
            } else {
                if (valueOf.equals("IABTCF_PurposeConsents")) {
                    z6 = false;
                }
                z6 = -1;
            }
            if (!z6) {
                if (string2.equals("-1") || this.f24690d.equals(string2)) {
                    return;
                }
                this.f24690d = string2;
                a(i4, string2);
                return;
            }
            if (z6 && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33023f1)).booleanValue() && i4 != -1 && this.f24691e != i4) {
                this.f24691e = i4;
                a(i4, string2);
            }
        } catch (Throwable th) {
            C4906k.f40186C.f40196h.d("AdMobPlusIdlessListener.onSharedPreferenceChanged", th);
            w2.z.l("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }
}
