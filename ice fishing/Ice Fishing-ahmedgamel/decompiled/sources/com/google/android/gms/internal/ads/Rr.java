package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class Rr implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final C3075cu f28058a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28059b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28060c;

    public Rr(C3075cu c3075cu, long j6, long j9) {
        this.f28058a = c3075cu;
        this.f28059b = j6;
        this.f28060c = j9;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        C3075cu c3075cu = this.f28058a;
        s2.c1 c1Var = c3075cu.f30393d;
        bundle.putInt("http_timeout_millis", c1Var.f40410P);
        bundle.putString("slotname", c3075cu.f30396g);
        int i = c3075cu.f30404p.f2062u;
        if (i == 0) {
            throw null;
        }
        int i4 = i - 1;
        if (i4 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i4 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j6 = this.f28059b;
        bundle.putLong("start_signals_timestamp", j6);
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.cf)).booleanValue()) {
            bundle.putLong("tsi", j6 - this.f28060c);
        }
        Bundle bundle2 = c1Var.f40419v;
        MA.E(bundle, "is_sdk_preload", true, bundle2.getBoolean("is_sdk_preload", false));
        MA.r(bundle, "prefetch_type", "zenith_v2", bundle2.getBoolean("zenith_v2", false));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j9 = c1Var.f40418u;
        MA.r(bundle, "cust_age", simpleDateFormat.format(new Date(j9)), j9 != -1);
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
        int i6 = c1Var.f40420w;
        MA.A(bundle, "cust_gender", i6, i6 != -1);
        List list = c1Var.f40421x;
        if (list != null) {
            bundle.putStringArrayList("kw", new ArrayList<>(list));
        }
        int i9 = c1Var.f40423z;
        MA.A(bundle, "tag_for_child_directed_treatment", i9, i9 != -1);
        if (c1Var.f40422y) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", c1Var.f40412R);
        int i10 = c1Var.f40417n;
        MA.A(bundle, "d_imp_hdr", 1, i10 >= 2 && c1Var.f40396A);
        String str = c1Var.f40397B;
        MA.r(bundle, "ppid", str, i10 >= 2 && !TextUtils.isEmpty(str));
        Location location = c1Var.f40399D;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong("lat", (long) latitude);
            bundle3.putLong("long", (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        MA.M("url", bundle, c1Var.f40400E);
        List list2 = c1Var.f40409O;
        if (list2 != null) {
            bundle.putStringArrayList("neighboring_content_urls", new ArrayList<>(list2));
        }
        Bundle bundle4 = c1Var.f40402G;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        List list3 = c1Var.f40403H;
        if (list3 != null) {
            bundle.putStringArrayList("category_exclusions", new ArrayList<>(list3));
        }
        MA.M("request_agent", bundle, c1Var.f40404I);
        MA.M("request_pkg", bundle, c1Var.J);
        MA.E(bundle, "is_designed_for_families", c1Var.f40405K, i10 >= 7);
        if (i10 >= 8) {
            int i11 = c1Var.f40407M;
            MA.A(bundle, "tag_for_under_age_of_consent", i11, i11 != -1);
            MA.M("max_ad_content_rating", bundle, c1Var.f40408N);
        }
        int i12 = c1Var.f40415U;
        MA.A(bundle, "tfat", i12, i12 != -1);
        Bundle bundle5 = c3075cu.f30394e;
        bundle.putInt("plcs", bundle5.getInt("plcs"));
        bundle.putInt("plbs", bundle5.getInt("plbs"));
        MA.M("plid", bundle, bundle5.getString("plid"));
        MA.A(bundle, "s2s_rr", 1, c3075cu.f30410v && !(c1Var.f40406L == null && c1Var.f40411Q == null));
    }
}
