package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Nf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2688Nf extends Z2.a implements InterfaceC2722Pf {
    public C2688Nf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2722Pf
    public final void G1(V2.a aVar, C2790Tf c2790Tf, InterfaceC2671Mf interfaceC2671Mf) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.c(A02, c2790Tf);
        AbstractC3241g8.e(A02, interfaceC2671Mf);
        G0(A02, 1);
    }
}
