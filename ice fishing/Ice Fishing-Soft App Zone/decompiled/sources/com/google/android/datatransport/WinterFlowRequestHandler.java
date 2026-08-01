package com.google.android.datatransport;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRequestHandler extends WinterFlowTransactionVariable {
    public final WinterFlowIDEFramework WinterFlowArrayNetwork;
    public final WinterFlowHandlerPlatform WinterFlowCacheManagerAgent;
    public final SharedPreferences WinterFlowHookDataSource;
    public final WinterFlowRuntimeProtocol WinterFlowTransactionManagerStrategy;
    public final WinterFlowCacheManagerNode WinterFlowVariableVersionControl;

    public WinterFlowRequestHandler(SharedPreferences sharedPreferences) {
        Object value;
        String string;
        this.WinterFlowHookDataSource = sharedPreferences;
        WinterFlowHandlerPlatform WinterFlowCacheManagerAgent = WinterFlowTestingCloud.WinterFlowCacheManagerAgent("");
        this.WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent;
        this.WinterFlowArrayNetwork = new WinterFlowIDEFramework(WinterFlowCacheManagerAgent);
        WinterFlowCacheManagerNode WinterFlowArrayNetwork = WinterFlowHandlerWebsocket.WinterFlowArrayNetwork(7);
        this.WinterFlowVariableVersionControl = WinterFlowArrayNetwork;
        this.WinterFlowTransactionManagerStrategy = new WinterFlowRuntimeProtocol(WinterFlowArrayNetwork);
        do {
            value = WinterFlowCacheManagerAgent.getValue();
            string = this.WinterFlowHookDataSource.getString("user_secure_data", "");
        } while (!WinterFlowCacheManagerAgent.WinterFlowSyntax(value, string == null ? "" : string));
    }
}
