package com.google.android.datatransport;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowStackIDE {
    public WinterFlowStackProvider WinterFlowCacheManagerAgent;
    public boolean WinterFlowHookDataSource;
    public WinterFlowTestingCloud WinterFlowRouterStructure;

    public abstract void WinterFlowArrayNetwork(WinterFlowSessionUserManager winterFlowSessionUserManager);

    public abstract void WinterFlowCacheManagerAgent(WinterFlowSessionUserManager winterFlowSessionUserManager);

    public abstract void WinterFlowHookDataSource();

    public abstract void WinterFlowRouterStructure();

    public final void WinterFlowTransactionManagerStrategy(boolean z) {
        if (this.WinterFlowHookDataSource == z) {
            return;
        }
        this.WinterFlowHookDataSource = z;
        WinterFlowStackProvider winterFlowStackProvider = this.WinterFlowCacheManagerAgent;
        if (winterFlowStackProvider != null) {
            ((WinterFlowProtocolInterface) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).WinterFlowHookDataSource();
        }
    }

    public final void WinterFlowVariableVersionControl() {
        WinterFlowStackProvider winterFlowStackProvider = this.WinterFlowCacheManagerAgent;
        if (winterFlowStackProvider == null || !((LinkedHashSet) winterFlowStackProvider.WinterFlowUnitTestResponse).remove(this)) {
            return;
        }
        WinterFlowProtocolInterface winterFlowProtocolInterface = (WinterFlowProtocolInterface) winterFlowStackProvider.WinterFlowTransactionManagerStrategy;
        if (equals(winterFlowProtocolInterface.WinterFlowTransactionManagerStrategy)) {
            if (winterFlowProtocolInterface.WinterFlowUnitTestResponse == -1) {
                WinterFlowRouterStructure();
            }
            winterFlowProtocolInterface.WinterFlowTransactionManagerStrategy = null;
            winterFlowProtocolInterface.WinterFlowUnitTestResponse = 0;
            winterFlowProtocolInterface.WinterFlowRouterRouter = null;
        }
        winterFlowProtocolInterface.WinterFlowArrayNetwork.remove(this);
        winterFlowProtocolInterface.WinterFlowVariableVersionControl.remove(this);
        this.WinterFlowCacheManagerAgent = null;
        winterFlowProtocolInterface.WinterFlowHookDataSource();
    }
}
