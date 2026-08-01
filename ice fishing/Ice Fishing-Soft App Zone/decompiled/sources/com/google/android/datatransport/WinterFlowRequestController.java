package com.google.android.datatransport;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRequestController {
    public final WinterFlowJSON WinterFlowRouterStructure;

    public WinterFlowRequestController(int i) {
        switch (i) {
            case 1:
                this.WinterFlowRouterStructure = new WinterFlowJSON(new WinterFlowTransactionManagerUtility[16]);
                break;
            default:
                this.WinterFlowRouterStructure = new WinterFlowJSON(new WinterFlowAlgorithmResolver[16]);
                break;
        }
    }

    public void WinterFlowHookDataSource() {
        WinterFlowJSON winterFlowJSON = this.WinterFlowRouterStructure;
        WinterFlowCacheManagerListener WinterFlowArrayHelper = WinterFlowDecoratorUI.WinterFlowArrayHelper(0, winterFlowJSON.WinterFlowUnitTestResponse);
        int i = WinterFlowArrayHelper.WinterFlowVariableVersionControl;
        int i2 = WinterFlowArrayHelper.WinterFlowTransactionManagerStrategy;
        if (i <= i2) {
            while (true) {
                ((WinterFlowAlgorithmResolver) winterFlowJSON.WinterFlowVariableVersionControl[i]).WinterFlowHookDataSource.WinterFlowSyntax(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        winterFlowJSON.WinterFlowUnitTestResponse();
    }

    public void WinterFlowRouterStructure(CancellationException cancellationException) {
        WinterFlowJSON winterFlowJSON = this.WinterFlowRouterStructure;
        int i = winterFlowJSON.WinterFlowUnitTestResponse;
        WinterFlowAPIVersion[] winterFlowAPIVersionArr = new WinterFlowAPIVersion[i];
        for (int i2 = 0; i2 < i; i2++) {
            winterFlowAPIVersionArr[i2] = ((WinterFlowAlgorithmResolver) winterFlowJSON.WinterFlowVariableVersionControl[i2]).WinterFlowHookDataSource;
        }
        for (int i3 = 0; i3 < i; i3++) {
            winterFlowAPIVersionArr[i3].WinterFlowResponseEngine(cancellationException);
        }
        if (winterFlowJSON.WinterFlowUnitTestResponse == 0) {
            return;
        }
        WinterFlowValidatorConsumer.WinterFlowCacheManagerAgent("uncancelled requests present");
    }
}
