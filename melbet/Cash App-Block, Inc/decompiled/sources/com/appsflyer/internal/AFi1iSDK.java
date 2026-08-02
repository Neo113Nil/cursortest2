package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes.dex */
public final class AFi1iSDK implements AFi1kSDK {
    private PluginInfo getMediationNetwork = new PluginInfo(Plugin.NATIVE, "6.17.5", null, 4, null);

    @Override // com.appsflyer.internal.AFi1kSDK
    public final Map<String, Object> getCurrencyIso4217Code() {
        LinkedHashMap mutableMapOf = MapsKt__MapsKt.mutableMapOf(new Pair("platform", this.getMediationNetwork.getPlugin().getPluginName()), new Pair("version", this.getMediationNetwork.getVersion()));
        if (!this.getMediationNetwork.getAdditionalParams().isEmpty()) {
            mutableMapOf.put("extras", this.getMediationNetwork.getAdditionalParams());
        }
        return mutableMapOf;
    }

    @Override // com.appsflyer.internal.AFi1kSDK
    public final void getRevenue(PluginInfo pluginInfo) {
        pluginInfo.getClass();
        this.getMediationNetwork = pluginInfo;
    }
}
