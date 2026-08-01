package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLibraryController extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowLibraryController> CREATOR = new WinterFlowStackFramework(28);
    public int WinterFlowResponseEngine;
    public final String WinterFlowRouterRouter;
    public final String WinterFlowSyntax;
    public final String WinterFlowTransactionAgent;
    public final String WinterFlowTransactionManagerStrategy;
    public final String WinterFlowUnitTestResponse;
    public final String WinterFlowVariableVersionControl;

    public WinterFlowLibraryController(String str, String str2, String str3, String str4, String str5) {
        this.WinterFlowVariableVersionControl = str;
        this.WinterFlowTransactionManagerStrategy = str2;
        this.WinterFlowUnitTestResponse = str3;
        this.WinterFlowRouterRouter = str4;
        this.WinterFlowSyntax = str5;
        this.WinterFlowTransactionAgent = "22.0.1";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 1, this.WinterFlowVariableVersionControl);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 2, this.WinterFlowTransactionManagerStrategy);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 3, this.WinterFlowUnitTestResponse);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 4, this.WinterFlowRouterRouter);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 5, this.WinterFlowSyntax);
        int i2 = this.WinterFlowResponseEngine;
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 6, 4);
        parcel.writeInt(i2);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 7, this.WinterFlowTransactionAgent);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }

    public WinterFlowLibraryController(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        this.WinterFlowVariableVersionControl = str;
        this.WinterFlowTransactionManagerStrategy = str2;
        this.WinterFlowUnitTestResponse = str3;
        this.WinterFlowRouterRouter = str4;
        this.WinterFlowSyntax = str5;
        this.WinterFlowResponseEngine = i;
        this.WinterFlowTransactionAgent = str6;
    }
}
