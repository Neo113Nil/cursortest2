package com.google.android.datatransport;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowListenerEvent extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowListenerEvent> CREATOR = new WinterFlowStackFramework(25);
    public WinterFlowVariableEngine WinterFlowRouterRouter;
    public WinterFlowDebugDatabaseSchema[] WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public Bundle WinterFlowVariableVersionControl;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowVariableBandwidth(parcel, 1, this.WinterFlowVariableVersionControl);
        WinterFlowWorkerVersionControl.WinterFlowSerializerStructure(parcel, 2, this.WinterFlowTransactionManagerStrategy, i);
        int i2 = this.WinterFlowUnitTestResponse;
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 3, 4);
        parcel.writeInt(i2);
        WinterFlowWorkerVersionControl.WinterFlowBatchUI(parcel, 4, this.WinterFlowRouterRouter, i);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
