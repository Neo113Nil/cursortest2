package kotlin.text;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class CatchingFishToastRedux implements CatchingFishMVILifecycle {
    public IBinder CatchingFishEspressoTesting;

    @Override // kotlin.text.CatchingFishMVILifecycle
    public final void CatchingFishViewModelScope(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(CatchingFishMVILifecycle.CatchingFishSnackbar);
            obtain.writeTypedObject(bundle, 0);
            if (!this.CatchingFishEspressoTesting.transact(4, obtain, obtain2, 0)) {
                throw new RemoteException("Method onMessageChannelReady is unimplemented.");
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // kotlin.text.CatchingFishMVILifecycle
    public final void CatchingFishWorkManager(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(CatchingFishMVILifecycle.CatchingFishSnackbar);
            obtain.writeString(str);
            obtain.writeTypedObject(bundle, 0);
            if (!this.CatchingFishEspressoTesting.transact(5, obtain, obtain2, 0)) {
                throw new RemoteException("Method onPostMessage is unimplemented.");
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.CatchingFishEspressoTesting;
    }
}
