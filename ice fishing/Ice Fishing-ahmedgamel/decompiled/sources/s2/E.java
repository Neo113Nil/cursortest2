package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.C3485kb;
import com.google.android.gms.internal.ads.InterfaceC2603Hb;
import com.google.android.gms.internal.ads.InterfaceC2637Jb;
import com.google.android.gms.internal.ads.InterfaceC2705Nb;

/* loaded from: classes.dex */
public final class E extends AbstractC0549a implements G {
    public E(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder", 1);
    }

    @Override // s2.G
    public final void H2(InterfaceC2705Nb interfaceC2705Nb) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC2705Nb);
        d1(F02, 10);
    }

    @Override // s2.G
    public final void H3(C3485kb c3485kb) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c3485kb);
        d1(F02, 6);
    }

    @Override // s2.G
    public final void J1(String str, InterfaceC2637Jb interfaceC2637Jb, InterfaceC2603Hb interfaceC2603Hb) {
        Parcel F02 = F0();
        F02.writeString(str);
        AbstractC3411j8.e(F02, interfaceC2637Jb);
        AbstractC3411j8.e(F02, interfaceC2603Hb);
        d1(F02, 5);
    }

    @Override // s2.G
    public final void M0(InterfaceC4964x interfaceC4964x) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC4964x);
        d1(F02, 2);
    }

    @Override // s2.G
    public final D d() {
        D c4918b;
        Parcel K02 = K0(F0(), 1);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c4918b = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            c4918b = queryLocalInterface instanceof D ? (D) queryLocalInterface : new C4918B(readStrongBinder, "com.google.android.gms.ads.internal.client.IAdLoader", 1);
        }
        K02.recycle();
        return c4918b;
    }
}
