package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionControlModule extends WinterFlowThreadVersionControl implements Parcelable, WinterFlowTransactionUnitTest, WinterFlowBatchCacheManager, WinterFlowThreadPoolGateway {
    public static final Parcelable.Creator<WinterFlowVersionControlModule> CREATOR = new WinterFlowStackFramework(6);
    public WinterFlowResolverManager WinterFlowTransactionManagerStrategy;

    public WinterFlowVersionControlModule(int i) {
        WinterFlowJSONModule WinterFlowRouterRouter = WinterFlowVersionProtocol.WinterFlowRouterRouter();
        WinterFlowResolverManager winterFlowResolverManager = new WinterFlowResolverManager(i, WinterFlowRouterRouter.WinterFlowUnitTestResponse());
        if (!(WinterFlowRouterRouter instanceof WinterFlowSerializerScheduler)) {
            winterFlowResolverManager.WinterFlowHookDataSource = new WinterFlowResolverManager(i, 1L);
        }
        this.WinterFlowTransactionManagerStrategy = winterFlowResolverManager;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationTool
    public final WinterFlowOrchestrationInvoker WinterFlowArrayNetwork(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker, WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker2, WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker3) {
        if (((WinterFlowResolverManager) winterFlowOrchestrationInvoker2).WinterFlowCacheManagerAgent == ((WinterFlowResolverManager) winterFlowOrchestrationInvoker3).WinterFlowCacheManagerAgent) {
            return winterFlowOrchestrationInvoker2;
        }
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationTool
    public final void WinterFlowCacheManagerAgent(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker) {
        this.WinterFlowTransactionManagerStrategy = (WinterFlowResolverManager) winterFlowOrchestrationInvoker;
    }

    public final int WinterFlowRouterRouter() {
        return ((WinterFlowResolverManager) WinterFlowVersionProtocol.WinterFlowVariableBandwidth(this.WinterFlowTransactionManagerStrategy, this)).WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationTool
    public final WinterFlowOrchestrationInvoker WinterFlowRouterStructure() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    public final void WinterFlowSyntax(int i) {
        WinterFlowJSONModule WinterFlowRouterRouter;
        WinterFlowResolverManager winterFlowResolverManager = (WinterFlowResolverManager) WinterFlowVersionProtocol.WinterFlowTransactionManagerStrategy(this.WinterFlowTransactionManagerStrategy);
        if (winterFlowResolverManager.WinterFlowCacheManagerAgent != i) {
            WinterFlowResolverManager winterFlowResolverManager2 = this.WinterFlowTransactionManagerStrategy;
            synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
                WinterFlowRouterRouter = WinterFlowVersionProtocol.WinterFlowRouterRouter();
                ((WinterFlowResolverManager) WinterFlowVersionProtocol.WinterFlowServiceUtility(winterFlowResolverManager2, this, WinterFlowRouterRouter, winterFlowResolverManager)).WinterFlowCacheManagerAgent = i;
            }
            WinterFlowVersionProtocol.WinterFlowServerProtocol(WinterFlowRouterRouter, this);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionUnitTest
    public final WinterFlowSessionManagerProcess WinterFlowVariableVersionControl() {
        return WinterFlowSessionManagerProcess.WinterFlowResolverController;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.datatransport.WinterFlowBatchCacheManager
    public final Object getValue() {
        return Integer.valueOf(WinterFlowRouterRouter());
    }

    @Override // com.google.android.datatransport.WinterFlowThreadPoolGateway
    public final void setValue(Object obj) {
        WinterFlowSyntax(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((WinterFlowResolverManager) WinterFlowVersionProtocol.WinterFlowTransactionManagerStrategy(this.WinterFlowTransactionManagerStrategy)).WinterFlowCacheManagerAgent + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(WinterFlowRouterRouter());
    }
}
