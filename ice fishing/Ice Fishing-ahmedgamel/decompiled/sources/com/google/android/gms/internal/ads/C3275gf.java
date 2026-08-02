package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import s2.InterfaceC4953r0;
import s2.InterfaceC4963w0;

/* renamed from: com.google.android.gms.internal.ads.gf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3275gf extends AbstractC0549a implements InterfaceC3435jf {
    public C3275gf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final void H0(s2.c1 c1Var, InterfaceC3813qf interfaceC3813qf) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c1Var);
        AbstractC3411j8.e(F02, interfaceC3813qf);
        d1(F02, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final void K1(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final void R1(s2.c1 c1Var, InterfaceC3813qf interfaceC3813qf) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c1Var);
        AbstractC3411j8.e(F02, interfaceC3813qf);
        d1(F02, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final void X1(InterfaceC3597mf interfaceC3597mf) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC3597mf);
        d1(F02, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final void e3(C4028uf c4028uf) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c4028uf);
        d1(F02, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final InterfaceC4963w0 l() {
        Parcel K02 = K0(F0(), 12);
        InterfaceC4963w0 U32 = BinderC3871rk.U3(K02.readStrongBinder());
        K02.recycle();
        return U32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3435jf
    public final void z1(InterfaceC4953r0 interfaceC4953r0) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC4953r0);
        d1(F02, 13);
    }
}
