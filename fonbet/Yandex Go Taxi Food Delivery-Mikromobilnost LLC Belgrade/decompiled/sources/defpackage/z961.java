package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.transfer.utils.TransferToolbarView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class z961 implements zo31 {
    public final ConstraintLayout a;
    public final ErrorView b;
    public final n961 c;
    public final TextView d;
    public final TextView e;
    public final AppCompatImageView f;
    public final YbButtonView g;
    public final OperationProgressView h;
    public final TextView i;
    public final TransferToolbarView j;

    public z961(ConstraintLayout constraintLayout, ErrorView errorView, n961 n961Var, TextView textView, TextView textView2, AppCompatImageView appCompatImageView, YbButtonView ybButtonView, OperationProgressView operationProgressView, TextView textView3, TransferToolbarView transferToolbarView) {
        this.a = constraintLayout;
        this.b = errorView;
        this.c = n961Var;
        this.d = textView;
        this.e = textView2;
        this.f = appCompatImageView;
        this.g = ybButtonView;
        this.h = operationProgressView;
        this.i = textView3;
        this.j = transferToolbarView;
    }

    public static z961 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(noh0.ybsdk_transfer_me2me_confirm_pull, viewGroup, false);
        int i = cch0.errorView;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null && (O = cma1.O((i = cch0.transferConfirmPullSkeleton), inflate)) != null) {
            int i2 = cch0.descriptionSkeleton;
            if (((SkeletonView) cma1.O(i2, O)) != null) {
                i2 = cch0.titleSkeleton;
                if (((SkeletonView) cma1.O(i2, O)) != null) {
                    i2 = cch0.toolbarSkeleton;
                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                        n961 n961Var = new n961((ShimmerFrameLayout) O, 0);
                        i = cch0.transferMe2MeConfirmPullAgreementTextView;
                        TextView textView = (TextView) cma1.O(i, inflate);
                        if (textView != null) {
                            i = cch0.transferMe2MeConfirmPullDescription;
                            TextView textView2 = (TextView) cma1.O(i, inflate);
                            if (textView2 != null) {
                                i = cch0.transferMe2MeConfirmPullIcon;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                                if (appCompatImageView != null) {
                                    i = cch0.transferMe2MeConfirmPullPrimaryButton;
                                    YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
                                    if (ybButtonView != null) {
                                        i = cch0.transferMe2MeConfirmPullProgressBar;
                                        OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i, inflate);
                                        if (operationProgressView != null) {
                                            i = cch0.transferMe2MeConfirmPullTitle;
                                            TextView textView3 = (TextView) cma1.O(i, inflate);
                                            if (textView3 != null) {
                                                i = cch0.transferMe2MeConfirmPullToolbar;
                                                TransferToolbarView transferToolbarView = (TransferToolbarView) cma1.O(i, inflate);
                                                if (transferToolbarView != null) {
                                                    return new z961((ConstraintLayout) inflate, errorView, n961Var, textView, textView2, appCompatImageView, ybButtonView, operationProgressView, textView3, transferToolbarView);
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
}
