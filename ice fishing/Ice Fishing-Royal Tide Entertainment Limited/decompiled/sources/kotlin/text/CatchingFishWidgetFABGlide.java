package kotlin.text;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class CatchingFishWidgetFABGlide extends CatchingFishViewStateFlow {
    public static final Parcelable.Creator<CatchingFishWidgetFABGlide> CREATOR = new CatchingFishSnackbarPayPal(28);
    public final IBinder CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;
    public final boolean CatchingFishViewModelFAB;
    public final boolean CatchingFishViewModelScope;
    public final ConnectionResult CatchingFishWorkManager;

    public CatchingFishWidgetFABGlide(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = iBinder;
        this.CatchingFishWorkManager = connectionResult;
        this.CatchingFishViewModelScope = z;
        this.CatchingFishViewModelFAB = z2;
    }

    public final boolean equals(Object obj) {
        Object catchingFishToastGsonFlux;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishWidgetFABGlide)) {
            return false;
        }
        CatchingFishWidgetFABGlide catchingFishWidgetFABGlide = (CatchingFishWidgetFABGlide) obj;
        if (!this.CatchingFishWorkManager.equals(catchingFishWidgetFABGlide.CatchingFishWorkManager)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.CatchingFishDaggerWebsocket;
        if (iBinder == null) {
            catchingFishToastGsonFlux = null;
        } else {
            int i = CatchingFishExoPlayer.CatchingFishOkHttp;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            catchingFishToastGsonFlux = queryLocalInterface instanceof CatchingFishCoroutineFlux ? (CatchingFishCoroutineFlux) queryLocalInterface : new CatchingFishToastGsonFlux(iBinder);
        }
        IBinder iBinder2 = catchingFishWidgetFABGlide.CatchingFishDaggerWebsocket;
        if (iBinder2 != null) {
            int i2 = CatchingFishExoPlayer.CatchingFishOkHttp;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof CatchingFishCoroutineFlux ? (CatchingFishCoroutineFlux) queryLocalInterface2 : new CatchingFishToastGsonFlux(iBinder2);
        }
        return CatchingFishLayoutRoom.CatchingFishOkHttp(catchingFishToastGsonFlux, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 1, 4);
        parcel.writeInt(this.CatchingFishReduxKtor);
        IBinder iBinder = this.CatchingFishDaggerWebsocket;
        if (iBinder != null) {
            int CatchingFishJobScheduler2 = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler2);
        }
        CatchingFishViewMVIMVVM.CatchingFishCardViewRealm(parcel, 3, this.CatchingFishWorkManager, i);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 4, 4);
        parcel.writeInt(this.CatchingFishViewModelScope ? 1 : 0);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 5, 4);
        parcel.writeInt(this.CatchingFishViewModelFAB ? 1 : 0);
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }
}
