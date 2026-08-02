package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class aww implements IInterface {
    public final /* synthetic */ int a;
    public final IBinder h;
    public final String i;

    public /* synthetic */ aww(IBinder iBinder, String str, int i) {
        this.a = i;
        this.h = iBinder;
        this.i = str;
    }

    public Parcel L0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.h.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel M0() {
        switch (this.a) {
            case 2:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.i);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.i);
                return obtain2;
        }
    }

    public Parcel N0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.h.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void O0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.h.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void P0(Parcel parcel, int i) {
        try {
            this.h.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel Q0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.i);
        return obtain;
    }

    public void R(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.h.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel R0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.h.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel X() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.i);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.a) {
        }
        return this.h;
    }

    public void p0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.h.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
