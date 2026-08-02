package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c3.AbstractC0549a;
import java.util.ArrayList;
import java.util.List;
import s2.AbstractBinderC4967y0;
import s2.InterfaceC4953r0;
import s2.InterfaceC4963w0;

/* renamed from: com.google.android.gms.internal.ads.Pb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2739Pb extends AbstractC0549a implements InterfaceC2756Qb {
    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final Y2.a B() {
        return Wv.e(K0(F0(), 19));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final void I() {
        d1(F0(), 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final InterfaceC3755pb P() {
        InterfaceC3755pb c3701ob;
        Parcel K02 = K0(F0(), 29);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c3701ob = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            c3701ob = queryLocalInterface instanceof InterfaceC3755pb ? (InterfaceC3755pb) queryLocalInterface : new C3701ob(readStrongBinder);
        }
        K02.recycle();
        return c3701ob;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final void a1(InterfaceC4953r0 interfaceC4953r0) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, interfaceC4953r0);
        d1(F02, 32);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final String d() {
        Parcel K02 = K0(F0(), 2);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final List e() {
        Parcel K02 = K0(F0(), 3);
        ArrayList readArrayList = K02.readArrayList(AbstractC3411j8.f31986a);
        K02.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final InterfaceC3862rb g() {
        InterfaceC3862rb c3809qb;
        Parcel K02 = K0(F0(), 5);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c3809qb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c3809qb = queryLocalInterface instanceof InterfaceC3862rb ? (InterfaceC3862rb) queryLocalInterface : new C3809qb(readStrongBinder);
        }
        K02.recycle();
        return c3809qb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final String h() {
        Parcel K02 = K0(F0(), 4);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final InterfaceC4963w0 i0() {
        Parcel K02 = K0(F0(), 31);
        InterfaceC4963w0 U32 = BinderC3871rk.U3(K02.readStrongBinder());
        K02.recycle();
        return U32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final String j() {
        Parcel K02 = K0(F0(), 7);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final double k() {
        Parcel K02 = K0(F0(), 8);
        double readDouble = K02.readDouble();
        K02.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final String l() {
        Parcel K02 = K0(F0(), 9);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final InterfaceC3647nb m() {
        InterfaceC3647nb c3539lb;
        Parcel K02 = K0(F0(), 14);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c3539lb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c3539lb = queryLocalInterface instanceof InterfaceC3647nb ? (InterfaceC3647nb) queryLocalInterface : new C3539lb(readStrongBinder);
        }
        K02.recycle();
        return c3539lb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final String n() {
        Parcel K02 = K0(F0(), 6);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final void n2(Bundle bundle) {
        Parcel F02 = F0();
        AbstractC3411j8.c(F02, bundle);
        d1(F02, 33);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final s2.A0 p() {
        Parcel K02 = K0(F0(), 11);
        s2.A0 U32 = AbstractBinderC4967y0.U3(K02.readStrongBinder());
        K02.recycle();
        return U32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final String q() {
        Parcel K02 = K0(F0(), 10);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final List u() {
        Parcel K02 = K0(F0(), 23);
        ArrayList readArrayList = K02.readArrayList(AbstractC3411j8.f31986a);
        K02.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2756Qb
    public final Y2.a y() {
        return Wv.e(K0(F0(), 18));
    }
}
