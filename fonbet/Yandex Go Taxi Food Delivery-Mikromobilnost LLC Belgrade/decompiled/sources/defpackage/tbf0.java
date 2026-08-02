package defpackage;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.main.internal.widgets.gradient.ProductsV4GradientView;
import com.ybsdk.widgets.common.recycler.OrientationAwareRecyclerView;

/* loaded from: classes3.dex */
public final class tbf0 extends RecyclerView.g {
    public final OrientationAwareRecyclerView a;
    public final LinearLayoutCompat b;
    public final ProductsV4GradientView c;
    public final ProductsV4GradientView d;
    public final c8u0 e;
    public final bms f;
    public final LinearLayoutManager g;
    public final ArgbEvaluatorCompat h;
    public final int[] i;
    public final int[] j;
    public Boolean k;
    public Float l;
    public Float m;

    public tbf0(OrientationAwareRecyclerView orientationAwareRecyclerView, LinearLayoutCompat linearLayoutCompat, ProductsV4GradientView productsV4GradientView, ProductsV4GradientView productsV4GradientView2, c8u0 c8u0Var, bms bmsVar) {
        this.a = orientationAwareRecyclerView;
        this.b = linearLayoutCompat;
        this.c = productsV4GradientView;
        this.d = productsV4GradientView2;
        this.e = c8u0Var;
        this.f = bmsVar;
        RecyclerView.e layoutManager = orientationAwareRecyclerView.getLayoutManager();
        this.g = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        this.h = ArgbEvaluatorCompat.getInstance();
        this.i = new int[2];
        this.j = new int[2];
    }

    public final void a() {
        LinearLayoutManager linearLayoutManager;
        int M1;
        float c;
        float c2 = c();
        float c3 = y6i0.c(c2, 0.0f, 1.0f);
        if (!jl40.g(c3, this.l)) {
            this.l = Float.valueOf(c3);
            c8u0 c8u0Var = this.e;
            Integer valueOf = Integer.valueOf(c8u0Var.g);
            Integer valueOf2 = Integer.valueOf(c8u0Var.f);
            ArgbEvaluatorCompat argbEvaluatorCompat = this.h;
            this.f.invoke(new ksz0(argbEvaluatorCompat.evaluate(c3, valueOf, valueOf2).intValue(), 1), new ColorModel.Raw(argbEvaluatorCompat.evaluate(c3, Integer.valueOf(c8u0Var.i), Integer.valueOf(c8u0Var.h)).intValue()), new ColorModel.Raw(argbEvaluatorCompat.evaluate(c3, Integer.valueOf(c8u0Var.k), Integer.valueOf(c8u0Var.j)).intValue()), z1x0.a(c8u0Var.a, mob1.c(c3 < 0.5f, true)));
        }
        boolean z = c2 < 1.0f;
        if (!Boolean.valueOf(z).equals(this.k)) {
            this.k = Boolean.valueOf(z);
            int i = z ? 0 : 8;
            ProductsV4GradientView productsV4GradientView = this.c;
            productsV4GradientView.setVisibility(i);
            if (z) {
                productsV4GradientView.startGradientAnimation();
            } else {
                productsV4GradientView.stopGradientAnimation();
            }
        }
        ProductsV4GradientView productsV4GradientView2 = this.d;
        if (productsV4GradientView2 == null || (linearLayoutManager = this.g) == null || (M1 = linearLayoutManager.M1()) == -1) {
            return;
        }
        if (M1 < linearLayoutManager.getItemCount() - 1) {
            c = 0.0f;
        } else {
            View X = linearLayoutManager.X(M1);
            if (X == null) {
                return;
            }
            OrientationAwareRecyclerView orientationAwareRecyclerView = this.a;
            int h0 = linearLayoutManager.h0(X) - (orientationAwareRecyclerView.getHeight() - orientationAwareRecyclerView.getPaddingBottom());
            if (h0 < 0) {
                h0 = 0;
            }
            c = y6i0.c(1.0f - (h0 / orientationAwareRecyclerView.getResources().getDimension(cwg0.ybsdk_products_v4_gradient_height)), 0.0f, 1.0f);
        }
        if (jl40.g(c, this.m)) {
            return;
        }
        this.m = Float.valueOf(c);
        productsV4GradientView2.setAlpha(c);
        if (c > 0.0f) {
            productsV4GradientView2.setVisibility(0);
            productsV4GradientView2.startGradientAnimation();
        } else {
            productsV4GradientView2.setVisibility(8);
            productsV4GradientView2.stopGradientAnimation();
        }
    }

    public final sbf0 b() {
        View X;
        LinearLayoutManager linearLayoutManager = this.g;
        if (linearLayoutManager == null || (X = linearLayoutManager.X(0)) == null) {
            return null;
        }
        OrientationAwareRecyclerView orientationAwareRecyclerView = this.a;
        int[] iArr = this.i;
        orientationAwareRecyclerView.getLocationInWindow(iArr);
        LinearLayoutCompat linearLayoutCompat = this.b;
        int[] iArr2 = this.j;
        linearLayoutCompat.getLocationInWindow(iArr2);
        return new sbf0(X.getTop() + iArr[1], linearLayoutCompat.getHeight() + iArr2[1]);
    }

    public final float c() {
        LinearLayoutManager linearLayoutManager = this.g;
        if (linearLayoutManager == null) {
            return 0.0f;
        }
        if (linearLayoutManager.X(0) == null) {
            return linearLayoutManager.K1() > 0 ? 1.0f : 0.0f;
        }
        sbf0 b = b();
        if (b == null) {
            return 0.0f;
        }
        float f = b.b;
        float height = f - (f - (this.b.getHeight() * 0.1f));
        if (height == 0.0f) {
            return 0.0f;
        }
        return (f - b.a) / height;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        sbf0 b;
        if (i == 0) {
            float c = c();
            if (c <= 0.0f || c >= 1.0f || (b = b()) == null) {
                return;
            }
            this.a.smoothScrollBy(0, b.a - b.b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        a();
    }
}
