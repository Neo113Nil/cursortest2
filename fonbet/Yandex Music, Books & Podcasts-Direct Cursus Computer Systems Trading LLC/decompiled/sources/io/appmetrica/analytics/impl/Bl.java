package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.RtmAdditionalData;
import io.appmetrica.analytics.RtmEvent;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Bl {
    public final C0786xl a;

    public /* synthetic */ Bl() {
        this(new C0786xl());
    }

    public final JSONObject a(RtmEvent rtmEvent) {
        JSONObject jSONObject;
        JSONObject put = new JSONObject().put("version", rtmEvent.version).put(Constants.KEY_VERSION_FLAVOR, rtmEvent.versionFlavor).put("service", rtmEvent.service).put("source", rtmEvent.source).put(Constants.KEY_REFERRER, rtmEvent.referrer).put(Constants.KEY_ADDITIONAL, rtmEvent.additional).put(Constants.KEY_PAGE, rtmEvent.page).put("requestId", rtmEvent.requestId);
        RtmAdditionalData rtmAdditionalData = rtmEvent.compositeAdditional;
        if (rtmAdditionalData != null) {
            this.a.getClass();
            jSONObject = new JSONObject().put(Constants.KEY_ADDITIONAL_JSON, rtmAdditionalData.additional).put(Constants.KEY_INCLUDE_LOCATION, rtmAdditionalData.includeLocation.booleanValue());
        } else {
            jSONObject = null;
        }
        return put.put(Constants.KEY_COMPOSITE_ADDITIONAL, jSONObject);
    }

    public Bl(C0786xl c0786xl) {
        this.a = c0786xl;
    }
}
