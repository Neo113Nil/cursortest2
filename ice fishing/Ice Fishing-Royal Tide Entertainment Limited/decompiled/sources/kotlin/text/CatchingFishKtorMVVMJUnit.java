package kotlin.text;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public abstract class CatchingFishKtorMVVMJUnit extends Binder implements IInterface {
    public final /* synthetic */ int CatchingFishEspressoTesting = 0;

    public /* synthetic */ CatchingFishKtorMVVMJUnit() {
    }

    public boolean CatchingFishLayout(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.CatchingFishEspressoTesting;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.CatchingFishEspressoTesting) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                switch (i) {
                    case 3:
                        CatchingFishKtorEspresso.CatchingFishSnackbar(parcel);
                        break;
                    case 4:
                        CatchingFishKtorEspresso.CatchingFishSnackbar(parcel);
                        break;
                    case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                    default:
                        return false;
                    case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                        CatchingFishKtorEspresso.CatchingFishSnackbar(parcel);
                        break;
                    case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                        CatchingFishKtorEspresso.CatchingFishSnackbar(parcel);
                        break;
                    case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                        CatchingFishHiltGlideFlux catchingFishHiltGlideFlux = (CatchingFishHiltGlideFlux) CatchingFishKtorEspresso.CatchingFishParcelableFAB(parcel, CatchingFishHiltGlideFlux.CREATOR);
                        CatchingFishKtorEspresso.CatchingFishSnackbar(parcel);
                        CatchingFishRobolectricMVI catchingFishRobolectricMVI = (CatchingFishRobolectricMVI) this;
                        catchingFishRobolectricMVI.CatchingFishUnitTesting.post(new CatchingFishGsonRealmMoshi(3, catchingFishRobolectricMVI, catchingFishHiltGlideFlux));
                        break;
                    case 9:
                        CatchingFishKtorEspresso.CatchingFishSnackbar(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return CatchingFishLayout(i, parcel, parcel2);
        }
    }

    public CatchingFishKtorMVVMJUnit(String str) {
        attachInterface(this, str);
    }
}
