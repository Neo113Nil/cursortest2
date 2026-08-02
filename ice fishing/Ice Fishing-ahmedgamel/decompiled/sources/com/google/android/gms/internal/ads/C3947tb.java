package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import com.icefishingapp.icefishing.AbstractC4404f;

/* renamed from: com.google.android.gms.internal.ads.tb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3947tb extends AbstractC0432a implements InterfaceC4055vb {
    public C3947tb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final void A3(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final void K2(InterfaceC3732pb interfaceC3732pb) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, interfaceC3732pb);
        f1(H02, 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final void R0(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final void S0(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final void S2(W2.a aVar, String str) {
        Parcel H02 = H0();
        H02.writeString(str);
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final void n0(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final void o() {
        f1(H0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final void y3(W2.b bVar, int i) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, bVar);
        H02.writeInt(i);
        f1(H02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final W2.a z(String str) {
        Parcel H02 = H0();
        H02.writeString(str);
        return AbstractC4404f.c(M0(H02, 2));
    }
}
