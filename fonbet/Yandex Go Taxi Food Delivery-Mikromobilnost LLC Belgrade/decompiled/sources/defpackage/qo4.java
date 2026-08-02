package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.widget.BalanceBarView;
import ru.yandex.taxi.widget.BalanceWidget;

/* loaded from: classes6.dex */
public final class qo4 implements zo31 {
    public final BalanceWidget a;
    public final LinearLayout b;

    public qo4(BalanceWidget balanceWidget, BalanceBarView balanceBarView, LinearLayout linearLayout) {
        this.a = balanceWidget;
        this.b = linearLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
