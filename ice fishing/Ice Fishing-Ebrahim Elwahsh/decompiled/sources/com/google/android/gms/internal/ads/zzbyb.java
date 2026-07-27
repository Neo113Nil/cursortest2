package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import s2.C4997e;
import u2.C5107a;
import w2.InterfaceC5156d;

/* loaded from: classes2.dex */
public final class zzbyb implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    public Activity f35647a;

    /* renamed from: b, reason: collision with root package name */
    public w2.k f35648b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f35649c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        u2.i.a("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        u2.i.a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        u2.i.a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, w2.k kVar, Bundle bundle, InterfaceC5156d interfaceC5156d, Bundle bundle2) {
        this.f35648b = kVar;
        if (kVar == null) {
            u2.i.f("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            u2.i.f("AdMobCustomTabs can only work with Activity context. Bailing out.");
            ((C4017ue) this.f35648b).e();
            return;
        }
        if (!C3905sa.a(context)) {
            u2.i.f("Default browser does not support custom tabs. Bailing out.");
            ((C4017ue) this.f35648b).e();
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            u2.i.f("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            ((C4017ue) this.f35648b).e();
            return;
        }
        this.f35647a = (Activity) context;
        this.f35649c = Uri.parse(string);
        C4017ue c4017ue = (C4017ue) this.f35648b;
        c4017ue.getClass();
        O2.w.d("#008 Must be called on the main UI thread.");
        u2.i.a("Adapter called onAdLoaded.");
        try {
            ((InterfaceC3693od) c4017ue.f34630u).h();
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        S0.l b9 = new com.bumptech.glide.manager.n().b();
        ((Intent) b9.f2910u).setData(this.f35649c);
        t2.G.f40858l.post(new MD(this, new AdOverlayInfoParcel(new C4997e((Intent) b9.f2910u, null), null, new C2771Sd(this), null, new C5107a(0, 0, false, false), null, null, ""), 9, false));
        p2.j jVar = p2.j.f39798C;
        C2875Yf c2875Yf = jVar.f39808h.f29023m;
        c2875Yf.getClass();
        jVar.f39810k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (c2875Yf.f28840a) {
            try {
                if (c2875Yf.f28842c == 3) {
                    if (c2875Yf.f28841b + ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31541R6)).longValue() <= currentTimeMillis) {
                        c2875Yf.f28842c = 1;
                    }
                }
            } finally {
            }
        }
        jVar.f39810k.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        synchronized (c2875Yf.f28840a) {
            try {
                if (c2875Yf.f28842c != 2) {
                    return;
                }
                c2875Yf.f28842c = 3;
                if (c2875Yf.f28842c == 3) {
                    c2875Yf.f28841b = currentTimeMillis2;
                }
            } finally {
            }
        }
    }
}
