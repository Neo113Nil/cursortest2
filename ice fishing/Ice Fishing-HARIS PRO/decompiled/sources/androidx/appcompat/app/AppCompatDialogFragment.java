package androidx.appcompat.app;

import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import h.D;

/* loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    public AppCompatDialogFragment() {
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog O() {
        return new D(h(), this.f1968b0);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void Q(Dialog dialog, int i) {
        if (!(dialog instanceof D)) {
            super.Q(dialog, i);
            return;
        }
        D d2 = (D) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        d2.f().f(1);
    }

    public AppCompatDialogFragment(int i) {
        super(i);
    }
}
