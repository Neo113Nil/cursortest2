package com.fillr.service;

import android.content.Intent;
import android.os.Bundle;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.fillr.core.apiclientv2.APIEndpoint;
import com.fillr.core.apiclientv2.ConsumerAPIClientParams;
import com.fillr.core.apiclientv2.ConsumerAPIClientTask;
import com.fillr.core.model.ModelBase;
import com.fillr.core.utilities.ConnectionUtil;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PageEventService extends BaseIntentService {
    public static void signApiRequest$1(JSONObject jSONObject, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("version", 1);
        jSONObject2.put("hmac", ConnectionUtil.calculateSignature(jSONObject.toString(), str2));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("dev_key", str);
        jSONObject3.put("extension", false);
        jSONObject.put("sdk", jSONObject3);
        jSONObject.put("signature", jSONObject2);
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPIData(int i, ModelBase modelBase) {
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        String str;
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && extras.containsKey("receiver")) {
                }
                String string2 = extras.getString("com.fillr.devkey");
                String string3 = extras.getString("com.fillr.secretkey");
                extras.getString("com.fillr.sdkversion");
                JSONObject jSONObject = new JSONObject(extras.getString("com.fillr.page.event"));
                signApiRequest$1(jSONObject, string2, string3);
                APIEndpoint aPIEndpoint = APIEndpoint.PAGE_EVENT;
                if (APIEndpoint.GOOGLE_PLACES_APIS.contains(aPIEndpoint)) {
                    str = "https://maps.googleapis.com/maps/api";
                } else {
                    FillrEnv$EnumUnboxingLocalUtility._getBaseUrl$1();
                    str = "https://api.fillr.com";
                }
                ConsumerAPIClientParams consumerAPIClientParams = new ConsumerAPIClientParams();
                consumerAPIClientParams.mQueryParams = null;
                consumerAPIClientParams.mSpecialParams = null;
                consumerAPIClientParams.endpointData = null;
                consumerAPIClientParams.mAccessToken = null;
                consumerAPIClientParams.cacheIdentifier = null;
                consumerAPIClientParams.endpointDataExtras = null;
                consumerAPIClientParams.mEndpoint = aPIEndpoint;
                consumerAPIClientParams.mApiHost = str;
                consumerAPIClientParams.setEndpointData(jSONObject);
                new ConsumerAPIClientTask(this, "page event", 0).performAPICall(consumerAPIClientParams);
            } catch (Exception unused) {
            }
        }
    }
}
