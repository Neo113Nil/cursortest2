package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.InterfaceC3572md;

/* renamed from: q2.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4875c0 extends AbstractBinderC3336i8 implements InterfaceC4877d0 {
    public static InterfaceC4877d0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof InterfaceC4877d0 ? (InterfaceC4877d0) queryLocalInterface : new C4873b0(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo", 2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            M0 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            AbstractC3388j8.d(parcel2, liteSdkVersion);
            return true;
        }
        if (i != 2) {
            return false;
        }
        InterfaceC3572md adapterCreator = getAdapterCreator();
        parcel2.writeNoException();
        AbstractC3388j8.e(parcel2, adapterCreator);
        return true;
    }
}
