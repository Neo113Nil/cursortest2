package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Qf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2739Qf extends Z2.a implements InterfaceC2773Sf {
    public final InterfaceC2722Pf R0(V2.b bVar, BinderC3317hd binderC3317hd) {
        InterfaceC2722Pf c2688Nf;
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, bVar);
        AbstractC3241g8.e(A02, binderC3317hd);
        A02.writeInt(261710000);
        Parcel D02 = D0(A02, 2);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c2688Nf = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c2688Nf = queryLocalInterface instanceof InterfaceC2722Pf ? (InterfaceC2722Pf) queryLocalInterface : new C2688Nf(readStrongBinder);
        }
        D02.recycle();
        return c2688Nf;
    }
}
