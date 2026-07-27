package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import q2.AbstractBinderC4925y0;
import q2.InterfaceC4911r0;
import q2.InterfaceC4921w0;

/* renamed from: com.google.android.gms.internal.ads.Lb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2650Lb extends Z2.a implements InterfaceC2667Mb {
    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final InterfaceC3529lb B() {
        InterfaceC3529lb c3475kb;
        Parcel D02 = D0(A0(), 29);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c3475kb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            c3475kb = queryLocalInterface instanceof InterfaceC3529lb ? (InterfaceC3529lb) queryLocalInterface : new C3475kb(readStrongBinder);
        }
        D02.recycle();
        return c3475kb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final void I() {
        G0(A0(), 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final InterfaceC4921w0 K() {
        Parcel D02 = D0(A0(), 31);
        InterfaceC4921w0 G32 = BinderC3754pk.G3(D02.readStrongBinder());
        D02.recycle();
        return G32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final List R() {
        Parcel D02 = D0(A0(), 23);
        ArrayList readArrayList = D02.readArrayList(AbstractC3241g8.f30958a);
        D02.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final void Y2(InterfaceC4911r0 interfaceC4911r0) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, interfaceC4911r0);
        G0(A02, 32);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final String c() {
        Parcel D02 = D0(A0(), 2);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final String e() {
        Parcel D02 = D0(A0(), 4);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final List f() {
        Parcel D02 = D0(A0(), 3);
        ArrayList readArrayList = D02.readArrayList(AbstractC3241g8.f30958a);
        D02.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final InterfaceC3637nb g() {
        InterfaceC3637nb c3583mb;
        Parcel D02 = D0(A0(), 5);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c3583mb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c3583mb = queryLocalInterface instanceof InterfaceC3637nb ? (InterfaceC3637nb) queryLocalInterface : new C3583mb(readStrongBinder);
        }
        D02.recycle();
        return c3583mb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final String h() {
        Parcel D02 = D0(A0(), 7);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final double j() {
        Parcel D02 = D0(A0(), 8);
        double readDouble = D02.readDouble();
        D02.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final String k() {
        Parcel D02 = D0(A0(), 9);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final String l() {
        Parcel D02 = D0(A0(), 6);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final String m() {
        Parcel D02 = D0(A0(), 10);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final InterfaceC3421jb n() {
        InterfaceC3421jb c3315hb;
        Parcel D02 = D0(A0(), 14);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c3315hb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c3315hb = queryLocalInterface instanceof InterfaceC3421jb ? (InterfaceC3421jb) queryLocalInterface : new C3315hb(readStrongBinder);
        }
        D02.recycle();
        return c3315hb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final void n2(Bundle bundle) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, bundle);
        G0(A02, 33);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final q2.A0 p() {
        Parcel D02 = D0(A0(), 11);
        q2.A0 G32 = AbstractBinderC4925y0.G3(D02.readStrongBinder());
        D02.recycle();
        return G32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final V2.a u() {
        return CL.f(D0(A0(), 18));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2667Mb
    public final V2.a v() {
        return CL.f(D0(A0(), 19));
    }
}
