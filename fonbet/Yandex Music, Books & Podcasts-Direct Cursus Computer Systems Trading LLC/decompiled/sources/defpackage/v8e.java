package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class v8e implements x8e {
    public IBinder a;

    @Override // defpackage.x8e
    public final void B(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i);
            if (!this.a.transact(12, obtain, null, 1)) {
                int i2 = mkh.h;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.x8e
    public final void b(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i);
            if (!this.a.transact(9, obtain, null, 1)) {
                int i2 = mkh.h;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.x8e
    public final void f(i6l i6lVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            i6lVar.writeToParcel(obtain, 0);
            if (!this.a.transact(3, obtain, null, 1)) {
                int i = mkh.h;
            }
        } finally {
            obtain.recycle();
        }
    }
}
