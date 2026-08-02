package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.i;

/* loaded from: classes.dex */
public class hr0 extends i {
    @Override // androidx.fragment.app.i
    public Dialog onCreateDialog(Bundle bundle) {
        return new gr0(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.i
    public void setupDialog(@NonNull Dialog dialog, int i) {
        if (!(dialog instanceof gr0)) {
            super.setupDialog(dialog, i);
            return;
        }
        gr0 gr0Var = (gr0) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        gr0Var.c().j(1);
    }
}
