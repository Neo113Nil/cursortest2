package com.google.ads.mediation;

import P2.w;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C4274ze;
import com.google.android.gms.internal.ads.InterfaceC3841rd;
import k2.n;
import l2.InterfaceC4660d;
import q2.InterfaceC4870a;
import v2.i;
import x2.InterfaceC5194h;

/* loaded from: classes.dex */
public final class b extends k2.c implements InterfaceC4660d, InterfaceC4870a {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5194h f23543n;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC5194h interfaceC5194h) {
        this.f23543n = interfaceC5194h;
    }

    @Override // l2.InterfaceC4660d
    public final void f(String str, String str2) {
        C4274ze c4274ze = (C4274ze) this.f23543n;
        c4274ze.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAppEvent.");
        try {
            ((InterfaceC3841rd) c4274ze.f35360u).p3(str, str2);
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // k2.c
    public final void onAdClicked() {
        C4274ze c4274ze = (C4274ze) this.f23543n;
        c4274ze.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdClicked.");
        try {
            ((InterfaceC3841rd) c4274ze.f35360u).d();
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // k2.c
    public final void onAdClosed() {
        C4274ze c4274ze = (C4274ze) this.f23543n;
        c4274ze.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdClosed.");
        try {
            ((InterfaceC3841rd) c4274ze.f35360u).e();
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // k2.c
    public final void onAdFailedToLoad(n nVar) {
        ((C4274ze) this.f23543n).g(nVar);
    }

    @Override // k2.c
    public final void onAdLoaded() {
        C4274ze c4274ze = (C4274ze) this.f23543n;
        c4274ze.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdLoaded.");
        try {
            ((InterfaceC3841rd) c4274ze.f35360u).j();
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // k2.c
    public final void onAdOpened() {
        C4274ze c4274ze = (C4274ze) this.f23543n;
        c4274ze.getClass();
        w.d("#008 Must be called on the main UI thread.");
        i.a("Adapter called onAdOpened.");
        try {
            ((InterfaceC3841rd) c4274ze.f35360u).n();
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }
}
