package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.rate_route.RatingReasonsView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersFrameLayout;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes12.dex */
public final class r7i0 implements zo31 {
    public final GoLinearLayout a;
    public final RobotoTextView b;
    public final GoFrameLayout c;
    public final RobotoTextView d;
    public final RobotoTextView e;
    public final ListItemInputComponent f;
    public final Group g;
    public final ButtonComponent h;
    public final GoLinearLayout i;
    public final RoundedCornersFrameLayout j;
    public final GoConstraintLayout k;
    public final RobotoTextView l;
    public final RatingReasonsView m;
    public final RobotoTextView n;
    public final RobotoTextView o;
    public final GoConstraintLayout p;
    public final NestedScrollViewAdvanced q;
    public final Group r;
    public final RobotoTextView s;

    public r7i0(GoLinearLayout goLinearLayout, RobotoTextView robotoTextView, GoFrameLayout goFrameLayout, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, ListItemInputComponent listItemInputComponent, Group group, ButtonComponent buttonComponent, GoLinearLayout goLinearLayout2, RoundedCornersFrameLayout roundedCornersFrameLayout, GoConstraintLayout goConstraintLayout, RobotoTextView robotoTextView4, RatingReasonsView ratingReasonsView, RobotoTextView robotoTextView5, RobotoTextView robotoTextView6, GoConstraintLayout goConstraintLayout2, NestedScrollViewAdvanced nestedScrollViewAdvanced, Group group2, RobotoTextView robotoTextView7) {
        this.a = goLinearLayout;
        this.b = robotoTextView;
        this.c = goFrameLayout;
        this.d = robotoTextView2;
        this.e = robotoTextView3;
        this.f = listItemInputComponent;
        this.g = group;
        this.h = buttonComponent;
        this.i = goLinearLayout2;
        this.j = roundedCornersFrameLayout;
        this.k = goConstraintLayout;
        this.l = robotoTextView4;
        this.m = ratingReasonsView;
        this.n = robotoTextView5;
        this.o = robotoTextView6;
        this.p = goConstraintLayout2;
        this.q = nestedScrollViewAdvanced;
        this.r = group2;
        this.s = robotoTextView7;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
