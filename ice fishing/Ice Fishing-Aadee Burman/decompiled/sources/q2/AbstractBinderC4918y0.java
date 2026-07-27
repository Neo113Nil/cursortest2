package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC3388j8;

/* renamed from: q2.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4918y0 extends AbstractBinderC3336i8 implements A0 {
    public AbstractBinderC4918y0() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static A0 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof A0 ? (A0) queryLocalInterface : new C4916x0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        C0 b02;
        switch (i) {
            case 1:
                d();
                parcel2.writeNoException();
                return true;
            case 2:
                e();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean a9 = AbstractC3388j8.a(parcel);
                AbstractC3388j8.f(parcel);
                l0(a9);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean g4 = g();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3388j8.f31199a;
                parcel2.writeInt(g4 ? 1 : 0);
                return true;
            case 5:
                int n9 = n();
                parcel2.writeNoException();
                parcel2.writeInt(n9);
                return true;
            case 6:
                float j6 = j();
                parcel2.writeNoException();
                parcel2.writeFloat(j6);
                return true;
            case 7:
                float k9 = k();
                parcel2.writeNoException();
                parcel2.writeFloat(k9);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    b02 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    b02 = queryLocalInterface instanceof C0 ? (C0) queryLocalInterface : new B0(readStrongBinder);
                }
                AbstractC3388j8.f(parcel);
                e2(b02);
                parcel2.writeNoException();
                return true;
            case 9:
                float q8 = q();
                parcel2.writeNoException();
                parcel2.writeFloat(q8);
                return true;
            case 10:
                boolean p9 = p();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3388j8.f31199a;
                parcel2.writeInt(p9 ? 1 : 0);
                return true;
            case 11:
                C0 s9 = s();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, s9);
                return true;
            case 12:
                boolean r9 = r();
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC3388j8.f31199a;
                parcel2.writeInt(r9 ? 1 : 0);
                return true;
            case 13:
                m();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
