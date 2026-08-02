package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.snackbar.SnackbarView;

/* loaded from: classes3.dex */
public final class y461 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonView b;
    public final Group c;
    public final TextView d;
    public final AppCompatImageView e;
    public final TextView f;
    public final ErrorView g;
    public final wz51 h;
    public final RecyclerView i;
    public final SnackbarView j;
    public final ToolbarView k;

    public y461(ConstraintLayout constraintLayout, YbButtonView ybButtonView, Group group, TextView textView, AppCompatImageView appCompatImageView, TextView textView2, ErrorView errorView, wz51 wz51Var, RecyclerView recyclerView, SnackbarView snackbarView, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = ybButtonView;
        this.c = group;
        this.d = textView;
        this.e = appCompatImageView;
        this.f = textView2;
        this.g = errorView;
        this.h = wz51Var;
        this.i = recyclerView;
        this.j = snackbarView;
        this.k = toolbarView;
    }

    public static y461 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(znh0.ybsdk_qr_subscriptions_list, viewGroup, false);
        int i = pbh0.agreeButton;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
        if (ybButtonView != null) {
            i = pbh0.emptyState;
            Group group = (Group) cma1.O(i, inflate);
            if (group != null) {
                i = pbh0.emptySubscriptionDescription;
                TextView textView = (TextView) cma1.O(i, inflate);
                if (textView != null) {
                    i = pbh0.emptySubscriptionImage;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                    if (appCompatImageView != null) {
                        i = pbh0.emptySubscriptionTitle;
                        TextView textView2 = (TextView) cma1.O(i, inflate);
                        if (textView2 != null) {
                            i = pbh0.errorView;
                            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                            if (errorView != null && (O = cma1.O((i = pbh0.loadingState), inflate)) != null) {
                                int i2 = pbh0.containerFive;
                                if (((ConstraintLayout) cma1.O(i2, O)) != null) {
                                    i2 = pbh0.containerFour;
                                    if (((ConstraintLayout) cma1.O(i2, O)) != null) {
                                        i2 = pbh0.containerOne;
                                        if (((ConstraintLayout) cma1.O(i2, O)) != null) {
                                            i2 = pbh0.containerThree;
                                            if (((ConstraintLayout) cma1.O(i2, O)) != null) {
                                                i2 = pbh0.containerTwo;
                                                if (((ConstraintLayout) cma1.O(i2, O)) != null) {
                                                    i2 = pbh0.iconFive;
                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                        i2 = pbh0.iconFour;
                                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                            i2 = pbh0.iconOne;
                                                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                i2 = pbh0.iconThree;
                                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                    i2 = pbh0.iconTwo;
                                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                        i2 = pbh0.sbpDescriptionPartOne;
                                                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                            i2 = pbh0.sbpDescriptionPartTwo;
                                                                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                i2 = pbh0.sbpTitlePartOne;
                                                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                    i2 = pbh0.sbpTitlePartTwo;
                                                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                        i2 = pbh0.titleFive;
                                                                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                            i2 = pbh0.titleFour;
                                                                                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                                i2 = pbh0.titleOne;
                                                                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                                    i2 = pbh0.titleThree;
                                                                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                                        i2 = pbh0.titleTwo;
                                                                                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                                            wz51 wz51Var = new wz51((ShimmerFrameLayout) O, 15);
                                                                                                            i = pbh0.subscriptionsList;
                                                                                                            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                                                                                            if (recyclerView != null) {
                                                                                                                i = pbh0.subscriptionsSnackbar;
                                                                                                                SnackbarView snackbarView = (SnackbarView) cma1.O(i, inflate);
                                                                                                                if (snackbarView != null) {
                                                                                                                    i = pbh0.toolbar;
                                                                                                                    ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                                                                                                    if (toolbarView != null) {
                                                                                                                        return new y461((ConstraintLayout) inflate, ybButtonView, group, textView, appCompatImageView, textView2, errorView, wz51Var, recyclerView, snackbarView, toolbarView);
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
                                                }
                                            }
                                        }
                                    }
                                }
                                ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                                return null;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
