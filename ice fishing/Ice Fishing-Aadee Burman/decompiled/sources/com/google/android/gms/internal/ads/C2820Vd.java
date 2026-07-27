package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Vd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2820Vd implements t2.l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zzbym f28213n;

    public C2820Vd(zzbym zzbymVar) {
        this.f28213n = zzbymVar;
    }

    @Override // t2.l
    public final void H3(int i) {
        v2.i.a("AdMobCustomTabsAdapter overlay is closed.");
        C4274ze c4274ze = (C4274ze) this.f28213n.f35485b;
        c4274ze.getClass();
        P2.w.d("#008 Must be called on the main UI thread.");
        v2.i.a("Adapter called onAdClosed.");
        try {
            ((InterfaceC3841rd) c4274ze.f35360u).e();
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // t2.l
    public final void L1() {
        v2.i.a("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // t2.l
    public final void M0() {
        v2.i.a("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // t2.l
    public final void Q2() {
    }

    @Override // t2.l
    public final void R1() {
        v2.i.a("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // t2.l
    public final void S1() {
        v2.i.a("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // t2.l
    public final void f1() {
        v2.i.a("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // t2.l
    public final void g() {
        v2.i.a("Opening AdMobCustomTabsAdapter overlay.");
        C4274ze c4274ze = (C4274ze) this.f28213n.f35485b;
        c4274ze.getClass();
        P2.w.d("#008 Must be called on the main UI thread.");
        v2.i.a("Adapter called onAdOpened.");
        try {
            ((InterfaceC3841rd) c4274ze.f35360u).n();
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // t2.l
    public final void h1() {
        v2.i.a("AdMobCustomTabsAdapter overlay is created.");
    }

    @Override // t2.l
    public final void t1() {
        v2.i.a("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // t2.l
    public final void w0() {
        v2.i.a("AdMobCustomTabsAdapter overlay is restarted.");
    }
}
