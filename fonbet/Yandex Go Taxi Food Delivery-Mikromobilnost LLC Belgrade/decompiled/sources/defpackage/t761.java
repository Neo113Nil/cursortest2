package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupSummaryView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ScrollableNestedScrollView;
import com.ybsdk.widgets.common.SelectedItemFormView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class t761 implements zo31 {
    public final FrameLayout a;
    public final SelectedItemFormView b;
    public final YbButtonViewGroup c;
    public final YbDivView d;
    public final RecyclerView e;
    public final ScrollableNestedScrollView f;
    public final wz51 g;
    public final AutoTopupSummaryView h;
    public final AppCompatTextView i;
    public final YbDivView j;
    public final AppCompatTextView k;
    public final ErrorView l;
    public final ToolbarView m;

    public t761(FrameLayout frameLayout, SelectedItemFormView selectedItemFormView, YbButtonViewGroup ybButtonViewGroup, YbDivView ybDivView, RecyclerView recyclerView, ScrollableNestedScrollView scrollableNestedScrollView, wz51 wz51Var, AutoTopupSummaryView autoTopupSummaryView, AppCompatTextView appCompatTextView, YbDivView ybDivView2, AppCompatTextView appCompatTextView2, ErrorView errorView, ToolbarView toolbarView) {
        this.a = frameLayout;
        this.b = selectedItemFormView;
        this.c = ybButtonViewGroup;
        this.d = ybDivView;
        this.e = recyclerView;
        this.f = scrollableNestedScrollView;
        this.g = wz51Var;
        this.h = autoTopupSummaryView;
        this.i = appCompatTextView;
        this.j = ybDivView2;
        this.k = appCompatTextView2;
        this.l = errorView;
        this.m = toolbarView;
    }

    public static t761 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(xmh0.ybsdk_screen_rounding, viewGroup, false);
        int i = pah0.autoTopupPaymentMethod;
        SelectedItemFormView selectedItemFormView = (SelectedItemFormView) cma1.O(i, inflate);
        if (selectedItemFormView != null) {
            i = pah0.autotopupButtonGroup;
            YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i, inflate);
            if (ybButtonViewGroup != null) {
                i = pah0.autotopupDivView;
                YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
                if (ybDivView != null) {
                    i = pah0.autotopupOptionsList;
                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                    if (recyclerView != null) {
                        i = pah0.autotopupScrollView;
                        ScrollableNestedScrollView scrollableNestedScrollView = (ScrollableNestedScrollView) cma1.O(i, inflate);
                        if (scrollableNestedScrollView != null && (O = cma1.O((i = pah0.autotopupSkeletons), inflate)) != null) {
                            int i2 = pah0.button;
                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                i2 = pah0.frequency1;
                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                    i2 = pah0.frequency2;
                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                        i2 = pah0.frequency3;
                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                            i2 = pah0.source;
                                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                i2 = pah0.title;
                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                    i2 = pah0.triviaLink;
                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                        wz51 wz51Var = new wz51((ShimmerFrameLayout) O, 21);
                                                        i = pah0.autotopupSummaryView;
                                                        AutoTopupSummaryView autoTopupSummaryView = (AutoTopupSummaryView) cma1.O(i, inflate);
                                                        if (autoTopupSummaryView != null) {
                                                            i = pah0.autotopupTitle;
                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
                                                            if (appCompatTextView != null) {
                                                                i = pah0.autotopupTopDivView;
                                                                YbDivView ybDivView2 = (YbDivView) cma1.O(i, inflate);
                                                                if (ybDivView2 != null) {
                                                                    i = pah0.autotopupTriviaLink;
                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i, inflate);
                                                                    if (appCompatTextView2 != null) {
                                                                        i = pah0.autotopupWidgetBarrier;
                                                                        if (((Barrier) cma1.O(i, inflate)) != null) {
                                                                            i = pah0.communicationFullScreen;
                                                                            if (((CommunicationFullScreenView) cma1.O(i, inflate)) != null) {
                                                                                i = pah0.error;
                                                                                ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                                                                                if (errorView != null) {
                                                                                    i = pah0.toolbar;
                                                                                    ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                                                                    if (toolbarView != null) {
                                                                                        return new t761((FrameLayout) inflate, selectedItemFormView, ybButtonViewGroup, ybDivView, recyclerView, scrollableNestedScrollView, wz51Var, autoTopupSummaryView, appCompatTextView, ybDivView2, appCompatTextView2, errorView, toolbarView);
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
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final FrameLayout o() {
        return this.a;
    }
}
