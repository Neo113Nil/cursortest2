package ru.yandex.taxi.banners;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.jl40;
import defpackage.xw31;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes5.dex */
public final class a {
    public final View a;
    public final View b;
    public final BannerAnimationHeightController$LayoutChangeListener c = new View.OnLayoutChangeListener() { // from class: ru.yandex.taxi.banners.BannerAnimationHeightController$LayoutChangeListener
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            int height = a.this.a.getHeight();
            int height2 = a.this.b.getHeight();
            a aVar = a.this;
            if (height > height2 - aVar.d) {
                View view = aVar.a;
                int height3 = aVar.b.getHeight() - a.this.d;
                Rect rect = xw31.a;
                ru.yandex.taxi.design.utils.c.C(height3, view);
            }
        }
    };
    public final int d;

    /* JADX WARN: Type inference failed for: r2v1, types: [ru.yandex.taxi.banners.BannerAnimationHeightController$LayoutChangeListener] */
    public a(LottieAnimationView lottieAnimationView, NestedScrollViewAdvanced nestedScrollViewAdvanced) {
        this.a = lottieAnimationView;
        this.b = nestedScrollViewAdvanced;
        this.d = a(lottieAnimationView);
    }

    public final int a(View view) {
        if (jl40.l(view, this.b)) {
            return view.getPaddingBottom() + view.getPaddingTop();
        }
        if (!jl40.l(view, this.a)) {
            Rect rect = xw31.a;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).topMargin : 0;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            r1 = view.getPaddingBottom() + view.getPaddingTop() + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin : 0) + i;
        }
        return a((View) view.getParent()) + r1;
    }
}
