package com.fillr.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.fillr.core.apiclientv2.APIEndpoint;
import com.fillr.core.apiclientv2.ConsumerAPIClientParams;
import com.fillr.core.apiclientv2.ConsumerAPIClientTask;
import com.fillr.core.model.ModelBase;
import com.fillr.core.utilities.ConnectionUtil;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AffiliateLinkService extends BaseIntentService {
    public static final ConcurrentHashMap URL_CACHE = new ConcurrentHashMap();
    public String originalUrl;
    public ResultReceiver receiver;

    public static void signApiRequest(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null || str == null || str2 == null) {
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
        String str;
        try {
            str = new JSONObject(modelBase.toString()).getString("result");
            new URL(str);
        } catch (Exception unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.originalUrl;
        }
        URL_CACHE.put(this.originalUrl, str);
        sendResponse(str);
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        JSONObject jSONObject;
        String str;
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && extras.containsKey("receiver")) {
                    this.receiver = (ResultReceiver) extras.getParcelable("receiver");
                }
                String string2 = extras.getString("com.fillr.devkey");
                String string3 = extras.getString("com.fillr.secretkey");
                String string4 = extras.getString("com.fillr.affiliate.url");
                this.originalUrl = string4;
                ConcurrentHashMap concurrentHashMap = URL_CACHE;
                if (concurrentHashMap.containsKey(string4)) {
                    sendResponse((String) concurrentHashMap.get(string4));
                    return;
                }
                String lowerCase = Locale.getDefault().getCountry().toLowerCase(Locale.getDefault());
                if (TextUtils.isEmpty(string4)) {
                    jSONObject = null;
                } else {
                    if (TextUtils.isEmpty(lowerCase)) {
                        lowerCase = "au";
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("countryCode", lowerCase);
                    jSONObject = new JSONObject();
                    jSONObject.put("url", string4);
                    jSONObject.put("opts", jSONObject2);
                }
                signApiRequest(jSONObject, string2, string3);
                APIEndpoint aPIEndpoint = APIEndpoint.AFFILIATES;
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
                new ConsumerAPIClientTask(this, "affiliate link", 0).performAPICall(consumerAPIClientParams);
            } catch (Exception unused) {
            }
        }
    }

    public final void sendResponse(String str) {
        if (this.receiver == null || str.equals(this.originalUrl)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("affiliateLink", str);
        this.receiver.send(0, bundle);
    }
}
