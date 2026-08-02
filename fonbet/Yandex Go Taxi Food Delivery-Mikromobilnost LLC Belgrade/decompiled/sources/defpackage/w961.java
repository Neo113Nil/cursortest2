package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.transfer.utils.CashbackView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonViewGroup;

/* loaded from: classes3.dex */
public final class w961 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonViewGroup b;
    public final RecyclerView c;
    public final ToolbarView d;
    public final CashbackView e;
    public final TextView f;
    public final TextView g;
    public final YbDivView h;
    public final AppCompatImageView i;
    public final OperationProgressView j;
    public final RecyclerView k;
    public final TextView l;
    public final FrameLayout m;

    public w961(ConstraintLayout constraintLayout, YbButtonViewGroup ybButtonViewGroup, RecyclerView recyclerView, ToolbarView toolbarView, CashbackView cashbackView, TextView textView, TextView textView2, YbDivView ybDivView, AppCompatImageView appCompatImageView, OperationProgressView operationProgressView, RecyclerView recyclerView2, TextView textView3, FrameLayout frameLayout) {
        this.a = constraintLayout;
        this.b = ybButtonViewGroup;
        this.c = recyclerView;
        this.d = toolbarView;
        this.e = cashbackView;
        this.f = textView;
        this.g = textView2;
        this.h = ybDivView;
        this.i = appCompatImageView;
        this.j = operationProgressView;
        this.k = recyclerView2;
        this.l = textView3;
        this.m = frameLayout;
    }

    public static w961 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(noh0.ybsdk_transfer_main_result, viewGroup, false);
        int i = cch0.buttonGroup;
        YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i, inflate);
        if (ybButtonViewGroup != null) {
            i = cch0.recyclerView;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                i = cch0.toolbar;
                ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                if (toolbarView != null) {
                    i = cch0.transferMainResultAboveCommentBarrier;
                    if (((Barrier) cma1.O(i, inflate)) != null) {
                        i = cch0.transferMainResultCashback;
                        CashbackView cashbackView = (CashbackView) cma1.O(i, inflate);
                        if (cashbackView != null) {
                            i = cch0.transferMainResultComment;
                            TextView textView = (TextView) cma1.O(i, inflate);
                            if (textView != null) {
                                i = cch0.transferMainResultDescription;
                                TextView textView2 = (TextView) cma1.O(i, inflate);
                                if (textView2 != null) {
                                    i = cch0.transferMainResultDivkitUnderAmount;
                                    YbDivView ybDivView = (YbDivView) cma1.O(i, inflate);
                                    if (ybDivView != null) {
                                        i = cch0.transferMainResultIcon;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                                        if (appCompatImageView != null) {
                                            i = cch0.transferMainResultProgressBar;
                                            OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i, inflate);
                                            if (operationProgressView != null) {
                                                i = cch0.transferMainResultQuickActions;
                                                RecyclerView recyclerView2 = (RecyclerView) cma1.O(i, inflate);
                                                if (recyclerView2 != null) {
                                                    i = cch0.transferMainResultTitle;
                                                    TextView textView3 = (TextView) cma1.O(i, inflate);
                                                    if (textView3 != null) {
                                                        i = cch0.web3dsViewContainer;
                                                        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                                                        if (frameLayout != null) {
                                                            return new w961((ConstraintLayout) inflate, ybButtonViewGroup, recyclerView, toolbarView, cashbackView, textView, textView2, ybDivView, appCompatImageView, operationProgressView, recyclerView2, textView3, frameLayout);
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
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
