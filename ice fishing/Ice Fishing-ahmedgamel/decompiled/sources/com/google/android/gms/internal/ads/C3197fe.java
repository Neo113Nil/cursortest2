package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import s2.C4971a;

/* renamed from: com.google.android.gms.internal.ads.fe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3197fe extends AbstractC0432a implements InterfaceC3251ge {
    public C3197fe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3251ge
    public final void I2(String[] strArr, int[] iArr, W2.a aVar) {
        Parcel H02 = H0();
        H02.writeStringArray(strArr);
        H02.writeIntArray(iArr);
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3251ge
    public final void W1(W2.a aVar, C4971a c4971a) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.c(H02, c4971a);
        f1(H02, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3251ge
    public final void Y(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3251ge
    public final void h() {
        f1(H0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3251ge
    public final void m0(Intent intent) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, intent);
        f1(H02, 1);
    }
}
