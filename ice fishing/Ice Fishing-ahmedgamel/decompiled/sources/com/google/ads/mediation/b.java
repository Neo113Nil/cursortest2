package com.google.ads.mediation;

import R2.w;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C4297ze;
import com.google.android.gms.internal.ads.InterfaceC3864rd;
import m2.n;
import n2.InterfaceC4769d;
import s2.InterfaceC4919a;
import x2.i;
import z2.InterfaceC5231h;

/* loaded from: classes.dex */
public final class b extends m2.c implements InterfaceC4769d, InterfaceC4919a {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5231h f24328n;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC5231h interfaceC5231h) {
        this.f24328n = interfaceC5231h;
    }

    @Override // n2.InterfaceC4769d
    public final void f(String str, String str2) {
        C4297ze c4297ze = (C4297ze) this.f24328n;
        c4297ze.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAppEvent.");
        try {
            ((InterfaceC3864rd) c4297ze.f36133u).k3(str, str2);
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // m2.c
    public final void onAdClicked() {
        C4297ze c4297ze = (C4297ze) this.f24328n;
        c4297ze.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdClicked.");
        try {
            ((InterfaceC3864rd) c4297ze.f36133u).d();
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // m2.c
    public final void onAdClosed() {
        C4297ze c4297ze = (C4297ze) this.f24328n;
        c4297ze.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdClosed.");
        try {
            ((InterfaceC3864rd) c4297ze.f36133u).e();
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // m2.c
    public final void onAdFailedToLoad(n nVar) {
        ((C4297ze) this.f24328n).g(nVar);
    }

    @Override // m2.c
    public final void onAdLoaded() {
        C4297ze c4297ze = (C4297ze) this.f24328n;
        c4297ze.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdLoaded.");
        try {
            ((InterfaceC3864rd) c4297ze.f36133u).j();
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // m2.c
    public final void onAdOpened() {
        C4297ze c4297ze = (C4297ze) this.f24328n;
        c4297ze.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdOpened.");
        try {
            ((InterfaceC3864rd) c4297ze.f36133u).n();
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }
}
