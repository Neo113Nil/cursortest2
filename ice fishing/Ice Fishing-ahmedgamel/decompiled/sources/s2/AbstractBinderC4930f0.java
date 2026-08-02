package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3359i8;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.C2519Cc;
import com.google.android.gms.internal.ads.InterfaceC2536Dc;
import com.google.android.gms.internal.ads.InterfaceC3595md;
import java.util.List;

/* renamed from: s2.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4930f0 extends AbstractBinderC3359i8 implements InterfaceC4932g0 {
    public AbstractBinderC4930f0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2536Dc interfaceC2536Dc = null;
        InterfaceC4948o0 interfaceC4948o0 = null;
        switch (i) {
            case 1:
                d();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                AbstractC3411j8.f(parcel);
                g1(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                AbstractC3411j8.f(parcel);
                P2(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean a9 = AbstractC3411j8.a(parcel);
                AbstractC3411j8.f(parcel);
                Z(a9);
                parcel2.writeNoException();
                return true;
            case 5:
                Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                AbstractC3411j8.f(parcel);
                G3(t02, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                Y2.a t03 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                i3(t03, readString3);
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
                ClassLoader classLoader = AbstractC3411j8.f31986a;
                parcel2.writeInt(l9 ? 1 : 0);
                return true;
            case 9:
                String q8 = q();
                parcel2.writeNoException();
                parcel2.writeString(q8);
                return true;
            case 10:
                String readString4 = parcel.readString();
                AbstractC3411j8.f(parcel);
                w1(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC3595md U32 = BinderC3487kd.U3(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                a2(U32);
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    interfaceC2536Dc = queryLocalInterface instanceof InterfaceC2536Dc ? (InterfaceC2536Dc) queryLocalInterface : new C2519Cc(readStrongBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback", 1);
                }
                AbstractC3411j8.f(parcel);
                S3(interfaceC2536Dc);
                parcel2.writeNoException();
                return true;
            case 13:
                List m9 = m();
                parcel2.writeNoException();
                parcel2.writeTypedList(m9);
                return true;
            case 14:
                W0 w02 = (W0) AbstractC3411j8.b(parcel, W0.CREATOR);
                AbstractC3411j8.f(parcel);
                W1(w02);
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
                    interfaceC4948o0 = queryLocalInterface2 instanceof InterfaceC4948o0 ? (InterfaceC4948o0) queryLocalInterface2 : new C4944m0(readStrongBinder2, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener", 1);
                }
                AbstractC3411j8.f(parcel);
                y1(interfaceC4948o0);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean a10 = AbstractC3411j8.a(parcel);
                AbstractC3411j8.f(parcel);
                z0(a10);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                AbstractC3411j8.f(parcel);
                U(readString5);
                parcel2.writeNoException();
                return true;
            case 19:
                q1();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
