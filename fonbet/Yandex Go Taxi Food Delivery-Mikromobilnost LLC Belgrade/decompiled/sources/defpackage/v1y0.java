package defpackage;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final /* synthetic */ class v1y0 {
    public final /* synthetic */ sm40 a;
    public final /* synthetic */ oh70 b;
    public final /* synthetic */ x980 c;

    public /* synthetic */ v1y0(sm40 sm40Var, oh70 oh70Var, x980 x980Var) {
        this.a = sm40Var;
        this.b = oh70Var;
        this.c = x980Var;
    }

    public final void a() {
        if (this.a.b()) {
            this.b.b(SourcePicker.B_FROM_ORDER, PointType.DESTINATION);
        } else {
            f fVar = (f) this.c;
            ((pep0) fVar.E0).f((m950) fVar.F0.get(), new hre0(new vpe0(new Preorder(0)), new jse0(), "make another order", true, new im0(true)), hxx.a);
        }
    }
}
