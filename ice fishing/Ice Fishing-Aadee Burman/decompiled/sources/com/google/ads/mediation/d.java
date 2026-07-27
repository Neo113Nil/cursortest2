package com.google.ads.mediation;

import P2.w;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C4274ze;
import com.google.android.gms.internal.ads.InterfaceC3841rd;
import k2.C4631a;
import k2.m;
import o4.C4793f;
import o4.C4799l;
import o4.InterfaceC4798k;
import v2.i;
import x2.k;

/* loaded from: classes.dex */
public final class d extends m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23546b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23547c;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, k kVar) {
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
            default:
                if (C4799l.f39630z.isShowing()) {
                    C4799l.f39630z.dismiss();
                }
                ((C4793f) this.f23547c).f39578g.getClass();
                C4799l.f();
                break;
        }
    }

    @Override // k2.m
    public void onAdFailedToShowFullScreenContent(C4631a c4631a) {
        switch (this.f23546b) {
            case 1:
                if (C4799l.f39630z.isShowing()) {
                    C4799l.f39630z.dismiss();
                }
                C4793f c4793f = (C4793f) this.f23547c;
                InterfaceC4798k interfaceC4798k = c4793f.f39576e;
                c4793f.f39578g.getClass();
                C4799l.f();
                if (C4799l.f39611f == 1 && C4799l.f39612g == 1) {
                    C4799l.g(c4793f.f39577f);
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
            default:
                ((C4793f) this.f23547c).f39578g.f39633c = null;
                break;
        }
    }

    public d(C4793f c4793f) {
        this.f23547c = c4793f;
    }
}
