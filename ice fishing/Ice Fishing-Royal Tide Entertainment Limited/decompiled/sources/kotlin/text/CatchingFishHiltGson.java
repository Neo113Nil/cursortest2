package kotlin.text;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishHiltGson implements Parcelable {
    public static final Parcelable.Creator<CatchingFishHiltGson> CREATOR = new CatchingFishSnackbarPayPal(8);
    public final int CatchingFishAnimationMockk;
    public final boolean CatchingFishCloudMessaging;
    public final String CatchingFishDaggerWebsocket;
    public final boolean CatchingFishEspressoTesting;
    public final boolean CatchingFishFragmentHandler;
    public final String CatchingFishLayout;
    public final Bundle CatchingFishOkHttp;
    public final String CatchingFishReduxKtor;
    public Bundle CatchingFishStateLiveData;
    public final boolean CatchingFishUnitTesting;
    public final int CatchingFishViewModelFAB;
    public final int CatchingFishViewModelScope;
    public final boolean CatchingFishWorkManager;

    public CatchingFishHiltGson(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        this.CatchingFishReduxKtor = catchingFishGoogleMapsMoshi.getClass().getName();
        this.CatchingFishDaggerWebsocket = catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB;
        this.CatchingFishWorkManager = catchingFishGoogleMapsMoshi.CatchingFishStateLiveData;
        this.CatchingFishViewModelScope = catchingFishGoogleMapsMoshi.CatchingFishGsonAppCompat;
        this.CatchingFishViewModelFAB = catchingFishGoogleMapsMoshi.CatchingFishCardViewRealm;
        this.CatchingFishLayout = catchingFishGoogleMapsMoshi.CatchingFishPayPal;
        this.CatchingFishFragmentHandler = catchingFishGoogleMapsMoshi.CatchingFishCustomView;
        this.CatchingFishCloudMessaging = catchingFishGoogleMapsMoshi.CatchingFishAnimationMockk;
        this.CatchingFishEspressoTesting = catchingFishGoogleMapsMoshi.CatchingFishMVPRobolectric;
        this.CatchingFishOkHttp = catchingFishGoogleMapsMoshi.CatchingFishLayout;
        this.CatchingFishUnitTesting = catchingFishGoogleMapsMoshi.CatchingFishCardViewView;
        this.CatchingFishAnimationMockk = catchingFishGoogleMapsMoshi.CatchingFishGradleManifest.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.CatchingFishReduxKtor);
        sb.append(" (");
        sb.append(this.CatchingFishDaggerWebsocket);
        sb.append(")}:");
        if (this.CatchingFishWorkManager) {
            sb.append(" fromLayout");
        }
        int i = this.CatchingFishViewModelFAB;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.CatchingFishLayout;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.CatchingFishFragmentHandler) {
            sb.append(" retainInstance");
        }
        if (this.CatchingFishCloudMessaging) {
            sb.append(" removing");
        }
        if (this.CatchingFishEspressoTesting) {
            sb.append(" detached");
        }
        if (this.CatchingFishUnitTesting) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.CatchingFishReduxKtor);
        parcel.writeString(this.CatchingFishDaggerWebsocket);
        parcel.writeInt(this.CatchingFishWorkManager ? 1 : 0);
        parcel.writeInt(this.CatchingFishViewModelScope);
        parcel.writeInt(this.CatchingFishViewModelFAB);
        parcel.writeString(this.CatchingFishLayout);
        parcel.writeInt(this.CatchingFishFragmentHandler ? 1 : 0);
        parcel.writeInt(this.CatchingFishCloudMessaging ? 1 : 0);
        parcel.writeInt(this.CatchingFishEspressoTesting ? 1 : 0);
        parcel.writeBundle(this.CatchingFishOkHttp);
        parcel.writeInt(this.CatchingFishUnitTesting ? 1 : 0);
        parcel.writeBundle(this.CatchingFishStateLiveData);
        parcel.writeInt(this.CatchingFishAnimationMockk);
    }

    public CatchingFishHiltGson(Parcel parcel) {
        this.CatchingFishReduxKtor = parcel.readString();
        this.CatchingFishDaggerWebsocket = parcel.readString();
        this.CatchingFishWorkManager = parcel.readInt() != 0;
        this.CatchingFishViewModelScope = parcel.readInt();
        this.CatchingFishViewModelFAB = parcel.readInt();
        this.CatchingFishLayout = parcel.readString();
        this.CatchingFishFragmentHandler = parcel.readInt() != 0;
        this.CatchingFishCloudMessaging = parcel.readInt() != 0;
        this.CatchingFishEspressoTesting = parcel.readInt() != 0;
        this.CatchingFishOkHttp = parcel.readBundle();
        this.CatchingFishUnitTesting = parcel.readInt() != 0;
        this.CatchingFishStateLiveData = parcel.readBundle();
        this.CatchingFishAnimationMockk = parcel.readInt();
    }
}
