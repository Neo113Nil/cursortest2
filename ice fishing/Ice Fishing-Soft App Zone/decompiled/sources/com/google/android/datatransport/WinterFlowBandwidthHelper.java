package com.google.android.datatransport;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowBandwidthHelper extends DialogFragment {
    public DialogInterface.OnCancelListener WinterFlowTransactionManagerStrategy;
    public AlertDialog WinterFlowUnitTestResponse;
    public Dialog WinterFlowVariableVersionControl;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.WinterFlowTransactionManagerStrategy;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.WinterFlowVariableVersionControl;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        AlertDialog alertDialog = this.WinterFlowUnitTestResponse;
        if (alertDialog != null) {
            return alertDialog;
        }
        Activity activity = getActivity();
        WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(activity);
        AlertDialog create = new AlertDialog.Builder(activity).create();
        this.WinterFlowUnitTestResponse = create;
        return create;
    }
}
