package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishViewUnitTesting implements Parcelable {
    public static final Parcelable.Creator<CatchingFishViewUnitTesting> CREATOR = new CatchingFishSnackbarPayPal(2);
    public final ArrayList CatchingFishAnimationMockk;
    public final int CatchingFishCloudMessaging;
    public final ArrayList CatchingFishDaggerWebsocket;
    public final CharSequence CatchingFishEspressoTesting;
    public final int CatchingFishFragmentHandler;
    public final String CatchingFishLayout;
    public final int CatchingFishOkHttp;
    public final int[] CatchingFishReduxKtor;
    public final boolean CatchingFishRoomDatabase;
    public final ArrayList CatchingFishStateLiveData;
    public final CharSequence CatchingFishUnitTesting;
    public final int CatchingFishViewModelFAB;
    public final int[] CatchingFishViewModelScope;
    public final int[] CatchingFishWorkManager;

    public CatchingFishViewUnitTesting(CatchingFishCameraXEspresso catchingFishCameraXEspresso) {
        int size = catchingFishCameraXEspresso.CatchingFishParcelableFAB.size();
        this.CatchingFishReduxKtor = new int[size * 6];
        if (!catchingFishCameraXEspresso.CatchingFishViewModelScope) {
            throw new IllegalStateException("Not on back stack");
        }
        this.CatchingFishDaggerWebsocket = new ArrayList(size);
        this.CatchingFishWorkManager = new int[size];
        this.CatchingFishViewModelScope = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            CatchingFishPicassoFAB catchingFishPicassoFAB = (CatchingFishPicassoFAB) catchingFishCameraXEspresso.CatchingFishParcelableFAB.get(i2);
            int i3 = i + 1;
            this.CatchingFishReduxKtor[i] = catchingFishPicassoFAB.CatchingFishParcelableFAB;
            ArrayList arrayList = this.CatchingFishDaggerWebsocket;
            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishPicassoFAB.CatchingFishSnackbar;
            arrayList.add(catchingFishGoogleMapsMoshi != null ? catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB : null);
            int[] iArr = this.CatchingFishReduxKtor;
            iArr[i3] = catchingFishPicassoFAB.CatchingFishCoroutine ? 1 : 0;
            iArr[i + 2] = catchingFishPicassoFAB.CatchingFishReduxKtor;
            iArr[i + 3] = catchingFishPicassoFAB.CatchingFishDaggerWebsocket;
            int i4 = i + 5;
            iArr[i + 4] = catchingFishPicassoFAB.CatchingFishWorkManager;
            i += 6;
            iArr[i4] = catchingFishPicassoFAB.CatchingFishViewModelScope;
            this.CatchingFishWorkManager[i2] = catchingFishPicassoFAB.CatchingFishViewModelFAB.ordinal();
            this.CatchingFishViewModelScope[i2] = catchingFishPicassoFAB.CatchingFishLayout.ordinal();
        }
        this.CatchingFishViewModelFAB = catchingFishCameraXEspresso.CatchingFishWorkManager;
        this.CatchingFishLayout = catchingFishCameraXEspresso.CatchingFishViewModelFAB;
        this.CatchingFishFragmentHandler = catchingFishCameraXEspresso.CatchingFishNavigation;
        this.CatchingFishCloudMessaging = catchingFishCameraXEspresso.CatchingFishLayout;
        this.CatchingFishEspressoTesting = catchingFishCameraXEspresso.CatchingFishFragmentHandler;
        this.CatchingFishOkHttp = catchingFishCameraXEspresso.CatchingFishCloudMessaging;
        this.CatchingFishUnitTesting = catchingFishCameraXEspresso.CatchingFishEspressoTesting;
        this.CatchingFishAnimationMockk = catchingFishCameraXEspresso.CatchingFishOkHttp;
        this.CatchingFishStateLiveData = catchingFishCameraXEspresso.CatchingFishUnitTesting;
        this.CatchingFishRoomDatabase = catchingFishCameraXEspresso.CatchingFishAnimationMockk;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.CatchingFishReduxKtor);
        parcel.writeStringList(this.CatchingFishDaggerWebsocket);
        parcel.writeIntArray(this.CatchingFishWorkManager);
        parcel.writeIntArray(this.CatchingFishViewModelScope);
        parcel.writeInt(this.CatchingFishViewModelFAB);
        parcel.writeString(this.CatchingFishLayout);
        parcel.writeInt(this.CatchingFishFragmentHandler);
        parcel.writeInt(this.CatchingFishCloudMessaging);
        TextUtils.writeToParcel(this.CatchingFishEspressoTesting, parcel, 0);
        parcel.writeInt(this.CatchingFishOkHttp);
        TextUtils.writeToParcel(this.CatchingFishUnitTesting, parcel, 0);
        parcel.writeStringList(this.CatchingFishAnimationMockk);
        parcel.writeStringList(this.CatchingFishStateLiveData);
        parcel.writeInt(this.CatchingFishRoomDatabase ? 1 : 0);
    }

    public CatchingFishViewUnitTesting(Parcel parcel) {
        this.CatchingFishReduxKtor = parcel.createIntArray();
        this.CatchingFishDaggerWebsocket = parcel.createStringArrayList();
        this.CatchingFishWorkManager = parcel.createIntArray();
        this.CatchingFishViewModelScope = parcel.createIntArray();
        this.CatchingFishViewModelFAB = parcel.readInt();
        this.CatchingFishLayout = parcel.readString();
        this.CatchingFishFragmentHandler = parcel.readInt();
        this.CatchingFishCloudMessaging = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.CatchingFishEspressoTesting = (CharSequence) creator.createFromParcel(parcel);
        this.CatchingFishOkHttp = parcel.readInt();
        this.CatchingFishUnitTesting = (CharSequence) creator.createFromParcel(parcel);
        this.CatchingFishAnimationMockk = parcel.createStringArrayList();
        this.CatchingFishStateLiveData = parcel.createStringArrayList();
        this.CatchingFishRoomDatabase = parcel.readInt() != 0;
    }
}
