package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes4.dex */
public class SupportErrorDialogFragment extends DialogFragment {
    public Dialog zaa;
    public DialogInterface.OnCancelListener zab;
    public AlertDialog zac;

    public static SupportErrorDialogFragment newInstance(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        com.google.android.gms.common.internal.zzae.checkNotNull(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        supportErrorDialogFragment.zaa = dialog;
        if (onCancelListener != null) {
            supportErrorDialogFragment.zab = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.zab;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.zaa;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.zac == null) {
            Context context = getContext();
            com.google.android.gms.common.internal.zzae.checkNotNull(context);
            this.zac = new AlertDialog.Builder(context).create();
        }
        return this.zac;
    }
}
