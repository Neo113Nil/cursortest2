package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Rs implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27347a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27348b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27349c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27350d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27351e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27352f;

    /* renamed from: g, reason: collision with root package name */
    public final String f27353g;

    /* renamed from: h, reason: collision with root package name */
    public final String f27354h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f27355j;

    /* renamed from: k, reason: collision with root package name */
    public final String f27356k;

    /* renamed from: l, reason: collision with root package name */
    public final String f27357l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f27358m;

    /* renamed from: n, reason: collision with root package name */
    public final long f27359n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f27360o;

    /* renamed from: p, reason: collision with root package name */
    public final String f27361p;

    /* renamed from: q, reason: collision with root package name */
    public final int f27362q;

    /* renamed from: r, reason: collision with root package name */
    public final String f27363r;

    public Rs(boolean z3, boolean z6, String str, boolean z9, boolean z10, boolean z11, String str2, ArrayList arrayList, String str3, String str4, boolean z12, long j6, boolean z13, String str5, int i, String str6, String str7, String str8) {
        String str9 = Build.FINGERPRINT;
        String str10 = Build.MODEL;
        this.f27347a = z3;
        this.f27348b = z6;
        this.f27349c = str;
        this.f27350d = z9;
        this.f27351e = z10;
        this.f27352f = z11;
        this.f27353g = str2;
        this.f27354h = str6;
        this.f27355j = arrayList;
        this.f27356k = str3;
        this.f27357l = str4;
        this.f27358m = z12;
        this.f27359n = j6;
        this.f27360o = z13;
        this.f27361p = str5;
        this.f27362q = i;
        this.f27363r = str8;
        this.i = str7;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f27347a);
        bundle.putBoolean("coh", this.f27348b);
        bundle.putString("gl", this.f27349c);
        bundle.putBoolean("simulator", this.f27350d);
        bundle.putBoolean("is_latchsky", this.f27351e);
        bundle.putInt("build_api_level", this.f27362q);
        C3301ha c3301ha = AbstractC3569ma.vc;
        q2.r rVar = q2.r.f40204e;
        if (!((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f27352f);
        }
        bundle.putString(com.anythink.expressad.f.a.b.f18400O, this.f27353g);
        C3301ha c3301ha2 = AbstractC3569ma.Ze;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue() || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.af)).booleanValue()) {
            bundle.putString("dlc", this.f27354h);
        }
        ArrayList<String> arrayList = this.f27355j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.i;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.f27356k);
        bundle.putString("submodel", Build.MODEL);
        Bundle b9 = MA.b("device", bundle);
        bundle.putBundle("device", b9);
        b9.putString("build", Build.FINGERPRINT);
        b9.putLong("remaining_data_partition_space", this.f27359n);
        Bundle b10 = MA.b("browser", b9);
        b9.putBundle("browser", b10);
        b10.putBoolean("is_browser_custom_tabs_capable", this.f27358m);
        String str3 = this.f27357l;
        if (!TextUtils.isEmpty(str3)) {
            Bundle b11 = MA.b("play_store", b9);
            b9.putBundle("play_store", b11);
            b11.putString("package_version", str3);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Lc)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f27360o);
        }
        String str4 = this.f27361p;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Fc)).booleanValue()) {
            MA.E(bundle, "gotmt_l", true, ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Cc)).booleanValue());
            MA.E(bundle, "gotmt_i", true, ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Bc)).booleanValue());
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Pf)).booleanValue() || (str = this.f27363r) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }
}
