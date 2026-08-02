package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c3.AbstractC0549a;
import java.util.ArrayList;
import java.util.List;
import s2.AbstractBinderC4967y0;

/* renamed from: com.google.android.gms.internal.ads.nd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3649nd extends AbstractC0549a implements InterfaceC3703od {
    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void G0(Y2.a aVar, InterfaceC3060cf interfaceC3060cf, List list) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.e(F02, interfaceC3060cf);
        F02.writeStringList(list);
        d1(F02, 23);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final boolean H() {
        Parcel K02 = K0(F0(), 22);
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        boolean z6 = K02.readInt() != 0;
        K02.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void I() {
        d1(F0(), 12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void I1(Y2.a aVar, s2.c1 c1Var, String str, String str2, InterfaceC3864rd interfaceC3864rd) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.c(F02, c1Var);
        F02.writeString(str);
        F02.writeString(str2);
        AbstractC3411j8.e(F02, interfaceC3864rd);
        d1(F02, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final InterfaceC4134wd J() {
        InterfaceC4134wd c4080vd;
        Parcel K02 = K0(F0(), 27);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c4080vd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            c4080vd = queryLocalInterface instanceof InterfaceC4134wd ? (InterfaceC4134wd) queryLocalInterface : new C4080vd(readStrongBinder);
        }
        K02.recycle();
        return c4080vd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void J3(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 37);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void P0(Y2.a aVar, s2.c1 c1Var, String str, String str2, InterfaceC3864rd interfaceC3864rd, C3485kb c3485kb, ArrayList arrayList) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.c(F02, c1Var);
        F02.writeString(str);
        F02.writeString(str2);
        AbstractC3411j8.e(F02, interfaceC3864rd);
        AbstractC3411j8.c(F02, c3485kb);
        F02.writeStringList(arrayList);
        d1(F02, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void P1(boolean z6) {
        Parcel F02 = F0();
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        F02.writeInt(z6 ? 1 : 0);
        d1(F02, 25);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final C3972td R() {
        C3972td c3972td;
        Parcel K02 = K0(F0(), 15);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c3972td = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            c3972td = queryLocalInterface instanceof C3972td ? (C3972td) queryLocalInterface : new C3972td(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper", 1);
        }
        K02.recycle();
        return c3972td;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void R2(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 39);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void S2() {
        d1(F0(), 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void X2(Y2.a aVar, s2.c1 c1Var, String str, InterfaceC3864rd interfaceC3864rd) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.c(F02, c1Var);
        F02.writeString(str);
        AbstractC3411j8.e(F02, interfaceC3864rd);
        d1(F02, 38);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void Y(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void b3(Y2.a aVar, s2.f1 f1Var, s2.c1 c1Var, String str, String str2, InterfaceC3864rd interfaceC3864rd) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.c(F02, f1Var);
        AbstractC3411j8.c(F02, c1Var);
        F02.writeString(str);
        F02.writeString(str2);
        AbstractC3411j8.e(F02, interfaceC3864rd);
        d1(F02, 35);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final s2.A0 c0() {
        Parcel K02 = K0(F0(), 26);
        s2.A0 U32 = AbstractBinderC4967y0.U3(K02.readStrongBinder());
        K02.recycle();
        return U32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final C3918sd d0() {
        C3918sd c3918sd;
        Parcel K02 = K0(F0(), 36);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c3918sd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            c3918sd = queryLocalInterface instanceof C3918sd ? (C3918sd) queryLocalInterface : new C3918sd(readStrongBinder);
        }
        K02.recycle();
        return c3918sd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final Y2.a e() {
        return Wv.e(K0(F0(), 2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void e2(Y2.a aVar, s2.f1 f1Var, s2.c1 c1Var, String str, String str2, InterfaceC3864rd interfaceC3864rd) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.c(F02, f1Var);
        AbstractC3411j8.c(F02, c1Var);
        F02.writeString(str);
        F02.writeString(str2);
        AbstractC3411j8.e(F02, interfaceC3864rd);
        d1(F02, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void g() {
        d1(F0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final C4026ud h0() {
        C4026ud c4026ud;
        Parcel K02 = K0(F0(), 16);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c4026ud = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            c4026ud = queryLocalInterface instanceof C4026ud ? (C4026ud) queryLocalInterface : new C4026ud(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper", 1);
        }
        K02.recycle();
        return c4026ud;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final C2826Ud i0() {
        Parcel K02 = K0(F0(), 33);
        C2826Ud c2826Ud = (C2826Ud) AbstractC3411j8.b(K02, C2826Ud.CREATOR);
        K02.recycle();
        return c2826Ud;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void j2(Y2.a aVar, s2.c1 c1Var, String str, InterfaceC3864rd interfaceC3864rd) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.c(F02, c1Var);
        F02.writeString(str);
        AbstractC3411j8.e(F02, interfaceC3864rd);
        d1(F02, 28);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final C2826Ud k0() {
        Parcel K02 = K0(F0(), 34);
        C2826Ud c2826Ud = (C2826Ud) AbstractC3411j8.b(K02, C2826Ud.CREATOR);
        K02.recycle();
        return c2826Ud;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void l() {
        d1(F0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void l1(Y2.a aVar, InterfaceC2502Bc interfaceC2502Bc, ArrayList arrayList) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.e(F02, interfaceC2502Bc);
        F02.writeTypedList(arrayList);
        d1(F02, 31);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final boolean m() {
        Parcel K02 = K0(F0(), 13);
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        boolean z6 = K02.readInt() != 0;
        K02.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void m3(String str, s2.c1 c1Var) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, c1Var);
        F02.writeString(str);
        d1(F02, 11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void n() {
        d1(F0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void v2(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 30);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void w3(Y2.a aVar, s2.c1 c1Var, String str, InterfaceC3864rd interfaceC3864rd) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.c(F02, c1Var);
        F02.writeString(str);
        AbstractC3411j8.e(F02, interfaceC3864rd);
        d1(F02, 32);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void x3(Y2.a aVar, s2.c1 c1Var, InterfaceC3060cf interfaceC3060cf, String str) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.c(F02, c1Var);
        F02.writeString(null);
        AbstractC3411j8.e(F02, interfaceC3060cf);
        F02.writeString(str);
        d1(F02, 10);
    }
}
