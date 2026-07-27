package com.appsflyer;

import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.share.LinkGenerator;
import com.facebook.login.LoginLogger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener, LinkGenerator.ResponseListener {
    public native void onAppOpenAttributionNative(Object obj);

    public native void onAttributionFailureNative(Object obj);

    public native void onDeepLinkingNative(DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    public native void onResponseErrorNative(String str);

    public native void onResponseNative(String str);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        getRevenue("onAttributionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        getRevenue("onInstallConversionFailure", str);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[Catch: JSONException -> 0x0043, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0043, blocks: (B:2:0x0000, B:13:0x003b, B:15:0x003f, B:17:0x0021, B:20:0x002b), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getRevenue(String str, String str2) {
        char c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", LoginLogger.EVENT_EXTRAS_FAILURE);
            jSONObject.put("data", str2);
            int hashCode = str.hashCode();
            if (hashCode != -1390007222) {
                if (hashCode == 1050716216 && str.equals("onInstallConversionFailure")) {
                    c = 0;
                    if (c != 0) {
                        onInstallConversionFailureNative(jSONObject);
                        return;
                    } else {
                        if (c != 1) {
                            return;
                        }
                        onAttributionFailureNative(jSONObject);
                        return;
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            } else {
                if (str.equals("onAttributionFailure")) {
                    c = 1;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            }
        } catch (JSONException e) {
            AFLogger.INSTANCE.e(AFh1vSDK.OTHER, "2dx error", e, false, false);
        }
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponse(String str) {
        onResponseNative(str);
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponseError(String str) {
        onResponseErrorNative(str);
    }
}
