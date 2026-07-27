package com.adjust.sdk;

import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class SolarMeshProcessorSchedulerATGoUVm6UfGQlmFvuR30173932567559 implements Runnable {
    public final /* synthetic */ SdkClickHandler RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public SolarMeshProcessorSchedulerATGoUVm6UfGQlmFvuR30173932567559(SdkClickHandler sdkClickHandler) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = sdkClickHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        ILogger iLogger;
        SdkClickHandler sdkClickHandler = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
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
