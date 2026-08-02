package com.fillr.service;

import android.content.Intent;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.fillr.core.apiclientv2.APIEndpoint;
import com.fillr.core.apiclientv2.ConsumerAPIClientParams;
import com.fillr.core.apiclientv2.ConsumerAPIClientTask;
import com.fillr.core.model.ModelBase;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PerformanceStatsService extends BaseIntentService {
    public static JSONObject buildFilledObject(Intent intent) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String stringExtra = intent.getStringExtra("PerformanceStatsServiceFillID");
        boolean booleanExtra = intent.getBooleanExtra("PerformanceStatsServiceFilled", true);
        jSONObject2.put("app_mapping_api", intent.getDoubleExtra("PerformanceStatsServiceElapsedTime", 0.0d));
        jSONObject2.put("filled_data", (Object) null);
        jSONObject.put("fill_id", stringExtra);
        jSONObject.put("filled", booleanExtra);
        jSONObject.put("perf", jSONObject2);
        return jSONObject;
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPIData(int i, ModelBase modelBase) {
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        String str;
        if (intent != null) {
            try {
                JSONObject buildFilledObject = buildFilledObject(intent);
                APIEndpoint aPIEndpoint = APIEndpoint.FILL_PERFORMANCE_STAT;
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
                consumerAPIClientParams.setEndpointData(buildFilledObject);
                new ConsumerAPIClientTask(this, "performance + user stat", 0).performAPICall(consumerAPIClientParams);
            } catch (JSONException | Exception unused) {
            }
        }
    }
}
