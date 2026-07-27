package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.i8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3336i8 extends Binder implements IInterface {
    public AbstractBinderC3336i8(String str) {
        attachInterface(this, str);
    }

    public abstract boolean T3(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i6) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i6)) {
            return true;
        }
        return T3(i, parcel, parcel2);
    }
}
