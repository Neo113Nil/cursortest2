package com.google.android.gms.internal.ads;

import q2.C4927z0;
import q2.InterfaceC4877a;

/* renamed from: com.google.android.gms.internal.ads.Vn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2832Vn implements InterfaceC2944al, InterfaceC2608Ik, InterfaceC4131wk, InterfaceC2506Ck, InterfaceC4877a, InterfaceC3539ll {

    /* renamed from: n, reason: collision with root package name */
    public final C2914a9 f28303n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f28304u = false;

    public C2832Vn(C2914a9 c2914a9, Ct ct) {
        this.f28303n = c2914a9;
        c2914a9.b(2);
        if (ct != null) {
            c2914a9.b(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void D(C2953au c2953au) {
        this.f28303n.a(new C2880Yk(c2953au));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void H(C2687Ne c2687Ne) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3539ll
    public final void I(E9 e9) {
        C2914a9 c2914a9 = this.f28303n;
        synchronized (c2914a9) {
            if (c2914a9.f29177c) {
                try {
                    c2914a9.f29176b.m(e9);
                } catch (NullPointerException e6) {
                    p2.j.f39798C.f39808h.d("AdMobClearcutLogger.modify", e6);
                }
            }
        }
        c2914a9.b(1104);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3539ll
    public final void M(E9 e9) {
        C2914a9 c2914a9 = this.f28303n;
        synchronized (c2914a9) {
            if (c2914a9.f29177c) {
                try {
                    c2914a9.f29176b.m(e9);
                } catch (NullPointerException e6) {
                    p2.j.f39798C.f39808h.d("AdMobClearcutLogger.modify", e6);
                }
            }
        }
        c2914a9.b(1102);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2608Ik
    public final void e() {
        this.f28303n.b(3);
    }

    @Override // q2.InterfaceC4877a
    public final synchronized void onAdClicked() {
        if (this.f28304u) {
            this.f28303n.b(8);
        } else {
            this.f28303n.b(7);
            this.f28304u = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3539ll
    public final void q() {
        this.f28303n.b(1109);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3539ll
    public final void t(E9 e9) {
        C2914a9 c2914a9 = this.f28303n;
        synchronized (c2914a9) {
            if (c2914a9.f29177c) {
                try {
                    c2914a9.f29176b.m(e9);
                } catch (NullPointerException e6) {
                    p2.j.f39798C.f39808h.d("AdMobClearcutLogger.modify", e6);
                }
            }
        }
        c2914a9.b(1103);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3539ll
    public final void u(boolean z8) {
        this.f28303n.b(true != z8 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4131wk
    public final void v(C4927z0 c4927z0) {
        int i = c4927z0.f40122n;
        C2914a9 c2914a9 = this.f28303n;
        switch (i) {
            case 1:
                c2914a9.b(101);
                break;
            case 2:
                c2914a9.b(102);
                break;
            case 3:
                c2914a9.b(5);
                break;
            case 4:
                c2914a9.b(103);
                break;
            case 5:
                c2914a9.b(104);
                break;
            case 6:
                c2914a9.b(105);
                break;
            case 7:
                c2914a9.b(106);
                break;
            default:
                c2914a9.b(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
    public final synchronized void y() {
        this.f28303n.b(6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3539ll
    public final void z(boolean z8) {
        this.f28303n.b(true != z8 ? 1108 : 1107);
    }
}
