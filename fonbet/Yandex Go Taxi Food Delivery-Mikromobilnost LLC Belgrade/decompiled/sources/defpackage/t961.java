package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewpager2.widget.ViewPager2;
import com.ybsdk.core.transfer.utils.CashbackView;
import com.ybsdk.core.transfer.utils.TransferToolbarView;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.view.TransferMainSkeletonView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.MoneyInputEditView;
import com.ybsdk.widgets.common.PageIndicatorView;
import com.ybsdk.widgets.common.SuggestsGroupView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class t961 implements zo31 {
    public final ConstraintLayout a;
    public final Group b;
    public final TextView c;
    public final View d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final MoneyInputEditView h;
    public final CashbackView i;
    public final AppCompatEditText j;
    public final YbButtonView k;
    public final ErrorView l;
    public final TextView m;
    public final TextView n;
    public final NumberKeyboardView o;
    public final ViewPager2 p;
    public final PageIndicatorView q;
    public final n961 r;
    public final TransferMainSkeletonView s;
    public final SuggestsGroupView t;
    public final TransferToolbarView u;

    public t961(ConstraintLayout constraintLayout, Group group, TextView textView, View view, TextView textView2, TextView textView3, TextView textView4, MoneyInputEditView moneyInputEditView, CashbackView cashbackView, AppCompatEditText appCompatEditText, YbButtonView ybButtonView, ErrorView errorView, TextView textView5, TextView textView6, NumberKeyboardView numberKeyboardView, ViewPager2 viewPager2, PageIndicatorView pageIndicatorView, n961 n961Var, TransferMainSkeletonView transferMainSkeletonView, SuggestsGroupView suggestsGroupView, TransferToolbarView transferToolbarView) {
        this.a = constraintLayout;
        this.b = group;
        this.c = textView;
        this.d = view;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = moneyInputEditView;
        this.i = cashbackView;
        this.j = appCompatEditText;
        this.k = ybButtonView;
        this.l = errorView;
        this.m = textView5;
        this.n = textView6;
        this.o = numberKeyboardView;
        this.p = viewPager2;
        this.q = pageIndicatorView;
        this.r = n961Var;
        this.s = transferMainSkeletonView;
        this.t = suggestsGroupView;
        this.u = transferToolbarView;
    }

    public static t961 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View O2;
        View inflate = layoutInflater.inflate(noh0.ybsdk_transfer_main, viewGroup, false);
        int i = cch0.groupToHideOnScenarioLoading;
        Group group = (Group) cma1.O(i, inflate);
        if (group != null) {
            i = cch0.infoSubtitleTextView;
            TextView textView = (TextView) cma1.O(i, inflate);
            if (textView != null && (O = cma1.O((i = cch0.tooltipAnchor), inflate)) != null) {
                i = cch0.transferCurrencyRate;
                TextView textView2 = (TextView) cma1.O(i, inflate);
                if (textView2 != null) {
                    i = cch0.transferDepositCurrencyRate;
                    TextView textView3 = (TextView) cma1.O(i, inflate);
                    if (textView3 != null) {
                        i = cch0.transferMainAmountCurrency;
                        TextView textView4 = (TextView) cma1.O(i, inflate);
                        if (textView4 != null) {
                            i = cch0.transferMainAmountInput;
                            MoneyInputEditView moneyInputEditView = (MoneyInputEditView) cma1.O(i, inflate);
                            if (moneyInputEditView != null) {
                                i = cch0.transferMainCashback;
                                CashbackView cashbackView = (CashbackView) cma1.O(i, inflate);
                                if (cashbackView != null) {
                                    i = cch0.transferMainComment;
                                    AppCompatEditText appCompatEditText = (AppCompatEditText) cma1.O(i, inflate);
                                    if (appCompatEditText != null) {
                                        i = cch0.transferMainConfirmButton;
                                        YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
                                        if (ybButtonView != null) {
                                            i = cch0.transferMainErrorView;
                                            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                                            if (errorView != null) {
                                                i = cch0.transferMainFee;
                                                TextView textView5 = (TextView) cma1.O(i, inflate);
                                                if (textView5 != null) {
                                                    i = cch0.transferMainInfo;
                                                    TextView textView6 = (TextView) cma1.O(i, inflate);
                                                    if (textView6 != null) {
                                                        i = cch0.transferMainKeyboard;
                                                        NumberKeyboardView numberKeyboardView = (NumberKeyboardView) cma1.O(i, inflate);
                                                        if (numberKeyboardView != null) {
                                                            i = cch0.transferMainPager;
                                                            ViewPager2 viewPager2 = (ViewPager2) cma1.O(i, inflate);
                                                            if (viewPager2 != null) {
                                                                i = cch0.transferMainPagerIndicators;
                                                                PageIndicatorView pageIndicatorView = (PageIndicatorView) cma1.O(i, inflate);
                                                                if (pageIndicatorView != null && (O2 = cma1.O((i = cch0.transferMainScenarioSkeleton), inflate)) != null) {
                                                                    n961 n961Var = new n961((ShimmerFrameLayout) O2, 1);
                                                                    int i2 = cch0.transferMainSkeletonDesignV2;
                                                                    TransferMainSkeletonView transferMainSkeletonView = (TransferMainSkeletonView) cma1.O(i2, inflate);
                                                                    if (transferMainSkeletonView != null) {
                                                                        i2 = cch0.transferMainSuggests;
                                                                        SuggestsGroupView suggestsGroupView = (SuggestsGroupView) cma1.O(i2, inflate);
                                                                        if (suggestsGroupView != null) {
                                                                            i2 = cch0.transferMainToolbar;
                                                                            TransferToolbarView transferToolbarView = (TransferToolbarView) cma1.O(i2, inflate);
                                                                            if (transferToolbarView != null) {
                                                                                return new t961((ConstraintLayout) inflate, group, textView, O, textView2, textView3, textView4, moneyInputEditView, cashbackView, appCompatEditText, ybButtonView, errorView, textView5, textView6, numberKeyboardView, viewPager2, pageIndicatorView, n961Var, transferMainSkeletonView, suggestsGroupView, transferToolbarView);
                                                                            }
                                                                        }
                                                                    }
                                                                    i = i2;
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

    public final ConstraintLayout o() {
        return this.a;
    }
}
