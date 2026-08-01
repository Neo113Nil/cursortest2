package com.adjust.sdk;

import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUserManagerFunction implements Runnable {
    public final /* synthetic */ SdkClickHandler WinterFlowVariableVersionControl;

    public WinterFlowUserManagerFunction(SdkClickHandler sdkClickHandler) {
        this.WinterFlowVariableVersionControl = sdkClickHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        ILogger iLogger;
        SdkClickHandler sdkClickHandler = this.WinterFlowVariableVersionControl;
        weakReference = sdkClickHandler.activityHandlerWeakRef;
        IActivityHandler iActivityHandler = (IActivityHandler) weakReference.get();
        SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext());
        try {
            JSONArray rawReferrerArray = defaultInstance.getRawReferrerArray();
            boolean z = false;
            for (int i = 0; i < rawReferrerArray.length(); i++) {
                JSONArray jSONArray = rawReferrerArray.getJSONArray(i);
                if (jSONArray.optInt(2, -1) == 0) {
                    String optString = jSONArray.optString(0, null);
                    z = true;
                    long optLong = jSONArray.optLong(1, -1L);
                    jSONArray.put(2, 1);
                    sdkClickHandler.sendSdkClick(PackageFactory.buildReftagSdkClickPackage(optString, optLong, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager(), iActivityHandler.getInternalState()));
                }
            }
            if (z) {
                defaultInstance.saveRawReferrerArray(rawReferrerArray);
            }
        } catch (JSONException e) {
            iLogger = sdkClickHandler.logger;
            iLogger.error("Send saved raw referrers error (%s)", e.getMessage());
        }
    }
}
