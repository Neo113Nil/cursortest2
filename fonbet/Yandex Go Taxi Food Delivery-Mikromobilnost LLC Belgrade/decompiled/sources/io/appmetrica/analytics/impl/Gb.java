package io.appmetrica.analytics.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public abstract class Gb extends Binder implements Hb {
    public Gb() {
        attachInterface(this, "ru.vk.store.sdk.install.referrer.GetInstallReferrerCallback");
    }

    public static Hb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.sdk.install.referrer.GetInstallReferrerCallback");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof Hb)) ? new Fb(iBinder) : (Hb) queryLocalInterface;
    }

    public abstract /* synthetic */ void a(int i, String str) throws RemoteException;

    public abstract /* synthetic */ void a(String str) throws RemoteException;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("ru.vk.store.sdk.install.referrer.GetInstallReferrerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("ru.vk.store.sdk.install.referrer.GetInstallReferrerCallback");
            return true;
        }
        if (i == 1) {
            a(parcel.readString());
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            a(parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
        }
        return true;
    }
}
