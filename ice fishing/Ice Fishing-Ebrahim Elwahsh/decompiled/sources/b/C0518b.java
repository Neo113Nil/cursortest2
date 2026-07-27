package b;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bumptech.glide.e;
import p.BinderC4845e;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518b implements InterfaceC0520d {

    /* renamed from: n, reason: collision with root package name */
    public IBinder f5516n;

    public final int A0(BinderC4845e binderC4845e, String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0520d.f5518j0);
            obtain.writeStrongInterface(binderC4845e);
            obtain.writeString(str);
            e.C(obtain, bundle);
            this.f5516n.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean D0(BinderC4845e binderC4845e, Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0520d.f5518j0);
            obtain.writeStrongInterface(binderC4845e);
            e.C(obtain, uri);
            this.f5516n.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean G0(BinderC4845e binderC4845e, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0520d.f5518j0);
            obtain.writeStrongInterface(binderC4845e);
            e.C(obtain, uri);
            e.C(obtain, bundle);
            this.f5516n.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean N0() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0520d.f5518j0);
            obtain.writeLong(0L);
            this.f5516n.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5516n;
    }

    public final boolean i0(BinderC4845e binderC4845e, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0520d.f5518j0);
            obtain.writeStrongInterface(binderC4845e);
            e.C(obtain, uri);
            e.C(obtain, bundle);
            obtain.writeInt(-1);
            this.f5516n.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean u0(BinderC4845e binderC4845e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0520d.f5518j0);
            obtain.writeStrongInterface(binderC4845e);
            this.f5516n.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
