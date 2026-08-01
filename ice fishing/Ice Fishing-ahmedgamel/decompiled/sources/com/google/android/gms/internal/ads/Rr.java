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
    public final C3052cu f27344a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27345b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27346c;

    public Rr(C3052cu c3052cu, long j6, long j9) {
        this.f27344a = c3052cu;
        this.f27345b = j6;
        this.f27346c = j9;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        C3052cu c3052cu = this.f27344a;
        q2.c1 c1Var = c3052cu.f29623d;
        bundle.putInt("http_timeout_millis", c1Var.f40111P);
        bundle.putString("slotname", c3052cu.f29626g);
        int i = c3052cu.f29634p.f1974u;
        if (i == 0) {
            throw null;
        }
        int i6 = i - 1;
        if (i6 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i6 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j6 = this.f27345b;
        bundle.putLong("start_signals_timestamp", j6);
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.cf)).booleanValue()) {
            bundle.putLong("tsi", j6 - this.f27346c);
        }
        Bundle bundle2 = c1Var.f40120v;
        MA.E(bundle, "is_sdk_preload", true, bundle2.getBoolean("is_sdk_preload", false));
        MA.r(bundle, "prefetch_type", "zenith_v2", bundle2.getBoolean("zenith_v2", false));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j9 = c1Var.f40119u;
        MA.r(bundle, "cust_age", simpleDateFormat.format(new Date(j9)), j9 != -1);
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
        int i9 = c1Var.f40121w;
        MA.A(bundle, "cust_gender", i9, i9 != -1);
        List list = c1Var.f40122x;
        if (list != null) {
            bundle.putStringArrayList("kw", new ArrayList<>(list));
        }
        int i10 = c1Var.f40124z;
        MA.A(bundle, "tag_for_child_directed_treatment", i10, i10 != -1);
        if (c1Var.f40123y) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", c1Var.f40113R);
        int i11 = c1Var.f40118n;
        MA.A(bundle, "d_imp_hdr", 1, i11 >= 2 && c1Var.f40097A);
        String str = c1Var.f40098B;
        MA.r(bundle, "ppid", str, i11 >= 2 && !TextUtils.isEmpty(str));
        Location location = c1Var.f40100D;
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
        MA.M("url", bundle, c1Var.f40101E);
        List list2 = c1Var.f40110O;
        if (list2 != null) {
            bundle.putStringArrayList("neighboring_content_urls", new ArrayList<>(list2));
        }
        Bundle bundle4 = c1Var.f40103G;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        List list3 = c1Var.f40104H;
        if (list3 != null) {
            bundle.putStringArrayList("category_exclusions", new ArrayList<>(list3));
        }
        MA.M("request_agent", bundle, c1Var.f40105I);
        MA.M("request_pkg", bundle, c1Var.J);
        MA.E(bundle, "is_designed_for_families", c1Var.f40106K, i11 >= 7);
        if (i11 >= 8) {
            int i12 = c1Var.f40108M;
            MA.A(bundle, "tag_for_under_age_of_consent", i12, i12 != -1);
            MA.M("max_ad_content_rating", bundle, c1Var.f40109N);
        }
        int i13 = c1Var.f40116U;
        MA.A(bundle, "tfat", i13, i13 != -1);
        Bundle bundle5 = c3052cu.f29624e;
        bundle.putInt("plcs", bundle5.getInt("plcs"));
        bundle.putInt("plbs", bundle5.getInt("plbs"));
        MA.M("plid", bundle, bundle5.getString("plid"));
        MA.A(bundle, "s2s_rr", 1, c3052cu.f29640v && !(c1Var.f40107L == null && c1Var.f40112Q == null));
    }
}
