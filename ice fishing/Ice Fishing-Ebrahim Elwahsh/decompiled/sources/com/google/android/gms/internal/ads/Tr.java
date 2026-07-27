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
public final class Tr implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final C3226fu f27852a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27853b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27854c;

    public Tr(C3226fu c3226fu, long j9, long j10) {
        this.f27852a = c3226fu;
        this.f27853b = j9;
        this.f27854c = j10;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        C3226fu c3226fu = this.f27852a;
        q2.d1 d1Var = c3226fu.f30901d;
        bundle.putInt("http_timeout_millis", d1Var.f40022P);
        bundle.putString("slotname", c3226fu.f30904g);
        int i = c3226fu.f30912p.f1421u;
        if (i == 0) {
            throw null;
        }
        int i4 = i - 1;
        if (i4 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i4 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j9 = this.f27853b;
        bundle.putLong("start_signals_timestamp", j9);
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.We)).booleanValue()) {
            bundle.putLong("tsi", j9 - this.f27854c);
        }
        Bundle bundle2 = d1Var.f40031v;
        AbstractC2720Pd.D(bundle, "is_sdk_preload", true, bundle2.getBoolean("is_sdk_preload", false));
        AbstractC2720Pd.q(bundle, "prefetch_type", "zenith_v2", bundle2.getBoolean("zenith_v2", false));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j10 = d1Var.f40030u;
        AbstractC2720Pd.q(bundle, "cust_age", simpleDateFormat.format(new Date(j10)), j10 != -1);
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
        int i9 = d1Var.f40032w;
        AbstractC2720Pd.y(bundle, "cust_gender", i9, i9 != -1);
        List list = d1Var.f40033x;
        if (list != null) {
            bundle.putStringArrayList("kw", new ArrayList<>(list));
        }
        int i10 = d1Var.f40035z;
        AbstractC2720Pd.y(bundle, "tag_for_child_directed_treatment", i10, i10 != -1);
        if (d1Var.f40034y) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", d1Var.f40024R);
        int i11 = d1Var.f40029n;
        AbstractC2720Pd.y(bundle, "d_imp_hdr", 1, i11 >= 2 && d1Var.f40008A);
        String str = d1Var.f40009B;
        AbstractC2720Pd.q(bundle, "ppid", str, i11 >= 2 && !TextUtils.isEmpty(str));
        Location location = d1Var.f40011D;
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
        AbstractC2720Pd.J("url", bundle, d1Var.f40012E);
        List list2 = d1Var.f40021O;
        if (list2 != null) {
            bundle.putStringArrayList("neighboring_content_urls", new ArrayList<>(list2));
        }
        Bundle bundle4 = d1Var.f40014G;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        List list3 = d1Var.f40015H;
        if (list3 != null) {
            bundle.putStringArrayList("category_exclusions", new ArrayList<>(list3));
        }
        AbstractC2720Pd.J("request_agent", bundle, d1Var.f40016I);
        AbstractC2720Pd.J("request_pkg", bundle, d1Var.J);
        AbstractC2720Pd.D(bundle, "is_designed_for_families", d1Var.f40017K, i11 >= 7);
        if (i11 >= 8) {
            int i12 = d1Var.f40019M;
            AbstractC2720Pd.y(bundle, "tag_for_under_age_of_consent", i12, i12 != -1);
            AbstractC2720Pd.J("max_ad_content_rating", bundle, d1Var.f40020N);
        }
        int i13 = d1Var.f40027U;
        AbstractC2720Pd.y(bundle, "tfat", i13, i13 != -1);
        Bundle bundle5 = c3226fu.f30902e;
        bundle.putInt("plcs", bundle5.getInt("plcs"));
        bundle.putInt("plbs", bundle5.getInt("plbs"));
        AbstractC2720Pd.J("plid", bundle, bundle5.getString("plid"));
        AbstractC2720Pd.y(bundle, "s2s_rr", 1, c3226fu.f30918v && !(d1Var.f40018L == null && d1Var.f40023Q == null));
    }
}
