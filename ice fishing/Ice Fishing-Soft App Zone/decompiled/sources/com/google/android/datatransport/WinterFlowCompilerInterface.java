package com.google.android.datatransport;

import com.adjust.sdk.Adjust;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;
import com.icewinter.flow.winter.icecatch.data.cpp.ID;
import com.icewinter.flow.winter.icecatch.data.cpp.StaticIdProvider;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCompilerInterface implements WinterFlowThreadPoolAgent {
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowCompilerInterface(int i) {
        this.WinterFlowRouterStructure = i;
    }

    @Override // com.google.android.datatransport.WinterFlowThreadPoolAgent
    public final Object WinterFlowRouterStructure(WinterFlowBandwidthQueue winterFlowBandwidthQueue) {
        FirebaseMessaging firebaseMessaging;
        WinterFlowExceptionParser winterFlowExceptionParser;
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowEventCloud winterFlowEventCloud = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowBandwidthQueue));
                winterFlowEventCloud.WinterFlowSerializerStructure();
                Adjust.getAttribution(new WinterFlowDebugListener(winterFlowEventCloud));
                return winterFlowEventCloud.WinterFlowBatchUI();
            case 1:
                WinterFlowEventCloud winterFlowEventCloud2 = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowBandwidthQueue));
                winterFlowEventCloud2.WinterFlowSerializerStructure();
                Adjust.getAdid(new WinterFlowAdapterView(winterFlowEventCloud2));
                return winterFlowEventCloud2.WinterFlowBatchUI();
            default:
                WinterFlowEventCloud winterFlowEventCloud3 = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowBandwidthQueue));
                winterFlowEventCloud3.WinterFlowSerializerStructure();
                synchronized (FirebaseMessaging.class) {
                    firebaseMessaging = FirebaseMessaging.getInstance(com.google.firebase.WinterFlowSyntaxEvent.WinterFlowHookDataSource());
                }
                firebaseMessaging.getClass();
                if (firebaseMessaging.WinterFlowArrayNetwork.WinterFlowTransactionAgent()) {
                    winterFlowExceptionParser = WinterFlowHookProcessor.WinterFlowSyntax(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                } else {
                    WinterFlowArrayEngine winterFlowArrayEngine = new WinterFlowArrayEngine();
                    firebaseMessaging.WinterFlowUnitTestResponse.execute(new WinterFlowControllerManager(8, firebaseMessaging, winterFlowArrayEngine));
                    winterFlowExceptionParser = winterFlowArrayEngine.WinterFlowRouterStructure;
                }
                winterFlowExceptionParser.WinterFlowHookDataSource.WinterFlowHookDataSource(new WinterFlowProtocolMechanism(WinterFlowCacheHandler.WinterFlowRouterStructure, new WinterFlowCompilerXML(winterFlowEventCloud3)));
                winterFlowExceptionParser.WinterFlowThreadListener();
                return winterFlowEventCloud3.WinterFlowBatchUI();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowThreadPoolAgent
    public final String getKey() {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "";
            case 1:
                return StaticIdProvider.INSTANCE.provide(ID.APP_ADJUST_ID);
            default:
                return StaticIdProvider.INSTANCE.provide(ID.APP_FIREBASE_ID);
        }
    }
}
