package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResolverTesting extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowResolverTesting> CREATOR = new WinterFlowStackFramework(12);
    public final String WinterFlowTransactionManagerStrategy;
    public final List WinterFlowVariableVersionControl;

    public WinterFlowResolverTesting(String str, ArrayList arrayList) {
        this.WinterFlowVariableVersionControl = arrayList;
        this.WinterFlowTransactionManagerStrategy = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        List<String> list = this.WinterFlowVariableVersionControl;
        if (list != null) {
            int WinterFlowConsumerUserManager2 = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 1);
            parcel.writeStringList(list);
            WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager2);
        }
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 2, this.WinterFlowTransactionManagerStrategy);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
