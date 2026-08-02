package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import s2.InterfaceC4953r0;
import s2.InterfaceC4963w0;

/* renamed from: com.google.android.gms.internal.ads.hj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3333hj extends AbstractBinderC3359i8 implements N8 {

    /* renamed from: n, reason: collision with root package name */
    public final C3279gj f31683n;

    /* renamed from: u, reason: collision with root package name */
    public final s2.K f31684u;

    /* renamed from: v, reason: collision with root package name */
    public final C3289gt f31685v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f31686w;

    /* renamed from: x, reason: collision with root package name */
    public final C3230fo f31687x;

    public BinderC3333hj(C3279gj c3279gj, s2.K k9, C3289gt c3289gt, C3230fo c3230fo) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        this.f31683n = c3279gj;
        this.f31684u = k9;
        this.f31685v = c3289gt;
        this.f31687x = c3230fo;
        C3324ha c3324ha = AbstractC3592ma.f33086m1;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && Build.VERSION.SDK_INT >= 35) {
            this.f31686w = true;
        } else {
            this.f31686w = ((Boolean) rVar.f40509c.a(AbstractC3592ma.f33096n1)).booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void O0(Y2.a aVar, R8 r82) {
        try {
            this.f31685v.f31441w.set(r82);
            this.f31683n.c((Activity) Y2.b.D0(aVar), this.f31686w);
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        C3387ik c3387ik;
        C3387ik c3387ik2;
        R8 r82 = null;
        String str = null;
        s2.K k9 = this.f31684u;
        C3279gj c3279gj = this.f31683n;
        switch (i) {
            case 2:
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, k9);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                AbstractC3411j8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    r82 = queryLocalInterface instanceof R8 ? (R8) queryLocalInterface : new Q8(readStrongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback", 1);
                }
                AbstractC3411j8.f(parcel);
                O0(t02, r82);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC4963w0 h3 = h();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, h3);
                return true;
            case 6:
                boolean a9 = AbstractC3411j8.a(parcel);
                AbstractC3411j8.f(parcel);
                this.f31686w = a9;
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC4953r0 U32 = s2.U0.U3(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                c3(U32);
                parcel2.writeNoException();
                return true;
            case 8:
                try {
                    str = k9.N();
                } catch (RemoteException e9) {
                    int i4 = w2.z.f41712b;
                    x2.i.i("#007 Could not call remote method.", e9);
                }
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 9:
                long j6 = (c3279gj == null || (c3387ik = c3279gj.f25630j) == null) ? 0L : c3387ik.f31884a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j6);
                return true;
            case 10:
                long readLong = parcel.readLong();
                AbstractC3411j8.f(parcel);
                if (c3279gj != null && (c3387ik2 = c3279gj.f25630j) != null) {
                    c3387ik2.a(readLong);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void c3(InterfaceC4953r0 interfaceC4953r0) {
        R2.w.d("setOnPaidEventListener must be called on the main UI thread.");
        C3289gt c3289gt = this.f31685v;
        if (c3289gt != null) {
            try {
                if (!interfaceC4953r0.e()) {
                    this.f31687x.b();
                }
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.b("Error in making CSI ping for reporting paid event callback", e9);
            }
            c3289gt.f31444z.set(interfaceC4953r0);
        }
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final InterfaceC4963w0 h() {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32802F7)).booleanValue()) {
            return this.f31683n.f25627f;
        }
        return null;
    }
}
