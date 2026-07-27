package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import q2.AbstractBinderC4925y0;

/* renamed from: com.google.android.gms.internal.ads.kd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3477kd extends Z2.a implements InterfaceC3531ld {
    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void E2(V2.a aVar, q2.d1 d1Var, String str, String str2, InterfaceC3693od interfaceC3693od, C3261gb c3261gb, ArrayList arrayList) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.c(A02, d1Var);
        A02.writeString(str);
        A02.writeString(str2);
        AbstractC3241g8.e(A02, interfaceC3693od);
        AbstractC3241g8.c(A02, c3261gb);
        A02.writeStringList(arrayList);
        G0(A02, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final boolean G() {
        Parcel D02 = D0(A0(), 22);
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        boolean z8 = D02.readInt() != 0;
        D02.recycle();
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final q2.A0 H() {
        Parcel D02 = D0(A0(), 26);
        q2.A0 G32 = AbstractBinderC4925y0.G3(D02.readStrongBinder());
        D02.recycle();
        return G32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void I() {
        G0(A0(), 12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final InterfaceC3962td J() {
        InterfaceC3962td c3908sd;
        Parcel D02 = D0(A0(), 27);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c3908sd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            c3908sd = queryLocalInterface instanceof InterfaceC3962td ? (InterfaceC3962td) queryLocalInterface : new C3908sd(readStrongBinder);
        }
        D02.recycle();
        return c3908sd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void J2(String str, q2.d1 d1Var) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, d1Var);
        A02.writeString(str);
        G0(A02, 11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final C2754Rd K() {
        Parcel D02 = D0(A0(), 33);
        C2754Rd c2754Rd = (C2754Rd) AbstractC3241g8.b(D02, C2754Rd.CREATOR);
        D02.recycle();
        return c2754Rd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void K0(V2.a aVar, q2.g1 g1Var, q2.d1 d1Var, String str, String str2, InterfaceC3693od interfaceC3693od) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.c(A02, g1Var);
        AbstractC3241g8.c(A02, d1Var);
        A02.writeString(str);
        A02.writeString(str2);
        AbstractC3241g8.e(A02, interfaceC3693od);
        G0(A02, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void M0(V2.a aVar, q2.d1 d1Var, String str, InterfaceC3693od interfaceC3693od) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.c(A02, d1Var);
        A02.writeString(str);
        AbstractC3241g8.e(A02, interfaceC3693od);
        G0(A02, 28);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void N1(V2.a aVar, InterfaceC2891Ze interfaceC2891Ze, List list) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.e(A02, interfaceC2891Ze);
        A02.writeStringList(list);
        G0(A02, 23);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void N2(V2.a aVar, q2.d1 d1Var, String str, InterfaceC3693od interfaceC3693od) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.c(A02, d1Var);
        A02.writeString(str);
        AbstractC3241g8.e(A02, interfaceC3693od);
        G0(A02, 32);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final C3801qd P() {
        C3801qd c3801qd;
        Parcel D02 = D0(A0(), 15);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c3801qd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            c3801qd = queryLocalInterface instanceof C3801qd ? (C3801qd) queryLocalInterface : new C3801qd(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper", 2);
        }
        D02.recycle();
        return c3801qd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void S1(boolean z8) {
        Parcel A02 = A0();
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        A02.writeInt(z8 ? 1 : 0);
        G0(A02, 25);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void T1(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 37);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void X1(V2.a aVar, InterfaceC4123wc interfaceC4123wc, ArrayList arrayList) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.e(A02, interfaceC4123wc);
        A02.writeTypedList(arrayList);
        G0(A02, 31);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void Z1(V2.a aVar, q2.d1 d1Var, InterfaceC2891Ze interfaceC2891Ze, String str) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.c(A02, d1Var);
        A02.writeString(null);
        AbstractC3241g8.e(A02, interfaceC2891Ze);
        A02.writeString(str);
        G0(A02, 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void a0(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void a1(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 39);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final V2.a f() {
        return CL.f(D0(A0(), 2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void g() {
        G0(A0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final C3747pd g0() {
        C3747pd c3747pd;
        Parcel D02 = D0(A0(), 36);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c3747pd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            c3747pd = queryLocalInterface instanceof C3747pd ? (C3747pd) queryLocalInterface : new C3747pd(readStrongBinder);
        }
        D02.recycle();
        return c3747pd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void g3(V2.a aVar, q2.g1 g1Var, q2.d1 d1Var, String str, String str2, InterfaceC3693od interfaceC3693od) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.c(A02, g1Var);
        AbstractC3241g8.c(A02, d1Var);
        A02.writeString(str);
        A02.writeString(str2);
        AbstractC3241g8.e(A02, interfaceC3693od);
        G0(A02, 35);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final C3854rd j0() {
        C3854rd c3854rd;
        Parcel D02 = D0(A0(), 16);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c3854rd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            c3854rd = queryLocalInterface instanceof C3854rd ? (C3854rd) queryLocalInterface : new C3854rd(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper", 2);
        }
        D02.recycle();
        return c3854rd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void j2(V2.a aVar, q2.d1 d1Var, String str, String str2, InterfaceC3693od interfaceC3693od) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.c(A02, d1Var);
        A02.writeString(str);
        A02.writeString(str2);
        AbstractC3241g8.e(A02, interfaceC3693od);
        G0(A02, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void k() {
        G0(A0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void l() {
        G0(A0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void m() {
        G0(A0(), 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final boolean n() {
        Parcel D02 = D0(A0(), 13);
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        boolean z8 = D02.readInt() != 0;
        D02.recycle();
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final C2754Rd n0() {
        Parcel D02 = D0(A0(), 34);
        C2754Rd c2754Rd = (C2754Rd) AbstractC3241g8.b(D02, C2754Rd.CREATOR);
        D02.recycle();
        return c2754Rd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void r1(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 30);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void y0(V2.a aVar, q2.d1 d1Var, String str, InterfaceC3693od interfaceC3693od) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.c(A02, d1Var);
        A02.writeString(str);
        AbstractC3241g8.e(A02, interfaceC3693od);
        G0(A02, 38);
    }
}
