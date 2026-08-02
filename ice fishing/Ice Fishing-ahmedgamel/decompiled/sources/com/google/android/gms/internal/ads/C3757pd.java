package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.pd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3757pd extends AbstractC0549a implements InterfaceC3864rd {
    public C3757pd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void E() {
        d1(F0(), 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void N1(C4969z0 c4969z0) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c4969z0);
        d1(F02, 24);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void N3(int i, String str) {
        Parcel F02 = F0();
        F02.writeInt(i);
        F02.writeString(str);
        d1(F02, 22);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void T(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void U(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void Z2(InterfaceC2535Db interfaceC2535Db, String str) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC2535Db);
        F02.writeString(str);
        d1(F02, 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void d() {
        d1(F0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void e() {
        d1(F0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void g() {
        d1(F0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void h3(C3114df c3114df) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void i2() {
        d1(F0(), 18);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void j() {
        d1(F0(), 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void j0(int i) {
        Parcel F02 = F0();
        F02.writeInt(i);
        d1(F02, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void k() {
        d1(F0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void k3(String str, String str2) {
        Parcel F02 = F0();
        F02.writeString(str);
        F02.writeString(str2);
        d1(F02, 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void m() {
        d1(F0(), 15);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void n() {
        d1(F0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void p() {
        d1(F0(), 11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void r0(C4969z0 c4969z0) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c4969z0);
        d1(F02, 23);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void u() {
        d1(F0(), 25);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void u0(InterfaceC3221ff interfaceC3221ff) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC3221ff);
        d1(F02, 16);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3864rd
    public final void y() {
        d1(F0(), 20);
    }
}
