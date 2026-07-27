package c3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class g extends Binder implements IInterface {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5565n;

    public g(String str, int i) {
        this.f5565n = i;
        switch (i) {
            case 1:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    public boolean S(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f5565n;
        return this;
    }

    public abstract boolean e0(Parcel parcel, int i);

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i6) {
        switch (this.f5565n) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i6)) {
                    return true;
                }
                return S(i, parcel, parcel2);
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i6)) {
                    return true;
                }
                return e0(parcel, i);
        }
    }
}
