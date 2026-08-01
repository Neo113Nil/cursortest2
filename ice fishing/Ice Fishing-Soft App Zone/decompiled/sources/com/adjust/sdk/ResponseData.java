package com.adjust.sdk;

import com.google.android.datatransport.WinterFlowInheritanceStrategy;
import com.google.android.datatransport.WinterFlowJSONLibrary;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class ResponseData {
    public ActivityKind activityKind;
    public ActivityPackage activityPackage;
    public String adid;
    public Long askIn;
    public AdjustAttribution attribution;
    public Long continueIn;
    public JSONObject controlParams;
    public JSONObject jsonResponse;
    public String message;
    public String resolvedDeeplink;
    public Long retryIn;
    public Map<String, String> sendingParameters;
    public Map<String, String> signedParameters;
    public String timestamp;
    public TrackingState trackingState;
    public boolean success = false;
    public boolean willRetry = false;

    public static ResponseData buildResponseData(ActivityPackage activityPackage, Map<String, String> map, Map<String, String> map2) {
        ResponseData sessionResponseData;
        ActivityKind activityKind = activityPackage.getActivityKind();
        switch (WinterFlowInheritanceStrategy.WinterFlowRouterStructure[activityKind.ordinal()]) {
            case 1:
                sessionResponseData = new SessionResponseData(activityPackage);
                break;
            case 2:
                sessionResponseData = new SdkClickResponseData();
                break;
            case 3:
                sessionResponseData = new AttributionResponseData();
                break;
            case 4:
                sessionResponseData = new EventResponseData(activityPackage);
                break;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                sessionResponseData = new PurchaseVerificationResponseData();
                break;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                sessionResponseData = new ThirdPartySharingResponseData();
                break;
            default:
                sessionResponseData = new ResponseData();
                break;
        }
        sessionResponseData.activityKind = activityKind;
        sessionResponseData.activityPackage = activityPackage;
        sessionResponseData.sendingParameters = map;
        sessionResponseData.signedParameters = map2;
        return sessionResponseData;
    }

    public String toString() {
        return Util.formatString("message:%s timestamp:%s json:%s", this.message, this.timestamp, this.jsonResponse);
    }
}
