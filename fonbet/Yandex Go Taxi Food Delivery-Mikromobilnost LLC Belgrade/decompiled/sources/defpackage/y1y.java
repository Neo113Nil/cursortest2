package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class y1y implements zo31 {
    public final /* synthetic */ int a = 1;
    public final GoLinearLayout b;
    public final ButtonComponent c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public y1y(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.b = goLinearLayout;
        this.c = buttonComponent;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }

    public y1y(GoLinearLayout goLinearLayout, RobotoTextView robotoTextView, ButtonComponent buttonComponent, RobotoTextView robotoTextView2) {
        this.b = goLinearLayout;
        this.d = robotoTextView;
        this.c = buttonComponent;
        this.e = robotoTextView2;
    }
}
