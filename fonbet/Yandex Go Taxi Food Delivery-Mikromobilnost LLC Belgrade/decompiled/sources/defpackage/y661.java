package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;

/* loaded from: classes3.dex */
public final class y661 implements zo31 {
    public final FrameLayout a;
    public final BottomSheetDialogView b;

    public y661(FrameLayout frameLayout, BottomSheetDialogView bottomSheetDialogView) {
        this.a = frameLayout;
        this.b = bottomSheetDialogView;
    }

    public static y661 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(noh0.ybsdk_screen_fund_docs_notice, viewGroup, false);
        int i = cch0.fundDocsNoticeBottomSheet;
        BottomSheetDialogView bottomSheetDialogView = (BottomSheetDialogView) cma1.O(i, inflate);
        if (bottomSheetDialogView != null) {
            return new y661((FrameLayout) inflate, bottomSheetDialogView);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
