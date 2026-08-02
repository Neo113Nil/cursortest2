package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class rj80 implements zo31 {
    public final GoFrameLayout a;
    public final ho4 b;
    public final GoImageView c;
    public final RobotoTextView d;

    public rj80(GoFrameLayout goFrameLayout, ho4 ho4Var, GoImageView goImageView, RobotoTextView robotoTextView) {
        this.a = goFrameLayout;
        this.b = ho4Var;
        this.c = goImageView;
        this.d = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
