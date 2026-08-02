package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.design.spoiler.SpoilerFrameLayout;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.savings.internal.views.SavingsAccountTickerView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ImageViewWithCustomScaleTypes;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;

/* loaded from: classes3.dex */
public final class u761 implements zo31 {
    public final FrameLayout a;
    public final ImageViewWithCustomScaleTypes b;
    public final SavingsAccountTickerView c;
    public final LinearLayoutCompat d;
    public final YbButtonViewGroup e;
    public final YbDivView f;
    public final ErrorView g;
    public final SpoilerTextView h;
    public final AppCompatTextView i;
    public final MotionLayout j;
    public final wz51 k;
    public final TextView l;
    public final TextView m;
    public final SpoilerFrameLayout n;
    public final AppCompatImageView o;
    public final CustomSwipeRefreshLayout p;
    public final RecyclerView q;

    public u761(FrameLayout frameLayout, ImageViewWithCustomScaleTypes imageViewWithCustomScaleTypes, SavingsAccountTickerView savingsAccountTickerView, LinearLayoutCompat linearLayoutCompat, YbButtonViewGroup ybButtonViewGroup, YbDivView ybDivView, ErrorView errorView, SpoilerTextView spoilerTextView, AppCompatTextView appCompatTextView, MotionLayout motionLayout, wz51 wz51Var, TextView textView, TextView textView2, SpoilerFrameLayout spoilerFrameLayout, AppCompatImageView appCompatImageView, CustomSwipeRefreshLayout customSwipeRefreshLayout, RecyclerView recyclerView) {
        this.a = frameLayout;
        this.b = imageViewWithCustomScaleTypes;
        this.c = savingsAccountTickerView;
        this.d = linearLayoutCompat;
        this.e = ybButtonViewGroup;
        this.f = ybDivView;
        this.g = errorView;
        this.h = spoilerTextView;
        this.i = appCompatTextView;
        this.j = motionLayout;
        this.k = wz51Var;
        this.l = textView;
        this.m = textView2;
        this.n = spoilerFrameLayout;
        this.o = appCompatImageView;
        this.p = customSwipeRefreshLayout;
        this.q = recyclerView;
    }

    public static u761 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(doh0.ybsdk_screen_savings_account, viewGroup, false);
        int i = tbh0.backgroundImage;
        ImageViewWithCustomScaleTypes imageViewWithCustomScaleTypes = (ImageViewWithCustomScaleTypes) cma1.O(i, inflate);
        if (imageViewWithCustomScaleTypes != null) {
            i = tbh0.balance;
            SavingsAccountTickerView savingsAccountTickerView = (SavingsAccountTickerView) cma1.O(i, inflate);
            if (savingsAccountTickerView != null) {
                i = tbh0.balanceContainer;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) cma1.O(i, inflate);
                if (linearLayoutCompat != null) {
                    i = tbh0.buttonsGroup;
                    YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i, inflate);
                    if (ybButtonViewGroup != null) {
                        i = tbh0.divSaverSubtitle;
                        YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
                        if (ybDivView != null) {
                            i = tbh0.error;
                            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                            if (errorView != null) {
                                i = tbh0.gains;
                                SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i, inflate);
                                if (spoilerTextView != null) {
                                    i = tbh0.goal;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
                                    if (appCompatTextView != null) {
                                        i = tbh0.motionLayout;
                                        MotionLayout motionLayout = (MotionLayout) cma1.O(i, inflate);
                                        if (motionLayout != null && (O = cma1.O((i = tbh0.progressContainer), inflate)) != null) {
                                            wz51 wz51Var = new wz51((ShimmerFrameLayout) O, 22);
                                            i = tbh0.saverSubtitle;
                                            TextView textView = (TextView) cma1.O(i, inflate);
                                            if (textView != null) {
                                                i = tbh0.saverTitle;
                                                TextView textView2 = (TextView) cma1.O(i, inflate);
                                                if (textView2 != null) {
                                                    FrameLayout frameLayout = (FrameLayout) inflate;
                                                    i = tbh0.spoilerBalance;
                                                    SpoilerFrameLayout spoilerFrameLayout = (SpoilerFrameLayout) cma1.O(i, inflate);
                                                    if (spoilerFrameLayout != null) {
                                                        i = tbh0.supportButton;
                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                                                        if (appCompatImageView != null) {
                                                            i = tbh0.swipeRefresh;
                                                            CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) cma1.O(i, inflate);
                                                            if (customSwipeRefreshLayout != null) {
                                                                i = tbh0.toolbar;
                                                                if (((ConstraintLayout) cma1.O(i, inflate)) != null) {
                                                                    i = tbh0.widgets;
                                                                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                                                    if (recyclerView != null) {
                                                                        return new u761(frameLayout, imageViewWithCustomScaleTypes, savingsAccountTickerView, linearLayoutCompat, ybButtonViewGroup, ybDivView, errorView, spoilerTextView, appCompatTextView, motionLayout, wz51Var, textView, textView2, spoilerFrameLayout, appCompatImageView, customSwipeRefreshLayout, recyclerView);
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
