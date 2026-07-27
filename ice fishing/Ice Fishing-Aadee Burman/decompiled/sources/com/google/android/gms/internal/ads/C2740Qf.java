package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Qf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2740Qf extends AbstractC0432a implements InterfaceC2774Sf {
    public C2740Qf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2774Sf
    public final void r0(W2.a aVar, C2838Wf c2838Wf, InterfaceC2723Pf interfaceC2723Pf) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.c(H02, c2838Wf);
        AbstractC3388j8.e(H02, interfaceC2723Pf);
        f1(H02, 1);
    }
}
