package C0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o0.u;

/* loaded from: classes.dex */
public abstract class c extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141a = 0;

    public /* synthetic */ c() {
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i2 = this.f141a;
        return this;
    }

    public boolean d(int i2, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (this.f141a) {
            case 0:
                if (i2 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i2, parcel, parcel2, i3)) {
                    return true;
                }
                switch (i2) {
                    case 3:
                        y0.b.b(parcel);
                        break;
                    case 4:
                        y0.b.b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        y0.b.b(parcel);
                        break;
                    case 7:
                        y0.b.b(parcel);
                        break;
                    case 8:
                        f fVar = (f) y0.b.a(parcel, f.CREATOR);
                        y0.b.b(parcel);
                        u uVar = (u) this;
                        uVar.f8312c.post(new D0.f(7, uVar, fVar));
                        break;
                    case 9:
                        y0.b.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i2 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i2, parcel, parcel2, i3)) {
                    return true;
                }
                return d(i2, parcel, parcel2);
        }
    }

    public c(String str) {
        attachInterface(this, str);
    }
}
