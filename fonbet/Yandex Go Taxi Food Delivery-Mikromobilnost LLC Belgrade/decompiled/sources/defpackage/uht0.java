package defpackage;

import com.yandex.go.preorder.navigation.n;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;

/* loaded from: classes13.dex */
public final class uht0 implements iit0 {
    public final /* synthetic */ n a;

    public uht0(n nVar) {
        this.a = nVar;
    }

    @Override // defpackage.iit0
    public final void a(bov0 bov0Var) {
        kdb kdbVar;
        SummaryExpandReason b = bov0Var.b();
        yse0 yse0Var = new yse0(new xse0((!bov0Var.a() || b == null) ? ghv0.a : new hhv0(b), bov0Var.c, null, 60));
        n nVar = this.a;
        h0g h0gVar = nVar.s0;
        if (h0gVar == null || (kdbVar = h0gVar.h6) == null) {
            return;
        }
        nVar.D((wse0) kdbVar.get(), yse0Var, new rht0(nVar));
    }

    @Override // defpackage.iit0
    public final void b() {
    }
}
