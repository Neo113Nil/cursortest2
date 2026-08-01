package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.util.ArrayList;
import java.util.List;
import q2.AbstractBinderC4918y0;
import q2.InterfaceC4904r0;
import q2.InterfaceC4914w0;

/* renamed from: com.google.android.gms.internal.ads.Pb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2719Pb extends AbstractC0432a implements InterfaceC2736Qb {
    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final W2.a B() {
        return AbstractC4404f.c(M0(H0(), 19));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final void J() {
        f1(H0(), 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final InterfaceC3732pb P() {
        InterfaceC3732pb c3678ob;
        Parcel M02 = M0(H0(), 29);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c3678ob = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            c3678ob = queryLocalInterface instanceof InterfaceC3732pb ? (InterfaceC3732pb) queryLocalInterface : new C3678ob(readStrongBinder);
        }
        M02.recycle();
        return c3678ob;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final String d() {
        Parcel M02 = M0(H0(), 2);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final List e() {
        Parcel M02 = M0(H0(), 3);
        ArrayList readArrayList = M02.readArrayList(AbstractC3388j8.f31199a);
        M02.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final InterfaceC3839rb g() {
        InterfaceC3839rb c3786qb;
        Parcel M02 = M0(H0(), 5);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c3786qb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c3786qb = queryLocalInterface instanceof InterfaceC3839rb ? (InterfaceC3839rb) queryLocalInterface : new C3786qb(readStrongBinder);
        }
        M02.recycle();
        return c3786qb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final String h() {
        Parcel M02 = M0(H0(), 4);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final void h3(InterfaceC4904r0 interfaceC4904r0) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, interfaceC4904r0);
        f1(H02, 32);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final InterfaceC4914w0 i0() {
        Parcel M02 = M0(H0(), 31);
        InterfaceC4914w0 U3 = BinderC3848rk.U3(M02.readStrongBinder());
        M02.recycle();
        return U3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final String j() {
        Parcel M02 = M0(H0(), 7);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final double k() {
        Parcel M02 = M0(H0(), 8);
        double readDouble = M02.readDouble();
        M02.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final String l() {
        Parcel M02 = M0(H0(), 9);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final InterfaceC3624nb m() {
        InterfaceC3624nb c3516lb;
        Parcel M02 = M0(H0(), 14);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c3516lb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c3516lb = queryLocalInterface instanceof InterfaceC3624nb ? (InterfaceC3624nb) queryLocalInterface : new C3516lb(readStrongBinder);
        }
        M02.recycle();
        return c3516lb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final String n() {
        Parcel M02 = M0(H0(), 6);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final q2.A0 p() {
        Parcel M02 = M0(H0(), 11);
        q2.A0 U3 = AbstractBinderC4918y0.U3(M02.readStrongBinder());
        M02.recycle();
        return U3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final String q() {
        Parcel M02 = M0(H0(), 10);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final void s2(Bundle bundle) {
        Parcel H02 = H0();
        AbstractC3388j8.c(H02, bundle);
        f1(H02, 33);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final List u() {
        Parcel M02 = M0(H0(), 23);
        ArrayList readArrayList = M02.readArrayList(AbstractC3388j8.f31199a);
        M02.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2736Qb
    public final W2.a y() {
        return AbstractC4404f.c(M0(H0(), 18));
    }
}
