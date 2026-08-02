package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.flex.main_screen.presentation.controllers.shimmer.OptimizedShimmerContentView;

/* loaded from: classes12.dex */
public final class qd70 implements zo31 {
    public final OptimizedShimmerContentView a;
    public final GoFrameLayout b;
    public final GoFrameLayout c;
    public final GoFrameLayout d;
    public final GoFrameLayout e;
    public final GoFrameLayout f;
    public final GoFrameLayout g;
    public final GoFrameLayout h;

    public qd70(OptimizedShimmerContentView optimizedShimmerContentView, GoFrameLayout goFrameLayout, GoFrameLayout goFrameLayout2, GoFrameLayout goFrameLayout3, GoFrameLayout goFrameLayout4, GoFrameLayout goFrameLayout5, GoFrameLayout goFrameLayout6, GoFrameLayout goFrameLayout7) {
        this.a = optimizedShimmerContentView;
        this.b = goFrameLayout;
        this.c = goFrameLayout2;
        this.d = goFrameLayout3;
        this.e = goFrameLayout4;
        this.f = goFrameLayout5;
        this.g = goFrameLayout6;
        this.h = goFrameLayout7;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
