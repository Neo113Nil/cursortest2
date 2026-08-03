package m6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import p6.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: g, reason: collision with root package name */
    public Dialog f4906g;

    /* renamed from: h, reason: collision with root package name */
    public DialogInterface.OnCancelListener f4907h;

    /* renamed from: i, reason: collision with root package name */
    public AlertDialog f4908i;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f4907h;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f4906g;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f4908i == null) {
            Activity activity = getActivity();
            u.g(activity);
            this.f4908i = new AlertDialog.Builder(activity).create();
        }
        return this.f4908i;
    }
}
