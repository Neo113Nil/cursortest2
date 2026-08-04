package com.gamericefishpro.space.i9;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface j0 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(l0 l0Var);

    void getAppInstanceId(l0 l0Var);

    void getCachedAppInstanceId(l0 l0Var);

    void getConditionalUserProperties(String str, String str2, l0 l0Var);

    void getCurrentScreenClass(l0 l0Var);

    void getCurrentScreenName(l0 l0Var);

    void getGmpAppId(l0 l0Var);

    void getMaxUserProperties(String str, l0 l0Var);

    void getSessionId(l0 l0Var);

    void getTestFlag(l0 l0Var, int i);

    void getUserProperties(String str, String str2, boolean z, l0 l0Var);

    void initForTests(Map map);

    void initialize(com.gamericefishpro.space.c9.a aVar, t0 t0Var, long j);

    void isDataCollectionEnabled(l0 l0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, l0 l0Var, long j);

    void logHealthData(int i, String str, com.gamericefishpro.space.c9.a aVar, com.gamericefishpro.space.c9.a aVar2, com.gamericefishpro.space.c9.a aVar3);

    void onActivityCreated(com.gamericefishpro.space.c9.a aVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(v0 v0Var, Bundle bundle, long j);

    void onActivityDestroyed(com.gamericefishpro.space.c9.a aVar, long j);

    void onActivityDestroyedByScionActivityInfo(v0 v0Var, long j);

    void onActivityPaused(com.gamericefishpro.space.c9.a aVar, long j);

    void onActivityPausedByScionActivityInfo(v0 v0Var, long j);

    void onActivityResumed(com.gamericefishpro.space.c9.a aVar, long j);

    void onActivityResumedByScionActivityInfo(v0 v0Var, long j);

    void onActivitySaveInstanceState(com.gamericefishpro.space.c9.a aVar, l0 l0Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(v0 v0Var, l0 l0Var, long j);

    void onActivityStarted(com.gamericefishpro.space.c9.a aVar, long j);

    void onActivityStartedByScionActivityInfo(v0 v0Var, long j);

    void onActivityStopped(com.gamericefishpro.space.c9.a aVar, long j);

    void onActivityStoppedByScionActivityInfo(v0 v0Var, long j);

    void performAction(Bundle bundle, l0 l0Var, long j);

    void registerOnMeasurementEventListener(q0 q0Var);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(n0 n0Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(com.gamericefishpro.space.c9.a aVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(v0 v0Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(q0 q0Var);

    void setInstanceIdProvider(s0 s0Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, com.gamericefishpro.space.c9.a aVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(q0 q0Var);
}
