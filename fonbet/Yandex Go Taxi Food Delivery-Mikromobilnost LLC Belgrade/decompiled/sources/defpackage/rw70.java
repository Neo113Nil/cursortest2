package defpackage;

import com.yandex.go.superapp.order.multi.old.view.OrderStackView;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.i;

/* loaded from: classes6.dex */
public final class rw70 implements OrderStackView.a {
    public final /* synthetic */ OrderFragment a;

    public rw70(OrderFragment orderFragment) {
        this.a = orderFragment;
    }

    @Override // com.yandex.go.superapp.order.multi.old.view.OrderStackView.a
    public final void D7() {
        this.a.getPresenter().Rg(true);
    }

    @Override // com.yandex.go.superapp.order.multi.old.view.OrderStackView.a
    public final void Jb(o2y0 o2y0Var) {
        this.a.getPresenter().Jb(o2y0Var);
    }

    @Override // com.yandex.go.superapp.order.multi.old.view.OrderStackView.a
    public final void V6() {
        this.a.restoreProcessing();
    }

    @Override // com.yandex.go.superapp.order.multi.old.view.OrderStackView.a
    public final void m7() {
        i presenter = this.a.getPresenter();
        o2y0 o2y0Var = presenter.y0;
        if (o2y0Var != null) {
            presenter.Vg(o2y0Var.c());
        }
    }

    @Override // com.yandex.go.superapp.order.multi.old.view.OrderStackView.a
    public final void sa(int i) {
        edj edjVar;
        OrderFragment orderFragment = this.a;
        edjVar = orderFragment.contentAccessibilityDelegate;
        orderFragment.updateAccessibility(edjVar);
        i presenter = orderFragment.getPresenter();
        if (i > 0) {
            presenter.Rg(true);
        } else {
            presenter.getClass();
        }
    }

    @Override // com.yandex.go.superapp.order.multi.old.view.OrderStackView.a
    public final void vc() {
        this.a.getPresenter().Rg(true);
    }
}
