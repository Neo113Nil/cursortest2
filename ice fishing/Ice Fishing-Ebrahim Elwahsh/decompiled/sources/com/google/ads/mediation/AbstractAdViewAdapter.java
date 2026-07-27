package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.AbstractC2598Ia;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.BinderC2701Ob;
import com.google.android.gms.internal.ads.BinderC2718Pb;
import com.google.android.gms.internal.ads.BinderC2735Qb;
import com.google.android.gms.internal.ads.C2549Fc;
import com.google.android.gms.internal.ads.C3261gb;
import com.google.android.gms.internal.ads.C3602mu;
import com.google.android.gms.internal.ads.C4286zd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import k2.C4633d;
import k2.C4634e;
import k2.C4635f;
import k2.C4636g;
import k2.C4637h;
import k2.C4639j;
import k2.v;
import k2.w;
import k2.y;
import n2.C4807c;
import q2.A0;
import q2.C4907p;
import q2.E0;
import q2.G;
import q2.G0;
import q2.K;
import q2.a1;
import q2.r;
import u2.AbstractC5108b;
import u2.i;
import v2.AbstractC5123a;
import w2.InterfaceC5156d;
import w2.InterfaceC5160h;
import w2.k;
import w2.m;
import w2.o;
import z2.C5273c;

/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private C4634e adLoader;
    protected C4639j mAdView;
    protected AbstractC5123a mInterstitialAd;

    public C4636g buildAdRequest(Context context, InterfaceC5156d interfaceC5156d, Bundle bundle, Bundle bundle2) {
        C4635f c4635f = new C4635f(1);
        Set d2 = interfaceC5156d.d();
        E0 e02 = (E0) c4635f.f37200u;
        if (d2 != null) {
            Iterator it = d2.iterator();
            while (it.hasNext()) {
                e02.f39918a.add((String) it.next());
            }
        }
        if (interfaceC5156d.c()) {
            u2.d dVar = C4907p.f40108g.f40109a;
            e02.f39921d.add(u2.d.c(context));
        }
        if (interfaceC5156d.a() != -1) {
            e02.f39927k = interfaceC5156d.a() != 1 ? 0 : 1;
        }
        e02.f39928l = interfaceC5156d.b();
        c4635f.e(buildExtrasBundle(bundle, bundle2));
        return new C4636g(c4635f);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public AbstractC5123a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public A0 getVideoController() {
        A0 a02;
        C4639j c4639j = this.mAdView;
        if (c4639j == null) {
            return null;
        }
        v vVar = c4639j.f38724n.f39946c;
        synchronized (vVar.f38736a) {
            a02 = vVar.f38737b;
        }
        return a02;
    }

    public C4633d newAdLoader(Context context, String str) {
        return new C4633d(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, w2.InterfaceC5157e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        C4639j c4639j = this.mAdView;
        if (c4639j != null) {
            c4639j.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z8) {
        AbstractC5123a abstractC5123a = this.mInterstitialAd;
        if (abstractC5123a != null) {
            try {
                K k6 = ((C2549Fc) abstractC5123a).f24971c;
                if (k6 != null) {
                    k6.Q0(z8);
                }
            } catch (RemoteException e6) {
                i.i("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, w2.InterfaceC5157e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        C4639j c4639j = this.mAdView;
        if (c4639j != null) {
            AbstractC3368ia.a(c4639j.getContext());
            if (((Boolean) AbstractC2598Ia.f25572g.r()).booleanValue()) {
                if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Ac)).booleanValue()) {
                    AbstractC5108b.f41223b.execute(new y(c4639j, 0));
                    return;
                }
            }
            G0 g02 = c4639j.f38724n;
            g02.getClass();
            try {
                K k6 = g02.i;
                if (k6 != null) {
                    k6.f();
                }
            } catch (RemoteException e6) {
                i.i("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, w2.InterfaceC5157e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        C4639j c4639j = this.mAdView;
        if (c4639j != null) {
            AbstractC3368ia.a(c4639j.getContext());
            if (((Boolean) AbstractC2598Ia.f25573h.r()).booleanValue()) {
                if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.yc)).booleanValue()) {
                    AbstractC5108b.f41223b.execute(new y(c4639j, 1));
                    return;
                }
            }
            G0 g02 = c4639j.f38724n;
            g02.getClass();
            try {
                K k6 = g02.i;
                if (k6 != null) {
                    k6.e();
                }
            } catch (RemoteException e6) {
                i.i("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, InterfaceC5160h interfaceC5160h, Bundle bundle, C4637h c4637h, InterfaceC5156d interfaceC5156d, Bundle bundle2) {
        C4639j c4639j = new C4639j(context);
        this.mAdView = c4639j;
        c4639j.setAdSize(new C4637h(c4637h.f38711a, c4637h.f38712b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, interfaceC5160h));
        this.mAdView.b(buildAdRequest(context, interfaceC5156d, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, k kVar, Bundle bundle, InterfaceC5156d interfaceC5156d, Bundle bundle2) {
        AbstractC5123a.b(context, getAdUnitId(bundle), buildAdRequest(context, interfaceC5156d, bundle2, bundle), new c(this, kVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, m mVar, Bundle bundle, o oVar, Bundle bundle2) {
        C4807c c4807c;
        C5273c c5273c;
        e eVar = new e(0, this, mVar);
        C4633d newAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        newAdLoader.c(eVar);
        G g9 = newAdLoader.f38701b;
        C4286zd c4286zd = (C4286zd) oVar;
        c4286zd.getClass();
        C4807c c4807c2 = new C4807c();
        int i = 3;
        C3261gb c3261gb = c4286zd.f35559d;
        if (c3261gb == null) {
            c4807c = new C4807c(c4807c2);
        } else {
            int i4 = c3261gb.f31023n;
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        c4807c2.f39636g = c3261gb.f31029z;
                        c4807c2.f39632c = c3261gb.f31019A;
                    }
                    c4807c2.f39630a = c3261gb.f31024u;
                    c4807c2.f39631b = c3261gb.f31025v;
                    c4807c2.f39633d = c3261gb.f31026w;
                    c4807c = new C4807c(c4807c2);
                }
                a1 a1Var = c3261gb.f31028y;
                if (a1Var != null) {
                    c4807c2.f39635f = new w(a1Var);
                }
            }
            c4807c2.f39634e = c3261gb.f31027x;
            c4807c2.f39630a = c3261gb.f31024u;
            c4807c2.f39631b = c3261gb.f31025v;
            c4807c2.f39633d = c3261gb.f31026w;
            c4807c = new C4807c(c4807c2);
        }
        try {
            g9.t0(new C3261gb(c4807c));
        } catch (RemoteException e6) {
            i.g("Failed to specify native ad options", e6);
        }
        C5273c c5273c2 = new C5273c();
        C3261gb c3261gb2 = c4286zd.f35559d;
        if (c3261gb2 == null) {
            c5273c = new C5273c(c5273c2);
        } else {
            int i9 = c3261gb2.f31023n;
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 == 4) {
                        c5273c2.f42154f = c3261gb2.f31029z;
                        c5273c2.f42150b = c3261gb2.f31019A;
                        c5273c2.f42155g = c3261gb2.f31021C;
                        c5273c2.f42156h = c3261gb2.f31020B;
                        int i10 = c3261gb2.f31022D;
                        if (i10 != 0) {
                            if (i10 != 2) {
                                if (i10 == 1) {
                                    i = 2;
                                }
                            }
                            c5273c2.i = i;
                        }
                        i = 1;
                        c5273c2.i = i;
                    }
                    c5273c2.f42149a = c3261gb2.f31024u;
                    c5273c2.f42151c = c3261gb2.f31026w;
                    c5273c = new C5273c(c5273c2);
                }
                a1 a1Var2 = c3261gb2.f31028y;
                if (a1Var2 != null) {
                    c5273c2.f42153e = new w(a1Var2);
                }
            }
            c5273c2.f42152d = c3261gb2.f31027x;
            c5273c2.f42149a = c3261gb2.f31024u;
            c5273c2.f42151c = c3261gb2.f31026w;
            c5273c = new C5273c(c5273c2);
        }
        newAdLoader.d(c5273c);
        ArrayList arrayList = c4286zd.f35560e;
        if (arrayList.contains("6")) {
            try {
                g9.q2(new BinderC2735Qb(0, eVar));
            } catch (RemoteException e9) {
                i.g("Failed to add google native ad listener", e9);
            }
        }
        if (arrayList.contains("3")) {
            HashMap hashMap = c4286zd.f35562g;
            for (String str : hashMap.keySet()) {
                BinderC2701Ob binderC2701Ob = null;
                e eVar2 = true != ((Boolean) hashMap.get(str)).booleanValue() ? null : eVar;
                C3602mu c3602mu = new C3602mu(5, eVar, eVar2);
                try {
                    BinderC2718Pb binderC2718Pb = new BinderC2718Pb(c3602mu);
                    if (eVar2 != null) {
                        binderC2701Ob = new BinderC2701Ob(c3602mu);
                    }
                    g9.u3(str, binderC2718Pb, binderC2701Ob);
                } catch (RemoteException e10) {
                    i.g("Failed to add custom template ad listener", e10);
                }
            }
        }
        C4634e a9 = newAdLoader.a();
        this.adLoader = a9;
        a9.a(buildAdRequest(context, oVar, bundle2, bundle).f38704a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        AbstractC5123a abstractC5123a = this.mInterstitialAd;
        if (abstractC5123a != null) {
            abstractC5123a.d(null);
        }
    }
}
