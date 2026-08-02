package defpackage;

import io.grpc.util.a;

/* loaded from: classes5.dex */
public final class ynd extends ceg {
    public final /* synthetic */ a g;

    public ynd(a aVar) {
        super(0);
        this.g = aVar;
    }

    @Override // defpackage.ceg
    public final void p(sgr sgrVar) {
        this.g.h.Z(r76.c, new wrk(xdg.a(sgrVar), 1));
    }

    @Override // defpackage.ceg
    public final void r(ydg ydgVar) {
        throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
    }

    @Override // defpackage.ceg
    public final void y() {
    }
}
