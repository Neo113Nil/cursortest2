package defpackage;

import android.view.View;
import android.view.ViewStub;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class zkg0 implements zo31 {
    public final GoLinearLayout a;
    public final GoLinearLayout b;
    public final RobotoTextView c;
    public final ViewStub d;
    public final RobotoTextView e;
    public final RobotoTextView f;

    public zkg0(GoLinearLayout goLinearLayout, GoLinearLayout goLinearLayout2, RobotoTextView robotoTextView, ViewStub viewStub, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.a = goLinearLayout;
        this.b = goLinearLayout2;
        this.c = robotoTextView;
        this.d = viewStub;
        this.e = robotoTextView2;
        this.f = robotoTextView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
