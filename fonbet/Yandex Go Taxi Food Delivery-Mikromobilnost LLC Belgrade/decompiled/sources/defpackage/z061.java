package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.core.design.spoiler.SpoilerFrameLayout;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.view.DashboardCardView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.RadialGradientTextView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class z061 implements zo31 {
    public final DashboardCardView a;
    public final ImageView b;
    public final RadialGradientTextView c;
    public final ImageView d;
    public final ImageView e;
    public final ShimmerFrameLayout f;
    public final SpoilerFrameLayout g;
    public final RadialGradientTextView h;
    public final YbDivView i;
    public final ImageView j;
    public final TextView k;
    public final ImageView l;

    public z061(DashboardCardView dashboardCardView, ImageView imageView, RadialGradientTextView radialGradientTextView, ImageView imageView2, ImageView imageView3, ShimmerFrameLayout shimmerFrameLayout, SpoilerFrameLayout spoilerFrameLayout, RadialGradientTextView radialGradientTextView2, YbDivView ybDivView, ImageView imageView4, TextView textView, ImageView imageView5) {
        this.a = dashboardCardView;
        this.b = imageView;
        this.c = radialGradientTextView;
        this.d = imageView2;
        this.e = imageView3;
        this.f = shimmerFrameLayout;
        this.g = spoilerFrameLayout;
        this.h = radialGradientTextView2;
        this.i = ybDivView;
        this.j = imageView4;
        this.k = textView;
        this.l = imageView5;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
