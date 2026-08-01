package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import q2.InterfaceC4904r0;
import q2.InterfaceC4914w0;

/* renamed from: com.google.android.gms.internal.ads.gf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3252gf extends AbstractC0432a implements InterfaceC3412jf {
    public C3252gf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final void I1(q2.c1 c1Var, InterfaceC3790qf interfaceC3790qf) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, c1Var);
        AbstractC3388j8.e(H02, interfaceC3790qf);
        f1(H02, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final void K1(InterfaceC4904r0 interfaceC4904r0) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, interfaceC4904r0);
        f1(H02, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final void X1(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final void Z1(InterfaceC3574mf interfaceC3574mf) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, interfaceC3574mf);
        f1(H02, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final void i3(C4005uf c4005uf) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, c4005uf);
        f1(H02, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final void k1(q2.c1 c1Var, InterfaceC3790qf interfaceC3790qf) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, c1Var);
        AbstractC3388j8.e(H02, interfaceC3790qf);
        f1(H02, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final InterfaceC4914w0 l() {
        Parcel M02 = M0(H0(), 12);
        InterfaceC4914w0 U3 = BinderC3848rk.U3(M02.readStrongBinder());
        M02.recycle();
        return U3;
    }
}
