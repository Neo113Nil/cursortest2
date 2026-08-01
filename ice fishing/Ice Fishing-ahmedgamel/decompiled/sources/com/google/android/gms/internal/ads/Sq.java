package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import n2.C4750a;
import n2.C4753d;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Sq implements InterfaceC3317hq {
    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final N3.a a(Yt yt, St st) {
        JSONObject jSONObject = st.f27646v;
        String optString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        C3052cu c3052cu = (C3052cu) yt.f28753a.f31863u;
        C2999bu c2999bu = new C2999bu();
        c2999bu.f29356o.f1974u = c3052cu.f29634p.f1974u;
        q2.c1 c1Var = c3052cu.f29623d;
        c2999bu.f29343a = c1Var;
        c2999bu.f29344b = c3052cu.f29625f;
        c2999bu.f29365x = c3052cu.f29642x;
        String str = c3052cu.f29626g;
        c2999bu.f29345c = str;
        c2999bu.f29346d = c3052cu.f29620a;
        c2999bu.f29348f = c3052cu.f29627h;
        c2999bu.f29349g = c3052cu.i;
        c2999bu.f29350h = c3052cu.f29628j;
        c2999bu.i = c3052cu.f29629k;
        C4750a c4750a = c3052cu.f29631m;
        c2999bu.f29351j = c4750a;
        if (c4750a != null) {
            c2999bu.f29347e = c4750a.f39460n;
        }
        C4753d c4753d = c3052cu.f29632n;
        c2999bu.f29352k = c4753d;
        if (c4753d != null) {
            c2999bu.f29347e = c4753d.f39468n;
            c2999bu.f29353l = c4753d.f39469u;
        }
        c2999bu.f29357p = c3052cu.f29635q;
        c2999bu.f29358q = c3052cu.f29636r;
        c2999bu.f29359r = c3052cu.f29622c;
        c2999bu.f29360s = c3052cu.f29637s;
        c2999bu.f29361t = c3052cu.f29638t;
        c2999bu.f29362u.set(c3052cu.f29639u.get());
        c2999bu.f29364w = c3052cu.f29641w;
        c2999bu.f29345c = optString;
        c2999bu.f29363v = true;
        Bundle bundle = c1Var.f40102F;
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
        JSONObject jSONObject2 = st.f27579D;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, optString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        c2999bu.f29343a = new q2.c1(c1Var.f40118n, c1Var.f40119u, bundle4, c1Var.f40121w, c1Var.f40122x, c1Var.f40123y, c1Var.f40124z, c1Var.f40097A, c1Var.f40098B, c1Var.f40099C, c1Var.f40100D, c1Var.f40101E, bundle2, c1Var.f40103G, c1Var.f40104H, c1Var.f40105I, c1Var.J, c1Var.f40106K, c1Var.f40107L, c1Var.f40108M, c1Var.f40109N, c1Var.f40110O, c1Var.f40111P, c1Var.f40112Q, c1Var.f40113R, c1Var.f40114S, c1Var.f40115T, c1Var.f40116U);
        c2999bu.f29364w = st.f27588H0;
        C3052cu a9 = c2999bu.a();
        Bundle bundle5 = new Bundle();
        C2570Gf c2570Gf = yt.f28754b;
        Bundle bundle6 = new Bundle();
        Ut ut = (Ut) c2570Gf.f25043v;
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(ut.f28003a));
        bundle6.putInt("refresh_interval", ut.f28005c);
        bundle6.putString("gws_query_id", ut.f28004b);
        bundle5.putBundle("parent_common_config", bundle6);
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        bundle7.putString("allocation_id", st.f27648w);
        bundle7.putString("ad_source_name", st.f27583F);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(st.f27610c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(st.f27612d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(st.f27634p));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(st.f27629m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(st.f27618g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(st.f27620h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(st.i));
        bundle7.putString("transaction_id", st.f27623j);
        bundle7.putString("valid_from_timestamp", st.f27625k);
        bundle7.putBoolean("is_closable_area_disabled", st.f27596P);
        bundle7.putString("recursive_server_response_data", st.f27633o0);
        bundle7.putBoolean("is_analytics_logging_enabled", st.f27603W);
        C3091df c3091df = st.f27627l;
        if (c3091df != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", c3091df.f29790u);
            bundle8.putString("rb_type", c3091df.f29789n);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(a9, bundle5, st, yt);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final boolean b(Yt yt, St st) {
        return !TextUtils.isEmpty(st.f27646v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    public abstract Iu c(C3052cu c3052cu, Bundle bundle, St st, Yt yt);
}
