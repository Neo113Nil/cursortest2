package com.google.android.gms.internal.ads;

import p2.C4835j;
import q2.C4920z0;
import q2.InterfaceC4870a;

/* renamed from: com.google.android.gms.internal.ads.Tn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2798Tn implements InterfaceC2990bl, InterfaceC2643Kk, InterfaceC4172xk, InterfaceC2524Dk, InterfaceC4870a, InterfaceC3580ml {

    /* renamed from: n, reason: collision with root package name */
    public final C3068d9 f27792n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f27793u = false;

    public C2798Tn(C3068d9 c3068d9, Bt bt) {
        this.f27792n = c3068d9;
        c3068d9.b(2);
        if (bt != null) {
            c3068d9.b(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580ml
    public final void B(H9 h9) {
        C3068d9 c3068d9 = this.f27792n;
        synchronized (c3068d9) {
            if (c3068d9.f29716c) {
                try {
                    c3068d9.f29715b.m(h9);
                } catch (NullPointerException e9) {
                    C4835j.f39730C.f39740h.d("AdMobClearcutLogger.modify", e9);
                }
            }
        }
        c3068d9.b(1102);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580ml
    public final void E() {
        this.f27792n.b(1109);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
    public final void O(Yt yt) {
        this.f27792n.a(new C2891Zk(yt));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580ml
    public final void a(H9 h9) {
        C3068d9 c3068d9 = this.f27792n;
        synchronized (c3068d9) {
            if (c3068d9.f29716c) {
                try {
                    c3068d9.f29715b.m(h9);
                } catch (NullPointerException e9) {
                    C4835j.f39730C.f39740h.d("AdMobClearcutLogger.modify", e9);
                }
            }
        }
        c3068d9.b(1104);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2643Kk
    public final void h() {
        this.f27792n.b(3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
    public final void i(C2739Qe c2739Qe) {
    }

    @Override // q2.InterfaceC4870a
    public final synchronized void onAdClicked() {
        if (this.f27793u) {
            this.f27792n.b(8);
        } else {
            this.f27792n.b(7);
            this.f27793u = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580ml
    public final void s(boolean z3) {
        this.f27792n.b(true != z3 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4172xk
    public final void v(C4920z0 c4920z0) {
        int i = c4920z0.f40210n;
        C3068d9 c3068d9 = this.f27792n;
        switch (i) {
            case 1:
                c3068d9.b(101);
                break;
            case 2:
                c3068d9.b(102);
                break;
            case 3:
                c3068d9.b(5);
                break;
            case 4:
                c3068d9.b(103);
                break;
            case 5:
                c3068d9.b(104);
                break;
            case 6:
                c3068d9.b(105);
                break;
            case 7:
                c3068d9.b(106);
                break;
            default:
                c3068d9.b(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
    public final synchronized void w() {
        this.f27792n.b(6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580ml
    public final void x(boolean z3) {
        this.f27792n.b(true != z3 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3580ml
    public final void y(H9 h9) {
        C3068d9 c3068d9 = this.f27792n;
        synchronized (c3068d9) {
            if (c3068d9.f29716c) {
                try {
                    c3068d9.f29715b.m(h9);
                } catch (NullPointerException e9) {
                    C4835j.f39730C.f39740h.d("AdMobClearcutLogger.modify", e9);
                }
            }
        }
        c3068d9.b(1103);
    }
}
