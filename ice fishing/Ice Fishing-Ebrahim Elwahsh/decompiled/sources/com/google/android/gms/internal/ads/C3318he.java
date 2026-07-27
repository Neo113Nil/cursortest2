package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.he, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3318he extends Z2.a implements InterfaceC3424je {
    public C3318he(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void F(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void I() {
        G0(A0(), 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void c() {
        G0(A0(), 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void d1(int i, String[] strArr, int[] iArr) {
        Parcel A02 = A0();
        A02.writeInt(i);
        A02.writeStringArray(strArr);
        A02.writeIntArray(iArr);
        G0(A02, 15);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final boolean e() {
        Parcel D02 = D0(A0(), 11);
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        boolean z8 = D02.readInt() != 0;
        D02.recycle();
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void f() {
        G0(A0(), 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void g1(Bundle bundle) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, bundle);
        Parcel D02 = D0(A02, 6);
        if (D02.readInt() != 0) {
            bundle.readFromParcel(D02);
        }
        D02.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void h() {
        G0(A0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void j() {
        G0(A0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void k() {
        G0(A0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void l() {
        G0(A0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void l1(int i, int i4, Intent intent) {
        Parcel A02 = A0();
        A02.writeInt(i);
        A02.writeInt(i4);
        AbstractC3241g8.c(A02, intent);
        G0(A02, 12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void r3(Bundle bundle) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, bundle);
        G0(A02, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void w() {
        G0(A0(), 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424je
    public final void y() {
        G0(A0(), 8);
    }
}
