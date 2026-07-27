package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.C2499Cc;
import com.google.android.gms.internal.ads.InterfaceC2516Dc;
import com.google.android.gms.internal.ads.InterfaceC3572md;
import java.util.List;

/* renamed from: q2.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4881f0 extends AbstractBinderC3336i8 implements InterfaceC4883g0 {
    public AbstractBinderC4881f0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2516Dc interfaceC2516Dc = null;
        InterfaceC4899o0 interfaceC4899o0 = null;
        switch (i) {
            case 1:
                d();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                AbstractC3388j8.f(parcel);
                g1(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                AbstractC3388j8.f(parcel);
                R2(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean a9 = AbstractC3388j8.a(parcel);
                AbstractC3388j8.f(parcel);
                Z(a9);
                parcel2.writeNoException();
                return true;
            case 5:
                W2.a w02 = W2.b.w0(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                AbstractC3388j8.f(parcel);
                F2(w02, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                W2.a w03 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                i1(w03, readString3);
                parcel2.writeNoException();
                return true;
            case 7:
                float k9 = k();
                parcel2.writeNoException();
                parcel2.writeFloat(k9);
                return true;
            case 8:
                boolean l9 = l();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3388j8.f31199a;
                parcel2.writeInt(l9 ? 1 : 0);
                return true;
            case 9:
                String q8 = q();
                parcel2.writeNoException();
                parcel2.writeString(q8);
                return true;
            case 10:
                String readString4 = parcel.readString();
                AbstractC3388j8.f(parcel);
                E1(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC3572md U3 = BinderC3464kd.U3(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                c2(U3);
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    interfaceC2516Dc = queryLocalInterface instanceof InterfaceC2516Dc ? (InterfaceC2516Dc) queryLocalInterface : new C2499Cc(readStrongBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback", 2);
                }
                AbstractC3388j8.f(parcel);
                S3(interfaceC2516Dc);
                parcel2.writeNoException();
                return true;
            case 13:
                List m4 = m();
                parcel2.writeNoException();
                parcel2.writeTypedList(m4);
                return true;
            case 14:
                W0 w04 = (W0) AbstractC3388j8.b(parcel, W0.CREATOR);
                AbstractC3388j8.f(parcel);
                i2(w04);
                parcel2.writeNoException();
                return true;
            case 15:
                C();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    interfaceC4899o0 = queryLocalInterface2 instanceof InterfaceC4899o0 ? (InterfaceC4899o0) queryLocalInterface2 : new C4895m0(readStrongBinder2, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener", 2);
                }
                AbstractC3388j8.f(parcel);
                J1(interfaceC4899o0);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean a10 = AbstractC3388j8.a(parcel);
                AbstractC3388j8.f(parcel);
                C0(a10);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                AbstractC3388j8.f(parcel);
                U(readString5);
                parcel2.writeNoException();
                return true;
            case 19:
                r1();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
