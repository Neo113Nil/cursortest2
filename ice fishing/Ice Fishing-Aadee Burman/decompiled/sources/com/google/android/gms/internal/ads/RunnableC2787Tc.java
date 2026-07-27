package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Tc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2787Tc implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27742n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2720Pc f27743u;

    public /* synthetic */ RunnableC2787Tc(C2720Pc c2720Pc, int i) {
        this.f27742n = i;
        this.f27743u = c2720Pc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27742n) {
            case 0:
                C2720Pc c2720Pc = this.f27743u;
                InterfaceC4061vh interfaceC4061vh = c2720Pc.f26837n;
                if (interfaceC4061vh != null) {
                    interfaceC4061vh.destroy();
                    c2720Pc.f26837n = null;
                    break;
                }
                break;
            case 1:
                C2720Pc c2720Pc2 = this.f27743u;
                InterfaceC4061vh interfaceC4061vh2 = c2720Pc2.f26837n;
                if (interfaceC4061vh2 != null) {
                    interfaceC4061vh2.destroy();
                    c2720Pc2.f26837n = null;
                    break;
                }
                break;
            default:
                u2.z.k("maybeDestroy > Destroying engine.");
                C3088dc c3088dc = AbstractC3195fc.f30260j;
                C2720Pc c2720Pc3 = this.f27743u;
                c2720Pc3.h("/result", c3088dc);
                InterfaceC4061vh interfaceC4061vh3 = c2720Pc3.f26837n;
                if (interfaceC4061vh3 != null) {
                    interfaceC4061vh3.destroy();
                    c2720Pc3.f26837n = null;
                    break;
                }
                break;
        }
    }
}
