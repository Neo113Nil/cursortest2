package com.google.android.gms.internal.ads;

import r2.C4906k;
import s2.C4969z0;
import s2.InterfaceC4919a;

/* renamed from: com.google.android.gms.internal.ads.Un, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2836Un implements InterfaceC3013bl, InterfaceC2663Kk, InterfaceC4195xk, InterfaceC2544Dk, InterfaceC4919a, InterfaceC3603ml {

    /* renamed from: n, reason: collision with root package name */
    public final C3091d9 f28777n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f28778u = false;

    public C2836Un(C3091d9 c3091d9, Bt bt) {
        this.f28777n = c3091d9;
        c3091d9.b(2);
        if (bt != null) {
            c3091d9.b(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603ml
    public final void A(H9 h9) {
        C3091d9 c3091d9 = this.f28777n;
        synchronized (c3091d9) {
            if (c3091d9.f30488c) {
                try {
                    c3091d9.f30487b.m(h9);
                } catch (NullPointerException e9) {
                    C4906k.f40186C.f40196h.d("AdMobClearcutLogger.modify", e9);
                }
            }
        }
        c3091d9.b(1102);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603ml
    public final void E() {
        this.f28777n.b(1109);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4195xk
    public final void I(C4969z0 c4969z0) {
        int i = c4969z0.f40512n;
        C3091d9 c3091d9 = this.f28777n;
        switch (i) {
            case 1:
                c3091d9.b(101);
                break;
            case 2:
                c3091d9.b(102);
                break;
            case 3:
                c3091d9.b(5);
                break;
            case 4:
                c3091d9.b(103);
                break;
            case 5:
                c3091d9.b(104);
                break;
            case 6:
                c3091d9.b(105);
                break;
            case 7:
                c3091d9.b(106);
                break;
            default:
                c3091d9.b(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void O(Yt yt) {
        this.f28777n.a(new C2914Zk(yt));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603ml
    public final void a(H9 h9) {
        C3091d9 c3091d9 = this.f28777n;
        synchronized (c3091d9) {
            if (c3091d9.f30488c) {
                try {
                    c3091d9.f30487b.m(h9);
                } catch (NullPointerException e9) {
                    C4906k.f40186C.f40196h.d("AdMobClearcutLogger.modify", e9);
                }
            }
        }
        c3091d9.b(1104);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2663Kk
    public final void h() {
        this.f28777n.b(3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void i(C2759Qe c2759Qe) {
    }

    @Override // s2.InterfaceC4919a
    public final synchronized void onAdClicked() {
        if (this.f28778u) {
            this.f28777n.b(8);
        } else {
            this.f28777n.b(7);
            this.f28778u = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603ml
    public final void s(boolean z6) {
        this.f28777n.b(true != z6 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2544Dk
    public final synchronized void v() {
        this.f28777n.b(6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603ml
    public final void w(boolean z6) {
        this.f28777n.b(true != z6 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3603ml
    public final void x(H9 h9) {
        C3091d9 c3091d9 = this.f28777n;
        synchronized (c3091d9) {
            if (c3091d9.f30488c) {
                try {
                    c3091d9.f30487b.m(h9);
                } catch (NullPointerException e9) {
                    C4906k.f40186C.f40196h.d("AdMobClearcutLogger.modify", e9);
                }
            }
        }
        c3091d9.b(1103);
    }
}
