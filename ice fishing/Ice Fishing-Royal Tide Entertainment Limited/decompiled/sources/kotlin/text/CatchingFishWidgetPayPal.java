package kotlin.text;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class CatchingFishWidgetPayPal extends Binder implements CatchingFishMVPBundleMockk {
    public final /* synthetic */ MultiInstanceInvalidationService CatchingFishEspressoTesting;

    public CatchingFishWidgetPayPal(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.CatchingFishEspressoTesting = multiInstanceInvalidationService;
        attachInterface(this, CatchingFishMVPBundleMockk.CatchingFishWorkManager);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = CatchingFishMVPBundleMockk.CatchingFishWorkManager;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        CatchingFishPayPalFluxGlide catchingFishPayPalFluxGlide = null;
        CatchingFishPayPalFluxGlide catchingFishPayPalFluxGlide2 = null;
        int i3 = 0;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(CatchingFishPayPalFluxGlide.CatchingFishDaggerWebsocket);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof CatchingFishPayPalFluxGlide)) {
                    CatchingFishEspressoGlide catchingFishEspressoGlide = new CatchingFishEspressoGlide();
                    catchingFishEspressoGlide.CatchingFishEspressoTesting = readStrongBinder;
                    catchingFishPayPalFluxGlide = catchingFishEspressoGlide;
                } else {
                    catchingFishPayPalFluxGlide = (CatchingFishPayPalFluxGlide) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishPayPalFluxGlide, "callback");
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.CatchingFishEspressoTesting;
                synchronized (multiInstanceInvalidationService.CatchingFishWorkManager) {
                    try {
                        int i4 = multiInstanceInvalidationService.CatchingFishReduxKtor + 1;
                        multiInstanceInvalidationService.CatchingFishReduxKtor = i4;
                        if (multiInstanceInvalidationService.CatchingFishWorkManager.register(catchingFishPayPalFluxGlide, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.CatchingFishDaggerWebsocket.put(Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.CatchingFishReduxKtor--;
                        }
                    } finally {
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(CatchingFishPayPalFluxGlide.CatchingFishDaggerWebsocket);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof CatchingFishPayPalFluxGlide)) {
                    CatchingFishEspressoGlide catchingFishEspressoGlide2 = new CatchingFishEspressoGlide();
                    catchingFishEspressoGlide2.CatchingFishEspressoTesting = readStrongBinder2;
                    catchingFishPayPalFluxGlide2 = catchingFishEspressoGlide2;
                } else {
                    catchingFishPayPalFluxGlide2 = (CatchingFishPayPalFluxGlide) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishPayPalFluxGlide2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.CatchingFishEspressoTesting;
            synchronized (multiInstanceInvalidationService2.CatchingFishWorkManager) {
                multiInstanceInvalidationService2.CatchingFishWorkManager.unregister(catchingFishPayPalFluxGlide2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int readInt2 = parcel.readInt();
        String[] createStringArray = parcel.createStringArray();
        CatchingFishFirebaseDagger.CatchingFishNavigation(createStringArray, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.CatchingFishEspressoTesting;
        synchronized (multiInstanceInvalidationService3.CatchingFishWorkManager) {
            try {
                String str2 = (String) multiInstanceInvalidationService3.CatchingFishDaggerWebsocket.get(Integer.valueOf(readInt2));
                if (str2 != null) {
                    int beginBroadcast = multiInstanceInvalidationService3.CatchingFishWorkManager.beginBroadcast();
                    while (i3 < beginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.CatchingFishWorkManager.getBroadcastCookie(i3);
                            CatchingFishFirebaseDagger.CatchingFishStateLiveData(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.CatchingFishDaggerWebsocket.get(num);
                            if (readInt2 != intValue && str2.equals(str3)) {
                                try {
                                    ((CatchingFishEspressoGlide) ((CatchingFishPayPalFluxGlide) multiInstanceInvalidationService3.CatchingFishWorkManager.getBroadcastItem(i3))).CatchingFishParcelableFAB(createStringArray);
                                } catch (RemoteException unused) {
                                }
                            }
                            i3++;
                        } finally {
                            multiInstanceInvalidationService3.CatchingFishWorkManager.finishBroadcast();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
