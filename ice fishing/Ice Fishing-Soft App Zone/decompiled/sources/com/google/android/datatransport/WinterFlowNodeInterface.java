package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowNodeInterface {
    public final int WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final WinterFlowMiddlewareValidator WinterFlowRouterStructure;
    public final float WinterFlowTransactionManagerStrategy;
    public final float WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowNodeInterface(WinterFlowMiddlewareValidator winterFlowMiddlewareValidator, int i, int i2, int i3, int i4, float f, float f2) {
        this.WinterFlowRouterStructure = winterFlowMiddlewareValidator;
        this.WinterFlowHookDataSource = i;
        this.WinterFlowCacheManagerAgent = i2;
        this.WinterFlowArrayNetwork = i3;
        this.WinterFlowVariableVersionControl = i4;
        this.WinterFlowTransactionManagerStrategy = f;
        this.WinterFlowUnitTestResponse = f2;
    }

    public final int WinterFlowRouterStructure(int i) {
        int i2 = this.WinterFlowCacheManagerAgent;
        int i3 = this.WinterFlowHookDataSource;
        return WinterFlowDecoratorUI.WinterFlowSyntax(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowNodeInterface) {
            WinterFlowNodeInterface winterFlowNodeInterface = (WinterFlowNodeInterface) obj;
            if (this.WinterFlowRouterStructure == winterFlowNodeInterface.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowNodeInterface.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowNodeInterface.WinterFlowCacheManagerAgent && this.WinterFlowArrayNetwork == winterFlowNodeInterface.WinterFlowArrayNetwork && this.WinterFlowVariableVersionControl == winterFlowNodeInterface.WinterFlowVariableVersionControl && Float.compare(this.WinterFlowTransactionManagerStrategy, winterFlowNodeInterface.WinterFlowTransactionManagerStrategy) == 0 && Float.compare(this.WinterFlowUnitTestResponse, winterFlowNodeInterface.WinterFlowUnitTestResponse) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowUnitTestResponse) + WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowTransactionManagerStrategy, WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowVariableVersionControl, WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowArrayNetwork, WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowCacheManagerAgent, WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowHookDataSource, this.WinterFlowRouterStructure.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", startIndex=");
        sb.append(this.WinterFlowHookDataSource);
        sb.append(", endIndex=");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append(", startLineIndex=");
        sb.append(this.WinterFlowArrayNetwork);
        sb.append(", endLineIndex=");
        sb.append(this.WinterFlowVariableVersionControl);
        sb.append(", top=");
        sb.append(this.WinterFlowTransactionManagerStrategy);
        sb.append(", bottom=");
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(sb, this.WinterFlowUnitTestResponse, ')');
    }
}
