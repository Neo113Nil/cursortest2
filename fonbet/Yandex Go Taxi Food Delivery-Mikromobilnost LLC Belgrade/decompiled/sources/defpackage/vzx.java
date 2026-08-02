package defpackage;

import android.view.View;
import com.yandex.go.taxi.order.details.v1.ui.DetailsButtonComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class vzx implements zo31 {
    public final DetailsButtonComponent a;
    public final RobotoTextView b;
    public final ButtonComponent c;

    public vzx(DetailsButtonComponent detailsButtonComponent, RobotoTextView robotoTextView, ButtonComponent buttonComponent) {
        this.a = detailsButtonComponent;
        this.b = robotoTextView;
        this.c = buttonComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
