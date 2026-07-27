package com.google.ads.mediation;

import O2.w;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C4017ue;
import com.google.android.gms.internal.ads.InterfaceC3693od;
import k2.C4643n;
import u2.i;
import v2.AbstractC5123a;
import v2.AbstractC5124b;
import w2.k;

/* loaded from: classes.dex */
public final class c extends AbstractC5124b {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractAdViewAdapter f23700e;

    /* renamed from: f, reason: collision with root package name */
    public final k f23701f;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, k kVar) {
        this.f23700e = abstractAdViewAdapter;
        this.f23701f = kVar;
    }

    @Override // k2.x
    public final void onAdFailedToLoad(C4643n c4643n) {
        ((C4017ue) this.f23701f).g(c4643n);
    }

    @Override // k2.x
    public final void onAdLoaded(Object obj) {
        AbstractC5123a abstractC5123a = (AbstractC5123a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f23700e;
        abstractAdViewAdapter.mInterstitialAd = abstractC5123a;
        k kVar = this.f23701f;
        abstractC5123a.c(new d(abstractAdViewAdapter, kVar));
        C4017ue c4017ue = (C4017ue) kVar;
        c4017ue.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdLoaded.");
        try {
            ((InterfaceC3693od) c4017ue.f34630u).h();
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
        }
    }
}
