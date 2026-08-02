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

/* loaded from: classes3.dex */
public final class vz51 implements zo31 {
    public final ConstraintLayout a;
    public final Group b;
    public final ErrorView c;
    public final wz51 d;
    public final ToolbarView e;
    public final YbButtonView f;
    public final TextView g;
    public final AppCompatImageView h;
    public final TextView i;
    public final RecyclerView j;

    public vz51(ConstraintLayout constraintLayout, Group group, ErrorView errorView, wz51 wz51Var, ToolbarView toolbarView, YbButtonView ybButtonView, TextView textView, AppCompatImageView appCompatImageView, TextView textView2, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = group;
        this.c = errorView;
        this.d = wz51Var;
        this.e = toolbarView;
        this.f = ybButtonView;
        this.g = textView;
        this.h = appCompatImageView;
        this.i = textView2;
        this.j = recyclerView;
    }

    public static vz51 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(noh0.ybsdk_auto_pull_list, viewGroup, false);
        int i = cch0.autoPullEmptyState;
        Group group = (Group) cma1.O(i, inflate);
        if (group != null) {
            i = cch0.autoPullErrorView;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null && (O = cma1.O((i = cch0.autoPullLoadingState), inflate)) != null) {
                int i2 = cch0.containerFive;
                if (((ConstraintLayout) cma1.O(i2, O)) != null) {
                    i2 = cch0.containerFour;
                    if (((ConstraintLayout) cma1.O(i2, O)) != null) {
                        i2 = cch0.containerOne;
                        if (((ConstraintLayout) cma1.O(i2, O)) != null) {
                            i2 = cch0.containerThree;
                            if (((ConstraintLayout) cma1.O(i2, O)) != null) {
                                i2 = cch0.containerTwo;
                                if (((ConstraintLayout) cma1.O(i2, O)) != null) {
                                    i2 = cch0.iconFive;
                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                        i2 = cch0.iconFour;
                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                            i2 = cch0.iconOne;
                                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                i2 = cch0.iconThree;
                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                    i2 = cch0.iconTwo;
                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                        i2 = cch0.sbpDescriptionPartOne;
                                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                            i2 = cch0.sbpDescriptionPartTwo;
                                                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                i2 = cch0.sbpTitlePartOne;
                                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                    i2 = cch0.sbpTitlePartTwo;
                                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                        i2 = cch0.titleFive;
                                                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                            i2 = cch0.titleFour;
                                                                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                i2 = cch0.titleOne;
                                                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                    i2 = cch0.titleThree;
                                                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                        i2 = cch0.titleTwo;
                                                                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                            wz51 wz51Var = new wz51((ShimmerFrameLayout) O, 0);
                                                                                            i = cch0.autoPullToolbar;
                                                                                            ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                                                                            if (toolbarView != null) {
                                                                                                i = cch0.autoPullsAgreeButton;
                                                                                                YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
                                                                                                if (ybButtonView != null) {
                                                                                                    i = cch0.autoPullsEmptyDescription;
                                                                                                    TextView textView = (TextView) cma1.O(i, inflate);
                                                                                                    if (textView != null) {
                                                                                                        i = cch0.autoPullsEmptyImage;
                                                                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                                                                                                        if (appCompatImageView != null) {
                                                                                                            i = cch0.autoPullsEmptyTitle;
                                                                                                            TextView textView2 = (TextView) cma1.O(i, inflate);
                                                                                                            if (textView2 != null) {
                                                                                                                i = cch0.autoPullsList;
                                                                                                                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                                                                                                if (recyclerView != null) {
                                                                                                                    return new vz51((ConstraintLayout) inflate, group, errorView, wz51Var, toolbarView, ybButtonView, textView, appCompatImageView, textView2, recyclerView);
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
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                return null;
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
