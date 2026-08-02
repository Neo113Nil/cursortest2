package defpackage;

import android.view.View;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesView;
import ru.yandex.taxi.preorder.summary.solid.sourcedestination.b;

/* loaded from: classes6.dex */
public final /* synthetic */ class qe30 implements SourceDestinationComponent.AddDestinationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qe30(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                MtCollapsedRoutesView.lambda$1$2((MtCollapsedRoutesView) obj, view);
                break;
            case 1:
                act0 act0Var = ((n0l0) obj).i;
                if (act0Var != null) {
                    act0Var.y0();
                    break;
                }
                break;
            default:
                ((b) obj).d();
                break;
        }
    }
}
