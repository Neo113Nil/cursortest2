package defpackage;

import android.view.View;
import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;

/* loaded from: classes3.dex */
public final /* synthetic */ class z5m0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SavingsAccountFragment b;
    public final /* synthetic */ BottomSheetDialogView c;

    public /* synthetic */ z5m0(SavingsAccountFragment savingsAccountFragment, BottomSheetDialogView bottomSheetDialogView, int i) {
        this.a = i;
        this.b = savingsAccountFragment;
        this.c = bottomSheetDialogView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        BottomSheetDialogView bottomSheetDialogView = this.c;
        SavingsAccountFragment savingsAccountFragment = this.b;
        switch (i) {
            case 0:
                SavingsAccountFragment.showThemeSelector$lambda$29$lambda$27(savingsAccountFragment, bottomSheetDialogView, view);
                break;
            case 1:
                SavingsAccountFragment.showUnlock$lambda$34$lambda$30(savingsAccountFragment, bottomSheetDialogView, view);
                break;
            default:
                SavingsAccountFragment.showUnlock$lambda$34$lambda$32(savingsAccountFragment, bottomSheetDialogView, view);
                break;
        }
    }
}
