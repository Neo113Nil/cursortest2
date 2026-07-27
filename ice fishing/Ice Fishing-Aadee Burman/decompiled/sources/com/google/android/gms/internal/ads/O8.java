package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.Parcel;
import q2.C4920z0;

/* loaded from: classes2.dex */
public final class O8 extends AbstractC0432a implements P8 {
    @Override // com.google.android.gms.internal.ads.P8
    public final void G(C4920z0 c4920z0) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, c4920z0);
        f1(H02, 3);
    }

    @Override // com.google.android.gms.internal.ads.P8
    public final void O0(N8 n82) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, n82);
        f1(H02, 1);
    }

    @Override // com.google.android.gms.internal.ads.P8
    public final void x(int i) {
        Parcel H02 = H0();
        H02.writeInt(i);
        f1(H02, 2);
    }
}
