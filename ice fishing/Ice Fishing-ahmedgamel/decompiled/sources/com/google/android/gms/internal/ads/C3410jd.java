package com.google.android.gms.internal.ads;

import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.jd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3410jd {

    /* renamed from: a, reason: collision with root package name */
    public final List f31267a;

    public C3410jd(JSONObject jSONObject) {
        if (v2.i.j(2)) {
            u2.z.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            try {
                C3358id c3358id = new C3358id(jSONArray.getJSONObject(i6));
                com.anythink.expressad.foundation.g.a.f.f19123e.equalsIgnoreCase(c3358id.f31059c);
                arrayList.add(c3358id);
                if (i < 0) {
                    Iterator it = c3358id.f31057a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i6;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f31267a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            C2866Yb c2866Yb = C4835j.f39733C.f39756v;
            C2866Yb.h("click_urls", optJSONObject);
            C2866Yb.h("imp_urls", optJSONObject);
            C2866Yb.h("downloaded_imp_urls", optJSONObject);
            C2866Yb.h("nofill_urls", optJSONObject);
            C2866Yb.h("remote_ping_urls", optJSONObject);
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong(ToolBar.REFRESH, -1L);
            C3091df.a(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
