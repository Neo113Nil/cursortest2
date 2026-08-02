package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.i;

/* loaded from: classes.dex */
public class isr extends i {
    public Dialog g;
    public DialogInterface.OnCancelListener h;
    public AlertDialog i;

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.h;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.g;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.i == null) {
            Context context = getContext();
            y1g.G(context);
            this.i = new AlertDialog.Builder(context).create();
        }
        return this.i;
    }
}
