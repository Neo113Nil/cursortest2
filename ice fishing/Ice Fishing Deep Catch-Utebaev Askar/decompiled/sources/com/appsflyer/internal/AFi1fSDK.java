package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1fSDK implements AFi1oSDK {
    private PluginInfo getMonetizationNetwork = new PluginInfo(Plugin.NATIVE, "6.15.2", null, 4, null);

    @Override // com.appsflyer.internal.AFi1oSDK
    public final Map<String, Object> getMediationNetwork() {
        LinkedHashMap linkedHashMapE = d0.e(new Pair("platform", this.getMonetizationNetwork.getPlugin().getPluginName()), new Pair("version", this.getMonetizationNetwork.getVersion()));
        if (!this.getMonetizationNetwork.getAdditionalParams().isEmpty()) {
            linkedHashMapE.put("extras", this.getMonetizationNetwork.getAdditionalParams());
        }
        return linkedHashMapE;
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    public final void getRevenue(PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.getMonetizationNetwork = pluginInfo;
    }
}
