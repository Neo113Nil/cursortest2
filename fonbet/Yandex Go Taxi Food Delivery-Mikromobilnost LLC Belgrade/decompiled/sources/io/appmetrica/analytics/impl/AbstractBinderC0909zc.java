package io.appmetrica.analytics.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: io.appmetrica.analytics.impl.zc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC0909zc extends Binder implements Ac {
    public AbstractBinderC0909zc() {
        attachInterface(this, "ru.vk.store.sdk.install.referrer.InstallReferrerProvider");
    }

    public static Ac a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.sdk.install.referrer.InstallReferrerProvider");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof Ac)) ? new C0880yc(iBinder) : (Ac) queryLocalInterface;
    }

    public abstract /* synthetic */ void a(String str, Hb hb) throws RemoteException;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("ru.vk.store.sdk.install.referrer.InstallReferrerProvider");
        }
        if (i == 1598968902) {
            parcel2.writeString("ru.vk.store.sdk.install.referrer.InstallReferrerProvider");
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        a(parcel.readString(), Gb.a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
