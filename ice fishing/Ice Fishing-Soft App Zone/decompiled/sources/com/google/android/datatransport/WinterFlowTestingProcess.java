package com.google.android.datatransport;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTestingProcess extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowTestingProcess> CREATOR = new WinterFlowStackFramework(15);
    public final GoogleSignInAccount WinterFlowRouterRouter;
    public final Account WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowTestingProcess(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = account;
        this.WinterFlowUnitTestResponse = i2;
        this.WinterFlowRouterRouter = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 1, 4);
        parcel.writeInt(this.WinterFlowVariableVersionControl);
        WinterFlowWorkerVersionControl.WinterFlowBatchUI(parcel, 2, this.WinterFlowTransactionManagerStrategy, i);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 3, 4);
        parcel.writeInt(this.WinterFlowUnitTestResponse);
        WinterFlowWorkerVersionControl.WinterFlowBatchUI(parcel, 4, this.WinterFlowRouterRouter, i);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
