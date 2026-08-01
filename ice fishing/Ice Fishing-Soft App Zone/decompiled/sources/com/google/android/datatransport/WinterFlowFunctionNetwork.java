package com.google.android.datatransport;

import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFunctionNetwork {
    public static final Pattern WinterFlowArrayNetwork = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String WinterFlowCacheManagerAgent;
    public final String WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowFunctionNetwork(String str, String str2) {
        String substring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (substring == null || !WinterFlowArrayNetwork.matcher(substring).matches()) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowResponseEngine("Invalid topic name: ", substring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.WinterFlowRouterStructure = substring;
        this.WinterFlowHookDataSource = str;
        this.WinterFlowCacheManagerAgent = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowFunctionNetwork)) {
            return false;
        }
        WinterFlowFunctionNetwork winterFlowFunctionNetwork = (WinterFlowFunctionNetwork) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowFunctionNetwork.WinterFlowRouterStructure) && this.WinterFlowHookDataSource.equals(winterFlowFunctionNetwork.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.WinterFlowHookDataSource, this.WinterFlowRouterStructure});
    }
}
