package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.util.ArrayList;
import java.util.List;
import q2.AbstractBinderC4918y0;

/* renamed from: com.google.android.gms.internal.ads.nd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3626nd extends AbstractC0432a implements InterfaceC3680od {
    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void D2(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 30);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final boolean I() {
        Parcel M02 = M0(H0(), 22);
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        boolean z3 = M02.readInt() != 0;
        M02.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void I3(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 37);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void J() {
        f1(H0(), 12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final InterfaceC4111wd K() {
        InterfaceC4111wd c4057vd;
        Parcel M02 = M0(H0(), 27);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c4057vd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            c4057vd = queryLocalInterface instanceof InterfaceC4111wd ? (InterfaceC4111wd) queryLocalInterface : new C4057vd(readStrongBinder);
        }
        M02.recycle();
        return c4057vd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void M1(W2.a aVar, InterfaceC3037cf interfaceC3037cf, List list) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.e(H02, interfaceC3037cf);
        H02.writeStringList(list);
        f1(H02, 23);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void P2(String str, q2.c1 c1Var) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, c1Var);
        H02.writeString(str);
        f1(H02, 11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void Q1(boolean z3) {
        Parcel H02 = H0();
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        H02.writeInt(z3 ? 1 : 0);
        f1(H02, 25);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final C3949td R() {
        C3949td c3949td;
        Parcel M02 = M0(H0(), 15);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c3949td = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            c3949td = queryLocalInterface instanceof C3949td ? (C3949td) queryLocalInterface : new C3949td(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper", 2);
        }
        M02.recycle();
        return c3949td;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void V2(W2.a aVar, q2.c1 c1Var, String str, InterfaceC3841rd interfaceC3841rd) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.c(H02, c1Var);
        H02.writeString(str);
        AbstractC3388j8.e(H02, interfaceC3841rd);
        f1(H02, 28);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void W2() {
        f1(H0(), 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void Y1(W2.a aVar, q2.c1 c1Var, String str, String str2, InterfaceC3841rd interfaceC3841rd, C3462kb c3462kb, ArrayList arrayList) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.c(H02, c1Var);
        H02.writeString(str);
        H02.writeString(str2);
        AbstractC3388j8.e(H02, interfaceC3841rd);
        AbstractC3388j8.c(H02, c3462kb);
        H02.writeStringList(arrayList);
        f1(H02, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void b2(W2.a aVar, q2.c1 c1Var, InterfaceC3037cf interfaceC3037cf, String str) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.c(H02, c1Var);
        H02.writeString(null);
        AbstractC3388j8.e(H02, interfaceC3037cf);
        H02.writeString(str);
        f1(H02, 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final q2.A0 c0() {
        Parcel M02 = M0(H0(), 26);
        q2.A0 U3 = AbstractBinderC4918y0.U3(M02.readStrongBinder());
        M02.recycle();
        return U3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void c3(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 39);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final C3895sd d0() {
        C3895sd c3895sd;
        Parcel M02 = M0(H0(), 36);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c3895sd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            c3895sd = queryLocalInterface instanceof C3895sd ? (C3895sd) queryLocalInterface : new C3895sd(readStrongBinder);
        }
        M02.recycle();
        return c3895sd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final W2.a e() {
        return AbstractC4404f.c(M0(H0(), 2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void g() {
        f1(H0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final C4003ud g0() {
        C4003ud c4003ud;
        Parcel M02 = M0(H0(), 16);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c4003ud = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            c4003ud = queryLocalInterface instanceof C4003ud ? (C4003ud) queryLocalInterface : new C4003ud(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper", 2);
        }
        M02.recycle();
        return c4003ud;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void h0(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void h2(W2.a aVar, q2.c1 c1Var, String str, InterfaceC3841rd interfaceC3841rd) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.c(H02, c1Var);
        H02.writeString(str);
        AbstractC3388j8.e(H02, interfaceC3841rd);
        f1(H02, 38);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final C2804Ud i0() {
        Parcel M02 = M0(H0(), 33);
        C2804Ud c2804Ud = (C2804Ud) AbstractC3388j8.b(M02, C2804Ud.CREATOR);
        M02.recycle();
        return c2804Ud;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void j3(W2.a aVar, q2.f1 f1Var, q2.c1 c1Var, String str, String str2, InterfaceC3841rd interfaceC3841rd) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.c(H02, f1Var);
        AbstractC3388j8.c(H02, c1Var);
        H02.writeString(str);
        H02.writeString(str2);
        AbstractC3388j8.e(H02, interfaceC3841rd);
        f1(H02, 35);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final C2804Ud k0() {
        Parcel M02 = M0(H0(), 34);
        C2804Ud c2804Ud = (C2804Ud) AbstractC3388j8.b(M02, C2804Ud.CREATOR);
        M02.recycle();
        return c2804Ud;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void l() {
        f1(H0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void l1(W2.a aVar, InterfaceC2482Bc interfaceC2482Bc, ArrayList arrayList) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.e(H02, interfaceC2482Bc);
        H02.writeTypedList(arrayList);
        f1(H02, 31);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final boolean m() {
        Parcel M02 = M0(H0(), 13);
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        boolean z3 = M02.readInt() != 0;
        M02.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void n() {
        f1(H0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void q3(W2.a aVar, q2.c1 c1Var, String str, String str2, InterfaceC3841rd interfaceC3841rd) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.c(H02, c1Var);
        H02.writeString(str);
        H02.writeString(str2);
        AbstractC3388j8.e(H02, interfaceC3841rd);
        f1(H02, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void s1(W2.a aVar, q2.c1 c1Var, String str, InterfaceC3841rd interfaceC3841rd) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.c(H02, c1Var);
        H02.writeString(str);
        AbstractC3388j8.e(H02, interfaceC3841rd);
        f1(H02, 32);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void t2(W2.a aVar, q2.f1 f1Var, q2.c1 c1Var, String str, String str2, InterfaceC3841rd interfaceC3841rd) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.c(H02, f1Var);
        AbstractC3388j8.c(H02, c1Var);
        H02.writeString(str);
        H02.writeString(str2);
        AbstractC3388j8.e(H02, interfaceC3841rd);
        f1(H02, 6);
    }
}
