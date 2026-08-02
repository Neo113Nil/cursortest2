package defpackage;

import com.yandex.go.taxi.order.details.v2.analytics.g;
import com.yandex.go.taxi.order.details.v2.domain.a11y.b;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.details.v2.state.d;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.a;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.multiorder.e;

/* loaded from: classes14.dex */
public final class ukk0 extends ad5 {
    public final b A;
    public final o230 B;
    public final e C;
    public final a D;
    public final com.yandex.go.taxi.order.details.v2.state.elements.decorations.a E;
    public final h3y F;
    public final jok0 G;
    public final o2y0 H;
    public final ed80 I;
    public final g J;
    public final tt2 K;
    public final y3y0 L;
    public final n0 M;
    public final d x;
    public final jbk0 y;
    public final rpk0 z;

    public ukk0(d dVar, jbk0 jbk0Var, rpk0 rpk0Var, b bVar, o230 o230Var, e eVar, a aVar, com.yandex.go.taxi.order.details.v2.state.elements.decorations.a aVar2, h3y h3yVar, jok0 jok0Var, o2y0 o2y0Var, ed80 ed80Var, g gVar, tt2 tt2Var, y3y0 y3y0Var) {
        super(nkk0.class);
        this.x = dVar;
        this.y = jbk0Var;
        this.z = rpk0Var;
        this.A = bVar;
        this.B = o230Var;
        this.C = eVar;
        this.D = aVar;
        this.E = aVar2;
        this.F = h3yVar;
        this.G = jok0Var;
        this.H = o2y0Var;
        this.I = ed80Var;
        this.J = gVar;
        this.K = tt2Var;
        this.L = y3y0Var;
        this.M = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        this.A.a(RideCardPresentationType.DETAILS);
        super.Cg();
    }
}
