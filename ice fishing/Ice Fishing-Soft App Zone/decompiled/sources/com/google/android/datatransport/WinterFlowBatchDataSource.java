package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBatchDataSource extends WinterFlowRendererLayer {
    public final String WinterFlowArrayNetwork;
    public final String WinterFlowCacheManagerAgent;
    public final String WinterFlowHookDataSource;
    public final String WinterFlowResponseEngine;
    public final String WinterFlowRouterRouter;
    public final Integer WinterFlowRouterStructure;
    public final String WinterFlowServerProtocol;
    public final String WinterFlowSyntax;
    public final String WinterFlowTransactionAgent;
    public final String WinterFlowTransactionManagerStrategy;
    public final String WinterFlowUnitTestResponse;
    public final String WinterFlowVariableVersionControl;

    public WinterFlowBatchDataSource(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.WinterFlowRouterStructure = num;
        this.WinterFlowHookDataSource = str;
        this.WinterFlowCacheManagerAgent = str2;
        this.WinterFlowArrayNetwork = str3;
        this.WinterFlowVariableVersionControl = str4;
        this.WinterFlowTransactionManagerStrategy = str5;
        this.WinterFlowUnitTestResponse = str6;
        this.WinterFlowRouterRouter = str7;
        this.WinterFlowSyntax = str8;
        this.WinterFlowResponseEngine = str9;
        this.WinterFlowTransactionAgent = str10;
        this.WinterFlowServerProtocol = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowRendererLayer)) {
            return false;
        }
        WinterFlowRendererLayer winterFlowRendererLayer = (WinterFlowRendererLayer) obj;
        if (!this.WinterFlowRouterStructure.equals(((WinterFlowBatchDataSource) winterFlowRendererLayer).WinterFlowRouterStructure)) {
            return false;
        }
        if (!this.WinterFlowHookDataSource.equals(((WinterFlowBatchDataSource) winterFlowRendererLayer).WinterFlowHookDataSource)) {
            return false;
        }
        if (!this.WinterFlowCacheManagerAgent.equals(((WinterFlowBatchDataSource) winterFlowRendererLayer).WinterFlowCacheManagerAgent)) {
            return false;
        }
        if (!this.WinterFlowArrayNetwork.equals(((WinterFlowBatchDataSource) winterFlowRendererLayer).WinterFlowArrayNetwork)) {
            return false;
        }
        if (!this.WinterFlowVariableVersionControl.equals(((WinterFlowBatchDataSource) winterFlowRendererLayer).WinterFlowVariableVersionControl)) {
            return false;
        }
        if (!this.WinterFlowTransactionManagerStrategy.equals(((WinterFlowBatchDataSource) winterFlowRendererLayer).WinterFlowTransactionManagerStrategy)) {
            return false;
        }
        if (!this.WinterFlowUnitTestResponse.equals(((WinterFlowBatchDataSource) winterFlowRendererLayer).WinterFlowUnitTestResponse)) {
            return false;
        }
        if (!this.WinterFlowRouterRouter.equals(((WinterFlowBatchDataSource) winterFlowRendererLayer).WinterFlowRouterRouter)) {
            return false;
        }
        if (!this.WinterFlowSyntax.equals(((WinterFlowBatchDataSource) winterFlowRendererLayer).WinterFlowSyntax)) {
            return false;
        }
        if (!this.WinterFlowResponseEngine.equals(((WinterFlowBatchDataSource) winterFlowRendererLayer).WinterFlowResponseEngine)) {
            return false;
        }
        if (this.WinterFlowTransactionAgent.equals(((WinterFlowBatchDataSource) winterFlowRendererLayer).WinterFlowTransactionAgent)) {
            return this.WinterFlowServerProtocol.equals(((WinterFlowBatchDataSource) winterFlowRendererLayer).WinterFlowServerProtocol);
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowServerProtocol.hashCode() ^ ((((((((((((((((((((((this.WinterFlowRouterStructure.hashCode() ^ 1000003) * 1000003) ^ this.WinterFlowHookDataSource.hashCode()) * 1000003) ^ this.WinterFlowCacheManagerAgent.hashCode()) * 1000003) ^ this.WinterFlowArrayNetwork.hashCode()) * 1000003) ^ this.WinterFlowVariableVersionControl.hashCode()) * 1000003) ^ this.WinterFlowTransactionManagerStrategy.hashCode()) * 1000003) ^ this.WinterFlowUnitTestResponse.hashCode()) * 1000003) ^ this.WinterFlowRouterRouter.hashCode()) * 1000003) ^ this.WinterFlowSyntax.hashCode()) * 1000003) ^ this.WinterFlowResponseEngine.hashCode()) * 1000003) ^ this.WinterFlowTransactionAgent.hashCode()) * 1000003);
    }

    public final String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.WinterFlowRouterStructure + ", model=" + this.WinterFlowHookDataSource + ", hardware=" + this.WinterFlowCacheManagerAgent + ", device=" + this.WinterFlowArrayNetwork + ", product=" + this.WinterFlowVariableVersionControl + ", osBuild=" + this.WinterFlowTransactionManagerStrategy + ", manufacturer=" + this.WinterFlowUnitTestResponse + ", fingerprint=" + this.WinterFlowRouterRouter + ", locale=" + this.WinterFlowSyntax + ", country=" + this.WinterFlowResponseEngine + ", mccMnc=" + this.WinterFlowTransactionAgent + ", applicationBuild=" + this.WinterFlowServerProtocol + "}";
    }
}
