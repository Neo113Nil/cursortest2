package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.transfer.utils.TransferToolbarView;
import com.ybsdk.core.transfer.utils.UnconditionalWidget;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.StadiumButtonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class y961 implements zo31 {
    public final ConstraintLayout a;
    public final n961 b;
    public final View c;
    public final TextView d;
    public final TextView e;
    public final ErrorView f;
    public final StadiumButtonView g;
    public final TransferToolbarView h;
    public final UnconditionalWidget i;

    public y961(ConstraintLayout constraintLayout, n961 n961Var, View view, TextView textView, TextView textView2, ErrorView errorView, StadiumButtonView stadiumButtonView, TransferToolbarView transferToolbarView, UnconditionalWidget unconditionalWidget) {
        this.a = constraintLayout;
        this.b = n961Var;
        this.c = view;
        this.d = textView;
        this.e = textView2;
        this.f = errorView;
        this.g = stadiumButtonView;
        this.h = transferToolbarView;
        this.i = unconditionalWidget;
    }

    public static y961 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(noh0.ybsdk_transfer_me2me_confirm, viewGroup, false);
        int i = cch0.loadingState;
        View O = cma1.O(i, inflate);
        if (O != null) {
            int i2 = cch0.partOne;
            if (((SkeletonView) cma1.O(i2, O)) != null) {
                i2 = cch0.partTwo;
                if (((SkeletonView) cma1.O(i2, O)) != null) {
                    i2 = cch0.toolbarPart;
                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                        n961 n961Var = new n961((ShimmerFrameLayout) O, 2);
                        i = cch0.transferMe2MeConfirmTooltipAnchor;
                        View O2 = cma1.O(i, inflate);
                        if (O2 != null) {
                            i = cch0.transferMe2meConfirmAmount;
                            TextView textView = (TextView) cma1.O(i, inflate);
                            if (textView != null) {
                                i = cch0.transferMe2meConfirmComment;
                                TextView textView2 = (TextView) cma1.O(i, inflate);
                                if (textView2 != null) {
                                    i = cch0.transferMe2meConfirmErrorView;
                                    ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                                    if (errorView != null) {
                                        i = cch0.transferMe2meConfirmStadiumButton;
                                        StadiumButtonView stadiumButtonView = (StadiumButtonView) cma1.O(i, inflate);
                                        if (stadiumButtonView != null) {
                                            i = cch0.transferMe2meConfirmToolbar;
                                            TransferToolbarView transferToolbarView = (TransferToolbarView) cma1.O(i, inflate);
                                            if (transferToolbarView != null) {
                                                i = cch0.transferMe2meConfirmWidgetView;
                                                UnconditionalWidget unconditionalWidget = (UnconditionalWidget) cma1.O(i, inflate);
                                                if (unconditionalWidget != null) {
                                                    return new y961((ConstraintLayout) inflate, n961Var, O2, textView, textView2, errorView, stadiumButtonView, transferToolbarView, unconditionalWidget);
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
