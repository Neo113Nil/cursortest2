package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class rma implements zo31 {
    public final GoLinearLayout a;
    public final RobotoTextView b;
    public final ButtonComponent c;
    public final GoImageView d;
    public final RobotoTextView e;

    public rma(GoImageView goImageView, GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goLinearLayout;
        this.b = robotoTextView;
        this.c = buttonComponent;
        this.d = goImageView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
