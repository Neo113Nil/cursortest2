package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowVersionControlMiddleware implements WinterFlowObjectSession {
    public final /* synthetic */ WinterFlowStackScript WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowVersionControlMiddleware(WinterFlowStackScript winterFlowStackScript, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowStackScript;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowStackScript winterFlowStackScript = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowScriptDatabaseSchema winterFlowScriptDatabaseSchema = (WinterFlowScriptDatabaseSchema) winterFlowStackScript.WinterFlowVariableBandwidth.WinterFlowRouterStructure();
                int WinterFlowCacheManagerAgent = winterFlowScriptDatabaseSchema.WinterFlowCacheManagerAgent();
                int i2 = 0;
                while (true) {
                    if (i2 >= WinterFlowCacheManagerAgent) {
                        i2 = -1;
                    } else if (!winterFlowScriptDatabaseSchema.WinterFlowArrayNetwork(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int intValue = ((Integer) obj).intValue();
                WinterFlowScriptDatabaseSchema winterFlowScriptDatabaseSchema2 = (WinterFlowScriptDatabaseSchema) winterFlowStackScript.WinterFlowVariableBandwidth.WinterFlowRouterStructure();
                if (intValue < 0 || intValue >= winterFlowScriptDatabaseSchema2.WinterFlowCacheManagerAgent()) {
                    StringBuilder WinterFlowThreadListener = WinterFlowResolverBackend.WinterFlowThreadListener("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                    WinterFlowThreadListener.append(winterFlowScriptDatabaseSchema2.WinterFlowCacheManagerAgent());
                    WinterFlowThreadListener.append(')');
                    WinterFlowValidatorConsumer.WinterFlowRouterStructure(WinterFlowThreadListener.toString());
                }
                WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowStackScript.WinterFlowModuleService(), null, new WinterFlowStrategyPlatform(winterFlowStackScript, intValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
