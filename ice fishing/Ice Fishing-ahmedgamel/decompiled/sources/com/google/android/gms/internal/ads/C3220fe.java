package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import u2.C5067a;

/* renamed from: com.google.android.gms.internal.ads.fe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3220fe extends AbstractC0549a implements InterfaceC3274ge {
    public C3220fe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274ge
    public final void B1(String[] strArr, int[] iArr, Y2.a aVar) {
        Parcel F02 = F0();
        F02.writeStringArray(strArr);
        F02.writeIntArray(iArr);
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274ge
    public final void J0(Y2.a aVar, C5067a c5067a) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.c(F02, c5067a);
        d1(F02, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274ge
    public final void f0(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274ge
    public final void h() {
        d1(F0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274ge
    public final void m0(Intent intent) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, intent);
        d1(F02, 1);
    }
}
