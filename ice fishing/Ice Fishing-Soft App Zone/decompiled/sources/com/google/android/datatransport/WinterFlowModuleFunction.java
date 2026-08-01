package com.google.android.datatransport;

import android.app.Application;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowModuleFunction implements WinterFlowSerializerFramework, WinterFlowFunctionProcessor, WinterFlowRendererProvider, WinterFlowSoftwareRouter {
    public static final /* synthetic */ WinterFlowModuleFunction WinterFlowTransactionManagerStrategy = new WinterFlowModuleFunction(3);
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowModuleFunction(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareRouter
    public WinterFlowExceptionParser WinterFlowRouterStructure(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = WinterFlowProviderUserManager.WinterFlowRouterRouter;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? WinterFlowHookProcessor.WinterFlowResponseEngine(bundle) : WinterFlowHookProcessor.WinterFlowResponseEngine(null);
    }

    @Override // com.google.android.datatransport.WinterFlowFunctionProcessor
    public long WinterFlowTransactionManagerStrategy() {
        return System.currentTimeMillis();
    }

    public String toString() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int hashCode = hashCode();
                WinterFlowQuerySyntax.WinterFlowArrayNetwork(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return "CreationExtras.Key@" + num + "<" + WinterFlowListenerProtocol.WinterFlowRouterStructure(Application.class).WinterFlowCacheManagerAgent() + ">";
            default:
                return super.toString();
        }
    }
}
