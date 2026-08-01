package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSchedulerConfiguration extends WinterFlowThreadVersionControl implements Parcelable, WinterFlowTransactionUnitTest, WinterFlowBatchCacheManager, WinterFlowThreadPoolGateway {
    public static final Parcelable.Creator<WinterFlowSchedulerConfiguration> CREATOR = new WinterFlowStackFramework(7);
    public WinterFlowEventEmitterValidator WinterFlowTransactionManagerStrategy;

    public WinterFlowSchedulerConfiguration(long j) {
        WinterFlowJSONModule WinterFlowRouterRouter = WinterFlowVersionProtocol.WinterFlowRouterRouter();
        WinterFlowEventEmitterValidator winterFlowEventEmitterValidator = new WinterFlowEventEmitterValidator(WinterFlowRouterRouter.WinterFlowUnitTestResponse(), j);
        if (!(WinterFlowRouterRouter instanceof WinterFlowSerializerScheduler)) {
            winterFlowEventEmitterValidator.WinterFlowHookDataSource = new WinterFlowEventEmitterValidator(1L, j);
        }
        this.WinterFlowTransactionManagerStrategy = winterFlowEventEmitterValidator;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationTool
    public final WinterFlowOrchestrationInvoker WinterFlowArrayNetwork(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker, WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker2, WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker3) {
        if (((WinterFlowEventEmitterValidator) winterFlowOrchestrationInvoker2).WinterFlowCacheManagerAgent == ((WinterFlowEventEmitterValidator) winterFlowOrchestrationInvoker3).WinterFlowCacheManagerAgent) {
            return winterFlowOrchestrationInvoker2;
        }
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationTool
    public final void WinterFlowCacheManagerAgent(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker) {
        this.WinterFlowTransactionManagerStrategy = (WinterFlowEventEmitterValidator) winterFlowOrchestrationInvoker;
    }

    public final long WinterFlowRouterRouter() {
        return ((WinterFlowEventEmitterValidator) WinterFlowVersionProtocol.WinterFlowVariableBandwidth(this.WinterFlowTransactionManagerStrategy, this)).WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationTool
    public final WinterFlowOrchestrationInvoker WinterFlowRouterStructure() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    public final void WinterFlowSyntax(long j) {
        WinterFlowJSONModule WinterFlowRouterRouter;
        WinterFlowEventEmitterValidator winterFlowEventEmitterValidator = (WinterFlowEventEmitterValidator) WinterFlowVersionProtocol.WinterFlowTransactionManagerStrategy(this.WinterFlowTransactionManagerStrategy);
        if (winterFlowEventEmitterValidator.WinterFlowCacheManagerAgent != j) {
            WinterFlowEventEmitterValidator winterFlowEventEmitterValidator2 = this.WinterFlowTransactionManagerStrategy;
            synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
                WinterFlowRouterRouter = WinterFlowVersionProtocol.WinterFlowRouterRouter();
                ((WinterFlowEventEmitterValidator) WinterFlowVersionProtocol.WinterFlowServiceUtility(winterFlowEventEmitterValidator2, this, WinterFlowRouterRouter, winterFlowEventEmitterValidator)).WinterFlowCacheManagerAgent = j;
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
        return Long.valueOf(WinterFlowRouterRouter());
    }

    @Override // com.google.android.datatransport.WinterFlowThreadPoolGateway
    public final void setValue(Object obj) {
        WinterFlowSyntax(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((WinterFlowEventEmitterValidator) WinterFlowVersionProtocol.WinterFlowTransactionManagerStrategy(this.WinterFlowTransactionManagerStrategy)).WinterFlowCacheManagerAgent + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(WinterFlowRouterRouter());
    }
}
