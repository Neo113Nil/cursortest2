package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTestingFramework extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowTestingFramework> CREATOR = new WinterFlowStackFramework(14);
    public final String WinterFlowResponseEngine;
    public final long WinterFlowRouterRouter;
    public final int WinterFlowServerProtocol;
    public final long WinterFlowSyntax;
    public final int WinterFlowThreadListener;
    public final String WinterFlowTransactionAgent;
    public final int WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowTestingFramework(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = i3;
        this.WinterFlowRouterRouter = j;
        this.WinterFlowSyntax = j2;
        this.WinterFlowResponseEngine = str;
        this.WinterFlowTransactionAgent = str2;
        this.WinterFlowServerProtocol = i4;
        this.WinterFlowThreadListener = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 1, 4);
        parcel.writeInt(this.WinterFlowVariableVersionControl);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 2, 4);
        parcel.writeInt(this.WinterFlowTransactionManagerStrategy);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 3, 4);
        parcel.writeInt(this.WinterFlowUnitTestResponse);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 4, 8);
        parcel.writeLong(this.WinterFlowRouterRouter);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 5, 8);
        parcel.writeLong(this.WinterFlowSyntax);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 6, this.WinterFlowResponseEngine);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 7, this.WinterFlowTransactionAgent);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 8, 4);
        parcel.writeInt(this.WinterFlowServerProtocol);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 9, 4);
        parcel.writeInt(this.WinterFlowThreadListener);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
