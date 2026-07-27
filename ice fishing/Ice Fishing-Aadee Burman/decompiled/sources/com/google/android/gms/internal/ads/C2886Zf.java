package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Zf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2886Zf {

    /* renamed from: d, reason: collision with root package name */
    public String f28916d;

    /* renamed from: e, reason: collision with root package name */
    public String f28917e;

    /* renamed from: f, reason: collision with root package name */
    public long f28918f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f28919g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28920h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f28921j;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28913a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f28914b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f28915c = new HashMap();
    public final ArrayList i = new ArrayList();

    public C2886Zf(String str, long j6) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.f28916d = "";
        this.f28920h = false;
        this.f28921j = false;
        this.f28917e = str;
        this.f28918f = j6;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f28919g = new JSONObject(str);
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.dd)).booleanValue() && a()) {
                return;
            }
            if (this.f28919g.optInt("status", -1) != 1) {
                this.f28920h = false;
                int i = u2.z.f41319b;
                v2.i.f("App settings could not be fetched successfully.");
                return;
            }
            this.f28920h = true;
            this.f28916d = this.f28919g.optString("app_id");
            JSONArray optJSONArray2 = this.f28919g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i6 = 0; i6 < optJSONArray2.length(); i6++) {
                    JSONObject jSONObject = optJSONArray2.getJSONObject(i6);
                    String optString = jSONObject.optString("format");
                    String optString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if (com.anythink.expressad.foundation.g.a.f.f19122d.equalsIgnoreCase(optString)) {
                            this.f28914b.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f28915c.put(optString2, new C3410jd(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.f28919g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i9 = 0; i9 < optJSONArray3.length(); i9++) {
                    this.f28913a.add(optJSONArray3.optString(i9));
                }
            }
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32078M7)).booleanValue() && (optJSONObject2 = this.f28919g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    this.i.add(optJSONArray.get(i10).toString());
                }
            }
            if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32267h7)).booleanValue() || (optJSONObject = this.f28919g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f28921j = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e9) {
            int i11 = u2.z.f41319b;
            v2.i.g("Exception occurred while processing app setting json", e9);
            C4835j.f39730C.f39740h.d("AppSettings.parseAppSettingsJson", e9);
        }
    }

    public final boolean a() {
        if (b()) {
            return false;
        }
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32208b5)).booleanValue()) {
            C4835j c4835j = C4835j.f39730C;
            C3153eo c3153eo = c4835j.f39740h.i;
            if (c3153eo != null) {
                S0.e a9 = c3153eo.a();
                a9.v(NativeAdvancedJsUtils.f17906p, "cld_reset");
                a9.v("cld_lut_ms", String.valueOf(this.f28918f));
                c4835j.f39742k.getClass();
                a9.v("event_timestamp", String.valueOf(System.currentTimeMillis()));
                a9.v("cld_ttl_sec", String.valueOf(c()));
                a9.y();
            }
        }
        this.f28913a.clear();
        this.f28914b.clear();
        this.f28915c.clear();
        this.f28916d = "";
        this.f28917e = "";
        this.f28919g = null;
        this.f28920h = false;
        this.i.clear();
        this.f28921j = false;
        return true;
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.f28917e) || this.f28919g == null) {
            return true;
        }
        long c9 = c();
        C4835j.f39730C.f39742k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (c9 < 0) {
            return true;
        }
        long j6 = this.f28918f;
        return j6 <= currentTimeMillis && TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - j6) <= c9;
    }

    public final long c() {
        C3301ha c3301ha = AbstractC3569ma.gd;
        q2.r rVar = q2.r.f40204e;
        long longValue = ((Long) rVar.f40207c.a(c3301ha)).longValue();
        C3301ha c3301ha2 = AbstractC3569ma.fd;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
        return (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue() || TextUtils.isEmpty(this.f28917e)) ? longValue : this.f28919g.optLong("cache_ttl_sec", ((Long) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha)).longValue());
    }
}
