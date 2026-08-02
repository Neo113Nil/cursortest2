package defpackage;

import android.content.Context;
import com.yandex.go.places.impl.ui.payments.processing.PaymentsProcessingModalView;
import com.yandex.go.places.impl.ui.payments.processing.a;

/* loaded from: classes13.dex */
public final class vna0 extends m230 implements bgc0 {
    public final tna0 E;
    public final yna0 F;
    public final w030 G;
    public final boolean H;

    public vna0(tna0 tna0Var, yna0 yna0Var, w030 w030Var) {
        super(null);
        this.E = tna0Var;
        this.F = yna0Var;
        this.G = w030Var;
        this.H = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.G;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.H;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        una0 una0Var = (una0) obj;
        aq80 aq80Var = new aq80(this);
        vx0 vx0Var = this.F.a;
        a aVar = new a(aq80Var, una0Var, (com.yandex.go.places.impl.data.repositories.payments.status.a) vx0Var.a.get(), (com.yandex.go.places.impl.data.repositories.payments.process.a) vx0Var.b.get(), (jio) vx0Var.c.get());
        mma0 mma0Var = this.E.a;
        return new PaymentsProcessingModalView((Context) mma0Var.a.get(), (c2x0) mma0Var.b.get(), aVar);
    }

    @Override // defpackage.bgc0
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.bgc0
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        return true;
    }
}
