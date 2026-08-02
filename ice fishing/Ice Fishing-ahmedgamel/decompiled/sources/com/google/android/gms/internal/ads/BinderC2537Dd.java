package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p2.AbstractC4835f;

/* renamed from: com.google.android.gms.internal.ads.Dd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2537Dd extends AbstractBinderC3359i8 implements InterfaceC4134wd {

    /* renamed from: n, reason: collision with root package name */
    public final com.google.ads.mediation.a f25194n;

    public BinderC2537Dd(com.google.ads.mediation.a aVar) {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        this.f25194n = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final void B2() {
        this.f25194n.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final float L() {
        this.f25194n.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final boolean N() {
        return this.f25194n.f24326m;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                String str = this.f25194n.f24315a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List e9 = e();
                parcel2.writeNoException();
                parcel2.writeList(e9);
                return true;
            case 4:
                String str2 = this.f25194n.f24317c;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                InterfaceC3862rb g9 = g();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, g9);
                return true;
            case 6:
                String str3 = this.f25194n.f24319e;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                String str4 = this.f25194n.f24320f;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 8:
                double k9 = k();
                parcel2.writeNoException();
                parcel2.writeDouble(k9);
                return true;
            case 9:
                String str5 = this.f25194n.f24322h;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 10:
                String str6 = this.f25194n.i;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                return true;
            case 11:
                s2.A0 p9 = p();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, p9);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3411j8.f31986a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                r();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3411j8.f31986a;
                parcel2.writeStrongBinder(null);
                return true;
            case 14:
                m();
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC3411j8.f31986a;
                parcel2.writeStrongBinder(null);
                return true;
            case 15:
                Y2.a w3 = w();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, w3);
                return true;
            case 16:
                Bundle f32 = f3();
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, f32);
                return true;
            case 17:
                boolean z6 = this.f25194n.f24326m;
                parcel2.writeNoException();
                ClassLoader classLoader4 = AbstractC3411j8.f31986a;
                parcel2.writeInt(z6 ? 1 : 0);
                return true;
            case 18:
                boolean z9 = this.f25194n.f24327n;
                parcel2.writeNoException();
                ClassLoader classLoader5 = AbstractC3411j8.f31986a;
                parcel2.writeInt(z9 ? 1 : 0);
                return true;
            case 19:
                v0();
                parcel2.writeNoException();
                return true;
            case 20:
                Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                Y(t02);
                parcel2.writeNoException();
                return true;
            case 21:
                Y2.a t03 = Y2.b.t0(parcel.readStrongBinder());
                Y2.a t04 = Y2.b.t0(parcel.readStrongBinder());
                Y2.a t05 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                X0(t03, t04, t05);
                parcel2.writeNoException();
                return true;
            case 22:
                Y2.a t06 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                W2(t06);
                parcel2.writeNoException();
                return true;
            case 23:
                u();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                L();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 25:
                c0();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 26:
                B2();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final void W2(Y2.a aVar) {
        this.f25194n.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final void X0(Y2.a aVar, Y2.a aVar2, Y2.a aVar3) {
        View view = (View) Y2.b.D0(aVar);
        this.f25194n.getClass();
        if (AbstractC4835f.f39811a.get(view) != null) {
            throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final void Y(Y2.a aVar) {
        this.f25194n.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final float c0() {
        this.f25194n.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final String d() {
        return this.f25194n.f24315a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final List e() {
        ArrayList arrayList = this.f25194n.f24316b;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C3916sb c3916sb = (C3916sb) it.next();
                arrayList2.add(new BinderC3379ib(c3916sb.f34742b, c3916sb.f34743c, c3916sb.f34744d, c3916sb.f34745e, c3916sb.f34746f, null));
            }
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final Bundle f3() {
        return this.f25194n.f24325l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final InterfaceC3862rb g() {
        C3916sb c3916sb = this.f25194n.f24318d;
        if (c3916sb == null) {
            return null;
        }
        return new BinderC3379ib(c3916sb.f34742b, c3916sb.f34743c, c3916sb.f34744d, c3916sb.f34745e, c3916sb.f34746f, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final String h() {
        return this.f25194n.f24317c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final String j() {
        return this.f25194n.f24320f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final double k() {
        Double d9 = this.f25194n.f24321g;
        if (d9 != null) {
            return d9.doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final String l() {
        return this.f25194n.f24322h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final Y2.a m() {
        this.f25194n.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final boolean m1() {
        return this.f25194n.f24327n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final String n() {
        return this.f25194n.f24319e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final s2.A0 p() {
        s2.A0 a02;
        m2.v vVar = this.f25194n.f24323j;
        if (vVar == null) {
            return null;
        }
        synchronized (vVar.f39405a) {
            a02 = vVar.f39406b;
        }
        return a02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final String q() {
        return this.f25194n.i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final Y2.a r() {
        this.f25194n.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final InterfaceC3647nb s() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final float u() {
        this.f25194n.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final void v0() {
        this.f25194n.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4134wd
    public final Y2.a w() {
        Object obj = this.f25194n.f24324k;
        if (obj == null) {
            return null;
        }
        return new Y2.b(obj);
    }
}
