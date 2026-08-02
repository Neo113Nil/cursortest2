package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.SelectedItemFormView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class r161 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonView b;
    public final ErrorView c;
    public final LoadableInput d;
    public final SelectedItemFormView e;
    public final wz51 f;
    public final ToolbarView g;
    public final ShimmerFrameLayout h;

    public r161(ConstraintLayout constraintLayout, YbButtonView ybButtonView, ErrorView errorView, LoadableInput loadableInput, SelectedItemFormView selectedItemFormView, wz51 wz51Var, ToolbarView toolbarView, ShimmerFrameLayout shimmerFrameLayout) {
        this.a = constraintLayout;
        this.b = ybButtonView;
        this.c = errorView;
        this.d = loadableInput;
        this.e = selectedItemFormView;
        this.f = wz51Var;
        this.g = toolbarView;
        this.h = shimmerFrameLayout;
    }

    public static r161 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(noh0.ybsdk_internet_payment_form_input, viewGroup, false);
        int i = cch0.internetPaymentsFormButton;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
        if (ybButtonView != null) {
            i = cch0.internetPaymentsFormErrorView;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null) {
                i = cch0.internetPaymentsFormInput;
                LoadableInput loadableInput = (LoadableInput) cma1.O(i, inflate);
                if (loadableInput != null) {
                    i = cch0.internetPaymentsFormItem;
                    SelectedItemFormView selectedItemFormView = (SelectedItemFormView) cma1.O(i, inflate);
                    if (selectedItemFormView != null && (O = cma1.O((i = cch0.internetPaymentsFormSkeleton), inflate)) != null) {
                        int i2 = cch0.internetPaymentFormSkeleton;
                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                            i2 = cch0.internetPaymentInputButton;
                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                i2 = cch0.internetPaymentInputSkeleton;
                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                    wz51 wz51Var = new wz51((ShimmerFrameLayout) O, 7);
                                    i = cch0.internetPaymentsFormToolbar;
                                    ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                    if (toolbarView != null) {
                                        i = cch0.internetPaymentsFormToolbarSkeleton;
                                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i, inflate);
                                        if (shimmerFrameLayout != null) {
                                            return new r161((ConstraintLayout) inflate, ybButtonView, errorView, loadableInput, selectedItemFormView, wz51Var, toolbarView, shimmerFrameLayout);
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
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
