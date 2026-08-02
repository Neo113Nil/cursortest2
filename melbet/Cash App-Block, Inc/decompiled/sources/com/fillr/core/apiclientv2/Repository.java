package com.fillr.core.apiclientv2;

import android.os.Bundle;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.fillr.service.BaseMappingService;
import com.plaid.internal.EnumC0170g;
import java.lang.ref.WeakReference;
import java.util.UUID;
import net.oneformapp.schema.Element;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Repository {
    public static UUID googlePlacesSessionId;
    public static final int[] obfuscatedKEY = {2, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 79, 83, 101, 56, 114, 69, 117, 82, 8, 96, 22, 115, 127, 96, 84, 115, 93, 91, 66, 1, 45, 104, 83, 0, 15, 60, 40, 72, 26, 79, 78, 95, 9, 80, 68, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 104};
    public final Object consumerAPIClient;

    public static synchronized String getGooglePlacesSessionId() {
        String replaceAll;
        synchronized (Repository.class) {
            try {
                if (googlePlacesSessionId == null) {
                    googlePlacesSessionId = UUID.randomUUID();
                }
                replaceAll = googlePlacesSessionId.toString().toLowerCase().replaceAll("[^a-f0-9]", "");
            } catch (Throwable th) {
                throw th;
            }
        }
        return replaceAll;
    }

    public ConsumerAPIClientParams getConsumerAPIClientParams(APIEndpoint aPIEndpoint) {
        String str;
        if (APIEndpoint.GOOGLE_PLACES_APIS.contains(aPIEndpoint)) {
            str = "https://maps.googleapis.com/maps/api";
        } else {
            if (APIEndpoint.GET_MAPPED_FIELDS == aPIEndpoint) {
                FillrEnv$EnumUnboxingLocalUtility._getBaseUrl$1();
            } else {
                FillrEnv$EnumUnboxingLocalUtility._getBaseUrl$1();
            }
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
        return consumerAPIClientParams;
    }

    public void getMappingFields(int i, JSONObject jSONObject, BaseMappingService baseMappingService, String str) {
        ConsumerAPIClientListener consumerAPIClientListener = (ConsumerAPIClientListener) this.consumerAPIClient;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("fields");
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    ConsumerAPIClientParams consumerAPIClientParams = getConsumerAPIClientParams(APIEndpoint.GET_MAPPED_FIELDS);
                    consumerAPIClientParams.setEndpointData(jSONObject);
                    if (consumerAPIClientParams.endpointDataExtras == null) {
                        consumerAPIClientParams.endpointDataExtras = new Bundle();
                    }
                    consumerAPIClientParams.endpointDataExtras.putString("schemaVersion", "5.0");
                    if (str != null) {
                        if (consumerAPIClientParams.mSpecialParams == null) {
                            consumerAPIClientParams.mSpecialParams = new Bundle();
                        }
                        consumerAPIClientParams.mSpecialParams.putString("view_id", str);
                        if (jSONObject.has("fields") && jSONObject.has("flow")) {
                            try {
                                consumerAPIClientParams.cacheIdentifier = ConsumerAPIConnectionHelper.getCacheKey(str, jSONObject) + jSONObject.getString("flow");
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    ConsumerAPIClientTask consumerAPIClientTask = new ConsumerAPIClientTask(consumerAPIClientListener, "getting mapping data", i);
                    consumerAPIClientTask.mContext = new WeakReference(baseMappingService);
                    consumerAPIClientTask.performAPICall(consumerAPIClientParams);
                    return;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        APIEndpoint aPIEndpoint = APIEndpoint.GET_MAPPED_FIELDS;
        new ConsumerClientException("NO_FIELDS");
        consumerAPIClientListener.onConsumerAPIError(i);
    }

    public void parseAddressToParams(int i, JSONObject jSONObject, Element element, String str) {
        ConsumerAPIClientParams consumerAPIClientParams = getConsumerAPIClientParams(APIEndpoint.GET_PARSED_ADDRESS);
        consumerAPIClientParams.setEndpointData(jSONObject);
        if (element != null) {
            if (consumerAPIClientParams.mSpecialParams == null) {
                consumerAPIClientParams.mSpecialParams = new Bundle();
            }
            consumerAPIClientParams.mSpecialParams.putParcelable("profile_element", element);
            if (str == null) {
                str = "";
            }
            if (consumerAPIClientParams.mSpecialParams == null) {
                consumerAPIClientParams.mSpecialParams = new Bundle();
            }
            consumerAPIClientParams.mSpecialParams.putString("domain", str);
        }
        new ConsumerAPIClientTask((ConsumerAPIClientListener) this.consumerAPIClient, "parsing the address...", i).performAPICall(consumerAPIClientParams);
    }
}
