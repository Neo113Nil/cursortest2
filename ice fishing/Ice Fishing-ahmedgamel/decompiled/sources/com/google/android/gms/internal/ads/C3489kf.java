package com.google.android.gms.internal.ads;

import android.os.Parcel;
import c3.AbstractC0549a;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.kf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3489kf extends AbstractC0549a implements InterfaceC3597mf {
    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void D(int i) {
        Parcel F02 = F0();
        F02.writeInt(i);
        d1(F02, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void d() {
        d1(F0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void e() {
        d1(F0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void j() {
        d1(F0(), 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void k() {
        d1(F0(), 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void n1(C4969z0 c4969z0) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c4969z0);
        d1(F02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void o1(InterfaceC3221ff interfaceC3221ff) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC3221ff);
        d1(F02, 3);
    }
}
