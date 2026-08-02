package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesView;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes6.dex */
public final class ye30 implements zo31 {
    public final MtCollapsedRoutesView a;
    public final SourceDestinationComponent b;
    public final GoLinearLayout c;
    public final GoLinearLayout d;
    public final ButtonComponent e;
    public final dv1 f;
    public final ViewPager2 g;
    public final GoImageButton h;
    public final PlaceholderView i;
    public final GoConstraintLayout j;
    public final GoConstraintLayout k;
    public final GoImageButton l;
    public final RobotoTextView m;
    public final ShimmeringRobotoTextView n;
    public final View o;
    public final RobotoTextView p;
    public final PlaceholderView q;

    public ye30(MtCollapsedRoutesView mtCollapsedRoutesView, SourceDestinationComponent sourceDestinationComponent, GoLinearLayout goLinearLayout, GoLinearLayout goLinearLayout2, ButtonComponent buttonComponent, dv1 dv1Var, ImageView imageView, ViewPager2 viewPager2, GoImageButton goImageButton, PlaceholderView placeholderView, GoConstraintLayout goConstraintLayout, GoConstraintLayout goConstraintLayout2, GoImageButton goImageButton2, RobotoTextView robotoTextView, ShimmeringRobotoTextView shimmeringRobotoTextView, View view, RobotoTextView robotoTextView2, FrameLayout frameLayout, PlaceholderView placeholderView2) {
        this.a = mtCollapsedRoutesView;
        this.b = sourceDestinationComponent;
        this.c = goLinearLayout;
        this.d = goLinearLayout2;
        this.e = buttonComponent;
        this.f = dv1Var;
        this.g = viewPager2;
        this.h = goImageButton;
        this.i = placeholderView;
        this.j = goConstraintLayout;
        this.k = goConstraintLayout2;
        this.l = goImageButton2;
        this.m = robotoTextView;
        this.n = shimmeringRobotoTextView;
        this.o = view;
        this.p = robotoTextView2;
        this.q = placeholderView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
