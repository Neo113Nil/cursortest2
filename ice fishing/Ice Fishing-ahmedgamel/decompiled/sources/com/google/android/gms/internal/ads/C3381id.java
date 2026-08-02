package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.id, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3381id {

    /* renamed from: a, reason: collision with root package name */
    public final List f31828a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31829b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31830c;

    public C3381id(JSONObject jSONObject) {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f31828a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        C2889Yb c2889Yb = C4906k.f40186C.f40209v;
        C2889Yb.h("clickurl", jSONObject);
        C2889Yb.h("imp_urls", jSONObject);
        C2889Yb.h("downloaded_imp_urls", jSONObject);
        C2889Yb.h("fill_urls", jSONObject);
        C2889Yb.h("video_start_urls", jSONObject);
        C2889Yb.h("video_complete_urls", jSONObject);
        C2889Yb.h("video_reward_urls", jSONObject);
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            C2889Yb.h("manual_impression_urls", optJSONObject);
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f31829b = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        C2889Yb.h("template_ids", jSONObject);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.f31830c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
