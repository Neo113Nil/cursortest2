package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.ui.items.DefaultOfferHeaderView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class xt60 implements zo31 {
    public final GoConstraintLayout a;
    public final RobotoTextView b;
    public final DefaultOfferHeaderView c;
    public final RobotoTextView d;

    public xt60(GoConstraintLayout goConstraintLayout, RobotoTextView robotoTextView, DefaultOfferHeaderView defaultOfferHeaderView, RobotoTextView robotoTextView2) {
        this.a = goConstraintLayout;
        this.b = robotoTextView;
        this.c = defaultOfferHeaderView;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
