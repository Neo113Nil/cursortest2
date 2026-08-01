package com.google.android.material.bottomsheet;

import B0.o;
import B0.q;
import android.app.Dialog;
import android.content.Context;
import android.util.TypedValue;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.lumenpath.harispro.hrnavigator.R;

/* loaded from: classes.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public BottomSheetDialogFragment() {
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void M() {
        Dialog dialog = this.f1974h0;
        if (dialog instanceof q) {
            boolean z2 = ((q) dialog).j().f2374I;
        }
        N(false, false);
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog O() {
        Context h2 = h();
        int i = this.f1968b0;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = h2.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        q qVar = new q(h2, i);
        qVar.j = true;
        qVar.f70k = true;
        qVar.f75p = new o(qVar);
        qVar.f().f(1);
        qVar.f73n = qVar.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
        return qVar;
    }

    public BottomSheetDialogFragment(int i) {
        super(i);
    }
}
