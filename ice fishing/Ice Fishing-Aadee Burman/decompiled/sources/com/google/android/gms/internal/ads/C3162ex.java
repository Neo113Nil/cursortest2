package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ex, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3162ex extends AbstractC0432a implements InterfaceC3216fx {
    @Override // com.google.android.gms.internal.ads.InterfaceC3216fx
    public final void D(int i) {
        Parcel H02 = H0();
        H02.writeInt(i);
        f1(H02, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3216fx
    public final void a0(int i) {
        Parcel H02 = H0();
        H02.writeInt(i);
        f1(H02, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3216fx
    public final void a2(W2.b bVar, String str) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, bVar);
        H02.writeString(str);
        H02.writeString(null);
        f1(H02, 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3216fx
    public final void d() {
        f1(H0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3216fx
    public final void d2(byte[] bArr) {
        Parcel H02 = H0();
        H02.writeByteArray(bArr);
        f1(H02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3216fx
    public final void p0() {
        Parcel H02 = H0();
        H02.writeIntArray(null);
        f1(H02, 4);
    }
}
