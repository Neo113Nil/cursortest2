package kotlin.text;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class CatchingFishFragmentGlide extends Binder implements CatchingFishMVILifecycle {
    public final Handler CatchingFishEspressoTesting;
    public final /* synthetic */ CatchingFishBundleGlide CatchingFishOkHttp;

    public CatchingFishFragmentGlide(CatchingFishBundleGlide catchingFishBundleGlide) {
        this.CatchingFishOkHttp = catchingFishBundleGlide;
        attachInterface(this, CatchingFishMVILifecycle.CatchingFishSnackbar);
        this.CatchingFishEspressoTesting = new Handler(Looper.getMainLooper());
    }

    public static CatchingFishMVILifecycle CatchingFishParcelableFAB(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(CatchingFishMVILifecycle.CatchingFishSnackbar);
        if (queryLocalInterface != null && (queryLocalInterface instanceof CatchingFishMVILifecycle)) {
            return (CatchingFishMVILifecycle) queryLocalInterface;
        }
        CatchingFishToastRedux catchingFishToastRedux = new CatchingFishToastRedux();
        catchingFishToastRedux.CatchingFishEspressoTesting = iBinder;
        return catchingFishToastRedux;
    }

    @Override // kotlin.text.CatchingFishMVILifecycle
    public final void CatchingFishViewModelScope(Bundle bundle) {
        this.CatchingFishEspressoTesting.post(new CatchingFishGlideWidget(2, bundle, this));
    }

    @Override // kotlin.text.CatchingFishMVILifecycle
    public final void CatchingFishWorkManager(String str, Bundle bundle) {
        this.CatchingFishEspressoTesting.post(new CatchingFishGlideWidget(this, str, bundle, 3));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = CatchingFishMVILifecycle.CatchingFishSnackbar;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        switch (i) {
            case 2:
                this.CatchingFishEspressoTesting.post(new CatchingFishServiceEspresso(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR), this));
                break;
            case 3:
                this.CatchingFishEspressoTesting.post(new CatchingFishGlideWidget(this, parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR), 1));
                break;
            case 4:
                CatchingFishViewModelScope((Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                CatchingFishWorkManager(parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                this.CatchingFishEspressoTesting.post(new CatchingFishGlideWidget(this, parcel.readInt(), (Uri) parcel.readTypedObject(Uri.CREATOR), parcel.readInt() != 0, (Bundle) parcel.readTypedObject(Bundle.CREATOR)));
                break;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                parcel.readString();
                parcel2.writeNoException();
                parcel2.writeTypedObject(null, 1);
                break;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                this.CatchingFishEspressoTesting.post(new CatchingFishGlideWidget(this, parcel.readInt(), parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR)));
                break;
            case 9:
                this.CatchingFishEspressoTesting.post(new CatchingFishGlideWidget(6, (Bundle) parcel.readTypedObject(Bundle.CREATOR), this));
                break;
            case 10:
                this.CatchingFishEspressoTesting.post(new CatchingFishGlideWidget(this, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR)));
                break;
            case 11:
                this.CatchingFishEspressoTesting.post(new CatchingFishGlideWidget(8, (Bundle) parcel.readTypedObject(Bundle.CREATOR), this));
                break;
            case 12:
                this.CatchingFishEspressoTesting.post(new CatchingFishGlideWidget(0, (Bundle) parcel.readTypedObject(Bundle.CREATOR), this));
                break;
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
