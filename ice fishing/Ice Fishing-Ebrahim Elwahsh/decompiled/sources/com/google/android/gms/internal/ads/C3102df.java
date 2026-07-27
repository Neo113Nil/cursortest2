package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import q2.InterfaceC4911r0;
import q2.InterfaceC4921w0;

/* renamed from: com.google.android.gms.internal.ads.df, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3102df extends Z2.a implements InterfaceC3211ff {
    public C3102df(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final void H2(q2.d1 d1Var, InterfaceC3587mf interfaceC3587mf) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, d1Var);
        AbstractC3241g8.e(A02, interfaceC3587mf);
        G0(A02, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final void f2(q2.d1 d1Var, InterfaceC3587mf interfaceC3587mf) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, d1Var);
        AbstractC3241g8.e(A02, interfaceC3587mf);
        G0(A02, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final void h1(Cif cif) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, cif);
        G0(A02, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final void i3(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final InterfaceC4921w0 m() {
        Parcel D02 = D0(A0(), 12);
        InterfaceC4921w0 G32 = BinderC3754pk.G3(D02.readStrongBinder());
        D02.recycle();
        return G32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final void o3(C3856rf c3856rf) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, c3856rf);
        G0(A02, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final void p1(InterfaceC4911r0 interfaceC4911r0) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, interfaceC4911r0);
        G0(A02, 13);
    }
}
