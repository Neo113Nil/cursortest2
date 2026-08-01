package com.google.android.datatransport;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowDataSourceLayer implements WinterFlowObjectUI {
    public final /* synthetic */ ComponentActivity WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowDataSourceLayer(ComponentActivity componentActivity, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = componentActivity;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        int i2 = 0;
        ComponentActivity componentActivity = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i3 = ComponentActivity.WinterFlowBackendCacheManager;
                componentActivity.reportFullyDrawn();
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 1:
                return new WinterFlowWorkerEncryption(componentActivity.WinterFlowResponseEngine, new WinterFlowDataSourceLayer(componentActivity, i2));
            case 2:
                int i4 = ComponentActivity.WinterFlowBackendCacheManager;
                WinterFlowFrontendManager winterFlowFrontendManager = new WinterFlowFrontendManager();
                componentActivity.WinterFlowCacheManagerAgent().WinterFlowTransactionManagerStrategy(winterFlowFrontendManager);
                return winterFlowFrontendManager;
            case 3:
                int i5 = ComponentActivity.WinterFlowBackendCacheManager;
                return new WinterFlowJavaInterface(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
            default:
                int i6 = ComponentActivity.WinterFlowBackendCacheManager;
                WinterFlowViewRenderer winterFlowViewRenderer = new WinterFlowViewRenderer(new WinterFlowDecoratorMechanism(componentActivity, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (WinterFlowManagerRequest.WinterFlowThreadListener(Looper.myLooper(), Looper.getMainLooper())) {
                        componentActivity.WinterFlowVariableVersionControl.WinterFlowRouterStructure(new WinterFlowRouterNetwork(winterFlowViewRenderer, componentActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new WinterFlowControllerManager(3, componentActivity, winterFlowViewRenderer));
                    }
                }
                return winterFlowViewRenderer;
        }
    }
}
