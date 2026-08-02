package com.google.android.gms.internal.ads;

import android.os.Parcel;
import c3.AbstractC0549a;
import s2.C4969z0;

/* loaded from: classes2.dex */
public final class O8 extends AbstractC0549a implements P8 {
    @Override // com.google.android.gms.internal.ads.P8
    public final void M(C4969z0 c4969z0) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c4969z0);
        d1(F02, 3);
    }

    @Override // com.google.android.gms.internal.ads.P8
    public final void N0(N8 n82) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, n82);
        d1(F02, 1);
    }

    @Override // com.google.android.gms.internal.ads.P8
    public final void x(int i) {
        Parcel F02 = F0();
        F02.writeInt(i);
        d1(F02, 2);
    }
}
