package defpackage;

import android.view.View;
import com.yandex.go.taxi.order.details.v2.ui.view.item.cost_breakdown.CostDetailsView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class szx implements zo31 {
    public final CostDetailsView a;
    public final RobotoTextView b;
    public final RobotoTextView c;

    public szx(CostDetailsView costDetailsView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = costDetailsView;
        this.b = robotoTextView;
        this.c = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
