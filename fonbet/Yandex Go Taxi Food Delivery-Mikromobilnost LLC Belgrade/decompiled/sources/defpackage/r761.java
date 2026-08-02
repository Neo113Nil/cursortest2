package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.feature.main.internal.screens.products.views.TsarButtonView;
import com.ybsdk.feature.main.internal.widgets.ProductCardListView;
import com.ybsdk.feature.main.internal.widgets.gradient.ProductsV4GradientView;
import com.ybsdk.widgets.common.CloseButtonView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.bottombar.BottomBarNavigation;
import com.ybsdk.widgets.common.recycler.OrientationAwareRecyclerView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;

/* loaded from: classes3.dex */
public final class r761 implements zo31 {
    public final ConstraintLayout a;
    public final AppBarLayout b;
    public final BottomBarNavigation c;
    public final CloseButtonView d;
    public final CollapsingToolbarLayout e;
    public final DivSkeletonsView f;
    public final AppCompatImageView g;
    public final YbDivView h;
    public final ErrorView i;
    public final ProductsV4GradientView j;
    public final ProductsV4GradientView k;
    public final CoordinatorLayout l;
    public final ProductCardListView m;
    public final ConstraintLayout n;
    public final YbDivView o;
    public final CustomSwipeRefreshLayout p;
    public final OrientationAwareRecyclerView q;
    public final ShimmerFrameLayout r;
    public final px6 s;
    public final LinearLayoutCompat t;
    public final TsarButtonView u;
    public final AppCompatImageView v;

    public r761(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, BottomBarNavigation bottomBarNavigation, CloseButtonView closeButtonView, CollapsingToolbarLayout collapsingToolbarLayout, DivSkeletonsView divSkeletonsView, AppCompatImageView appCompatImageView, YbDivView ybDivView, ErrorView errorView, ProductsV4GradientView productsV4GradientView, ProductsV4GradientView productsV4GradientView2, CoordinatorLayout coordinatorLayout, ProductCardListView productCardListView, ConstraintLayout constraintLayout2, YbDivView ybDivView2, CustomSwipeRefreshLayout customSwipeRefreshLayout, OrientationAwareRecyclerView orientationAwareRecyclerView, ShimmerFrameLayout shimmerFrameLayout, px6 px6Var, LinearLayoutCompat linearLayoutCompat, TsarButtonView tsarButtonView, AppCompatImageView appCompatImageView2) {
        this.a = constraintLayout;
        this.b = appBarLayout;
        this.c = bottomBarNavigation;
        this.d = closeButtonView;
        this.e = collapsingToolbarLayout;
        this.f = divSkeletonsView;
        this.g = appCompatImageView;
        this.h = ybDivView;
        this.i = errorView;
        this.j = productsV4GradientView;
        this.k = productsV4GradientView2;
        this.l = coordinatorLayout;
        this.m = productCardListView;
        this.n = constraintLayout2;
        this.o = ybDivView2;
        this.p = customSwipeRefreshLayout;
        this.q = orientationAwareRecyclerView;
        this.r = shimmerFrameLayout;
        this.s = px6Var;
        this.t = linearLayoutCompat;
        this.u = tsarButtonView;
        this.v = appCompatImageView2;
    }

    public static r761 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        r761 r761Var;
        View O;
        View inflate = layoutInflater.inflate(mnh0.ybsdk_screen_products, viewGroup, false);
        int i = ebh0.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) cma1.O(i, inflate);
        if (appBarLayout != null) {
            i = ebh0.bottomBar;
            BottomBarNavigation bottomBarNavigation = (BottomBarNavigation) cma1.O(i, inflate);
            if (bottomBarNavigation != null) {
                i = ebh0.closeButton;
                CloseButtonView closeButtonView = (CloseButtonView) cma1.O(i, inflate);
                if (closeButtonView != null) {
                    i = ebh0.collapsingToolbar;
                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) cma1.O(i, inflate);
                    if (collapsingToolbarLayout != null) {
                        i = ebh0.divSkeleton;
                        DivSkeletonsView divSkeletonsView = (DivSkeletonsView) cma1.O(i, inflate);
                        if (divSkeletonsView != null) {
                            i = ebh0.divSkeletonYbLogo;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                            if (appCompatImageView != null) {
                                i = ebh0.divUserInfoBlock;
                                YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
                                if (ybDivView != null) {
                                    i = ebh0.errorView;
                                    ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                                    if (errorView != null) {
                                        i = ebh0.footerGradientView;
                                        ProductsV4GradientView productsV4GradientView = (ProductsV4GradientView) cma1.O(i, inflate);
                                        if (productsV4GradientView != null) {
                                            i = ebh0.headerGradientView;
                                            ProductsV4GradientView productsV4GradientView2 = (ProductsV4GradientView) cma1.O(i, inflate);
                                            if (productsV4GradientView2 != null) {
                                                i = ebh0.productsCoordinator;
                                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) cma1.O(i, inflate);
                                                if (coordinatorLayout != null) {
                                                    i = ebh0.productsList;
                                                    ProductCardListView productCardListView = (ProductCardListView) cma1.O(i, inflate);
                                                    if (productCardListView != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                        i = ebh0.quickActionsHeaderDivView;
                                                        YbDivView ybDivView2 = (YbDivView) cma1.O(i, inflate);
                                                        if (ybDivView2 != null) {
                                                            i = ebh0.refreshLayout;
                                                            CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) cma1.O(i, inflate);
                                                            if (customSwipeRefreshLayout != null) {
                                                                i = ebh0.screenProductsRecycler;
                                                                OrientationAwareRecyclerView orientationAwareRecyclerView = (OrientationAwareRecyclerView) cma1.O(i, inflate);
                                                                if (orientationAwareRecyclerView != null) {
                                                                    i = ebh0.shimmerSkeleton;
                                                                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i, inflate);
                                                                    if (shimmerFrameLayout != null) {
                                                                        i = ebh0.shimmerSkeletonContent;
                                                                        r761Var = null;
                                                                        View O2 = cma1.O(i, inflate);
                                                                        if (O2 != null) {
                                                                            int i2 = ebh0.productsSkeleton;
                                                                            if (((SkeletonView) cma1.O(i2, O2)) != null) {
                                                                                i2 = ebh0.recyclerSkeleton;
                                                                                if (((ConstraintLayout) cma1.O(i2, O2)) != null) {
                                                                                    i2 = ebh0.skeletonLogo;
                                                                                    if (((AppCompatImageView) cma1.O(i2, O2)) != null) {
                                                                                        i2 = ebh0.skeletonMerchantsWidgetOffer1;
                                                                                        if (((SkeletonView) cma1.O(i2, O2)) != null) {
                                                                                            i2 = ebh0.skeletonMerchantsWidgetOffer2;
                                                                                            if (((SkeletonView) cma1.O(i2, O2)) != null) {
                                                                                                i2 = ebh0.skeletonMerchantsWidgetOffer3;
                                                                                                if (((SkeletonView) cma1.O(i2, O2)) != null) {
                                                                                                    i2 = ebh0.skeletonMerchantsWidgetOffer4;
                                                                                                    if (((SkeletonView) cma1.O(i2, O2)) != null) {
                                                                                                        i2 = ebh0.skeletonMerchantsWidgetTitle;
                                                                                                        if (((SkeletonView) cma1.O(i2, O2)) != null && (O = cma1.O((i2 = ebh0.skeletonNonPaymentProducts), O2)) != null) {
                                                                                                            int i3 = ebh0.nonPaymentProduct1;
                                                                                                            if (((SkeletonView) cma1.O(i3, O)) != null) {
                                                                                                                i3 = ebh0.nonPaymentProduct2;
                                                                                                                if (((SkeletonView) cma1.O(i3, O)) != null) {
                                                                                                                    i3 = ebh0.nonPaymentProduct3;
                                                                                                                    if (((SkeletonView) cma1.O(i3, O)) != null) {
                                                                                                                        i2 = ebh0.toolbarSkeleton;
                                                                                                                        if (((LinearLayoutCompat) cma1.O(i2, O2)) != null) {
                                                                                                                            i2 = ebh0.ybNotificationsSkeleton;
                                                                                                                            if (((SkeletonView) cma1.O(i2, O2)) != null) {
                                                                                                                                i2 = ebh0.ybOffersSkeleton;
                                                                                                                                if (((LinearLayoutCompat) cma1.O(i2, O2)) != null) {
                                                                                                                                    px6 px6Var = new px6((LinearLayout) O2, 8);
                                                                                                                                    int i4 = ebh0.toolbar;
                                                                                                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) cma1.O(i4, inflate);
                                                                                                                                    if (linearLayoutCompat != null) {
                                                                                                                                        i4 = ebh0.tsarButton;
                                                                                                                                        TsarButtonView tsarButtonView = (TsarButtonView) cma1.O(i4, inflate);
                                                                                                                                        if (tsarButtonView != null) {
                                                                                                                                            i4 = ebh0.ybLogo;
                                                                                                                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i4, inflate);
                                                                                                                                            if (appCompatImageView2 != null) {
                                                                                                                                                return new r761(constraintLayout, appBarLayout, bottomBarNavigation, closeButtonView, collapsingToolbarLayout, divSkeletonsView, appCompatImageView, ybDivView, errorView, productsV4GradientView, productsV4GradientView2, coordinatorLayout, productCardListView, constraintLayout, ybDivView2, customSwipeRefreshLayout, orientationAwareRecyclerView, shimmerFrameLayout, px6Var, linearLayoutCompat, tsarButtonView, appCompatImageView2);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    i = i4;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i3)));
                                                                                                            return null;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i2)));
                                                                            return null;
                                                                        }
                                                                        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                                                                        return r761Var;
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
        }
        r761Var = null;
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return r761Var;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final ConstraintLayout o() {
        return this.a;
    }
}
