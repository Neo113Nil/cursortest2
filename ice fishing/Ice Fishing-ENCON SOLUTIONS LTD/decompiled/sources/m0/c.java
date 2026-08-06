package m0;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import p0.AbstractC1021r;

/* loaded from: classes.dex */
public final class c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public AlertDialog f8166a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f8167b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f8168c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f8167b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f8166a;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f8168c == null) {
            Activity activity = getActivity();
            AbstractC1021r.c(activity);
            this.f8168c = new AlertDialog.Builder(activity).create();
        }
        return this.f8168c;
    }
}
