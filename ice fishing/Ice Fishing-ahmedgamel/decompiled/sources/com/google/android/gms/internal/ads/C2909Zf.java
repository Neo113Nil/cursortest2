package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Zf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2909Zf {

    /* renamed from: d, reason: collision with root package name */
    public String f29693d;

    /* renamed from: e, reason: collision with root package name */
    public String f29694e;

    /* renamed from: f, reason: collision with root package name */
    public long f29695f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f29696g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29697h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f29698j;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f29690a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f29691b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f29692c = new HashMap();
    public final ArrayList i = new ArrayList();

    public C2909Zf(String str, long j6) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.f29693d = "";
        this.f29697h = false;
        this.f29698j = false;
        this.f29694e = str;
        this.f29695f = j6;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f29696g = new JSONObject(str);
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.dd)).booleanValue() && a()) {
                return;
            }
            if (this.f29696g.optInt("status", -1) != 1) {
                this.f29697h = false;
                int i = w2.z.f41712b;
                x2.i.f("App settings could not be fetched successfully.");
                return;
            }
            this.f29697h = true;
            this.f29693d = this.f29696g.optString("app_id");
            JSONArray optJSONArray2 = this.f29696g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                    JSONObject jSONObject = optJSONArray2.getJSONObject(i4);
                    String optString = jSONObject.optString("format");
                    String optString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if (com.anythink.expressad.foundation.g.a.f.f19909d.equalsIgnoreCase(optString)) {
                            this.f29691b.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f29692c.put(optString2, new C3433jd(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.f29696g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i6 = 0; i6 < optJSONArray3.length(); i6++) {
                    this.f29690a.add(optJSONArray3.optString(i6));
                }
            }
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32857M7)).booleanValue() && (optJSONObject2 = this.f29696g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                    this.i.add(optJSONArray.get(i9).toString());
                }
            }
            if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33047h7)).booleanValue() || (optJSONObject = this.f29696g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f29698j = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e9) {
            int i10 = w2.z.f41712b;
            x2.i.g("Exception occurred while processing app setting json", e9);
            C4906k.f40186C.f40196h.d("AppSettings.parseAppSettingsJson", e9);
        }
    }

    public final boolean a() {
        if (b()) {
            return false;
        }
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32987b5)).booleanValue()) {
            C4906k c4906k = C4906k.f40186C;
            C3230fo c3230fo = c4906k.f40196h.i;
            if (c3230fo != null) {
                S0.e a9 = c3230fo.a();
                a9.M(NativeAdvancedJsUtils.f18693p, "cld_reset");
                a9.M("cld_lut_ms", String.valueOf(this.f29695f));
                c4906k.f40198k.getClass();
                a9.M("event_timestamp", String.valueOf(System.currentTimeMillis()));
                a9.M("cld_ttl_sec", String.valueOf(c()));
                a9.N();
            }
        }
        this.f29690a.clear();
        this.f29691b.clear();
        this.f29692c.clear();
        this.f29693d = "";
        this.f29694e = "";
        this.f29696g = null;
        this.f29697h = false;
        this.i.clear();
        this.f29698j = false;
        return true;
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.f29694e) || this.f29696g == null) {
            return true;
        }
        long c9 = c();
        C4906k.f40186C.f40198k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (c9 < 0) {
            return true;
        }
        long j6 = this.f29695f;
        return j6 <= currentTimeMillis && TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - j6) <= c9;
    }

    public final long c() {
        C3324ha c3324ha = AbstractC3592ma.gd;
        s2.r rVar = s2.r.f40506e;
        long longValue = ((Long) rVar.f40509c.a(c3324ha)).longValue();
        C3324ha c3324ha2 = AbstractC3592ma.fd;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        return (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue() || TextUtils.isEmpty(this.f29694e)) ? longValue : this.f29696g.optLong("cache_ttl_sec", ((Long) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha)).longValue());
    }
}
