package com.google.android.gms.internal.ads;

import android.os.Parcel;
import c3.AbstractC0549a;

/* renamed from: com.google.android.gms.internal.ads.ex, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3185ex extends AbstractC0549a implements InterfaceC3239fx {
    @Override // com.google.android.gms.internal.ads.InterfaceC3239fx
    public final void D(int i) {
        Parcel F02 = F0();
        F02.writeInt(i);
        d1(F02, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3239fx
    public final void T1(Y2.b bVar, String str) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, bVar);
        F02.writeString(str);
        F02.writeString(null);
        d1(F02, 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3239fx
    public final void a0(int i) {
        Parcel F02 = F0();
        F02.writeInt(i);
        d1(F02, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3239fx
    public final void b2(byte[] bArr) {
        Parcel F02 = F0();
        F02.writeByteArray(bArr);
        d1(F02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3239fx
    public final void d() {
        d1(F0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3239fx
    public final void p0() {
        Parcel F02 = F0();
        F02.writeIntArray(null);
        d1(F02, 4);
    }
}
