package defpackage;

import android.content.Context;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.taxi.intercity.dashboard.impl.flex.modal.IntercityDashboardFlexModalView;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.surge.dialog.price_complain.SurgePriceComplainModalView;
import ru.yandex.taxi.surge.interactor.r;

/* loaded from: classes14.dex */
public final class yuw0 extends a {
    public final /* synthetic */ int F;
    public final boolean G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yuw0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        super(null);
        this.F = i;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.K = obj4;
        this.L = obj5;
        this.M = obj6;
        this.N = obj7;
        this.G = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        switch (this.F) {
            case 0:
                return ((i130) this.H).a();
            default:
                return (w030) this.H;
        }
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        switch (this.F) {
        }
        return this.G;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        int i = this.F;
        Object obj2 = this.J;
        Object obj3 = this.I;
        switch (i) {
            case 0:
                l7s0 l7s0Var = new l7s0(this);
                kob0 kob0Var = ((xuw0) obj2).a;
                return new SurgePriceComplainModalView((Context) ((uuw0) obj3).a.a.get(), new wuw0((Context) kob0Var.a.get(), (rye0) obj, l7s0Var, (r) kob0Var.b.get(), (ru.yandex.taxi.surge.repository.a) kob0Var.c.get(), (wiq0) kob0Var.d.get(), (quw0) kob0Var.e.get(), (tj60) kob0Var.f.get(), (xcv0) kob0Var.g.get()));
            default:
                vdw vdwVar = (vdw) obj;
                k6x k6xVar = (k6x) this.L;
                cir cirVar = (cir) this.M;
                mlw mlwVar = (mlw) this.K;
                cxq0 cxq0Var = ((sdw) obj3).a;
                return new IntercityDashboardFlexModalView((Context) ((xvf0) cxq0Var.b).get(), new xdw(vdwVar.a, vdwVar.b), new tdw(this), (oew) obj2, k6xVar, cirVar, mlwVar, (ziv) cxq0Var.c, (oep0) ((xvf0) cxq0Var.w).get(), (xgr) ((xvf0) cxq0Var.x).get());
        }
    }
}
