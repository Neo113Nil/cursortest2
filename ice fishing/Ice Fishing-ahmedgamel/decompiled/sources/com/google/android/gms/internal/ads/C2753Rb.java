package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import q2.C4885h0;

/* renamed from: com.google.android.gms.internal.ads.Rb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2753Rb extends E2.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f27287w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2753Rb(String str, int i) {
        super(1, str);
        this.f27287w = i;
    }

    @Override // E2.a
    public final /* synthetic */ Object h(IBinder iBinder) {
        switch (this.f27287w) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                return queryLocalInterface instanceof InterfaceC4271zb ? (InterfaceC4271zb) queryLocalInterface : new C4163xb(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return queryLocalInterface2 instanceof InterfaceC3735pe ? (InterfaceC3735pe) queryLocalInterface2 : new C3627ne(iBinder);
            case 2:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return queryLocalInterface3 instanceof C4885h0 ? (C4885h0) queryLocalInterface3 : new C4885h0(iBinder);
            case 3:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return queryLocalInterface4 instanceof q2.H ? (q2.H) queryLocalInterface4 : new q2.H(iBinder);
            case 4:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return queryLocalInterface5 instanceof q2.L ? (q2.L) queryLocalInterface5 : new q2.L(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface6 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                return queryLocalInterface6 instanceof q2.T ? (q2.T) queryLocalInterface6 : new q2.T(iBinder);
        }
    }

    public q2.K s(Context context, q2.f1 f1Var, String str, InterfaceC3572md interfaceC3572md, int i) {
        q2.L l9;
        q2.f1 f1Var2;
        String str2;
        InterfaceC3572md interfaceC3572md2;
        int i6;
        AbstractC3569ma.a(context);
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.cc)).booleanValue()) {
            try {
                W2.b bVar = new W2.b(context);
                try {
                    IBinder b9 = com.bumptech.glide.f.D(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (b9 == null) {
                        f1Var2 = f1Var;
                        str2 = str;
                        interfaceC3572md2 = interfaceC3572md;
                        i6 = i;
                        l9 = null;
                    } else {
                        IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        l9 = queryLocalInterface instanceof q2.L ? (q2.L) queryLocalInterface : new q2.L(b9);
                        f1Var2 = f1Var;
                        str2 = str;
                        interfaceC3572md2 = interfaceC3572md;
                        i6 = i;
                    }
                    IBinder t12 = l9.t1(bVar, f1Var2, str2, interfaceC3572md2, i6);
                    if (t12 != null) {
                        IInterface queryLocalInterface2 = t12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        return queryLocalInterface2 instanceof q2.K ? (q2.K) queryLocalInterface2 : new q2.I(t12);
                    }
                } catch (Exception e9) {
                    throw new v2.j(e9);
                }
            } catch (RemoteException e10) {
                e = e10;
                Exception exc = e;
                C2501Ce.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", exc);
                v2.i.i("#007 Could not call remote method.", exc);
                return null;
            } catch (NullPointerException e11) {
                e = e11;
                Exception exc2 = e;
                C2501Ce.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", exc2);
                v2.i.i("#007 Could not call remote method.", exc2);
                return null;
            } catch (v2.j e12) {
                e = e12;
                Exception exc22 = e;
                C2501Ce.a(context).e("AdManagerCreator.newAdManagerByDynamiteLoader", exc22);
                v2.i.i("#007 Could not call remote method.", exc22);
                return null;
            }
        } else {
            try {
                IBinder t13 = ((q2.L) j(context)).t1(new W2.b(context), f1Var, str, interfaceC3572md, i);
                if (t13 != null) {
                    IInterface queryLocalInterface3 = t13.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return queryLocalInterface3 instanceof q2.K ? (q2.K) queryLocalInterface3 : new q2.I(t13);
                }
            } catch (W2.c e13) {
                e = e13;
                v2.i.b("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteException e14) {
                e = e14;
                v2.i.b("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }
}
