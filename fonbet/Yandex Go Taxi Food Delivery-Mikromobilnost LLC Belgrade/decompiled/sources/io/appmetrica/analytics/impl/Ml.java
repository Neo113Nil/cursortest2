package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.RtmAdditionalData;
import io.appmetrica.analytics.RtmEvent;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Ml {
    public final Il a;

    public /* synthetic */ Ml() {
        this(new Il());
    }

    public final JSONObject a(RtmEvent rtmEvent) {
        JSONObject jSONObject;
        JSONObject put = new JSONObject().put("version", rtmEvent.version).put(Constants.KEY_VERSION_FLAVOR, rtmEvent.versionFlavor).put(Constants.KEY_SERVICE, rtmEvent.service).put("source", rtmEvent.source).put("referrer", rtmEvent.referrer).put(Constants.KEY_ADDITIONAL, rtmEvent.additional).put(Constants.KEY_PAGE, rtmEvent.page).put("requestId", rtmEvent.requestId);
        RtmAdditionalData rtmAdditionalData = rtmEvent.compositeAdditional;
        if (rtmAdditionalData != null) {
            this.a.getClass();
            jSONObject = new JSONObject().put(Constants.KEY_ADDITIONAL_JSON, rtmAdditionalData.additional).put(Constants.KEY_INCLUDE_LOCATION, rtmAdditionalData.includeLocation.booleanValue());
        } else {
            jSONObject = null;
        }
        return put.put(Constants.KEY_COMPOSITE_ADDITIONAL, jSONObject);
    }

    public Ml(Il il) {
        this.a = il;
    }
}
