package com.google.ads.mediation;

import O2.w;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C4017ue;
import com.google.android.gms.internal.ads.InterfaceC3693od;
import k2.AbstractC4642m;
import k2.C4630a;
import k4.C4651f;
import k4.InterfaceC4657l;
import k4.m;
import u2.i;
import v2.AbstractC5124b;
import w2.k;

/* loaded from: classes.dex */
public final class d extends AbstractC4642m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23702b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23703c;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, k kVar) {
        this.f23702b = 0;
        this.f23703c = kVar;
    }

    @Override // k2.AbstractC4642m
    public final void onAdDismissedFullScreenContent() {
        switch (this.f23702b) {
            case 0:
                C4017ue c4017ue = (C4017ue) ((k) this.f23703c);
                c4017ue.getClass();
                w.d("#008 Must be called on the main UI thread.");
                i.a("Adapter called onAdClosed.");
                try {
                    ((InterfaceC3693od) c4017ue.f34630u).f();
                    break;
                } catch (RemoteException e6) {
                    i.i("#007 Could not call remote method.", e6);
                    return;
                }
            case 1:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                m mVar = ((C4651f) this.f23703c).f38754g;
                m.f();
                break;
            default:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                ((C4651f) this.f23703c).f38754g.getClass();
                m.f();
                break;
        }
    }

    @Override // k2.AbstractC4642m
    public void onAdFailedToShowFullScreenContent(C4630a c4630a) {
        switch (this.f23702b) {
            case 1:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                C4651f c4651f = (C4651f) this.f23703c;
                InterfaceC4657l interfaceC4657l = c4651f.f38755h;
                m.f();
                if (m.f38791g == 1) {
                    m.g(c4651f.f38753f);
                    break;
                }
                break;
            case 2:
                if (m.f38809z.isShowing()) {
                    m.f38809z.dismiss();
                }
                C4651f c4651f2 = (C4651f) this.f23703c;
                InterfaceC4657l interfaceC4657l2 = c4651f2.f38755h;
                c4651f2.f38754g.getClass();
                m.f();
                if (m.f38791g == 1) {
                    m.g(c4651f2.f38753f);
                    break;
                }
                break;
        }
    }

    @Override // k2.AbstractC4642m
    public final void onAdShowedFullScreenContent() {
        switch (this.f23702b) {
            case 0:
                C4017ue c4017ue = (C4017ue) ((k) this.f23703c);
                c4017ue.getClass();
                w.d("#008 Must be called on the main UI thread.");
                i.a("Adapter called onAdOpened.");
                try {
                    ((InterfaceC3693od) c4017ue.f34630u).l();
                    break;
                } catch (RemoteException e6) {
                    i.i("#007 Could not call remote method.", e6);
                    return;
                }
            case 1:
                ((C4651f) this.f23703c).f38754g.f38812c = null;
                break;
            default:
                ((C4651f) this.f23703c).f38754g.f38812c = null;
                break;
        }
    }

    public /* synthetic */ d(AbstractC5124b abstractC5124b, int i) {
        this.f23702b = i;
        this.f23703c = abstractC5124b;
    }
}
