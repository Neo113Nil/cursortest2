package defpackage;

import android.view.View;
import com.yandex.go.taxi.order.info.OrderInfoFreightageView;
import ru.yandex.taxi.design.AutoDividerComponentList;

/* loaded from: classes14.dex */
public final class yx70 implements zo31 {
    public final OrderInfoFreightageView a;
    public final AutoDividerComponentList b;

    public yx70(OrderInfoFreightageView orderInfoFreightageView, AutoDividerComponentList autoDividerComponentList) {
        this.a = orderInfoFreightageView;
        this.b = autoDividerComponentList;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
