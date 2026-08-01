package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRouterQueue extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowRouterQueue> CREATOR = new WinterFlowStackFramework(13);
    public final ConnectionResult WinterFlowTransactionManagerStrategy;
    public final WinterFlowFrameworkUtility WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowRouterQueue(int i, ConnectionResult connectionResult, WinterFlowFrameworkUtility winterFlowFrameworkUtility) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = connectionResult;
        this.WinterFlowUnitTestResponse = winterFlowFrameworkUtility;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 1, 4);
        parcel.writeInt(this.WinterFlowVariableVersionControl);
        WinterFlowWorkerVersionControl.WinterFlowBatchUI(parcel, 2, this.WinterFlowTransactionManagerStrategy, i);
        WinterFlowWorkerVersionControl.WinterFlowBatchUI(parcel, 3, this.WinterFlowUnitTestResponse, i);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
