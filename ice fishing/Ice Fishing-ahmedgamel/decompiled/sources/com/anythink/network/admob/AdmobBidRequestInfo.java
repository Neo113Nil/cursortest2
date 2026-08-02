package com.anythink.network.admob;

import android.content.Context;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfo;
import java.util.Map;
import m2.b;
import m2.h;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AdmobBidRequestInfo extends ATBidRequestInfo {

    /* renamed from: a, reason: collision with root package name */
    JSONObject f23690a;

    public AdmobBidRequestInfo(Context context, String str, Map<String, Object> map, Map<String, Object> map2, b bVar) {
        int i;
        int i4;
        try {
            this.f23690a = new JSONObject();
            this.f23690a.put("unit_id", map.get("unit_id").toString());
            this.f23690a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID, str);
            if (bVar == b.BANNER) {
                h a9 = AdmobATConst.a(context, map2, map);
                if (a9 == null || (i = a9.f39380a) <= 0) {
                    i = 320;
                }
                if (a9 == null || (i4 = a9.f39381b) <= 0) {
                    i4 = 50;
                }
                this.f23690a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, i);
                this.f23690a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, i4);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.api.ATBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.f23690a;
    }
}
