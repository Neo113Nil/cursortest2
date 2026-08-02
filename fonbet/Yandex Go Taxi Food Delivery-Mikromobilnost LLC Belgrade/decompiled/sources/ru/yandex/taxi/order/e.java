package ru.yandex.taxi.order;

import android.app.Activity;
import com.yandex.go.taxi.order.models.api.status.RequiredCardBalance;
import com.yandex.go.taxi.order.models.api.status.RequiredYangopayBalance;
import defpackage.a980;
import defpackage.be9;
import defpackage.hst;
import defpackage.iw40;
import defpackage.jst;
import defpackage.mpw;
import defpackage.o2y0;
import defpackage.qdj;
import defpackage.tdj;
import defpackage.tje;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes14.dex */
public final class e extends iw40 {
    public final /* synthetic */ f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Activity activity, a980 a980Var) {
        super(activity, a980Var);
        this.c = fVar;
    }

    @Override // defpackage.iw40
    public final void B0(o2y0 o2y0Var) {
        if ("default".equals("default")) {
            if (o2y0Var == null) {
                jst.e.e("TaxiOrder.Navigation.MultiorderCallback.onShown", "OrderControllerCompatFragmentRouter", new IllegalStateException("Assigned order holder is expected for dialogs with no default tag"));
            } else {
                f fVar = this.c;
                fVar.O0.add(tje.N(fVar.o(), null, null, new OrderControllerCompatFragmentRouter$createMultiOrderCallback$1$onShown$1(fVar, o2y0Var, null), 3));
            }
        }
    }

    @Override // defpackage.lit
    public final void Qe(o2y0 o2y0Var, boolean z) {
        f fVar = this.c;
        if (z) {
            fVar.m0(o2y0Var);
        } else {
            fVar.p0(o2y0Var);
        }
    }

    @Override // defpackage.lit
    public final void S0(o2y0 o2y0Var) {
        this.c.W(o2y0Var, o2y0Var.b().h.b, null);
    }

    @Override // defpackage.sdj
    public final qdj h(tdj tdjVar, ModalView modalView) {
        B0((o2y0) tdjVar.a);
        f fVar = this.c;
        OrderFragment orderFragment = fVar.p1;
        if (fVar.u() && orderFragment != null) {
            orderFragment.openModalView(modalView, modalView.getOnAppearingListener());
            return new mpw(modalView, 1);
        }
        hst hstVar = jst.e;
        hstVar.m("TaxiOrder.Navigation.MultiorderCallback.show").a(20, "OrderControllerCompatFragmentRouter", new IllegalStateException("Wrong state of OrderController"), "Error of open modal view");
        return null;
    }

    @Override // defpackage.lit
    public final void lg(o2y0 o2y0Var) {
        this.c.n0(o2y0Var);
    }

    @Override // defpackage.lit
    public final void openOrderPaymentMethods(o2y0 o2y0Var) {
        this.c.k0(o2y0Var);
    }

    @Override // defpackage.lit
    public final void p3(o2y0 o2y0Var, RequiredYangopayBalance requiredYangopayBalance, boolean z) {
        this.c.l0(o2y0Var, requiredYangopayBalance, this.a, "MultiorderCallback");
    }

    @Override // defpackage.lit
    public final void ug(o2y0 o2y0Var, RequiredCardBalance requiredCardBalance, be9 be9Var) {
        ((com.yandex.go.yb.b) this.c.a0.get()).b(o2y0Var, requiredCardBalance, be9Var);
    }
}
