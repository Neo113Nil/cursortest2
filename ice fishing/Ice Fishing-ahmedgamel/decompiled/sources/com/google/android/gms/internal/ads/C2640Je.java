package com.google.android.gms.internal.ads;

import android.os.Parcel;
import c3.AbstractC0549a;

/* renamed from: com.google.android.gms.internal.ads.Je, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2640Je extends AbstractC0549a implements InterfaceC2657Ke {
    @Override // com.google.android.gms.internal.ads.InterfaceC2657Ke
    public final void Q2(C2759Qe c2759Qe, InterfaceC2708Ne interfaceC2708Ne) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c2759Qe);
        AbstractC3411j8.e(F02, interfaceC2708Ne);
        d1(F02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2657Ke
    public final void V1(String str, InterfaceC2708Ne interfaceC2708Ne) {
        Parcel F02 = F0();
        F02.writeString(str);
        AbstractC3411j8.e(F02, interfaceC2708Ne);
        d1(F02, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2657Ke
    public final void k2(C2759Qe c2759Qe, InterfaceC2708Ne interfaceC2708Ne) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c2759Qe);
        AbstractC3411j8.e(F02, interfaceC2708Ne);
        d1(F02, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2657Ke
    public final void s0(String str) {
        Parcel F02 = F0();
        F02.writeString(str);
        d1(F02, 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2657Ke
    public final void s1(C2759Qe c2759Qe, InterfaceC2708Ne interfaceC2708Ne) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c2759Qe);
        AbstractC3411j8.e(F02, interfaceC2708Ne);
        d1(F02, 4);
    }
}
