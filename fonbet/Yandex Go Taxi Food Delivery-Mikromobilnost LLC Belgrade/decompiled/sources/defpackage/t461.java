package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.ImageToolbarView;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.MessageAnimatedView;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.OperationStatusView;
import com.ybsdk.widgets.common.BlendingGradientView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.MoneyInputEditView;
import com.ybsdk.widgets.common.OperationProgressOverlayDialog;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class t461 implements zo31 {
    public final ConstraintLayout a;
    public final NestedScrollView b;
    public final MoneyInputEditView c;
    public final YbButtonView d;
    public final TextView e;
    public final YbDivView f;
    public final YbDivView g;
    public final ErrorView h;
    public final NumberKeyboardView i;
    public final OperationStatusView j;
    public final MessageAnimatedView k;
    public final OperationProgressOverlayDialog l;
    public final TextView m;
    public final ho4 n;
    public final View o;
    public final ImageToolbarView p;
    public final View q;
    public final BlendingGradientView r;
    public final View s;
    public final ShimmerFrameLayout t;
    public final TextView u;
    public final TextView v;
    public final RecyclerView w;

    public t461(ConstraintLayout constraintLayout, NestedScrollView nestedScrollView, MoneyInputEditView moneyInputEditView, YbButtonView ybButtonView, TextView textView, YbDivView ybDivView, YbDivView ybDivView2, ErrorView errorView, NumberKeyboardView numberKeyboardView, OperationStatusView operationStatusView, MessageAnimatedView messageAnimatedView, OperationProgressOverlayDialog operationProgressOverlayDialog, TextView textView2, ho4 ho4Var, View view, ImageToolbarView imageToolbarView, View view2, BlendingGradientView blendingGradientView, View view3, ShimmerFrameLayout shimmerFrameLayout, TextView textView3, TextView textView4, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = nestedScrollView;
        this.c = moneyInputEditView;
        this.d = ybButtonView;
        this.e = textView;
        this.f = ybDivView;
        this.g = ybDivView2;
        this.h = errorView;
        this.i = numberKeyboardView;
        this.j = operationStatusView;
        this.k = messageAnimatedView;
        this.l = operationProgressOverlayDialog;
        this.m = textView2;
        this.n = ho4Var;
        this.o = view;
        this.p = imageToolbarView;
        this.q = view2;
        this.r = blendingGradientView;
        this.s = view3;
        this.t = shimmerFrameLayout;
        this.u = textView3;
        this.v = textView4;
        this.w = recyclerView;
    }

    public static t461 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        t461 t461Var;
        View O;
        View O2;
        View O3;
        View inflate = layoutInflater.inflate(znh0.ybsdk_qr_payments_main, viewGroup, false);
        int i = pbh0.nestedScrollView;
        NestedScrollView nestedScrollView = (NestedScrollView) cma1.O(i, inflate);
        if (nestedScrollView != null) {
            i = pbh0.qrPaymentsMainAmount;
            MoneyInputEditView moneyInputEditView = (MoneyInputEditView) cma1.O(i, inflate);
            if (moneyInputEditView != null) {
                i = pbh0.qrPaymentsMainButton;
                YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
                if (ybButtonView != null) {
                    i = pbh0.qrPaymentsMainCurrency;
                    TextView textView = (TextView) cma1.O(i, inflate);
                    if (textView != null) {
                        i = pbh0.qrPaymentsMainDivAgreements;
                        YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
                        if (ybDivView != null) {
                            i = pbh0.qrPaymentsMainDivWidget;
                            YbDivView ybDivView2 = (YbDivView) cma1.O(i, inflate);
                            if (ybDivView2 != null) {
                                i = pbh0.qrPaymentsMainErrorView;
                                ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                                if (errorView != null) {
                                    i = pbh0.qrPaymentsMainKeyboard;
                                    NumberKeyboardView numberKeyboardView = (NumberKeyboardView) cma1.O(i, inflate);
                                    if (numberKeyboardView != null) {
                                        i = pbh0.qrPaymentsMainMerchantIcon;
                                        OperationStatusView operationStatusView = (OperationStatusView) cma1.O(i, inflate);
                                        if (operationStatusView != null) {
                                            i = pbh0.qrPaymentsMainMessage;
                                            MessageAnimatedView messageAnimatedView = (MessageAnimatedView) cma1.O(i, inflate);
                                            if (messageAnimatedView != null) {
                                                i = pbh0.qrPaymentsMainOverlayDialog;
                                                OperationProgressOverlayDialog operationProgressOverlayDialog = (OperationProgressOverlayDialog) cma1.O(i, inflate);
                                                if (operationProgressOverlayDialog != null) {
                                                    i = pbh0.qrPaymentsMainPurpose;
                                                    TextView textView2 = (TextView) cma1.O(i, inflate);
                                                    if (textView2 != null && (O = cma1.O((i = pbh0.qrPaymentsMainSkeletons), inflate)) != null) {
                                                        int i2 = pbh0.agreementsSkeleton;
                                                        t461Var = null;
                                                        DivSkeletonsView divSkeletonsView = (DivSkeletonsView) cma1.O(i2, O);
                                                        if (divSkeletonsView != null) {
                                                            i2 = pbh0.amountSkeleton;
                                                            if (((AppCompatTextView) cma1.O(i2, O)) != null) {
                                                                int i3 = pbh0.merchantIconSkeletonContainer;
                                                                FrameLayout frameLayout = (FrameLayout) cma1.O(i3, O);
                                                                if (frameLayout != null) {
                                                                    int i4 = pbh0.merchantNameSkeleton;
                                                                    if (((SkeletonView) cma1.O(i4, O)) != null) {
                                                                        i4 = pbh0.subtitleSpace;
                                                                        if (((Space) cma1.O(i4, O)) != null) {
                                                                            i4 = pbh0.toolbarSkeleton;
                                                                            if (((SkeletonView) cma1.O(i4, O)) != null) {
                                                                                i4 = pbh0.toolbarSkeletonContainer;
                                                                                if (((FrameLayout) cma1.O(i4, O)) != null) {
                                                                                    i4 = pbh0.ybButtonSkeleton;
                                                                                    if (((SkeletonView) cma1.O(i4, O)) != null) {
                                                                                        ho4 ho4Var = new ho4((ShimmerFrameLayout) O, divSkeletonsView, frameLayout, 26);
                                                                                        i = pbh0.qrPaymentsMainTapBlockOverlay;
                                                                                        View O4 = cma1.O(i, inflate);
                                                                                        if (O4 != null) {
                                                                                            i = pbh0.qrPaymentsMainToolbar;
                                                                                            ImageToolbarView imageToolbarView = (ImageToolbarView) cma1.O(i, inflate);
                                                                                            if (imageToolbarView != null && (O2 = cma1.O((i = pbh0.qrPaymentsMainTooltipAnchor), inflate)) != null) {
                                                                                                i = pbh0.qrPaymentsMerchantGradient;
                                                                                                BlendingGradientView blendingGradientView = (BlendingGradientView) cma1.O(i, inflate);
                                                                                                if (blendingGradientView != null && (O3 = cma1.O((i = pbh0.qrPaymentsMerchantGradientOverlap), inflate)) != null) {
                                                                                                    i = pbh0.qrPaymentsMerchantIconShimmer;
                                                                                                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i, inflate);
                                                                                                    if (shimmerFrameLayout != null) {
                                                                                                        i = pbh0.qrPaymentsMerchantIconSkeleton;
                                                                                                        if (((SkeletonView) cma1.O(i, inflate)) != null) {
                                                                                                            i = pbh0.qrPaymentsResultInfoDescription;
                                                                                                            TextView textView3 = (TextView) cma1.O(i, inflate);
                                                                                                            if (textView3 != null) {
                                                                                                                i = pbh0.qrPaymentsResultInfoTitle;
                                                                                                                TextView textView4 = (TextView) cma1.O(i, inflate);
                                                                                                                if (textView4 != null) {
                                                                                                                    i = pbh0.qrPaymentsWidgetsRecyclerView;
                                                                                                                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                                                                                                    if (recyclerView != null) {
                                                                                                                        return new t461((ConstraintLayout) inflate, nestedScrollView, moneyInputEditView, ybButtonView, textView, ybDivView, ybDivView2, errorView, numberKeyboardView, operationStatusView, messageAnimatedView, operationProgressOverlayDialog, textView2, ho4Var, O4, imageToolbarView, O2, blendingGradientView, O3, shimmerFrameLayout, textView3, textView4, recyclerView);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                                                                                        return t461Var;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    i2 = i4;
                                                                } else {
                                                                    i2 = i3;
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
                }
            }
        }
        t461Var = null;
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return t461Var;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final ConstraintLayout o() {
        return this.a;
    }
}
