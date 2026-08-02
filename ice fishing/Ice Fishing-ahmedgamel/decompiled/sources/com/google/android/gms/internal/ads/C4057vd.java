package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.util.ArrayList;
import java.util.List;
import q2.AbstractBinderC4918y0;

/* renamed from: com.google.android.gms.internal.ads.vd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4057vd extends AbstractC0432a implements InterfaceC4111wd {
    public C4057vd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final void E2() {
        f1(H0(), 26);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final float M() {
        Parcel M02 = M0(H0(), 24);
        float readFloat = M02.readFloat();
        M02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final boolean N() {
        Parcel M02 = M0(H0(), 17);
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        boolean z3 = M02.readInt() != 0;
        M02.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final void a1(W2.a aVar, W2.a aVar2, W2.a aVar3) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.e(H02, aVar2);
        AbstractC3388j8.e(H02, aVar3);
        f1(H02, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final float c0() {
        Parcel M02 = M0(H0(), 25);
        float readFloat = M02.readFloat();
        M02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final String d() {
        Parcel M02 = M0(H0(), 2);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final List e() {
        Parcel M02 = M0(H0(), 3);
        ArrayList readArrayList = M02.readArrayList(AbstractC3388j8.f31199a);
        M02.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final InterfaceC3839rb g() {
        Parcel M02 = M0(H0(), 5);
        InterfaceC3839rb U3 = BinderC3356ib.U3(M02.readStrongBinder());
        M02.recycle();
        return U3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final String h() {
        Parcel M02 = M0(H0(), 4);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final void h0(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 20);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final String j() {
        Parcel M02 = M0(H0(), 7);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final double k() {
        Parcel M02 = M0(H0(), 8);
        double readDouble = M02.readDouble();
        M02.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final String l() {
        Parcel M02 = M0(H0(), 9);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final void l2(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 22);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final Bundle l3() {
        Parcel M02 = M0(H0(), 16);
        Bundle bundle = (Bundle) AbstractC3388j8.b(M02, Bundle.CREATOR);
        M02.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final W2.a m() {
        return AbstractC4404f.c(M0(H0(), 14));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final String n() {
        Parcel M02 = M0(H0(), 6);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final boolean n1() {
        Parcel M02 = M0(H0(), 18);
        ClassLoader classLoader = AbstractC3388j8.f31199a;
        boolean z3 = M02.readInt() != 0;
        M02.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final q2.A0 p() {
        Parcel M02 = M0(H0(), 11);
        q2.A0 U3 = AbstractBinderC4918y0.U3(M02.readStrongBinder());
        M02.recycle();
        return U3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final String q() {
        Parcel M02 = M0(H0(), 10);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final W2.a r() {
        return AbstractC4404f.c(M0(H0(), 13));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final InterfaceC3624nb s() {
        Parcel M02 = M0(H0(), 12);
        InterfaceC3624nb U3 = AbstractBinderC3570mb.U3(M02.readStrongBinder());
        M02.recycle();
        return U3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final float u() {
        Parcel M02 = M0(H0(), 23);
        float readFloat = M02.readFloat();
        M02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final W2.a w() {
        return AbstractC4404f.c(M0(H0(), 15));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final void z0() {
        f1(H0(), 19);
    }
}
