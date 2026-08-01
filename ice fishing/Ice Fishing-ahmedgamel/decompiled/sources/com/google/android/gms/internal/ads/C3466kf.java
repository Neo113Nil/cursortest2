package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.Parcel;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.kf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3466kf extends AbstractC0432a implements InterfaceC3574mf {
    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void D(int i) {
        Parcel H02 = H0();
        H02.writeInt(i);
        f1(H02, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void K0(C4920z0 c4920z0) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, c4920z0);
        f1(H02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void d() {
        f1(H0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void e() {
        f1(H0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void j() {
        f1(H0(), 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void k() {
        f1(H0(), 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void o1(InterfaceC3198ff interfaceC3198ff) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, interfaceC3198ff);
        f1(H02, 3);
    }
}
