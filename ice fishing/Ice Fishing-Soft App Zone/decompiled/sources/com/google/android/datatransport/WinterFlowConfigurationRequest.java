package com.google.android.datatransport;

import android.graphics.PathMeasure;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConfigurationRequest extends WinterFlowDebugFramework implements WinterFlowObjectUI {
    public static final WinterFlowConfigurationRequest WinterFlowBandwidthObject;
    public static final WinterFlowConfigurationRequest WinterFlowConcurrencyThread;
    public static final WinterFlowConfigurationRequest WinterFlowOrchestrationSubsystem;
    public static final WinterFlowConfigurationRequest WinterFlowResponseEngine;
    public static final WinterFlowConfigurationRequest WinterFlowRouterRouter;
    public static final WinterFlowConfigurationRequest WinterFlowServerProtocol;
    public static final WinterFlowConfigurationRequest WinterFlowServiceUtility;
    public static final WinterFlowConfigurationRequest WinterFlowSingletonPlatform;
    public static final WinterFlowConfigurationRequest WinterFlowSyntax;
    public static final WinterFlowConfigurationRequest WinterFlowThreadListener;
    public static final WinterFlowConfigurationRequest WinterFlowTransactionAgent;
    public static final WinterFlowConfigurationRequest WinterFlowUnitTestResponse;
    public static final WinterFlowConfigurationRequest WinterFlowVariableBandwidth;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;

    static {
        int i = 0;
        WinterFlowUnitTestResponse = new WinterFlowConfigurationRequest(i, 0);
        WinterFlowRouterRouter = new WinterFlowConfigurationRequest(i, 1);
        WinterFlowSyntax = new WinterFlowConfigurationRequest(i, 2);
        WinterFlowResponseEngine = new WinterFlowConfigurationRequest(i, 3);
        WinterFlowTransactionAgent = new WinterFlowConfigurationRequest(i, 4);
        WinterFlowServerProtocol = new WinterFlowConfigurationRequest(i, 5);
        WinterFlowThreadListener = new WinterFlowConfigurationRequest(i, 6);
        WinterFlowServiceUtility = new WinterFlowConfigurationRequest(i, 7);
        WinterFlowBandwidthObject = new WinterFlowConfigurationRequest(i, 8);
        WinterFlowOrchestrationSubsystem = new WinterFlowConfigurationRequest(i, 9);
        WinterFlowConcurrencyThread = new WinterFlowConfigurationRequest(i, 10);
        WinterFlowSingletonPlatform = new WinterFlowConfigurationRequest(i, 11);
        WinterFlowVariableBandwidth = new WinterFlowConfigurationRequest(i, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowConfigurationRequest(int i, int i2) {
        super(i);
        this.WinterFlowTransactionManagerStrategy = i2;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        switch (this.WinterFlowTransactionManagerStrategy) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            case 1:
                return null;
            case 2:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalTextToolbar");
                throw null;
            case 3:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalUriHandler");
                throw null;
            case 4:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalViewConfiguration");
                throw null;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowBackendTransactionManager.WinterFlowHookDataSource("LocalWindowInfo");
                throw null;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                return Boolean.TRUE;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.FALSE;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return Boolean.FALSE;
            case 9:
                return new WinterFlowSchedulerStructure(3);
            case 10:
                return new WinterFlowRendererCompiler(new PathMeasure());
            case 11:
                return null;
            default:
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
    }
}
