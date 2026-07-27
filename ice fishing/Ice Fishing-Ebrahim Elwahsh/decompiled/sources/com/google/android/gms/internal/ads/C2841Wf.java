package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Wf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2841Wf {

    /* renamed from: d, reason: collision with root package name */
    public String f28422d;

    /* renamed from: e, reason: collision with root package name */
    public String f28423e;

    /* renamed from: f, reason: collision with root package name */
    public long f28424f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f28425g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28426h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f28427j;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28419a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f28420b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f28421c = new HashMap();
    public final ArrayList i = new ArrayList();

    public C2841Wf(String str, long j9) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.f28422d = "";
        this.f28426h = false;
        this.f28427j = false;
        this.f28423e = str;
        this.f28424f = j9;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f28425g = new JSONObject(str);
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.dd)).booleanValue() && a()) {
                return;
            }
            if (this.f28425g.optInt("status", -1) != 1) {
                this.f28426h = false;
                int i = t2.C.f40822b;
                u2.i.f("App settings could not be fetched successfully.");
                return;
            }
            this.f28426h = true;
            this.f28422d = this.f28425g.optString("app_id");
            JSONArray optJSONArray2 = this.f28425g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                    JSONObject jSONObject = optJSONArray2.getJSONObject(i4);
                    String optString = jSONObject.optString("format");
                    String optString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if (com.anythink.expressad.foundation.g.a.f.f19280d.equalsIgnoreCase(optString)) {
                            this.f28420b.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f28421c.put(optString2, new C3263gd(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.f28425g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i9 = 0; i9 < optJSONArray3.length(); i9++) {
                    this.f28419a.add(optJSONArray3.optString(i9));
                }
            }
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31499M7)).booleanValue() && (optJSONObject2 = this.f28425g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    this.i.add(optJSONArray.get(i10).toString());
                }
            }
            if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31686h7)).booleanValue() || (optJSONObject = this.f28425g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f28427j = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e6) {
            int i11 = t2.C.f40822b;
            u2.i.g("Exception occurred while processing app setting json", e6);
            p2.j.f39798C.f39808h.d("AppSettings.parseAppSettingsJson", e6);
        }
    }

    public final boolean a() {
        if (b()) {
            return false;
        }
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31629b5)).booleanValue()) {
            p2.j jVar = p2.j.f39798C;
            C3165eo c3165eo = jVar.f39808h.i;
            if (c3165eo != null) {
                C2593Hm a9 = c3165eo.a();
                a9.r(NativeAdvancedJsUtils.f18064p, "cld_reset");
                a9.r("cld_lut_ms", String.valueOf(this.f28424f));
                jVar.f39810k.getClass();
                a9.r("event_timestamp", String.valueOf(System.currentTimeMillis()));
                a9.r("cld_ttl_sec", String.valueOf(c()));
                a9.s();
            }
        }
        this.f28419a.clear();
        this.f28420b.clear();
        this.f28421c.clear();
        this.f28422d = "";
        this.f28423e = "";
        this.f28425g = null;
        this.f28426h = false;
        this.i.clear();
        this.f28427j = false;
        return true;
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.f28423e) || this.f28425g == null) {
            return true;
        }
        long c4 = c();
        p2.j.f39798C.f39810k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (c4 < 0) {
            return true;
        }
        long j9 = this.f28424f;
        return j9 <= currentTimeMillis && TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - j9) <= c4;
    }

    public final long c() {
        C3151ea c3151ea = AbstractC3368ia.gd;
        q2.r rVar = q2.r.f40116e;
        long longValue = ((Long) rVar.f40119c.a(c3151ea)).longValue();
        C3151ea c3151ea2 = AbstractC3368ia.fd;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        return (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue() || TextUtils.isEmpty(this.f28423e)) ? longValue : this.f28425g.optLong("cache_ttl_sec", ((Long) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea)).longValue());
    }
}
