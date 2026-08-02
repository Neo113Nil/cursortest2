package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.DotsIndicatorView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes12.dex */
public final class vvs implements zo31 {
    public final GoLinearLayout a;
    public final GoLinearLayout b;
    public final DotsIndicatorView c;
    public final GoImageView d;
    public final RecyclerView e;
    public final ButtonComponent f;
    public final ButtonComponent g;
    public final GoLinearLayout h;
    public final RobotoTextView i;
    public final RobotoTextView j;
    public final ShimmeringBar k;

    public vvs(GoLinearLayout goLinearLayout, GoLinearLayout goLinearLayout2, DotsIndicatorView dotsIndicatorView, GoImageView goImageView, RecyclerView recyclerView, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, GoLinearLayout goLinearLayout3, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ShimmeringBar shimmeringBar) {
        this.a = goLinearLayout;
        this.b = goLinearLayout2;
        this.c = dotsIndicatorView;
        this.d = goImageView;
        this.e = recyclerView;
        this.f = buttonComponent;
        this.g = buttonComponent2;
        this.h = goLinearLayout3;
        this.i = robotoTextView;
        this.j = robotoTextView2;
        this.k = shimmeringBar;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
