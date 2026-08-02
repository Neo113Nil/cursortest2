package c3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0549a implements IInterface {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5721n;

    /* renamed from: u, reason: collision with root package name */
    public final IBinder f5722u;

    /* renamed from: v, reason: collision with root package name */
    public final String f5723v;

    public /* synthetic */ AbstractC0549a(IBinder iBinder, String str, int i) {
        this.f5721n = i;
        this.f5722u = iBinder;
        this.f5723v = str;
    }

    public void D0(Parcel parcel, int i) {
        try {
            this.f5722u.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel F0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5723v);
        return obtain;
    }

    public Parcel K0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f5722u.transact(i, parcel, obtain, 0);
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
            this.f5722u.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f5721n) {
        }
        return this.f5722u;
    }

    public void d1(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f5722u.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel e0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f5722u.transact(i, parcel, obtain, 0);
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

    public void h1(Parcel parcel, int i) {
        try {
            this.f5722u.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel t0() {
        switch (this.f5721n) {
            case 2:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f5723v);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f5723v);
                return obtain2;
        }
    }
}
