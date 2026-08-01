package b;

import X2.e;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p.BinderC4815e;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508b implements InterfaceC0510d {

    /* renamed from: n, reason: collision with root package name */
    public IBinder f5404n;

    public final boolean F0(BinderC4815e binderC4815e, Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0510d.f5406j0);
            obtain.writeStrongInterface(binderC4815e);
            e.R(obtain, uri);
            this.f5404n.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean H0(BinderC4815e binderC4815e, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0510d.f5406j0);
            obtain.writeStrongInterface(binderC4815e);
            e.R(obtain, uri);
            e.R(obtain, bundle);
            this.f5404n.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean M0() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0510d.f5406j0);
            obtain.writeLong(0L);
            this.f5404n.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean S(BinderC4815e binderC4815e, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0510d.f5406j0);
            obtain.writeStrongInterface(binderC4815e);
            e.R(obtain, uri);
            e.R(obtain, bundle);
            obtain.writeInt(-1);
            this.f5404n.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5404n;
    }

    public final boolean e0(BinderC4815e binderC4815e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0510d.f5406j0);
            obtain.writeStrongInterface(binderC4815e);
            this.f5404n.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int w0(BinderC4815e binderC4815e, String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0510d.f5406j0);
            obtain.writeStrongInterface(binderC4815e);
            obtain.writeString(str);
            e.R(obtain, bundle);
            this.f5404n.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
