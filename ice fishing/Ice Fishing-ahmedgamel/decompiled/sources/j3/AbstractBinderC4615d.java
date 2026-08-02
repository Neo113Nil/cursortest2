package j3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: j3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4615d extends Binder implements InterfaceC4616e, IInterface {
    public AbstractBinderC4615d() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i4) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i4)) {
            return true;
        }
        switch (i) {
            case 3:
                break;
            case 4:
                break;
            case 5:
            default:
                return false;
            case 6:
                break;
            case 7:
                break;
            case 8:
                M1((C4619h) c3.b.a(parcel, C4619h.CREATOR));
                break;
            case 9:
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
