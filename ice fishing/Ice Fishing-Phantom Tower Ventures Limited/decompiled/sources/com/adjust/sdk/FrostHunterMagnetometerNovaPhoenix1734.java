package com.adjust.sdk;

import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMagnetometerNovaPhoenix1734 implements Runnable {
    public final /* synthetic */ SdkClickHandler FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterMagnetometerNovaPhoenix1734(SdkClickHandler sdkClickHandler) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = sdkClickHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        ILogger iLogger;
        SdkClickHandler sdkClickHandler = this.FrostHunterCameraXPixelTurboCosmos9814;
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
