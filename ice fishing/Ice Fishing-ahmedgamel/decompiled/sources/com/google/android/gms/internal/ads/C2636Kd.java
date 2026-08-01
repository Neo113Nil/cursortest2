package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.Kd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2636Kd extends AbstractC0432a implements InterfaceC2653Ld {
    public C2636Kd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2653Ld
    public final void a(C4920z0 c4920z0) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, c4920z0);
        f1(H02, 3);
    }
}
