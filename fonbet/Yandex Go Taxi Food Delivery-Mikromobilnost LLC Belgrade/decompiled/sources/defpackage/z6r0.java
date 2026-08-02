package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class z6r0 implements zo31 {
    public final GoLinearLayout a;
    public final GoLinearLayout b;
    public final RobotoTextView c;

    public z6r0(GoLinearLayout goLinearLayout, GoLinearLayout goLinearLayout2, RobotoTextView robotoTextView) {
        this.a = goLinearLayout;
        this.b = goLinearLayout2;
        this.c = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
