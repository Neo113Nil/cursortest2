package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowClassTool extends WinterFlowUserManagerController implements WinterFlowAlgorithmEntity, WinterFlowHookFrontend {
    public WinterFlowClassTool WinterFlowBatchUI;
    public long WinterFlowRouterAdapter;
    public WinterFlowClassTool WinterFlowVariableBandwidth;

    @Override // com.google.android.datatransport.WinterFlowHookFrontend, com.google.android.datatransport.WinterFlowCacheInvoker
    public final void WinterFlowCacheManagerAgent(long j) {
        this.WinterFlowRouterAdapter = j;
    }

    @Override // com.google.android.datatransport.WinterFlowAlgorithmEntity
    public final Object WinterFlowResponseEngine() {
        return WinterFlowCacheUtility.WinterFlowConsumerUserManager;
    }

    public final void WinterFlowServerStack(WinterFlowJSONDecorator winterFlowJSONDecorator) {
        WinterFlowAlgorithmEntity winterFlowAlgorithmEntity;
        WinterFlowClassTool winterFlowClassTool;
        WinterFlowClassTool winterFlowClassTool2 = this.WinterFlowVariableBandwidth;
        if (winterFlowClassTool2 == null || !WinterFlowServerManager.WinterFlowServerProtocol(winterFlowClassTool2, WinterFlowManagerRequest.WinterFlowConfigurationSubsystem(winterFlowJSONDecorator))) {
            if (this.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                WinterFlowBandwidthCache winterFlowBandwidthCache = new WinterFlowBandwidthCache();
                WinterFlowWorkerVersionControl.WinterFlowSingletonPlatform(this, new WinterFlowBandwidthTransaction(winterFlowBandwidthCache, this, winterFlowJSONDecorator, 2));
                winterFlowAlgorithmEntity = (WinterFlowAlgorithmEntity) winterFlowBandwidthCache.WinterFlowVariableVersionControl;
            } else {
                winterFlowAlgorithmEntity = null;
            }
            winterFlowClassTool = (WinterFlowClassTool) winterFlowAlgorithmEntity;
        } else {
            winterFlowClassTool = winterFlowClassTool2;
        }
        if (winterFlowClassTool != null && winterFlowClassTool2 == null) {
            winterFlowClassTool.WinterFlowUIPlatform();
            winterFlowClassTool.WinterFlowServerStack(winterFlowJSONDecorator);
            WinterFlowClassTool winterFlowClassTool3 = this.WinterFlowBatchUI;
            if (winterFlowClassTool3 != null) {
                winterFlowClassTool3.WinterFlowUserManagerConcurrency();
            }
        } else if (winterFlowClassTool == null && winterFlowClassTool2 != null) {
            WinterFlowClassTool winterFlowClassTool4 = this.WinterFlowBatchUI;
            if (winterFlowClassTool4 != null) {
                winterFlowClassTool4.WinterFlowUIPlatform();
                winterFlowClassTool4.WinterFlowServerStack(winterFlowJSONDecorator);
            }
            winterFlowClassTool2.WinterFlowUserManagerConcurrency();
        } else if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowClassTool, winterFlowClassTool2)) {
            if (winterFlowClassTool != null) {
                winterFlowClassTool.WinterFlowUIPlatform();
                winterFlowClassTool.WinterFlowServerStack(winterFlowJSONDecorator);
            }
            if (winterFlowClassTool2 != null) {
                winterFlowClassTool2.WinterFlowUserManagerConcurrency();
            }
        } else if (winterFlowClassTool != null) {
            winterFlowClassTool.WinterFlowServerStack(winterFlowJSONDecorator);
        } else {
            WinterFlowClassTool winterFlowClassTool5 = this.WinterFlowBatchUI;
            if (winterFlowClassTool5 != null) {
                winterFlowClassTool5.WinterFlowServerStack(winterFlowJSONDecorator);
            }
        }
        this.WinterFlowVariableBandwidth = winterFlowClassTool;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerController
    public final void WinterFlowTestingTransactionManager() {
        this.WinterFlowBatchUI = null;
        this.WinterFlowVariableBandwidth = null;
    }

    public final void WinterFlowUIPlatform() {
        WinterFlowClassTool winterFlowClassTool = this.WinterFlowBatchUI;
        if (winterFlowClassTool != null) {
            winterFlowClassTool.WinterFlowUIPlatform();
            return;
        }
        WinterFlowClassTool winterFlowClassTool2 = this.WinterFlowVariableBandwidth;
        if (winterFlowClassTool2 != null) {
            winterFlowClassTool2.WinterFlowUIPlatform();
        }
    }

    public final void WinterFlowUserManagerConcurrency() {
        WinterFlowClassTool winterFlowClassTool = this.WinterFlowBatchUI;
        if (winterFlowClassTool != null) {
            winterFlowClassTool.WinterFlowUserManagerConcurrency();
        }
        WinterFlowClassTool winterFlowClassTool2 = this.WinterFlowVariableBandwidth;
        if (winterFlowClassTool2 != null) {
            winterFlowClassTool2.WinterFlowUserManagerConcurrency();
        }
        this.WinterFlowVariableBandwidth = null;
    }

    public final boolean WinterFlowValidatorNetwork() {
        WinterFlowClassTool winterFlowClassTool = this.WinterFlowVariableBandwidth;
        if (winterFlowClassTool != null) {
            return winterFlowClassTool.WinterFlowValidatorNetwork();
        }
        WinterFlowClassTool winterFlowClassTool2 = this.WinterFlowBatchUI;
        if (winterFlowClassTool2 != null) {
            return winterFlowClassTool2.WinterFlowValidatorNetwork();
        }
        return false;
    }

    public final void WinterFlowWidgetProcess() {
        WinterFlowClassTool winterFlowClassTool = this.WinterFlowBatchUI;
        if (winterFlowClassTool != null) {
            winterFlowClassTool.WinterFlowWidgetProcess();
            return;
        }
        WinterFlowClassTool winterFlowClassTool2 = this.WinterFlowVariableBandwidth;
        if (winterFlowClassTool2 != null) {
            winterFlowClassTool2.WinterFlowWidgetProcess();
        }
    }
}
