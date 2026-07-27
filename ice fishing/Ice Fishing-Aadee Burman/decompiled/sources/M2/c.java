package M2;

import P2.w;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: n, reason: collision with root package name */
    public AlertDialog f1834n;

    /* renamed from: u, reason: collision with root package name */
    public DialogInterface.OnCancelListener f1835u;

    /* renamed from: v, reason: collision with root package name */
    public AlertDialog f1836v;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f1835u;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f1834n;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f1836v == null) {
            Activity activity = getActivity();
            w.h(activity);
            this.f1836v = new AlertDialog.Builder(activity).create();
        }
        return this.f1836v;
    }
}
