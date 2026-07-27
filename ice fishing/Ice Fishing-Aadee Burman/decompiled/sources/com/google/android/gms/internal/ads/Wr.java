package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Wr implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final q2.f1 f28413a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28414b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28415c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28416d;

    /* renamed from: e, reason: collision with root package name */
    public final float f28417e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28418f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28419g;

    /* renamed from: h, reason: collision with root package name */
    public final String f28420h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f28421j;

    /* renamed from: k, reason: collision with root package name */
    public final G.e f28422k;

    /* renamed from: l, reason: collision with root package name */
    public final Vr f28423l;

    public Wr(q2.f1 f1Var, String str, boolean z3, String str2, float f3, int i, int i6, String str3, int i9, boolean z6, G.e eVar, Vr vr) {
        P2.w.i(f1Var, "the adSize must not be null");
        this.f28413a = f1Var;
        this.f28414b = str;
        this.f28415c = z3;
        this.f28416d = str2;
        this.f28417e = f3;
        this.f28418f = i;
        this.f28419g = i6;
        this.f28420h = str3;
        this.i = i9;
        this.f28421j = z6;
        this.f28422k = eVar;
        this.f28423l = vr;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        q2.f1 f1Var = this.f28413a;
        int i = f1Var.f40143x;
        MA.r(bundle, "smart_w", com.anythink.expressad.f.a.b.ax, i == -1);
        int i6 = f1Var.f40140u;
        MA.r(bundle, "smart_h", "auto", i6 == -2);
        MA.E(bundle, "ene", true, f1Var.f40132C);
        MA.r(bundle, "rafmt", "102", f1Var.f40135F);
        MA.r(bundle, "rafmt", "108", f1Var.f40138I);
        MA.r(bundle, "rafmt", "103", f1Var.f40136G);
        boolean z3 = f1Var.f40137H;
        MA.r(bundle, "rafmt", "105", z3);
        MA.E(bundle, "inline_adaptive_slot", true, this.f28421j);
        MA.E(bundle, "interscroller_slot", true, z3);
        MA.M("format", bundle, this.f28414b);
        MA.r(bundle, "fluid", "height", this.f28415c);
        MA.r(bundle, "sz", this.f28416d, !TextUtils.isEmpty(r5));
        bundle.putFloat("u_sd", this.f28417e);
        bundle.putInt("sw", this.f28418f);
        bundle.putInt(com.anythink.expressad.foundation.d.e.f18674u, this.f28419g);
        String str = this.f28420h;
        MA.r(bundle, com.anythink.expressad.f.a.b.bI, str, true ^ TextUtils.isEmpty(str));
        int i9 = this.i;
        if (i9 != -1) {
            bundle.putInt("u_mso", i9);
        }
        G.e eVar = this.f28422k;
        if (eVar != null) {
            bundle.putInt("sam_t", eVar.f1006b);
            bundle.putInt("sam_b", eVar.f1008d);
            bundle.putInt("sam_l", eVar.f1005a);
            bundle.putInt("sam_r", eVar.f1007c);
        }
        Vr vr = this.f28423l;
        if (vr != null) {
            bundle.putInt("rc_tl", vr.f28250a);
            bundle.putInt("rc_tr", vr.f28251b);
            bundle.putInt("rc_bl", vr.f28252c);
            bundle.putInt("rc_br", vr.f28253d);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        q2.f1[] f1VarArr = f1Var.f40145z;
        if (f1VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i6);
            bundle2.putInt("width", i);
            bundle2.putBoolean("is_fluid_height", f1Var.f40131B);
            arrayList.add(bundle2);
        } else {
            for (q2.f1 f1Var2 : f1VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", f1Var2.f40131B);
                bundle3.putInt("height", f1Var2.f40140u);
                bundle3.putInt("width", f1Var2.f40143x);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
