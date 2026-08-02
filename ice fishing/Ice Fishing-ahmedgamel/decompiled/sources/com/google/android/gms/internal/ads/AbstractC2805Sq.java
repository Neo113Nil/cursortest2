package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import p2.C4830a;
import p2.C4833d;

/* renamed from: com.google.android.gms.internal.ads.Sq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2805Sq implements InterfaceC3340hq {
    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final P3.a a(Yt yt, St st) {
        JSONObject jSONObject = st.f28429v;
        String optString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        C3075cu c3075cu = (C3075cu) yt.f29532a.f32643u;
        C3022bu c3022bu = new C3022bu();
        c3022bu.f30144o.f2062u = c3075cu.f30404p.f2062u;
        s2.c1 c1Var = c3075cu.f30393d;
        c3022bu.f30131a = c1Var;
        c3022bu.f30132b = c3075cu.f30395f;
        c3022bu.f30153x = c3075cu.f30412x;
        String str = c3075cu.f30396g;
        c3022bu.f30133c = str;
        c3022bu.f30134d = c3075cu.f30390a;
        c3022bu.f30136f = c3075cu.f30397h;
        c3022bu.f30137g = c3075cu.i;
        c3022bu.f30138h = c3075cu.f30398j;
        c3022bu.i = c3075cu.f30399k;
        C4830a c4830a = c3075cu.f30401m;
        c3022bu.f30139j = c4830a;
        if (c4830a != null) {
            c3022bu.f30135e = c4830a.f39800n;
        }
        C4833d c4833d = c3075cu.f30402n;
        c3022bu.f30140k = c4833d;
        if (c4833d != null) {
            c3022bu.f30135e = c4833d.f39808n;
            c3022bu.f30141l = c4833d.f39809u;
        }
        c3022bu.f30145p = c3075cu.f30405q;
        c3022bu.f30146q = c3075cu.f30406r;
        c3022bu.f30147r = c3075cu.f30392c;
        c3022bu.f30148s = c3075cu.f30407s;
        c3022bu.f30149t = c3075cu.f30408t;
        c3022bu.f30150u.set(c3075cu.f30409u.get());
        c3022bu.f30152w = c3075cu.f30411w;
        c3022bu.f30133c = optString;
        c3022bu.f30151v = true;
        Bundle bundle = c1Var.f40401F;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        String optString2 = jSONObject.optString("mad_hac", null);
        if (optString2 != null) {
            bundle4.putString("mad_hac", optString2);
        }
        String optString3 = jSONObject.optString("adJson", null);
        if (optString3 != null) {
            bundle4.putString("_ad", optString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = st.f28362D;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, optString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        c3022bu.f30131a = new s2.c1(c1Var.f40417n, c1Var.f40418u, bundle4, c1Var.f40420w, c1Var.f40421x, c1Var.f40422y, c1Var.f40423z, c1Var.f40396A, c1Var.f40397B, c1Var.f40398C, c1Var.f40399D, c1Var.f40400E, bundle2, c1Var.f40402G, c1Var.f40403H, c1Var.f40404I, c1Var.J, c1Var.f40405K, c1Var.f40406L, c1Var.f40407M, c1Var.f40408N, c1Var.f40409O, c1Var.f40410P, c1Var.f40411Q, c1Var.f40412R, c1Var.f40413S, c1Var.f40414T, c1Var.f40415U);
        c3022bu.f30152w = st.f28371H0;
        C3075cu a9 = c3022bu.a();
        Bundle bundle5 = new Bundle();
        C2590Gf c2590Gf = yt.f29533b;
        Bundle bundle6 = new Bundle();
        Ut ut = (Ut) c2590Gf.f25831v;
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(ut.f28800a));
        bundle6.putInt("refresh_interval", ut.f28802c);
        bundle6.putString("gws_query_id", ut.f28801b);
        bundle5.putBundle("parent_common_config", bundle6);
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        bundle7.putString("allocation_id", st.f28431w);
        bundle7.putString("ad_source_name", st.f28366F);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(st.f28393c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(st.f28395d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(st.f28417p));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(st.f28412m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(st.f28401g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(st.f28403h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(st.i));
        bundle7.putString("transaction_id", st.f28406j);
        bundle7.putString("valid_from_timestamp", st.f28408k);
        bundle7.putBoolean("is_closable_area_disabled", st.f28379P);
        bundle7.putString("recursive_server_response_data", st.f28416o0);
        bundle7.putBoolean("is_analytics_logging_enabled", st.f28386W);
        C3114df c3114df = st.f28410l;
        if (c3114df != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", c3114df.f30563u);
            bundle8.putString("rb_type", c3114df.f30562n);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(a9, bundle5, st, yt);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final boolean b(Yt yt, St st) {
        return !TextUtils.isEmpty(st.f28429v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    public abstract Iu c(C3075cu c3075cu, Bundle bundle, St st, Yt yt);
}
