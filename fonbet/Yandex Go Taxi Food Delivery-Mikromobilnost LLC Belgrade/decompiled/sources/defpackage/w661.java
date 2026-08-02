package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.OperationProgressView;

/* loaded from: classes3.dex */
public final class w661 implements zo31 {
    public final ConstraintLayout a;
    public final YbDivView b;
    public final ErrorView c;
    public final OperationProgressView d;

    public w661(ConstraintLayout constraintLayout, YbDivView ybDivView, ErrorView errorView, OperationProgressView operationProgressView) {
        this.a = constraintLayout;
        this.b = ybDivView;
        this.c = errorView;
        this.d = operationProgressView;
    }

    public static w661 o(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(loh0.ybsdk_screen_div_transaction_info, (ViewGroup) null, false);
        int i = ach0.divView;
        YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
        if (ybDivView != null) {
            i = ach0.errorView;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null) {
                i = ach0.progress;
                OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i, inflate);
                if (operationProgressView != null) {
                    return new w661((ConstraintLayout) inflate, ybDivView, errorView, operationProgressView);
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
