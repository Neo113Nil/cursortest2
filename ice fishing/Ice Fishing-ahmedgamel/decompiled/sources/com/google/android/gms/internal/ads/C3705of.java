package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.of, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3705of extends AbstractC0549a implements InterfaceC3813qf {
    public C3705of(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3813qf
    public final void a(C4969z0 c4969z0) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c4969z0);
        d1(F02, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3813qf
    public final void d() {
        d1(F0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3813qf
    public final void v(int i) {
        Parcel F02 = F0();
        F02.writeInt(i);
        d1(F02, 2);
    }
}
