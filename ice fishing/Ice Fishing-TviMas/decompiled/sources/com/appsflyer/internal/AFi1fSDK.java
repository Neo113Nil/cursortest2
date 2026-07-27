package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.facebook.internal.ServerProtocol;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AFi1fSDK implements AFi1oSDK {
    private PluginInfo getMonetizationNetwork = new PluginInfo(Plugin.NATIVE, "6.15.2", null, 4, null);

    @Override // com.appsflyer.internal.AFi1oSDK
    public final void getRevenue(PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.getMonetizationNetwork = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    public final Map<String, Object> getMediationNetwork() {
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("platform", this.getMonetizationNetwork.getPlugin().getPluginName()), TuplesKt.to(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.getMonetizationNetwork.getVersion()));
        if (!this.getMonetizationNetwork.getAdditionalParams().isEmpty()) {
            mutableMapOf.put("extras", this.getMonetizationNetwork.getAdditionalParams());
        }
        return mutableMapOf;
    }
}
