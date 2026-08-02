package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import c3.AbstractC0549a;

/* renamed from: com.google.android.gms.internal.ads.Le, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2674Le extends AbstractC0549a implements InterfaceC2708Ne {
    public C2674Le(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Ne
    public final void A1(ParcelFileDescriptor parcelFileDescriptor, C2759Qe c2759Qe) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, parcelFileDescriptor);
        AbstractC3411j8.c(F02, c2759Qe);
        d1(F02, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Ne
    public final void E2(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, parcelFileDescriptor);
        d1(F02, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Ne
    public final void h2(w2.m mVar) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, mVar);
        d1(F02, 2);
    }
}
