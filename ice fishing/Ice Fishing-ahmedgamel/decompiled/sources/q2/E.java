package q2;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.C3462kb;
import com.google.android.gms.internal.ads.InterfaceC2583Hb;
import com.google.android.gms.internal.ads.InterfaceC2617Jb;
import com.google.android.gms.internal.ads.InterfaceC2685Nb;

/* loaded from: classes.dex */
public final class E extends AbstractC0432a implements G {
    public E(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder", 2);
    }

    @Override // q2.G
    public final void G2(InterfaceC4915x interfaceC4915x) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, interfaceC4915x);
        f1(H02, 2);
    }

    @Override // q2.G
    public final void J2(InterfaceC2685Nb interfaceC2685Nb) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, interfaceC2685Nb);
        f1(H02, 10);
    }

    @Override // q2.G
    public final void J3(C3462kb c3462kb) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, c3462kb);
        f1(H02, 6);
    }

    @Override // q2.G
    public final void N1(String str, InterfaceC2617Jb interfaceC2617Jb, InterfaceC2583Hb interfaceC2583Hb) {
        Parcel H02 = H0();
        H02.writeString(str);
        AbstractC3388j8.e(H02, interfaceC2617Jb);
        AbstractC3388j8.e(H02, interfaceC2583Hb);
        f1(H02, 5);
    }

    @Override // q2.G
    public final D d() {
        D c4869b;
        Parcel M02 = M0(H0(), 1);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c4869b = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            c4869b = queryLocalInterface instanceof D ? (D) queryLocalInterface : new C4869B(readStrongBinder, "com.google.android.gms.ads.internal.client.IAdLoader", 2);
        }
        M02.recycle();
        return c4869b;
    }
}
