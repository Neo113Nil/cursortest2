package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n2.AbstractC4755f;

/* renamed from: com.google.android.gms.internal.ads.Dd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2517Dd extends AbstractBinderC3336i8 implements InterfaceC4111wd {

    /* renamed from: n, reason: collision with root package name */
    public final com.google.ads.mediation.a f24447n;

    public BinderC2517Dd(com.google.ads.mediation.a aVar) {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        this.f24447n = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final void E2() {
        this.f24447n.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final float M() {
        this.f24447n.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final boolean N() {
        return this.f24447n.f23541m;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                String str = this.f24447n.f23530a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List e9 = e();
                parcel2.writeNoException();
                parcel2.writeList(e9);
                return true;
            case 4:
                String str2 = this.f24447n.f23532c;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                InterfaceC3839rb g4 = g();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, g4);
                return true;
            case 6:
                String str3 = this.f24447n.f23534e;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                String str4 = this.f24447n.f23535f;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 8:
                double k9 = k();
                parcel2.writeNoException();
                parcel2.writeDouble(k9);
                return true;
            case 9:
                String str5 = this.f24447n.f23537h;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 10:
                String str6 = this.f24447n.i;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                return true;
            case 11:
                q2.A0 p9 = p();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, p9);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3388j8.f31199a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                r();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3388j8.f31199a;
                parcel2.writeStrongBinder(null);
                return true;
            case 14:
                m();
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC3388j8.f31199a;
                parcel2.writeStrongBinder(null);
                return true;
            case 15:
                W2.a w6 = w();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, w6);
                return true;
            case 16:
                Bundle l32 = l3();
                parcel2.writeNoException();
                AbstractC3388j8.d(parcel2, l32);
                return true;
            case 17:
                boolean z3 = this.f24447n.f23541m;
                parcel2.writeNoException();
                ClassLoader classLoader4 = AbstractC3388j8.f31199a;
                parcel2.writeInt(z3 ? 1 : 0);
                return true;
            case 18:
                boolean z6 = this.f24447n.f23542n;
                parcel2.writeNoException();
                ClassLoader classLoader5 = AbstractC3388j8.f31199a;
                parcel2.writeInt(z6 ? 1 : 0);
                return true;
            case 19:
                z0();
                parcel2.writeNoException();
                return true;
            case 20:
                W2.a w02 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                h0(w02);
                parcel2.writeNoException();
                return true;
            case 21:
                W2.a w03 = W2.b.w0(parcel.readStrongBinder());
                W2.a w04 = W2.b.w0(parcel.readStrongBinder());
                W2.a w05 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                a1(w03, w04, w05);
                parcel2.writeNoException();
                return true;
            case 22:
                W2.a w06 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                l2(w06);
                parcel2.writeNoException();
                return true;
            case 23:
                u();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                M();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 25:
                c0();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 26:
                E2();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final void a1(W2.a aVar, W2.a aVar2, W2.a aVar3) {
        View view = (View) W2.b.F0(aVar);
        this.f24447n.getClass();
        if (AbstractC4755f.f39471a.get(view) != null) {
            throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final float c0() {
        this.f24447n.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final String d() {
        return this.f24447n.f23530a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final List e() {
        ArrayList arrayList = this.f24447n.f23531b;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C3893sb c3893sb = (C3893sb) it.next();
                arrayList2.add(new BinderC3356ib(c3893sb.f33976b, c3893sb.f33977c, c3893sb.f33978d, c3893sb.f33979e, c3893sb.f33980f, null));
            }
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final InterfaceC3839rb g() {
        C3893sb c3893sb = this.f24447n.f23533d;
        if (c3893sb == null) {
            return null;
        }
        return new BinderC3356ib(c3893sb.f33976b, c3893sb.f33977c, c3893sb.f33978d, c3893sb.f33979e, c3893sb.f33980f, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final String h() {
        return this.f24447n.f23532c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final void h0(W2.a aVar) {
        this.f24447n.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final String j() {
        return this.f24447n.f23535f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final double k() {
        Double d2 = this.f24447n.f23536g;
        if (d2 != null) {
            return d2.doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final String l() {
        return this.f24447n.f23537h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final void l2(W2.a aVar) {
        this.f24447n.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final Bundle l3() {
        return this.f24447n.f23540l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final W2.a m() {
        this.f24447n.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final String n() {
        return this.f24447n.f23534e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final boolean n1() {
        return this.f24447n.f23542n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final q2.A0 p() {
        q2.A0 a02;
        k2.v vVar = this.f24447n.f23538j;
        if (vVar == null) {
            return null;
        }
        synchronized (vVar.f38616a) {
            a02 = vVar.f38617b;
        }
        return a02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final String q() {
        return this.f24447n.i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final W2.a r() {
        this.f24447n.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final InterfaceC3624nb s() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final float u() {
        this.f24447n.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final W2.a w() {
        Object obj = this.f24447n.f23539k;
        if (obj == null) {
            return null;
        }
        return new W2.b(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111wd
    public final void z0() {
        this.f24447n.getClass();
    }
}
