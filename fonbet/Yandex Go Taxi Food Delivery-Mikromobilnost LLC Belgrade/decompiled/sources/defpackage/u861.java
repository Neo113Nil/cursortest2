package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ybsdk.feature.split.deposit.internal.ui.StatusScreenView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes3.dex */
public final class u861 implements zo31 {
    public final LinearLayout a;
    public final FrameLayout b;
    public final ErrorView c;
    public final StatusScreenView d;
    public final ToolbarView e;

    public u861(LinearLayout linearLayout, FrameLayout frameLayout, ErrorView errorView, StatusScreenView statusScreenView, ToolbarView toolbarView) {
        this.a = linearLayout;
        this.b = frameLayout;
        this.c = errorView;
        this.d = statusScreenView;
        this.e = toolbarView;
    }

    public static u861 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(goh0.ybsdk_split_deposit_payment_status_screen, viewGroup, false);
        int i = vbh0.challengeWebViewContainer;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout != null) {
            i = vbh0.errorView;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null) {
                i = vbh0.paymentProgressView;
                StatusScreenView statusScreenView = (StatusScreenView) cma1.O(i, inflate);
                if (statusScreenView != null) {
                    i = vbh0.splitDepositPaymentStatusToolbar;
                    ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                    if (toolbarView != null) {
                        return new u861((LinearLayout) inflate, frameLayout, errorView, statusScreenView, toolbarView);
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
