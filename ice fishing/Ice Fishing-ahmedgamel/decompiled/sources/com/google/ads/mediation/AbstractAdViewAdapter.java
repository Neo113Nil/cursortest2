package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.AbstractC2704Na;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.BinderC2790Sb;
import com.google.android.gms.internal.ads.BinderC2807Tb;
import com.google.android.gms.internal.ads.BinderC2824Ub;
import com.google.android.gms.internal.ads.C2520Cd;
import com.google.android.gms.internal.ads.C2655Kc;
import com.google.android.gms.internal.ads.C3485kb;
import com.google.android.gms.internal.ads.C3504ku;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import m2.e;
import m2.f;
import m2.g;
import m2.h;
import m2.j;
import m2.v;
import m2.w;
import m2.y;
import p2.C4832c;
import s2.A0;
import s2.C4949p;
import s2.E0;
import s2.G;
import s2.G0;
import s2.K;
import s2.Z0;
import s2.r;
import x2.AbstractC5190b;
import x2.d;
import x2.i;
import y2.AbstractC5205a;
import z2.InterfaceC5227d;
import z2.InterfaceC5231h;
import z2.l;
import z2.n;

/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private e adLoader;
    protected j mAdView;
    protected AbstractC5205a mInterstitialAd;

    public g buildAdRequest(Context context, InterfaceC5227d interfaceC5227d, Bundle bundle, Bundle bundle2) {
        f fVar = new f(3);
        Set d9 = interfaceC5227d.d();
        E0 e02 = (E0) fVar.f67u;
        if (d9 != null) {
            Iterator it = d9.iterator();
            while (it.hasNext()) {
                e02.f40310a.add((String) it.next());
            }
        }
        if (interfaceC5227d.c()) {
            d dVar = C4949p.f40498g.f40499a;
            e02.f40313d.add(d.c(context));
        }
        if (interfaceC5227d.a() != -1) {
            e02.f40319k = interfaceC5227d.a() != 1 ? 0 : 1;
        }
        e02.f40320l = interfaceC5227d.b();
        fVar.e(buildExtrasBundle(bundle, bundle2));
        return new g(fVar);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public AbstractC5205a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public A0 getVideoController() {
        A0 a02;
        j jVar = this.mAdView;
        if (jVar == null) {
            return null;
        }
        v vVar = jVar.f39393n.f40338c;
        synchronized (vVar.f39405a) {
            a02 = vVar.f39406b;
        }
        return a02;
    }

    public m2.d newAdLoader(Context context, String str) {
        return new m2.d(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, z2.InterfaceC5228e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        j jVar = this.mAdView;
        if (jVar != null) {
            jVar.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z6) {
        AbstractC5205a abstractC5205a = this.mInterstitialAd;
        if (abstractC5205a != null) {
            try {
                K k9 = ((C2655Kc) abstractC5205a).f26711c;
                if (k9 != null) {
                    k9.n0(z6);
                }
            } catch (RemoteException e9) {
                i.i("#007 Could not call remote method.", e9);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, z2.InterfaceC5228e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        j jVar = this.mAdView;
        if (jVar != null) {
            AbstractC3592ma.a(jVar.getContext());
            if (((Boolean) AbstractC2704Na.f27282g.r()).booleanValue()) {
                if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Ac)).booleanValue()) {
                    AbstractC5190b.f41851b.execute(new y(jVar, 0));
                    return;
                }
            }
            G0 g02 = jVar.f39393n;
            g02.getClass();
            try {
                K k9 = g02.i;
                if (k9 != null) {
                    k9.d();
                }
            } catch (RemoteException e9) {
                i.i("#007 Could not call remote method.", e9);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, z2.InterfaceC5228e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        j jVar = this.mAdView;
        if (jVar != null) {
            AbstractC3592ma.a(jVar.getContext());
            if (((Boolean) AbstractC2704Na.f27283h.r()).booleanValue()) {
                if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.yc)).booleanValue()) {
                    AbstractC5190b.f41851b.execute(new y(jVar, 1));
                    return;
                }
            }
            G0 g02 = jVar.f39393n;
            g02.getClass();
            try {
                K k9 = g02.i;
                if (k9 != null) {
                    k9.e();
                }
            } catch (RemoteException e9) {
                i.i("#007 Could not call remote method.", e9);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, InterfaceC5231h interfaceC5231h, Bundle bundle, h hVar, InterfaceC5227d interfaceC5227d, Bundle bundle2) {
        j jVar = new j(context);
        this.mAdView = jVar;
        jVar.setAdSize(new h(hVar.f39380a, hVar.f39381b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, interfaceC5231h));
        this.mAdView.b(buildAdRequest(context, interfaceC5227d, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, z2.j jVar, Bundle bundle, InterfaceC5227d interfaceC5227d, Bundle bundle2) {
        AbstractC5205a.b(context, getAdUnitId(bundle), buildAdRequest(context, interfaceC5227d, bundle2, bundle), new c(this, jVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, l lVar, Bundle bundle, n nVar, Bundle bundle2) {
        C4832c c4832c;
        C2.c cVar;
        Y0.b bVar = new Y0.b(1, this, lVar);
        m2.d newAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        newAdLoader.c(bVar);
        G g9 = newAdLoader.f39370b;
        C2520Cd c2520Cd = (C2520Cd) nVar;
        c2520Cd.getClass();
        C4832c c4832c2 = new C4832c();
        int i = 3;
        C3485kb c3485kb = c2520Cd.f24895d;
        if (c3485kb == null) {
            c4832c = new C4832c(c4832c2);
        } else {
            int i4 = c3485kb.f32248n;
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        c4832c2.f39807g = c3485kb.f32254z;
                        c4832c2.f39803c = c3485kb.f32244A;
                    }
                    c4832c2.f39801a = c3485kb.f32249u;
                    c4832c2.f39802b = c3485kb.f32250v;
                    c4832c2.f39804d = c3485kb.f32251w;
                    c4832c = new C4832c(c4832c2);
                }
                Z0 z02 = c3485kb.f32253y;
                if (z02 != null) {
                    c4832c2.f39806f = new w(z02);
                }
            }
            c4832c2.f39805e = c3485kb.f32252x;
            c4832c2.f39801a = c3485kb.f32249u;
            c4832c2.f39802b = c3485kb.f32250v;
            c4832c2.f39804d = c3485kb.f32251w;
            c4832c = new C4832c(c4832c2);
        }
        try {
            g9.H3(new C3485kb(c4832c));
        } catch (RemoteException e9) {
            i.g("Failed to specify native ad options", e9);
        }
        C2.c cVar2 = new C2.c();
        C3485kb c3485kb2 = c2520Cd.f24895d;
        if (c3485kb2 == null) {
            cVar = new C2.c(cVar2);
        } else {
            int i6 = c3485kb2.f32248n;
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        cVar2.f323f = c3485kb2.f32254z;
                        cVar2.f319b = c3485kb2.f32244A;
                        cVar2.f324g = c3485kb2.f32246C;
                        cVar2.f325h = c3485kb2.f32245B;
                        int i9 = c3485kb2.f32247D;
                        if (i9 != 0) {
                            if (i9 != 2) {
                                if (i9 == 1) {
                                    i = 2;
                                }
                            }
                            cVar2.i = i;
                        }
                        i = 1;
                        cVar2.i = i;
                    }
                    cVar2.f318a = c3485kb2.f32249u;
                    cVar2.f320c = c3485kb2.f32251w;
                    cVar = new C2.c(cVar2);
                }
                Z0 z03 = c3485kb2.f32253y;
                if (z03 != null) {
                    cVar2.f322e = new w(z03);
                }
            }
            cVar2.f321d = c3485kb2.f32252x;
            cVar2.f318a = c3485kb2.f32249u;
            cVar2.f320c = c3485kb2.f32251w;
            cVar = new C2.c(cVar2);
        }
        newAdLoader.d(cVar);
        ArrayList arrayList = c2520Cd.f24896e;
        if (arrayList.contains("6")) {
            try {
                g9.H2(new BinderC2824Ub(0, bVar));
            } catch (RemoteException e10) {
                i.g("Failed to add google native ad listener", e10);
            }
        }
        if (arrayList.contains("3")) {
            HashMap hashMap = c2520Cd.f24898g;
            for (String str : hashMap.keySet()) {
                BinderC2790Sb binderC2790Sb = null;
                Y0.b bVar2 = true != ((Boolean) hashMap.get(str)).booleanValue() ? null : bVar;
                C3504ku c3504ku = new C3504ku(5, bVar, bVar2);
                try {
                    BinderC2807Tb binderC2807Tb = new BinderC2807Tb(c3504ku);
                    if (bVar2 != null) {
                        binderC2790Sb = new BinderC2790Sb(c3504ku);
                    }
                    g9.J1(str, binderC2807Tb, binderC2790Sb);
                } catch (RemoteException e11) {
                    i.g("Failed to add custom template ad listener", e11);
                }
            }
        }
        e a9 = newAdLoader.a();
        this.adLoader = a9;
        a9.a(buildAdRequest(context, nVar, bundle2, bundle).f39373a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        AbstractC5205a abstractC5205a = this.mInterstitialAd;
        if (abstractC5205a != null) {
            abstractC5205a.d(null);
        }
    }
}
