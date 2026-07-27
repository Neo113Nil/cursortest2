package kotlin.text;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.content.UnusedAppRestrictionsBackportService;

/* loaded from: classes.dex */
public final class CatchingFishKtorJUnitJUnit extends Binder implements CatchingFishMVVMUnitTesting {
    public final /* synthetic */ UnusedAppRestrictionsBackportService CatchingFishEspressoTesting;

    public CatchingFishKtorJUnitJUnit(UnusedAppRestrictionsBackportService unusedAppRestrictionsBackportService) {
        this.CatchingFishEspressoTesting = unusedAppRestrictionsBackportService;
        attachInterface(this, CatchingFishMVVMUnitTesting.CatchingFishCloudMessaging);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        CatchingFishMVIContextMVVM catchingFishMVIContextMVVM;
        String str = CatchingFishMVVMUnitTesting.CatchingFishCloudMessaging;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            catchingFishMVIContextMVVM = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(CatchingFishMVIContextMVVM.CatchingFishFragmentHandler);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof CatchingFishMVIContextMVVM)) {
                CatchingFishFABFAB catchingFishFABFAB = new CatchingFishFABFAB();
                catchingFishFABFAB.CatchingFishEspressoTesting = readStrongBinder;
                catchingFishMVIContextMVVM = catchingFishFABFAB;
            } else {
                catchingFishMVIContextMVVM = (CatchingFishMVIContextMVVM) queryLocalInterface;
            }
        }
        if (catchingFishMVIContextMVVM == null) {
            return true;
        }
        this.CatchingFishEspressoTesting.CatchingFishParcelableFAB();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
