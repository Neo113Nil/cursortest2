package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperParser {
    public final int WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final WinterFlowObjectHook WinterFlowHookDataSource;
    public final WinterFlowRendererSystem WinterFlowRouterStructure;
    public final Object WinterFlowVariableVersionControl;

    public WinterFlowMapperParser(WinterFlowRendererSystem winterFlowRendererSystem, WinterFlowObjectHook winterFlowObjectHook, int i, int i2, Object obj) {
        this.WinterFlowRouterStructure = winterFlowRendererSystem;
        this.WinterFlowHookDataSource = winterFlowObjectHook;
        this.WinterFlowCacheManagerAgent = i;
        this.WinterFlowArrayNetwork = i2;
        this.WinterFlowVariableVersionControl = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowMapperParser)) {
            return false;
        }
        WinterFlowMapperParser winterFlowMapperParser = (WinterFlowMapperParser) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowMapperParser.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowMapperParser.WinterFlowHookDataSource) && this.WinterFlowCacheManagerAgent == winterFlowMapperParser.WinterFlowCacheManagerAgent && this.WinterFlowArrayNetwork == winterFlowMapperParser.WinterFlowArrayNetwork && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl, winterFlowMapperParser.WinterFlowVariableVersionControl);
    }

    public final int hashCode() {
        WinterFlowRendererSystem winterFlowRendererSystem = this.WinterFlowRouterStructure;
        int WinterFlowArrayNetwork = WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowArrayNetwork, WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowCacheManagerAgent, (((winterFlowRendererSystem == null ? 0 : winterFlowRendererSystem.hashCode()) * 31) + this.WinterFlowHookDataSource.WinterFlowVariableVersionControl) * 31, 31), 31);
        Object obj = this.WinterFlowVariableVersionControl;
        return WinterFlowArrayNetwork + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", fontWeight=");
        sb.append(this.WinterFlowHookDataSource);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.WinterFlowCacheManagerAgent;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.WinterFlowArrayNetwork;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.WinterFlowVariableVersionControl);
        sb.append(')');
        return sb.toString();
    }
}
