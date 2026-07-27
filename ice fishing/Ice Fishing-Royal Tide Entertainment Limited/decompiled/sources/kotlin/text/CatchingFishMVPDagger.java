package kotlin.text;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class CatchingFishMVPDagger extends CatchingFishViewStateFlow {
    public static final Parcelable.Creator<CatchingFishMVPDagger> CREATOR = new CatchingFishSnackbarPayPal(27);
    public final Account CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;
    public final GoogleSignInAccount CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    public CatchingFishMVPDagger(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = account;
        this.CatchingFishWorkManager = i2;
        this.CatchingFishViewModelScope = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 1, 4);
        parcel.writeInt(this.CatchingFishReduxKtor);
        CatchingFishViewMVIMVVM.CatchingFishCardViewRealm(parcel, 2, this.CatchingFishDaggerWebsocket, i);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 3, 4);
        parcel.writeInt(this.CatchingFishWorkManager);
        CatchingFishViewMVIMVVM.CatchingFishCardViewRealm(parcel, 4, this.CatchingFishViewModelScope, i);
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }
}
