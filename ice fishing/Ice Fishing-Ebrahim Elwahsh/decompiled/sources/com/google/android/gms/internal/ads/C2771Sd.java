package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Sd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2771Sd implements s2.l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zzbyb f27577n;

    public C2771Sd(zzbyb zzbybVar) {
        this.f27577n = zzbybVar;
    }

    @Override // s2.l
    public final void D0() {
        u2.i.a("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // s2.l
    public final void G2() {
        u2.i.a("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // s2.l
    public final void K1() {
        u2.i.a("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // s2.l
    public final void K2() {
    }

    @Override // s2.l
    public final void R0(int i) {
        u2.i.a("AdMobCustomTabsAdapter overlay is closed.");
        C4017ue c4017ue = (C4017ue) this.f27577n.f35648b;
        c4017ue.getClass();
        O2.w.d("#008 Must be called on the main UI thread.");
        u2.i.a("Adapter called onAdClosed.");
        try {
            ((InterfaceC3693od) c4017ue.f34630u).f();
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // s2.l
    public final void Y1() {
        u2.i.a("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // s2.l
    public final void f1() {
        u2.i.a("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // s2.l
    public final void g() {
        u2.i.a("Opening AdMobCustomTabsAdapter overlay.");
        C4017ue c4017ue = (C4017ue) this.f27577n.f35648b;
        c4017ue.getClass();
        O2.w.d("#008 Must be called on the main UI thread.");
        u2.i.a("Adapter called onAdOpened.");
        try {
            ((InterfaceC3693od) c4017ue.f34630u).l();
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // s2.l
    public final void o1() {
        u2.i.a("AdMobCustomTabsAdapter overlay is created.");
    }

    @Override // s2.l
    public final void u0() {
        u2.i.a("AdMobCustomTabsAdapter overlay is restarted.");
    }

    @Override // s2.l
    public final void y1() {
        u2.i.a("AdMobCustomTabsAdapter overlay is paused.");
    }
}
