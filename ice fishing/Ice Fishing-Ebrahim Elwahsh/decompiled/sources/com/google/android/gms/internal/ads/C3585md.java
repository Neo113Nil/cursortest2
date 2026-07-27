package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.md, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3585md extends Z2.a implements InterfaceC3693od {
    public C3585md(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void A3(int i, String str) {
        Parcel A02 = A0();
        A02.writeInt(i);
        A02.writeString(str);
        G0(A02, 22);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void H0(C2938af c2938af) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void S() {
        G0(A0(), 25);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void T(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void T0(InterfaceC4284zb interfaceC4284zb, String str) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, interfaceC4284zb);
        A02.writeString(str);
        G0(A02, 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void W(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void Y() {
        G0(A0(), 11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void Z0(C4927z0 c4927z0) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, c4927z0);
        G0(A02, 24);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void c() {
        G0(A0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void d3(C4927z0 c4927z0) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, c4927z0);
        G0(A02, 23);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void e3(String str, String str2) {
        Parcel A02 = A0();
        A02.writeString(str);
        A02.writeString(str2);
        G0(A02, 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void f() {
        G0(A0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void g() {
        G0(A0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void h() {
        G0(A0(), 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void j() {
        G0(A0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void k2() {
        G0(A0(), 18);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void l() {
        G0(A0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void l0(int i) {
        Parcel A02 = A0();
        A02.writeInt(i);
        G0(A02, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void q() {
        G0(A0(), 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void u() {
        G0(A0(), 20);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void u1(InterfaceC3047cf interfaceC3047cf) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, interfaceC3047cf);
        G0(A02, 16);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final void y() {
        G0(A0(), 15);
    }
}
