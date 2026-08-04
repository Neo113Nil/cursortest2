package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.gamericefishpro.space.ph.m0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFi1iSDK implements AFi1kSDK {
    private PluginInfo getMediationNetwork = new PluginInfo(Plugin.NATIVE, "6.17.5", null, 4, null);

    @Override // com.appsflyer.internal.AFi1kSDK
    public final Map<String, Object> getCurrencyIso4217Code() {
        LinkedHashMap linkedHashMapF = m0.f(new Pair("platform", this.getMediationNetwork.getPlugin().getPluginName()), new Pair("version", this.getMediationNetwork.getVersion()));
        if (!this.getMediationNetwork.getAdditionalParams().isEmpty()) {
            linkedHashMapF.put("extras", this.getMediationNetwork.getAdditionalParams());
        }
        return linkedHashMapF;
    }

    @Override // com.appsflyer.internal.AFi1kSDK
    public final void getRevenue(PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.getMediationNetwork = pluginInfo;
    }
}
