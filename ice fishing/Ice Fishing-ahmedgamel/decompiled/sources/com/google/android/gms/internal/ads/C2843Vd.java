package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Vd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2843Vd implements v2.l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zzbym f29010n;

    public C2843Vd(zzbym zzbymVar) {
        this.f29010n = zzbymVar;
    }

    @Override // v2.l
    public final void C3(int i) {
        x2.i.a("AdMobCustomTabsAdapter overlay is closed.");
        C4297ze c4297ze = (C4297ze) this.f29010n.f36254b;
        c4297ze.getClass();
        R2.w.d("#008 Must be called on the main UI thread.");
        x2.i.a("Adapter called onAdClosed.");
        try {
            ((InterfaceC3864rd) c4297ze.f36133u).e();
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // v2.l
    public final void G1() {
        x2.i.a("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // v2.l
    public final void K0() {
        x2.i.a("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // v2.l
    public final void N2() {
    }

    @Override // v2.l
    public final void Q1() {
        x2.i.a("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // v2.l
    public final void S1() {
        x2.i.a("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // v2.l
    public final void d1() {
        x2.i.a("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // v2.l
    public final void g() {
        x2.i.a("Opening AdMobCustomTabsAdapter overlay.");
        C4297ze c4297ze = (C4297ze) this.f29010n.f36254b;
        c4297ze.getClass();
        R2.w.d("#008 Must be called on the main UI thread.");
        x2.i.a("Adapter called onAdOpened.");
        try {
            ((InterfaceC3864rd) c4297ze.f36133u).n();
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // v2.l
    public final void h1() {
        x2.i.a("AdMobCustomTabsAdapter overlay is created.");
    }

    @Override // v2.l
    public final void r1() {
        x2.i.a("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // v2.l
    public final void t0() {
        x2.i.a("AdMobCustomTabsAdapter overlay is restarted.");
    }
}
