package defpackage;

import com.yandex.go.preorder.navigation.c;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class vqe0 implements lhm {
    public final /* synthetic */ c a;
    public final /* synthetic */ k9s0 b;

    public vqe0(c cVar, k9s0 k9s0Var) {
        this.a = cVar;
        this.b = k9s0Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        c.P(this.a, this.b.e);
    }

    @Override // defpackage.lhm
    public final void b(String str) {
        c.Q(this.a, str, this.b, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY);
    }

    @Override // defpackage.lhm
    public final void e() {
        this.a.S(this.b);
    }
}
