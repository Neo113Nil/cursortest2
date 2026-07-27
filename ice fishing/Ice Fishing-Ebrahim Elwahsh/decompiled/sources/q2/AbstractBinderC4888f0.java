package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.C4177xc;
import com.google.android.gms.internal.ads.InterfaceC3423jd;
import com.google.android.gms.internal.ads.InterfaceC4231yc;
import java.util.List;

/* renamed from: q2.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4888f0 extends AbstractBinderC3186f8 implements InterfaceC4890g0 {
    public AbstractBinderC4888f0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC4231yc interfaceC4231yc = null;
        InterfaceC4906o0 interfaceC4906o0 = null;
        switch (i) {
            case 1:
                c();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                AbstractC3241g8.f(parcel);
                k1(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                AbstractC3241g8.f(parcel);
                P2(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean a9 = AbstractC3241g8.a(parcel);
                AbstractC3241g8.f(parcel);
                d0(a9);
                parcel2.writeNoException();
                return true;
            case 5:
                V2.a u02 = V2.b.u0(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                AbstractC3241g8.f(parcel);
                c1(u02, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                V2.a u03 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                A1(u03, readString3);
                parcel2.writeNoException();
                return true;
            case 7:
                float j9 = j();
                parcel2.writeNoException();
                parcel2.writeFloat(j9);
                return true;
            case 8:
                boolean k6 = k();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3241g8.f30958a;
                parcel2.writeInt(k6 ? 1 : 0);
                return true;
            case 9:
                String m8 = m();
                parcel2.writeNoException();
                parcel2.writeString(m8);
                return true;
            case 10:
                String readString4 = parcel.readString();
                AbstractC3241g8.f(parcel);
                F1(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC3423jd G32 = BinderC3317hd.G3(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                z2(G32);
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    interfaceC4231yc = queryLocalInterface instanceof InterfaceC4231yc ? (InterfaceC4231yc) queryLocalInterface : new C4177xc(readStrongBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback", 2);
                }
                AbstractC3241g8.f(parcel);
                O0(interfaceC4231yc);
                parcel2.writeNoException();
                return true;
            case 13:
                List n9 = n();
                parcel2.writeNoException();
                parcel2.writeTypedList(n9);
                return true;
            case 14:
                X0 x02 = (X0) AbstractC3241g8.b(parcel, X0.CREATOR);
                AbstractC3241g8.f(parcel);
                g2(x02);
                parcel2.writeNoException();
                return true;
            case 15:
                w();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    interfaceC4906o0 = queryLocalInterface2 instanceof InterfaceC4906o0 ? (InterfaceC4906o0) queryLocalInterface2 : new C4902m0(readStrongBinder2, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener", 2);
                }
                AbstractC3241g8.f(parcel);
                H1(interfaceC4906o0);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean a10 = AbstractC3241g8.a(parcel);
                AbstractC3241g8.f(parcel);
                w0(a10);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                AbstractC3241g8.f(parcel);
                W(readString5);
                parcel2.writeNoException();
                return true;
            case 19:
                X();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
