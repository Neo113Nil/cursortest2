package com.google.android.gms.internal.ads;

import android.os.Parcel;
import c3.AbstractC0549a;
import s2.InterfaceC4953r0;
import s2.InterfaceC4963w0;

/* loaded from: classes2.dex */
public final class M8 extends AbstractC0549a implements N8 {
    @Override // com.google.android.gms.internal.ads.N8
    public final void O0(Y2.a aVar, R8 r82) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.e(F02, r82);
        d1(F02, 4);
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void c3(InterfaceC4953r0 interfaceC4953r0) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC4953r0);
        d1(F02, 7);
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final InterfaceC4963w0 h() {
        Parcel K02 = K0(F0(), 5);
        InterfaceC4963w0 U32 = BinderC3871rk.U3(K02.readStrongBinder());
        K02.recycle();
        return U32;
    }
}
