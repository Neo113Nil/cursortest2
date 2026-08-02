package O2;

import R2.w;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: n, reason: collision with root package name */
    public AlertDialog f2260n;

    /* renamed from: u, reason: collision with root package name */
    public DialogInterface.OnCancelListener f2261u;

    /* renamed from: v, reason: collision with root package name */
    public AlertDialog f2262v;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2261u;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f2260n;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f2262v == null) {
            Activity activity = getActivity();
            w.h(activity);
            this.f2262v = new AlertDialog.Builder(activity).create();
        }
        return this.f2262v;
    }
}
