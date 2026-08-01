package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResolverSubsystem extends WinterFlowThreadVersionControl implements Parcelable, WinterFlowTransactionUnitTest {
    public static final Parcelable.Creator<WinterFlowResolverSubsystem> CREATOR = new WinterFlowParserJSON();
    public final WinterFlowSessionManagerProcess WinterFlowTransactionManagerStrategy;
    public WinterFlowThreadUtility WinterFlowUnitTestResponse;

    public WinterFlowResolverSubsystem(Object obj, WinterFlowSessionManagerProcess winterFlowSessionManagerProcess) {
        this.WinterFlowTransactionManagerStrategy = winterFlowSessionManagerProcess;
        WinterFlowJSONModule WinterFlowRouterRouter = WinterFlowVersionProtocol.WinterFlowRouterRouter();
        WinterFlowThreadUtility winterFlowThreadUtility = new WinterFlowThreadUtility(WinterFlowRouterRouter.WinterFlowUnitTestResponse(), obj);
        if (!(WinterFlowRouterRouter instanceof WinterFlowSerializerScheduler)) {
            winterFlowThreadUtility.WinterFlowHookDataSource = new WinterFlowThreadUtility(1L, obj);
        }
        this.WinterFlowUnitTestResponse = winterFlowThreadUtility;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationTool
    public final WinterFlowOrchestrationInvoker WinterFlowArrayNetwork(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker, WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker2, WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker3) {
        if (this.WinterFlowTransactionManagerStrategy.WinterFlowThreadListener(((WinterFlowThreadUtility) winterFlowOrchestrationInvoker2).WinterFlowCacheManagerAgent, ((WinterFlowThreadUtility) winterFlowOrchestrationInvoker3).WinterFlowCacheManagerAgent)) {
            return winterFlowOrchestrationInvoker2;
        }
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationTool
    public final void WinterFlowCacheManagerAgent(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker) {
        this.WinterFlowUnitTestResponse = (WinterFlowThreadUtility) winterFlowOrchestrationInvoker;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationTool
    public final WinterFlowOrchestrationInvoker WinterFlowRouterStructure() {
        return this.WinterFlowUnitTestResponse;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionUnitTest
    public final WinterFlowSessionManagerProcess WinterFlowVariableVersionControl() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.datatransport.WinterFlowBatchCacheManager
    public final Object getValue() {
        return ((WinterFlowThreadUtility) WinterFlowVersionProtocol.WinterFlowVariableBandwidth(this.WinterFlowUnitTestResponse, this)).WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowThreadPoolGateway
    public final void setValue(Object obj) {
        WinterFlowJSONModule WinterFlowRouterRouter;
        WinterFlowThreadUtility winterFlowThreadUtility = (WinterFlowThreadUtility) WinterFlowVersionProtocol.WinterFlowTransactionManagerStrategy(this.WinterFlowUnitTestResponse);
        if (this.WinterFlowTransactionManagerStrategy.WinterFlowThreadListener(winterFlowThreadUtility.WinterFlowCacheManagerAgent, obj)) {
            return;
        }
        WinterFlowThreadUtility winterFlowThreadUtility2 = this.WinterFlowUnitTestResponse;
        synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
            WinterFlowRouterRouter = WinterFlowVersionProtocol.WinterFlowRouterRouter();
            ((WinterFlowThreadUtility) WinterFlowVersionProtocol.WinterFlowServiceUtility(winterFlowThreadUtility2, this, WinterFlowRouterRouter, winterFlowThreadUtility)).WinterFlowCacheManagerAgent = obj;
        }
        WinterFlowVersionProtocol.WinterFlowServerProtocol(WinterFlowRouterRouter, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((WinterFlowThreadUtility) WinterFlowVersionProtocol.WinterFlowTransactionManagerStrategy(this.WinterFlowUnitTestResponse)).WinterFlowCacheManagerAgent + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        WinterFlowSessionManagerProcess winterFlowSessionManagerProcess = WinterFlowSessionManagerProcess.WinterFlowRouterAdapter;
        WinterFlowSessionManagerProcess winterFlowSessionManagerProcess2 = this.WinterFlowTransactionManagerStrategy;
        if (winterFlowSessionManagerProcess2.equals(winterFlowSessionManagerProcess)) {
            i2 = 0;
        } else if (winterFlowSessionManagerProcess2.equals(WinterFlowSessionManagerProcess.WinterFlowResolverController)) {
            i2 = 1;
        } else {
            if (!winterFlowSessionManagerProcess2.equals(WinterFlowSessionManagerProcess.WinterFlowMapperProtocol)) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
