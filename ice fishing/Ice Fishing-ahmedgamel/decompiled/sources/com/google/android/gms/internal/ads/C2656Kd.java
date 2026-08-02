package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.Kd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2656Kd extends AbstractC0549a implements InterfaceC2673Ld {
    public C2656Kd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2673Ld
    public final void a(C4969z0 c4969z0) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c4969z0);
        d1(F02, 3);
    }
}
