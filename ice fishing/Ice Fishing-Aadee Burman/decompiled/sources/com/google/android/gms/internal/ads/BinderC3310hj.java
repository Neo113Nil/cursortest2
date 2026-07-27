package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q2.InterfaceC4904r0;
import q2.InterfaceC4914w0;

/* renamed from: com.google.android.gms.internal.ads.hj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3310hj extends AbstractBinderC3336i8 implements N8 {

    /* renamed from: n, reason: collision with root package name */
    public final C3256gj f30922n;

    /* renamed from: u, reason: collision with root package name */
    public final q2.K f30923u;

    /* renamed from: v, reason: collision with root package name */
    public final C3266gt f30924v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f30925w;

    /* renamed from: x, reason: collision with root package name */
    public final C3153eo f30926x;

    public BinderC3310hj(C3256gj c3256gj, q2.K k9, C3266gt c3266gt, C3153eo c3153eo) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        this.f30922n = c3256gj;
        this.f30923u = k9;
        this.f30924v = c3266gt;
        this.f30926x = c3153eo;
        C3301ha c3301ha = AbstractC3569ma.f32307m1;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() && Build.VERSION.SDK_INT >= 35) {
            this.f30925w = true;
        } else {
            this.f30925w = ((Boolean) rVar.f40207c.a(AbstractC3569ma.n1)).booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void M3(W2.a aVar, R8 r82) {
        try {
            this.f30924v.f30672w.set(r82);
            this.f30922n.c((Activity) W2.b.F0(aVar), this.f30925w);
        } catch (RemoteException e9) {
            int i = u2.z.f41319b;
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void N0(InterfaceC4904r0 interfaceC4904r0) {
        P2.w.d("setOnPaidEventListener must be called on the main UI thread.");
        C3266gt c3266gt = this.f30924v;
        if (c3266gt != null) {
            try {
                if (!interfaceC4904r0.e()) {
                    this.f30926x.b();
                }
            } catch (RemoteException e9) {
                int i = u2.z.f41319b;
                v2.i.b("Error in making CSI ping for reporting paid event callback", e9);
            }
            c3266gt.f30675z.set(interfaceC4904r0);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        C3364ik c3364ik;
        C3364ik c3364ik2;
        R8 r82 = null;
        String str = null;
        q2.K k9 = this.f30923u;
        C3256gj c3256gj = this.f30922n;
        switch (i) {
            case 2:
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, k9);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                AbstractC3388j8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                W2.a w02 = W2.b.w0(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    r82 = queryLocalInterface instanceof R8 ? (R8) queryLocalInterface : new Q8(readStrongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback", 2);
                }
                AbstractC3388j8.f(parcel);
                M3(w02, r82);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC4914w0 h9 = h();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, h9);
                return true;
            case 6:
                boolean a9 = AbstractC3388j8.a(parcel);
                AbstractC3388j8.f(parcel);
                this.f30925w = a9;
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC4904r0 U3 = q2.U0.U3(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                N0(U3);
                parcel2.writeNoException();
                return true;
            case 8:
                try {
                    str = k9.N();
                } catch (RemoteException e9) {
                    int i6 = u2.z.f41319b;
                    v2.i.i("#007 Could not call remote method.", e9);
                }
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 9:
                long j6 = (c3256gj == null || (c3364ik = c3256gj.f24841j) == null) ? 0L : c3364ik.f31114a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j6);
                return true;
            case 10:
                long readLong = parcel.readLong();
                AbstractC3388j8.f(parcel);
                if (c3256gj != null && (c3364ik2 = c3256gj.f24841j) != null) {
                    c3364ik2.a(readLong);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final InterfaceC4914w0 h() {
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32021F7)).booleanValue()) {
            return this.f30922n.f24838f;
        }
        return null;
    }
}
