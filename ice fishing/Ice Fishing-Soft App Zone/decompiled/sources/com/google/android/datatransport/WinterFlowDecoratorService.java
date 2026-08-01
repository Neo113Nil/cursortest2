package com.google.android.datatransport;

import java.io.Serializable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowDecoratorService implements WinterFlowParserFramework, Serializable {
    public final int WinterFlowResponseEngine;
    public final String WinterFlowRouterRouter;
    public final boolean WinterFlowSyntax = false;
    public final int WinterFlowTransactionAgent;
    public final Class WinterFlowTransactionManagerStrategy;
    public final String WinterFlowUnitTestResponse;
    public final Object WinterFlowVariableVersionControl;

    public WinterFlowDecoratorService(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.WinterFlowVariableVersionControl = obj;
        this.WinterFlowTransactionManagerStrategy = cls;
        this.WinterFlowUnitTestResponse = str;
        this.WinterFlowRouterRouter = str2;
        this.WinterFlowResponseEngine = i;
        this.WinterFlowTransactionAgent = i2 >> 1;
    }

    @Override // com.google.android.datatransport.WinterFlowParserFramework
    public final int WinterFlowHookDataSource() {
        return this.WinterFlowResponseEngine;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowDecoratorService)) {
            return false;
        }
        WinterFlowDecoratorService winterFlowDecoratorService = (WinterFlowDecoratorService) obj;
        return this.WinterFlowSyntax == winterFlowDecoratorService.WinterFlowSyntax && this.WinterFlowResponseEngine == winterFlowDecoratorService.WinterFlowResponseEngine && this.WinterFlowTransactionAgent == winterFlowDecoratorService.WinterFlowTransactionAgent && this.WinterFlowVariableVersionControl.equals(winterFlowDecoratorService.WinterFlowVariableVersionControl) && this.WinterFlowTransactionManagerStrategy.equals(winterFlowDecoratorService.WinterFlowTransactionManagerStrategy) && this.WinterFlowUnitTestResponse.equals(winterFlowDecoratorService.WinterFlowUnitTestResponse) && this.WinterFlowRouterRouter.equals(winterFlowDecoratorService.WinterFlowRouterRouter);
    }

    public final int hashCode() {
        return ((((((this.WinterFlowRouterRouter.hashCode() + ((this.WinterFlowUnitTestResponse.hashCode() + ((this.WinterFlowTransactionManagerStrategy.hashCode() + (this.WinterFlowVariableVersionControl.hashCode() * 31)) * 31)) * 31)) * 31) + (this.WinterFlowSyntax ? 1231 : 1237)) * 31) + this.WinterFlowResponseEngine) * 31) + this.WinterFlowTransactionAgent;
    }

    public final String toString() {
        WinterFlowListenerProtocol.WinterFlowRouterStructure.getClass();
        return WinterFlowOrchestrationSystem.WinterFlowRouterStructure(this);
    }
}
