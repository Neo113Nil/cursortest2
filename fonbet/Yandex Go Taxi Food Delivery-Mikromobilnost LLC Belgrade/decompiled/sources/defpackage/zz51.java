package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class zz51 implements zo31 {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final wz51 e;
    public final OperationProgressView f;
    public final YbButtonView g;
    public final OperationProgressView h;
    public final YbButtonView i;
    public final ToolbarView j;
    public final ImageView k;

    public zz51(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, wz51 wz51Var, OperationProgressView operationProgressView, YbButtonView ybButtonView, OperationProgressView operationProgressView2, YbButtonView ybButtonView2, ToolbarView toolbarView, ImageView imageView) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = wz51Var;
        this.f = operationProgressView;
        this.g = ybButtonView;
        this.h = operationProgressView2;
        this.i = ybButtonView2;
        this.j = toolbarView;
        this.k = imageView;
    }

    public static zz51 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(xmh0.ybsdk_auto_topup_result, viewGroup, false);
        int i = pah0.autoTopupSuccessAmount;
        TextView textView = (TextView) cma1.O(i, inflate);
        if (textView != null) {
            i = pah0.autoTopupSuccessBlock;
            if (((Barrier) cma1.O(i, inflate)) != null) {
                i = pah0.autoTopupSuccessDescription;
                TextView textView2 = (TextView) cma1.O(i, inflate);
                if (textView2 != null) {
                    i = pah0.autoTopupSuccessTitle;
                    TextView textView3 = (TextView) cma1.O(i, inflate);
                    if (textView3 != null && (O = cma1.O((i = pah0.autotopupResultSeketons), inflate)) != null) {
                        int i2 = pah0.avatar;
                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                            i2 = pah0.title;
                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                i2 = pah0.ybsdk_skeletonview;
                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                    i2 = pah0.ybsdk_skeletonview2;
                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                        wz51 wz51Var = new wz51((ShimmerFrameLayout) O, 1);
                                        i = pah0.operationIcon;
                                        OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i, inflate);
                                        if (operationProgressView != null) {
                                            i = pah0.primaryButton;
                                            YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
                                            if (ybButtonView != null) {
                                                i = pah0.progressBar;
                                                OperationProgressView operationProgressView2 = (OperationProgressView) cma1.O(i, inflate);
                                                if (operationProgressView2 != null) {
                                                    i = pah0.secondaryButton;
                                                    YbButtonView ybButtonView2 = (YbButtonView) cma1.O(i, inflate);
                                                    if (ybButtonView2 != null) {
                                                        i = pah0.toolbar;
                                                        ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                                        if (toolbarView != null) {
                                                            i = pah0.ybIcon;
                                                            ImageView imageView = (ImageView) cma1.O(i, inflate);
                                                            if (imageView != null) {
                                                                return new zz51((ConstraintLayout) inflate, textView, textView2, textView3, wz51Var, operationProgressView, ybButtonView, operationProgressView2, ybButtonView2, toolbarView, imageView);
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
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
