package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.fd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3209fd {

    /* renamed from: a, reason: collision with root package name */
    public final List f30734a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30735b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30736c;

    public C3209fd(JSONObject jSONObject) {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f30734a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        C2837Wb c2837Wb = p2.j.f39798C.f39821v;
        C2837Wb.h("clickurl", jSONObject);
        C2837Wb.h("imp_urls", jSONObject);
        C2837Wb.h("downloaded_imp_urls", jSONObject);
        C2837Wb.h("fill_urls", jSONObject);
        C2837Wb.h("video_start_urls", jSONObject);
        C2837Wb.h("video_complete_urls", jSONObject);
        C2837Wb.h("video_reward_urls", jSONObject);
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            C2837Wb.h("manual_impression_urls", optJSONObject);
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f30735b = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        C2837Wb.h("template_ids", jSONObject);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.f30736c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
