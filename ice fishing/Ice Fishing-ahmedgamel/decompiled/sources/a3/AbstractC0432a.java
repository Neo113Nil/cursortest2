package a3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0432a implements IInterface {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4328n;

    /* renamed from: u, reason: collision with root package name */
    public final IBinder f4329u;

    /* renamed from: v, reason: collision with root package name */
    public final String f4330v;

    public /* synthetic */ AbstractC0432a(IBinder iBinder, String str, int i) {
        this.f4328n = i;
        this.f4329u = iBinder;
        this.f4330v = str;
    }

    public void F0(Parcel parcel, int i) {
        try {
            this.f4329u.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel H0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4330v);
        return obtain;
    }

    public Parcel M0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f4329u.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e9) {
                obtain.recycle();
                throw e9;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void S(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4329u.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f4328n) {
        }
        return this.f4329u;
    }

    public Parcel e0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f4329u.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e9) {
                obtain.recycle();
                throw e9;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void f1(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4329u.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void h1(Parcel parcel, int i) {
        try {
            this.f4329u.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel w0() {
        switch (this.f4328n) {
            case 1:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f4330v);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f4330v);
                return obtain2;
        }
    }
}
