package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Rs implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28061a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28062b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28063c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28064d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28065e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28066f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28067g;

    /* renamed from: h, reason: collision with root package name */
    public final String f28068h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f28069j;

    /* renamed from: k, reason: collision with root package name */
    public final String f28070k;

    /* renamed from: l, reason: collision with root package name */
    public final String f28071l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f28072m;

    /* renamed from: n, reason: collision with root package name */
    public final long f28073n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f28074o;

    /* renamed from: p, reason: collision with root package name */
    public final String f28075p;

    /* renamed from: q, reason: collision with root package name */
    public final int f28076q;

    /* renamed from: r, reason: collision with root package name */
    public final String f28077r;

    public Rs(boolean z6, boolean z9, String str, boolean z10, boolean z11, boolean z12, String str2, ArrayList arrayList, String str3, String str4, boolean z13, long j6, boolean z14, String str5, int i, String str6, String str7, String str8) {
        String str9 = Build.FINGERPRINT;
        String str10 = Build.MODEL;
        this.f28061a = z6;
        this.f28062b = z9;
        this.f28063c = str;
        this.f28064d = z10;
        this.f28065e = z11;
        this.f28066f = z12;
        this.f28067g = str2;
        this.f28068h = str6;
        this.f28069j = arrayList;
        this.f28070k = str3;
        this.f28071l = str4;
        this.f28072m = z13;
        this.f28073n = j6;
        this.f28074o = z14;
        this.f28075p = str5;
        this.f28076q = i;
        this.f28077r = str8;
        this.i = str7;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f28061a);
        bundle.putBoolean("coh", this.f28062b);
        bundle.putString("gl", this.f28063c);
        bundle.putBoolean("simulator", this.f28064d);
        bundle.putBoolean("is_latchsky", this.f28065e);
        bundle.putInt("build_api_level", this.f28076q);
        C3324ha c3324ha = AbstractC3592ma.vc;
        s2.r rVar = s2.r.f40506e;
        if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f28066f);
        }
        bundle.putString(com.anythink.expressad.f.a.b.f19187O, this.f28067g);
        C3324ha c3324ha2 = AbstractC3592ma.Ze;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue() || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.af)).booleanValue()) {
            bundle.putString("dlc", this.f28068h);
        }
        ArrayList<String> arrayList = this.f28069j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.i;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.f28070k);
        bundle.putString("submodel", Build.MODEL);
        Bundle b9 = MA.b("device", bundle);
        bundle.putBundle("device", b9);
        b9.putString("build", Build.FINGERPRINT);
        b9.putLong("remaining_data_partition_space", this.f28073n);
        Bundle b10 = MA.b("browser", b9);
        b9.putBundle("browser", b10);
        b10.putBoolean("is_browser_custom_tabs_capable", this.f28072m);
        String str3 = this.f28071l;
        if (!TextUtils.isEmpty(str3)) {
            Bundle b11 = MA.b("play_store", b9);
            b9.putBundle("play_store", b11);
            b11.putString("package_version", str3);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Lc)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f28074o);
        }
        String str4 = this.f28075p;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Fc)).booleanValue()) {
            MA.E(bundle, "gotmt_l", true, ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Cc)).booleanValue());
            MA.E(bundle, "gotmt_i", true, ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Bc)).booleanValue());
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Pf)).booleanValue() || (str = this.f28077r) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }
}
