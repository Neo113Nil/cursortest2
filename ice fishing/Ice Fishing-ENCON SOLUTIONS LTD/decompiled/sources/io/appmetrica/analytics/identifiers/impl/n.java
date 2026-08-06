package io.appmetrica.analytics.identifiers.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class n extends Binder implements o {
    public n() {
        attachInterface(this, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
    }

    public static o a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof o)) ? new m(iBinder) : (o) queryLocalInterface;
    }

    public abstract /* synthetic */ String a();

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public abstract /* synthetic */ boolean b();

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            String a2 = a();
            parcel2.writeNoException();
            parcel2.writeString(a2);
            return true;
        }
        if (i2 != 2) {
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return true;
        }
        parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        boolean b2 = b();
        parcel2.writeNoException();
        parcel2.writeInt(b2 ? 1 : 0);
        return true;
    }
}
