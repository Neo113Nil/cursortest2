package defpackage;

import com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.SuperAppOrderBundleView;
import java.util.List;

/* loaded from: classes14.dex */
public final class r5w0 implements p5w0 {
    public final /* synthetic */ SuperAppOrderBundleView a;

    public r5w0(SuperAppOrderBundleView superAppOrderBundleView) {
        this.a = superAppOrderBundleView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        zl70 zl70Var;
        zl70 zl70Var2;
        List list = (List) obj;
        int size = list.size();
        SuperAppOrderBundleView superAppOrderBundleView = this.a;
        zl70Var = superAppOrderBundleView.adapter;
        boolean z = size != zl70Var.getItemCount();
        zl70Var2 = superAppOrderBundleView.adapter;
        zl70Var2.submitList(list, new rg3(z, superAppOrderBundleView, 12));
    }
}
