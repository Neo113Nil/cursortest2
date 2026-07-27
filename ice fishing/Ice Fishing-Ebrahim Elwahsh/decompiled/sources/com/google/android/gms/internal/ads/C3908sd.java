package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import q2.AbstractBinderC4925y0;

/* renamed from: com.google.android.gms.internal.ads.sd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3908sd extends Z2.a implements InterfaceC3962td {
    public C3908sd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final float H() {
        Parcel D02 = D0(A0(), 25);
        float readFloat = D02.readFloat();
        D02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final void J() {
        G0(A0(), 26);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final float L() {
        Parcel D02 = D0(A0(), 24);
        float readFloat = D02.readFloat();
        D02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final boolean M() {
        Parcel D02 = D0(A0(), 17);
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        boolean z8 = D02.readInt() != 0;
        D02.recycle();
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final float R() {
        Parcel D02 = D0(A0(), 23);
        float readFloat = D02.readFloat();
        D02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final void S0(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 22);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final void U2(V2.a aVar, V2.a aVar2, V2.a aVar3) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.e(A02, aVar2);
        AbstractC3241g8.e(A02, aVar3);
        G0(A02, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final void a0(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 20);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final String c() {
        Parcel D02 = D0(A0(), 2);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final Bundle c3() {
        Parcel D02 = D0(A0(), 16);
        Bundle bundle = (Bundle) AbstractC3241g8.b(D02, Bundle.CREATOR);
        D02.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final String e() {
        Parcel D02 = D0(A0(), 4);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final List f() {
        Parcel D02 = D0(A0(), 3);
        ArrayList readArrayList = D02.readArrayList(AbstractC3241g8.f30958a);
        D02.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final InterfaceC3637nb g() {
        Parcel D02 = D0(A0(), 5);
        InterfaceC3637nb G32 = BinderC3098db.G3(D02.readStrongBinder());
        D02.recycle();
        return G32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final String h() {
        Parcel D02 = D0(A0(), 7);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final double j() {
        Parcel D02 = D0(A0(), 8);
        double readDouble = D02.readDouble();
        D02.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final String k() {
        Parcel D02 = D0(A0(), 9);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final String l() {
        Parcel D02 = D0(A0(), 6);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final String m() {
        Parcel D02 = D0(A0(), 10);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final V2.a n() {
        return CL.f(D0(A0(), 14));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final q2.A0 p() {
        Parcel D02 = D0(A0(), 11);
        q2.A0 G32 = AbstractBinderC4925y0.G3(D02.readStrongBinder());
        D02.recycle();
        return G32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final InterfaceC3421jb q() {
        Parcel D02 = D0(A0(), 12);
        InterfaceC3421jb G32 = AbstractBinderC3369ib.G3(D02.readStrongBinder());
        D02.recycle();
        return G32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final V2.a r() {
        return CL.f(D0(A0(), 13));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final V2.a t() {
        return CL.f(D0(A0(), 15));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final boolean t1() {
        Parcel D02 = D0(A0(), 18);
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        boolean z8 = D02.readInt() != 0;
        D02.recycle();
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final void v() {
        G0(A0(), 19);
    }
}
