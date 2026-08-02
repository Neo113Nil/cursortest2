package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Tc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2808Tc implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28529n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2740Pc f28530u;

    public /* synthetic */ RunnableC2808Tc(C2740Pc c2740Pc, int i) {
        this.f28529n = i;
        this.f28530u = c2740Pc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28529n) {
            case 0:
                C2740Pc c2740Pc = this.f28530u;
                InterfaceC4084vh interfaceC4084vh = c2740Pc.f27625n;
                if (interfaceC4084vh != null) {
                    interfaceC4084vh.destroy();
                    c2740Pc.f27625n = null;
                    break;
                }
                break;
            case 1:
                C2740Pc c2740Pc2 = this.f28530u;
                InterfaceC4084vh interfaceC4084vh2 = c2740Pc2.f27625n;
                if (interfaceC4084vh2 != null) {
                    interfaceC4084vh2.destroy();
                    c2740Pc2.f27625n = null;
                    break;
                }
                break;
            default:
                w2.z.k("maybeDestroy > Destroying engine.");
                C3111dc c3111dc = AbstractC3218fc.f31048j;
                C2740Pc c2740Pc3 = this.f28530u;
                c2740Pc3.h("/result", c3111dc);
                InterfaceC4084vh interfaceC4084vh3 = c2740Pc3.f27625n;
                if (interfaceC4084vh3 != null) {
                    interfaceC4084vh3.destroy();
                    c2740Pc3.f27625n = null;
                    break;
                }
                break;
        }
    }
}
