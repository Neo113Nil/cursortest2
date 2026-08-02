package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.FullscreenStatusView;

/* loaded from: classes3.dex */
public final class x761 implements zo31 {
    public final ConstraintLayout a;
    public final ErrorView b;
    public final FullscreenStatusView c;

    public x761(ConstraintLayout constraintLayout, ErrorView errorView, FullscreenStatusView fullscreenStatusView) {
        this.a = constraintLayout;
        this.b = errorView;
        this.c = fullscreenStatusView;
    }

    public static x761 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(doh0.ybsdk_screen_savings_account_creation, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i = tbh0.errorView;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null) {
            i = tbh0.statusView;
            FullscreenStatusView fullscreenStatusView = (FullscreenStatusView) cma1.O(i, inflate);
            if (fullscreenStatusView != null) {
                return new x761(constraintLayout, errorView, fullscreenStatusView);
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
