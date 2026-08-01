package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEventProtocol extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowEventProtocol> CREATOR = WinterFlowStackFramework.WinterFlowHookDataSource;
    public static final WinterFlowEventProtocol WinterFlowRouterRouter;
    public final boolean WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse;
    public final WinterFlowLibraryService WinterFlowVariableVersionControl;

    static {
        WinterFlowEventProtocol winterFlowEventProtocol = new WinterFlowEventProtocol(null, false);
        winterFlowEventProtocol.WinterFlowUnitTestResponse = false;
        WinterFlowRouterRouter = winterFlowEventProtocol;
    }

    public WinterFlowEventProtocol(WinterFlowLibraryService winterFlowLibraryService, boolean z) {
        this.WinterFlowVariableVersionControl = winterFlowLibraryService;
        this.WinterFlowTransactionManagerStrategy = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowEventProtocol)) {
            return false;
        }
        WinterFlowEventProtocol winterFlowEventProtocol = (WinterFlowEventProtocol) obj;
        return WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowVariableVersionControl, winterFlowEventProtocol.WinterFlowVariableVersionControl) && this.WinterFlowUnitTestResponse == winterFlowEventProtocol.WinterFlowUnitTestResponse && this.WinterFlowTransactionManagerStrategy == winterFlowEventProtocol.WinterFlowTransactionManagerStrategy;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.WinterFlowVariableVersionControl, Boolean.valueOf(this.WinterFlowUnitTestResponse), Boolean.valueOf(this.WinterFlowTransactionManagerStrategy)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.WinterFlowVariableVersionControl);
        StringBuilder sb = new StringBuilder(valueOf.length() + 31);
        sb.append("ApiMetadata(complianceOptions=");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.WinterFlowUnitTestResponse) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowBatchUI(parcel, 1, this.WinterFlowVariableVersionControl, i);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 2, 4);
        parcel.writeInt(this.WinterFlowTransactionManagerStrategy ? 1 : 0);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
