package com.google.android.gms.internal.ads;

import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.jd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3433jd {

    /* renamed from: a, reason: collision with root package name */
    public final List f32054a;

    public C3433jd(JSONObject jSONObject) {
        if (x2.i.j(2)) {
            w2.z.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            try {
                C3381id c3381id = new C3381id(jSONArray.getJSONObject(i4));
                com.anythink.expressad.foundation.g.a.f.f19910e.equalsIgnoreCase(c3381id.f31830c);
                arrayList.add(c3381id);
                if (i < 0) {
                    Iterator it = c3381id.f31828a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i4;
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
        this.f32054a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            C2889Yb c2889Yb = C4906k.f40186C.f40209v;
            C2889Yb.h("click_urls", optJSONObject);
            C2889Yb.h("imp_urls", optJSONObject);
            C2889Yb.h("downloaded_imp_urls", optJSONObject);
            C2889Yb.h("nofill_urls", optJSONObject);
            C2889Yb.h("remote_ping_urls", optJSONObject);
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong(ToolBar.REFRESH, -1L);
            C3114df.a(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
