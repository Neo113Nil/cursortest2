package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.transfer.utils.TransferToolbarView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.widgets.common.ErrorView;

/* loaded from: classes3.dex */
public final class v861 implements zo31 {
    public final ConstraintLayout a;
    public final YbDivView b;
    public final ErrorView c;
    public final DivSkeletonsView d;
    public final TransferToolbarView e;

    public v861(ConstraintLayout constraintLayout, YbDivView ybDivView, ErrorView errorView, DivSkeletonsView divSkeletonsView, TransferToolbarView transferToolbarView) {
        this.a = constraintLayout;
        this.b = ybDivView;
        this.c = errorView;
        this.d = divSkeletonsView;
        this.e = transferToolbarView;
    }

    public static v861 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(goh0.ybsdk_split_deposit_screen, viewGroup, false);
        int i = vbh0.divView;
        YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
        if (ybDivView != null) {
            i = vbh0.errorView;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null) {
                i = vbh0.splitDepositSkeleton;
                DivSkeletonsView divSkeletonsView = (DivSkeletonsView) cma1.O(i, inflate);
                if (divSkeletonsView != null) {
                    i = vbh0.splitDepositToolbar;
                    TransferToolbarView transferToolbarView = (TransferToolbarView) cma1.O(i, inflate);
                    if (transferToolbarView != null) {
                        return new v861((ConstraintLayout) inflate, ybDivView, errorView, divSkeletonsView, transferToolbarView);
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
