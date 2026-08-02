package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.NumberCheckoutView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class qm60 implements zo31 {
    public final NumberCheckoutView a;
    public final RobotoTextView b;
    public final GoImageView c;
    public final RobotoTextView d;

    public qm60(NumberCheckoutView numberCheckoutView, RobotoTextView robotoTextView, GoImageView goImageView, RobotoTextView robotoTextView2) {
        this.a = numberCheckoutView;
        this.b = robotoTextView;
        this.c = goImageView;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
