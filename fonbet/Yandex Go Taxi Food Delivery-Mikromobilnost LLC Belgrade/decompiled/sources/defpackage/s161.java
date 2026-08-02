package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class s161 implements zo31 {
    public final ConstraintLayout a;
    public final ErrorView b;
    public final LoadableInput c;
    public final RecyclerView d;
    public final ToolbarView e;
    public final ShimmerFrameLayout f;

    public s161(ConstraintLayout constraintLayout, ErrorView errorView, LoadableInput loadableInput, RecyclerView recyclerView, ToolbarView toolbarView, ShimmerFrameLayout shimmerFrameLayout) {
        this.a = constraintLayout;
        this.b = errorView;
        this.c = loadableInput;
        this.d = recyclerView;
        this.e = toolbarView;
        this.f = shimmerFrameLayout;
    }

    public static s161 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(noh0.ybsdk_internet_providers_list, viewGroup, false);
        int i = cch0.internetPaymentsErrorView;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null) {
            i = cch0.internetPaymentsInput;
            LoadableInput loadableInput = (LoadableInput) cma1.O(i, inflate);
            if (loadableInput != null) {
                i = cch0.internetPaymentsRecycler;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null) {
                    i = cch0.internetPaymentsToolbar;
                    ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                    if (toolbarView != null) {
                        i = cch0.internetPaymentsToolbarSkeleton;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i, inflate);
                        if (shimmerFrameLayout != null) {
                            return new s161((ConstraintLayout) inflate, errorView, loadableInput, recyclerView, toolbarView, shimmerFrameLayout);
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
}
