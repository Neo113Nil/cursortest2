package e7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class d extends Binder implements e, IInterface {
    public d() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        switch (i10) {
            case 3:
                y6.b.b(parcel);
                break;
            case 4:
                y6.b.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                y6.b.b(parcel);
                break;
            case 7:
                y6.b.b(parcel);
                break;
            case 8:
                h hVar = (h) y6.b.a(parcel, h.CREATOR);
                y6.b.b(parcel);
                a(hVar);
                break;
            case 9:
                y6.b.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
