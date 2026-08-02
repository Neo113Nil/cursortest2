package com.google.ads.mediation;

import R2.w;
import Y0.g;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C4297ze;
import com.google.android.gms.internal.ads.InterfaceC3864rd;
import m2.n;
import x2.i;
import y2.AbstractC5205a;
import y2.AbstractC5206b;
import z2.j;

/* loaded from: classes.dex */
public final class c extends AbstractC5206b {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractAdViewAdapter f24329e;

    /* renamed from: f, reason: collision with root package name */
    public final j f24330f;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, j jVar) {
        this.f24329e = abstractAdViewAdapter;
        this.f24330f = jVar;
    }

    @Override // m2.x
    public final void onAdFailedToLoad(n nVar) {
        ((C4297ze) this.f24330f).h(nVar);
    }

    @Override // m2.x
    public final void onAdLoaded(Object obj) {
        AbstractC5205a abstractC5205a = (AbstractC5205a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f24329e;
        abstractAdViewAdapter.mInterstitialAd = abstractC5205a;
        j jVar = this.f24330f;
        abstractC5205a.c(new g(abstractAdViewAdapter, jVar));
        C4297ze c4297ze = (C4297ze) jVar;
        c4297ze.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdLoaded.");
        try {
            ((InterfaceC3864rd) c4297ze.f36133u).j();
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }
}
