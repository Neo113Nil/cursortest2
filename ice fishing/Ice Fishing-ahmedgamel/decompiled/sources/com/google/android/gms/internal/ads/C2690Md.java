package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.Md, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2690Md extends AbstractC0549a implements InterfaceC2707Nd {
    public C2690Md(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2707Nd
    public final void a(C4969z0 c4969z0) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c4969z0);
        d1(F02, 4);
    }
}
