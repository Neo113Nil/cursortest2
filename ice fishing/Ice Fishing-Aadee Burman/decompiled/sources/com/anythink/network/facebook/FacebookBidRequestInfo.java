package com.anythink.network.facebook;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfo;
import com.facebook.ads.BidderTokenProvider;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FacebookBidRequestInfo extends ATBidRequestInfo {

    /* renamed from: a, reason: collision with root package name */
    String f23110a;

    /* renamed from: b, reason: collision with root package name */
    JSONObject f23111b = new JSONObject();

    public FacebookBidRequestInfo(Context context, Map<String, Object> map) {
        Object obj;
        try {
            String obj2 = map.get("app_id").toString();
            String obj3 = map.get("unit_id").toString();
            this.f23110a = BidderTokenProvider.getBidderToken(context);
            this.f23111b.put("app_id", obj2);
            this.f23111b.put("unit_id", obj3);
            this.f23111b.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BUYERUID, this.f23110a);
            if (!map.containsKey("unit_type") || (obj = map.get("unit_type")) == null) {
                return;
            }
            this.f23111b.put("unit_type", Integer.parseInt(obj.toString()));
        } catch (Throwable unused) {
        }
    }

    public void fillBannerData(Map<String, Object> map) {
        try {
            String obj = map.get("size").toString();
            if (TextUtils.isEmpty(obj)) {
                return;
            }
            String[] split = obj.split("x");
            if (split.length == 2) {
                int i = 0;
                try {
                    Integer.parseInt(split[0]);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                try {
                    i = Integer.parseInt(split[1]);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                this.f23111b.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, i);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.f23110a);
    }

    @Override // com.anythink.core.api.ATBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.f23111b;
    }
}
