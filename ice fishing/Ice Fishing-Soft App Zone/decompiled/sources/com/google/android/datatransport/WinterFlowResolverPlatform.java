package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResolverPlatform implements Iterator, WinterFlowLoaderProcess {
    public final Iterator WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl = 1;

    public WinterFlowResolverPlatform(WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest) {
        WinterFlowStackHandler[] winterFlowStackHandlerArr = new WinterFlowStackHandler[8];
        for (int i = 0; i < 8; i++) {
            winterFlowStackHandlerArr[i] = new WinterFlowRendererNetwork(this);
        }
        this.WinterFlowTransactionManagerStrategy = new WinterFlowDatabaseSchemaInterface(winterFlowTransactionManagerUnitTest, winterFlowStackHandlerArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowDatabaseSchemaInterface) this.WinterFlowTransactionManagerStrategy).WinterFlowUnitTestResponse;
            default:
                return this.WinterFlowTransactionManagerStrategy.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (Map.Entry) ((WinterFlowDatabaseSchemaInterface) this.WinterFlowTransactionManagerStrategy).next();
            default:
                return (WinterFlowModuleSubsystem) this.WinterFlowTransactionManagerStrategy.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowDatabaseSchemaInterface) this.WinterFlowTransactionManagerStrategy).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public WinterFlowResolverPlatform(WinterFlowRequestTool winterFlowRequestTool) {
        this.WinterFlowTransactionManagerStrategy = winterFlowRequestTool.WinterFlowServiceUtility.iterator();
    }
}
