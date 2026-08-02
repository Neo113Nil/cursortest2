package defpackage;

import android.view.View;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingFragment;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;

/* loaded from: classes3.dex */
public final /* synthetic */ class qyk0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RoundingFragment b;
    public final /* synthetic */ BottomSheetDialogView c;

    public /* synthetic */ qyk0(BottomSheetDialogView bottomSheetDialogView, RoundingFragment roundingFragment) {
        this.a = 0;
        this.c = bottomSheetDialogView;
        this.b = roundingFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        BottomSheetDialogView bottomSheetDialogView = this.c;
        RoundingFragment roundingFragment = this.b;
        switch (i) {
            case 0:
                RoundingFragment.showNoticeBottomSheet$lambda$21$lambda$19(bottomSheetDialogView, roundingFragment, view);
                break;
            case 1:
                RoundingFragment.showNoticeBottomSheet$lambda$21$lambda$20(roundingFragment, bottomSheetDialogView, view);
                break;
            case 2:
                RoundingFragment.showExitConfirmationNotice$lambda$24$lambda$22(roundingFragment, bottomSheetDialogView, view);
                break;
            default:
                RoundingFragment.showExitConfirmationNotice$lambda$24$lambda$23(roundingFragment, bottomSheetDialogView, view);
                break;
        }
    }

    public /* synthetic */ qyk0(RoundingFragment roundingFragment, BottomSheetDialogView bottomSheetDialogView, int i) {
        this.a = i;
        this.b = roundingFragment;
        this.c = bottomSheetDialogView;
    }
}
