package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes3.dex */
public class af3 extends hr0 {
    private boolean waitingForDismissAllowingStateLoss;

    public static void access$100(af3 af3Var) {
        if (af3Var.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.i
    public void dismiss() {
        if (y(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.i
    public void dismissAllowingStateLoss() {
        if (y(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // defpackage.hr0, androidx.fragment.app.i
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        return new ze3(getContext(), getTheme());
    }

    public final boolean y(boolean z) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof ze3)) {
            return false;
        }
        ze3 ze3Var = (ze3) dialog;
        if (ze3Var.f == null) {
            ze3Var.e();
        }
        BottomSheetBehavior bottomSheetBehavior = ze3Var.f;
        if (!bottomSheetBehavior.isHideable() || !ze3Var.j) {
            return false;
        }
        this.waitingForDismissAllowingStateLoss = z;
        if (bottomSheetBehavior.getState() == 5) {
            if (this.waitingForDismissAllowingStateLoss) {
                super.dismissAllowingStateLoss();
                return true;
            }
            super.dismiss();
            return true;
        }
        if (getDialog() instanceof ze3) {
            ze3 ze3Var2 = (ze3) getDialog();
            ze3Var2.f.removeBottomSheetCallback(ze3Var2.q);
        }
        bottomSheetBehavior.addBottomSheetCallback(new xe3(1, this));
        bottomSheetBehavior.setState(5);
        return true;
    }
}
