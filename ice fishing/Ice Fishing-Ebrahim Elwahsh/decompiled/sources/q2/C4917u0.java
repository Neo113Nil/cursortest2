package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.BinderC3317hd;

/* renamed from: q2.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4917u0 extends Z2.a {
    public final InterfaceC4915t0 R0(V2.b bVar, BinderC3317hd binderC3317hd) {
        InterfaceC4915t0 c4913s0;
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, bVar);
        AbstractC3241g8.e(A02, binderC3317hd);
        A02.writeInt(261710000);
        Parcel D02 = D0(A02, 1);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c4913s0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c4913s0 = queryLocalInterface instanceof InterfaceC4915t0 ? (InterfaceC4915t0) queryLocalInterface : new C4913s0(readStrongBinder);
        }
        D02.recycle();
        return c4913s0;
    }
}
