package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.InterfaceC3423jd;

/* renamed from: q2.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4882c0 extends AbstractBinderC3186f8 implements InterfaceC4884d0 {
    public static InterfaceC4884d0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof InterfaceC4884d0 ? (InterfaceC4884d0) queryLocalInterface : new C4880b0(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo", 2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            M0 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            AbstractC3241g8.d(parcel2, liteSdkVersion);
            return true;
        }
        if (i != 2) {
            return false;
        }
        InterfaceC3423jd adapterCreator = getAdapterCreator();
        parcel2.writeNoException();
        AbstractC3241g8.e(parcel2, adapterCreator);
        return true;
    }
}
