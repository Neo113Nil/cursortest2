package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.ybsdk.core.transfer.utils.TransferToolbarView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.MoneyInputEditView;
import com.ybsdk.widgets.common.OperationProgressOverlayDialog;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.SuggestsGroupView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class q661 implements zo31 {
    public final ShimmerFrameLayout a;
    public final TextView b;
    public final MoneyInputEditView c;
    public final YbButtonView d;
    public final TextView e;
    public final ShimmerFrameLayout f;
    public final ShimmerFrameLayout g;
    public final ErrorView h;
    public final NumberKeyboardView i;
    public final YbDivView j;
    public final l7n k;
    public final SuggestsGroupView l;
    public final ShimmerFrameLayout m;
    public final TransferToolbarView n;
    public final Group o;
    public final View p;
    public final OperationProgressOverlayDialog q;
    public final FrameLayout r;

    public q661(ShimmerFrameLayout shimmerFrameLayout, TextView textView, MoneyInputEditView moneyInputEditView, YbButtonView ybButtonView, TextView textView2, ShimmerFrameLayout shimmerFrameLayout2, ShimmerFrameLayout shimmerFrameLayout3, ErrorView errorView, NumberKeyboardView numberKeyboardView, YbDivView ybDivView, l7n l7nVar, SuggestsGroupView suggestsGroupView, ShimmerFrameLayout shimmerFrameLayout4, TransferToolbarView transferToolbarView, Group group, View view, OperationProgressOverlayDialog operationProgressOverlayDialog, FrameLayout frameLayout) {
        this.a = shimmerFrameLayout;
        this.b = textView;
        this.c = moneyInputEditView;
        this.d = ybButtonView;
        this.e = textView2;
        this.f = shimmerFrameLayout2;
        this.g = shimmerFrameLayout3;
        this.h = errorView;
        this.i = numberKeyboardView;
        this.j = ybDivView;
        this.k = l7nVar;
        this.l = suggestsGroupView;
        this.m = shimmerFrameLayout4;
        this.n = transferToolbarView;
        this.o = group;
        this.p = view;
        this.q = operationProgressOverlayDialog;
        this.r = frameLayout;
    }

    public static q661 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View O2;
        View inflate = layoutInflater.inflate(dnh0.ybsdk_screen_credit_deposit, viewGroup, false);
        int i = vah0.creditDepositAmountCurrency;
        TextView textView = (TextView) cma1.O(i, inflate);
        if (textView != null) {
            i = vah0.creditDepositAmountInput;
            MoneyInputEditView moneyInputEditView = (MoneyInputEditView) cma1.O(i, inflate);
            if (moneyInputEditView != null) {
                i = vah0.creditDepositButton;
                YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
                if (ybButtonView != null) {
                    i = vah0.creditDepositDescription;
                    TextView textView2 = (TextView) cma1.O(i, inflate);
                    if (textView2 != null) {
                        i = vah0.creditDepositDescriptionShimmerLayout;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i, inflate);
                        if (shimmerFrameLayout != null) {
                            i = vah0.creditDepositDivkitShimmerLayout;
                            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) cma1.O(i, inflate);
                            if (shimmerFrameLayout2 != null) {
                                i = vah0.creditDepositErrorView;
                                ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                                if (errorView != null) {
                                    i = vah0.creditDepositKeyboard;
                                    NumberKeyboardView numberKeyboardView = (NumberKeyboardView) cma1.O(i, inflate);
                                    if (numberKeyboardView != null) {
                                        i = vah0.creditDepositKeyboardDivKitView;
                                        YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
                                        if (ybDivView != null && (O = cma1.O((i = vah0.creditDepositSkeleton), inflate)) != null) {
                                            int i2 = vah0.creditDepositAmountCurrencySkeleton;
                                            if (((TextView) cma1.O(i2, O)) != null) {
                                                i2 = vah0.creditDepositAmountInputSkeleton;
                                                if (((MoneyInputEditView) cma1.O(i2, O)) != null) {
                                                    i2 = vah0.creditDepositButtonSkeleton;
                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                        i2 = vah0.creditDepositDescriptionSkeleton;
                                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                            i2 = vah0.creditDepositKeyboardSkeleton;
                                                            if (((NumberKeyboardView) cma1.O(i2, O)) != null) {
                                                                i2 = vah0.creditDepositToolbarSkeleton;
                                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                    l7n l7nVar = new l7n((ConstraintLayout) O, 8);
                                                                    i = vah0.creditDepositSuggests;
                                                                    SuggestsGroupView suggestsGroupView = (SuggestsGroupView) cma1.O(i, inflate);
                                                                    if (suggestsGroupView != null) {
                                                                        i = vah0.creditDepositSuggestsShimmerLayout;
                                                                        ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) cma1.O(i, inflate);
                                                                        if (shimmerFrameLayout3 != null) {
                                                                            i = vah0.creditDepositToolbar;
                                                                            TransferToolbarView transferToolbarView = (TransferToolbarView) cma1.O(i, inflate);
                                                                            if (transferToolbarView != null) {
                                                                                i = vah0.groupToHideDuringLoading;
                                                                                Group group = (Group) cma1.O(i, inflate);
                                                                                if (group != null && (O2 = cma1.O((i = vah0.tooltipAnchor), inflate)) != null) {
                                                                                    i = vah0.transactionProgressView;
                                                                                    OperationProgressOverlayDialog operationProgressOverlayDialog = (OperationProgressOverlayDialog) cma1.O(i, inflate);
                                                                                    if (operationProgressOverlayDialog != null) {
                                                                                        i = vah0.web3dsViewContainer;
                                                                                        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                                                                                        if (frameLayout != null) {
                                                                                            return new q661((ShimmerFrameLayout) inflate, textView, moneyInputEditView, ybButtonView, textView2, shimmerFrameLayout, shimmerFrameLayout2, errorView, numberKeyboardView, ybDivView, l7nVar, suggestsGroupView, shimmerFrameLayout3, transferToolbarView, group, O2, operationProgressOverlayDialog, frameLayout);
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

    public final ShimmerFrameLayout o() {
        return this.a;
    }
}
