package com.google.android.datatransport;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProxyInterface extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowProxyInterface> CREATOR = new WinterFlowStackFramework(9);
    public final int WinterFlowTransactionManagerStrategy;
    public final Intent WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowProxyInterface(int i, int i2, Intent intent) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 1, 4);
        parcel.writeInt(this.WinterFlowVariableVersionControl);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 2, 4);
        parcel.writeInt(this.WinterFlowTransactionManagerStrategy);
        WinterFlowWorkerVersionControl.WinterFlowBatchUI(parcel, 3, this.WinterFlowUnitTestResponse, i);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
