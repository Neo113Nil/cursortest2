package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.view.DashboardTokenizationWidget;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.TraceIdErrorView;
import com.ybsdk.widgets.common.recycler.OrientationAwareRecyclerView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;

/* loaded from: classes3.dex */
public final class s661 implements zo31 {
    public final FrameLayout a;
    public final AppBarLayout b;
    public final ConstraintLayout c;
    public final CoordinatorLayout d;
    public final TraceIdErrorView e;
    public final ErrorView f;
    public final RecyclerView g;
    public final CustomSwipeRefreshLayout h;
    public final RecyclerView i;
    public final SpoilerTextView j;
    public final TextView k;
    public final DashboardTokenizationWidget l;
    public final ImageView m;
    public final t661 n;
    public final wz51 o;
    public final OrientationAwareRecyclerView p;

    public s661(FrameLayout frameLayout, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout, TraceIdErrorView traceIdErrorView, ErrorView errorView, RecyclerView recyclerView, CustomSwipeRefreshLayout customSwipeRefreshLayout, RecyclerView recyclerView2, SpoilerTextView spoilerTextView, TextView textView, DashboardTokenizationWidget dashboardTokenizationWidget, ImageView imageView, t661 t661Var, wz51 wz51Var, OrientationAwareRecyclerView orientationAwareRecyclerView) {
        this.a = frameLayout;
        this.b = appBarLayout;
        this.c = constraintLayout;
        this.d = coordinatorLayout;
        this.e = traceIdErrorView;
        this.f = errorView;
        this.g = recyclerView;
        this.h = customSwipeRefreshLayout;
        this.i = recyclerView2;
        this.j = spoilerTextView;
        this.k = textView;
        this.l = dashboardTokenizationWidget;
        this.m = imageView;
        this.n = t661Var;
        this.o = wz51Var;
        this.p = orientationAwareRecyclerView;
    }

    public static s661 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        s661 s661Var;
        View view;
        int i;
        View inflate = layoutInflater.inflate(enh0.ybsdk_screen_dashboard_v3, viewGroup, false);
        int i2 = wah0.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) cma1.O(i2, inflate);
        if (appBarLayout != null) {
            i2 = wah0.collapsingToolbar;
            if (((CollapsingToolbarLayout) cma1.O(i2, inflate)) != null) {
                i2 = wah0.container;
                if (((ConstraintLayout) cma1.O(i2, inflate)) != null) {
                    i2 = wah0.contentToolbar;
                    ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i2, inflate);
                    if (constraintLayout != null) {
                        i2 = wah0.coordinator;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) cma1.O(i2, inflate);
                        if (coordinatorLayout != null) {
                            FrameLayout frameLayout = (FrameLayout) inflate;
                            i2 = wah0.errorTraceId;
                            TraceIdErrorView traceIdErrorView = (TraceIdErrorView) cma1.O(i2, inflate);
                            if (traceIdErrorView != null) {
                                i2 = wah0.errorView;
                                ErrorView errorView = (ErrorView) cma1.O(i2, inflate);
                                if (errorView != null) {
                                    i2 = wah0.leftToolbarButtons;
                                    RecyclerView recyclerView = (RecyclerView) cma1.O(i2, inflate);
                                    if (recyclerView != null) {
                                        i2 = wah0.refreshLayout;
                                        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) cma1.O(i2, inflate);
                                        if (customSwipeRefreshLayout != null) {
                                            i2 = wah0.rightToolbarButtons;
                                            RecyclerView recyclerView2 = (RecyclerView) cma1.O(i2, inflate);
                                            if (recyclerView2 != null) {
                                                i2 = wah0.subtitle;
                                                SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i2, inflate);
                                                if (spoilerTextView != null) {
                                                    i2 = wah0.title;
                                                    TextView textView = (TextView) cma1.O(i2, inflate);
                                                    if (textView != null) {
                                                        i2 = wah0.tokenizeView;
                                                        DashboardTokenizationWidget dashboardTokenizationWidget = (DashboardTokenizationWidget) cma1.O(i2, inflate);
                                                        if (dashboardTokenizationWidget != null) {
                                                            i2 = wah0.toolbar;
                                                            if (((Toolbar) cma1.O(i2, inflate)) != null) {
                                                                i2 = wah0.toolbarAfterTitleImage;
                                                                ImageView imageView = (ImageView) cma1.O(i2, inflate);
                                                                if (imageView != null) {
                                                                    i2 = wah0.toolbarLoading;
                                                                    s661Var = null;
                                                                    View O = cma1.O(i2, inflate);
                                                                    if (O != null) {
                                                                        int i3 = wah0.leftSkeleton;
                                                                        SkeletonView skeletonView = (SkeletonView) cma1.O(i3, O);
                                                                        if (skeletonView != null) {
                                                                            int i4 = wah0.rightSkeleton;
                                                                            view = O;
                                                                            SkeletonView skeletonView2 = (SkeletonView) cma1.O(i4, O);
                                                                            if (skeletonView2 != null) {
                                                                                t661 t661Var = new t661((ShimmerFrameLayout) view, skeletonView, skeletonView2, 1);
                                                                                i2 = wah0.toolbarTokenizationWidgetLoading;
                                                                                View O2 = cma1.O(i2, inflate);
                                                                                if (O2 != null) {
                                                                                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) O2;
                                                                                    int i5 = wah0.skeletonview1;
                                                                                    if (((SkeletonView) cma1.O(i5, O2)) != null) {
                                                                                        i5 = wah0.skeletonview2;
                                                                                        if (((SkeletonView) cma1.O(i5, O2)) != null) {
                                                                                            i5 = wah0.skeletonview3;
                                                                                            if (((SkeletonView) cma1.O(i5, O2)) != null) {
                                                                                                wz51 wz51Var = new wz51(shimmerFrameLayout, 19);
                                                                                                i2 = wah0.widgetsList;
                                                                                                OrientationAwareRecyclerView orientationAwareRecyclerView = (OrientationAwareRecyclerView) cma1.O(i2, inflate);
                                                                                                if (orientationAwareRecyclerView != null) {
                                                                                                    return new s661(frameLayout, appBarLayout, constraintLayout, coordinatorLayout, traceIdErrorView, errorView, recyclerView, customSwipeRefreshLayout, recyclerView2, spoilerTextView, textView, dashboardTokenizationWidget, imageView, t661Var, wz51Var, orientationAwareRecyclerView);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i5)));
                                                                                    return null;
                                                                                }
                                                                            } else {
                                                                                i = i4;
                                                                            }
                                                                        } else {
                                                                            view = O;
                                                                            i = i3;
                                                                        }
                                                                        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
                                                                        return null;
                                                                    }
                                                                    ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                                                                    return s661Var;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        s661Var = null;
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return s661Var;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final FrameLayout o() {
        return this.a;
    }
}
