package com.anythink.core.common;

import android.text.TextUtils;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.anythink.core.common.d.j;
import com.appsflyer.AppsFlyerLib;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p {

    /* renamed from: c, reason: collision with root package name */
    private static volatile p f16130c;

    /* renamed from: a, reason: collision with root package name */
    private final String f16131a = "1";

    /* renamed from: b, reason: collision with root package name */
    private final String f16132b = "2";

    private p() {
    }

    public static p a() {
        if (f16130c == null) {
            synchronized (p.class) {
                try {
                    if (f16130c == null) {
                        f16130c = new p();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16130c;
    }

    public static void a(com.anythink.core.common.h.n nVar) {
        if (nVar == null) {
            return;
        }
        try {
            com.anythink.core.d.l a9 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(nVar.aI());
            if (a9 != null) {
                String X8 = a9.X();
                if (TextUtils.isEmpty(X8)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(X8);
                JSONObject optJSONObject = jSONObject.optJSONObject("1");
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("token");
                    if (!TextUtils.isEmpty(optString)) {
                        String D8 = nVar.D();
                        double L8 = nVar.L() / 1000.0d;
                        String z8 = nVar.z();
                        try {
                            AdjustEvent adjustEvent = new AdjustEvent(optString);
                            adjustEvent.setRevenue(L8, D8);
                            adjustEvent.setOrderId(z8);
                            Adjust.trackEvent(adjustEvent);
                        } catch (Throwable unused) {
                        }
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("2");
                if (optJSONObject2 != null) {
                    int optInt = optJSONObject2.optInt("rtye");
                    HashMap hashMap = new HashMap();
                    hashMap.put("af_order_id", nVar.z());
                    hashMap.put("af_content_id", nVar.aI());
                    hashMap.put("af_content_type", nVar.aK());
                    hashMap.put("af_revenue", Double.valueOf(optInt == 2 ? nVar.L() : nVar.L() / 1000.0d));
                    hashMap.put("af_currency", j.C0075j.f12642a);
                    AppsFlyerLib.getInstance().trackEvent(com.anythink.core.common.d.t.b().g(), "af_ad_view", hashMap);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private static void a(String str, double d2, String str2, String str3) {
        try {
            AdjustEvent adjustEvent = new AdjustEvent(str);
            adjustEvent.setRevenue(d2, str2);
            adjustEvent.setOrderId(str3);
            Adjust.trackEvent(adjustEvent);
        } catch (Throwable unused) {
        }
    }
}
