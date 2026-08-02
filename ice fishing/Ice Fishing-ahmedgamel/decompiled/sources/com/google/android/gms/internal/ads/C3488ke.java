package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;

/* renamed from: com.google.android.gms.internal.ads.ke, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3488ke extends AbstractC0549a implements InterfaceC3596me {
    public C3488ke(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void A0(Bundle bundle) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, bundle);
        d1(F02, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void E() {
        d1(F0(), 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void I() {
        d1(F0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void I0() {
        d1(F0(), 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void d() {
        d1(F0(), 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void d3(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final boolean e() {
        Parcel K02 = K0(F0(), 11);
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        boolean z6 = K02.readInt() != 0;
        K02.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void g() {
        d1(F0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void j() {
        d1(F0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void k() {
        d1(F0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void n() {
        d1(F0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void o() {
        d1(F0(), 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void p1(int i, String[] strArr, int[] iArr) {
        Parcel F02 = F0();
        F02.writeInt(i);
        F02.writeStringArray(strArr);
        F02.writeIntArray(iArr);
        d1(F02, 15);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void r3(int i, int i4, Intent intent) {
        Parcel F02 = F0();
        F02.writeInt(i);
        F02.writeInt(i4);
        AbstractC3411j8.c(F02, intent);
        d1(F02, 12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3596me
    public final void x1(Bundle bundle) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, bundle);
        Parcel K02 = K0(F02, 6);
        if (K02.readInt() != 0) {
            bundle.readFromParcel(K02);
        }
        K02.recycle();
    }
}
