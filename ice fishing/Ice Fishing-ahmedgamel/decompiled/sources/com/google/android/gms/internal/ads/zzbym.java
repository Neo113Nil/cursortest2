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
import p2.C4835j;
import t2.C5037e;
import v2.C5110a;
import x2.InterfaceC5190d;

/* loaded from: classes2.dex */
public final class zzbym implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    public Activity f35484a;

    /* renamed from: b, reason: collision with root package name */
    public x2.k f35485b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f35486c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        v2.i.a("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        v2.i.a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        v2.i.a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, x2.k kVar, Bundle bundle, InterfaceC5190d interfaceC5190d, Bundle bundle2) {
        this.f35485b = kVar;
        if (kVar == null) {
            v2.i.f("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            v2.i.f("AdMobCustomTabs can only work with Activity context. Bailing out.");
            ((C4274ze) this.f35485b).d();
            return;
        }
        if (!C4108wa.a(context)) {
            v2.i.f("Default browser does not support custom tabs. Bailing out.");
            ((C4274ze) this.f35485b).d();
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            v2.i.f("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            ((C4274ze) this.f35485b).d();
            return;
        }
        this.f35484a = (Activity) context;
        this.f35486c = Uri.parse(string);
        C4274ze c4274ze = (C4274ze) this.f35485b;
        c4274ze.getClass();
        P2.w.d("#008 Must be called on the main UI thread.");
        v2.i.a("Adapter called onAdLoaded.");
        try {
            ((InterfaceC3841rd) c4274ze.f35360u).j();
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        m8.i b9 = new com.bumptech.glide.manager.o().b();
        ((Intent) b9.f39362n).setData(this.f35486c);
        u2.D.f41237l.post(new RunnableC3973u0(this, new AdOverlayInfoParcel(new C5037e((Intent) b9.f39362n, null), null, new C2820Vd(this), null, new C5110a(0, 0, false, false), null, null, ""), 8, false));
        C4835j c4835j = C4835j.f39733C;
        C2985bg c2985bg = c4835j.f39743h.f29528m;
        c2985bg.getClass();
        c4835j.f39745k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (c2985bg.f29299a) {
            try {
                if (c2985bg.f29301c == 3) {
                    if (c2985bg.f29300b + ((Long) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32121R6)).longValue() <= currentTimeMillis) {
                        c2985bg.f29301c = 1;
                    }
                }
            } finally {
            }
        }
        c4835j.f39745k.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        synchronized (c2985bg.f29299a) {
            try {
                if (c2985bg.f29301c != 2) {
                    return;
                }
                c2985bg.f29301c = 3;
                if (c2985bg.f29301c == 3) {
                    c2985bg.f29300b = currentTimeMillis2;
                }
            } finally {
            }
        }
    }
}
