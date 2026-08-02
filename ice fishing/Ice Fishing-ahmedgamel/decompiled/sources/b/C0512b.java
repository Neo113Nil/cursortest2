package b;

import a.AbstractC0426a;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p.BinderC4819e;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512b implements InterfaceC0514d {

    /* renamed from: n, reason: collision with root package name */
    public IBinder f5369n;

    public final boolean D0(BinderC4819e binderC4819e, Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0514d.f5371e0);
            obtain.writeStrongInterface(binderC4819e);
            AbstractC0426a.q(obtain, uri);
            this.f5369n.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean F0(BinderC4819e binderC4819e, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0514d.f5371e0);
            obtain.writeStrongInterface(binderC4819e);
            AbstractC0426a.q(obtain, uri);
            AbstractC0426a.q(obtain, bundle);
            this.f5369n.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean K0() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0514d.f5371e0);
            obtain.writeLong(0L);
            this.f5369n.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean S(BinderC4819e binderC4819e, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0514d.f5371e0);
            obtain.writeStrongInterface(binderC4819e);
            AbstractC0426a.q(obtain, uri);
            AbstractC0426a.q(obtain, bundle);
            obtain.writeInt(-1);
            this.f5369n.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5369n;
    }

    public final boolean e0(BinderC4819e binderC4819e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0514d.f5371e0);
            obtain.writeStrongInterface(binderC4819e);
            this.f5369n.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int t0(BinderC4819e binderC4819e, String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0514d.f5371e0);
            obtain.writeStrongInterface(binderC4819e);
            obtain.writeString(str);
            AbstractC0426a.q(obtain, bundle);
            this.f5369n.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
