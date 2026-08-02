package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class rn4 implements zo31 {
    public final GoLinearLayout a;
    public final RobotoTextView b;
    public final RobotoTextView c;

    public rn4(GoLinearLayout goLinearLayout, RobotoTextView robotoTextView, GoView goView, RobotoTextView robotoTextView2) {
        this.a = goLinearLayout;
        this.b = robotoTextView;
        this.c = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
