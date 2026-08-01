package com.google.android.datatransport;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadTransactionManager extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowThreadTransactionManager> CREATOR = new WinterFlowStackFramework(18);
    public final Intent WinterFlowVariableVersionControl;

    public WinterFlowThreadTransactionManager(Intent intent) {
        this.WinterFlowVariableVersionControl = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowBatchUI(parcel, 1, this.WinterFlowVariableVersionControl, i);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
