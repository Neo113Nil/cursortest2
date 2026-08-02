package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Wr implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final s2.f1 f29195a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29196b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29197c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29198d;

    /* renamed from: e, reason: collision with root package name */
    public final float f29199e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29200f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29201g;

    /* renamed from: h, reason: collision with root package name */
    public final String f29202h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f29203j;

    /* renamed from: k, reason: collision with root package name */
    public final G.e f29204k;

    /* renamed from: l, reason: collision with root package name */
    public final Vr f29205l;

    public Wr(s2.f1 f1Var, String str, boolean z6, String str2, float f2, int i, int i4, String str3, int i6, boolean z9, G.e eVar, Vr vr) {
        R2.w.i(f1Var, "the adSize must not be null");
        this.f29195a = f1Var;
        this.f29196b = str;
        this.f29197c = z6;
        this.f29198d = str2;
        this.f29199e = f2;
        this.f29200f = i;
        this.f29201g = i4;
        this.f29202h = str3;
        this.i = i6;
        this.f29203j = z9;
        this.f29204k = eVar;
        this.f29205l = vr;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        s2.f1 f1Var = this.f29195a;
        int i = f1Var.f40445x;
        MA.r(bundle, "smart_w", com.anythink.expressad.f.a.b.ax, i == -1);
        int i4 = f1Var.f40442u;
        MA.r(bundle, "smart_h", "auto", i4 == -2);
        MA.E(bundle, "ene", true, f1Var.f40434C);
        MA.r(bundle, "rafmt", "102", f1Var.f40437F);
        MA.r(bundle, "rafmt", "108", f1Var.f40440I);
        MA.r(bundle, "rafmt", "103", f1Var.f40438G);
        boolean z6 = f1Var.f40439H;
        MA.r(bundle, "rafmt", "105", z6);
        MA.E(bundle, "inline_adaptive_slot", true, this.f29203j);
        MA.E(bundle, "interscroller_slot", true, z6);
        MA.M("format", bundle, this.f29196b);
        MA.r(bundle, "fluid", "height", this.f29197c);
        MA.r(bundle, "sz", this.f29198d, !TextUtils.isEmpty(r5));
        bundle.putFloat("u_sd", this.f29199e);
        bundle.putInt("sw", this.f29200f);
        bundle.putInt(com.anythink.expressad.foundation.d.e.f19461u, this.f29201g);
        String str = this.f29202h;
        MA.r(bundle, com.anythink.expressad.f.a.b.bI, str, true ^ TextUtils.isEmpty(str));
        int i6 = this.i;
        if (i6 != -1) {
            bundle.putInt("u_mso", i6);
        }
        G.e eVar = this.f29204k;
        if (eVar != null) {
            bundle.putInt("sam_t", eVar.f1032b);
            bundle.putInt("sam_b", eVar.f1034d);
            bundle.putInt("sam_l", eVar.f1031a);
            bundle.putInt("sam_r", eVar.f1033c);
        }
        Vr vr = this.f29205l;
        if (vr != null) {
            bundle.putInt("rc_tl", vr.f29048a);
            bundle.putInt("rc_tr", vr.f29049b);
            bundle.putInt("rc_bl", vr.f29050c);
            bundle.putInt("rc_br", vr.f29051d);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        s2.f1[] f1VarArr = f1Var.f40447z;
        if (f1VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i4);
            bundle2.putInt("width", i);
            bundle2.putBoolean("is_fluid_height", f1Var.f40433B);
            arrayList.add(bundle2);
        } else {
            for (s2.f1 f1Var2 : f1VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", f1Var2.f40433B);
                bundle3.putInt("height", f1Var2.f40442u);
                bundle3.putInt("width", f1Var2.f40445x);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
