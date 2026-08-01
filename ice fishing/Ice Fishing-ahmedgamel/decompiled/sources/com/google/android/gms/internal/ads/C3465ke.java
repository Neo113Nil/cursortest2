package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ke, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3465ke extends AbstractC0432a implements InterfaceC3573me {
    public C3465ke(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void D0(Bundle bundle) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, bundle);
        f1(H02, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void E() {
        f1(H0(), 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void F1(Bundle bundle) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, bundle);
        Parcel M02 = M0(H02, 6);
        if (M02.readInt() != 0) {
            bundle.readFromParcel(M02);
        }
        M02.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void I0(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void J() {
        f1(H0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void L0() {
        f1(H0(), 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void d() {
        f1(H0(), 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final boolean e() {
        Parcel M02 = M0(H0(), 11);
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        boolean z3 = M02.readInt() != 0;
        M02.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void g() {
        f1(H0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void j() {
        f1(H0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void k() {
        f1(H0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void n() {
        f1(H0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void o() {
        f1(H0(), 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void q1(int i, String[] strArr, int[] iArr) {
        Parcel H02 = H0();
        H02.writeInt(i);
        H02.writeStringArray(strArr);
        H02.writeIntArray(iArr);
        f1(H02, 15);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3573me
    public final void x3(int i, int i6, Intent intent) {
        Parcel H02 = H0();
        H02.writeInt(i);
        H02.writeInt(i6);
        AbstractC3388j8.c(H02, intent);
        f1(H02, 12);
    }
}
