package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.Parcel;
import q2.InterfaceC4904r0;
import q2.InterfaceC4914w0;

/* loaded from: classes2.dex */
public final class M8 extends AbstractC0432a implements N8 {
    @Override // com.google.android.gms.internal.ads.N8
    public final void M3(W2.a aVar, R8 r82) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.e(H02, r82);
        f1(H02, 4);
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void N0(InterfaceC4904r0 interfaceC4904r0) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, interfaceC4904r0);
        f1(H02, 7);
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final InterfaceC4914w0 h() {
        Parcel M02 = M0(H0(), 5);
        InterfaceC4914w0 U3 = BinderC3848rk.U3(M02.readStrongBinder());
        M02.recycle();
        return U3;
    }
}
