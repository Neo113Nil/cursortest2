package com.google.ads.mediation;

import P2.w;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C4274ze;
import com.google.android.gms.internal.ads.InterfaceC3841rd;
import k2.n;
import v2.i;
import w2.AbstractC5148a;
import w2.AbstractC5149b;
import x2.k;

/* loaded from: classes.dex */
public final class c extends AbstractC5149b {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractAdViewAdapter f23544e;

    /* renamed from: f, reason: collision with root package name */
    public final k f23545f;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, k kVar) {
        this.f23544e = abstractAdViewAdapter;
        this.f23545f = kVar;
    }

    @Override // k2.x
    public final void onAdFailedToLoad(n nVar) {
        ((C4274ze) this.f23545f).h(nVar);
    }

    @Override // k2.x
    public final void onAdLoaded(Object obj) {
        AbstractC5148a abstractC5148a = (AbstractC5148a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f23544e;
        abstractAdViewAdapter.mInterstitialAd = abstractC5148a;
        k kVar = this.f23545f;
        abstractC5148a.c(new d(abstractAdViewAdapter, kVar));
        C4274ze c4274ze = (C4274ze) kVar;
        c4274ze.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdLoaded.");
        try {
            ((InterfaceC3841rd) c4274ze.f35360u).j();
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }
}
