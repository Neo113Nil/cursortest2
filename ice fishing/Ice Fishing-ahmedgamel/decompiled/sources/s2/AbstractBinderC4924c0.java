package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3359i8;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.InterfaceC3595md;

/* renamed from: s2.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4924c0 extends AbstractBinderC3359i8 implements InterfaceC4926d0 {
    public static InterfaceC4926d0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof InterfaceC4926d0 ? (InterfaceC4926d0) queryLocalInterface : new C4922b0(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo", 1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            M0 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            AbstractC3411j8.d(parcel2, liteSdkVersion);
            return true;
        }
        if (i != 2) {
            return false;
        }
        InterfaceC3595md adapterCreator = getAdapterCreator();
        parcel2.writeNoException();
        AbstractC3411j8.e(parcel2, adapterCreator);
        return true;
    }
}
