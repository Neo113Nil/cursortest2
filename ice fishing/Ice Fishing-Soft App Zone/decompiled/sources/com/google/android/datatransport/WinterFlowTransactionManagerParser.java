package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionManagerParser extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowTransactionManagerParser> CREATOR = new WinterFlowStackFramework(8);
    public List WinterFlowTransactionManagerStrategy;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowTransactionManagerParser(int i, List list) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 1, 4);
        parcel.writeInt(this.WinterFlowVariableVersionControl);
        WinterFlowWorkerVersionControl.WinterFlowMapperProtocol(parcel, 2, this.WinterFlowTransactionManagerStrategy);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
