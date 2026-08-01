package com.google.android.datatransport;

import android.graphics.Rect;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseSchemaLibrary extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowXMLSoftware WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowDatabaseSchemaLibrary(WinterFlowXMLSoftware winterFlowXMLSoftware, int i) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowXMLSoftware;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowXMLSoftware winterFlowXMLSoftware = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowViewEvent winterFlowViewEvent = (WinterFlowViewEvent) obj;
                View WinterFlowSingletonPlatform = WinterFlowServerManager.WinterFlowSingletonPlatform(winterFlowXMLSoftware);
                if (!WinterFlowSingletonPlatform.isFocused() && !WinterFlowSingletonPlatform.hasFocus()) {
                    WinterFlowProtocolArray focusOwner = ((WinterFlowSyntaxTransactionManager) WinterFlowCloudStack.WinterFlowTestingNode(winterFlowXMLSoftware)).getFocusOwner();
                    View WinterFlowCacheManagerListener = WinterFlowTestingCloud.WinterFlowCacheManagerListener(winterFlowXMLSoftware);
                    Integer WinterFlowCacheManagerAgent = WinterFlowRouterDeserialization.WinterFlowCacheManagerAgent(winterFlowViewEvent.WinterFlowRouterStructure);
                    int[] iArr = new int[2];
                    WinterFlowCacheManagerListener.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    WinterFlowSingletonPlatform.getLocationOnScreen(iArr2);
                    WinterFlowDeploymentWidget WinterFlowVariableBandwidth = WinterFlowCloudStack.WinterFlowVariableBandwidth(((WinterFlowHookMechanism) focusOwner).WinterFlowCacheManagerAgent);
                    Rect rect = null;
                    WinterFlowVersionParser WinterFlowRouterAdapter = WinterFlowVariableBandwidth != null ? WinterFlowCloudStack.WinterFlowRouterAdapter(WinterFlowVariableBandwidth) : null;
                    if (WinterFlowRouterAdapter != null) {
                        int i2 = (int) WinterFlowRouterAdapter.WinterFlowRouterStructure;
                        int i3 = iArr[0];
                        int i4 = iArr2[0];
                        int i5 = (int) WinterFlowRouterAdapter.WinterFlowHookDataSource;
                        int i6 = iArr[1];
                        int i7 = iArr2[1];
                        rect = new Rect((i2 + i3) - i4, (i5 + i6) - i7, (((int) WinterFlowRouterAdapter.WinterFlowCacheManagerAgent) + i3) - i4, (((int) WinterFlowRouterAdapter.WinterFlowArrayNetwork) + i6) - i7);
                    }
                    if (!WinterFlowRouterDeserialization.WinterFlowHookDataSource(WinterFlowSingletonPlatform, WinterFlowCacheManagerAgent, rect)) {
                        winterFlowViewEvent.WinterFlowHookDataSource = true;
                        break;
                    }
                }
                break;
            default:
                WinterFlowServerManager.WinterFlowSingletonPlatform(winterFlowXMLSoftware);
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
