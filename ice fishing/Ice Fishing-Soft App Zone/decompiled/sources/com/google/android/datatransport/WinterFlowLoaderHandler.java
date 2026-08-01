package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLoaderHandler implements WinterFlowVersionControlUtility {
    public final WinterFlowDataSourceScript WinterFlowArrayNetwork;
    public final WinterFlowDataSourceScript WinterFlowCacheManagerAgent;
    public final WinterFlowDataSourceScript WinterFlowHookDataSource;
    public final WinterFlowDataSourceScript WinterFlowRouterStructure;

    public WinterFlowLoaderHandler(WinterFlowDataSourceScript winterFlowDataSourceScript, WinterFlowDataSourceScript winterFlowDataSourceScript2, WinterFlowDataSourceScript winterFlowDataSourceScript3, WinterFlowDataSourceScript winterFlowDataSourceScript4) {
        this.WinterFlowRouterStructure = winterFlowDataSourceScript;
        this.WinterFlowHookDataSource = winterFlowDataSourceScript2;
        this.WinterFlowCacheManagerAgent = winterFlowDataSourceScript3;
        this.WinterFlowArrayNetwork = winterFlowDataSourceScript4;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionControlUtility
    public final WinterFlowTestingCloud WinterFlowRouterStructure(long j, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration, WinterFlowConcurrencyParser winterFlowConcurrencyParser) {
        float WinterFlowRouterStructure = this.WinterFlowRouterStructure.WinterFlowRouterStructure(j, winterFlowConcurrencyParser);
        float WinterFlowRouterStructure2 = this.WinterFlowHookDataSource.WinterFlowRouterStructure(j, winterFlowConcurrencyParser);
        float WinterFlowRouterStructure3 = this.WinterFlowCacheManagerAgent.WinterFlowRouterStructure(j, winterFlowConcurrencyParser);
        float WinterFlowRouterStructure4 = this.WinterFlowArrayNetwork.WinterFlowRouterStructure(j, winterFlowConcurrencyParser);
        float WinterFlowHookDataSource = WinterFlowModuleBandwidth.WinterFlowHookDataSource(j);
        float f = WinterFlowRouterStructure + WinterFlowRouterStructure4;
        if (f > WinterFlowHookDataSource) {
            float f2 = WinterFlowHookDataSource / f;
            WinterFlowRouterStructure *= f2;
            WinterFlowRouterStructure4 *= f2;
        }
        float f3 = WinterFlowRouterStructure2 + WinterFlowRouterStructure3;
        if (f3 > WinterFlowHookDataSource) {
            float f4 = WinterFlowHookDataSource / f3;
            WinterFlowRouterStructure2 *= f4;
            WinterFlowRouterStructure3 *= f4;
        }
        if (WinterFlowRouterStructure < 0.0f || WinterFlowRouterStructure2 < 0.0f || WinterFlowRouterStructure3 < 0.0f || WinterFlowRouterStructure4 < 0.0f) {
            WinterFlowValidatorConsumer.WinterFlowRouterStructure("Corner size in Px can't be negative(topStart = " + WinterFlowRouterStructure + ", topEnd = " + WinterFlowRouterStructure2 + ", bottomEnd = " + WinterFlowRouterStructure3 + ", bottomStart = " + WinterFlowRouterStructure4 + ")!");
        }
        if (WinterFlowRouterStructure + WinterFlowRouterStructure2 + WinterFlowRouterStructure3 + WinterFlowRouterStructure4 == 0.0f) {
            return new WinterFlowSchedulerStack(WinterFlowHookProcessor.WinterFlowHookDataSource(0L, j));
        }
        WinterFlowVersionParser WinterFlowHookDataSource2 = WinterFlowHookProcessor.WinterFlowHookDataSource(0L, j);
        WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration2 = WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl;
        float f5 = winterFlowCacheManagerConfiguration == winterFlowCacheManagerConfiguration2 ? WinterFlowRouterStructure : WinterFlowRouterStructure2;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
        if (winterFlowCacheManagerConfiguration == winterFlowCacheManagerConfiguration2) {
            WinterFlowRouterStructure = WinterFlowRouterStructure2;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(WinterFlowRouterStructure) << 32) | (Float.floatToRawIntBits(WinterFlowRouterStructure) & 4294967295L);
        float f6 = winterFlowCacheManagerConfiguration == winterFlowCacheManagerConfiguration2 ? WinterFlowRouterStructure3 : WinterFlowRouterStructure4;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        if (winterFlowCacheManagerConfiguration != winterFlowCacheManagerConfiguration2) {
            WinterFlowRouterStructure4 = WinterFlowRouterStructure3;
        }
        return new WinterFlowSessionCompiler(new WinterFlowQueryJSON(WinterFlowHookDataSource2.WinterFlowRouterStructure, WinterFlowHookDataSource2.WinterFlowHookDataSource, WinterFlowHookDataSource2.WinterFlowCacheManagerAgent, WinterFlowHookDataSource2.WinterFlowArrayNetwork, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(WinterFlowRouterStructure4) << 32) | (Float.floatToRawIntBits(WinterFlowRouterStructure4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowLoaderHandler)) {
            return false;
        }
        WinterFlowLoaderHandler winterFlowLoaderHandler = (WinterFlowLoaderHandler) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowLoaderHandler.WinterFlowRouterStructure) && this.WinterFlowHookDataSource.equals(winterFlowLoaderHandler.WinterFlowHookDataSource) && this.WinterFlowCacheManagerAgent.equals(winterFlowLoaderHandler.WinterFlowCacheManagerAgent) && this.WinterFlowArrayNetwork.equals(winterFlowLoaderHandler.WinterFlowArrayNetwork);
    }

    public final int hashCode() {
        return this.WinterFlowArrayNetwork.hashCode() + ((this.WinterFlowCacheManagerAgent.hashCode() + ((this.WinterFlowHookDataSource.hashCode() + (this.WinterFlowRouterStructure.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.WinterFlowRouterStructure + ", topEnd = " + this.WinterFlowHookDataSource + ", bottomEnd = " + this.WinterFlowCacheManagerAgent + ", bottomStart = " + this.WinterFlowArrayNetwork + ')';
    }
}
