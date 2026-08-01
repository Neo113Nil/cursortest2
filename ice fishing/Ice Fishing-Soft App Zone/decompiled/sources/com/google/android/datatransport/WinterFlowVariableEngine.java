package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVariableEngine extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowVariableEngine> CREATOR = new WinterFlowStackFramework(26);
    public final int[] WinterFlowResponseEngine;
    public final int[] WinterFlowRouterRouter;
    public final int WinterFlowSyntax;
    public final boolean WinterFlowTransactionManagerStrategy;
    public final boolean WinterFlowUnitTestResponse;
    public final WinterFlowQueryScript WinterFlowVariableVersionControl;

    public WinterFlowVariableEngine(WinterFlowQueryScript winterFlowQueryScript, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.WinterFlowVariableVersionControl = winterFlowQueryScript;
        this.WinterFlowTransactionManagerStrategy = z;
        this.WinterFlowUnitTestResponse = z2;
        this.WinterFlowRouterRouter = iArr;
        this.WinterFlowSyntax = i;
        this.WinterFlowResponseEngine = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowBatchUI(parcel, 1, this.WinterFlowVariableVersionControl, i);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 2, 4);
        parcel.writeInt(this.WinterFlowTransactionManagerStrategy ? 1 : 0);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 3, 4);
        parcel.writeInt(this.WinterFlowUnitTestResponse ? 1 : 0);
        int[] iArr = this.WinterFlowRouterRouter;
        if (iArr != null) {
            int WinterFlowConsumerUserManager2 = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 4);
            parcel.writeIntArray(iArr);
            WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager2);
        }
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 5, 4);
        parcel.writeInt(this.WinterFlowSyntax);
        int[] iArr2 = this.WinterFlowResponseEngine;
        if (iArr2 != null) {
            int WinterFlowConsumerUserManager3 = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 6);
            parcel.writeIntArray(iArr2);
            WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager3);
        }
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
