package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class w36 implements zo31 {
    public final GoConstraintLayout a;
    public final ButtonComponent b;
    public final BottomEdgeButtonLayout c;
    public final ButtonComponent d;
    public final RobotoTextView e;
    public final RobotoTextView f;

    public w36(GoConstraintLayout goConstraintLayout, ButtonComponent buttonComponent, BottomEdgeButtonLayout bottomEdgeButtonLayout, ButtonComponent buttonComponent2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goConstraintLayout;
        this.b = buttonComponent;
        this.c = bottomEdgeButtonLayout;
        this.d = buttonComponent2;
        this.e = robotoTextView;
        this.f = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
