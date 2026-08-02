package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.ui.error.HubErrorView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class qxu implements zo31 {
    public final HubErrorView a;
    public final GoConstraintLayout b;
    public final RobotoTextView c;
    public final RobotoTextView d;
    public final RobotoTextView e;
    public final GoLinearLayout f;

    public qxu(HubErrorView hubErrorView, GoConstraintLayout goConstraintLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, GoLinearLayout goLinearLayout) {
        this.a = hubErrorView;
        this.b = goConstraintLayout;
        this.c = robotoTextView;
        this.d = robotoTextView2;
        this.e = robotoTextView3;
        this.f = goLinearLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
