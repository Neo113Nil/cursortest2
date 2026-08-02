package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class t8e implements u8e {
    public IBinder a;

    @Override // defpackage.u8e
    public final void C0(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            zc4.l0(obtain, bundle);
            this.a.transact(3012, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.u8e
    public final void D0(List list, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            zc4.o(obtain, list);
            this.a.transact(3004, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.u8e
    public final void E0(int i, Bundle bundle, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            zc4.l0(obtain, bundle);
            obtain.writeInt(z ? 1 : 0);
            this.a.transact(3007, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.u8e
    public final void S(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            zc4.l0(obtain, bundle);
            this.a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.u8e
    public final void a(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            this.a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.u8e
    public final void d() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(0);
            this.a.transact(3006, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.u8e
    public final void d0(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            zc4.l0(obtain, bundle);
            this.a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.u8e
    public final void e0(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            zc4.l0(obtain, bundle);
            this.a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.u8e
    public final void f0(int i, Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = Bundle.EMPTY;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            zc4.l0(obtain, bundle);
            zc4.l0(obtain, bundle3);
            this.a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.u8e
    public final void h(List list, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            zc4.o(obtain, list);
            this.a.transact(3016, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.u8e
    public final void h0(int i, Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            zc4.l0(obtain, bundle);
            zc4.l0(obtain, bundle2);
            this.a.transact(3013, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.u8e
    public final void k(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            zc4.l0(obtain, bundle);
            this.a.transact(3001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.u8e
    public final void l0(int i, Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            zc4.l0(obtain, bundle);
            zc4.l0(obtain, bundle2);
            this.a.transact(3010, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.u8e
    public final void y(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            zc4.l0(obtain, bundle);
            this.a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
