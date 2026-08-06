package io.appmetrica.analytics.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class b implements IAppMetricaService {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f7292a;

    public b(IBinder iBinder) {
        this.f7292a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7292a;
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IAppMetricaService.DESCRIPTOR);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f7292a.transact(2, obtain, null, 1);
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IAppMetricaService.DESCRIPTOR);
            obtain.writeInt(i2);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f7292a.transact(3, obtain, null, 1);
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IAppMetricaService.DESCRIPTOR);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f7292a.transact(1, obtain, null, 1);
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
