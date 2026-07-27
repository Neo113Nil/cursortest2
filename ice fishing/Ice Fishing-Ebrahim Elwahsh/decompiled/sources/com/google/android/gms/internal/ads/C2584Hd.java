package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.Hd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2584Hd extends Z2.a implements InterfaceC2601Id {
    public C2584Hd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2601Id
    public final void a(C4927z0 c4927z0) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, c4927z0);
        G0(A02, 3);
    }
}
