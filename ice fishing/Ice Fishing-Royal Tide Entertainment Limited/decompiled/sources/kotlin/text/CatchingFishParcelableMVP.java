package kotlin.text;

import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class CatchingFishParcelableMVP extends CatchingFishIntentKtor {
    public int CatchingFishCloudMessaging;
    public final Parcel CatchingFishDaggerWebsocket;
    public int CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public final SparseIntArray CatchingFishReduxKtor;
    public final String CatchingFishViewModelFAB;
    public final int CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    public CatchingFishParcelableMVP(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new CatchingFishCameraXRetrofit(0), new CatchingFishCameraXRetrofit(0), new CatchingFishCameraXRetrofit(0));
    }

    @Override // kotlin.text.CatchingFishIntentKtor
    public final boolean CatchingFishDaggerWebsocket(int i) {
        while (this.CatchingFishFragmentHandler < this.CatchingFishViewModelScope) {
            int i2 = this.CatchingFishCloudMessaging;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.CatchingFishFragmentHandler;
            Parcel parcel = this.CatchingFishDaggerWebsocket;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.CatchingFishCloudMessaging = parcel.readInt();
            this.CatchingFishFragmentHandler += readInt;
        }
        return this.CatchingFishCloudMessaging == i;
    }

    @Override // kotlin.text.CatchingFishIntentKtor
    public final CatchingFishParcelableMVP CatchingFishParcelableFAB() {
        Parcel parcel = this.CatchingFishDaggerWebsocket;
        int dataPosition = parcel.dataPosition();
        int i = this.CatchingFishFragmentHandler;
        if (i == this.CatchingFishWorkManager) {
            i = this.CatchingFishViewModelScope;
        }
        return new CatchingFishParcelableMVP(parcel, dataPosition, i, CatchingFishMVPLiveData.CatchingFishStateLiveData(new StringBuilder(), this.CatchingFishViewModelFAB, "  "), this.CatchingFishParcelableFAB, this.CatchingFishSnackbar, this.CatchingFishCoroutine);
    }

    @Override // kotlin.text.CatchingFishIntentKtor
    public final void CatchingFishViewModelFAB(int i) {
        int i2 = this.CatchingFishLayout;
        SparseIntArray sparseIntArray = this.CatchingFishReduxKtor;
        Parcel parcel = this.CatchingFishDaggerWebsocket;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.CatchingFishLayout = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public CatchingFishParcelableMVP(Parcel parcel, int i, int i2, String str, CatchingFishCameraXRetrofit catchingFishCameraXRetrofit, CatchingFishCameraXRetrofit catchingFishCameraXRetrofit2, CatchingFishCameraXRetrofit catchingFishCameraXRetrofit3) {
        super(catchingFishCameraXRetrofit, catchingFishCameraXRetrofit2, catchingFishCameraXRetrofit3);
        this.CatchingFishReduxKtor = new SparseIntArray();
        this.CatchingFishLayout = -1;
        this.CatchingFishCloudMessaging = -1;
        this.CatchingFishDaggerWebsocket = parcel;
        this.CatchingFishWorkManager = i;
        this.CatchingFishViewModelScope = i2;
        this.CatchingFishFragmentHandler = i;
        this.CatchingFishViewModelFAB = str;
    }
}
