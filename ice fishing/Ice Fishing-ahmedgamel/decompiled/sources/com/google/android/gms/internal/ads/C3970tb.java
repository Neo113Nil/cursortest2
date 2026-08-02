package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;

/* renamed from: com.google.android.gms.internal.ads.tb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3970tb extends AbstractC0549a implements InterfaceC4078vb {
    public C3970tb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final void I2(InterfaceC3755pb interfaceC3755pb) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC3755pb);
        d1(F02, 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final void V0(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final void Y2(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final void o() {
        d1(F0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final void q3(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final void t3(Y2.a aVar, String str) {
        Parcel F02 = F0();
        F02.writeString(str);
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final void v3(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final void y3(Y2.b bVar, int i) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, bVar);
        F02.writeInt(i);
        d1(F02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final Y2.a z(String str) {
        Parcel F02 = F0();
        F02.writeString(str);
        return Wv.e(K0(F02, 2));
    }
}
