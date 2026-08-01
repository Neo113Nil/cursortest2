package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueryScript extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowQueryScript> CREATOR = new WinterFlowStackFramework(19);
    public final int WinterFlowRouterRouter;
    public final int WinterFlowSyntax;
    public final boolean WinterFlowTransactionManagerStrategy;
    public final boolean WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowQueryScript(int i, boolean z, boolean z2, int i2, int i3) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = z;
        this.WinterFlowUnitTestResponse = z2;
        this.WinterFlowRouterRouter = i2;
        this.WinterFlowSyntax = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 1, 4);
        parcel.writeInt(this.WinterFlowVariableVersionControl);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 2, 4);
        parcel.writeInt(this.WinterFlowTransactionManagerStrategy ? 1 : 0);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 3, 4);
        parcel.writeInt(this.WinterFlowUnitTestResponse ? 1 : 0);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 4, 4);
        parcel.writeInt(this.WinterFlowRouterRouter);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 5, 4);
        parcel.writeInt(this.WinterFlowSyntax);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
