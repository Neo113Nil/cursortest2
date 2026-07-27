package com.anythink.core.b.d;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bv;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    public static void a(JSONObject jSONObject, String str, bv bvVar, com.anythink.core.common.h.a aVar) {
        if (jSONObject != null) {
            try {
                if (bvVar.ae() == -1) {
                    jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, str);
                } else {
                    jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, String.valueOf(bvVar.ae()));
                }
                jSONObject.put("ad_source_id", bvVar.z());
                jSONObject.put("nw_firm_id", bvVar.g());
                jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BIDDING_FLOOR, a(aVar, bvVar));
                if (t.b().y()) {
                    jSONObject.put("test", 1);
                }
                jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.P_BIDFLOOR, bvVar.ak());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static double a(com.anythink.core.common.h.a aVar, bv bvVar) {
        double d2 = 0.0d;
        if (aVar.f13501t == 8) {
            Map<String, Double> map = aVar.f13502u;
            Double d3 = map != null ? map.get(bvVar.z()) : null;
            if (d3 != null) {
                d2 = d3.doubleValue();
                bvVar.d(d2);
            }
            bvVar.z();
            return d2;
        }
        double ar = bvVar.ar();
        if (aVar.f13480C > 0.0d && bvVar.aS() == 1) {
            double max = Math.max(ar, aVar.f13480C);
            bvVar.d(max);
            bvVar.toString();
            return max;
        }
        bvVar.toString();
        return ar;
    }
}
