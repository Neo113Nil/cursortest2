package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ybsdk.feature.split.deposit.internal.ui.StatusScreenView;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes3.dex */
public final class t861 implements zo31 {
    public final LinearLayout a;
    public final StatusScreenView b;
    public final ToolbarView c;

    public t861(LinearLayout linearLayout, StatusScreenView statusScreenView, ToolbarView toolbarView) {
        this.a = linearLayout;
        this.b = statusScreenView;
        this.c = toolbarView;
    }

    public static t861 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(goh0.ybsdk_split_deposit_auto_topup_status_screen, viewGroup, false);
        int i = vbh0.autoTopupStatusView;
        StatusScreenView statusScreenView = (StatusScreenView) cma1.O(i, inflate);
        if (statusScreenView != null) {
            i = vbh0.splitDepositAutoTopupStatusToolbar;
            ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
            if (toolbarView != null) {
                return new t861((LinearLayout) inflate, statusScreenView, toolbarView);
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
