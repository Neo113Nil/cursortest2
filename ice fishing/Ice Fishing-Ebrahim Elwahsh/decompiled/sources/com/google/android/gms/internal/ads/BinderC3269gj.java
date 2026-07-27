package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q2.InterfaceC4911r0;
import q2.InterfaceC4921w0;

/* renamed from: com.google.android.gms.internal.ads.gj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3269gj extends AbstractBinderC3186f8 implements K8 {

    /* renamed from: n, reason: collision with root package name */
    public final C3215fj f31093n;

    /* renamed from: u, reason: collision with root package name */
    public final q2.K f31094u;

    /* renamed from: v, reason: collision with root package name */
    public final C3439jt f31095v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f31096w;

    /* renamed from: x, reason: collision with root package name */
    public final C3165eo f31097x;

    public BinderC3269gj(C3215fj c3215fj, q2.K k6, C3439jt c3439jt, C3165eo c3165eo) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        this.f31093n = c3215fj;
        this.f31094u = k6;
        this.f31095v = c3439jt;
        this.f31097x = c3165eo;
        C3151ea c3151ea = AbstractC3368ia.f31726m1;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && Build.VERSION.SDK_INT >= 35) {
            this.f31096w = true;
        } else {
            this.f31096w = ((Boolean) rVar.f40119c.a(AbstractC3368ia.n1)).booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.K8
    public final void E0(InterfaceC4911r0 interfaceC4911r0) {
        O2.w.d("setOnPaidEventListener must be called on the main UI thread.");
        C3439jt c3439jt = this.f31095v;
        if (c3439jt != null) {
            try {
                if (!interfaceC4911r0.f()) {
                    this.f31097x.b();
                }
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.b("Error in making CSI ping for reporting paid event callback", e6);
            }
            c3439jt.f32217z.set(interfaceC4911r0);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        C3270gk c3270gk;
        C3270gk c3270gk2;
        O8 o82 = null;
        String str = null;
        q2.K k6 = this.f31094u;
        C3215fj c3215fj = this.f31093n;
        switch (i) {
            case 2:
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, k6);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                AbstractC3241g8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                V2.a u02 = V2.b.u0(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    o82 = queryLocalInterface instanceof O8 ? (O8) queryLocalInterface : new N8(readStrongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback", 2);
                }
                AbstractC3241g8.f(parcel);
                P1(u02, o82);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC4921w0 e6 = e();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, e6);
                return true;
            case 6:
                boolean a9 = AbstractC3241g8.a(parcel);
                AbstractC3241g8.f(parcel);
                this.f31096w = a9;
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC4911r0 G32 = q2.V0.G3(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                E0(G32);
                parcel2.writeNoException();
                return true;
            case 8:
                try {
                    str = k6.u();
                } catch (RemoteException e9) {
                    int i4 = t2.C.f40822b;
                    u2.i.i("#007 Could not call remote method.", e9);
                }
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 9:
                long j9 = (c3215fj == null || (c3270gk = c3215fj.f24811j) == null) ? 0L : c3270gk.f31098a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j9);
                return true;
            case 10:
                long readLong = parcel.readLong();
                AbstractC3241g8.f(parcel);
                if (c3215fj != null && (c3270gk2 = c3215fj.f24811j) != null) {
                    c3270gk2.a(readLong);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.K8
    public final void P1(V2.a aVar, O8 o82) {
        try {
            this.f31095v.f32214w.set(o82);
            this.f31093n.c((Activity) V2.b.A0(aVar), this.f31096w);
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.K8
    public final InterfaceC4921w0 e() {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31441F7)).booleanValue()) {
            return this.f31093n.f24808f;
        }
        return null;
    }
}
