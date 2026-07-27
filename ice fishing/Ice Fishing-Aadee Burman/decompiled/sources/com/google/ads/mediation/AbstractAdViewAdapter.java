package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.AbstractC2684Na;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.BinderC2770Sb;
import com.google.android.gms.internal.ads.BinderC2786Tb;
import com.google.android.gms.internal.ads.BinderC2802Ub;
import com.google.android.gms.internal.ads.C2500Cd;
import com.google.android.gms.internal.ads.C2635Kc;
import com.google.android.gms.internal.ads.C3462kb;
import com.google.android.gms.internal.ads.C3481ku;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import k2.f;
import k2.g;
import k2.h;
import k2.j;
import k2.v;
import k2.w;
import k2.y;
import n2.C4752c;
import q2.A0;
import q2.C4900p;
import q2.E0;
import q2.G;
import q2.G0;
import q2.K;
import q2.Z0;
import q2.r;
import v2.AbstractC5111b;
import v2.i;
import w2.AbstractC5148a;
import x2.InterfaceC5190d;
import x2.InterfaceC5194h;
import x2.k;
import x2.m;
import x2.o;

/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private k2.e adLoader;
    protected j mAdView;
    protected AbstractC5148a mInterstitialAd;

    public g buildAdRequest(Context context, InterfaceC5190d interfaceC5190d, Bundle bundle, Bundle bundle2) {
        f fVar = new f(2);
        Set d2 = interfaceC5190d.d();
        E0 e02 = (E0) fVar.f1720u;
        if (d2 != null) {
            Iterator it = d2.iterator();
            while (it.hasNext()) {
                e02.f40008a.add((String) it.next());
            }
        }
        if (interfaceC5190d.c()) {
            v2.d dVar = C4900p.f40196g.f40197a;
            e02.f40011d.add(v2.d.c(context));
        }
        if (interfaceC5190d.a() != -1) {
            e02.f40017k = interfaceC5190d.a() != 1 ? 0 : 1;
        }
        e02.f40018l = interfaceC5190d.b();
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

    public AbstractC5148a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public A0 getVideoController() {
        A0 a02;
        j jVar = this.mAdView;
        if (jVar == null) {
            return null;
        }
        v vVar = jVar.f38604n.f40036c;
        synchronized (vVar.f38616a) {
            a02 = vVar.f38617b;
        }
        return a02;
    }

    public k2.d newAdLoader(Context context, String str) {
        return new k2.d(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, x2.InterfaceC5191e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
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

    public void onImmersiveModeUpdated(boolean z3) {
        AbstractC5148a abstractC5148a = this.mInterstitialAd;
        if (abstractC5148a != null) {
            try {
                K k9 = ((C2635Kc) abstractC5148a).f25933c;
                if (k9 != null) {
                    k9.o0(z3);
                }
            } catch (RemoteException e9) {
                i.i("#007 Could not call remote method.", e9);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, x2.InterfaceC5191e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        j jVar = this.mAdView;
        if (jVar != null) {
            AbstractC3569ma.a(jVar.getContext());
            if (((Boolean) AbstractC2684Na.f26499g.r()).booleanValue()) {
                if (((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.Ac)).booleanValue()) {
                    AbstractC5111b.f41394b.execute(new y(jVar, 0));
                    return;
                }
            }
            G0 g02 = jVar.f38604n;
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

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, x2.InterfaceC5191e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        j jVar = this.mAdView;
        if (jVar != null) {
            AbstractC3569ma.a(jVar.getContext());
            if (((Boolean) AbstractC2684Na.f26500h.r()).booleanValue()) {
                if (((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.yc)).booleanValue()) {
                    AbstractC5111b.f41394b.execute(new y(jVar, 1));
                    return;
                }
            }
            G0 g02 = jVar.f38604n;
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
    public void requestBannerAd(Context context, InterfaceC5194h interfaceC5194h, Bundle bundle, h hVar, InterfaceC5190d interfaceC5190d, Bundle bundle2) {
        j jVar = new j(context);
        this.mAdView = jVar;
        jVar.setAdSize(new h(hVar.f38591a, hVar.f38592b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, interfaceC5194h));
        this.mAdView.b(buildAdRequest(context, interfaceC5190d, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, k kVar, Bundle bundle, InterfaceC5190d interfaceC5190d, Bundle bundle2) {
        AbstractC5148a.b(context, getAdUnitId(bundle), buildAdRequest(context, interfaceC5190d, bundle2, bundle), new c(this, kVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, m mVar, Bundle bundle, o oVar, Bundle bundle2) {
        C4752c c4752c;
        A2.c cVar;
        e eVar = new e(0, this, mVar);
        k2.d newAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        newAdLoader.c(eVar);
        G g4 = newAdLoader.f38581b;
        C2500Cd c2500Cd = (C2500Cd) oVar;
        c2500Cd.getClass();
        C4752c c4752c2 = new C4752c();
        int i = 3;
        C3462kb c3462kb = c2500Cd.f24160d;
        if (c3462kb == null) {
            c4752c = new C4752c(c4752c2);
        } else {
            int i6 = c3462kb.f31471n;
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        c4752c2.f39467g = c3462kb.f31477z;
                        c4752c2.f39463c = c3462kb.f31467A;
                    }
                    c4752c2.f39461a = c3462kb.f31472u;
                    c4752c2.f39462b = c3462kb.f31473v;
                    c4752c2.f39464d = c3462kb.f31474w;
                    c4752c = new C4752c(c4752c2);
                }
                Z0 z02 = c3462kb.f31476y;
                if (z02 != null) {
                    c4752c2.f39466f = new w(z02);
                }
            }
            c4752c2.f39465e = c3462kb.f31475x;
            c4752c2.f39461a = c3462kb.f31472u;
            c4752c2.f39462b = c3462kb.f31473v;
            c4752c2.f39464d = c3462kb.f31474w;
            c4752c = new C4752c(c4752c2);
        }
        try {
            g4.J3(new C3462kb(c4752c));
        } catch (RemoteException e9) {
            i.g("Failed to specify native ad options", e9);
        }
        A2.c cVar2 = new A2.c();
        C3462kb c3462kb2 = c2500Cd.f24160d;
        if (c3462kb2 == null) {
            cVar = new A2.c(cVar2);
        } else {
            int i9 = c3462kb2.f31471n;
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 == 4) {
                        cVar2.f24f = c3462kb2.f31477z;
                        cVar2.f20b = c3462kb2.f31467A;
                        cVar2.f25g = c3462kb2.f31469C;
                        cVar2.f26h = c3462kb2.f31468B;
                        int i10 = c3462kb2.f31470D;
                        if (i10 != 0) {
                            if (i10 != 2) {
                                if (i10 == 1) {
                                    i = 2;
                                }
                            }
                            cVar2.i = i;
                        }
                        i = 1;
                        cVar2.i = i;
                    }
                    cVar2.f19a = c3462kb2.f31472u;
                    cVar2.f21c = c3462kb2.f31474w;
                    cVar = new A2.c(cVar2);
                }
                Z0 z03 = c3462kb2.f31476y;
                if (z03 != null) {
                    cVar2.f23e = new w(z03);
                }
            }
            cVar2.f22d = c3462kb2.f31475x;
            cVar2.f19a = c3462kb2.f31472u;
            cVar2.f21c = c3462kb2.f31474w;
            cVar = new A2.c(cVar2);
        }
        newAdLoader.d(cVar);
        ArrayList arrayList = c2500Cd.f24161e;
        if (arrayList.contains("6")) {
            try {
                g4.J2(new BinderC2802Ub(0, eVar));
            } catch (RemoteException e10) {
                i.g("Failed to add google native ad listener", e10);
            }
        }
        if (arrayList.contains("3")) {
            HashMap hashMap = c2500Cd.f24163g;
            for (String str : hashMap.keySet()) {
                BinderC2770Sb binderC2770Sb = null;
                e eVar2 = true != ((Boolean) hashMap.get(str)).booleanValue() ? null : eVar;
                C3481ku c3481ku = new C3481ku(5, eVar, eVar2);
                try {
                    BinderC2786Tb binderC2786Tb = new BinderC2786Tb(c3481ku);
                    if (eVar2 != null) {
                        binderC2770Sb = new BinderC2770Sb(c3481ku);
                    }
                    g4.N1(str, binderC2786Tb, binderC2770Sb);
                } catch (RemoteException e11) {
                    i.g("Failed to add custom template ad listener", e11);
                }
            }
        }
        k2.e a9 = newAdLoader.a();
        this.adLoader = a9;
        a9.a(buildAdRequest(context, oVar, bundle2, bundle).f38584a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        AbstractC5148a abstractC5148a = this.mInterstitialAd;
        if (abstractC5148a != null) {
            abstractC5148a.d(null);
        }
    }
}
