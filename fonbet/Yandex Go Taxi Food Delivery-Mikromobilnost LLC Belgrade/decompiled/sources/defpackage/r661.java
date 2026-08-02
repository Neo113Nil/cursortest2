package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Constraints;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.DashboardBalanceTextView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.GradientTextView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbCardIconView;
import com.ybsdk.widgets.common.dashboard.DashboardCollapsingBalanceView;
import com.ybsdk.widgets.common.dashboard.DashboardViewLayout;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class r661 implements zo31 {
    public final AppCompatImageView A;
    public final FrameLayout a;
    public final DashboardBalanceTextView b;
    public final TextView c;
    public final YbCardIconView d;
    public final wz51 e;
    public final DashboardViewLayout f;
    public final ErrorView g;
    public final AppCompatImageView h;
    public final LinearLayout i;
    public final TextView j;
    public final LinearLayout k;
    public final GradientTextView l;
    public final YbButtonView m;
    public final ShimmerFrameLayout n;
    public final b261 o;
    public final b261 p;
    public final wz51 q;
    public final TextView r;
    public final View s;
    public final AppCompatImageView t;
    public final AppCompatImageView u;
    public final AppCompatImageView v;
    public final LinearLayout w;
    public final RecyclerView x;
    public final YbButtonView y;
    public final ImageView z;

    public r661(FrameLayout frameLayout, DashboardBalanceTextView dashboardBalanceTextView, TextView textView, YbCardIconView ybCardIconView, wz51 wz51Var, DashboardViewLayout dashboardViewLayout, ErrorView errorView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, TextView textView2, LinearLayout linearLayout2, GradientTextView gradientTextView, YbButtonView ybButtonView, ShimmerFrameLayout shimmerFrameLayout, b261 b261Var, b261 b261Var2, wz51 wz51Var2, TextView textView3, View view, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, LinearLayout linearLayout3, RecyclerView recyclerView, YbButtonView ybButtonView2, ImageView imageView, AppCompatImageView appCompatImageView5) {
        this.a = frameLayout;
        this.b = dashboardBalanceTextView;
        this.c = textView;
        this.d = ybCardIconView;
        this.e = wz51Var;
        this.f = dashboardViewLayout;
        this.g = errorView;
        this.h = appCompatImageView;
        this.i = linearLayout;
        this.j = textView2;
        this.k = linearLayout2;
        this.l = gradientTextView;
        this.m = ybButtonView;
        this.n = shimmerFrameLayout;
        this.o = b261Var;
        this.p = b261Var2;
        this.q = wz51Var2;
        this.r = textView3;
        this.s = view;
        this.t = appCompatImageView2;
        this.u = appCompatImageView3;
        this.v = appCompatImageView4;
        this.w = linearLayout3;
        this.x = recyclerView;
        this.y = ybButtonView2;
        this.z = imageView;
        this.A = appCompatImageView5;
    }

    public static r661 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        r661 r661Var;
        View O;
        View O2;
        View O3;
        int i = 0;
        View inflate = layoutInflater.inflate(enh0.ybsdk_screen_dashboard, viewGroup, false);
        int i2 = wah0.accountBalanceView;
        DashboardBalanceTextView dashboardBalanceTextView = (DashboardBalanceTextView) cma1.O(i2, inflate);
        if (dashboardBalanceTextView != null) {
            i2 = wah0.accountTitleView;
            TextView textView = (TextView) cma1.O(i2, inflate);
            if (textView != null) {
                i2 = wah0.bottomSheetContainer;
                if (((FrameLayout) cma1.O(i2, inflate)) != null) {
                    i2 = wah0.cardStatusView;
                    YbCardIconView ybCardIconView = (YbCardIconView) cma1.O(i2, inflate);
                    if (ybCardIconView != null && (O = cma1.O((i2 = wah0.creditAccountShimmer), inflate)) != null) {
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) O;
                        int i3 = wah0.horizontalLineBalance;
                        if (((Constraints) cma1.O(i3, O)) != null) {
                            i3 = wah0.recyclerItem1;
                            if (((SkeletonView) cma1.O(i3, O)) != null) {
                                i3 = wah0.recyclerItem2;
                                if (((SkeletonView) cma1.O(i3, O)) != null) {
                                    i3 = wah0.recyclerItem3;
                                    if (((SkeletonView) cma1.O(i3, O)) != null) {
                                        wz51 wz51Var = new wz51(shimmerFrameLayout, 24);
                                        i2 = wah0.dashboardLayout;
                                        DashboardViewLayout dashboardViewLayout = (DashboardViewLayout) cma1.O(i2, inflate);
                                        if (dashboardViewLayout != null) {
                                            i2 = wah0.errorView;
                                            ErrorView errorView = (ErrorView) cma1.O(i2, inflate);
                                            if (errorView != null) {
                                                i2 = wah0.linearLayout;
                                                if (((DashboardCollapsingBalanceView) cma1.O(i2, inflate)) != null) {
                                                    i2 = wah0.logo;
                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, inflate);
                                                    if (appCompatImageView != null) {
                                                        i2 = wah0.logoPlaceholder;
                                                        LinearLayout linearLayout = (LinearLayout) cma1.O(i2, inflate);
                                                        if (linearLayout != null) {
                                                            i2 = wah0.logoText;
                                                            TextView textView2 = (TextView) cma1.O(i2, inflate);
                                                            if (textView2 != null) {
                                                                i2 = wah0.payButtonsContainer;
                                                                LinearLayout linearLayout2 = (LinearLayout) cma1.O(i2, inflate);
                                                                if (linearLayout2 != null) {
                                                                    i2 = wah0.plusBalanceView;
                                                                    GradientTextView gradientTextView = (GradientTextView) cma1.O(i2, inflate);
                                                                    if (gradientTextView != null) {
                                                                        i2 = wah0.replenishButton;
                                                                        YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, inflate);
                                                                        if (ybButtonView != null) {
                                                                            i2 = wah0.shimmerBalanceSubtitle;
                                                                            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) cma1.O(i2, inflate);
                                                                            if (shimmerFrameLayout2 != null && (O2 = cma1.O((i2 = wah0.shimmerLayoutBalance), inflate)) != null) {
                                                                                ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) O2;
                                                                                b261 b261Var = new b261(shimmerFrameLayout3, shimmerFrameLayout3, i);
                                                                                int i4 = wah0.shimmerLayoutButtons;
                                                                                View O4 = cma1.O(i4, inflate);
                                                                                if (O4 != null) {
                                                                                    ShimmerFrameLayout shimmerFrameLayout4 = (ShimmerFrameLayout) O4;
                                                                                    r661Var = null;
                                                                                    b261 b261Var2 = new b261(shimmerFrameLayout4, shimmerFrameLayout4, 1);
                                                                                    int i5 = wah0.splitShimmer;
                                                                                    View O5 = cma1.O(i5, inflate);
                                                                                    if (O5 != null) {
                                                                                        ShimmerFrameLayout shimmerFrameLayout5 = (ShimmerFrameLayout) O5;
                                                                                        int i6 = wah0.splitHorizontalLineBalance;
                                                                                        if (((Constraints) cma1.O(i6, O5)) != null) {
                                                                                            i6 = wah0.splitRecyclerItem1;
                                                                                            if (((SkeletonView) cma1.O(i6, O5)) != null) {
                                                                                                i6 = wah0.splitRecyclerItem2;
                                                                                                if (((SkeletonView) cma1.O(i6, O5)) != null) {
                                                                                                    i6 = wah0.splitRecyclerItem3;
                                                                                                    if (((SkeletonView) cma1.O(i6, O5)) != null) {
                                                                                                        i6 = wah0.splitRecyclerItem4;
                                                                                                        if (((LinearLayout) cma1.O(i6, O5)) != null) {
                                                                                                            i6 = wah0.splitRecyclerItem5;
                                                                                                            if (((LinearLayout) cma1.O(i6, O5)) != null) {
                                                                                                                i6 = wah0.splitRecyclerItem6;
                                                                                                                if (((LinearLayout) cma1.O(i6, O5)) != null) {
                                                                                                                    i6 = wah0.splitRecyclerItem7;
                                                                                                                    if (((LinearLayout) cma1.O(i6, O5)) != null) {
                                                                                                                        wz51 wz51Var2 = new wz51(shimmerFrameLayout5, 25);
                                                                                                                        i5 = wah0.subtitleTextView;
                                                                                                                        TextView textView3 = (TextView) cma1.O(i5, inflate);
                                                                                                                        if (textView3 != null && (O3 = cma1.O((i5 = wah0.toolbarClickableArea), inflate)) != null) {
                                                                                                                            i5 = wah0.toolbarIconProfile;
                                                                                                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i5, inflate);
                                                                                                                            if (appCompatImageView2 != null) {
                                                                                                                                i5 = wah0.toolbarIconQr;
                                                                                                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) cma1.O(i5, inflate);
                                                                                                                                if (appCompatImageView3 != null) {
                                                                                                                                    i5 = wah0.toolbarIconSupport;
                                                                                                                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) cma1.O(i5, inflate);
                                                                                                                                    if (appCompatImageView4 != null) {
                                                                                                                                        i5 = wah0.toolbarIconsContainer;
                                                                                                                                        LinearLayout linearLayout3 = (LinearLayout) cma1.O(i5, inflate);
                                                                                                                                        if (linearLayout3 != null) {
                                                                                                                                            i5 = wah0.toolbarIconsRecycler;
                                                                                                                                            RecyclerView recyclerView = (RecyclerView) cma1.O(i5, inflate);
                                                                                                                                            if (recyclerView != null) {
                                                                                                                                                i5 = wah0.transferButton;
                                                                                                                                                YbButtonView ybButtonView2 = (YbButtonView) cma1.O(i5, inflate);
                                                                                                                                                if (ybButtonView2 != null) {
                                                                                                                                                    i5 = wah0.userAvatar;
                                                                                                                                                    ImageView imageView = (ImageView) cma1.O(i5, inflate);
                                                                                                                                                    if (imageView != null) {
                                                                                                                                                        i5 = wah0.walletIcon;
                                                                                                                                                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) cma1.O(i5, inflate);
                                                                                                                                                        if (appCompatImageView5 != null) {
                                                                                                                                                            return new r661((FrameLayout) inflate, dashboardBalanceTextView, textView, ybCardIconView, wz51Var, dashboardViewLayout, errorView, appCompatImageView, linearLayout, textView2, linearLayout2, gradientTextView, ybButtonView, shimmerFrameLayout2, b261Var, b261Var2, wz51Var2, textView3, O3, appCompatImageView2, appCompatImageView3, appCompatImageView4, linearLayout3, recyclerView, ybButtonView2, imageView, appCompatImageView5);
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
                                                                                        }
                                                                                        ny61.t("Missing required view with ID: ".concat(O5.getResources().getResourceName(i6)));
                                                                                        return null;
                                                                                    }
                                                                                    i2 = i5;
                                                                                } else {
                                                                                    r661Var = null;
                                                                                    i2 = i4;
                                                                                }
                                                                                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                                                                                return r661Var;
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
                        ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i3)));
                        return null;
                    }
                }
            }
        }
        r661Var = null;
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return r661Var;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final FrameLayout o() {
        return this.a;
    }
}
