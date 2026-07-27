package kotlin.text;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class CatchingFishAsyncTaskPayPal extends Binder implements CatchingFishMVPSpannable {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = CatchingFishMVPSpannable.CatchingFishViewModelScope;
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
        if (i == 2) {
            CatchingFishFragmentGlide.CatchingFishParcelableFAB(parcel.readStrongBinder()).CatchingFishViewModelScope((Bundle) parcel.readTypedObject(Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        CatchingFishFragmentGlide.CatchingFishParcelableFAB(parcel.readStrongBinder()).CatchingFishWorkManager(parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
