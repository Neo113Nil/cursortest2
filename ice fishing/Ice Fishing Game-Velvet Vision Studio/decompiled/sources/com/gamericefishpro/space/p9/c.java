package com.gamericefishpro.space.p9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.gamericefishpro.space.o4.i;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends Binder implements d, IInterface {
    public c() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 3:
                com.gamericefishpro.space.f9.b.b(parcel);
                break;
            case 4:
                com.gamericefishpro.space.f9.b.b(parcel);
                break;
            case i.STRING_FIELD_NUMBER /* 5 */:
            default:
                return false;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.f9.b.b(parcel);
                break;
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                com.gamericefishpro.space.f9.b.b(parcel);
                break;
            case i.BYTES_FIELD_NUMBER /* 8 */:
                g gVar = (g) com.gamericefishpro.space.f9.b.a(parcel, g.CREATOR);
                com.gamericefishpro.space.f9.b.b(parcel);
                a(gVar);
                break;
            case 9:
                com.gamericefishpro.space.f9.b.b(parcel);
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
