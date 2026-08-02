package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class sna0 implements zo31 {
    public final GoLinearLayout a;
    public final RobotoTextView b;
    public final GoImageView c;
    public final GoImageView d;

    public sna0(GoLinearLayout goLinearLayout, RobotoTextView robotoTextView, GoImageView goImageView, GoImageView goImageView2) {
        this.a = goLinearLayout;
        this.b = robotoTextView;
        this.c = goImageView;
        this.d = goImageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
