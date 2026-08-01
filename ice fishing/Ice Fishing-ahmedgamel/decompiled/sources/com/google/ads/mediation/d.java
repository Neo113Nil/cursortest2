package com.google.ads.mediation;

import P2.w;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C4274ze;
import com.google.android.gms.internal.ads.InterfaceC3841rd;
import k2.C4631a;
import k2.m;
import o4.C4793f;
import o4.InterfaceC4799l;
import v2.i;
import w2.AbstractC5149b;
import x2.k;

/* loaded from: classes.dex */
public final class d extends m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23546b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23547c;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, k kVar) {
        this.f23546b = 0;
        this.f23547c = kVar;
    }

    @Override // k2.m
    public final void onAdDismissedFullScreenContent() {
        switch (this.f23546b) {
            case 0:
                C4274ze c4274ze = (C4274ze) ((k) this.f23547c);
                c4274ze.getClass();
                w.d("#008 Must be called on the main UI thread.");
                i.a("Adapter called onAdClosed.");
                try {
                    ((InterfaceC3841rd) c4274ze.f35360u).e();
                    break;
                } catch (RemoteException e9) {
                    i.i("#007 Could not call remote method.", e9);
                    return;
                }
            case 1:
                if (o4.m.f39633z.isShowing()) {
                    o4.m.f39633z.dismiss();
                }
                o4.m mVar = ((C4793f) this.f23547c).f39578g;
                o4.m.f();
                break;
            default:
                if (o4.m.f39633z.isShowing()) {
                    o4.m.f39633z.dismiss();
                }
                ((C4793f) this.f23547c).f39578g.getClass();
                o4.m.f();
                break;
        }
    }

    @Override // k2.m
    public void onAdFailedToShowFullScreenContent(C4631a c4631a) {
        switch (this.f23546b) {
            case 1:
                if (o4.m.f39633z.isShowing()) {
                    o4.m.f39633z.dismiss();
                }
                C4793f c4793f = (C4793f) this.f23547c;
                InterfaceC4799l interfaceC4799l = c4793f.f39579h;
                o4.m.f();
                if (o4.m.f39615g == 1) {
                    o4.m.g(c4793f.f39577f);
                    break;
                }
                break;
            case 2:
                if (o4.m.f39633z.isShowing()) {
                    o4.m.f39633z.dismiss();
                }
                C4793f c4793f2 = (C4793f) this.f23547c;
                InterfaceC4799l interfaceC4799l2 = c4793f2.f39579h;
                c4793f2.f39578g.getClass();
                o4.m.f();
                if (o4.m.f39615g == 1) {
                    o4.m.g(c4793f2.f39577f);
                    break;
                }
                break;
        }
    }

    @Override // k2.m
    public final void onAdShowedFullScreenContent() {
        switch (this.f23546b) {
            case 0:
                C4274ze c4274ze = (C4274ze) ((k) this.f23547c);
                c4274ze.getClass();
                w.d("#008 Must be called on the main UI thread.");
                i.a("Adapter called onAdOpened.");
                try {
                    ((InterfaceC3841rd) c4274ze.f35360u).n();
                    break;
                } catch (RemoteException e9) {
                    i.i("#007 Could not call remote method.", e9);
                    return;
                }
            case 1:
                ((C4793f) this.f23547c).f39578g.f39636c = null;
                break;
            default:
                ((C4793f) this.f23547c).f39578g.f39636c = null;
                break;
        }
    }

    public /* synthetic */ d(AbstractC5149b abstractC5149b, int i) {
        this.f23546b = i;
        this.f23547c = abstractC5149b;
    }
}
