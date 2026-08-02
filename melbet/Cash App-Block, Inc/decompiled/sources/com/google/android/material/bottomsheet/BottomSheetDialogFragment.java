package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;

/* loaded from: classes4.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    private boolean waitingForDismissAllowingStateLoss;

    public static void access$100(BottomSheetDialogFragment bottomSheetDialogFragment) {
        if (bottomSheetDialogFragment.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        Dialog dialog = getDialog();
        if (dialog instanceof BottomSheetDialog) {
            BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
            if (bottomSheetDialog.behavior == null) {
                bottomSheetDialog.ensureContainerAndBehavior();
            }
            boolean z = bottomSheetDialog.behavior.hideable;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        Dialog dialog = getDialog();
        if (dialog instanceof BottomSheetDialog) {
            BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
            if (bottomSheetDialog.behavior == null) {
                bottomSheetDialog.ensureContainerAndBehavior();
            }
            boolean z = bottomSheetDialog.behavior.hideable;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new BottomSheetDialog(getContext(), getTheme());
    }
}
