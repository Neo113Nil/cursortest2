package com.adjust.sdk;

import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class CatchingFishView implements Runnable {
    public final /* synthetic */ SdkClickHandler CatchingFishReduxKtor;

    public CatchingFishView(SdkClickHandler sdkClickHandler) {
        this.CatchingFishReduxKtor = sdkClickHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        ILogger iLogger;
        SdkClickHandler sdkClickHandler = this.CatchingFishReduxKtor;
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
