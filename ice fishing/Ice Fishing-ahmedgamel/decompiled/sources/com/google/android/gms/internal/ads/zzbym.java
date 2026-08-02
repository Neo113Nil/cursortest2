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
import r2.C4906k;
import v2.C5101e;
import x2.C5189a;
import z2.InterfaceC5227d;

/* loaded from: classes2.dex */
public final class zzbym implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    public Activity f36253a;

    /* renamed from: b, reason: collision with root package name */
    public z2.j f36254b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f36255c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        x2.i.a("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        x2.i.a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        x2.i.a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, z2.j jVar, Bundle bundle, InterfaceC5227d interfaceC5227d, Bundle bundle2) {
        this.f36254b = jVar;
        if (jVar == null) {
            x2.i.f("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            x2.i.f("AdMobCustomTabs can only work with Activity context. Bailing out.");
            ((C4297ze) this.f36254b).d();
            return;
        }
        if (!C4131wa.a(context)) {
            x2.i.f("Default browser does not support custom tabs. Bailing out.");
            ((C4297ze) this.f36254b).d();
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            x2.i.f("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            ((C4297ze) this.f36254b).d();
            return;
        }
        this.f36253a = (Activity) context;
        this.f36255c = Uri.parse(string);
        C4297ze c4297ze = (C4297ze) this.f36254b;
        c4297ze.getClass();
        R2.w.d("#008 Must be called on the main UI thread.");
        x2.i.a("Adapter called onAdLoaded.");
        try {
            ((InterfaceC3864rd) c4297ze.f36133u).j();
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        LP b9 = new com.bumptech.glide.manager.n().b();
        ((Intent) b9.f26916u).setData(this.f36255c);
        w2.D.f41627l.post(new RunnableC3996u0(this, new AdOverlayInfoParcel(new C5101e((Intent) b9.f26916u, null), null, new C2843Vd(this), null, new C5189a(0, 0, false, false), null, null, ""), 8, false));
        C4906k c4906k = C4906k.f40186C;
        C3008bg c3008bg = c4906k.f40196h.f30313m;
        c3008bg.getClass();
        c4906k.f40198k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (c3008bg.f30088a) {
            try {
                if (c3008bg.f30090c == 3) {
                    if (c3008bg.f30089b + ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32900R6)).longValue() <= currentTimeMillis) {
                        c3008bg.f30090c = 1;
                    }
                }
            } finally {
            }
        }
        c4906k.f40198k.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        synchronized (c3008bg.f30088a) {
            try {
                if (c3008bg.f30090c != 2) {
                    return;
                }
                c3008bg.f30090c = 3;
                if (c3008bg.f30090c == 3) {
                    c3008bg.f30089b = currentTimeMillis2;
                }
            } finally {
            }
        }
    }
}
