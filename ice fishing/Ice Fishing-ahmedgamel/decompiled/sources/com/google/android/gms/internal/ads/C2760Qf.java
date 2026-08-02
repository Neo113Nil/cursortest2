package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;

/* renamed from: com.google.android.gms.internal.ads.Qf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2760Qf extends AbstractC0549a implements InterfaceC2794Sf {
    public C2760Qf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2794Sf
    public final void l2(Y2.a aVar, C2861Wf c2861Wf, InterfaceC2743Pf interfaceC2743Pf) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.c(F02, c2861Wf);
        AbstractC3411j8.e(F02, interfaceC2743Pf);
        d1(F02, 1);
    }
}
