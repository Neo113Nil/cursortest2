package com.google.android.datatransport;

import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderConfiguration implements WinterFlowParserHelper {
    public final WinterFlowJSON WinterFlowTransactionManagerStrategy = new WinterFlowJSON(new WinterFlowFrontendHandler[16]);
    public final Set WinterFlowVariableVersionControl;

    public WinterFlowServiceProviderConfiguration(Set set) {
        this.WinterFlowVariableVersionControl = set;
    }

    @Override // com.google.android.datatransport.WinterFlowParserHelper
    public final void WinterFlowRouterStructure() {
        WinterFlowJSON winterFlowJSON = this.WinterFlowTransactionManagerStrategy;
        Object[] objArr = winterFlowJSON.WinterFlowVariableVersionControl;
        int i = winterFlowJSON.WinterFlowUnitTestResponse;
        for (int i2 = 0; i2 < i; i2++) {
            WinterFlowParserHelper winterFlowParserHelper = ((WinterFlowFrontendHandler) objArr[i2]).WinterFlowRouterStructure;
            this.WinterFlowVariableVersionControl.remove(winterFlowParserHelper);
            winterFlowParserHelper.WinterFlowRouterStructure();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowParserHelper
    public final void WinterFlowCacheManagerAgent() {
    }

    @Override // com.google.android.datatransport.WinterFlowParserHelper
    public final void WinterFlowVariableVersionControl() {
    }
}
