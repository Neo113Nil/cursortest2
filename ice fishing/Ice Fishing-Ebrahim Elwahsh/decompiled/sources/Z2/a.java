package Z2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class a implements IInterface {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4242n;

    /* renamed from: u, reason: collision with root package name */
    public final IBinder f4243u;

    /* renamed from: v, reason: collision with root package name */
    public final String f4244v;

    public /* synthetic */ a(IBinder iBinder, String str, int i) {
        this.f4242n = i;
        this.f4243u = iBinder;
        this.f4244v = str;
    }

    public Parcel A0() {
        switch (this.f4242n) {
            case 1:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f4244v);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f4244v);
                return obtain2;
        }
    }

    public Parcel D0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f4243u.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e6) {
                obtain.recycle();
                throw e6;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void G0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4243u.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void N0(Parcel parcel, int i) {
        try {
            this.f4243u.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f4242n) {
        }
        return this.f4243u;
    }

    public void i0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4243u.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel u0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f4243u.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e6) {
                obtain.recycle();
                throw e6;
            }
        } finally {
            parcel.recycle();
        }
    }
}
