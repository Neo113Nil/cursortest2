package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrameworkNode extends WinterFlowValidatorWebsocket implements Iterator, WinterFlowLoaderProcess {
    public final /* synthetic */ int WinterFlowSyntax;

    public WinterFlowFrameworkNode(WinterFlowDatabaseScript winterFlowDatabaseScript, int i) {
        this.WinterFlowSyntax = i;
        this.WinterFlowRouterRouter = winterFlowDatabaseScript;
        this.WinterFlowTransactionManagerStrategy = -1;
        this.WinterFlowUnitTestResponse = winterFlowDatabaseScript.WinterFlowServerProtocol;
        WinterFlowCacheManagerAgent();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.WinterFlowSyntax) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowHookDataSource();
                int i = this.WinterFlowVariableVersionControl;
                WinterFlowDatabaseScript winterFlowDatabaseScript = (WinterFlowDatabaseScript) this.WinterFlowRouterRouter;
                if (i >= winterFlowDatabaseScript.WinterFlowResponseEngine) {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                    break;
                } else {
                    this.WinterFlowVariableVersionControl = i + 1;
                    this.WinterFlowTransactionManagerStrategy = i;
                    WinterFlowProtocolProcess winterFlowProtocolProcess = new WinterFlowProtocolProcess(winterFlowDatabaseScript, i);
                    WinterFlowCacheManagerAgent();
                    break;
                }
            case 1:
                WinterFlowHookDataSource();
                int i2 = this.WinterFlowVariableVersionControl;
                WinterFlowDatabaseScript winterFlowDatabaseScript2 = (WinterFlowDatabaseScript) this.WinterFlowRouterRouter;
                if (i2 >= winterFlowDatabaseScript2.WinterFlowResponseEngine) {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                    break;
                } else {
                    this.WinterFlowVariableVersionControl = i2 + 1;
                    this.WinterFlowTransactionManagerStrategy = i2;
                    Object obj = winterFlowDatabaseScript2.WinterFlowVariableVersionControl[i2];
                    WinterFlowCacheManagerAgent();
                    break;
                }
            default:
                WinterFlowHookDataSource();
                int i3 = this.WinterFlowVariableVersionControl;
                WinterFlowDatabaseScript winterFlowDatabaseScript3 = (WinterFlowDatabaseScript) this.WinterFlowRouterRouter;
                if (i3 >= winterFlowDatabaseScript3.WinterFlowResponseEngine) {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                    break;
                } else {
                    this.WinterFlowVariableVersionControl = i3 + 1;
                    this.WinterFlowTransactionManagerStrategy = i3;
                    Object[] objArr = winterFlowDatabaseScript3.WinterFlowTransactionManagerStrategy;
                    objArr.getClass();
                    Object obj2 = objArr[this.WinterFlowTransactionManagerStrategy];
                    WinterFlowCacheManagerAgent();
                    break;
                }
        }
        return null;
    }
}
