package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import java.util.ArrayList;
import java.util.List;
import s2.AbstractBinderC4967y0;

/* renamed from: com.google.android.gms.internal.ads.vd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4080vd extends AbstractC0549a implements InterfaceC4134wd {
    public C4080vd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final void B2() {
        d1(F0(), 26);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final float L() {
        Parcel K02 = K0(F0(), 24);
        float readFloat = K02.readFloat();
        K02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final boolean N() {
        Parcel K02 = K0(F0(), 17);
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        boolean z6 = K02.readInt() != 0;
        K02.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final void W2(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 22);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final void X0(Y2.a aVar, Y2.a aVar2, Y2.a aVar3) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.e(F02, aVar2);
        AbstractC3411j8.e(F02, aVar3);
        d1(F02, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final void Y(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 20);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final float c0() {
        Parcel K02 = K0(F0(), 25);
        float readFloat = K02.readFloat();
        K02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final String d() {
        Parcel K02 = K0(F0(), 2);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final List e() {
        Parcel K02 = K0(F0(), 3);
        ArrayList readArrayList = K02.readArrayList(AbstractC3411j8.f31986a);
        K02.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final Bundle f3() {
        Parcel K02 = K0(F0(), 16);
        Bundle bundle = (Bundle) AbstractC3411j8.b(K02, Bundle.CREATOR);
        K02.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final InterfaceC3862rb g() {
        Parcel K02 = K0(F0(), 5);
        InterfaceC3862rb U32 = BinderC3379ib.U3(K02.readStrongBinder());
        K02.recycle();
        return U32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final String h() {
        Parcel K02 = K0(F0(), 4);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final String j() {
        Parcel K02 = K0(F0(), 7);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final double k() {
        Parcel K02 = K0(F0(), 8);
        double readDouble = K02.readDouble();
        K02.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final String l() {
        Parcel K02 = K0(F0(), 9);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final Y2.a m() {
        return Wv.e(K0(F0(), 14));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final boolean m1() {
        Parcel K02 = K0(F0(), 18);
        ClassLoader classLoader = AbstractC3411j8.f31986a;
        boolean z6 = K02.readInt() != 0;
        K02.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final String n() {
        Parcel K02 = K0(F0(), 6);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final s2.A0 p() {
        Parcel K02 = K0(F0(), 11);
        s2.A0 U32 = AbstractBinderC4967y0.U3(K02.readStrongBinder());
        K02.recycle();
        return U32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final String q() {
        Parcel K02 = K0(F0(), 10);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final Y2.a r() {
        return Wv.e(K0(F0(), 13));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final InterfaceC3647nb s() {
        Parcel K02 = K0(F0(), 12);
        InterfaceC3647nb U32 = AbstractBinderC3593mb.U3(K02.readStrongBinder());
        K02.recycle();
        return U32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final float u() {
        Parcel K02 = K0(F0(), 23);
        float readFloat = K02.readFloat();
        K02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final void v0() {
        d1(F0(), 19);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final Y2.a w() {
        return Wv.e(K0(F0(), 15));
    }
}
