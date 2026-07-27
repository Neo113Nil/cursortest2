package com.anythink.network.admob;

import android.content.Context;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfo;
import java.util.Map;
import k2.b;
import k2.h;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AdmobBidRequestInfo extends ATBidRequestInfo {

    /* renamed from: a, reason: collision with root package name */
    JSONObject f22903a;

    public AdmobBidRequestInfo(Context context, String str, Map<String, Object> map, Map<String, Object> map2, b bVar) {
        int i;
        int i6;
        try {
            this.f22903a = new JSONObject();
            this.f22903a.put("unit_id", map.get("unit_id").toString());
            this.f22903a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID, str);
            if (bVar == b.BANNER) {
                h a9 = AdmobATConst.a(context, map2, map);
                if (a9 == null || (i = a9.f38591a) <= 0) {
                    i = 320;
                }
                if (a9 == null || (i6 = a9.f38592b) <= 0) {
                    i6 = 50;
                }
                this.f22903a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, i);
                this.f22903a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, i6);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.api.ATBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.f22903a;
    }
}
