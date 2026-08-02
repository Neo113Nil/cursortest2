package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes4.dex */
public class ErrorDialogFragment extends DialogFragment {
    public Dialog zaa;
    public DialogInterface.OnCancelListener zab;
    public AlertDialog zac;

    public static ErrorDialogFragment newInstance(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        com.google.android.gms.common.internal.zzae.checkNotNull(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        errorDialogFragment.zaa = dialog;
        if (onCancelListener != null) {
            errorDialogFragment.zab = onCancelListener;
        }
        return errorDialogFragment;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.zab;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.zaa;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.zac == null) {
            Activity activity = getActivity();
            com.google.android.gms.common.internal.zzae.checkNotNull(activity);
            this.zac = new AlertDialog.Builder(activity).create();
        }
        return this.zac;
    }
}
