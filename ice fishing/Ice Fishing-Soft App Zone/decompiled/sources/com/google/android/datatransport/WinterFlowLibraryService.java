package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLibraryService extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowLibraryService> CREATOR = new WinterFlowStackFramework(22);
    public final boolean WinterFlowRouterRouter;
    public final int WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowLibraryService(int i, int i2, int i3, boolean z) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = i3;
        this.WinterFlowRouterRouter = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowLibraryService)) {
            return false;
        }
        WinterFlowLibraryService winterFlowLibraryService = (WinterFlowLibraryService) obj;
        return this.WinterFlowVariableVersionControl == winterFlowLibraryService.WinterFlowVariableVersionControl && this.WinterFlowTransactionManagerStrategy == winterFlowLibraryService.WinterFlowTransactionManagerStrategy && this.WinterFlowUnitTestResponse == winterFlowLibraryService.WinterFlowUnitTestResponse && this.WinterFlowRouterRouter == winterFlowLibraryService.WinterFlowRouterRouter;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.WinterFlowVariableVersionControl), Integer.valueOf(this.WinterFlowTransactionManagerStrategy), Integer.valueOf(this.WinterFlowUnitTestResponse), Boolean.valueOf(this.WinterFlowRouterRouter)});
    }

    public final String toString() {
        int i = this.WinterFlowVariableVersionControl;
        int length = String.valueOf(i).length();
        int i2 = this.WinterFlowTransactionManagerStrategy;
        int length2 = String.valueOf(i2).length();
        int i3 = this.WinterFlowUnitTestResponse;
        int length3 = String.valueOf(i3).length();
        boolean z = this.WinterFlowRouterRouter;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        sb.append("ComplianceOptions{callerProductId=");
        sb.append(i);
        sb.append(", dataOwnerProductId=");
        sb.append(i2);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
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
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 4, 4);
        parcel.writeInt(this.WinterFlowRouterRouter ? 1 : 0);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
