package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.Gd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2588Gd extends AbstractC0549a implements InterfaceC2605Hd {
    public C2588Gd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2605Hd
    public final void a(C4969z0 c4969z0) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c4969z0);
        d1(F02, 3);
    }
}
