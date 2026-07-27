package q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.InterfaceC3423jd;

/* loaded from: classes.dex */
public final class L extends Z2.a {
    public L(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator", 2);
    }

    public final IBinder R0(V2.b bVar, g1 g1Var, String str, InterfaceC3423jd interfaceC3423jd, int i) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, bVar);
        AbstractC3241g8.c(A02, g1Var);
        A02.writeString(str);
        AbstractC3241g8.e(A02, interfaceC3423jd);
        A02.writeInt(261710000);
        A02.writeInt(i);
        Parcel D02 = D0(A02, 2);
        IBinder readStrongBinder = D02.readStrongBinder();
        D02.recycle();
        return readStrongBinder;
    }
}
