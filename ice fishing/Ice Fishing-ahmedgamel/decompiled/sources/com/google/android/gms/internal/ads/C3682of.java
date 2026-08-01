package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.of, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3682of extends AbstractC0432a implements InterfaceC3790qf {
    public C3682of(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3790qf
    public final void a(C4920z0 c4920z0) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, c4920z0);
        f1(H02, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3790qf
    public final void d() {
        f1(H0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3790qf
    public final void v(int i) {
        Parcel H02 = H0();
        H02.writeInt(i);
        f1(H02, 2);
    }
}
