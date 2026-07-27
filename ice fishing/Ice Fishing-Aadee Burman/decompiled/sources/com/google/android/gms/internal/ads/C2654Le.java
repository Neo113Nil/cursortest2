package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Le, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2654Le extends AbstractC0432a implements InterfaceC2688Ne {
    public C2654Le(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2688Ne
    public final void G1(ParcelFileDescriptor parcelFileDescriptor, C2739Qe c2739Qe) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, parcelFileDescriptor);
        AbstractC3388j8.c(H02, c2739Qe);
        f1(H02, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2688Ne
    public final void H2(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, parcelFileDescriptor);
        f1(H02, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2688Ne
    public final void P0(u2.m mVar) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, mVar);
        f1(H02, 2);
    }
}
