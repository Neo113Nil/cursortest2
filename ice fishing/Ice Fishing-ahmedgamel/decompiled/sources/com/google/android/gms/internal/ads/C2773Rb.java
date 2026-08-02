package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import s2.C4934h0;

/* renamed from: com.google.android.gms.internal.ads.Rb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2773Rb extends B1.b {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f27971w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2773Rb(String str, int i) {
        super(2, str);
        this.f27971w = i;
    }

    @Override // B1.b
    public final /* synthetic */ Object h(IBinder iBinder) {
        switch (this.f27971w) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                return queryLocalInterface instanceof InterfaceC4294zb ? (InterfaceC4294zb) queryLocalInterface : new C4186xb(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return queryLocalInterface2 instanceof InterfaceC3758pe ? (InterfaceC3758pe) queryLocalInterface2 : new C3650ne(iBinder);
            case 2:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return queryLocalInterface3 instanceof C4934h0 ? (C4934h0) queryLocalInterface3 : new C4934h0(iBinder);
            case 3:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return queryLocalInterface4 instanceof s2.H ? (s2.H) queryLocalInterface4 : new s2.H(iBinder);
            case 4:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return queryLocalInterface5 instanceof s2.L ? (s2.L) queryLocalInterface5 : new s2.L(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface6 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                return queryLocalInterface6 instanceof s2.T ? (s2.T) queryLocalInterface6 : new s2.T(iBinder);
        }
    }

    public s2.K s(Context context, s2.f1 f1Var, String str, InterfaceC3595md interfaceC3595md, int i) {
        s2.L l9;
        s2.f1 f1Var2;
        String str2;
        InterfaceC3595md interfaceC3595md2;
        int i4;
        AbstractC3592ma.a(context);
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.cc)).booleanValue()) {
            try {
                Y2.b bVar = new Y2.b(context);
                try {
                    IBinder b9 = com.bumptech.glide.e.y(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (b9 == null) {
                        f1Var2 = f1Var;
                        str2 = str;
                        interfaceC3595md2 = interfaceC3595md;
                        i4 = i;
                        l9 = null;
                    } else {
                        IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        l9 = queryLocalInterface instanceof s2.L ? (s2.L) queryLocalInterface : new s2.L(b9);
                        f1Var2 = f1Var;
                        str2 = str;
                        interfaceC3595md2 = interfaceC3595md;
                        i4 = i;
                    }
                    IBinder r1 = l9.r1(bVar, f1Var2, str2, interfaceC3595md2, i4);
                    if (r1 != null) {
                        IInterface queryLocalInterface2 = r1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        return queryLocalInterface2 instanceof s2.K ? (s2.K) queryLocalInterface2 : new s2.I(r1);
                    }
                } catch (Exception e9) {
                    throw new x2.j(e9);
                }
            } catch (RemoteException e10) {
                e = e10;
                Exception exc = e;
                C2521Ce.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", exc);
                x2.i.i("#007 Could not call remote method.", exc);
                return null;
            } catch (NullPointerException e11) {
                e = e11;
                Exception exc2 = e;
                C2521Ce.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", exc2);
                x2.i.i("#007 Could not call remote method.", exc2);
                return null;
            } catch (x2.j e12) {
                e = e12;
                Exception exc22 = e;
                C2521Ce.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", exc22);
                x2.i.i("#007 Could not call remote method.", exc22);
                return null;
            }
        } else {
            try {
                IBinder r12 = ((s2.L) i(context)).r1(new Y2.b(context), f1Var, str, interfaceC3595md, i);
                if (r12 != null) {
                    IInterface queryLocalInterface3 = r12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return queryLocalInterface3 instanceof s2.K ? (s2.K) queryLocalInterface3 : new s2.I(r12);
                }
            } catch (Y2.c e13) {
                e = e13;
                x2.i.b("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteException e14) {
                e = e14;
                x2.i.b("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }
}
