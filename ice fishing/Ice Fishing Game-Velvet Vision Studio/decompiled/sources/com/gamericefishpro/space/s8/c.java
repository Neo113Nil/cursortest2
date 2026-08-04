package com.gamericefishpro.space.s8;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.gamericefishpro.space.v8.c0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class c extends DialogFragment {
    public Dialog d;
    public DialogInterface.OnCancelListener e;
    public AlertDialog i;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.d;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.i == null) {
            Activity activity = getActivity();
            c0.g(activity);
            this.i = new AlertDialog.Builder(activity).create();
        }
        return this.i;
    }
}
