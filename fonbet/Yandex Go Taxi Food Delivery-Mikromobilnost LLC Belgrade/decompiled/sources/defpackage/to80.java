package defpackage;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.common.ui.indicator.DotsIndicatorComponent;
import com.yandex.go.places.impl.ui.common.compression_resistant.CompressionResistantListComponent;
import ru.yandex.taxi.design.RatingBarComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class to80 implements zo31 {
    public final GoLinearLayout a;
    public final GoLinearLayout b;
    public final HorizontalScrollView c;
    public final View d;
    public final DotsIndicatorComponent e;
    public final View f;
    public final ViewPager2 g;
    public final GoFrameLayout h;
    public final RecyclerView i;
    public final RobotoTextView j;
    public final RatingBarComponent k;
    public final LinearLayout l;
    public final RobotoTextView m;
    public final CompressionResistantListComponent n;
    public final GoLinearLayout o;
    public final HorizontalScrollView p;
    public final RobotoTextView q;

    public to80(GoLinearLayout goLinearLayout, GoLinearLayout goLinearLayout2, HorizontalScrollView horizontalScrollView, View view, DotsIndicatorComponent dotsIndicatorComponent, View view2, ViewPager2 viewPager2, GoFrameLayout goFrameLayout, RecyclerView recyclerView, RobotoTextView robotoTextView, RatingBarComponent ratingBarComponent, LinearLayout linearLayout, RobotoTextView robotoTextView2, CompressionResistantListComponent compressionResistantListComponent, GoLinearLayout goLinearLayout3, HorizontalScrollView horizontalScrollView2, RobotoTextView robotoTextView3) {
        this.a = goLinearLayout;
        this.b = goLinearLayout2;
        this.c = horizontalScrollView;
        this.d = view;
        this.e = dotsIndicatorComponent;
        this.f = view2;
        this.g = viewPager2;
        this.h = goFrameLayout;
        this.i = recyclerView;
        this.j = robotoTextView;
        this.k = ratingBarComponent;
        this.l = linearLayout;
        this.m = robotoTextView2;
        this.n = compressionResistantListComponent;
        this.o = goLinearLayout3;
        this.p = horizontalScrollView2;
        this.q = robotoTextView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
