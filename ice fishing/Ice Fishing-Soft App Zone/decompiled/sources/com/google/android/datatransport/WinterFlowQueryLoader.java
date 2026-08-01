package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueryLoader extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowQueryLoader> CREATOR = new WinterFlowStackFramework(11);
    public final int WinterFlowRouterRouter;
    public final boolean WinterFlowSyntax;
    public final String WinterFlowTransactionManagerStrategy;
    public final long WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowQueryLoader(int i, String str, long j, int i2, boolean z) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = str;
        this.WinterFlowUnitTestResponse = j;
        this.WinterFlowRouterRouter = i2;
        this.WinterFlowSyntax = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 1, 4);
        parcel.writeInt(this.WinterFlowVariableVersionControl);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 2, this.WinterFlowTransactionManagerStrategy);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 3, 8);
        parcel.writeLong(this.WinterFlowUnitTestResponse);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 4, 4);
        parcel.writeInt(this.WinterFlowRouterRouter);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 5, 4);
        parcel.writeInt(this.WinterFlowSyntax ? 1 : 0);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
